// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.notes.pro.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.simplemobiletools.commons.views.MyTextInputLayout;
import com.simplemobiletools.notes.pro.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogExportFileBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout exportFileHolder;

  @NonNull
  public final TextInputEditText extension;

  @NonNull
  public final MyTextInputLayout extensionHint;

  @NonNull
  public final TextInputEditText fileName;

  @NonNull
  public final MyTextInputLayout fileNameHint;

  @NonNull
  public final TextInputEditText filePath;

  @NonNull
  public final MyTextInputLayout filePathHint;

  private DialogExportFileBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout exportFileHolder, @NonNull TextInputEditText extension,
      @NonNull MyTextInputLayout extensionHint, @NonNull TextInputEditText fileName,
      @NonNull MyTextInputLayout fileNameHint, @NonNull TextInputEditText filePath,
      @NonNull MyTextInputLayout filePathHint) {
    this.rootView = rootView;
    this.exportFileHolder = exportFileHolder;
    this.extension = extension;
    this.extensionHint = extensionHint;
    this.fileName = fileName;
    this.fileNameHint = fileNameHint;
    this.filePath = filePath;
    this.filePathHint = filePathHint;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogExportFileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogExportFileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_export_file, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogExportFileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout exportFileHolder = (LinearLayout) rootView;

      id = R.id.extension;
      TextInputEditText extension = ViewBindings.findChildViewById(rootView, id);
      if (extension == null) {
        break missingId;
      }

      id = R.id.extension_hint;
      MyTextInputLayout extensionHint = ViewBindings.findChildViewById(rootView, id);
      if (extensionHint == null) {
        break missingId;
      }

      id = R.id.file_name;
      TextInputEditText fileName = ViewBindings.findChildViewById(rootView, id);
      if (fileName == null) {
        break missingId;
      }

      id = R.id.file_name_hint;
      MyTextInputLayout fileNameHint = ViewBindings.findChildViewById(rootView, id);
      if (fileNameHint == null) {
        break missingId;
      }

      id = R.id.file_path;
      TextInputEditText filePath = ViewBindings.findChildViewById(rootView, id);
      if (filePath == null) {
        break missingId;
      }

      id = R.id.file_path_hint;
      MyTextInputLayout filePathHint = ViewBindings.findChildViewById(rootView, id);
      if (filePathHint == null) {
        break missingId;
      }

      return new DialogExportFileBinding((LinearLayout) rootView, exportFileHolder, extension,
          extensionHint, fileName, fileNameHint, filePath, filePathHint);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
