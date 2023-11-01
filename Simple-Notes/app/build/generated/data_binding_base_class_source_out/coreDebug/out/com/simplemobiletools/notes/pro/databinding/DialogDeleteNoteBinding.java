// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.notes.pro.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.simplemobiletools.commons.views.MyAppCompatCheckbox;
import com.simplemobiletools.commons.views.MyTextView;
import com.simplemobiletools.notes.pro.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogDeleteNoteBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MyAppCompatCheckbox deleteNoteCheckbox;

  @NonNull
  public final RelativeLayout deleteNoteCheckboxHolder;

  @NonNull
  public final MyTextView deleteNoteDescription;

  @NonNull
  public final LinearLayout deleteNoteHolder;

  private DialogDeleteNoteBinding(@NonNull LinearLayout rootView,
      @NonNull MyAppCompatCheckbox deleteNoteCheckbox,
      @NonNull RelativeLayout deleteNoteCheckboxHolder, @NonNull MyTextView deleteNoteDescription,
      @NonNull LinearLayout deleteNoteHolder) {
    this.rootView = rootView;
    this.deleteNoteCheckbox = deleteNoteCheckbox;
    this.deleteNoteCheckboxHolder = deleteNoteCheckboxHolder;
    this.deleteNoteDescription = deleteNoteDescription;
    this.deleteNoteHolder = deleteNoteHolder;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogDeleteNoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogDeleteNoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_delete_note, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogDeleteNoteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.delete_note_checkbox;
      MyAppCompatCheckbox deleteNoteCheckbox = ViewBindings.findChildViewById(rootView, id);
      if (deleteNoteCheckbox == null) {
        break missingId;
      }

      id = R.id.delete_note_checkbox_holder;
      RelativeLayout deleteNoteCheckboxHolder = ViewBindings.findChildViewById(rootView, id);
      if (deleteNoteCheckboxHolder == null) {
        break missingId;
      }

      id = R.id.delete_note_description;
      MyTextView deleteNoteDescription = ViewBindings.findChildViewById(rootView, id);
      if (deleteNoteDescription == null) {
        break missingId;
      }

      LinearLayout deleteNoteHolder = (LinearLayout) rootView;

      return new DialogDeleteNoteBinding((LinearLayout) rootView, deleteNoteCheckbox,
          deleteNoteCheckboxHolder, deleteNoteDescription, deleteNoteHolder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}