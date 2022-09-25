package com.google.android.material.timepicker;

import android.view.View;

/* renamed from: com.google.android.material.timepicker.i */
/* compiled from: PG */
final class C44985i implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C44989m f117549a;

    public C44985i(C44989m mVar) {
        this.f117549a = mVar;
    }

    public final void onClick(View view) {
        for (View.OnClickListener onClick : this.f117549a.f117554a) {
            onClick.onClick(view);
        }
        this.f117549a.dismiss();
    }
}
