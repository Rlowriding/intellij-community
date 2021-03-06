// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.editorconfig.configmanagement.editor;

import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileEditor.FileEditor;
import com.intellij.openapi.fileEditor.TextEditor;
import com.intellij.openapi.fileEditor.TextEditorWithPreview;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.pom.Navigatable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class EditorConfigEditorWithPreview extends TextEditorWithPreview implements TextEditor {
  public EditorConfigEditorWithPreview(@NotNull TextEditor editor, @NotNull FileEditor preview) {
    super(editor, preview);
  }

  @NotNull
  @Override
  public Editor getEditor() {
    return getTextEditor().getEditor();
  }

  @Nullable
  @Override
  public VirtualFile getFile() {
    return getTextEditor().getFile();
  }

  @Override
  public boolean canNavigateTo(@NotNull Navigatable navigatable) {
    return getTextEditor().canNavigateTo(navigatable);
  }

  @Override
  public void navigateTo(@NotNull Navigatable navigatable) {
    getTextEditor().navigateTo(navigatable);
  }
}