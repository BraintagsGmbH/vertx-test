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
 * First: create a directory src/main/asciidoc and src/main/resources inside the project
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
 * In this case running in Eclipse a refresh over the project and then `Maven -> Update Project` 
 * and generating again seems to help. Sometimes this has to done two times.
 * 
 * * Changes in the package-info are not automatically transferred. Before we have to empty the build directory 
 * and then rebuild, including the problems of the previous description.
 * 
 * 
 * @author Michael Remme
 * 
 */

@Document(fileName = "index.adoc")
@GenModule(name = "vertx-test")
package de.braintags.testpackage;

import io.vertx.codegen.annotations.GenModule;
import io.vertx.docgen.Document;

