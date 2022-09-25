package com.google.android.libraries.surveys.internal.view;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.google.android.libraries.surveys.internal.view.t */
/* compiled from: PG */
final class C43162t implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C43164v f112859a;

    public C43162t(C43164v vVar) {
        this.f112859a = vVar;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f112859a.f112860a.mo46127a(charSequence.toString().trim());
    }
}
