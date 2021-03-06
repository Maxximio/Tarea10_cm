package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="arquitecto")
public class Arquitecto {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="aniosexperiencia")
	private Integer aniosexperiencia;

	//set y get
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

	public Integer getAniosexperiencia() {
		return aniosexperiencia;
	}

	public void setAniosexperiencia(Integer aniosexperiencia) {
		this.aniosexperiencia = aniosexperiencia;
	}

	@Override
	public String toString() {
		return "Arquitecto [id=" + id + ", apellido=" + apellido + ", aniosexperiencia=" + aniosexperiencia + "]";
	}
	
	
}
