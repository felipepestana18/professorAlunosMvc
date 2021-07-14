package com.felipepestana.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.felipepestana.projeto1.models.Professor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{
	

}
