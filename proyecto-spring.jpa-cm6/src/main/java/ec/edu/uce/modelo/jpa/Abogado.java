package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="abogado")
public class Abogado {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="firma")
	private String firma;

	//get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	//to string
	@Override
	public String toString() {
		return "Abogado [id=" + id + ", apellido=" + apellido + ", firma=" + firma + "]";
	}
}
