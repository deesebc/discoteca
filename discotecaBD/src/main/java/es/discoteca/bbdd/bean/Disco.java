package es.discoteca.bbdd.bean;

// Generated 01-mar-2013 9:51:56 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Disco generated by hbm2java
 */
@Entity
@Table(name = "disco", catalog = "almacen")
public class Disco implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer ident;
	private String nombre;
	private String grupo;
	private Set<Cancion> canciones = new HashSet<Cancion>(0);
	private Set<Interprete> interpretes = new HashSet<Interprete>(0);

	public Disco() {
	}

	public Disco(final Integer ident) {
		this.ident = ident;
	}

	public Disco(final Integer ident, final String nombre, final String grupo,
			final Set<Cancion> canciones, final Set<Interprete> interpretes) {
		this.ident = ident;
		this.nombre = nombre;
		this.grupo = grupo;
		this.canciones = canciones;
		this.interpretes = interpretes;
	}

	// @OneToMany(fetch = FetchType.LAZY, mappedBy = "disco")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "IDDISCO", referencedColumnName = "IDENT")
	public Set<Cancion> getCanciones() {
		return canciones;
	}

	@Column(name = "GRUPO", length = 45)
	public String getGrupo() {
		return grupo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDENT", unique = true, nullable = false)
	public Integer getIdent() {
		return ident;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "IDDISCO", referencedColumnName = "IDENT")
	public Set<Interprete> getInterpretes() {
		return interpretes;
	}

	@Column(name = "NOMBRE", length = 45)
	public String getNombre() {
		return nombre;
	}

	public void setCanciones(final Set<Cancion> canciones) {
		this.canciones = canciones;
	}

	public void setGrupo(final String grupo) {
		this.grupo = grupo;
	}

	public void setIdent(final Integer ident) {
		this.ident = ident;
	}

	public void setInterpretes(final Set<Interprete> interpretes) {
		this.interpretes = interpretes;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

}
