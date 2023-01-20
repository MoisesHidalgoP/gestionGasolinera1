package dal;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="repostaheVehiculo" , schema="dlk_gasolinera")
public class repostajeVehiculo {
	
	//Atributos
	@Id
	@Column(name="id", unique=true, nullable=false)
	private int id;
	@Column(name="md_uuid",nullable=false)
	private String md_uuid;
	@Column(name="md_fecha")
	private Date md_fecha;
	@Column(name="dniCliente")
	private String dniCliente;
	@Column(name="matriculaVehicula")
	private String matriculaVehiculo;
	@Column(name="importe")
	private Double importe;
	
	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMd_uuid() {
		return md_uuid;
	}

	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}

	public Date getMd_fecha() {
		return md_fecha;
	}

	public void setMd_fecha(Date md_fecha) {
		this.md_fecha = md_fecha;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public String getMatriculaVehiculo() {
		return matriculaVehiculo;
	}

	public void setMatriculaVehiculo(String matriculaVehiculo) {
		this.matriculaVehiculo = matriculaVehiculo;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}
	
	//Constructores
	public repostajeVehiculo(int id, String md_uuid, String dniCliente, String matriculaVehiculo,
			Double importe) {
		super();
		this.id = id;
		this.md_uuid = md_uuid;
		this.dniCliente = dniCliente;
		this.matriculaVehiculo = matriculaVehiculo;
		this.importe = importe;
	}
	
	public repostajeVehiculo() {
		super();
	}
	
	@Override
	public String toString() {
		return "repostajeVehiculo [id=" + id + ", md_uuid=" + md_uuid + ", dniCliente=" + dniCliente
				+ ", matriculaVehiculo=" + matriculaVehiculo + ", importe=" + importe + "]";
	}

	

}
