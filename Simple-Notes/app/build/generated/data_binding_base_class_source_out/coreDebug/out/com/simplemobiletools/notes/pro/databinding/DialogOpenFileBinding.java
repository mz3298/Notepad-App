// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.notes.pro.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.simplemobiletools.commons.views.MyCompatRadioButton;
import com.simplemobiletools.commons.views.MyTextInputLayout;
import com.simplemobiletools.notes.pro.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogOpenFileBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MyCompatRadioButton openFileContentOnly;

  @NonNull
  public final TextInputEditText openFileFilename;

  @NonNull
  public final MyTextInputLayout openFileFilenameHint;

  @NonNull
  public final LinearLayout openFileHolder;

  @NonNull
  public final RadioGroup openFileType;

  @NonNull
  public final MyCompatRadioButton openFileUpdateFile;

  private DialogOpenFileBinding(@NonNull LinearLayout rootView,
      @NonNull MyCompatRadioButton openFileContentOnly, @NonNull TextInputEditText openFileFilename,
      @NonNull MyTextInputLayout openFileFilenameHint, @NonNull LinearLayout openFileHolder,
      @NonNull RadioGroup openFileType, @NonNull MyCompatRadioButton openFileUpdateFile) {
    this.rootView = rootView;
    this.openFileContentOnly = openFileContentOnly;
    this.openFileFilename = openFileFilename;
    this.openFileFilenameHint = openFileFilenameHint;
    this.openFileHolder = openFileHolder;
    this.openFileType = openFileType;
    this.openFileUpdateFile = openFileUpdateFile;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogOpenFileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogOpenFileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_open_file, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogOpenFileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.open_file_content_only;
      MyCompatRadioButton openFileContentOnly = ViewBindings.findChildViewById(rootView, id);
      if (openFileContentOnly == null) {
        break missingId;
      }

      id = R.id.open_file_filename;
      TextInputEditText openFileFilename = ViewBindings.findChildViewById(rootView, id);
      if (openFileFilename == null) {
        break missingId;
      }

      id = R.id.open_file_filename_hint;
      MyTextInputLayout openFileFilenameHint = ViewBindings.findChildViewById(rootView, id);
      if (openFileFilenameHint == null) {
        break missingId;
      }

      LinearLayout openFileHolder = (LinearLayout) rootView;

      id = R.id.open_file_type;
      RadioGroup openFileType = ViewBindings.findChildViewById(rootView, id);
      if (openFileType == null) {
        break missingId;
      }

      id = R.id.open_file_update_file;
      MyCompatRadioButton openFileUpdateFile = ViewBindings.findChildViewById(rootView, id);
      if (openFileUpdateFile == null) {
        break missingId;
      }

      return new DialogOpenFileBinding((LinearLayout) rootView, openFileContentOnly,
          openFileFilename, openFileFilenameHint, openFileHolder, openFileType, openFileUpdateFile);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
