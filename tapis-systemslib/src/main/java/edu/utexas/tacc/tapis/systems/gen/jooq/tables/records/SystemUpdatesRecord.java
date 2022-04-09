/*
 * This file is generated by jOOQ.
 */
package edu.utexas.tacc.tapis.systems.gen.jooq.tables.records;


import com.google.gson.JsonElement;

import edu.utexas.tacc.tapis.systems.gen.jooq.tables.SystemUpdates;
import edu.utexas.tacc.tapis.systems.model.TSystem.SystemOperation;

import java.time.LocalDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SystemUpdatesRecord extends UpdatableRecordImpl<SystemUpdatesRecord> implements Record12<Integer, Integer, String, String, String, String, String, SystemOperation, JsonElement, String, UUID, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>tapis_sys.system_updates.seq_id</code>. System update request sequence id
     */
    public void setSeqId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>tapis_sys.system_updates.seq_id</code>. System update request sequence id
     */
    public Integer getSeqId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>tapis_sys.system_updates.system_seq_id</code>. Sequence id of system being updated
     */
    public void setSystemSeqId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>tapis_sys.system_updates.system_seq_id</code>. Sequence id of system being updated
     */
    public Integer getSystemSeqId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>tapis_sys.system_updates.obo_tenant</code>. OBO Tenant associated with the change request
     */
    public void setOboTenant(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>tapis_sys.system_updates.obo_tenant</code>. OBO Tenant associated with the change request
     */
    public String getOboTenant() {
        return (String) get(2);
    }

    /**
     * Setter for <code>tapis_sys.system_updates.obo_user</code>. OBO User associated with the change request
     */
    public void setOboUser(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>tapis_sys.system_updates.obo_user</code>. OBO User associated with the change request
     */
    public String getOboUser() {
        return (String) get(3);
    }

    /**
     * Setter for <code>tapis_sys.system_updates.jwt_tenant</code>. Tenant of user who requested the update
     */
    public void setJwtTenant(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>tapis_sys.system_updates.jwt_tenant</code>. Tenant of user who requested the update
     */
    public String getJwtTenant() {
        return (String) get(4);
    }

    /**
     * Setter for <code>tapis_sys.system_updates.jwt_user</code>. Name of user who requested the update
     */
    public void setJwtUser(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>tapis_sys.system_updates.jwt_user</code>. Name of user who requested the update
     */
    public String getJwtUser() {
        return (String) get(5);
    }

    /**
     * Setter for <code>tapis_sys.system_updates.system_id</code>. Id of system being updated
     */
    public void setSystemId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>tapis_sys.system_updates.system_id</code>. Id of system being updated
     */
    public String getSystemId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>tapis_sys.system_updates.operation</code>. Type of update operation
     */
    public void setOperation(SystemOperation value) {
        set(7, value);
    }

    /**
     * Getter for <code>tapis_sys.system_updates.operation</code>. Type of update operation
     */
    public SystemOperation getOperation() {
        return (SystemOperation) get(7);
    }

    /**
     * Setter for <code>tapis_sys.system_updates.description</code>. JSON describing the change. Secrets scrubbed as needed.
     */
    public void setDescription(JsonElement value) {
        set(8, value);
    }

    /**
     * Getter for <code>tapis_sys.system_updates.description</code>. JSON describing the change. Secrets scrubbed as needed.
     */
    public JsonElement getDescription() {
        return (JsonElement) get(8);
    }

    /**
     * Setter for <code>tapis_sys.system_updates.raw_data</code>. Raw data associated with the request, if available. Secrets scrubbed as needed.
     */
    public void setRawData(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>tapis_sys.system_updates.raw_data</code>. Raw data associated with the request, if available. Secrets scrubbed as needed.
     */
    public String getRawData() {
        return (String) get(9);
    }

    /**
     * Setter for <code>tapis_sys.system_updates.uuid</code>. UUID of system being updated
     */
    public void setUuid(UUID value) {
        set(10, value);
    }

    /**
     * Getter for <code>tapis_sys.system_updates.uuid</code>. UUID of system being updated
     */
    public UUID getUuid() {
        return (UUID) get(10);
    }

    /**
     * Setter for <code>tapis_sys.system_updates.created</code>. UTC time for when record was created
     */
    public void setCreated(LocalDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>tapis_sys.system_updates.created</code>. UTC time for when record was created
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(11);
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
    public Row12<Integer, Integer, String, String, String, String, String, SystemOperation, JsonElement, String, UUID, LocalDateTime> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Integer, Integer, String, String, String, String, String, SystemOperation, JsonElement, String, UUID, LocalDateTime> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return SystemUpdates.SYSTEM_UPDATES.SEQ_ID;
    }

    @Override
    public Field<Integer> field2() {
        return SystemUpdates.SYSTEM_UPDATES.SYSTEM_SEQ_ID;
    }

    @Override
    public Field<String> field3() {
        return SystemUpdates.SYSTEM_UPDATES.OBO_TENANT;
    }

    @Override
    public Field<String> field4() {
        return SystemUpdates.SYSTEM_UPDATES.OBO_USER;
    }

    @Override
    public Field<String> field5() {
        return SystemUpdates.SYSTEM_UPDATES.JWT_TENANT;
    }

    @Override
    public Field<String> field6() {
        return SystemUpdates.SYSTEM_UPDATES.JWT_USER;
    }

    @Override
    public Field<String> field7() {
        return SystemUpdates.SYSTEM_UPDATES.SYSTEM_ID;
    }

    @Override
    public Field<SystemOperation> field8() {
        return SystemUpdates.SYSTEM_UPDATES.OPERATION;
    }

    @Override
    public Field<JsonElement> field9() {
        return SystemUpdates.SYSTEM_UPDATES.DESCRIPTION;
    }

    @Override
    public Field<String> field10() {
        return SystemUpdates.SYSTEM_UPDATES.RAW_DATA;
    }

    @Override
    public Field<UUID> field11() {
        return SystemUpdates.SYSTEM_UPDATES.UUID;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return SystemUpdates.SYSTEM_UPDATES.CREATED;
    }

    @Override
    public Integer component1() {
        return getSeqId();
    }

    @Override
    public Integer component2() {
        return getSystemSeqId();
    }

    @Override
    public String component3() {
        return getOboTenant();
    }

    @Override
    public String component4() {
        return getOboUser();
    }

    @Override
    public String component5() {
        return getJwtTenant();
    }

    @Override
    public String component6() {
        return getJwtUser();
    }

    @Override
    public String component7() {
        return getSystemId();
    }

    @Override
    public SystemOperation component8() {
        return getOperation();
    }

    @Override
    public JsonElement component9() {
        return getDescription();
    }

    @Override
    public String component10() {
        return getRawData();
    }

    @Override
    public UUID component11() {
        return getUuid();
    }

    @Override
    public LocalDateTime component12() {
        return getCreated();
    }

    @Override
    public Integer value1() {
        return getSeqId();
    }

    @Override
    public Integer value2() {
        return getSystemSeqId();
    }

    @Override
    public String value3() {
        return getOboTenant();
    }

    @Override
    public String value4() {
        return getOboUser();
    }

    @Override
    public String value5() {
        return getJwtTenant();
    }

    @Override
    public String value6() {
        return getJwtUser();
    }

    @Override
    public String value7() {
        return getSystemId();
    }

    @Override
    public SystemOperation value8() {
        return getOperation();
    }

    @Override
    public JsonElement value9() {
        return getDescription();
    }

    @Override
    public String value10() {
        return getRawData();
    }

    @Override
    public UUID value11() {
        return getUuid();
    }

    @Override
    public LocalDateTime value12() {
        return getCreated();
    }

    @Override
    public SystemUpdatesRecord value1(Integer value) {
        setSeqId(value);
        return this;
    }

    @Override
    public SystemUpdatesRecord value2(Integer value) {
        setSystemSeqId(value);
        return this;
    }

    @Override
    public SystemUpdatesRecord value3(String value) {
        setOboTenant(value);
        return this;
    }

    @Override
    public SystemUpdatesRecord value4(String value) {
        setOboUser(value);
        return this;
    }

    @Override
    public SystemUpdatesRecord value5(String value) {
        setJwtTenant(value);
        return this;
    }

    @Override
    public SystemUpdatesRecord value6(String value) {
        setJwtUser(value);
        return this;
    }

    @Override
    public SystemUpdatesRecord value7(String value) {
        setSystemId(value);
        return this;
    }

    @Override
    public SystemUpdatesRecord value8(SystemOperation value) {
        setOperation(value);
        return this;
    }

    @Override
    public SystemUpdatesRecord value9(JsonElement value) {
        setDescription(value);
        return this;
    }

    @Override
    public SystemUpdatesRecord value10(String value) {
        setRawData(value);
        return this;
    }

    @Override
    public SystemUpdatesRecord value11(UUID value) {
        setUuid(value);
        return this;
    }

    @Override
    public SystemUpdatesRecord value12(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public SystemUpdatesRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, String value7, SystemOperation value8, JsonElement value9, String value10, UUID value11, LocalDateTime value12) {
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
     * Create a detached SystemUpdatesRecord
     */
    public SystemUpdatesRecord() {
        super(SystemUpdates.SYSTEM_UPDATES);
    }

    /**
     * Create a detached, initialised SystemUpdatesRecord
     */
    public SystemUpdatesRecord(Integer seqId, Integer systemSeqId, String oboTenant, String oboUser, String jwtTenant, String jwtUser, String systemId, SystemOperation operation, JsonElement description, String rawData, UUID uuid, LocalDateTime created) {
        super(SystemUpdates.SYSTEM_UPDATES);

        setSeqId(seqId);
        setSystemSeqId(systemSeqId);
        setOboTenant(oboTenant);
        setOboUser(oboUser);
        setJwtTenant(jwtTenant);
        setJwtUser(jwtUser);
        setSystemId(systemId);
        setOperation(operation);
        setDescription(description);
        setRawData(rawData);
        setUuid(uuid);
        setCreated(created);
    }
}
