package compiler.code;

import java.util.Arrays;
import java.util.List;

import compiler.intermediate.Label;
import compiler.intermediate.Temporal;
import compiler.intermediate.Value;
import compiler.intermediate.Variable;
import compiler.semantic.type.TypeSimple;

import es.uned.lsi.compiler.code.ExecutionEnvironmentIF;
import es.uned.lsi.compiler.code.MemoryDescriptorIF;
import es.uned.lsi.compiler.code.RegisterDescriptorIF;
import es.uned.lsi.compiler.intermediate.LabelFactory;
import es.uned.lsi.compiler.intermediate.LabelFactoryIF;
import es.uned.lsi.compiler.intermediate.LabelIF;
import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

/**
 * Class for the ENS2001 Execution environment.
 */

public class ExecutionEnvironmentEns2001 
    implements ExecutionEnvironmentIF
{    
    private final static int      MAX_ADDRESS = 65535; 
    private final static String[] REGISTERS   = {
       ".PC", ".SP", ".SR", ".IX", ".IY", ".A", 
       ".R0", ".R1", ".R2", ".R3", ".R4", 
       ".R5", ".R6", ".R7", ".R8", ".R9"
    };
    
    private RegisterDescriptorIF registerDescriptor;
    private MemoryDescriptorIF   memoryDescriptor;
    
    /**
     * Constructor for ENS2001Environment.
     */
    public ExecutionEnvironmentEns2001 ()
    {       
        super ();
    }
    
    /**
     * Returns the size of the type within the architecture.
     * @return the size of the type within the architecture.
     */
    @Override
    public final int getTypeSize (TypeSimple type)
    {      
        return 1;  
    }
    
    /**
     * Returns the registers.
     * @return the registers.
     */
    @Override
    public final List<String> getRegisters ()
    {
        return Arrays.asList (REGISTERS);
    }
    
    /**
     * Returns the memory size.
     * @return the memory size.
     */
    @Override
    public final int getMemorySize ()
    {
        return MAX_ADDRESS;
    }
           
    /**
     * Returns the registerDescriptor.
     * @return Returns the registerDescriptor.
     */
    @Override
    public final RegisterDescriptorIF getRegisterDescriptor ()
    {
        return registerDescriptor;
    }

    /**
     * Returns the memoryDescriptor.
     * @return Returns the memoryDescriptor.
     */
    @Override
    public final MemoryDescriptorIF getMemoryDescriptor ()
    {
        return memoryDescriptor;
    }

    /**
     * Translate a quadruple into a set of final code instructions. 
     * @param cuadruple The quadruple to be translated.
     * @return a quadruple into a set of final code instructions. 
     */
    @Override
    public final String translate (QuadrupleIF quadruple)
    {      
    	String op = quadruple.getOperation();
    	String res = ";" + quadruple.toString() + "\n";
    	
    	LabelFactoryIF lf = new LabelFactory();
		LabelIF l1 = lf.create();
		LabelIF l2 = lf.create();
    	
    	switch(op) {
    	
    		case "SUB" :
    			res += "SUB " + operacion(quadruple.getFirstOperand()) + ", " + operacion(quadruple.getSecondOperand()) + "\n";
    			res += "MOVE .A, " + operacion(quadruple.getResult()) + "\n";
    			break;
    		case "MUL" :
    			res += "MUL " + operacion(quadruple.getFirstOperand()) + ", " + operacion(quadruple.getSecondOperand()) + "\n";
    			res += "MOVE .A, " + operacion(quadruple.getResult()) + "\n";
    			break;
    		case "OR" :
    			res += "OR " + operacion(quadruple.getFirstOperand()) + ", " + operacion(quadruple.getSecondOperand()) + "\n";
    			res += "MOVE .A, " + operacion(quadruple.getResult()) + "\n";
    			break;
    		case "EQ" :
    			res += "CMP " + operacion(quadruple.getFirstOperand()) + ", " + operacion(quadruple.getSecondOperand()) + "\n";
    			res += "BZ /" + l1 + "\n";
    			res += "MOVE #0, " + operacion(quadruple.getResult()) + "\n";
    			res += "BR /" + l2 + "\n";
    			res += l1 + " :  MOVE #1," + operacion(quadruple.getResult()) + "\n";
    			res += l2 + " : NOP \n";
    			break;
    		case "NOT" :
    			res += "NOT " + operacion(quadruple.getFirstOperand()) + "\n";
    			break;
    		case "VAR" :
    			res += "MOVE " + operacion(quadruple.getFirstOperand()) + ", " + operacion(quadruple.getResult()) + "\n";
    			break;
    		case "HALT" :
    			res += "HALT";
    			break;
    		case "WRITESTRING" :
    			res += "WRSTR /" + operacion(quadruple.getFirstOperand()) + " \n";
    			res += "WRCHAR #10 \n";
    			res += "WRCHAR #13 \n";
    			break;
    		case "CADENA" :
    			res += operacion(quadruple.getFirstOperand()) + ": DATA \"" + operacion(quadruple.getResult()) + "\" \n";
    			break;
    		case "WRITEINT" :
    			res += "WRINT" + operacion(quadruple.getResult()) + " \n";
    			res += "WRCHAR #10 \n";
    			res += "WRCHAR #13 \n";
    			break;
    		case "WRITELN" :
    			res += "WRCHAR #10 \n";
    			res += "WRCHAR #13 \n";
    			break;
    		case "MV" : 
    			res += "MOVE " + operacion(quadruple.getFirstOperand()) + ", " + operacion(quadruple.getResult()) + "\n";
    			break;
    		case "MVA" :
    			Variable var1 = (Variable)quadruple.getFirstOperand();
    			res += "MOVE #" + var1.getAddress() + ", " + operacion(quadruple.getResult()) + "\n";
    			break;
    		case "REF" :
    			res += "MOVE " + operacion(quadruple.getResult()) + ", .R1 \n";
    			res += "MOVE [.R1], " +  operacion(quadruple.getResult()) + " \n";
    			break;
    		case "STP" :
    			res += "MOVE " + operacion(quadruple.getResult()) + ", .R1" + "\n";
    			res += "MOVE " + operacion(quadruple.getFirstOperand()) + ", [.R1]" + "\n";
    			break;
    		case "BRF" :
    			if(quadruple.getSecondOperand() != null) {
    				res += "CMP " + operacion(quadruple.getFirstOperand()) + ", " + operacion(quadruple.getSecondOperand()) + "\n";
    				res += "BZ /" + operacion(quadruple.getResult()) + "\n";
    				break;
    			} else {
    				res += "CMP #0, " + operacion(quadruple.getResult()) + "\n";
    				res += "BZ /" + operacion(quadruple.getFirstOperand()) + "\n";
    				break;
    			}
    		case "BR" : 
    			res += "BR /" + quadruple.getResult() + "\n";
    			break;
    		case "INL" :
    			res += quadruple.getResult() + ": NOP \n";
    			break;
    		case "GR" :
    			res += "SUB " + operacion(quadruple.getFirstOperand()) + ", " + operacion(quadruple.getSecondOperand()) + "\n";
    			res += "BZ /" + l1 + "\n";
    			res += "BN /" + l1 + "\n";
    			res += "MOVE #1, " + operacion(quadruple.getResult()) + "\n";
    			res += "BR /" + l2 + "\n";
    			res += l1 + " :  \n";
    			res += "MOVE #0, " + operacion(quadruple.getResult()) + "\n";
    			res += l2 + " :  \n";
    			break;
    		case "INC" :
    			res += "INC " + operacion(quadruple.getResult()) + "\n";
    			break;
    		default :
    			break;
    	}
        return res;
    }
    
    /*
     * Método auxiliar que traduce los elementos de la quadrupla
     */
    private String operacion (OperandIF o) {
    	if(o instanceof Variable) {
    		return "/" + ((Variable)o).getAddress();
    	}
    	
    	if(o instanceof Value){
    		return "#" + ((Value)o).getValue();
    	}
    	
    	if(o instanceof Temporal){
    		return "/" + ((Temporal)o).getAddress();
    	}
    	
    	if(o instanceof Label){
    		return ((Label)o).getName();
    	}
    	
    	return null;
    }
}
