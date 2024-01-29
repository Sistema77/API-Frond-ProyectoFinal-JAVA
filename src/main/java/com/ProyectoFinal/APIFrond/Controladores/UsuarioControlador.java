package com.ProyectoFinal.APIFrond.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoFinal.APIFrond.Repositorios.UsuarioRepositorio;
import com.ProyectoFinal.APIFrond.Modelo.UsuarioDAO;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioControlador {
	
	@Autowired
	private UsuarioRepositorio repositorio;
	
	@GetMapping("/usuarios")
	public List<UsuarioDAO> ListarTodosEmpleados(){
		return this.repositorio.findAll();
	}
	
	@PostMapping("/registrar")
	public UsuarioDAO crearUsuario(@RequestBody UsuarioDAO nuevoUsuario) {
	    return repositorio.save(nuevoUsuario);
	}
}
