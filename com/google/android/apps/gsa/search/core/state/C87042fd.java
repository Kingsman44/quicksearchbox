package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118837d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.p6831c.C86395a;
import com.google.android.apps.gsa.search.core.p6820r.p6831c.C86396b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86699a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
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

/* renamed from: com.google.android.apps.gsa.search.core.state.fd */
/* compiled from: PG */
public final class C87042fd extends C86898ct {

    /* renamed from: a */
    public final C21370a f235112a;

    /* renamed from: b */
    public final C68214a f235113b;

    /* renamed from: c */
    final Queue f235114c = new C58781rt(new C58425eo(10));

    /* renamed from: d */
    public C87041fc f235115d;

    /* renamed from: e */
    public long f235116e;

    /* renamed from: f */
    private final C68214a f235117f;

    /* renamed from: g */
    private final C68214a f235118g;

    /* renamed from: h */
    private final C86124t f235119h;

    /* renamed from: i */
    private final C22871g f235120i;

    /* renamed from: j */
    private final C86396b f235121j;

    public C87042fd(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C21370a aVar5, C86124t tVar, C22871g gVar, C86396b bVar) {
        super(aVar, 62);
        this.f235117f = aVar2;
        this.f235113b = aVar3;
        this.f235118g = aVar4;
        this.f235112a = aVar5;
        this.f235119h = tVar;
        this.f235120i = gVar;
        this.f235121j = bVar;
    }

    /* renamed from: q */
    public static boolean m140573q(C87041fc fcVar) {
        return fcVar != null && !fcVar.f235111d;
    }

    /* renamed from: r */
    private static final boolean m140574r(long j, long j2) {
        return j > 0 && j <= j2;
    }

