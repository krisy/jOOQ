/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class F_ARRAYS4 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY> implements java.lang.Cloneable {

	private static final long serialVersionUID = -311404182;

	/**
	 * The parameter <code>F_ARRAYS4.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY.class));

	/**
	 * The parameter <code>F_ARRAYS4.IN_ARRAY</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY> IN_ARRAY = createParameter("IN_ARRAY", org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY.class));

	/**
	 * Create a new routine call instance
	 */
	public F_ARRAYS4() {
		super("F_ARRAYS4", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter IN value to the routine
	 */
	public void setIN_ARRAY(org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY value) {
		setValue(org.jooq.test.oracle3.generatedclasses.routines.F_ARRAYS4.IN_ARRAY, value);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setIN_ARRAY(org.jooq.Field<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY> field) {
		setField(IN_ARRAY, field);
	}
}
