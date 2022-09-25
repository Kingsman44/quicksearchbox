package com.google.android.libraries.surveys.internal.view;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.CheckBox;

/* renamed from: com.google.android.libraries.surveys.internal.view.j */
/* compiled from: PG */
final class C43152j implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ int f112846a;

    /* renamed from: b */
    final /* synthetic */ CheckBox f112847b;

    /* renamed from: c */
    final /* synthetic */ C43156n f112848c;

    public C43152j(C43156n nVar, int i, CheckBox checkBox) {
        this.f112848c = nVar;
        this.f112846a = i;
        this.f112847b = checkBox;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String trim = charSequence.toString().trim();
        if (!TextUtils.isEmpty(trim)) {
            this.f112848c.f112853a[this.f112846a] = true;
            this.f112847b.setChecked(true);
            C43156n nVar = this.f112848c;
            nVar.f112854b = trim;
            nVar.f112855c.mo46138a(new C43154l(nVar.f112854b, nVar.f112853a));
        }
    }
}
