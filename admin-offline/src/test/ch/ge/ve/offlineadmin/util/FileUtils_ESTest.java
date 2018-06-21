/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 03 17:54:47 GMT 2018
 */

package ch.ge.ve.offlineadmin.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.ge.ve.offlineadmin.util.FileUtils;
import java.io.File;
import java.io.StringReader;
import java.net.URI;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileUtils_ESTest extends FileUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "";
      StringReader stringReader0 = new StringReader("");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      FileUtils fileUtils0 = new FileUtils(propertyResourceBundle0);
      String string1 = "";
      // Undeclared exception!
      try { 
        fileUtils0.promptKeyDirectory();
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find resource for bundle java.util.PropertyResourceBundle, key file_utils.directory_chooser.key_directory.title
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^?IBjhXg");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      FileUtils fileUtils0 = new FileUtils(propertyResourceBundle0);
      File file0 = fileUtils0.getUserHome();
      assertTrue(file0.canWrite());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtils fileUtils0 = new FileUtils((ResourceBundle) null);
      // Undeclared exception!
      try { 
        fileUtils0.promptEncryptedBallotsFile();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ch.ge.ve.offlineadmin.util.FileUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtils fileUtils0 = new FileUtils((ResourceBundle) null);
      String string0 = "t>~F,>T";
      // Undeclared exception!
      try { 
        fileUtils0.promptKeyDirectory();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ch.ge.ve.offlineadmin.util.FileUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ch.ge.ve.offlineadmin.util.FileUtils");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      FileUtils fileUtils0 = new FileUtils(propertyResourceBundle0);
      String string0 = "";
      stringReader0.mark(1);
      String string1 = "user.home";
      URI uRI0 = MockURI.aFileURI;
      URI uRI1 = MockURI.parseServerAuthority(uRI0);
      MockFile mockFile0 = new MockFile(uRI1);
      mockFile0.setLastModified(0L);
      // Undeclared exception!
      try { 
        fileUtils0.getDirectory("user.home", mockFile0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtils fileUtils0 = new FileUtils((ResourceBundle) null);
      File file0 = MockFile.createTempFile("+1u;;O%", "*.ser");
      // Undeclared exception!
      try { 
        fileUtils0.getDirectory("*.ser", file0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "";
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      ResourceBundle.Control resourceBundle_Control0 = ResourceBundle.Control.getNoFallbackControl(list0);
      Locale locale0 = Locale.CANADA_FRENCH;
      resourceBundle_Control0.getCandidateLocales("", locale0);
      locale0.getExtensionKeys();
      // Undeclared exception!
      try { 
        ResourceBundle.getBundle("", resourceBundle_Control0);
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find bundle for base name , locale en
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = ",w3lq&R[u66b";
      StringReader stringReader0 = new StringReader(",w3lq&R[u66b");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      FileUtils fileUtils0 = new FileUtils(propertyResourceBundle0);
      // Undeclared exception!
      try { 
        fileUtils0.promptEncryptedBallotsFile();
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find resource for bundle java.util.PropertyResourceBundle, key file_utils.file_chooser.encrypted_ballots.title
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceBundle.Control.getNoFallbackControl((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle$Control", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtils fileUtils0 = new FileUtils((ResourceBundle) null);
      String string0 = "";
      String string1 = ".|R";
      // Undeclared exception!
      try { 
        fileUtils0.promptKeyDirectory();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ch.ge.ve.offlineadmin.util.FileUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtils fileUtils0 = new FileUtils((ResourceBundle) null);
      // Undeclared exception!
      try { 
        fileUtils0.promptKeyDirectory();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ch.ge.ve.offlineadmin.util.FileUtils", e);
      }
  }
}