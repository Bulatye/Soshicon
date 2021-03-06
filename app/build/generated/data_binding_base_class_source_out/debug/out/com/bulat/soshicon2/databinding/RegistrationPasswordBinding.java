// Generated by view binder compiler. Do not edit!
package com.bulat.soshicon2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bulat.soshicon2.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RegistrationPasswordBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout containerRegistrationPassword;

  @NonNull
  public final MaterialTextView createPasswordInfo;

  @NonNull
  public final MaterialTextView createPasswordText;

  @NonNull
  public final MaterialTextView errorText;

  @NonNull
  public final TextInputLayout password;

  @NonNull
  public final MaterialButton passwordBtn;

  private RegistrationPasswordBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout containerRegistrationPassword,
      @NonNull MaterialTextView createPasswordInfo, @NonNull MaterialTextView createPasswordText,
      @NonNull MaterialTextView errorText, @NonNull TextInputLayout password,
      @NonNull MaterialButton passwordBtn) {
    this.rootView = rootView;
    this.containerRegistrationPassword = containerRegistrationPassword;
    this.createPasswordInfo = createPasswordInfo;
    this.createPasswordText = createPasswordText;
    this.errorText = errorText;
    this.password = password;
    this.passwordBtn = passwordBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RegistrationPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RegistrationPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.registration_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RegistrationPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout containerRegistrationPassword = (ConstraintLayout) rootView;

      id = R.id.create_password_info;
      MaterialTextView createPasswordInfo = ViewBindings.findChildViewById(rootView, id);
      if (createPasswordInfo == null) {
        break missingId;
      }

      id = R.id.create_password_text;
      MaterialTextView createPasswordText = ViewBindings.findChildViewById(rootView, id);
      if (createPasswordText == null) {
        break missingId;
      }

      id = R.id.error_text;
      MaterialTextView errorText = ViewBindings.findChildViewById(rootView, id);
      if (errorText == null) {
        break missingId;
      }

      id = R.id.password;
      TextInputLayout password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.password_btn;
      MaterialButton passwordBtn = ViewBindings.findChildViewById(rootView, id);
      if (passwordBtn == null) {
        break missingId;
      }

      return new RegistrationPasswordBinding((ConstraintLayout) rootView,
          containerRegistrationPassword, createPasswordInfo, createPasswordText, errorText,
          password, passwordBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
