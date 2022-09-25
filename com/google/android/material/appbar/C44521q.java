package com.google.android.material.appbar;

import android.view.View;
import androidx.core.p097i.C1968c;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;

/* renamed from: com.google.android.material.appbar.q */
/* compiled from: PG */
final class C44521q implements C2010ad {

    /* renamed from: a */
    final /* synthetic */ CollapsingToolbarLayout f115753a;

    public C44521q(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f115753a = collapsingToolbarLayout;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f115753a;
        C2082cp cpVar2 = true != C2043bi.m5564ar(collapsingToolbarLayout) ? null : cpVar;
        if (!C1968c.m5305b(collapsingToolbarLayout.f115703e, cpVar2)) {
            collapsingToolbarLayout.f115703e = cpVar2;
            collapsingToolbarLayout.requestLayout();
        }
        return cpVar.f5994b.mo5231o();
    }
}
