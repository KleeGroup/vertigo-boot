package lollipop.domain.users;

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
public final class Profil implements Entity {
	private static final long serialVersionUID = 1L;

	private Long proId;
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
	private final ListVAccessor<lollipop.domain.users.SecurityRole> securityRoleAccessor = new ListVAccessor<>(this, "ANN_PRO_SRO", "SecurityRole");

	/** {@inheritDoc} */
	@Override
	public URI<Profil> getURI() {
		return DtObjectUtil.createURI(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'PRO_ID'.
	 * @return Long proId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_ID", type = "ID", required = true, label = "PRO_ID")
	public Long getProId() {
		return proId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'PRO_ID'.
	 * @param proId Long <b>Obligatoire</b>
	 */
	public void setProId(final Long proId) {
		this.proId = proId;
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

	/**
	 * Association : Security role.
	 * @return l'accesseur vers la propriété 'Security role'
	 */
	public ListVAccessor<lollipop.domain.users.SecurityRole> securityRole() {
		return securityRoleAccessor;
	}
	
	/**
	 * Association : Security role.
	 * @return io.vertigo.dynamo.domain.model.DtList<lollipop.domain.users.SecurityRole>
	 */
	@Deprecated
	public io.vertigo.dynamo.domain.model.DtList<lollipop.domain.users.SecurityRole> getSecurityRoleList() {
		// we keep the lazyness
		if (!securityRoleAccessor.isLoaded()) {
			securityRoleAccessor.load();
		}
		return securityRoleAccessor.get();
	}

	/**
	 * Association URI: Security role.
	 * @return URI de l'association
	 */
	@Deprecated	
	public io.vertigo.dynamo.domain.metamodel.association.DtListURIForNNAssociation getSecurityRoleDtListURI() {
		return (io.vertigo.dynamo.domain.metamodel.association.DtListURIForNNAssociation) securityRoleAccessor.getDtListURI();
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
