/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 03 17:57:13 GMT 2018
 */

package ch.ge.ve.commons.properties;

import org.junit.Test;
import static org.junit.Assert.*;
import ch.ge.ve.commons.properties.PropertyConfigurationRuntimeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PropertyConfigurationRuntimeException_ESTest extends PropertyConfigurationRuntimeException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PropertyConfigurationRuntimeException propertyConfigurationRuntimeException0 = new PropertyConfigurationRuntimeException("");
      PropertyConfigurationRuntimeException propertyConfigurationRuntimeException1 = new PropertyConfigurationRuntimeException("sE#]LKB.Tf0I9", propertyConfigurationRuntimeException0);
      assertFalse(propertyConfigurationRuntimeException1.equals((Object)propertyConfigurationRuntimeException0));
  }
}