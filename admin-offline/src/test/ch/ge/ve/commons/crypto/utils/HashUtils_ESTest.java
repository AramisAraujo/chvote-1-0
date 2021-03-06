/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 03 18:10:18 GMT 2018
 */

package ch.ge.ve.commons.crypto.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.ge.ve.commons.crypto.utils.HashUtils;
import ch.ge.ve.commons.properties.PropertyConfigurationService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HashUtils_ESTest extends HashUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashUtils hashUtils0 = null;
      try {
        hashUtils0 = new HashUtils((PropertyConfigurationService) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ch.ge.ve.commons.crypto.utils.MessageDigestFactory", e);
      }
  }
}
