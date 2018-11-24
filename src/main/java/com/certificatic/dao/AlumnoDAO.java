package com.certificatic.dao;

import java.util.List;

import javax.ejb.Local;

import com.certificatic.model.Alumno;

@Local
public interface AlumnoDAO {
	
	public List<Alumno> listarAlumnos();
	void insertarAlumno(Alumno alumno);
	Alumno buscarAlumnoPorID(Long id);
	void borrarAlumnoPorID(Long id);
	void actualizar(Alumno alumno);

}
