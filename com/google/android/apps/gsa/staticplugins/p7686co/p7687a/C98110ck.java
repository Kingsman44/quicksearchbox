package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.p375ai.p378b.C7746ik;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.ck */
/* compiled from: PG */
abstract class C98110ck implements C90991b {
    /* renamed from: e */
    public static C98110ck m162491e(long j, long j2, C7746ik ikVar) {
        return new C98126h(j, j2, (long) ikVar.f27108J);
    }

    /* renamed from: a */
    public abstract long mo90965a();

    /* renamed from: b */
    public abstract long mo90966b();

    /* renamed from: c */
    public abstract long mo90967c();

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85279c("timestamp").mo85276a(C90752i.m148232f(new Date(mo90966b())));
        fVar.mo85279c("entry_update_id").mo85276a(C90752i.m148230d(Long.valueOf(mo90965a())));
        fVar.mo85279c("type").mo85276a(C90752i.m148230d(Long.valueOf(mo90967c())));
    }
}
