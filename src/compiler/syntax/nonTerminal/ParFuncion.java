package compiler.syntax.nonTerminal;

public class ParFuncion extends NonTerminal {

	private Parametros parametros;
	
	/*
	 * Constructor ParFuncion por defecto
	 */
	public ParFuncion() {
		super();
	}
	
	/*
	 * Constructor ParFuncioncon Parametros
	 */
	public ParFuncion(Parametros parametros) {
		super();
		this.parametros = parametros;
	}

	/*
	 * Devuelve Paramtros
	 */
	public Parametros getParametros() {
		return parametros;
	}

	/*
	 * Modifica Parametrod
	 */
	public void setParametros(Parametros parametros) {
		this.parametros = parametros;
	}
	
	
}
