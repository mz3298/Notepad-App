// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.notes.pro.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.simplemobiletools.commons.views.MyTextView;
import com.simplemobiletools.notes.pro.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class DatetimePatternInfoLayoutBinding implements ViewBinding {
  @NonNull
  private final MyTextView rootView;

  @NonNull
  public final MyTextView dateTimePatternInfo;

  private DatetimePatternInfoLayoutBinding(@NonNull MyTextView rootView,
      @NonNull MyTextView dateTimePatternInfo) {
    this.rootView = rootView;
    this.dateTimePatternInfo = dateTimePatternInfo;
  }

  @Override
  @NonNull
  public MyTextView getRoot() {
    return rootView;
  }

  @NonNull
  public static DatetimePatternInfoLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DatetimePatternInfoLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.datetime_pattern_info_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DatetimePatternInfoLayoutBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    MyTextView dateTimePatternInfo = (MyTextView) rootView;

    return new DatetimePatternInfoLayoutBinding((MyTextView) rootView, dateTimePatternInfo);
  }
}