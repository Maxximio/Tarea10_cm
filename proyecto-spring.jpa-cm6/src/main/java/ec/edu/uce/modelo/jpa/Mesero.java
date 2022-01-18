package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mesero")
public class Mesero {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="restaurante")
	private String restaurante;

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

	public String getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(String restaurante) {
		this.restaurante = restaurante;
	}

	//to string
	@Override
	public String toString() {
		return "Mesero [id=" + id + ", apellido=" + apellido + ", restaurante=" + restaurante + "]";
	}
	
	
}
