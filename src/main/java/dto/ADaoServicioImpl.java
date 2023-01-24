/**
 * 
 */
package dto;

import dal.repostajeGasolinera;

/**
 * @author garfe
 * Implementación de la interfaz ADaoServicio
 */
public class ADaoServicioImpl implements ADaoServicio{
	
	@Override
	public repostajeGasolinera RepostajeGasolineraNormalDTOADAO(RepostajeGasolineraDTO repostajeGasolineraDTO) {
		
		repostajeGasolinera repostajeGasolinera = new repostajeGasolinera();
		if(repostajeGasolineraDTO != null) {
	
			repostajeGasolinera.setImporte(repostajeGasolineraDTO.getImporteRespostajeGasolinera());
			repostajeGasolinera.setMd_fecha(repostajeGasolineraDTO.getFchRepostajeGasolinera());
			
			
		}
		return repostajeGasolinera;
	}
}
