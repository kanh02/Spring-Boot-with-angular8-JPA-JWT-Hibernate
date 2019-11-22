package com.rest.webservices.restfullwebservices.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long>{
	//aca decimos que hay una lista de usuarios en la database y creaos el link para el repositorio
	List<Todo>findByUsername(String username);

}
