package com.wh.data;

import com.wh.bus.entity.Customer;
import org.jooq.DSLContext;
import org.jooq.Record;

import javax.annotation.Resource;
import javax.inject.Named;
import java.util.List;

import static code.generated.Tables.BUS_CUSTOMER;

@Named("baseDao")
public class BaseDaoJooQ {

    @Resource
    protected DSLContext dsl;

    private Customer recordToEntity(Record record) {
        if (record == null) {
            return null;
        }
        Customer entity = new Customer();
        entity.setAccount(record.get(BUS_CUSTOMER.ACCOUNT));
        entity.setAddress(record.get(BUS_CUSTOMER.ADDRESS));
        entity.setAvailable(record.get(BUS_CUSTOMER.AVAILABLE));
        entity.setBank(record.get(BUS_CUSTOMER.BANK));

        return entity;
    }

    public List<Customer> findAllCustomoers() {
        return dsl.select().from(BUS_CUSTOMER).fetch(this::recordToEntity);
    }
}
