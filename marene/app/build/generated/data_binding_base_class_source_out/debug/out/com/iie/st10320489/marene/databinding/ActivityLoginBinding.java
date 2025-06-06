// Generated by view binder compiler. Do not edit!
package com.iie.st10320489.marene.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.iie.st10320489.marene.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final EditText emailEditText;

  @NonNull
  public final TextView forgotPassword;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final BottomNavigationView navView;

  @NonNull
  public final EditText passwordEditText;

  @NonNull
  public final TextView registerNowText;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final ImageView togglePasswordVisibility;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout container, @NonNull EditText emailEditText,
      @NonNull TextView forgotPassword, @NonNull Button loginButton,
      @NonNull BottomNavigationView navView, @NonNull EditText passwordEditText,
      @NonNull TextView registerNowText, @NonNull TextView textView2,
      @NonNull ImageView togglePasswordVisibility) {
    this.rootView = rootView;
    this.container = container;
    this.emailEditText = emailEditText;
    this.forgotPassword = forgotPassword;
    this.loginButton = loginButton;
    this.navView = navView;
    this.passwordEditText = passwordEditText;
    this.registerNowText = registerNowText;
    this.textView2 = textView2;
    this.togglePasswordVisibility = togglePasswordVisibility;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout container = (ConstraintLayout) rootView;

      id = R.id.emailEditText;
      EditText emailEditText = ViewBindings.findChildViewById(rootView, id);
      if (emailEditText == null) {
        break missingId;
      }

      id = R.id.forgotPassword;
      TextView forgotPassword = ViewBindings.findChildViewById(rootView, id);
      if (forgotPassword == null) {
        break missingId;
      }

      id = R.id.loginButton;
      Button loginButton = ViewBindings.findChildViewById(rootView, id);
      if (loginButton == null) {
        break missingId;
      }

      id = R.id.nav_view;
      BottomNavigationView navView = ViewBindings.findChildViewById(rootView, id);
      if (navView == null) {
        break missingId;
      }

      id = R.id.passwordEditText;
      EditText passwordEditText = ViewBindings.findChildViewById(rootView, id);
      if (passwordEditText == null) {
        break missingId;
      }

      id = R.id.registerNowText;
      TextView registerNowText = ViewBindings.findChildViewById(rootView, id);
      if (registerNowText == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.togglePasswordVisibility;
      ImageView togglePasswordVisibility = ViewBindings.findChildViewById(rootView, id);
      if (togglePasswordVisibility == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, container, emailEditText,
          forgotPassword, loginButton, navView, passwordEditText, registerNowText, textView2,
          togglePasswordVisibility);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
