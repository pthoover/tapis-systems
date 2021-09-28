/*
 * This file is generated by jOOQ.
 */
package edu.utexas.tacc.tapis.systems.gen.jooq;


import edu.utexas.tacc.tapis.systems.gen.jooq.tables.FlywaySchemaHistory;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.SchedulerProfiles;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.SystemUpdates;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.Systems;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.records.FlywaySchemaHistoryRecord;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.records.SchedulerProfilesRecord;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.records.SystemUpdatesRecord;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.records.SystemsRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * tapis_sys.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, DSL.name("flyway_schema_history_pk"), new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
    public static final UniqueKey<SchedulerProfilesRecord> SCHEDULER_PROFILES_TENANT_NAME_KEY = Internal.createUniqueKey(SchedulerProfiles.SCHEDULER_PROFILES, DSL.name("scheduler_profiles_tenant_name_key"), new TableField[] { SchedulerProfiles.SCHEDULER_PROFILES.TENANT, SchedulerProfiles.SCHEDULER_PROFILES.NAME }, true);
    public static final UniqueKey<SystemUpdatesRecord> SYSTEM_UPDATES_PKEY = Internal.createUniqueKey(SystemUpdates.SYSTEM_UPDATES, DSL.name("system_updates_pkey"), new TableField[] { SystemUpdates.SYSTEM_UPDATES.SEQ_ID }, true);
    public static final UniqueKey<SystemsRecord> SYSTEMS_PKEY = Internal.createUniqueKey(Systems.SYSTEMS, DSL.name("systems_pkey"), new TableField[] { Systems.SYSTEMS.SEQ_ID }, true);
    public static final UniqueKey<SystemsRecord> SYSTEMS_TENANT_ID_KEY = Internal.createUniqueKey(Systems.SYSTEMS, DSL.name("systems_tenant_id_key"), new TableField[] { Systems.SYSTEMS.TENANT, Systems.SYSTEMS.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<SystemUpdatesRecord, SystemsRecord> SYSTEM_UPDATES__SYSTEM_UPDATES_SYSTEM_SEQ_ID_FKEY = Internal.createForeignKey(SystemUpdates.SYSTEM_UPDATES, DSL.name("system_updates_system_seq_id_fkey"), new TableField[] { SystemUpdates.SYSTEM_UPDATES.SYSTEM_SEQ_ID }, Keys.SYSTEMS_PKEY, new TableField[] { Systems.SYSTEMS.SEQ_ID }, true);
}
