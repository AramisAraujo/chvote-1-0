/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 03 17:57:16 GMT 2018
 */

package ch.ge.ve.commons.fileutils;

import org.junit.Test;
import static org.junit.Assert.*;
import ch.ge.ve.commons.fileutils.FileOperationRuntimeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileOperationRuntimeException_ESTest extends FileOperationRuntimeException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileOperationRuntimeException fileOperationRuntimeException0 = new FileOperationRuntimeException("ch.ge.ve.commons.fileutils.FileOperationRuntimeException");
      FileOperationRuntimeException fileOperationRuntimeException1 = new FileOperationRuntimeException(fileOperationRuntimeException0);
      assertFalse(fileOperationRuntimeException1.equals((Object)fileOperationRuntimeException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileOperationRuntimeException fileOperationRuntimeException0 = new FileOperationRuntimeException("ch.ge.ve.commons.fileutils.FileOperationRuntimeException");
      FileOperationRuntimeException fileOperationRuntimeException1 = new FileOperationRuntimeException("ch.ge.ve.commons.fileutils.FileOperationRuntimeException", fileOperationRuntimeException0, false, false);
      assertFalse(fileOperationRuntimeException1.equals((Object)fileOperationRuntimeException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileOperationRuntimeException fileOperationRuntimeException0 = new FileOperationRuntimeException("ch.ge.ve.commons.fileutils.FileOperationRuntimeException");
      FileOperationRuntimeException fileOperationRuntimeException1 = new FileOperationRuntimeException("Tck", fileOperationRuntimeException0);
      assertFalse(fileOperationRuntimeException1.equals((Object)fileOperationRuntimeException0));
  }
}
