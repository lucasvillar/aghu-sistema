package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpmPrincFarmSumarioAlta generated by hbm2java
 */
@Entity
@Table(name = "MPM_PRINC_FARM_SUMARIO_ALTAS", schema = "AGH")
public class MpmPrincFarmSumarioAlta extends BaseEntityId<MpmPrincFarmSumarioAltaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6981529860219331552L;
	private MpmPrincFarmSumarioAltaId id;
	private MpmSumarioAlta sumarioAlta;
	private RapServidores servidor;

	public MpmPrincFarmSumarioAlta() {
	}

	public MpmPrincFarmSumarioAlta(MpmPrincFarmSumarioAltaId id,
			MpmSumarioAlta sumarioAlta, RapServidores servidor) {
		this.id = id;
		this.sumarioAlta = sumarioAlta;
		this.servidor = servidor;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "salAtdSeq", column = @Column(name = "SAL_ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "medMatCodigo", column = @Column(name = "MED_MAT_CODIGO", nullable = false, precision = 6, scale = 0)) })
	public MpmPrincFarmSumarioAltaId getId() {
		return this.id;
	}

	public void setId(MpmPrincFarmSumarioAltaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SAL_ATD_SEQ", nullable = false, insertable = false, updatable = false)
	public MpmSumarioAlta getSumarioAlta() {
		return this.sumarioAlta;
	}

	public void setSumarioAlta(MpmSumarioAlta sumarioAlta) {
		this.sumarioAlta = sumarioAlta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		MpmPrincFarmSumarioAlta other = (MpmPrincFarmSumarioAlta) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	public enum Fields {
		
		SAL_ATD_SEQ("id.salAtdSeq"),
		MED_MAT_CODIGO("id.medMatCodigo"),
		SUMARIO_ALTA("sumarioAlta"),
		SERVIDOR("servidor");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
		
	}
	
}