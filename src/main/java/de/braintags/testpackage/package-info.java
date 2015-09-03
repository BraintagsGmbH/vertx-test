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
 * == Test for documentation and generation of documentation
 * 
 * First: create a directory src/main/asciidoc and src/main/resources
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
 * {@link examples.Examples#example2( java.lang.String)}
 * ----
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

