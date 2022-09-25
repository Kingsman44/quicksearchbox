package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.p6831c.C86395a;
import com.google.android.apps.gsa.search.core.p6820r.p6831c.C86396b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86699a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.shared.logger.latency.LatencyEvents;
import com.google.android.apps.gsa.shared.logger.p7053c.C89882e;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58781rt;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60534tl;
import com.google.common.p4552o.C60537to;
import dagger.C68214a;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.fw */
/* compiled from: PG */
public final class C116720fw extends C116780ib {

    /* renamed from: a */
    public final C21370a f323697a;

    /* renamed from: b */
    public final C68214a f323698b;

    /* renamed from: c */
    public final C86124t f323699c;

    /* renamed from: d */
    final Queue f323700d = new C58781rt(new C58425eo(10));

    /* renamed from: e */
    public C116719fv f323701e;

    /* renamed from: f */
    public long f323702f;

    /* renamed from: g */
    private final C68214a f323703g;

    /* renamed from: h */
    private final C22871g f323704h;

    /* renamed from: i */
    private final C86396b f323705i;

    public C116720fw(C68214a aVar, C68214a aVar2, C68214a aVar3, C21370a aVar4, C86124t tVar, C22871g gVar, C86396b bVar) {
        super(aVar, 166);
        this.f323698b = aVar2;
        this.f323703g = aVar3;
        this.f323697a = aVar4;
        this.f323699c = tVar;
        this.f323704h = gVar;
        this.f323705i = bVar;
    }

    /* renamed from: o */
    public static boolean m193713o(C116719fv fvVar) {
        return fvVar != null && !fvVar.f323696d;
    }

    /* renamed from: p */
    private static boolean m193714p(long j, long j2) {
        return j > 0 && j <= j2;
    }

    /* renamed from: e */
    public final C116719fv mo102845e(Query query) {
        long j;
        if (!query.mo84429dJ()) {
            return null;
        }
        long j2 = query.f252749G;
        if (j2 == this.f323702f) {
            return null;
        }
        long c = this.f323697a.mo26871c();
        this.f323702f = j2;
        C86395a a = this.f323705i.mo80169a();
        C116719fv fvVar = new C116719fv(a);
        fvVar.f323694b = query;
        fvVar.f323696d = query.mo84430dK();
        a.mo80168c(C60534tl.COMMIT, c);
        long j3 = query.f252747E;
        if (j3 != 0) {
            a.mo80168c(C60534tl.SUBMIT, j3);
            j = Math.min(j3, c);
        } else {
            j = c;
        }
        LatencyEvents latencyEvents = query.f252746D;
        long j4 = latencyEvents.f246437a;
        if (m193714p(j4, c)) {
            a.mo80168c(C60534tl.APPLICATION_CREATE, j4);
            j = Math.min(latencyEvents.f246437a, j);
        }
        long j5 = latencyEvents.f246438b;
        if (m193714p(j5, c)) {
            a.mo80168c(C60534tl.SEARCH_INTENT, j5);
            j = Math.min(latencyEvents.f246438b, j);
        }
        long j6 = latencyEvents.f246440d;
        if (m193714p(j6, c)) {
            a.mo80168c(C60534tl.ACTIVITY_CREATE, j6);
            j = Math.min(latencyEvents.f246440d, j);
        }
        long j7 = latencyEvents.f246441e;
        if (m193714p(j7, c)) {
            a.mo80168c(C60534tl.QUERY_FORMULATION_START, j7);
            j = Math.min(latencyEvents.f246441e, j);
        }
        long j8 = latencyEvents.f246439c;
        if (m193714p(j8, c)) {
            a.mo80168c(C60534tl.EXTERNAL_SEARCH_START, j8);
            j = Math.min(latencyEvents.f246439c, j);
        }
        a.mo80168c(C60534tl.E2E_START, j);
        C58976aa aaVar = C58975e.f156826a;
        return fvVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo102846g(Query query, C60537to toVar) {
        mo102848j(query, 465, toVar, C58836b.f156633a);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("QueryCompletionState");
        if (mo102851n()) {
            C116719fv fvVar = this.f323701e;
            fvVar.getClass();
            fVar.mo85293t("Pending query: %s", C90752i.m148230d(Long.valueOf(fvVar.f323694b.f252749G)));
        }
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("Recent Logged Events");
        synchronized (this.f323700d) {
            for (C116718fu fuVar : this.f323700d) {
                e.mo85292s(C90752i.m148229c(fuVar.toString()));
            }
        }
    }

    /* renamed from: i */
    public final void mo102847i(C116719fv fvVar, int i, C60537to toVar) {
        this.f323704h.mo28212l("Log endstate", new C116717ft(this, fvVar, i, toVar));
        this.f323701e = null;
        C116802ix ixVar = (C116802ix) this.f323703g.mo27525b();
        if (C86724d.f234270g.contains(((C86699a) ixVar.f324073a.f234274a).f234194a)) {
            C58976aa aaVar = C58975e.f156826a;
            ixVar.mo102952e(C86724d.IDLE);
        }
    }

    /* renamed from: j */
    public final void mo102848j(Query query, int i, C60537to toVar, C58833ax axVar) {
        long j = query.f252749G;
        if (mo102851n()) {
            C116719fv fvVar = this.f323701e;
            fvVar.getClass();
            if (fvVar.f323694b.f252749G == j) {
                C58838bb.m90883r(fvVar.f323696d);
                if (axVar.mo56113h()) {
                    fvVar.f323695c = (C90456c) axVar.mo56107c();
                }
                mo102847i(fvVar, i, toVar);
                mo80591ar();
            }
        }
    }

    /* renamed from: k */
    public final void mo102849k(Query query) {
        mo102848j(query, 463, C60537to.TASKGRAPH_SUCCESS, C58836b.f156633a);
    }

    /* renamed from: m */
    public final void mo102850m(C89882e eVar, long j) {
        C116719fv fvVar = this.f323701e;
        if (fvVar != null && j == fvVar.f323694b.f252749G) {
            fvVar.f323693a.f233509a = eVar;
        }
    }

    /* renamed from: n */
    public final boolean mo102851n() {
        return this.f323701e != null;
    }
}
