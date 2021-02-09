package Test.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.sql.Date;

@Entity
public class Proveedor {

	@Id
	Integer idProveedor;
	String nombre;
	Date fechaAlta;
	Integer idCliente;
	
	public Proveedor(Integer idProveedor, String nombre, Date fechaAlta, Integer idCliente) {
		super();
		this.idProveedor = idProveedor;
		this.nombre = nombre;
		this.fechaAlta = fechaAlta;
		this.idCliente = idCliente;
	}

	public Proveedor() {
		super();
	}

	@Override
	public String toString() {
		return "Proveedor [idProveedor=" + idProveedor + ", nombre=" + nombre + ", fechaAlta=" + fechaAlta
				+ ", idCliente=" + idCliente + "]";
	}
	
	
	
}
