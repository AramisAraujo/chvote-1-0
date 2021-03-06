/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 03 18:08:10 GMT 2018
 */

package ch.ge.ve.commons.crypto.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.ge.ve.commons.crypto.utils.MacFactory;
import ch.ge.ve.commons.properties.PropertyConfigurationService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MacFactory_ESTest extends MacFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MacFactory macFactory0 = null;
      try {
        macFactory0 = new MacFactory((PropertyConfigurationService) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ch.ge.ve.commons.crypto.utils.MacFactory", e);
      }
  }
}
