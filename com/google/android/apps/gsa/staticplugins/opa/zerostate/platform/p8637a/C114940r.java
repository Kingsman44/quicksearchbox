package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.ImageView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.r */
/* compiled from: PG */
final class C114940r implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ ImageView f318897a;

    /* renamed from: b */
    final /* synthetic */ C114942t f318898b;

    public C114940r(C114942t tVar, ImageView imageView) {
        this.f318898b = tVar;
        this.f318897a = imageView;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f318898b.mo101731n(this.f318897a, charSequence.length() > 0);
        C114942t tVar = this.f318898b;
        Button button = tVar.f318906g;
        button.getClass();
        button.setEnabled(tVar.mo101732o());
    }
}
