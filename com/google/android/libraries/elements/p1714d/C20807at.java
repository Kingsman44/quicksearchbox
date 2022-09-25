package com.google.android.libraries.elements.p1714d;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.google.android.libraries.elements.d.at */
/* compiled from: PG */
final class C20807at implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C20809av f58257a;

    /* renamed from: b */
    private int f58258b;

    /* renamed from: c */
    private int f58259c;

    public C20807at(C20809av avVar) {
        this.f58257a = avVar;
    }

    public final void afterTextChanged(Editable editable) {
        if (editable.subSequence(this.f58258b, this.f58259c).toString().contains("\n")) {
            int i = this.f58259c;
            if (editable.subSequence(i - 1, i).toString().equals("\n")) {
                this.f58257a.mo25893a();
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f58258b = i;
        this.f58259c = i + i3;
    }
}
