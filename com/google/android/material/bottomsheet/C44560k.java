package com.google.android.material.bottomsheet;

import android.content.res.TypedArray;
import android.view.View;

/* renamed from: com.google.android.material.bottomsheet.k */
/* compiled from: PG */
final class C44560k implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C44565p f115946a;

    public C44560k(C44565p pVar) {
        this.f115946a = pVar;
    }

    public final void onClick(View view) {
        C44565p pVar = this.f115946a;
        if (pVar.f115959p && pVar.isShowing()) {
            C44565p pVar2 = this.f115946a;
            if (!pVar2.f115961r) {
                TypedArray obtainStyledAttributes = pVar2.getContext().obtainStyledAttributes(new int[]{16843611});
                pVar2.f115960q = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                pVar2.f115961r = true;
            }
            if (pVar2.f115960q) {
                this.f115946a.cancel();
            }
        }
    }
}
