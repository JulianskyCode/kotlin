/*
 * Copyright 2010-2017 JetBrains s.r.o.
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

package org.jetbrains.kotlin.checkers.javac;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/javac/diagnostics/tests")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class JavacDiagnosticsTestGenerated extends AbstractJavacDiagnosticsTest {
    public void testAllFilesPresentInTests() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/javac/diagnostics/tests"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("compiler/testData/javac/diagnostics/tests/imports")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Imports extends AbstractJavacDiagnosticsTest {
        public void testAllFilesPresentInImports() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/javac/diagnostics/tests/imports"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("AllUnderImportsAmbiguity.kt")
        public void testAllUnderImportsAmbiguity() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/AllUnderImportsAmbiguity.kt");
            doTestWithJavac(fileName);
        }

        @TestMetadata("AllUnderImportsLessPriority.kt")
        public void testAllUnderImportsLessPriority() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/AllUnderImportsLessPriority.kt");
            doTestWithJavac(fileName);
        }

        @TestMetadata("ClassImportsConflicting.kt")
        public void testClassImportsConflicting() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/ClassImportsConflicting.kt");
            doTestWithJavac(fileName);
        }

        @TestMetadata("CurrentPackageAndAllUnderImport.kt")
        public void testCurrentPackageAndAllUnderImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/CurrentPackageAndAllUnderImport.kt");
            doTestWithJavac(fileName);
        }

        @TestMetadata("CurrentPackageAndExplicitImport.kt")
        public void testCurrentPackageAndExplicitImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/CurrentPackageAndExplicitImport.kt");
            doTestWithJavac(fileName);
        }

        @TestMetadata("ImportProtectedClass.kt")
        public void testImportProtectedClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/ImportProtectedClass.kt");
            doTestWithJavac(fileName);
        }

        @TestMetadata("ImportTwoTimes.kt")
        public void testImportTwoTimes() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/ImportTwoTimes.kt");
            doTestWithJavac(fileName);
        }

        @TestMetadata("ImportTwoTimesStar.kt")
        public void testImportTwoTimesStar() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/ImportTwoTimesStar.kt");
            doTestWithJavac(fileName);
        }

        @TestMetadata("InaccessiblePrivateClass.kt")
        public void testInaccessiblePrivateClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/InaccessiblePrivateClass.kt");
            doTestWithJavac(fileName);
        }

        @TestMetadata("NestedClassClash.kt")
        public void testNestedClassClash() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/NestedClassClash.kt");
            doTestWithJavac(fileName);
        }

        @TestMetadata("TopLevelClassVsPackage.kt")
        public void testTopLevelClassVsPackage() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/TopLevelClassVsPackage.kt");
            doTestWithJavac(fileName);
        }
    }

    @TestMetadata("compiler/testData/javac/diagnostics/tests/qualifiedExpression")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class QualifiedExpression extends AbstractJavacDiagnosticsTest {
        public void testAllFilesPresentInQualifiedExpression() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/javac/diagnostics/tests/qualifiedExpression"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("GenericClassVsPackage.kt")
        public void testGenericClassVsPackage() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/qualifiedExpression/GenericClassVsPackage.kt");
            doTestWithJavac(fileName);
        }

        @TestMetadata("PackageVsClass.kt")
        public void testPackageVsClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/qualifiedExpression/PackageVsClass.kt");
            doTestWithJavac(fileName);
        }

        @TestMetadata("PackageVsClass2.kt")
        public void testPackageVsClass2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/qualifiedExpression/PackageVsClass2.kt");
            doTestWithJavac(fileName);
        }

        @TestMetadata("PackageVsRootClass.kt")
        public void testPackageVsRootClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/qualifiedExpression/PackageVsRootClass.kt");
            doTestWithJavac(fileName);
        }

        @TestMetadata("visibleClassVsQualifiedClass.kt")
        public void testVisibleClassVsQualifiedClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/qualifiedExpression/visibleClassVsQualifiedClass.kt");
            doTestWithJavac(fileName);
        }
    }
}
