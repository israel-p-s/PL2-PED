package compiler.syntax.nonTerminal;

public class IdArray extends NonTerminal {

	private Expresion expresion;
	
	/*
	 * Constructor IdArray con Expresion
	 */
	public IdArray(Expresion expresion) {
		super();
		this.expresion = expresion;
	}

	/*
	 * Devuelve expresion
	 */
	public Expresion getExpresion() {
		return expresion;
	}

	/*
	 * Modifica expresion
	 */
	public void setExpresion(Expresion expresion) {
		this.expresion = expresion;
	}
	
}
