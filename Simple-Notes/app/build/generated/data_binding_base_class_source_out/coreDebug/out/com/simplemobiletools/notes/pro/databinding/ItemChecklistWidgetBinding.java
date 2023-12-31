// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.notes.pro.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.simplemobiletools.notes.pro.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemChecklistWidgetBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView checklistTextCenter;

  @NonNull
  public final TextView checklistTextCenterMonospace;

  @NonNull
  public final RelativeLayout checklistTextHolder;

  @NonNull
  public final TextView checklistTextLeft;

  @NonNull
  public final TextView checklistTextLeftMonospace;

  @NonNull
  public final TextView checklistTextRight;

  @NonNull
  public final TextView checklistTextRightMonospace;

  private ItemChecklistWidgetBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView checklistTextCenter, @NonNull TextView checklistTextCenterMonospace,
      @NonNull RelativeLayout checklistTextHolder, @NonNull TextView checklistTextLeft,
      @NonNull TextView checklistTextLeftMonospace, @NonNull TextView checklistTextRight,
      @NonNull TextView checklistTextRightMonospace) {
    this.rootView = rootView;
    this.checklistTextCenter = checklistTextCenter;
    this.checklistTextCenterMonospace = checklistTextCenterMonospace;
    this.checklistTextHolder = checklistTextHolder;
    this.checklistTextLeft = checklistTextLeft;
    this.checklistTextLeftMonospace = checklistTextLeftMonospace;
    this.checklistTextRight = checklistTextRight;
    this.checklistTextRightMonospace = checklistTextRightMonospace;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemChecklistWidgetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemChecklistWidgetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_checklist_widget, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemChecklistWidgetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.checklist_text_center;
      TextView checklistTextCenter = ViewBindings.findChildViewById(rootView, id);
      if (checklistTextCenter == null) {
        break missingId;
      }

      id = R.id.checklist_text_center_monospace;
      TextView checklistTextCenterMonospace = ViewBindings.findChildViewById(rootView, id);
      if (checklistTextCenterMonospace == null) {
        break missingId;
      }

      RelativeLayout checklistTextHolder = (RelativeLayout) rootView;

      id = R.id.checklist_text_left;
      TextView checklistTextLeft = ViewBindings.findChildViewById(rootView, id);
      if (checklistTextLeft == null) {
        break missingId;
      }

      id = R.id.checklist_text_left_monospace;
      TextView checklistTextLeftMonospace = ViewBindings.findChildViewById(rootView, id);
      if (checklistTextLeftMonospace == null) {
        break missingId;
      }

      id = R.id.checklist_text_right;
      TextView checklistTextRight = ViewBindings.findChildViewById(rootView, id);
      if (checklistTextRight == null) {
        break missingId;
      }

      id = R.id.checklist_text_right_monospace;
      TextView checklistTextRightMonospace = ViewBindings.findChildViewById(rootView, id);
      if (checklistTextRightMonospace == null) {
        break missingId;
      }

      return new ItemChecklistWidgetBinding((RelativeLayout) rootView, checklistTextCenter,
          checklistTextCenterMonospace, checklistTextHolder, checklistTextLeft,
          checklistTextLeftMonospace, checklistTextRight, checklistTextRightMonospace);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
