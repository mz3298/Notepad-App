// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.notes.pro.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.PagerTabStrip;
import com.google.android.material.appbar.MaterialToolbar;
import com.simplemobiletools.commons.views.MyViewPager;
import com.simplemobiletools.notes.pro.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final CoordinatorLayout mainCoordinator;

  @NonNull
  public final LinearLayout mainLinearLayout;

  @NonNull
  public final MaterialToolbar mainToolbar;

  @NonNull
  public final PagerTabStrip pagerTabStrip;

  @NonNull
  public final View searchWrapper;

  @NonNull
  public final MyViewPager viewPager;

  private ActivityMainBinding(@NonNull CoordinatorLayout rootView,
      @NonNull CoordinatorLayout mainCoordinator, @NonNull LinearLayout mainLinearLayout,
      @NonNull MaterialToolbar mainToolbar, @NonNull PagerTabStrip pagerTabStrip,
      @NonNull View searchWrapper, @NonNull MyViewPager viewPager) {
    this.rootView = rootView;
    this.mainCoordinator = mainCoordinator;
    this.mainLinearLayout = mainLinearLayout;
    this.mainToolbar = mainToolbar;
    this.pagerTabStrip = pagerTabStrip;
    this.searchWrapper = searchWrapper;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CoordinatorLayout mainCoordinator = (CoordinatorLayout) rootView;

      id = R.id.main_linear_layout;
      LinearLayout mainLinearLayout = ViewBindings.findChildViewById(rootView, id);
      if (mainLinearLayout == null) {
        break missingId;
      }

      id = R.id.main_toolbar;
      MaterialToolbar mainToolbar = ViewBindings.findChildViewById(rootView, id);
      if (mainToolbar == null) {
        break missingId;
      }

      id = R.id.pager_tab_strip;
      PagerTabStrip pagerTabStrip = ViewBindings.findChildViewById(rootView, id);
      if (pagerTabStrip == null) {
        break missingId;
      }

      id = R.id.search_wrapper;
      View searchWrapper = ViewBindings.findChildViewById(rootView, id);
      if (searchWrapper == null) {
        break missingId;
      }

      id = R.id.view_pager;
      MyViewPager viewPager = ViewBindings.findChildViewById(rootView, id);
      if (viewPager == null) {
        break missingId;
      }

      return new ActivityMainBinding((CoordinatorLayout) rootView, mainCoordinator,
          mainLinearLayout, mainToolbar, pagerTabStrip, searchWrapper, viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
