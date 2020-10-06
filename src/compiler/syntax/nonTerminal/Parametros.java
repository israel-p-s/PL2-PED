package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class Parametros extends NonTerminal {

	private List<Expresion> expresionList = new ArrayList<Expresion>();
	
	/*
	 * Constructor Parametros por defecto
	 */
	public Parametros() {
		
	}
	
	/*
	 * Constructor Parametros con Expresion
	 */
	public Parametros(Expresion expresion) {
		this.expresionList.add(expresion);
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
	 * Añade Expresion a expresionList
	 */
	public void addExpresion(Expresion expresion){
		expresionList.add(expresion);
	}
	
}
