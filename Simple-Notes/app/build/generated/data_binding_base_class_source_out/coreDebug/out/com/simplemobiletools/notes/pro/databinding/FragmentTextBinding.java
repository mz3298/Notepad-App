// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.notes.pro.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.simplemobiletools.commons.views.MyTextView;
import com.simplemobiletools.notes.pro.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentTextBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout noteFragmentHolder;

  @NonNull
  public final ImageView noteLockedImage;

  @NonNull
  public final MyTextView noteLockedLabel;

  @NonNull
  public final RelativeLayout noteLockedLayout;

  @NonNull
  public final TextView noteLockedShow;

  @NonNull
  public final MyTextView notesCounter;

  @NonNull
  public final RelativeLayout notesRelativeLayout;

  @NonNull
  public final ScrollView notesScrollview;

  private FragmentTextBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout noteFragmentHolder, @NonNull ImageView noteLockedImage,
      @NonNull MyTextView noteLockedLabel, @NonNull RelativeLayout noteLockedLayout,
      @NonNull TextView noteLockedShow, @NonNull MyTextView notesCounter,
      @NonNull RelativeLayout notesRelativeLayout, @NonNull ScrollView notesScrollview) {
    this.rootView = rootView;
    this.noteFragmentHolder = noteFragmentHolder;
    this.noteLockedImage = noteLockedImage;
    this.noteLockedLabel = noteLockedLabel;
    this.noteLockedLayout = noteLockedLayout;
    this.noteLockedShow = noteLockedShow;
    this.notesCounter = notesCounter;
    this.notesRelativeLayout = notesRelativeLayout;
    this.notesScrollview = notesScrollview;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTextBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_text, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTextBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout noteFragmentHolder = (RelativeLayout) rootView;

      id = R.id.note_locked_image;
      ImageView noteLockedImage = ViewBindings.findChildViewById(rootView, id);
      if (noteLockedImage == null) {
        break missingId;
      }

      id = R.id.note_locked_label;
      MyTextView noteLockedLabel = ViewBindings.findChildViewById(rootView, id);
      if (noteLockedLabel == null) {
        break missingId;
      }

      id = R.id.note_locked_layout;
      RelativeLayout noteLockedLayout = ViewBindings.findChildViewById(rootView, id);
      if (noteLockedLayout == null) {
        break missingId;
      }

      id = R.id.note_locked_show;
      TextView noteLockedShow = ViewBindings.findChildViewById(rootView, id);
      if (noteLockedShow == null) {
        break missingId;
      }

      id = R.id.notes_counter;
      MyTextView notesCounter = ViewBindings.findChildViewById(rootView, id);
      if (notesCounter == null) {
        break missingId;
      }

      id = R.id.notes_relative_layout;
      RelativeLayout notesRelativeLayout = ViewBindings.findChildViewById(rootView, id);
      if (notesRelativeLayout == null) {
        break missingId;
      }

      id = R.id.notes_scrollview;
      ScrollView notesScrollview = ViewBindings.findChildViewById(rootView, id);
      if (notesScrollview == null) {
        break missingId;
      }

      return new FragmentTextBinding((RelativeLayout) rootView, noteFragmentHolder, noteLockedImage,
          noteLockedLabel, noteLockedLayout, noteLockedShow, notesCounter, notesRelativeLayout,
          notesScrollview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
