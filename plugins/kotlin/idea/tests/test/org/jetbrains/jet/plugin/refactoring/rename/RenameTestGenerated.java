/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.plugin.refactoring.rename;

import com.intellij.testFramework.TestDataPath;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/refactoring/rename")
@TestDataPath("$PROJECT_ROOT")
public class RenameTestGenerated extends AbstractRenameTest {
    public void testAllFilesPresentInRename() throws Exception {
        JetTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/refactoring/rename"), Pattern.compile("^(.+)\\.test$"));
    }
    
    @TestMetadata("renameCompareTo/compareTo.test")
    public void testRenameCompareTo_CompareTo() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameCompareTo/compareTo.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameContains/contains.test")
    public void testRenameContains_Contains() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameContains/contains.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameContainsWithConflicts/containsWithConflicts.test")
    public void testRenameContainsWithConflicts_ContainsWithConflicts() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameContainsWithConflicts/containsWithConflicts.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameEquals/equals.test")
    public void testRenameEquals_Equals() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameEquals/equals.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameExplicitComponentFunction/explicitComponentFunction.test")
    public void testRenameExplicitComponentFunction_ExplicitComponentFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameExplicitComponentFunction/explicitComponentFunction.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameGet/get.test")
    public void testRenameGet_Get() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameGet/get.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameInc/inc.test")
    public void testRenameInc_Inc() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameInc/inc.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameInvoke/invoke.test")
    public void testRenameInvoke_Invoke() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameInvoke/invoke.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameIterator/iterator.test")
    public void testRenameIterator_Iterator() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameIterator/iterator.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameJavaClass/renameJavaClass.test")
    public void testRenameJavaClass_RenameJavaClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameJavaClass/renameJavaClass.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameJavaInterface/renameJavaInterface.test")
    public void testRenameJavaInterface_RenameJavaInterface() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameJavaInterface/renameJavaInterface.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameJavaMethod/javaBaseMethod.test")
    public void testRenameJavaMethod_JavaBaseMethod() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameJavaMethod/javaBaseMethod.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameJavaMethod/kotlinOverridenMethod.test")
    public void testRenameJavaMethod_KotlinOverridenMethod() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameJavaMethod/kotlinOverridenMethod.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinBaseMethod/javaWrapperForBaseFunction.test")
    public void testRenameKotlinBaseMethod_JavaWrapperForBaseFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinBaseMethod/javaWrapperForBaseFunction.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinBaseMethod/javaWrapperForOverridenFunctionWithKotlinBase.test")
    public void testRenameKotlinBaseMethod_JavaWrapperForOverridenFunctionWithKotlinBase() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinBaseMethod/javaWrapperForOverridenFunctionWithKotlinBase.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinBaseMethod/kotlinBaseFunction.test")
    public void testRenameKotlinBaseMethod_KotlinBaseFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinBaseMethod/kotlinBaseFunction.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinClass/javaWrapperForKotlinClass.test")
    public void testRenameKotlinClass_JavaWrapperForKotlinClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinClass/javaWrapperForKotlinClass.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinClass/kotlinClass.test")
    public void testRenameKotlinClass_KotlinClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinClass/kotlinClass.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinClassConstructor/renameKotlinConstructor.test")
    public void testRenameKotlinClassConstructor_RenameKotlinConstructor() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinClassConstructor/renameKotlinConstructor.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinClassWithFile/javaClassWrapper.test")
    public void testRenameKotlinClassWithFile_JavaClassWrapper() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinClassWithFile/javaClassWrapper.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinClassWithFile/kotlinClass.test")
    public void testRenameKotlinClassWithFile_KotlinClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinClassWithFile/kotlinClass.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinMethod/javaWrapperForKotlinMethod.test")
    public void testRenameKotlinMethod_JavaWrapperForKotlinMethod() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinMethod/javaWrapperForKotlinMethod.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinMethod/renameKotlinMethod.test")
    public void testRenameKotlinMethod_RenameKotlinMethod() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinMethod/renameKotlinMethod.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinPackage/renameInOtherFile.test")
    public void testRenameKotlinPackage_RenameInOtherFile() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinPackage/renameInOtherFile.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinPackage/renameKotlinPackage.test")
    public void testRenameKotlinPackage_RenameKotlinPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinPackage/renameKotlinPackage.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinPackageClass/javaWrapperForKotlinPackageClass.test")
    public void testRenameKotlinPackageClass_JavaWrapperForKotlinPackageClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinPackageClass/javaWrapperForKotlinPackageClass.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinPackageFunctionFromJava/renameKotlinPackageFunctionFromJava.test")
    public void testRenameKotlinPackageFunctionFromJava_RenameKotlinPackageFunctionFromJava() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinPackageFunctionFromJava/renameKotlinPackageFunctionFromJava.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinValProperty/renameAsJavaGetterForExplicitGetter.test")
    public void testRenameKotlinValProperty_RenameAsJavaGetterForExplicitGetter() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinValProperty/renameAsJavaGetterForExplicitGetter.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinValProperty/renameBase.test")
    public void testRenameKotlinValProperty_RenameBase() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinValProperty/renameBase.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinValProperty/renameOverriden.test")
    public void testRenameKotlinValProperty_RenameOverriden() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinValProperty/renameOverriden.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinVarProperty/renameAsJavaGetter.test")
    public void testRenameKotlinVarProperty_RenameAsJavaGetter() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinVarProperty/renameAsJavaGetter.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinVarProperty/renameAsJavaSetter.test")
    public void testRenameKotlinVarProperty_RenameAsJavaSetter() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinVarProperty/renameAsJavaSetter.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinVarProperty/renameBase.test")
    public void testRenameKotlinVarProperty_RenameBase() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinVarProperty/renameBase.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameKotlinVarProperty/renameOverriden.test")
    public void testRenameKotlinVarProperty_RenameOverriden() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameKotlinVarProperty/renameOverriden.test");
        doTest(fileName);
    }
    
    @TestMetadata("renamePlus/plus.test")
    public void testRenamePlus_Plus() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renamePlus/plus.test");
        doTest(fileName);
    }
    
    @TestMetadata("renamePlusAssign/plusAssign.test")
    public void testRenamePlusAssign_PlusAssign() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renamePlusAssign/plusAssign.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameSet/set.test")
    public void testRenameSet_Set() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameSet/set.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameSynthesizedComponentFunction/synthesizedComponentFunction.test")
    public void testRenameSynthesizedComponentFunction_SynthesizedComponentFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameSynthesizedComponentFunction/synthesizedComponentFunction.test");
        doTest(fileName);
    }
    
    @TestMetadata("renameUnaryMinus/unaryMinus.test")
    public void testRenameUnaryMinus_UnaryMinus() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/rename/renameUnaryMinus/unaryMinus.test");
        doTest(fileName);
    }
    
}
