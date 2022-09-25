package com.google.android.gms.analytics.internal;

import android.util.DisplayMetrics;
import com.google.android.gms.analytics.p10733a.C142685f;
import java.util.Locale;

/* renamed from: com.google.android.gms.analytics.internal.ai */
/* compiled from: PG */
public final class C142712ai extends C142737g {
    public C142712ai(C142740j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117488a() {
    }

    /* renamed from: b */
    public final C142685f mo117503b() {
        mo117537k();
        DisplayMetrics displayMetrics = this.f387328e.mo117542b().f387399b.getResources().getDisplayMetrics();
        C142685f fVar = new C142685f();
        fVar.f387186a = C142731ba.m231603c(Locale.getDefault());
        fVar.f387187b = displayMetrics.widthPixels;
        fVar.f387188c = displayMetrics.heightPixels;
        return fVar;
    }
}
