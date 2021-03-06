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

public final class RegistrationEmailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout containerRegistrationEmail;

  @NonNull
  public final MaterialTextView createEmailInfo;

  @NonNull
  public final MaterialTextView createEmailText;

  @NonNull
  public final TextInputLayout email;

  @NonNull
  public final MaterialButton emailBtn;

  @NonNull
  public final MaterialTextView errorText;

  private RegistrationEmailBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout containerRegistrationEmail,
      @NonNull MaterialTextView createEmailInfo, @NonNull MaterialTextView createEmailText,
      @NonNull TextInputLayout email, @NonNull MaterialButton emailBtn,
      @NonNull MaterialTextView errorText) {
    this.rootView = rootView;
    this.containerRegistrationEmail = containerRegistrationEmail;
    this.createEmailInfo = createEmailInfo;
    this.createEmailText = createEmailText;
    this.email = email;
    this.emailBtn = emailBtn;
    this.errorText = errorText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RegistrationEmailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RegistrationEmailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.registration_email, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RegistrationEmailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout containerRegistrationEmail = (ConstraintLayout) rootView;

      id = R.id.create_email_info;
      MaterialTextView createEmailInfo = ViewBindings.findChildViewById(rootView, id);
      if (createEmailInfo == null) {
        break missingId;
      }

      id = R.id.create_email_text;
      MaterialTextView createEmailText = ViewBindings.findChildViewById(rootView, id);
      if (createEmailText == null) {
        break missingId;
      }

      id = R.id.email;
      TextInputLayout email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.email_btn;
      MaterialButton emailBtn = ViewBindings.findChildViewById(rootView, id);
      if (emailBtn == null) {
        break missingId;
      }

      id = R.id.error_text;
      MaterialTextView errorText = ViewBindings.findChildViewById(rootView, id);
      if (errorText == null) {
        break missingId;
      }

      return new RegistrationEmailBinding((ConstraintLayout) rootView, containerRegistrationEmail,
          createEmailInfo, createEmailText, email, emailBtn, errorText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
