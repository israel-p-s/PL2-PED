package compiler.syntax.nonTerminal;

public class ExprArit extends NonTerminal {

	private Integer valor;
	private String operacion;
	private Expresion expresion1;
	private Expresion expresion2;
	
	/*
	 * Constructor ExprArit con String, Expresion y Expresion
	 */
	public ExprArit(String operacion, Expresion expresion1, Expresion expresion2) {
		super();
		this.operacion = operacion;
		this.expresion1 = expresion1;
		this.expresion2 = expresion2;
	}
	
	/*
	 * Constructor ExprArit con int
	 */
	public ExprArit(int valor) {
		super();
		this.valor = valor;
	}

	/*
	 * Devuelve el resultado de ExprArit
	 */
	public int getResultado() {
		//Si valor no es nulo, la expresión es un entero
		if(this.valor != null) {
			return this.valor;
		//Si no, comprobamos si es resta o una multiplicación y realizamos el cálculo con las expresiones
		} else {
			if(operacion.equals("*")) {
				return (int)expresion1.getValor() * (int)expresion2.getValor();
			} else {
				return (int)expresion1.getValor() - (int)expresion2.getValor();
			}
		}	
	}

	/*
	 * Devuelve valor
	 */
	public int getValor() {
		return valor;
	}

	/*
	 * Modifica valor
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	/*
	 * Devuelve operacion
	 */
	public String getOperacion() {
		return operacion;
	}

	/*
	 * Modifica operacion
	 */
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	/*
	 * Devuelve expresion1
	 */
	public Expresion getExpresion1() {
		return expresion1;
	}

	/*
	 * Modifca expresion1
	 */
	public void setExpresion1(Expresion expresion1) {
		this.expresion1 = expresion1;
	}
	
	/*
	 * Devuelve expresion2
	 */
	public Expresion getExpresion2() {
		return expresion2;
	}

	/*
	 * Modifica expresion2
	 */
	public void setExpresion2(Expresion expresion2) {
		this.expresion2 = expresion2;
	}


}
