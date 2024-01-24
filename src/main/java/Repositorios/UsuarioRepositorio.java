package Repositorios;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import Modelo.UsuarioDAO;

public interface UsuarioRepositorio extends JpaRepository<UsuarioDAO, Long> {
	/**
	 * Método que busca un usuario por Dni en la base de datos y lo devuelve
	 * @param dni
	 * @return Usuario o null
	 */
	Optional<UsuarioDAO> findByDniUsuario(String dni);
	
	/**
	 * Método que busca un usuario por Email en la base de datos y lo devuelve
	 * @param email
	 * @return Usuario o null
	 */
	Optional<UsuarioDAO> findByEmailUsuario(String email);
}
