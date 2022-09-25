package com.google.android.libraries.lens.view.p2070an;

import com.google.android.libraries.lens.p2014e.C24199ab;
import com.google.android.libraries.lens.p2014e.C24207aj;
import com.google.android.libraries.lens.p2014e.C24208ak;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.lens.view.an.as */
/* compiled from: PG */
final class C25381as implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C24208ak f69106a;

    /* renamed from: b */
    final /* synthetic */ C25382at f69107b;

    public C25381as(C25382at atVar, C24208ak akVar) {
        this.f69107b = atVar;
        this.f69106a = akVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f69107b.f69109b.mo30912b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C24207aj c = C24208ak.m45056e(this.f69107b.f69108a).mo29698c();
        c.mo29694b(this.f69106a.mo29696a());
        c.mo29695c((C24199ab) obj);
        C24208ak a = c.mo29693a();
        C58838bb.m90884s(a.mo29701g(), "expected interaction query to be complete");
        this.f69107b.f69109b.mo30913c(a, true);
    }
}
