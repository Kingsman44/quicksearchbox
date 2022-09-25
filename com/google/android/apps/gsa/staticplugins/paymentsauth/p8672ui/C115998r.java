package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.widget.Button;
import android.widget.EditText;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.r */
/* compiled from: PG */
public final /* synthetic */ class C115998r implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ PasswordRenderer f321662a;

    /* renamed from: b */
    public final /* synthetic */ EditText f321663b;

    /* renamed from: c */
    public final /* synthetic */ TextInputLayout f321664c;

    /* renamed from: d */
    public final /* synthetic */ Button f321665d;

    public /* synthetic */ C115998r(PasswordRenderer passwordRenderer, EditText editText, TextInputLayout textInputLayout, Button button) {
        this.f321662a = passwordRenderer;
        this.f321663b = editText;
        this.f321664c = textInputLayout;
        this.f321665d = button;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        PasswordRenderer passwordRenderer = this.f321662a;
        EditText editText = this.f321663b;
        TextInputLayout textInputLayout = this.f321664c;
        Button button = this.f321665d;
        if (((Boolean) obj).booleanValue()) {
            editText.setText(BuildConfig.FLAVOR);
            textInputLayout.f117310d.mo48510h(true);
            textInputLayout.mo48470e(passwordRenderer.f321606b.getString(R.string.payments_auth_password_authorize_error_message));
            button.setEnabled(true);
            button.setAlpha(1.0f);
        }
    }
}
