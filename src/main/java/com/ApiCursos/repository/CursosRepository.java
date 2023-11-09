package com.ApiCursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiCursos.entities.Cursos;

public interface CursosRepository extends JpaRepository <Cursos, Long>{

}
