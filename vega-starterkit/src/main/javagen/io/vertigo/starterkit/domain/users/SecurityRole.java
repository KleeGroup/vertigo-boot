package io.vertigo.starterkit.domain.users;

import io.vertigo.dynamo.domain.model.Entity;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.domain.model.ListVAccessor;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class SecurityRole implements Entity {
	private static final long serialVersionUID = 1L;

	private String sroCd;
	private String label;

	@io.vertigo.dynamo.domain.stereotype.AssociationNN(
			name = "ANN_PRO_SRO",
			tableName = "PRO_SRO",
			dtDefinitionA = "DT_PROFIL",
			dtDefinitionB = "DT_SECURITY_ROLE",
			navigabilityA = false,
			navigabilityB = true,
			roleA = "Profil",
			roleB = "SecurityRole",
			labelA = "Profil",
			labelB = "Security role")
	private final ListVAccessor<io.vertigo.starterkit.domain.users.Profil> profilAccessor = new ListVAccessor<>(this, "ANN_PRO_SRO", "Profil");

	/** {@inheritDoc} */
	@Override
	public URI<SecurityRole> getURI() {
		return DtObjectUtil.createURI(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'SRO_CD'.
	 * @return String sroCd <b>Obligatoire</b>
	 */
	@Field(domain = "DO_CODE", type = "ID", required = true, label = "SRO_CD")
	public String getSroCd() {
		return sroCd;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'SRO_CD'.
	 * @param sroCd String <b>Obligatoire</b>
	 */
	public void setSroCd(final String sroCd) {
		this.sroCd = sroCd;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Label'.
	 * @return String label
	 */
	@Field(domain = "DO_LABEL", label = "Label")
	public String getLabel() {
		return label;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Label'.
	 * @param label String
	 */
	public void setLabel(final String label) {
		this.label = label;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
