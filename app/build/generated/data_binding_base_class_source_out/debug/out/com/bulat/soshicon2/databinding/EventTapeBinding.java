// Generated by view binder compiler. Do not edit!
package com.bulat.soshicon2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bulat.soshicon2.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class EventTapeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final SwipeRefreshLayout SwipeRefreshLayout;

  @NonNull
  public final ImageView add;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final TextView editText;

  @NonNull
  public final ListView listView;

  @NonNull
  public final Toolbar toolbar;

  private EventTapeBinding(@NonNull ConstraintLayout rootView,
      @NonNull SwipeRefreshLayout SwipeRefreshLayout, @NonNull ImageView add,
      @NonNull AppBarLayout appBarLayout, @NonNull TextView editText, @NonNull ListView listView,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.SwipeRefreshLayout = SwipeRefreshLayout;
    this.add = add;
    this.appBarLayout = appBarLayout;
    this.editText = editText;
    this.listView = listView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EventTapeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EventTapeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.event_tape, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EventTapeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.SwipeRefreshLayout;
      SwipeRefreshLayout SwipeRefreshLayout = ViewBindings.findChildViewById(rootView, id);
      if (SwipeRefreshLayout == null) {
        break missingId;
      }

      id = R.id.add;
      ImageView add = ViewBindings.findChildViewById(rootView, id);
      if (add == null) {
        break missingId;
      }

      id = R.id.appBarLayout;
      AppBarLayout appBarLayout = ViewBindings.findChildViewById(rootView, id);
      if (appBarLayout == null) {
        break missingId;
      }

      id = R.id.editText;
      TextView editText = ViewBindings.findChildViewById(rootView, id);
      if (editText == null) {
        break missingId;
      }

      id = R.id.listView;
      ListView listView = ViewBindings.findChildViewById(rootView, id);
      if (listView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new EventTapeBinding((ConstraintLayout) rootView, SwipeRefreshLayout, add,
          appBarLayout, editText, listView, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}