/*
 * This file is generated by jOOQ.
 */
package edu.utexas.tacc.tapis.systems.gen.jooq;


import edu.utexas.tacc.tapis.systems.gen.jooq.tables.Capabilities;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.FlywaySchemaHistory;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.JobRuntimes;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.LogicalQueues;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.SchedulerProfiles;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.SystemUpdates;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.Systems;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.records.CapabilitiesRecord;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.records.FlywaySchemaHistoryRecord;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.records.JobRuntimesRecord;
import edu.utexas.tacc.tapis.systems.gen.jooq.tables.records.LogicalQueuesRecord;
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

    public static final UniqueKey<CapabilitiesRecord> CAPABILITIES_PKEY = Internal.createUniqueKey(Capabilities.CAPABILITIES, DSL.name("capabilities_pkey"), new TableField[] { Capabilities.CAPABILITIES.SEQ_ID }, true);
    public static final UniqueKey<CapabilitiesRecord> CAPABILITIES_SYSTEM_SEQ_ID_CATEGORY_NAME_KEY = Internal.createUniqueKey(Capabilities.CAPABILITIES, DSL.name("capabilities_system_seq_id_category_name_key"), new TableField[] { Capabilities.CAPABILITIES.SYSTEM_SEQ_ID, Capabilities.CAPABILITIES.CATEGORY, Capabilities.CAPABILITIES.NAME }, true);
    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, DSL.name("flyway_schema_history_pk"), new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
    public static final UniqueKey<JobRuntimesRecord> JOB_RUNTIMES_PKEY = Internal.createUniqueKey(JobRuntimes.JOB_RUNTIMES, DSL.name("job_runtimes_pkey"), new TableField[] { JobRuntimes.JOB_RUNTIMES.SEQ_ID }, true);
    public static final UniqueKey<LogicalQueuesRecord> LOGICAL_QUEUES_PKEY = Internal.createUniqueKey(LogicalQueues.LOGICAL_QUEUES, DSL.name("logical_queues_pkey"), new TableField[] { LogicalQueues.LOGICAL_QUEUES.SEQ_ID }, true);
    public static final UniqueKey<LogicalQueuesRecord> LOGICAL_QUEUES_SYSTEM_SEQ_ID_NAME_KEY = Internal.createUniqueKey(LogicalQueues.LOGICAL_QUEUES, DSL.name("logical_queues_system_seq_id_name_key"), new TableField[] { LogicalQueues.LOGICAL_QUEUES.SYSTEM_SEQ_ID, LogicalQueues.LOGICAL_QUEUES.NAME }, true);
    public static final UniqueKey<SchedulerProfilesRecord> SCHEDULER_PROFILES_TENANT_NAME_KEY = Internal.createUniqueKey(SchedulerProfiles.SCHEDULER_PROFILES, DSL.name("scheduler_profiles_tenant_name_key"), new TableField[] { SchedulerProfiles.SCHEDULER_PROFILES.TENANT, SchedulerProfiles.SCHEDULER_PROFILES.NAME }, true);
    public static final UniqueKey<SystemUpdatesRecord> SYSTEM_UPDATES_PKEY = Internal.createUniqueKey(SystemUpdates.SYSTEM_UPDATES, DSL.name("system_updates_pkey"), new TableField[] { SystemUpdates.SYSTEM_UPDATES.SEQ_ID }, true);
    public static final UniqueKey<SystemsRecord> SYSTEMS_PKEY = Internal.createUniqueKey(Systems.SYSTEMS, DSL.name("systems_pkey"), new TableField[] { Systems.SYSTEMS.SEQ_ID }, true);
    public static final UniqueKey<SystemsRecord> SYSTEMS_TENANT_ID_KEY = Internal.createUniqueKey(Systems.SYSTEMS, DSL.name("systems_tenant_id_key"), new TableField[] { Systems.SYSTEMS.TENANT, Systems.SYSTEMS.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CapabilitiesRecord, SystemsRecord> CAPABILITIES__CAPABILITIES_SYSTEM_SEQ_ID_FKEY = Internal.createForeignKey(Capabilities.CAPABILITIES, DSL.name("capabilities_system_seq_id_fkey"), new TableField[] { Capabilities.CAPABILITIES.SYSTEM_SEQ_ID }, Keys.SYSTEMS_PKEY, new TableField[] { Systems.SYSTEMS.SEQ_ID }, true);
    public static final ForeignKey<JobRuntimesRecord, SystemsRecord> JOB_RUNTIMES__JOB_RUNTIMES_SYSTEM_SEQ_ID_FKEY = Internal.createForeignKey(JobRuntimes.JOB_RUNTIMES, DSL.name("job_runtimes_system_seq_id_fkey"), new TableField[] { JobRuntimes.JOB_RUNTIMES.SYSTEM_SEQ_ID }, Keys.SYSTEMS_PKEY, new TableField[] { Systems.SYSTEMS.SEQ_ID }, true);
    public static final ForeignKey<LogicalQueuesRecord, SystemsRecord> LOGICAL_QUEUES__LOGICAL_QUEUES_SYSTEM_SEQ_ID_FKEY = Internal.createForeignKey(LogicalQueues.LOGICAL_QUEUES, DSL.name("logical_queues_system_seq_id_fkey"), new TableField[] { LogicalQueues.LOGICAL_QUEUES.SYSTEM_SEQ_ID }, Keys.SYSTEMS_PKEY, new TableField[] { Systems.SYSTEMS.SEQ_ID }, true);
    public static final ForeignKey<SystemUpdatesRecord, SystemsRecord> SYSTEM_UPDATES__SYSTEM_UPDATES_SYSTEM_SEQ_ID_FKEY = Internal.createForeignKey(SystemUpdates.SYSTEM_UPDATES, DSL.name("system_updates_system_seq_id_fkey"), new TableField[] { SystemUpdates.SYSTEM_UPDATES.SYSTEM_SEQ_ID }, Keys.SYSTEMS_PKEY, new TableField[] { Systems.SYSTEMS.SEQ_ID }, true);
}
