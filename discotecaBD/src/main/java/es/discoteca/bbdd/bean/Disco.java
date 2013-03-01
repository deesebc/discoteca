package es.discoteca.bbdd.bean;

// Generated 01-mar-2013 9:51:56 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Set<Auxdisint> auxdisints = new HashSet<Auxdisint>(0);

	public Disco() {
	}

	public Disco(final Integer ident) {
		this.ident = ident;
	}

	public Disco(final Integer ident, final String nombre, final String grupo,
			final Set<Auxdisint> auxdisints) {
		this.ident = ident;
		this.nombre = nombre;
		this.grupo = grupo;
		this.auxdisints = auxdisints;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "intdis.disco")
	public Set<Auxdisint> getAuxdisints() {
		return this.auxdisints;
	}

	@Column(name = "GRUPO", length = 45)
	public String getGrupo() {
		return this.grupo;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "IDENT", unique = true, nullable = false)
	public Integer getIdent() {
		return this.ident;
	}

	@Column(name = "NOMBRE", length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setAuxdisints(final Set<Auxdisint> auxdisints) {
		this.auxdisints = auxdisints;
	}

	public void setGrupo(final String grupo) {
		this.grupo = grupo;
	}

	public void setIdent(final Integer ident) {
		this.ident = ident;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

}
