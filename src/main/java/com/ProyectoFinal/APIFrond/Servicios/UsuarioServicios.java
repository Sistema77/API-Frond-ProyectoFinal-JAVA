package com.ProyectoFinal.APIFrond.Servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoFinal.APIFrond.Modelo.UsuarioDAO;
import com.ProyectoFinal.APIFrond.Repositorios.UsuarioRepositorio;

@Service
public class UsuarioServicios {
	@Autowired
	UsuarioRepositorio repositorio ;
	
	/**
	 * Método que busca un usuario por el dni.
	 * El parámetro 'dni' es el dni por el cual se realizará la búsqueda.
 	 * Devuelve un Optional que contiene el usuario encontrado o un Optional vacío si no se encuentra.
	 * @param dni
	 * @return Optional<Usuario> Devuelve el usuario o null
	 */
	public Optional<UsuarioDAO> getUsuarioDni(String dni)
	{
		return repositorio.findByDni(dni);
	}
	
	/**
	 * Actualizar un usuario especioficado
	 * @param id identificador del usuario
	 * @param Usuario usuario
	 * 
	 */
	public void updateUsuario(UsuarioDAO usuario,Long id)
	{
		UsuarioDAO usuarioObetnido=repositorio.findById(id).get();
		
		usuarioObetnido.setDni(usuario.getDni());
		usuarioObetnido.setName(usuario.getName());
		usuarioObetnido.setLastName(usuario.getLastName());
		usuarioObetnido.setTlf(usuario.getTlf());
		usuarioObetnido.setEmail(usuario.getEmail());
		usuarioObetnido.setPassword(usuario.getPassword());
		usuarioObetnido.setFoto(usuario.getFoto());
		repositorio.save(usuarioObetnido);
	}
	/**
	 * Eliminar un usuario en especifico
	 * @param id identificador del usuario
	 * @return Devuelve tue si se a eliminado con exito o false si no se a eliminado 
	 * 
	 */
	public Boolean deleteUser(Long id) {
		try {
			repositorio.deleteById(id);
			return true;
		}catch(IllegalArgumentException e)
		{
			return false;
		}
		
	}
}
