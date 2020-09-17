/*
 * This file is generated by jOOQ.
 */
package edu.utexas.tacc.tapis.systems.gen.jooq;


import edu.utexas.tacc.tapis.systems.gen.jooq.tables.Capabilities;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.FlywaySchemaHistory;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.SystemUpdates;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.Systems;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.records.CapabilitiesRecord;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.records.FlywaySchemaHistoryRecord;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.records.SystemUpdatesRecord;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.records.SystemsRecord;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>tapis_sys</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CapabilitiesRecord, Integer> IDENTITY_CAPABILITIES = Identities0.IDENTITY_CAPABILITIES;
    public static final Identity<SystemUpdatesRecord, Integer> IDENTITY_SYSTEM_UPDATES = Identities0.IDENTITY_SYSTEM_UPDATES;
    public static final Identity<SystemsRecord, Integer> IDENTITY_SYSTEMS = Identities0.IDENTITY_SYSTEMS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CapabilitiesRecord> CAPABILITIES_PKEY = UniqueKeys0.CAPABILITIES_PKEY;
    public static final UniqueKey<CapabilitiesRecord> CAPABILITIES_SYSTEM_ID_CATEGORY_NAME_KEY = UniqueKeys0.CAPABILITIES_SYSTEM_ID_CATEGORY_NAME_KEY;
    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = UniqueKeys0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final UniqueKey<SystemUpdatesRecord> SYSTEM_UPDATES_PKEY = UniqueKeys0.SYSTEM_UPDATES_PKEY;
    public static final UniqueKey<SystemsRecord> SYSTEMS_PKEY = UniqueKeys0.SYSTEMS_PKEY;
    public static final UniqueKey<SystemsRecord> SYSTEMS_TENANT_NAME_KEY = UniqueKeys0.SYSTEMS_TENANT_NAME_KEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CapabilitiesRecord, SystemsRecord> CAPABILITIES__CAPABILITIES_SYSTEM_ID_FKEY = ForeignKeys0.CAPABILITIES__CAPABILITIES_SYSTEM_ID_FKEY;
    public static final ForeignKey<SystemUpdatesRecord, SystemsRecord> SYSTEM_UPDATES__SYSTEM_UPDATES_SYSTEM_ID_FKEY = ForeignKeys0.SYSTEM_UPDATES__SYSTEM_UPDATES_SYSTEM_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<CapabilitiesRecord, Integer> IDENTITY_CAPABILITIES = Internal.createIdentity(Capabilities.CAPABILITIES, Capabilities.CAPABILITIES.ID);
        public static Identity<SystemUpdatesRecord, Integer> IDENTITY_SYSTEM_UPDATES = Internal.createIdentity(SystemUpdates.SYSTEM_UPDATES, SystemUpdates.SYSTEM_UPDATES.ID);
        public static Identity<SystemsRecord, Integer> IDENTITY_SYSTEMS = Internal.createIdentity(Systems.SYSTEMS, Systems.SYSTEMS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<CapabilitiesRecord> CAPABILITIES_PKEY = Internal.createUniqueKey(Capabilities.CAPABILITIES, "capabilities_pkey", new TableField[] { Capabilities.CAPABILITIES.ID }, true);
        public static final UniqueKey<CapabilitiesRecord> CAPABILITIES_SYSTEM_ID_CATEGORY_NAME_KEY = Internal.createUniqueKey(Capabilities.CAPABILITIES, "capabilities_system_id_category_name_key", new TableField[] { Capabilities.CAPABILITIES.SYSTEM_ID, Capabilities.CAPABILITIES.CATEGORY, Capabilities.CAPABILITIES.NAME }, true);
        public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "flyway_schema_history_pk", new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
        public static final UniqueKey<SystemUpdatesRecord> SYSTEM_UPDATES_PKEY = Internal.createUniqueKey(SystemUpdates.SYSTEM_UPDATES, "system_updates_pkey", new TableField[] { SystemUpdates.SYSTEM_UPDATES.ID }, true);
        public static final UniqueKey<SystemsRecord> SYSTEMS_PKEY = Internal.createUniqueKey(Systems.SYSTEMS, "systems_pkey", new TableField[] { Systems.SYSTEMS.ID }, true);
        public static final UniqueKey<SystemsRecord> SYSTEMS_TENANT_NAME_KEY = Internal.createUniqueKey(Systems.SYSTEMS, "systems_tenant_name_key", new TableField[] { Systems.SYSTEMS.TENANT, Systems.SYSTEMS.NAME }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<CapabilitiesRecord, SystemsRecord> CAPABILITIES__CAPABILITIES_SYSTEM_ID_FKEY = Internal.createForeignKey(Keys.SYSTEMS_PKEY, Capabilities.CAPABILITIES, "capabilities_system_id_fkey", new TableField[] { Capabilities.CAPABILITIES.SYSTEM_ID }, true);
        public static final ForeignKey<SystemUpdatesRecord, SystemsRecord> SYSTEM_UPDATES__SYSTEM_UPDATES_SYSTEM_ID_FKEY = Internal.createForeignKey(Keys.SYSTEMS_PKEY, SystemUpdates.SYSTEM_UPDATES, "system_updates_system_id_fkey", new TableField[] { SystemUpdates.SYSTEM_UPDATES.SYSTEM_ID }, true);
    }
}
