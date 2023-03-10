
package consultas;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dal.repostajeGasolinera;
import dal.repostajeGasolineraImpl;
import dal.repostajeVehiculo;
import dal.repostajeVehiculoImpl;

@Repository
public class consultas {
	
	@Autowired
	private repostajeGasolineraImpl rp;
	@Autowired
	private repostajeVehiculoImpl rpv;
	
	@Transactional
	public void insertarUnRepostajeNormal(repostajeGasolinera RepostajeGasolinera ) {
		rp.insertarRepostajeNormal(RepostajeGasolinera);
		
	}
	@Transactional
	public void insertarUnRepostajeVehiculo (repostajeVehiculo RepostajeVehiculo) {
		rpv.repostajeVehiculo(RepostajeVehiculo);
	}
	@Transactional
	public List<repostajeVehiculo> verTodosRepostajes(){
		return rpv.buscarTodosRepostajes();
	}
	@Transactional 
	public List<repostajeVehiculo>totalCombistible(){
		return rpv.importeTotalCombustible();
	}
	
	@Transactional 
	public List<repostajeGasolinera>listaLlenadoDeposito(){
		return rp.verLlenadoDeposito();
	}
	
	@Transactional
	public void llenarDeposito(repostajeGasolinera RepostajeGasolinera) {
		rp.llenarDeposito(RepostajeGasolinera);
	}
	@Transactional
	public List<repostajeGasolinera> verTodosRepostajesGasolinera() {
		// TODO Auto-generated method stub
		return rp.buscarTodosRepostajes();
	}
	@Transactional
	public void eliminarUltimoDeposito() {
		rp.eliminarDeposito();
	}
	@Transactional 
	public List<repostajeVehiculo> totalRepostajeVehiculo() {
		return rpv.importeTotalCombustible();
	}
	
	
	
}
