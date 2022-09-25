package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.ImageView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.el */
/* compiled from: PG */
final class C112840el implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ ImageView f312753a;

    /* renamed from: b */
    final /* synthetic */ C112851ew f312754b;

    public C112840el(C112851ew ewVar, ImageView imageView) {
        this.f312754b = ewVar;
        this.f312753a = imageView;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f312754b.mo99761j(this.f312753a, !TextUtils.isEmpty(charSequence));
    }
}
