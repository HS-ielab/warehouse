/*
 * This file is generated by jOOQ.
 */
package code.generated.tables.records;


import code.generated.tables.BusOutport;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusOutportRecord extends UpdatableRecordImpl<BusOutportRecord> implements Record9<Integer, Integer, String, LocalDateTime, String, Double, Integer, String, Integer> {

    private static final long serialVersionUID = 2059138964;

    /**
     * Setter for <code>warehouse.bus_outport.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>warehouse.bus_outport.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>warehouse.bus_outport.providerid</code>.
     */
    public void setProviderid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>warehouse.bus_outport.providerid</code>.
     */
    public Integer getProviderid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>warehouse.bus_outport.paytype</code>.
     */
    public void setPaytype(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>warehouse.bus_outport.paytype</code>.
     */
    public String getPaytype() {
        return (String) get(2);
    }

    /**
     * Setter for <code>warehouse.bus_outport.outputtime</code>.
     */
    public void setOutputtime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>warehouse.bus_outport.outputtime</code>.
     */
    public LocalDateTime getOutputtime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>warehouse.bus_outport.operateperson</code>.
     */
    public void setOperateperson(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>warehouse.bus_outport.operateperson</code>.
     */
    public String getOperateperson() {
        return (String) get(4);
    }

    /**
     * Setter for <code>warehouse.bus_outport.outportprice</code>.
     */
    public void setOutportprice(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>warehouse.bus_outport.outportprice</code>.
     */
    public Double getOutportprice() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>warehouse.bus_outport.number</code>.
     */
    public void setNumber(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>warehouse.bus_outport.number</code>.
     */
    public Integer getNumber() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>warehouse.bus_outport.remark</code>.
     */
    public void setRemark(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>warehouse.bus_outport.remark</code>.
     */
    public String getRemark() {
        return (String) get(7);
    }

    /**
     * Setter for <code>warehouse.bus_outport.goodsid</code>.
     */
    public void setGoodsid(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>warehouse.bus_outport.goodsid</code>.
     */
    public Integer getGoodsid() {
        return (Integer) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Integer, String, LocalDateTime, String, Double, Integer, String, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, Integer, String, LocalDateTime, String, Double, Integer, String, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return BusOutport.BUS_OUTPORT.ID;
    }

    @Override
    public Field<Integer> field2() {
        return BusOutport.BUS_OUTPORT.PROVIDERID;
    }

    @Override
    public Field<String> field3() {
        return BusOutport.BUS_OUTPORT.PAYTYPE;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return BusOutport.BUS_OUTPORT.OUTPUTTIME;
    }

    @Override
    public Field<String> field5() {
        return BusOutport.BUS_OUTPORT.OPERATEPERSON;
    }

    @Override
    public Field<Double> field6() {
        return BusOutport.BUS_OUTPORT.OUTPORTPRICE;
    }

    @Override
    public Field<Integer> field7() {
        return BusOutport.BUS_OUTPORT.NUMBER;
    }

    @Override
    public Field<String> field8() {
        return BusOutport.BUS_OUTPORT.REMARK;
    }

    @Override
    public Field<Integer> field9() {
        return BusOutport.BUS_OUTPORT.GOODSID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getProviderid();
    }

    @Override
    public String component3() {
        return getPaytype();
    }

    @Override
    public LocalDateTime component4() {
        return getOutputtime();
    }

    @Override
    public String component5() {
        return getOperateperson();
    }

    @Override
    public Double component6() {
        return getOutportprice();
    }

    @Override
    public Integer component7() {
        return getNumber();
    }

    @Override
    public String component8() {
        return getRemark();
    }

    @Override
    public Integer component9() {
        return getGoodsid();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getProviderid();
    }

    @Override
    public String value3() {
        return getPaytype();
    }

    @Override
    public LocalDateTime value4() {
        return getOutputtime();
    }

    @Override
    public String value5() {
        return getOperateperson();
    }

    @Override
    public Double value6() {
        return getOutportprice();
    }

    @Override
    public Integer value7() {
        return getNumber();
    }

    @Override
    public String value8() {
        return getRemark();
    }

    @Override
    public Integer value9() {
        return getGoodsid();
    }

    @Override
    public BusOutportRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public BusOutportRecord value2(Integer value) {
        setProviderid(value);
        return this;
    }

    @Override
    public BusOutportRecord value3(String value) {
        setPaytype(value);
        return this;
    }

    @Override
    public BusOutportRecord value4(LocalDateTime value) {
        setOutputtime(value);
        return this;
    }

    @Override
    public BusOutportRecord value5(String value) {
        setOperateperson(value);
        return this;
    }

    @Override
    public BusOutportRecord value6(Double value) {
        setOutportprice(value);
        return this;
    }

    @Override
    public BusOutportRecord value7(Integer value) {
        setNumber(value);
        return this;
    }

    @Override
    public BusOutportRecord value8(String value) {
        setRemark(value);
        return this;
    }

    @Override
    public BusOutportRecord value9(Integer value) {
        setGoodsid(value);
        return this;
    }

    @Override
    public BusOutportRecord values(Integer value1, Integer value2, String value3, LocalDateTime value4, String value5, Double value6, Integer value7, String value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BusOutportRecord
     */
    public BusOutportRecord() {
        super(BusOutport.BUS_OUTPORT);
    }

    /**
     * Create a detached, initialised BusOutportRecord
     */
    public BusOutportRecord(Integer id, Integer providerid, String paytype, LocalDateTime outputtime, String operateperson, Double outportprice, Integer number, String remark, Integer goodsid) {
        super(BusOutport.BUS_OUTPORT);

        set(0, id);
        set(1, providerid);
        set(2, paytype);
        set(3, outputtime);
        set(4, operateperson);
        set(5, outportprice);
        set(6, number);
        set(7, remark);
        set(8, goodsid);
    }
}
