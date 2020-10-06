package compiler.semantic.symbol;

import compiler.syntax.nonTerminal.CabProcedure;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolProcedure.
 */


public class SymbolProcedure
    extends SymbolBase
{
	private CabProcedure cabProcedure;
   
    /**
     * Constructor for SymbolProcedure.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolProcedure (ScopeIF scope, 
                            String name,
                            TypeIF type)
    {
        super (scope, name, type);
    } 
    
    /*
     * Constructor con ScopeIF, String, TypeIF y CabProcedure
     */
    public SymbolProcedure (ScopeIF scope, 
            String name,
            TypeIF type,
            CabProcedure cabProcedure)
    {
    	super (scope, name, type);
    	this.cabProcedure = cabProcedure;
    }

    /*
     * Devuelve cabProcedure
     */
	public CabProcedure getCabProcedure() {
		return cabProcedure;
	}

	/*
	 * Modifica cabProcedure
	 */
	public void setCabProcedure(CabProcedure cabProcedure) {
		this.cabProcedure = cabProcedure;
	}
}
