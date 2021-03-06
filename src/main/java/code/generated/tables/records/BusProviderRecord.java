/*
 * This file is generated by jOOQ.
 */
package code.generated.tables.records;


import code.generated.tables.BusProvider;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusProviderRecord extends UpdatableRecordImpl<BusProviderRecord> implements Record12<Integer, String, String, String, String, String, String, String, String, String, String, Integer> {

    private static final long serialVersionUID = 833100355;

    /**
     * Setter for <code>warehouse.bus_provider.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>warehouse.bus_provider.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>warehouse.bus_provider.providername</code>.
     */
    public void setProvidername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>warehouse.bus_provider.providername</code>.
     */
    public String getProvidername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>warehouse.bus_provider.zip</code>.
     */
    public void setZip(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>warehouse.bus_provider.zip</code>.
     */
    public String getZip() {
        return (String) get(2);
    }

    /**
     * Setter for <code>warehouse.bus_provider.address</code>.
     */
    public void setAddress(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>warehouse.bus_provider.address</code>.
     */
    public String getAddress() {
        return (String) get(3);
    }

    /**
     * Setter for <code>warehouse.bus_provider.telephone</code>.
     */
    public void setTelephone(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>warehouse.bus_provider.telephone</code>.
     */
    public String getTelephone() {
        return (String) get(4);
    }

    /**
     * Setter for <code>warehouse.bus_provider.connectionperson</code>.
     */
    public void setConnectionperson(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>warehouse.bus_provider.connectionperson</code>.
     */
    public String getConnectionperson() {
        return (String) get(5);
    }

    /**
     * Setter for <code>warehouse.bus_provider.phone</code>.
     */
    public void setPhone(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>warehouse.bus_provider.phone</code>.
     */
    public String getPhone() {
        return (String) get(6);
    }

    /**
     * Setter for <code>warehouse.bus_provider.bank</code>.
     */
    public void setBank(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>warehouse.bus_provider.bank</code>.
     */
    public String getBank() {
        return (String) get(7);
    }

    /**
     * Setter for <code>warehouse.bus_provider.account</code>.
     */
    public void setAccount(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>warehouse.bus_provider.account</code>.
     */
    public String getAccount() {
        return (String) get(8);
    }

    /**
     * Setter for <code>warehouse.bus_provider.email</code>.
     */
    public void setEmail(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>warehouse.bus_provider.email</code>.
     */
    public String getEmail() {
        return (String) get(9);
    }

    /**
     * Setter for <code>warehouse.bus_provider.fax</code>.
     */
    public void setFax(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>warehouse.bus_provider.fax</code>.
     */
    public String getFax() {
        return (String) get(10);
    }

    /**
     * Setter for <code>warehouse.bus_provider.available</code>.
     */
    public void setAvailable(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>warehouse.bus_provider.available</code>.
     */
    public Integer getAvailable() {
        return (Integer) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, String, String, String, String, String, String, String, String, String, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Integer, String, String, String, String, String, String, String, String, String, String, Integer> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return BusProvider.BUS_PROVIDER.ID;
    }

    @Override
    public Field<String> field2() {
        return BusProvider.BUS_PROVIDER.PROVIDERNAME;
    }

    @Override
    public Field<String> field3() {
        return BusProvider.BUS_PROVIDER.ZIP;
    }

    @Override
    public Field<String> field4() {
        return BusProvider.BUS_PROVIDER.ADDRESS;
    }

    @Override
    public Field<String> field5() {
        return BusProvider.BUS_PROVIDER.TELEPHONE;
    }

    @Override
    public Field<String> field6() {
        return BusProvider.BUS_PROVIDER.CONNECTIONPERSON;
    }

    @Override
    public Field<String> field7() {
        return BusProvider.BUS_PROVIDER.PHONE;
    }

    @Override
    public Field<String> field8() {
        return BusProvider.BUS_PROVIDER.BANK;
    }

    @Override
    public Field<String> field9() {
        return BusProvider.BUS_PROVIDER.ACCOUNT;
    }

    @Override
    public Field<String> field10() {
        return BusProvider.BUS_PROVIDER.EMAIL;
    }

    @Override
    public Field<String> field11() {
        return BusProvider.BUS_PROVIDER.FAX;
    }

    @Override
    public Field<Integer> field12() {
        return BusProvider.BUS_PROVIDER.AVAILABLE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getProvidername();
    }

    @Override
    public String component3() {
        return getZip();
    }

    @Override
    public String component4() {
        return getAddress();
    }

    @Override
    public String component5() {
        return getTelephone();
    }

    @Override
    public String component6() {
        return getConnectionperson();
    }

    @Override
    public String component7() {
        return getPhone();
    }

    @Override
    public String component8() {
        return getBank();
    }

    @Override
    public String component9() {
        return getAccount();
    }

    @Override
    public String component10() {
        return getEmail();
    }

    @Override
    public String component11() {
        return getFax();
    }

    @Override
    public Integer component12() {
        return getAvailable();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getProvidername();
    }

    @Override
    public String value3() {
        return getZip();
    }

    @Override
    public String value4() {
        return getAddress();
    }

    @Override
    public String value5() {
        return getTelephone();
    }

    @Override
    public String value6() {
        return getConnectionperson();
    }

    @Override
    public String value7() {
        return getPhone();
    }

    @Override
    public String value8() {
        return getBank();
    }

    @Override
    public String value9() {
        return getAccount();
    }

    @Override
    public String value10() {
        return getEmail();
    }

    @Override
    public String value11() {
        return getFax();
    }

    @Override
    public Integer value12() {
        return getAvailable();
    }

    @Override
    public BusProviderRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public BusProviderRecord value2(String value) {
        setProvidername(value);
        return this;
    }

    @Override
    public BusProviderRecord value3(String value) {
        setZip(value);
        return this;
    }

    @Override
    public BusProviderRecord value4(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public BusProviderRecord value5(String value) {
        setTelephone(value);
        return this;
    }

    @Override
    public BusProviderRecord value6(String value) {
        setConnectionperson(value);
        return this;
    }

    @Override
    public BusProviderRecord value7(String value) {
        setPhone(value);
        return this;
    }

    @Override
    public BusProviderRecord value8(String value) {
        setBank(value);
        return this;
    }

    @Override
    public BusProviderRecord value9(String value) {
        setAccount(value);
        return this;
    }

    @Override
    public BusProviderRecord value10(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public BusProviderRecord value11(String value) {
        setFax(value);
        return this;
    }

    @Override
    public BusProviderRecord value12(Integer value) {
        setAvailable(value);
        return this;
    }

    @Override
    public BusProviderRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, Integer value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BusProviderRecord
     */
    public BusProviderRecord() {
        super(BusProvider.BUS_PROVIDER);
    }

    /**
     * Create a detached, initialised BusProviderRecord
     */
    public BusProviderRecord(Integer id, String providername, String zip, String address, String telephone, String connectionperson, String phone, String bank, String account, String email, String fax, Integer available) {
        super(BusProvider.BUS_PROVIDER);

        set(0, id);
        set(1, providername);
        set(2, zip);
        set(3, address);
        set(4, telephone);
        set(5, connectionperson);
        set(6, phone);
        set(7, bank);
        set(8, account);
        set(9, email);
        set(10, fax);
        set(11, available);
    }
}
