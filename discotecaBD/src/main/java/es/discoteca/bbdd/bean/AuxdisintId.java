package es.discoteca.bbdd.bean;

// Generated 01-mar-2013 9:51:56 by Hibernate Tools 4.0.0

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 * AuxdisintId generated by hbm2java
 */
@Embeddable
public class AuxdisintId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Disco disco;
	private Interprete interprete;

	public AuxdisintId() {
	}

	public AuxdisintId(final Disco disco, final Interprete interprete) {
		super();
		this.disco = disco;
		this.interprete = interprete;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		AuxdisintId other = (AuxdisintId) obj;
		if (disco == null) {
			if (other.disco != null) {
				return false;
			}
		} else if (!disco.equals(other.disco)) {
			return false;
		}
		if (interprete == null) {
			if (other.interprete != null) {
				return false;
			}
		} else if (!interprete.equals(other.interprete)) {
			return false;
		}
		return true;
	}

	@ManyToOne
	public Disco getDisco() {
		return disco;
	}

	@ManyToOne
	public Interprete getInterprete() {
		return interprete;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disco == null) ? 0 : disco.hashCode());
		result = prime * result + ((interprete == null) ? 0 : interprete.hashCode());
		return result;
	}

	public void setDisco(final Disco disco) {
		this.disco = disco;
	}

	public void setInterprete(final Interprete interprete) {
		this.interprete = interprete;
	}

}