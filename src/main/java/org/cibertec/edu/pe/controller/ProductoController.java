package org.cibertec.edu.pe.controller;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.IProductoServices.IProductoService;
import org.cibertec.edu.pe.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ProductoController {

	@Autowired
	private IProductoService servicio;
	
	// Método para Listar
		@GetMapping("/listar")		// http://localhost:8080/listar
		public String Listar(Model m) {
			List<Producto> lista = servicio.Listado();
			m.addAttribute("productos", lista);
			return "listar";		// listar.html
		}
		
		// Método para Buscar
		@GetMapping("/ver/{id}")	// http://localhost:8080/ver/1
		public String ver(@PathVariable int id, Model m) {
			Optional<Producto> p = servicio.Buscar(id);
			m.addAttribute("producto", p);
			return "view";			// view.html
		}
		
		// Método para agregar
		@GetMapping("/nuevo")
		public String agregar(Model m) {
			m.addAttribute("producto", new Producto());
			return "form";			// form.html
		}
		
		// Método para grabar
		@GetMapping("/salvar")
		public String salvar(@Validated Producto p, Model m) {
			servicio.Grabar(p);
			return "redirect:/listar";
		}
		
		
	
}
