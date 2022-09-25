package com.google.android.material.appbar;

import android.view.View;
import androidx.core.p097i.C1968c;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;

/* renamed from: com.google.android.material.appbar.a */
/* compiled from: PG */
final class C44504a implements C2010ad {

    /* renamed from: a */
    final /* synthetic */ AppBarLayout f115731a;

    public C44504a(AppBarLayout appBarLayout) {
        this.f115731a = appBarLayout;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        AppBarLayout appBarLayout = this.f115731a;
        C2082cp cpVar2 = true != C2043bi.m5564ar(appBarLayout) ? null : cpVar;
        if (!C1968c.m5305b(appBarLayout.f115668c, cpVar2)) {
            appBarLayout.f115668c = cpVar2;
            appBarLayout.mo47412q();
            appBarLayout.requestLayout();
        }
        return cpVar;
    }
}
