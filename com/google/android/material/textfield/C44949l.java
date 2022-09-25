package com.google.android.material.textfield;

import android.view.View;

/* renamed from: com.google.android.material.textfield.l */
/* compiled from: PG */
public final /* synthetic */ class C44949l implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C44956s f117414a;

    public /* synthetic */ C44949l(C44956s sVar) {
        this.f117414a = sVar;
    }

    public final void onFocusChange(View view, boolean z) {
        C44956s sVar = this.f117414a;
        sVar.f117422b = z;
        sVar.mo48610x();
        if (!z) {
            sVar.mo48578k(false);
            sVar.f117423c = false;
        }
    }
}
