package tutorial.ejemplo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mascotas")
public class MascotasModelo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer id;
	
	
	public String name;
	
	
	public String especie;
	
	
	public String mezcla;
	
	
	public int edad;
	
	
	public String venta;

	// Constructores

	public MascotasModelo() {
		super();
	}

	public MascotasModelo(Integer _id, String nombre, String especie, String mezcla, int edad, String venta) {

		super();
		this.id = _id;
		this.name = nombre;
		this.especie = especie;
		this.mezcla = mezcla;
		this.edad = edad;
		this.venta = venta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer _id) {
		this.id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String nombre) {
		this.name = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspcie(String especie) {
		this.especie = especie;
	}

	public String getMezcla() {
		return mezcla;
	}

	public void setMezcla(String mezcla) {
		this.mezcla = mezcla;
	}

	public int getEdad() {
		return edad;
	}

	public String getVenta() {
		return venta;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setVenta(String venta) {
		this.venta = venta;
	}

}
