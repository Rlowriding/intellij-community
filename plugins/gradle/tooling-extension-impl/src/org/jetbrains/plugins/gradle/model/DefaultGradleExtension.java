// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.jetbrains.plugins.gradle.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author Vladislav.Soroka
 */
public class DefaultGradleExtension extends DefaultGradleProperty implements GradleExtension {
  private static final long serialVersionUID = 1L;

  public DefaultGradleExtension(@NotNull String name, @Nullable String typeFqn) {
    super(name, typeFqn, null);
  }

  @SuppressWarnings("unused")
  private DefaultGradleExtension() {
    super();
  }

  public DefaultGradleExtension(GradleExtension extension) {
    this(extension.getName(), extension.getTypeFqn());
  }
}
