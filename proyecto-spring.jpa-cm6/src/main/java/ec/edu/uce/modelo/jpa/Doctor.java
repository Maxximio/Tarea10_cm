package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="especialidad")
	private String especialidad;

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

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	//to string
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", apellido=" + apellido + ", especialidad=" + especialidad + "]";
	}
	
}
