/*
 * This file is generated by jOOQ.
 */
package code.generated.tables.records;


import code.generated.tables.SysLoginfo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysLoginfoRecord extends UpdatableRecordImpl<SysLoginfoRecord> implements Record4<Integer, String, String, LocalDateTime> {

    private static final long serialVersionUID = -1538867545;

    /**
     * Setter for <code>warehouse.sys_loginfo.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>warehouse.sys_loginfo.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>warehouse.sys_loginfo.loginname</code>.
     */
    public void setLoginname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>warehouse.sys_loginfo.loginname</code>.
     */
    public String getLoginname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>warehouse.sys_loginfo.loginip</code>.
     */
    public void setLoginip(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>warehouse.sys_loginfo.loginip</code>.
     */
    public String getLoginip() {
        return (String) get(2);
    }

    /**
     * Setter for <code>warehouse.sys_loginfo.logintime</code>.
     */
    public void setLogintime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>warehouse.sys_loginfo.logintime</code>.
     */
    public LocalDateTime getLogintime() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return SysLoginfo.SYS_LOGINFO.ID;
    }

    @Override
    public Field<String> field2() {
        return SysLoginfo.SYS_LOGINFO.LOGINNAME;
    }

    @Override
    public Field<String> field3() {
        return SysLoginfo.SYS_LOGINFO.LOGINIP;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return SysLoginfo.SYS_LOGINFO.LOGINTIME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getLoginname();
    }

    @Override
    public String component3() {
        return getLoginip();
    }

    @Override
    public LocalDateTime component4() {
        return getLogintime();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getLoginname();
    }

    @Override
    public String value3() {
        return getLoginip();
    }

    @Override
    public LocalDateTime value4() {
        return getLogintime();
    }

    @Override
    public SysLoginfoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public SysLoginfoRecord value2(String value) {
        setLoginname(value);
        return this;
    }

    @Override
    public SysLoginfoRecord value3(String value) {
        setLoginip(value);
        return this;
    }

    @Override
    public SysLoginfoRecord value4(LocalDateTime value) {
        setLogintime(value);
        return this;
    }

    @Override
    public SysLoginfoRecord values(Integer value1, String value2, String value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysLoginfoRecord
     */
    public SysLoginfoRecord() {
        super(SysLoginfo.SYS_LOGINFO);
    }

    /**
     * Create a detached, initialised SysLoginfoRecord
     */
    public SysLoginfoRecord(Integer id, String loginname, String loginip, LocalDateTime logintime) {
        super(SysLoginfo.SYS_LOGINFO);

        set(0, id);
        set(1, loginname);
        set(2, loginip);
        set(3, logintime);
    }
}
