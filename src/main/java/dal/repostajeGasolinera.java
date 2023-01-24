package dal;

import java.security.Timestamp;
import java.sql.Date;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="repostajeGasolinea" , schema="dlk_gasolinera")
public class repostajeGasolinera {
	
	//Atributos
	@Id
	@Column(name="id", unique=true, nullable=false)
	private int id;
	@Column(name="md_uuid",nullable=false)
	private String md_uuid;
	@Column(name="md_fecha")
	private Calendar md_fecha;
	@Column(name="hora")
	private Timestamp hora;
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

	public Calendar getMd_fecha() {
		return md_fecha;
	}

	public void setMd_fecha(Calendar md_fecha) {
		this.md_fecha = md_fecha;
	}

	public Timestamp getHora() {
		return hora;
	}

	public void setHora(Timestamp hora) {
		this.hora = hora;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}
	
	//Constructores 
	
	
    public repostajeGasolinera(int id,String md_uuid, Double importe) {
    	this.id=id;
    	this.md_uuid=md_uuid;
    	this.importe=importe;
    	
    }
	
	

	public repostajeGasolinera() {
		super();
	}
	
	@Override
	public String toString() {
		return "repostajeGasolinera [id=" + id + ", md_uuid=" + md_uuid + ", md_fecha=" + md_fecha + ", hora=" + hora
				+ ", importe=" + importe + "]";
	}
	

}
