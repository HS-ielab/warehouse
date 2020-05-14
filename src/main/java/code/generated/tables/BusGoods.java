/*
 * This file is generated by jOOQ.
 */
package code.generated.tables;


import code.generated.Indexes;
import code.generated.Keys;
import code.generated.Warehouse;
import code.generated.tables.records.BusGoodsRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
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
public class BusGoods extends TableImpl<BusGoodsRecord> {

    private static final long serialVersionUID = -69064412;

    /**
     * The reference instance of <code>warehouse.bus_goods</code>
     */
    public static final BusGoods BUS_GOODS = new BusGoods();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BusGoodsRecord> getRecordType() {
        return BusGoodsRecord.class;
    }

    /**
     * The column <code>warehouse.bus_goods.id</code>.
     */
    public final TableField<BusGoodsRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>warehouse.bus_goods.goodsname</code>.
     */
    public final TableField<BusGoodsRecord, String> GOODSNAME = createField(DSL.name("goodsname"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>warehouse.bus_goods.providerid</code>.
     */
    public final TableField<BusGoodsRecord, Integer> PROVIDERID = createField(DSL.name("providerid"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>warehouse.bus_goods.produceplace</code>.
     */
    public final TableField<BusGoodsRecord, String> PRODUCEPLACE = createField(DSL.name("produceplace"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>warehouse.bus_goods.size</code>.
     */
    public final TableField<BusGoodsRecord, String> SIZE = createField(DSL.name("size"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>warehouse.bus_goods.goodspackage</code>.
     */
    public final TableField<BusGoodsRecord, String> GOODSPACKAGE = createField(DSL.name("goodspackage"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>warehouse.bus_goods.productcode</code>.
     */
    public final TableField<BusGoodsRecord, String> PRODUCTCODE = createField(DSL.name("productcode"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>warehouse.bus_goods.promitcode</code>.
     */
    public final TableField<BusGoodsRecord, String> PROMITCODE = createField(DSL.name("promitcode"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>warehouse.bus_goods.description</code>.
     */
    public final TableField<BusGoodsRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>warehouse.bus_goods.price</code>.
     */
    public final TableField<BusGoodsRecord, Double> PRICE = createField(DSL.name("price"), org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>warehouse.bus_goods.number</code>.
     */
    public final TableField<BusGoodsRecord, Integer> NUMBER = createField(DSL.name("number"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>warehouse.bus_goods.dangernum</code>.
     */
    public final TableField<BusGoodsRecord, Integer> DANGERNUM = createField(DSL.name("dangernum"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>warehouse.bus_goods.goodsimg</code>.
     */
    public final TableField<BusGoodsRecord, String> GOODSIMG = createField(DSL.name("goodsimg"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>warehouse.bus_goods.available</code>.
     */
    public final TableField<BusGoodsRecord, Integer> AVAILABLE = createField(DSL.name("available"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>warehouse.bus_goods</code> table reference
     */
    public BusGoods() {
        this(DSL.name("bus_goods"), null);
    }

    /**
     * Create an aliased <code>warehouse.bus_goods</code> table reference
     */
    public BusGoods(String alias) {
        this(DSL.name(alias), BUS_GOODS);
    }

    /**
     * Create an aliased <code>warehouse.bus_goods</code> table reference
     */
    public BusGoods(Name alias) {
        this(alias, BUS_GOODS);
    }

    private BusGoods(Name alias, Table<BusGoodsRecord> aliased) {
        this(alias, aliased, null);
    }

    private BusGoods(Name alias, Table<BusGoodsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> BusGoods(Table<O> child, ForeignKey<O, BusGoodsRecord> key) {
        super(child, key, BUS_GOODS);
    }

    @Override
    public Schema getSchema() {
        return Warehouse.WAREHOUSE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BUS_GOODS_FK_SQ0BTR2V2LQ8GT8B4GB8TLK0I);
    }

    @Override
    public Identity<BusGoodsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BUS_GOODS;
    }

    @Override
    public UniqueKey<BusGoodsRecord> getPrimaryKey() {
        return Keys.KEY_BUS_GOODS_PRIMARY;
    }

    @Override
    public List<UniqueKey<BusGoodsRecord>> getKeys() {
        return Arrays.<UniqueKey<BusGoodsRecord>>asList(Keys.KEY_BUS_GOODS_PRIMARY);
    }

    @Override
    public List<ForeignKey<BusGoodsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BusGoodsRecord, ?>>asList(Keys.BUS_GOODS_IBFK_1);
    }

    public BusProvider busProvider() {
        return new BusProvider(this, Keys.BUS_GOODS_IBFK_1);
    }

    @Override
    public BusGoods as(String alias) {
        return new BusGoods(DSL.name(alias), this);
    }

    @Override
    public BusGoods as(Name alias) {
        return new BusGoods(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BusGoods rename(String name) {
        return new BusGoods(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BusGoods rename(Name name) {
        return new BusGoods(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, String, Integer, String, String, String, String, String, String, Double, Integer, Integer, String, Integer> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
