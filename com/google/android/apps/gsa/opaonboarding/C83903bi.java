package com.google.android.apps.gsa.opaonboarding;

import android.content.Intent;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.opaonboarding.bi */
/* compiled from: PG */
public abstract class C83903bi {
    /* renamed from: d */
    public static C83902bh m133648d() {
        C83948o oVar = new C83948o();
        oVar.mo77305b(0);
        return oVar;
    }

    /* renamed from: e */
    public static C83903bi m133649e(int i, Intent intent) {
        C83902bh d = m133648d();
        d.mo77306c(i);
        if (intent != null) {
            ((C83948o) d).f228682a = C58833ax.m90834k(intent);
        }
        return d.mo77304a();
    }

    /* renamed from: a */
    public abstract int mo77307a();

    /* renamed from: b */
    public abstract int mo77308b();

    /* renamed from: c */
    public abstract C58833ax mo77309c();
}
