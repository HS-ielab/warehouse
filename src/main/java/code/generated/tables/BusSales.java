/*
 * This file is generated by jOOQ.
 */
package code.generated.tables;


import code.generated.Keys;
import code.generated.Warehouse;
import code.generated.tables.records.BusSalesRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusSales extends TableImpl<BusSalesRecord> {

    private static final long serialVersionUID = 1631332197;

    /**
     * The reference instance of <code>warehouse.bus_sales</code>
     */
    public static final BusSales BUS_SALES = new BusSales();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BusSalesRecord> getRecordType() {
        return BusSalesRecord.class;
    }

    /**
     * The column <code>warehouse.bus_sales.id</code>.
     */
    public final TableField<BusSalesRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>warehouse.bus_sales.customerid</code>.
     */
    public final TableField<BusSalesRecord, Integer> CUSTOMERID = createField(DSL.name("customerid"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>warehouse.bus_sales.paytype</code>.
     */
    public final TableField<BusSalesRecord, String> PAYTYPE = createField(DSL.name("paytype"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>warehouse.bus_sales.salestime</code>.
     */
    public final TableField<BusSalesRecord, LocalDateTime> SALESTIME = createField(DSL.name("salestime"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>warehouse.bus_sales.operateperson</code>.
     */
    public final TableField<BusSalesRecord, String> OPERATEPERSON = createField(DSL.name("operateperson"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>warehouse.bus_sales.number</code>.
     */
    public final TableField<BusSalesRecord, Integer> NUMBER = createField(DSL.name("number"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>warehouse.bus_sales.remark</code>.
     */
    public final TableField<BusSalesRecord, String> REMARK = createField(DSL.name("remark"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>warehouse.bus_sales.saleprice</code>.
     */
    public final TableField<BusSalesRecord, BigDecimal> SALEPRICE = createField(DSL.name("saleprice"), org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "");

    /**
     * The column <code>warehouse.bus_sales.goodsid</code>.
     */
    public final TableField<BusSalesRecord, Integer> GOODSID = createField(DSL.name("goodsid"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>warehouse.bus_sales</code> table reference
     */
    public BusSales() {
        this(DSL.name("bus_sales"), null);
    }

    /**
     * Create an aliased <code>warehouse.bus_sales</code> table reference
     */
    public BusSales(String alias) {
        this(DSL.name(alias), BUS_SALES);
    }

    /**
     * Create an aliased <code>warehouse.bus_sales</code> table reference
     */
    public BusSales(Name alias) {
        this(alias, BUS_SALES);
    }

    private BusSales(Name alias, Table<BusSalesRecord> aliased) {
        this(alias, aliased, null);
    }

    private BusSales(Name alias, Table<BusSalesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> BusSales(Table<O> child, ForeignKey<O, BusSalesRecord> key) {
        super(child, key, BUS_SALES);
    }

    @Override
    public Schema getSchema() {
        return Warehouse.WAREHOUSE;
    }

    @Override
    public Identity<BusSalesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BUS_SALES;
    }

    @Override
    public UniqueKey<BusSalesRecord> getPrimaryKey() {
        return Keys.KEY_BUS_SALES_PRIMARY;
    }

    @Override
    public List<UniqueKey<BusSalesRecord>> getKeys() {
        return Arrays.<UniqueKey<BusSalesRecord>>asList(Keys.KEY_BUS_SALES_PRIMARY);
    }

    @Override
    public BusSales as(String alias) {
        return new BusSales(DSL.name(alias), this);
    }

    @Override
    public BusSales as(Name alias) {
        return new BusSales(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BusSales rename(String name) {
        return new BusSales(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BusSales rename(Name name) {
        return new BusSales(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Integer, String, LocalDateTime, String, Integer, String, BigDecimal, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
