package org.cibertec.edu.pe.entity;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

	@Entity
	@Table (name= "producto")
	
	public class Producto {	
		//campos o atributos
		
		@Id
		private int IdProducto;
		
		@Size(min = 1, max = 50)
		private String Apellidos;
		 
		@Min(50)
		@Max(500)
		private double PrecioUnidad;
		 
		@Min(1)
		private int Stock;
		 
		@Pattern(regexp = "[01]")
		private char Estado;
		
		
		public Producto() {
			super();
		}


		public Producto(int idProducto, String apellidos, double precioUnidad, int stock, char estado) {
			super();
			IdProducto = idProducto;
			Apellidos = apellidos;
			PrecioUnidad = precioUnidad;
			Stock = stock;
			Estado = estado;
		}


		public int getIdProducto() {
			return IdProducto;
		}


		public void setIdProducto(int idProducto) {
			IdProducto = idProducto;
		}


		public String getApellidos() {
			return Apellidos;
		}


		public void setApellidos(String apellidos) {
			Apellidos = apellidos;
		}


		public double getPrecioUnidad() {
			return PrecioUnidad;
		}


		public void setPrecioUnidad(double precioUnidad) {
			PrecioUnidad = precioUnidad;
		}


		public int getStock() {
			return Stock;
		}


		public void setStock(int stock) {
			Stock = stock;
		}


		public char getEstado() {
			return Estado;
		}


		public void setEstado(char estado) {
			Estado = estado;
		}
		
		

	
}
