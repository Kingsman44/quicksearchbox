package com.google.android.apps.gsa.search.core.service.p6852g;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90745b;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.j */
/* compiled from: PG */
public final class C86730j implements C90964a {

    /* renamed from: b */
    private static final C59071e f234279b = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.g.j");

    /* renamed from: a */
    public final C86728h f234280a;

    /* renamed from: c */
    private C58833ax f234281c;

    /* renamed from: d */
    private C58833ax f234282d;

    /* renamed from: e */
    private C58833ax f234283e;

    /* renamed from: f */
    private C58833ax f234284f;

    public C86730j(String str, String str2, C86732l lVar, C58528ij ijVar) {
        C58836b bVar = C58836b.f156633a;
        this.f234281c = bVar;
        this.f234282d = bVar;
        this.f234283e = bVar;
        this.f234284f = bVar;
        this.f234280a = new C86716b(str, str2, lVar, ijVar);
    }

    /* renamed from: a */
    public final synchronized long mo80337a() {
        return ((Long) this.f234283e.mo56109e(0L)).longValue();
    }

    /* renamed from: b */
    public final synchronized long mo80338b() {
        return ((Long) this.f234282d.mo56109e(0L)).longValue();
    }

    /* renamed from: c */
    public final synchronized long mo80339c() {
        return ((Long) this.f234281c.mo56109e(0L)).longValue();
    }

    /* renamed from: e */
    public final synchronized C86729i mo80340e() {
        return (C86729i) this.f234284f.mo56109e(C86729i.UNDEFINED);
    }

    /* renamed from: f */
    public final synchronized void mo80341f(long j, C86729i iVar) {
        C58838bb.m90884s(this.f234282d.mo56113h(), "Delegation time has not been set, so completion time cannot be set");
        if (j < mo80338b()) {
            ((C59052c) ((C59052c) f234279b.mo56225c()).mo56372aa(8496)).mo56359L("Completion time %d is less than Delegation time %d for worker %s", Long.valueOf(j), Long.valueOf(mo80338b()), ((C86716b) this.f234280a).f234242b);
        }
        if (!this.f234283e.mo56113h()) {
            this.f234283e = C58833ax.m90834k(Long.valueOf(j));
        } else {
            ((C59052c) ((C59052c) f234279b.mo56225c()).mo56372aa(8495)).mo56386p("Attempt to overwrite completionTime");
        }
        if (!this.f234284f.mo56113h()) {
            this.f234284f = C58833ax.m90834k(iVar);
        } else {
            ((C59052c) ((C59052c) f234279b.mo56225c()).mo56372aa(8500)).mo56386p("Attempt to overwrite workProxyEndState");
        }
    }

    /* renamed from: g */
    public final synchronized void mo80342g(long j) {
        C58838bb.m90884s(this.f234281c.mo56113h(), "Enqueue time has not been set, so delegation time cannot be set");
        if (j < mo80339c()) {
            ((C59052c) ((C59052c) f234279b.mo56225c()).mo56372aa(8498)).mo56359L("Delegation time %d is less than Enqueue time %d for worker %s", Long.valueOf(j), Long.valueOf(mo80339c()), ((C86716b) this.f234280a).f234242b);
        }
        if (!this.f234282d.mo56113h()) {
            this.f234282d = C58833ax.m90834k(Long.valueOf(j));
        } else {
            ((C59052c) ((C59052c) f234279b.mo56225c()).mo56372aa(8497)).mo56386p("Attempt to overwrite delegationTime");
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85293t("%18s: +%5s, +%5s, %9s, %s", C90752i.m148229c(C90745b.m148220a(new Date(mo80339c()))), C90752i.m148230d(Long.valueOf(mo80338b() - mo80339c())), C90752i.m148230d(Long.valueOf(mo80337a() - mo80338b())), C90752i.m148231e(mo80340e()), C90752i.m148229c(((C86716b) this.f234280a).f234242b));
    }

    /* renamed from: h */
    public final synchronized void mo80343h(long j) {
        if (!this.f234281c.mo56113h()) {
            this.f234281c = C58833ax.m90834k(Long.valueOf(j));
        } else {
            ((C59052c) ((C59052c) f234279b.mo56225c()).mo56372aa(8499)).mo56386p("Attempt to overwrite enqueueTime");
        }
    }
}
