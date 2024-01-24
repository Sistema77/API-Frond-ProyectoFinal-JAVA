package Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Repositorios.UsuarioRepositorio;
import Modelo.UsuarioDAO;

@RestController
@RequestMapping("/api/v1")
public class UsuarioControlador {
	
	@Autowired
	private UsuarioRepositorio repositorio;
	
	@GetMapping("/usuarios")
	public List<UsuarioDAO> ListarTodosEmpleados(){
		return this.repositorio.findAll();
	}
}
