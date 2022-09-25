package com.google.android.material.snackbar;

import android.view.View;

/* renamed from: com.google.android.material.snackbar.w */
/* compiled from: PG */
public final /* synthetic */ class C44892w implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Snackbar f117149a;

    /* renamed from: b */
    public final /* synthetic */ View.OnClickListener f117150b;

    public /* synthetic */ C44892w(Snackbar snackbar, View.OnClickListener onClickListener) {
        this.f117149a = snackbar;
        this.f117150b = onClickListener;
    }

    public final void onClick(View view) {
        Snackbar snackbar = this.f117149a;
        this.f117150b.onClick(view);
        snackbar.mo48340e(1);
    }
}
