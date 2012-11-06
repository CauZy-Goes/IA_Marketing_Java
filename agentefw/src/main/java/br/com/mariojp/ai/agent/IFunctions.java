/*
 * Created on 05/04/2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package br.com.mariojp.ai.agent;

import java.util.List;

/**
 * @author alunois
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public interface IFunctions {
	/**
	 * fun��o g(x) representa o calculo do custo do n�.
	 * 
	 * @param o
	 * @return
	 */
	public abstract double g(INode no);

	
	public abstract double calculaUtilidade(INode no);
	/**
	 * fun��o h(x) representa o calculo da heuristica do n�.
	 * 
	 * @param o
	 * @return
	 */
	public abstract double h(INode no);


	public abstract boolean funcaoObjetivo(IState estado);
	
	
	public abstract void setObjectives(List<IState> objectives);

	public abstract List<IState> getObjectives();	
	
	
}