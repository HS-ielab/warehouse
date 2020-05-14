/*
 * This file is generated by jOOQ.
 */
package code.generated.tables.records;


import code.generated.tables.BusGoods;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusGoodsRecord extends UpdatableRecordImpl<BusGoodsRecord> implements Record14<Integer, String, Integer, String, String, String, String, String, String, Double, Integer, Integer, String, Integer> {

    private static final long serialVersionUID = 582821243;

    /**
     * Setter for <code>warehouse.bus_goods.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>warehouse.bus_goods.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>warehouse.bus_goods.goodsname</code>.
     */
    public void setGoodsname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>warehouse.bus_goods.goodsname</code>.
     */
    public String getGoodsname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>warehouse.bus_goods.providerid</code>.
     */
    public void setProviderid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>warehouse.bus_goods.providerid</code>.
     */
    public Integer getProviderid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>warehouse.bus_goods.produceplace</code>.
     */
    public void setProduceplace(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>warehouse.bus_goods.produceplace</code>.
     */
    public String getProduceplace() {
        return (String) get(3);
    }

    /**
     * Setter for <code>warehouse.bus_goods.size</code>.
     */
    public void setSize(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>warehouse.bus_goods.size</code>.
     */
    public String getSize() {
        return (String) get(4);
    }

    /**
     * Setter for <code>warehouse.bus_goods.goodspackage</code>.
     */
    public void setGoodspackage(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>warehouse.bus_goods.goodspackage</code>.
     */
    public String getGoodspackage() {
        return (String) get(5);
    }

    /**
     * Setter for <code>warehouse.bus_goods.productcode</code>.
     */
    public void setProductcode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>warehouse.bus_goods.productcode</code>.
     */
    public String getProductcode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>warehouse.bus_goods.promitcode</code>.
     */
    public void setPromitcode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>warehouse.bus_goods.promitcode</code>.
     */
    public String getPromitcode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>warehouse.bus_goods.description</code>.
     */
    public void setDescription(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>warehouse.bus_goods.description</code>.
     */
    public String getDescription() {
        return (String) get(8);
    }

    /**
     * Setter for <code>warehouse.bus_goods.price</code>.
     */
    public void setPrice(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>warehouse.bus_goods.price</code>.
     */
    public Double getPrice() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>warehouse.bus_goods.number</code>.
     */
    public void setNumber(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>warehouse.bus_goods.number</code>.
     */
    public Integer getNumber() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>warehouse.bus_goods.dangernum</code>.
     */
    public void setDangernum(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>warehouse.bus_goods.dangernum</code>.
     */
    public Integer getDangernum() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>warehouse.bus_goods.goodsimg</code>.
     */
    public void setGoodsimg(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>warehouse.bus_goods.goodsimg</code>.
     */
    public String getGoodsimg() {
        return (String) get(12);
    }

    /**
     * Setter for <code>warehouse.bus_goods.available</code>.
     */
    public void setAvailable(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>warehouse.bus_goods.available</code>.
     */
    public Integer getAvailable() {
        return (Integer) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, String, Integer, String, String, String, String, String, String, Double, Integer, Integer, String, Integer> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<Integer, String, Integer, String, String, String, String, String, String, Double, Integer, Integer, String, Integer> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return BusGoods.BUS_GOODS.ID;
    }

    @Override
    public Field<String> field2() {
        return BusGoods.BUS_GOODS.GOODSNAME;
    }

    @Override
    public Field<Integer> field3() {
        return BusGoods.BUS_GOODS.PROVIDERID;
    }

    @Override
    public Field<String> field4() {
        return BusGoods.BUS_GOODS.PRODUCEPLACE;
    }

    @Override
    public Field<String> field5() {
        return BusGoods.BUS_GOODS.SIZE;
    }

    @Override
    public Field<String> field6() {
        return BusGoods.BUS_GOODS.GOODSPACKAGE;
    }

    @Override
    public Field<String> field7() {
        return BusGoods.BUS_GOODS.PRODUCTCODE;
    }

    @Override
    public Field<String> field8() {
        return BusGoods.BUS_GOODS.PROMITCODE;
    }

    @Override
    public Field<String> field9() {
        return BusGoods.BUS_GOODS.DESCRIPTION;
    }

    @Override
    public Field<Double> field10() {
        return BusGoods.BUS_GOODS.PRICE;
    }

    @Override
    public Field<Integer> field11() {
        return BusGoods.BUS_GOODS.NUMBER;
    }

    @Override
    public Field<Integer> field12() {
        return BusGoods.BUS_GOODS.DANGERNUM;
    }

    @Override
    public Field<String> field13() {
        return BusGoods.BUS_GOODS.GOODSIMG;
    }

    @Override
    public Field<Integer> field14() {
        return BusGoods.BUS_GOODS.AVAILABLE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getGoodsname();
    }

    @Override
    public Integer component3() {
        return getProviderid();
    }

    @Override
    public String component4() {
        return getProduceplace();
    }

    @Override
    public String component5() {
        return getSize();
    }

    @Override
    public String component6() {
        return getGoodspackage();
    }

    @Override
    public String component7() {
        return getProductcode();
    }

    @Override
    public String component8() {
        return getPromitcode();
    }

    @Override
    public String component9() {
        return getDescription();
    }

    @Override
    public Double component10() {
        return getPrice();
    }

    @Override
    public Integer component11() {
        return getNumber();
    }

    @Override
    public Integer component12() {
        return getDangernum();
    }

    @Override
    public String component13() {
        return getGoodsimg();
    }

    @Override
    public Integer component14() {
        return getAvailable();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getGoodsname();
    }

    @Override
    public Integer value3() {
        return getProviderid();
    }

    @Override
    public String value4() {
        return getProduceplace();
    }

    @Override
    public String value5() {
        return getSize();
    }

    @Override
    public String value6() {
        return getGoodspackage();
    }

    @Override
    public String value7() {
        return getProductcode();
    }

    @Override
    public String value8() {
        return getPromitcode();
    }

    @Override
    public String value9() {
        return getDescription();
    }

    @Override
    public Double value10() {
        return getPrice();
    }

    @Override
    public Integer value11() {
        return getNumber();
    }

    @Override
    public Integer value12() {
        return getDangernum();
    }

    @Override
    public String value13() {
        return getGoodsimg();
    }

    @Override
    public Integer value14() {
        return getAvailable();
    }

    @Override
    public BusGoodsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public BusGoodsRecord value2(String value) {
        setGoodsname(value);
        return this;
    }

    @Override
    public BusGoodsRecord value3(Integer value) {
        setProviderid(value);
        return this;
    }

    @Override
    public BusGoodsRecord value4(String value) {
        setProduceplace(value);
        return this;
    }

    @Override
    public BusGoodsRecord value5(String value) {
        setSize(value);
        return this;
    }

    @Override
    public BusGoodsRecord value6(String value) {
        setGoodspackage(value);
        return this;
    }

    @Override
    public BusGoodsRecord value7(String value) {
        setProductcode(value);
        return this;
    }

    @Override
    public BusGoodsRecord value8(String value) {
        setPromitcode(value);
        return this;
    }

    @Override
    public BusGoodsRecord value9(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public BusGoodsRecord value10(Double value) {
        setPrice(value);
        return this;
    }

    @Override
    public BusGoodsRecord value11(Integer value) {
        setNumber(value);
        return this;
    }

    @Override
    public BusGoodsRecord value12(Integer value) {
        setDangernum(value);
        return this;
    }

    @Override
    public BusGoodsRecord value13(String value) {
        setGoodsimg(value);
        return this;
    }

    @Override
    public BusGoodsRecord value14(Integer value) {
        setAvailable(value);
        return this;
    }

    @Override
    public BusGoodsRecord values(Integer value1, String value2, Integer value3, String value4, String value5, String value6, String value7, String value8, String value9, Double value10, Integer value11, Integer value12, String value13, Integer value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BusGoodsRecord
     */
    public BusGoodsRecord() {
        super(BusGoods.BUS_GOODS);
    }

    /**
     * Create a detached, initialised BusGoodsRecord
     */
    public BusGoodsRecord(Integer id, String goodsname, Integer providerid, String produceplace, String size, String goodspackage, String productcode, String promitcode, String description, Double price, Integer number, Integer dangernum, String goodsimg, Integer available) {
        super(BusGoods.BUS_GOODS);

        set(0, id);
        set(1, goodsname);
        set(2, providerid);
        set(3, produceplace);
        set(4, size);
        set(5, goodspackage);
        set(6, productcode);
        set(7, promitcode);
        set(8, description);
        set(9, price);
        set(10, number);
        set(11, dangernum);
        set(12, goodsimg);
        set(13, available);
    }
}