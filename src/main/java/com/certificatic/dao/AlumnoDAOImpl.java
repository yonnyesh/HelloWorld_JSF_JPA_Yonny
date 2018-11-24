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
		return em.find(Alumno.class, id);
	}

	@Override
	public void borrarAlumnoPorID(Long id) {
		Alumno alumno =em.find(Alumno.class, id);
		em.remove(alumno);
		
	}

	@Override
	public void actualizar(Alumno alumno) {
		em.merge(alumno);
		
	}
	
	

}
