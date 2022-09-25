package com.google.android.apps.gsa.staticplugins.opa.p8595v;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58833ax;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.v.p */
/* compiled from: PG */
final class C113912p implements C90991b {

    /* renamed from: a */
    final long f315374a;

    /* renamed from: b */
    final C89849ae f315375b;

    /* renamed from: c */
    final C58833ax f315376c;

    /* renamed from: d */
    final C58833ax f315377d;

    public C113912p(long j, C89849ae aeVar, C58833ax axVar, C58833ax axVar2) {
        this.f315374a = j;
        this.f315375b = aeVar;
        this.f315376c = axVar;
        this.f315377d = axVar2;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85292s(C90752i.m148232f(new Date(this.f315374a)));
        fVar.mo85279c("flow_event").mo85276a(C90752i.m148229c(this.f315375b.name()));
        if (this.f315376c.mo56113h()) {
            fVar.mo85279c("request_id").mo85276a(C90752i.m148230d((Number) this.f315376c.mo56107c()));
        }
        if (this.f315377d.mo56113h()) {
            fVar.mo85279c("session_id").mo85276a(C90752i.m148230d((Number) this.f315377d.mo56107c()));
        }
    }
}
