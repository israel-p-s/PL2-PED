package compiler.syntax.nonTerminal;


public class ProcParenParam extends NonTerminal {

	private ProcListParam procListParam;
	
	/*
	 * Constructor ProcParenParam por defecto
	 */
	public ProcParenParam() {
		super();
		this.procListParam = new ProcListParam();
	}
	
	/*
	 * Constructor ProcParenParam con ProcListParam
	 */
	public ProcParenParam(ProcListParam procListParam) {
		super();
		this.procListParam = procListParam;
	}

	/*
	 * Devuelve procListParam
	 */
	public ProcListParam getProcListParam() {
		return procListParam;
	}

	/*
	 * Modifica procListParam
	 */
	public void setProcListParam(ProcListParam procListParam) {
		this.procListParam = procListParam;
	}
	
	
	
	
}
