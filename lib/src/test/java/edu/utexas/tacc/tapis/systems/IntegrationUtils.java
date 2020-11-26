package edu.utexas.tacc.tapis.systems;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import edu.utexas.tacc.tapis.shared.utils.TapisGsonUtils;
import edu.utexas.tacc.tapis.systems.model.Capability;
import edu.utexas.tacc.tapis.systems.model.TSystem;
import edu.utexas.tacc.tapis.systems.model.TSystem.AuthnMethod;
import edu.utexas.tacc.tapis.systems.model.TSystem.TransferMethod;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/*
 * Utilities and data for integration testing
 */
public final class IntegrationUtils
{
  // Test data
  public static final String tenantName = "dev";
  public static final String ownerUser = "owner1";
  public static final String ownerUser2 = "owner2";
  public static final String apiUser = "testApiUser";
  public static final String sysNamePrefix = "TestSys";
  public static final Gson gson =  TapisGsonUtils.getGson();
  public static final List<TransferMethod> txfrMethodsList = new ArrayList<>(List.of(TransferMethod.SFTP, TransferMethod.S3));
  public static final List<TransferMethod> txfrMethodsEmpty = new ArrayList<>();
  public static final boolean isEnabled = true;
  public static final boolean canExec = true;
  public static final String[] jobEnvVariables = {"a=b", "HOME=/home/testuser2", "TMP=/tmp"};
  public static final boolean jobIsBatch = true;
  public static final int jobMaxJobs = -1;
  public static final int jobMaxJobsPerUser = -1;
  public static final String[] tags = {"value1", "value2", "a",
    "Long tag (1 3 2) special chars [_ $ - & * % @ + = ! ^ ? < > , . ( ) { } / \\ | ]. Backslashes must be escaped."};
  public static final Object notes = TapisGsonUtils.getGson().fromJson("{\"project\": \"myproj1\", \"testdata\": \"abc1\"}", JsonObject.class);
  public static final JsonObject notesObj = (JsonObject) notes;
  public static final Protocol prot1 = new Protocol(AuthnMethod.PKI_KEYS, txfrMethodsList, 22, false, "", 0);
  public static final Protocol prot2 = new Protocol(AuthnMethod.PASSWORD, txfrMethodsList, 0, true, "localhost",2222);
  public static final String scrubbedJson = "{}";

  public static final Capability capA = new Capability(Capability.Category.SCHEDULER, Capability.DEFAULT_SUBCATEGORY, "Type",
                                                       Capability.Datatype.STRING, Capability.DEFAULT_PRECEDENCE, "Slurm");
  public static final Capability capB = new Capability(Capability.Category.HARDWARE, Capability.DEFAULT_SUBCATEGORY, "CoresPerNode",
                                                       Capability.Datatype.INTEGER, Capability.DEFAULT_PRECEDENCE, "4");
  public static final Capability capC = new Capability(Capability.Category.SOFTWARE, Capability.DEFAULT_SUBCATEGORY, "OpenMP",
                                                       Capability.Datatype.STRING, Capability.DEFAULT_PRECEDENCE, "4.5");
  public static final Capability capD = new Capability(Capability.Category.CONTAINER, Capability.DEFAULT_SUBCATEGORY, "Singularity",
                                                       Capability.Datatype.STRING, Capability.DEFAULT_PRECEDENCE, null);
  public static final List<Capability> capList1 = new ArrayList<>(List.of(capA, capB, capC, capD));
  public static final Capability capA1 = new Capability(Capability.Category.SCHEDULER, Capability.DEFAULT_SUBCATEGORY, "Type",
          Capability.Datatype.STRING, Capability.DEFAULT_PRECEDENCE, "PBS");
  public static final Capability capB1 = new Capability(Capability.Category.HARDWARE, Capability.DEFAULT_SUBCATEGORY, "CoresPerNode",
          Capability.Datatype.INTEGER, Capability.DEFAULT_PRECEDENCE, "8");
  public static final Capability capC1 = new Capability(Capability.Category.SOFTWARE, Capability.DEFAULT_SUBCATEGORY, "OpenMP",
          Capability.Datatype.STRING, Capability.DEFAULT_PRECEDENCE, "3.1");
  public static final Capability capD1 = new Capability(Capability.Category.CONTAINER, Capability.DEFAULT_SUBCATEGORY, "Docker",
          Capability.Datatype.STRING, Capability.DEFAULT_PRECEDENCE, null);
  public static final List<Capability> capList2 = new ArrayList<>(List.of(capA1, capB1, capC1, capD1));

  public static final boolean isDeleted = false;
  public static final String importRefId = null;
  public static final Instant created = null;
  public static final Instant updated = null;
  public static final int qMaxJobs = -1;
  public static final int qMaxJobsPerUser = -1;
  public static final int qMaxNodeCount = -1;
  public static final int qMaxCoresPerNode = -1;
  public static final int qMaxMemoryMB = -1;
  public static final int qMaxMinutes = -1;

  /**
   * Create an array of TSystem objects in memory
   * Names will be of format TestSys_K_NNN where K is the key and NNN runs from 000 to 999
   * We need a key because maven runs the tests in parallel so each set of systems created by an integration
   *   test will need its own namespace.
   * @param n number of systems to create
   * @return array of TSystem objects
   */
  public static TSystem[] makeSystems(int n, String key)
  {
    TSystem[] systems = new TSystem[n];
    for (int i = 0; i < n; i++)
    {
      // Suffix which should be unique for each system within each integration test
      String suffix = key + "_" + String.format("%03d", i+1);
      String name = getSysName(key, i+1);
      // Constructor initializes all attributes except for JobCapabilities and Credential
      systems[i] = new TSystem(-1, tenantName, name, "description "+suffix, TSystem.SystemType.LINUX, ownerUser,
              "host"+suffix, isEnabled,"effUser"+suffix, prot1.getAuthnMethod(), "bucket"+suffix, "/root"+suffix,
              prot1.getTransferMethods(), prot1.getPort(), prot1.isUseProxy(), prot1.getProxyHost(), prot1.getProxyPort(),
              canExec, "jobWorkDir"+suffix, jobEnvVariables, jobMaxJobs, jobMaxJobsPerUser, jobIsBatch,
              "batchScheduler"+suffix, "batchDefaultLogicalQueue"+suffix,
              tags, notes, importRefId , isDeleted, created, updated);
      systems[i].setJobCapabilities(capList1);
    }
    return systems;
  }

  public static String getSysName(String key, int idx)
  {
    String suffix = key + "_" + String.format("%03d", idx);
    return sysNamePrefix + "_" + suffix;
  }
}
