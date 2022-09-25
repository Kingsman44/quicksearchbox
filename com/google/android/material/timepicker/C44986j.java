package com.google.android.material.timepicker;

import android.view.View;

/* renamed from: com.google.android.material.timepicker.j */
/* compiled from: PG */
final class C44986j implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C44989m f117550a;

    public C44986j(C44989m mVar) {
        this.f117550a = mVar;
    }

    public final void onClick(View view) {
        for (View.OnClickListener onClick : this.f117550a.f117555b) {
            onClick.onClick(view);
        }
        this.f117550a.dismiss();
    }
}
