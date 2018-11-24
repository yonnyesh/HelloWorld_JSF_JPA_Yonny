package com.certificatic.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
	@NamedQuery(name = "Alumno.findAll", query = "SELECT a FROM Alumno a ORDER BY a.alumnoId")
})
@Table(name="alumnos")
public class Alumno implements Serializable{
	
	private static final long serialVersionUID = -7678811113801147817L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="alumno_id")
	private Long alumnoId;
	private String nombre;
	private String apellido;
	private String edad;
	private String email;
	
	public Alumno (){
		
	}
	
	public Alumno(Long alumnoId, String nombre, String apellido, String edad, String email) {
	this.alumnoId = alumnoId;
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.email = email;
	}
/*
	public Alumno(String nombre, String apellido, String edad, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.email = email;
	}
*/
	
	
	public Long getAlumnoId() {
		return alumnoId;
	}

	public void setAlumnoId(Long alumnoId) {
		this.alumnoId = alumnoId;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
/*
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", email=" + email + "]";
	}
*/

	@Override
	public String toString() {
		return "Alumno [alumnoId=" + alumnoId + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", email=" + email + "]";
	}
	
	

}
