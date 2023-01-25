package dal;

import java.util.List;

public interface repostajeGasolineraServicio {
	
	//Signatura del metodo insertar repostaje normal
	public void insertarRepostajeNormal(repostajeGasolinera repostaje);
    //Sigatura del metodo verLlenadoDeposito 
	List<repostajeGasolinera> verLlenadoDeposito();
	//Signatura del metodo llenarDeposito
	public void llenarDeposito(repostajeGasolinera RepostajeGasolinera);
	//Signatura del metodo buscarTodosRepostajes (REPOSTAJE GASOLINERA)
	public List<repostajeGasolinera>buscarTodosRepostajes();
	//Signatura que elimina el ultimo depósito
	public void eliminarDeposito();
	
	
	

}
