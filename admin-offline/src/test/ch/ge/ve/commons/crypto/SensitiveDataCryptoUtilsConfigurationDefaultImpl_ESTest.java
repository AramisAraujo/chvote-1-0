/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 03 18:00:32 GMT 2018
 */

package ch.ge.ve.commons.crypto;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.ge.ve.commons.crypto.SensitiveDataCryptoUtilsConfigurationDefaultImpl;
import ch.ge.ve.commons.properties.PropertyConfigurationService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SensitiveDataCryptoUtilsConfigurationDefaultImpl_ESTest extends SensitiveDataCryptoUtilsConfigurationDefaultImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SensitiveDataCryptoUtilsConfigurationDefaultImpl sensitiveDataCryptoUtilsConfigurationDefaultImpl0 = new SensitiveDataCryptoUtilsConfigurationDefaultImpl((PropertyConfigurationService) null);
      // Undeclared exception!
      try { 
        sensitiveDataCryptoUtilsConfigurationDefaultImpl0.getSecretKey();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ch.ge.ve.commons.crypto.SensitiveDataCryptoUtilsConfigurationDefaultImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SensitiveDataCryptoUtilsConfigurationDefaultImpl sensitiveDataCryptoUtilsConfigurationDefaultImpl0 = new SensitiveDataCryptoUtilsConfigurationDefaultImpl((PropertyConfigurationService) null);
      // Undeclared exception!
      try { 
        sensitiveDataCryptoUtilsConfigurationDefaultImpl0.getMac();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ch.ge.ve.commons.crypto.utils.MacFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SensitiveDataCryptoUtilsConfigurationDefaultImpl sensitiveDataCryptoUtilsConfigurationDefaultImpl0 = new SensitiveDataCryptoUtilsConfigurationDefaultImpl((PropertyConfigurationService) null);
      // Undeclared exception!
      try { 
        sensitiveDataCryptoUtilsConfigurationDefaultImpl0.getCipher();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ch.ge.ve.commons.crypto.SensitiveDataCryptoUtilsConfigurationDefaultImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SensitiveDataCryptoUtilsConfigurationDefaultImpl sensitiveDataCryptoUtilsConfigurationDefaultImpl0 = new SensitiveDataCryptoUtilsConfigurationDefaultImpl((PropertyConfigurationService) null);
      // Undeclared exception!
      try { 
        sensitiveDataCryptoUtilsConfigurationDefaultImpl0.getSealMaxBytes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ch.ge.ve.commons.crypto.SensitiveDataCryptoUtilsConfigurationDefaultImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SensitiveDataCryptoUtilsConfigurationDefaultImpl sensitiveDataCryptoUtilsConfigurationDefaultImpl0 = new SensitiveDataCryptoUtilsConfigurationDefaultImpl((PropertyConfigurationService) null);
      // Undeclared exception!
      try { 
        sensitiveDataCryptoUtilsConfigurationDefaultImpl0.getIterations();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ch.ge.ve.commons.crypto.SensitiveDataCryptoUtilsConfigurationDefaultImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SensitiveDataCryptoUtilsConfigurationDefaultImpl sensitiveDataCryptoUtilsConfigurationDefaultImpl0 = new SensitiveDataCryptoUtilsConfigurationDefaultImpl((PropertyConfigurationService) null);
      // Undeclared exception!
      try { 
        sensitiveDataCryptoUtilsConfigurationDefaultImpl0.getPbkdf2Algorithm();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ch.ge.ve.commons.crypto.SensitiveDataCryptoUtilsConfigurationDefaultImpl", e);
      }
  }
}
