/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_785")
public class T_785_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_785_INTERFACE {

	private static final long serialVersionUID = -1090265306;

	private java.lang.Integer ID;
	private java.lang.String  NAME;
	private java.lang.String  VALUE;

	@javax.persistence.Column(name = "ID", precision = 7)
	@Override
	public java.lang.Integer getID() {
		return this.ID;
	}

	@Override
	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	@javax.persistence.Column(name = "NAME", length = 50)
	@Override
	public java.lang.String getNAME() {
		return this.NAME;
	}

	@Override
	public void setNAME(java.lang.String NAME) {
		this.NAME = NAME;
	}

	@javax.persistence.Column(name = "VALUE", length = 50)
	@Override
	public java.lang.String getVALUE() {
		return this.VALUE;
	}

	@Override
	public void setVALUE(java.lang.String VALUE) {
		this.VALUE = VALUE;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_785_INTERFACE from) {
		setID(from.getID());
		setNAME(from.getNAME());
		setVALUE(from.getVALUE());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_785_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}
}
