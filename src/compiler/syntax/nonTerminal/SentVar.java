package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class SentVar extends NonTerminal {

	private List<ExpVar> expVarList;
	
	/*
	 * Constructor SentVar con ExpVar
	 */
	public SentVar(ExpVar expVar) {
		super();
		this.expVarList = new ArrayList<ExpVar>();
		expVarList.add(expVar);
	}

	/*
	 * Devuelve expVarList
	 */
	public List<ExpVar> getExpVarList() {
		return expVarList;
	}

	/*
	 * Modifica expVarList
	 */
	public void setExpVarList(List<ExpVar> expVarList) {
		this.expVarList = expVarList;
	}
	
	/*
	 * Añade ExpVar a expVarList
	 */
	public void addExpVar(ExpVar expVar) {
		expVarList.add(expVar);
	}
}