    /* renamed from: a */
    public final C87041fc mo80663a(Query query) {
        long j;
        if (!query.mo84429dJ()) {
            return null;
        }
        long j2 = query.f252749G;
        if (j2 == this.f235116e) {
            return null;
        }
        long c = this.f235112a.mo26871c();
        this.f235116e = j2;
        C86395a a = this.f235121j.mo80169a();
        C87041fc fcVar = new C87041fc(a);
        fcVar.f235109b = query;
        fcVar.f235111d = query.mo84430dK();
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
        if (m140574r(j4, c)) {
            a.mo80168c(C60534tl.APPLICATION_CREATE, j4);
            j = Math.min(latencyEvents.f246437a, j);
        }
        long j5 = latencyEvents.f246438b;
        if (m140574r(j5, c)) {
            a.mo80168c(C60534tl.SEARCH_INTENT, j5);
            j = Math.min(latencyEvents.f246438b, j);
        }
        long j6 = latencyEvents.f246440d;
        if (m140574r(j6, c)) {
            a.mo80168c(C60534tl.ACTIVITY_CREATE, j6);
            j = Math.min(latencyEvents.f246440d, j);
        }
        long j7 = latencyEvents.f246441e;
        if (m140574r(j7, c)) {
            a.mo80168c(C60534tl.QUERY_FORMULATION_START, j7);
            j = Math.min(latencyEvents.f246441e, j);
        }
        long j8 = latencyEvents.f246439c;
        if (m140574r(j8, c)) {
            a.mo80168c(C60534tl.EXTERNAL_SEARCH_START, j8);
            j = Math.min(latencyEvents.f246439c, j);
        }
        a.mo80168c(C60534tl.E2E_START, j);
        C58976aa aaVar = C58975e.f156826a;
        return fcVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo80664e(Query query, C60537to toVar) {
        mo80666i(query, 465, toVar, C58836b.f156633a);
    }

    /* renamed from: g */
    public final void mo80665g(C87041fc fcVar, int i, C60537to toVar) {
        C86724d dVar;
        C86724d dVar2;
        this.f235120i.mo28212l("Log endstate", new C87039fa(this, fcVar, i, toVar));
        this.f235115d = null;
        C87130hy hyVar = (C87130hy) this.f235118g.mo27525b();
        if (C86724d.f234270g.contains(((C86699a) hyVar.f235418c.f234274a).f234194a) && (dVar = C86724d.IDLE) != (dVar2 = ((C86699a) hyVar.f235418c.f234274a).f234194a)) {
            if (dVar2 == C86724d.IDLE) {
                hyVar.f235419d = hyVar.f235416a.mo26872d();
            } else {
                C118575h hVar = dVar2.f234273i;
                if (hVar != C118575h.UNKNOWN_WORKLOAD) {
                    C118837d.m197249c(hyVar.f235417b.mo77944g(C118569b.WORKER_LATENCY_MICROS, hVar), hyVar.f235419d);
                }
            }
            hyVar.f235418c.mo80336a(new C86699a(dVar, hyVar.f235416a.mo26871c()));
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("QueryCompletionState");
        if (mo80671o()) {
            C87041fc fcVar = this.f235115d;
            fcVar.getClass();
            fVar.mo85293t("Pending query: %s", C90752i.m148230d(Long.valueOf(fcVar.f235109b.f252749G)));
        }
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("Recent Logged Events");
        synchronized (this.f235114c) {
            for (C87040fb fbVar : this.f235114c) {
                e.mo85292s(C90752i.m148229c(fbVar.toString()));
            }
        }
    }

    /* renamed from: i */
    public final void mo80666i(Query query, int i, C60537to toVar, C58833ax axVar) {
        long j = query.f252749G;
        if (mo80671o()) {
            C87041fc fcVar = this.f235115d;
            fcVar.getClass();
            if (fcVar.f235109b.f252749G == j) {
                C58838bb.m90883r(fcVar.f235111d);
                if (axVar.mo56113h()) {
                    fcVar.f235110c = (C90456c) axVar.mo56107c();
                }
                mo80665g(fcVar, i, toVar);
                mo80591ar();
            }
        }
    }

    /* renamed from: j */
    public final void mo80667j(Query query, C60537to toVar) {
        long j = query.f252749G;
        if (mo80671o()) {
            C87041fc fcVar = this.f235115d;
            fcVar.getClass();
            if (fcVar.f235109b.f252749G == j) {
                C58838bb.m90883r(!fcVar.f235111d);
                mo80665g(fcVar, 463, toVar);
                mo80591ar();
            }
        }
    }

    /* renamed from: k */
    public final void mo80668k(SearchError searchError) {
        C87041fc fcVar = this.f235115d;
        fcVar.getClass();
        fcVar.f235110c = searchError.f236022f;
        int O = searchError.mo81136O();
        if (O == 211) {
            switch (searchError.mo81135N()) {
                case S3_NO_CONNECTION_VALUE:
                case HTTP_NO_CONNECTIVITY_VALUE:
                    mo80665g(fcVar, 464, C60537to.NO_CONNECTIVITY);
                    return;
                case HTTP_UNAVAILABLE_VALUE:
                    if (this.f235119h.mo79742A(searchError.f236028l)) {
                        mo80665g(fcVar, 464, C60537to.CAPTCHA_SHOWN);
                        return;
                    }
                    break;
                case RECOGNIZER_NO_MATCH_FROM_NETWORK_VALUE:
                    mo80665g(fcVar, 464, C60537to.NO_MATCH_FROM_NETWORK);
                    return;
            }
            mo80665g(fcVar, 464, C60537to.GENERIC_GSA_ERROR);
        } else if (O == 212) {
            mo80665g(fcVar, 464, C60537to.SERVER_ERROR);
        } else if (O != 216) {
            mo80665g(fcVar, 464, C60537to.GENERIC_ERROR);
        } else {
            mo80665g(fcVar, 464, C60537to.S3_ERROR);
        }
    }

    /* renamed from: m */
    public final void mo80669m(Query query) {
        mo80666i(query, 463, C60537to.TASKGRAPH_SUCCESS, C58836b.f156633a);
    }

    /* renamed from: n */
    public final void mo80670n(C89882e eVar, long j) {
        C87041fc fcVar = this.f235115d;
        if (fcVar != null && j == fcVar.f235109b.f252749G) {
            fcVar.f235108a.f233509a = eVar;
        }
    }

    /* renamed from: o */
    public final boolean mo80671o() {
        return this.f235115d != null;
    }

    /* renamed from: p */
    public final boolean mo80672p() {
        return "clockwork".equals(((C86812ai) this.f235117f.mo27525b()).f234471a.f236953f);
    }
}
