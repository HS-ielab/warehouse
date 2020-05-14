/*
 * This file is generated by jOOQ.
 */
package code.generated.tables;


import code.generated.Keys;
import code.generated.Warehouse;
import code.generated.tables.records.SysUserRoleRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class SysUserRole extends TableImpl<SysUserRoleRecord> {

    private static final long serialVersionUID = 1116937053;

    /**
     * The reference instance of <code>warehouse.sys_user_role</code>
     */
    public static final SysUserRole SYS_USER_ROLE = new SysUserRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysUserRoleRecord> getRecordType() {
        return SysUserRoleRecord.class;
    }

    /**
     * The column <code>warehouse.sys_user_role.uid</code>.
     */
    public final TableField<SysUserRoleRecord, Integer> UID = createField(DSL.name("uid"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>warehouse.sys_user_role.rid</code>.
     */
    public final TableField<SysUserRoleRecord, Integer> RID = createField(DSL.name("rid"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>warehouse.sys_user_role</code> table reference
     */
    public SysUserRole() {
        this(DSL.name("sys_user_role"), null);
    }

    /**
     * Create an aliased <code>warehouse.sys_user_role</code> table reference
     */
    public SysUserRole(String alias) {
        this(DSL.name(alias), SYS_USER_ROLE);
    }

    /**
     * Create an aliased <code>warehouse.sys_user_role</code> table reference
     */
    public SysUserRole(Name alias) {
        this(alias, SYS_USER_ROLE);
    }

    private SysUserRole(Name alias, Table<SysUserRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysUserRole(Name alias, Table<SysUserRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> SysUserRole(Table<O> child, ForeignKey<O, SysUserRoleRecord> key) {
        super(child, key, SYS_USER_ROLE);
    }

    @Override
    public Schema getSchema() {
        return Warehouse.WAREHOUSE;
    }

    @Override
    public UniqueKey<SysUserRoleRecord> getPrimaryKey() {
        return Keys.KEY_SYS_USER_ROLE_PRIMARY;
    }

    @Override
    public List<UniqueKey<SysUserRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<SysUserRoleRecord>>asList(Keys.KEY_SYS_USER_ROLE_PRIMARY);
    }

    @Override
    public List<ForeignKey<SysUserRoleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SysUserRoleRecord, ?>>asList(Keys.FK_SYS_USER_ROLE_2, Keys.FK_SYS_USER_ROLE_1);
    }

    public SysUser sysUser() {
        return new SysUser(this, Keys.FK_SYS_USER_ROLE_2);
    }

    public SysRole sysRole() {
        return new SysRole(this, Keys.FK_SYS_USER_ROLE_1);
    }

    @Override
    public SysUserRole as(String alias) {
        return new SysUserRole(DSL.name(alias), this);
    }

    @Override
    public SysUserRole as(Name alias) {
        return new SysUserRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysUserRole rename(String name) {
        return new SysUserRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysUserRole rename(Name name) {
        return new SysUserRole(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}