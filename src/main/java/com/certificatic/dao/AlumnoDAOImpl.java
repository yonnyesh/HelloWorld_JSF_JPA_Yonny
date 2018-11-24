package com.certificatic.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.certificatic.model.Alumno;

@Stateless
public class AlumnoDAOImpl implements AlumnoDAO {
	
	@PersistenceContext(unitName = "AlumnoPU")
	EntityManager em;

	@Override
	public List<Alumno> listarAlumnos() {
		return em.createNamedQuery("Alumno.findAll").getResultList();
	}

	@Override
	public void insertarAlumno(Alumno alumno) {
		em.persist(alumno);
		
	}

	@Override
	public Alumno buscarAlumnoPorID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarAlumnoPorID(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Alumno alumno) {
		// TODO Auto-generated method stub
		
	}
	
	

}
