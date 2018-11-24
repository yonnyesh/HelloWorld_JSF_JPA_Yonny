package com.certificatic.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.certificatic.dao.AlumnoDAO;
import com.certificatic.model.Alumno;

@Named
@RequestScoped
public class AlumnoController {

	@Inject	
	AlumnoDAO alumnoDAO;
	
	private Alumno alumno;
	
	
	private static List<Alumno> alumnos = new ArrayList<>();	

	public AlumnoController() {
		
		alumno= new Alumno();
		

		
	}
	
	public List<Alumno> listarAlumnos(){
		return alumnoDAO.listarAlumnos();
	}

	public void Guardar() {
		System.out.println("Alumno: " + alumno);
		alumnoDAO.insertarAlumno(alumno);
		alumnos.add(alumno);
		alumno = new Alumno();

	}
	
	public void Eliminar(Long id) {
		//System.out.println("::: Eliminando: " + alumno);
		alumnoDAO.borrarAlumnoPorID(id);
		//alumnos.remove(alumno);
		System.out.println("::: Eliminado :::");
		
	}


	

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public List<Alumno> getAlumnos() {
		alumnos = alumnoDAO.listarAlumnos();
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		alumnos = alumnoDAO.listarAlumnos();
		AlumnoController.alumnos = alumnos;
	}

	public AlumnoDAO getAlumnoDAO() {
		return alumnoDAO;
	}

	public void setAlumnoDAO(AlumnoDAO alumnoDAO) {
		this.alumnoDAO = alumnoDAO;
	}	

																																																																					
	
}
