package compiler.syntax.nonTerminal;

public class SWriteInt extends NonTerminal {

private Expresion expresion;
	
	/*
	 * Constructor SWriteInt con Expresion
	 */
	public SWriteInt(Expresion expresion) {
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
	public void setEntero(Expresion expresion) {
		this.expresion = expresion;
	}
}
