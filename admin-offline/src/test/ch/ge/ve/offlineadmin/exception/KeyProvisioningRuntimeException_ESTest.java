/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 03 17:49:24 GMT 2018
 */

package ch.ge.ve.offlineadmin.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import ch.ge.ve.offlineadmin.exception.KeyProvisioningRuntimeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KeyProvisioningRuntimeException_ESTest extends KeyProvisioningRuntimeException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KeyProvisioningRuntimeException keyProvisioningRuntimeException0 = new KeyProvisioningRuntimeException("");
      KeyProvisioningRuntimeException keyProvisioningRuntimeException1 = new KeyProvisioningRuntimeException("c82$&Ty#@6{'vFvF\"", keyProvisioningRuntimeException0);
      assertFalse(keyProvisioningRuntimeException1.equals((Object)keyProvisioningRuntimeException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KeyProvisioningRuntimeException keyProvisioningRuntimeException0 = new KeyProvisioningRuntimeException("");
      KeyProvisioningRuntimeException keyProvisioningRuntimeException1 = new KeyProvisioningRuntimeException(keyProvisioningRuntimeException0);
      assertFalse(keyProvisioningRuntimeException1.equals((Object)keyProvisioningRuntimeException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      KeyProvisioningRuntimeException keyProvisioningRuntimeException0 = new KeyProvisioningRuntimeException("");
      KeyProvisioningRuntimeException keyProvisioningRuntimeException1 = new KeyProvisioningRuntimeException("ch.ge.ve.offlineadmin.exception.KeyProvisioningRuntimeException", keyProvisioningRuntimeException0, true, false);
      assertFalse(keyProvisioningRuntimeException1.equals((Object)keyProvisioningRuntimeException0));
  }
}
