package com.ProyectoFinal.APIFrond.Repositorios;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ProyectoFinal.APIFrond.Modelo.UsuarioDAO;

public interface UsuarioRepositorio extends JpaRepository<UsuarioDAO, Long> {
	/**
	 * Método que busca un usuario por Dni en la base de datos y lo devuelve
	 * @param dni
	 * @return Usuario o null
	 */
	Optional<UsuarioDAO> findByDni(String dni);
	
	/**
	 * Método que busca un usuario por Email en la base de datos y lo devuelve
	 * @param email
	 * @return Usuario o null
	 */
	Optional<UsuarioDAO> findByEmail(String email);
	
	
	Optional<UsuarioDAO> findByName(String name);
	
	/*Optional<UsuarioDAO> findByLastName(String lastName);
	Optional<UsuarioDAO> findByPassword(String password);
	Optional<UsuarioDAO> findByTlf(String tlf);
	Optional<UsuarioDAO> findByFoto(String foto);
	Optional<UsuarioDAO> findByTipoUsuario(String tipoUsuario);*/
	
	
	
	
}
