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

public final class DialogRenameChecklistItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MyTextInputLayout checklistItemHint;

  @NonNull
  public final TextInputEditText checklistItemTitle;

  @NonNull
  public final LinearLayout dialogHolder;

  private DialogRenameChecklistItemBinding(@NonNull LinearLayout rootView,
      @NonNull MyTextInputLayout checklistItemHint, @NonNull TextInputEditText checklistItemTitle,
      @NonNull LinearLayout dialogHolder) {
    this.rootView = rootView;
    this.checklistItemHint = checklistItemHint;
    this.checklistItemTitle = checklistItemTitle;
    this.dialogHolder = dialogHolder;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogRenameChecklistItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogRenameChecklistItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_rename_checklist_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogRenameChecklistItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.checklist_item_hint;
      MyTextInputLayout checklistItemHint = ViewBindings.findChildViewById(rootView, id);
      if (checklistItemHint == null) {
        break missingId;
      }

      id = R.id.checklist_item_title;
      TextInputEditText checklistItemTitle = ViewBindings.findChildViewById(rootView, id);
      if (checklistItemTitle == null) {
        break missingId;
      }

      LinearLayout dialogHolder = (LinearLayout) rootView;

      return new DialogRenameChecklistItemBinding((LinearLayout) rootView, checklistItemHint,
          checklistItemTitle, dialogHolder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
