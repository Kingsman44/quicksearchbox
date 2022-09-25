package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import com.google.android.apps.gsa.assistant.shared.appactions.c.a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.cs */
/* compiled from: PG */
final class C10300cs implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ TextInputLayout f34892a;

    /* renamed from: b */
    final /* synthetic */ C10301ct f34893b;

    public C10300cs(C10301ct ctVar, TextInputLayout textInputLayout) {
        this.f34893b = ctVar;
        this.f34892a = textInputLayout;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f34892a.mo48470e((CharSequence) null);
        a.a((Button) this.f34893b.f34895b.findViewById(R.id.done_button), charSequence.length() > 0);
    }
}
