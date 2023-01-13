package dal;

import java.util.List;

public interface repostajeVehiculoServicio {
	//Sigantura del metodo del repostaje del vehiclo
	public void repostajeVehiculo(repostajeVehiculo repostaje);
	//Sigantura del metodo que busca todos lo repostajes
	
	public List<repostajeVehiculo>buscarTodosRepostajes();


}
