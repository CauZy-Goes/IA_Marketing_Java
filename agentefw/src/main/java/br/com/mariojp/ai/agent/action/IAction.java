package br.com.mariojp.ai.agent.action;

import java.util.List;

import br.com.mariojp.ai.agent.IState;
import br.com.mariojp.ai.agent.exception.ImpossibleActionException;

/**
 * Interface de uma a��o a ser executada.
 * 
 * As a��es devem implementar esta interface. 
 * 
 * @author Mario Jorge Pereira
 *
 */
public interface IAction {

	/**
	 * Metodo que deve ser implementado retonando o estado apos a a��o aplicada.
	 * @param estado
	 * @return List - Retorna uma lista contendo de 1 a N Estados possiveis depois da a��o aplicada.
	 * @throws ImpossibleActionException
	 */
	public List<IState> execute(IState estado) throws ImpossibleActionException;
	
	
	public List<IState> revert(IState estado) throws ImpossibleActionException;

}