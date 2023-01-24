/**
 * 
 */
package dto;

import dal.repostajeGasolinera;

/**
 * @author garfe
 * ADaoServicio: Interfaz con los métoso que pasan de DTO a DAO.
 */
public interface ADaoServicio {
	
	/**
	 * Paso de DTO a DAO repostaje gasolinera normal
	 * @param repostajeGasolineraDTO dto de repostaje gasolinera normal
	 * @return
	 */
	public repostajeGasolinera RepostajeGasolineraNormalDTOADAO(RepostajeGasolineraDTO repostajeGasolineraDTO);

}
