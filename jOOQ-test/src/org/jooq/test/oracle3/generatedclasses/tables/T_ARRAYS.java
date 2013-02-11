/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_ARRAYS extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_ARRAYS> implements java.lang.Cloneable {

	private static final long serialVersionUID = -835315975;

	/**
	 * The singleton instance of <code>T_ARRAYS</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS T_ARRAYS = new org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_ARRAYS> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.T_ARRAYS.class;
	}

	/**
	 * The column <code>T_ARRAYS.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_ARRAYS, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>T_ARRAYS.STRING_ARRAY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_ARRAYS, org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_ARRAY> STRING_ARRAY = createField("STRING_ARRAY", org.jooq.impl.SQLDataType.VARCHAR.length(20).asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_ARRAY.class), this);

	/**
	 * The column <code>T_ARRAYS.NUMBER_ARRAY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_ARRAYS, org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY> NUMBER_ARRAY = createField("NUMBER_ARRAY", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY.class), this);

	/**
	 * The column <code>T_ARRAYS.NUMBER_LONG_ARRAY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_ARRAYS, org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY> NUMBER_LONG_ARRAY = createField("NUMBER_LONG_ARRAY", org.jooq.impl.SQLDataType.BIGINT.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY.class), this);

	/**
	 * The column <code>T_ARRAYS.DATE_ARRAY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_ARRAYS, org.jooq.test.oracle3.generatedclasses.udt.records.U_DATE_ARRAY> DATE_ARRAY = createField("DATE_ARRAY", org.jooq.impl.SQLDataType.DATE.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_DATE_ARRAY.class), this);

	/**
	 * Create a <code>T_ARRAYS</code> table reference
	 */
	public T_ARRAYS() {
		super("T_ARRAYS", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>T_ARRAYS</code> table reference
	 */
	public T_ARRAYS(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_ARRAYS> getMainKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_T_ARRAYS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_ARRAYS>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_ARRAYS>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_ARRAYS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS(alias);
	}
}
