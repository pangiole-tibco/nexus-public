/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2008-present Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.repository.storage;

import java.util.List;
import java.util.Map;

import org.sonatype.nexus.repository.Repository;

/**
 * Component management director.
 *
 * @since 3.stage.move
 */
public interface ComponentDirector
{
  default Component afterMove(final Component component, final Repository destination) {
    return component;
  }

  default boolean allowMoveTo(final Repository destination) {
    return false;
  }

  default boolean allowMoveTo(final Component component, final Repository destination) {
    return false;
  }

  default boolean allowMoveFrom(final Repository source) {
    return false;
  }

  default void afterMove(final List<Map<String, String>> components, final Repository destination) {
    // no-op
  }
}