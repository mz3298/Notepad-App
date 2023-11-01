// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.notes.pro.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.simplemobiletools.commons.views.MyAppCompatCheckbox;
import com.simplemobiletools.notes.pro.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogNewChecklistItemBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageView addItem;

  @NonNull
  public final LinearLayout checklistHolder;

  @NonNull
  public final ScrollView dialogHolder;

  @NonNull
  public final MyAppCompatCheckbox settingsAddChecklistTop;

  private DialogNewChecklistItemBinding(@NonNull ScrollView rootView, @NonNull ImageView addItem,
      @NonNull LinearLayout checklistHolder, @NonNull ScrollView dialogHolder,
      @NonNull MyAppCompatCheckbox settingsAddChecklistTop) {
    this.rootView = rootView;
    this.addItem = addItem;
    this.checklistHolder = checklistHolder;
    this.dialogHolder = dialogHolder;
    this.settingsAddChecklistTop = settingsAddChecklistTop;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogNewChecklistItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogNewChecklistItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_new_checklist_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogNewChecklistItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_item;
      ImageView addItem = ViewBindings.findChildViewById(rootView, id);
      if (addItem == null) {
        break missingId;
      }

      id = R.id.checklist_holder;
      LinearLayout checklistHolder = ViewBindings.findChildViewById(rootView, id);
      if (checklistHolder == null) {
        break missingId;
      }

      ScrollView dialogHolder = (ScrollView) rootView;

      id = R.id.settings_add_checklist_top;
      MyAppCompatCheckbox settingsAddChecklistTop = ViewBindings.findChildViewById(rootView, id);
      if (settingsAddChecklistTop == null) {
        break missingId;
      }

      return new DialogNewChecklistItemBinding((ScrollView) rootView, addItem, checklistHolder,
          dialogHolder, settingsAddChecklistTop);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
