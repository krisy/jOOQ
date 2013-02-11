/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class SECOND_MAX extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> implements java.lang.Cloneable {

	private static final long serialVersionUID = -903326613;

	/**
	 * The parameter <code>SECOND_MAX.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The parameter <code>SECOND_MAX.INPUT</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> INPUT = createParameter("INPUT", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public SECOND_MAX() {
		super("SECOND_MAX", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(INPUT);
	}

	/**
	 * Set the <code>INPUT</code> parameter IN value to the routine
	 */
	public void setINPUT(java.lang.Number value) {
		setNumber(org.jooq.test.oracle3.generatedclasses.routines.SECOND_MAX.INPUT, value);
	}

	/**
	 * Set the <code>INPUT</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setINPUT(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(INPUT, field);
	}
}
