/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 03 17:49:09 GMT 2018
 */

package ch.ge.ve.offlineadmin.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import ch.ge.ve.offlineadmin.exception.ProcessInterruptedException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProcessInterruptedException_ESTest extends ProcessInterruptedException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ProcessInterruptedException processInterruptedException0 = new ProcessInterruptedException("");
      MockThrowable mockThrowable0 = new MockThrowable(processInterruptedException0);
      ProcessInterruptedException processInterruptedException1 = new ProcessInterruptedException("", mockThrowable0);
      assertFalse(processInterruptedException1.equals((Object)processInterruptedException0));
  }
}
