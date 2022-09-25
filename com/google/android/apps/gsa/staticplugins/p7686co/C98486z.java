package com.google.android.apps.gsa.staticplugins.p7686co;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.z */
/* compiled from: PG */
abstract class C98486z implements C90991b {
    /* renamed from: a */
    public abstract long mo90898a();

    /* renamed from: b */
    public abstract long mo90899b();

    /* renamed from: c */
    public abstract long mo90900c();

    /* renamed from: e */
    public abstract C98484x mo90901e();

    /* renamed from: f */
    public abstract boolean mo90903f();

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85279c("label").mo85276a(C90752i.m148229c("eval"));
        fVar.mo85279c("result").mo85276a(C90752i.m148231e(mo90901e()));
        fVar.mo85279c("pushRequested").mo85276a(C90752i.m148228b(Boolean.valueOf(mo90903f())));
        fVar.mo85279c("timestamp").mo85276a(C90752i.m148232f(new Date(mo90900c())));
        fVar.mo85279c("refreshMin").mo85276a(C90752i.m148230d(Long.valueOf(mo90898a())));
        fVar.mo85279c("sessionMin").mo85276a(C90752i.m148230d(Long.valueOf(mo90899b())));
    }
}
