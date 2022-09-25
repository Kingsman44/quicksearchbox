package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.textfield.C44923ad;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.z */
/* compiled from: PG */
final class C116006z implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ TextInputLayout f321675a;

    public C116006z(TextInputLayout textInputLayout) {
        this.f321675a = textInputLayout;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C44923ad adVar = this.f321675a.f117310d;
        if (adVar.f117345f) {
            adVar.mo48510h(false);
            this.f321675a.mo48470e((CharSequence) null);
            this.f321675a.mo48475i(R.style.passwordInputHintStyle);
        }
    }
}
