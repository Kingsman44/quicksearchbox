package com.google.android.apps.search.googleapp.incognito.education;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.widget.Button;
import android.widget.LinearLayout;

/* renamed from: com.google.android.apps.search.googleapp.incognito.education.f */
/* compiled from: PG */
final class C136263f implements DialogInterface.OnShowListener {

    /* renamed from: a */
    final /* synthetic */ C0392m f371072a;

    /* renamed from: b */
    final /* synthetic */ C136264g f371073b;

    public C136263f(C136264g gVar, C0392m mVar) {
        this.f371073b = gVar;
        this.f371072a = mVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        Button button = this.f371072a.f1349a.f1110j;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(35, 0, 35, true != this.f371073b.f371078e.f362963a ? 10 : 0);
        button.setLayoutParams(layoutParams);
    }
}
