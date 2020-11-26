/*
 * This file is generated by jOOQ.
 */
package edu.utexas.tacc.tapis.systems.gen.jooq.tables.records;


import com.google.gson.JsonElement;

import edu.utexas.tacc.tapis.systems.gen.jooq.tables.Systems;
import edu.utexas.tacc.tapis.systems.model.TSystem.AuthnMethod;
import edu.utexas.tacc.tapis.systems.model.TSystem.SystemType;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SystemsRecord extends UpdatableRecordImpl<SystemsRecord> {

    private static final long serialVersionUID = -1604482475;

    /**
     * Setter for <code>tapis_sys.systems.id</code>. System id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.id</code>. System id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>tapis_sys.systems.tenant</code>. Tenant name associated with system
     */
    public void setTenant(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.tenant</code>. Tenant name associated with system
     */
    public String getTenant() {
        return (String) get(1);
    }

    /**
     * Setter for <code>tapis_sys.systems.name</code>. Unique name for the system
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.name</code>. Unique name for the system
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>tapis_sys.systems.description</code>. System description
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.description</code>. System description
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>tapis_sys.systems.system_type</code>. Type of system
     */
    public void setSystemType(SystemType value) {
        set(4, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.system_type</code>. Type of system
     */
    public SystemType getSystemType() {
        return (SystemType) get(4);
    }

    /**
     * Setter for <code>tapis_sys.systems.owner</code>. User name of system owner
     */
    public void setOwner(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.owner</code>. User name of system owner
     */
    public String getOwner() {
        return (String) get(5);
    }

    /**
     * Setter for <code>tapis_sys.systems.host</code>. System host name or ip address
     */
    public void setHost(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.host</code>. System host name or ip address
     */
    public String getHost() {
        return (String) get(6);
    }

    /**
     * Setter for <code>tapis_sys.systems.enabled</code>. Indicates if system is currently active and available for use
     */
    public void setEnabled(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.enabled</code>. Indicates if system is currently active and available for use
     */
    public Boolean getEnabled() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>tapis_sys.systems.effective_user_id</code>. User name to use when accessing the system
     */
    public void setEffectiveUserId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.effective_user_id</code>. User name to use when accessing the system
     */
    public String getEffectiveUserId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>tapis_sys.systems.default_authn_method</code>. Enum for how authorization is handled by default
     */
    public void setDefaultAuthnMethod(AuthnMethod value) {
        set(9, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.default_authn_method</code>. Enum for how authorization is handled by default
     */
    public AuthnMethod getDefaultAuthnMethod() {
        return (AuthnMethod) get(9);
    }

    /**
     * Setter for <code>tapis_sys.systems.bucket_name</code>. Name of the bucket for an S3 system
     */
    public void setBucketName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.bucket_name</code>. Name of the bucket for an S3 system
     */
    public String getBucketName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>tapis_sys.systems.root_dir</code>. Effective root directory path for a Unix system
     */
    public void setRootDir(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.root_dir</code>. Effective root directory path for a Unix system
     */
    public String getRootDir() {
        return (String) get(11);
    }

    /**
     * Setter for <code>tapis_sys.systems.transfer_methods</code>. List of supported transfer methods
     */
    public void setTransferMethods(String[] value) {
        set(12, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.transfer_methods</code>. List of supported transfer methods
     */
    public String[] getTransferMethods() {
        return (String[]) get(12);
    }

    /**
     * Setter for <code>tapis_sys.systems.port</code>. Port number used to access a system
     */
    public void setPort(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.port</code>. Port number used to access a system
     */
    public Integer getPort() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>tapis_sys.systems.use_proxy</code>. Indicates if system should accessed through a proxy
     */
    public void setUseProxy(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.use_proxy</code>. Indicates if system should accessed through a proxy
     */
    public Boolean getUseProxy() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>tapis_sys.systems.proxy_host</code>. Proxy host name or ip address
     */
    public void setProxyHost(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.proxy_host</code>. Proxy host name or ip address
     */
    public String getProxyHost() {
        return (String) get(15);
    }

    /**
     * Setter for <code>tapis_sys.systems.proxy_port</code>. Proxy port number
     */
    public void setProxyPort(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.proxy_port</code>. Proxy port number
     */
    public Integer getProxyPort() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>tapis_sys.systems.can_exec</code>. Indicates if system can be used to execute jobs
     */
    public void setCanExec(Boolean value) {
        set(17, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.can_exec</code>. Indicates if system can be used to execute jobs
     */
    public Boolean getCanExec() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>tapis_sys.systems.job_working_dir</code>. Parent directory from which a job is run. Relative to effective root directory.
     */
    public void setJobWorkingDir(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.job_working_dir</code>. Parent directory from which a job is run. Relative to effective root directory.
     */
    public String getJobWorkingDir() {
        return (String) get(18);
    }

    /**
     * Setter for <code>tapis_sys.systems.job_env_variables</code>. Environment variables added to shell environment
     */
    public void setJobEnvVariables(String[] value) {
        set(19, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.job_env_variables</code>. Environment variables added to shell environment
     */
    public String[] getJobEnvVariables() {
        return (String[]) get(19);
    }

    /**
     * Setter for <code>tapis_sys.systems.job_max_jobs</code>. Maximum total number of jobs that can be queued or running on the system at a given time.
     */
    public void setJobMaxJobs(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.job_max_jobs</code>. Maximum total number of jobs that can be queued or running on the system at a given time.
     */
    public Integer getJobMaxJobs() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>tapis_sys.systems.job_max_jobs_per_user</code>. Maximum total number of jobs associated with a specific user that can be queued or running on the system at a given time.
     */
    public void setJobMaxJobsPerUser(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.job_max_jobs_per_user</code>. Maximum total number of jobs associated with a specific user that can be queued or running on the system at a given time.
     */
    public Integer getJobMaxJobsPerUser() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>tapis_sys.systems.job_is_batch</code>. Flag indicating if system uses a batch scheduler to run jobs.
     */
    public void setJobIsBatch(Boolean value) {
        set(22, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.job_is_batch</code>. Flag indicating if system uses a batch scheduler to run jobs.
     */
    public Boolean getJobIsBatch() {
        return (Boolean) get(22);
    }

    /**
     * Setter for <code>tapis_sys.systems.batch_scheduler</code>. Type of scheduler used when running batch jobs
     */
    public void setBatchScheduler(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.batch_scheduler</code>. Type of scheduler used when running batch jobs
     */
    public String getBatchScheduler() {
        return (String) get(23);
    }

    /**
     * Setter for <code>tapis_sys.systems.batch_default_logical_queue</code>. Default logical batch queue for the system
     */
    public void setBatchDefaultLogicalQueue(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.batch_default_logical_queue</code>. Default logical batch queue for the system
     */
    public String getBatchDefaultLogicalQueue() {
        return (String) get(24);
    }

    /**
     * Setter for <code>tapis_sys.systems.tags</code>. Tags for user supplied key:value pairs
     */
    public void setTags(String[] value) {
        set(25, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.tags</code>. Tags for user supplied key:value pairs
     */
    public String[] getTags() {
        return (String[]) get(25);
    }

    /**
     * Setter for <code>tapis_sys.systems.notes</code>. Notes for general information stored as JSON
     */
    public void setNotes(JsonElement value) {
        set(26, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.notes</code>. Notes for general information stored as JSON
     */
    public JsonElement getNotes() {
        return (JsonElement) get(26);
    }

    /**
     * Setter for <code>tapis_sys.systems.import_ref_id</code>. Optional reference ID for systems created via import
     */
    public void setImportRefId(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.import_ref_id</code>. Optional reference ID for systems created via import
     */
    public String getImportRefId() {
        return (String) get(27);
    }

    /**
     * Setter for <code>tapis_sys.systems.deleted</code>. Indicates if system has been soft deleted
     */
    public void setDeleted(Boolean value) {
        set(28, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.deleted</code>. Indicates if system has been soft deleted
     */
    public Boolean getDeleted() {
        return (Boolean) get(28);
    }

    /**
     * Setter for <code>tapis_sys.systems.created</code>. UTC time for when record was created
     */
    public void setCreated(LocalDateTime value) {
        set(29, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.created</code>. UTC time for when record was created
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(29);
    }

    /**
     * Setter for <code>tapis_sys.systems.updated</code>. UTC time for when record was last updated
     */
    public void setUpdated(LocalDateTime value) {
        set(30, value);
    }

    /**
     * Getter for <code>tapis_sys.systems.updated</code>. UTC time for when record was last updated
     */
    public LocalDateTime getUpdated() {
        return (LocalDateTime) get(30);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SystemsRecord
     */
    public SystemsRecord() {
        super(Systems.SYSTEMS);
    }

    /**
     * Create a detached, initialised SystemsRecord
     */
    public SystemsRecord(Integer id, String tenant, String name, String description, SystemType systemType, String owner, String host, Boolean enabled, String effectiveUserId, AuthnMethod defaultAuthnMethod, String bucketName, String rootDir, String[] transferMethods, Integer port, Boolean useProxy, String proxyHost, Integer proxyPort, Boolean canExec, String jobWorkingDir, String[] jobEnvVariables, Integer jobMaxJobs, Integer jobMaxJobsPerUser, Boolean jobIsBatch, String batchScheduler, String batchDefaultLogicalQueue, String[] tags, JsonElement notes, String importRefId, Boolean deleted, LocalDateTime created, LocalDateTime updated) {
        super(Systems.SYSTEMS);

        set(0, id);
        set(1, tenant);
        set(2, name);
        set(3, description);
        set(4, systemType);
        set(5, owner);
        set(6, host);
        set(7, enabled);
        set(8, effectiveUserId);
        set(9, defaultAuthnMethod);
        set(10, bucketName);
        set(11, rootDir);
        set(12, transferMethods);
        set(13, port);
        set(14, useProxy);
        set(15, proxyHost);
        set(16, proxyPort);
        set(17, canExec);
        set(18, jobWorkingDir);
        set(19, jobEnvVariables);
        set(20, jobMaxJobs);
        set(21, jobMaxJobsPerUser);
        set(22, jobIsBatch);
        set(23, batchScheduler);
        set(24, batchDefaultLogicalQueue);
        set(25, tags);
        set(26, notes);
        set(27, importRefId);
        set(28, deleted);
        set(29, created);
        set(30, updated);
    }
}
