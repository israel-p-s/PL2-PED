package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolConstant.
 */

public class SymbolConstant
    extends SymbolBase
{
	private Integer entero;
	private boolean booleano;
    
    /**
     * Constructor for SymbolConstant.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolConstant (ScopeIF scope,
                           String name,
                           TypeIF type)
    {
        super (scope, name, type);
    }
    
    /*
     * Constructor SymbolConstant con SymbolIF, String, TypeIF y int
     */
    public SymbolConstant (ScopeIF scope,
            String name,
            TypeIF type,
            int entero)
    {
    	super (scope, name, type);
    	this.entero = entero;
    }
    
    /*
     * Constructor SymbolConstant con SymbolIF, String, TypeIF y boolean
     */
    public SymbolConstant (ScopeIF scope,
            String name,
            TypeIF type,
            boolean booleano)
    {
    	super (scope, name, type);
    	this.booleano = booleano;
    }

    /*
     * Devuelve entero
     */
	public Integer getEntero() {
		return entero;
	}

	/*
	 * Modifica entero
	 */
	public void setEntero(int entero) {
		this.entero = entero;
	} 
	
	/*
	 * Devuelve booleano
	 */
	public boolean getBooleano() {
		return booleano;
	}

	/*
	 * Modifica booleano
	 */
	public void setBooleano(boolean booleano) {
		this.booleano = booleano;
	} 
}
