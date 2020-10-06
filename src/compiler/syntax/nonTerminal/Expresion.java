package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class Expresion extends NonTerminal {

	private ExprArit exprArit;
	private ExprLogica exprLogica;
	private Variables variables;
	private List<Expresion> expresionList = new ArrayList<>();;
	
	/*
	 * Constructor Expresion con ExprArit
	 */
	public Expresion(ExprArit exprArit) {
		super();
		this.exprArit = exprArit;
	}
	
	/*
	 * Constructor Expresion con ExprLogica
	 */
	public Expresion(ExprLogica exprLogica) {
		super();
		this.exprLogica = exprLogica;
	}
	
	/*
	 * Constructor Exppresion con Variables
	 */
	public Expresion(Variables variables) {
		super();
		this.variables = variables;
	}
	
	/*
	 * Constructor Expresion con expresion
	 */
	public Expresion(Expresion expresion) {
		super();
		this.expresionList.add(expresion);
	}

	/*
	 * Devuelve exprArit
	 */
	public ExprArit getExprArit() {
		return exprArit;
	}
	
	/*
	 * Modifica exprArit
	 */
	public void setExprArit(ExprArit exprArit) {
		this.exprArit = exprArit;
	}

	/*
	 * Devuelve exprLogica
	 */
	public ExprLogica getExprLogica() {
		return exprLogica;
	}

	/*
	 * Modifica exprLogica
	 */
	public void setExprLogica(ExprLogica exprLogica) {
		this.exprLogica = exprLogica;
	}

	/*
	 * Devuelve variables
	 */
	public Variables getVariables() {
		return variables;
	}

	/*
	 * Modifica variables
	 */
	public void setVariables(Variables variables) {
		this.variables = variables;
	}
	
	/*
	 * Devuelve expresionList
	 */
	public List<Expresion> getExpresionList() {
		return expresionList;
	}

	/*
	 * Modifica expresionList
	 */
	public void setExpresionList(List<Expresion> expresionList) {
		this.expresionList = expresionList;
	}
	
	/*
	 * Añade expresion a expresionList
	 */
	public void addExpresion(Expresion expresion) {
		this.expresionList.add(expresion);
	}
	
	/*
	 * Devuelve el valor de la expresion, comprobando si es aritméticao lógica
	 */
	public Object getValor() {
		if(this.exprArit != null) {
			return exprArit.getResultado();
		}
		if(this.exprLogica != null) {
			return exprLogica.getResultado();
		}
		return null;
	}
	
}
