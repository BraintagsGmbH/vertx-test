/*
 * #%L
 * vertx-pojongo
 * %%
 * Copyright (C) 2015 Braintags GmbH
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */

/**
 * == Using package-info to create real documentation
 * 
 * Using the package-info as documentation source has several advantages. 
 * * We are keeping code and documentation one more time together, like with javadoc. 
 * * We are able to link to classes inside the documentation, those links are aiming to the javadoc
 * * We are able to link to methods of a class, which will display the content of the method at that place inside the generated documentation 
 * 
 * 
 * == How to create documentation by using the package-info.java
 * 
 * * First: create a directory src/main/asciidoc and src/main/resources inside the project
 * * VERY IMPORTANT: add some annotations to the package-info before the package definition:
 * ** @Document(fileName = "index.adoc")
 * ** @GenModule(name = "vertx-test", groupPackageName = "de.braintags")
 * Especially the parameter groupPackageName is very important and must fit the current package. Its default value is "io.vertx". 
 * If you don't adapt that to your classpath, some very unexpected results will and errors occur ( see above )
 * 
 * 
 * Linking to a class like in javadoc {@link de.braintags.testpackage.DemoClass}
 *
 * We want to embed some source code. Create a class under example and link to the method you want to display.
 * Here a method without parameters:
 *
 * [source,java]
 * ----
 * {@link examples.Examples#example1()}
 * ----
 * 
 * Here an example with parameter:
 *
 * [source,java]
 * ----
 * {@link examples.Examples#example2(java.lang.String)}
 * ----
 * 
 * 
 * Some textformats:
 * *Bold text*
 * 
 * Enumerations:
 * * First entry
 * * second entry
 * ** subentry 1
 * ** subentry 2
 * 
 * 
 * Code text inside a line `is done by that` and will change
 * 
 * 
 * *Source as xml*
 * [source,xml,subs="+attributes"]
 * ----
 * <dependency>
 *   <groupId>{maven-groupId}</groupId>
 *   <artifactId>{maven-artifactId}</artifactId>
 *   <version>{maven-version}</version>
 * </dependency>
 * ----
 * 
 * More information you will find at http://www.methods.co.nz/asciidoc/userguide.html#_text_formatting
 * 
 * === Currently known problems:
 * * When cleaning the build directory complete and restarting the build, then an error is thrown like this
 * `[ERROR] /Users/mremme/workspace/vertx/vertx-test/src/main/java/de/braintags/testpackage/package-info.java:[73,1] 
 * Could not generate model for de.braintags.testpackage: A module package name (de.braintags.testpackage) 
 * must be prefixed by the group package name (io.vertx)`
 * 
 * SOLUTION: Define the parameter "groupPackageName" in annotation @GenModule
 * 
 * 
 * 
 * @author Michael Remme
 * 
 */

@Document(fileName = "index.adoc")
@GenModule(name = "vertx-test", groupPackageName = "de.braintags")
package de.braintags.testpackage;

import io.vertx.codegen.annotations.GenModule;
import io.vertx.docgen.Document;

