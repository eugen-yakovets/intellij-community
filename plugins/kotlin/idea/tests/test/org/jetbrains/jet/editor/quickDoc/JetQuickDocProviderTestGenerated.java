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

package org.jetbrains.jet.editor.quickDoc;

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
@TestMetadata("idea/testData/editor/quickDoc")
@TestDataPath("$PROJECT_ROOT")
public class JetQuickDocProviderTestGenerated extends AbstractJetQuickDocProviderTest {
    public void testAllFilesPresentInQuickDoc() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/editor/quickDoc"), Pattern.compile("^([^_]+)\\.[^\\.]*$"), true);
    }
    
    @TestMetadata("AtFunctionParameter.kt")
    public void testAtFunctionParameter() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/quickDoc/AtFunctionParameter.kt");
        doTest(fileName);
    }
    
    @TestMetadata("AtTypeParameter.kt")
    public void testAtTypeParameter() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/quickDoc/AtTypeParameter.kt");
        doTest(fileName);
    }
    
    @TestMetadata("AtVariableDeclaration.kt")
    public void testAtVariableDeclaration() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/quickDoc/AtVariableDeclaration.kt");
        doTest(fileName);
    }
    
    @TestMetadata("JavaClassUsedInKotlin.kt")
    public void testJavaClassUsedInKotlin() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/quickDoc/JavaClassUsedInKotlin.kt");
        doTest(fileName);
    }
    
    @TestMetadata("JavaMethodUsedInKotlin.kt")
    public void testJavaMethodUsedInKotlin() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/quickDoc/JavaMethodUsedInKotlin.kt");
        doTest(fileName);
    }
    
    @TestMetadata("KotlinClassUsedFromJava.java")
    public void testKotlinClassUsedFromJava() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/quickDoc/KotlinClassUsedFromJava.java");
        doTest(fileName);
    }
    
    @TestMetadata("KotlinPackageClassUsedFromJava.java")
    public void testKotlinPackageClassUsedFromJava() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/quickDoc/KotlinPackageClassUsedFromJava.java");
        doTest(fileName);
    }
    
    @TestMetadata("MethodFromStdLib.kt")
    public void testMethodFromStdLib() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/quickDoc/MethodFromStdLib.kt");
        doTest(fileName);
    }
    
    @TestMetadata("OnClassDeclarationWithNoPackage.kt")
    public void testOnClassDeclarationWithNoPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/quickDoc/OnClassDeclarationWithNoPackage.kt");
        doTest(fileName);
    }
    
    @TestMetadata("OnFunctionDeclarationWithPackage.kt")
    public void testOnFunctionDeclarationWithPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/quickDoc/OnFunctionDeclarationWithPackage.kt");
        doTest(fileName);
    }
    
    @TestMetadata("OnMethodUsage.kt")
    public void testOnMethodUsage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/quickDoc/OnMethodUsage.kt");
        doTest(fileName);
    }
    
    @TestMetadata("TopLevelMethodFromJava.java")
    public void testTopLevelMethodFromJava() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/quickDoc/TopLevelMethodFromJava.java");
        doTest(fileName);
    }
    
}
