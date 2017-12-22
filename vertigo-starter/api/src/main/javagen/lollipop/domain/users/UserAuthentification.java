package lollipop.domain.users;

import io.vertigo.dynamo.domain.model.Entity;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.domain.model.VAccessor;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class UserAuthentification implements Entity {
	private static final long serialVersionUID = 1L;

	private Long authId;
	private String login;
	private String password;

	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_AUTH_USR",
			fkFieldName = "USR_ID",
			primaryDtDefinitionName = "DT_APPLICATION_USER",
			primaryIsNavigable = true,
			primaryRole = "ApplicationUser",
			primaryLabel = "Application user",
			primaryMultiplicity = "1..1",
			foreignDtDefinitionName = "DT_USER_AUTHENTIFICATION",
			foreignIsNavigable = false,
			foreignRole = "UserAuthentification",
			foreignLabel = "User authentification",
			foreignMultiplicity = "0..*")
	private final VAccessor<lollipop.domain.users.ApplicationUser> usrIdAccessor = new VAccessor<>(lollipop.domain.users.ApplicationUser.class, "ApplicationUser");

	/** {@inheritDoc} */
	@Override
	public URI<UserAuthentification> getURI() {
		return DtObjectUtil.createURI(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'AUTH_ID'.
	 * @return Long authId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_ID", type = "ID", required = true, label = "AUTH_ID")
	public Long getAuthId() {
		return authId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'AUTH_ID'.
	 * @param authId Long <b>Obligatoire</b>
	 */
	public void setAuthId(final Long authId) {
		this.authId = authId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Login'.
	 * @return String login
	 */
	@Field(domain = "DO_LABEL_SHORT", label = "Login")
	public String getLogin() {
		return login;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Login'.
	 * @param login String
	 */
	public void setLogin(final String login) {
		this.login = login;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Password'.
	 * @return String password
	 */
	@Field(domain = "DO_PASSWORD", label = "Password")
	public String getPassword() {
		return password;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Password'.
	 * @param password String
	 */
	public void setPassword(final String password) {
		this.password = password;
	}
	
	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Application user'.
	 * @return Long usrId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_ID", type = "FOREIGN_KEY", required = true, label = "Application user")
	public Long getUsrId() {
		return (Long)  usrIdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Application user'.
	 * @param usrId Long <b>Obligatoire</b>
	 */
	public void setUsrId(final Long usrId) {
		usrIdAccessor.setId(usrId);
	}

 	/**
	 * Association : Application user.
	 * @return l'accesseur vers la propriété 'Application user'
	 */
	public VAccessor<lollipop.domain.users.ApplicationUser> applicationUser() {
		return usrIdAccessor;
	}
	
	@Deprecated
	public lollipop.domain.users.ApplicationUser getApplicationUser() {
		// we keep the lazyness
		if (!usrIdAccessor.isLoaded()) {
			usrIdAccessor.load();
		}
		return usrIdAccessor.get();
	}

	/**
	 * Retourne l'URI: Application user.
	 * @return URI de l'association
	 */
	@Deprecated
	public io.vertigo.dynamo.domain.model.URI<lollipop.domain.users.ApplicationUser> getApplicationUserURI() {
		return usrIdAccessor.getURI();
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}