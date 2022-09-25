package com.google.android.apps.gsa.staticplugins.accl.p7331c;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90016bv;
import com.google.android.libraries.gsa.conversation.p1852f.C22581h;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import com.google.p4449cd.p4456g.p4457a.C57978d;
import com.google.p4449cd.p4456g.p4458b.C57982a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.x */
/* compiled from: PG */
final class C92815x implements C57974a {

    /* renamed from: a */
    final /* synthetic */ C57982a f258987a;

    /* renamed from: b */
    final /* synthetic */ SettableFuture f258988b;

    /* renamed from: c */
    final /* synthetic */ C57978d f258989c;

    /* renamed from: d */
    final /* synthetic */ long f258990d;

    /* renamed from: e */
    final /* synthetic */ C92816y f258991e;

    /* renamed from: f */
    private final AtomicBoolean f258992f = new AtomicBoolean(true);

    /* renamed from: g */
    private C60870cx f258993g;

    public C92815x(C92816y yVar, C57982a aVar, SettableFuture settableFuture, C57978d dVar, long j) {
        this.f258991e = yVar;
        this.f258987a = aVar;
        this.f258988b = settableFuture;
        this.f258989c = dVar;
        this.f258990d = j;
    }

    /* renamed from: f */
    private final void m152842f() {
        C60870cx cxVar = this.f258993g;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
    }

    /* renamed from: g */
    private final void m152843g() {
        m152842f();
        this.f258993g = this.f258991e.f258995b.mo28208h("conversation delta stream timeout", this.f258990d, new C92814w(this));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20337c(Object obj) {
        C52081en enVar;
        C51195j jVar = (C51195j) obj;
        C58976aa aaVar = C58975e.f156826a;
        if ((jVar.f133266a & 128) != 0) {
            enVar = jVar.f133275j;
            if (enVar == null) {
                enVar = C52081en.f136679i;
            }
        } else {
            enVar = null;
        }
        C58833ax j = C58833ax.m90833j(enVar);
        if (j.mo56113h()) {
            m152843g();
            boolean andSet = this.f258992f.getAndSet(false);
            boolean z = !jVar.f133274i;
            this.f258987a.mo54591h(new C22581h((C52081en) j.mo56107c(), andSet, z));
            if (!this.f258988b.isDone()) {
                if (((C86124t) this.f258991e.f258994a.mo27525b()).mo79746e(C90016bv.f247854a)) {
                    if (andSet) {
                        this.f258988b.mo57356n(C58833ax.m90834k(this.f258989c));
                    }
                    if (!z) {
                        return;
                    }
                } else if (!z) {
                    this.f258988b.mo57356n(C58833ax.m90834k(this.f258989c));
                    return;
                }
                m152842f();
                mo87465e();
                return;
            }
            return;
        }
        m152842f();
        mo87465e();
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        m152843g();
    }

    /* renamed from: e */
    public final void mo87465e() {
        this.f258987a.mo54589f(true);
        if (!this.f258988b.isDone()) {
            this.f258988b.mo57356n(C58836b.f156633a);
        }
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        m152842f();
        mo87465e();
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        C58976aa aaVar = C58975e.f156826a;
        m152842f();
        mo87465e();
    }
}
