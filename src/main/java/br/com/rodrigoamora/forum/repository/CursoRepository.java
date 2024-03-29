package br.com.rodrigoamora.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rodrigoamora.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
