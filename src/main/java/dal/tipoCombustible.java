package dal;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipoCombustible" , schema="dlk_gasolinera")
public class tipoCombustible {
	//Atributos
		@Id
		@Column(name="id", unique=true, nullable=false)
		private int id;
		@Column(name="md_uuid",nullable=false)
		private String md_uuid;
		@Column(name="md_fecha",nullable=false)
		private Date md_fecha;
		@Column(name="gasoil")
		private String gasoil;
		@Column(name="gasolina95")
		private String gasolina95;
		@Column(name="gasolina98")
		private String gasolina98;
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
		public String getGasoil() {
			return gasoil;
		}
		public void setGasoil(String gasoil) {
			this.gasoil = gasoil;
		}
		public String getGasolina95() {
			return gasolina95;
		}
		public void setGasolina95(String gasolina95) {
			this.gasolina95 = gasolina95;
		}
		public String getGasolina98() {
			return gasolina98;
		}
		public void setGasolina98(String gasolina98) {
			this.gasolina98 = gasolina98;
		}
		public Double getImporte() {
			return importe;
		}
		public void setImporte(Double importe) {
			this.importe = importe;
		}
		
		//Constructores
		public tipoCombustible(int id, String md_uuid, Date md_fecha, String gasoil, String gasolina95, String gasolina98,
				Double importe) {
			super();
			this.id = id;
			this.md_uuid = md_uuid;
			this.md_fecha = md_fecha;
			this.gasoil = gasoil;
			this.gasolina95 = gasolina95;
			this.gasolina98 = gasolina98;
			this.importe = importe;
		}
		
		public tipoCombustible() {
			super();
		}

}
