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

public final class DialogExportFilesBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout exportFilesHolder;

  @NonNull
  public final TextInputEditText extension;

  @NonNull
  public final MyTextInputLayout extensionHint;

  @NonNull
  public final TextInputEditText folderPath;

  @NonNull
  public final MyTextInputLayout folderPathHint;

  private DialogExportFilesBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout exportFilesHolder, @NonNull TextInputEditText extension,
      @NonNull MyTextInputLayout extensionHint, @NonNull TextInputEditText folderPath,
      @NonNull MyTextInputLayout folderPathHint) {
    this.rootView = rootView;
    this.exportFilesHolder = exportFilesHolder;
    this.extension = extension;
    this.extensionHint = extensionHint;
    this.folderPath = folderPath;
    this.folderPathHint = folderPathHint;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogExportFilesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogExportFilesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_export_files, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogExportFilesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout exportFilesHolder = (LinearLayout) rootView;

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

      id = R.id.folder_path;
      TextInputEditText folderPath = ViewBindings.findChildViewById(rootView, id);
      if (folderPath == null) {
        break missingId;
      }

      id = R.id.folder_path_hint;
      MyTextInputLayout folderPathHint = ViewBindings.findChildViewById(rootView, id);
      if (folderPathHint == null) {
        break missingId;
      }

      return new DialogExportFilesBinding((LinearLayout) rootView, exportFilesHolder, extension,
          extensionHint, folderPath, folderPathHint);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}