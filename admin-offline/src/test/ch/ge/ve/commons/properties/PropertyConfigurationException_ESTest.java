/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 03 17:57:07 GMT 2018
 */

package ch.ge.ve.commons.properties;

import org.junit.Test;
import static org.junit.Assert.*;
import ch.ge.ve.commons.properties.PropertyConfigurationException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PropertyConfigurationException_ESTest extends PropertyConfigurationException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockException mockException0 = new MockException();
      PropertyConfigurationException propertyConfigurationException0 = new PropertyConfigurationException("vZgQj>*n#<3xo{+", mockException0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PropertyConfigurationException propertyConfigurationException0 = new PropertyConfigurationException("ch.ge.ve.commons.properties.PropertyConfigurationException");
  }
}
