package com.google.android.apps.gsa.search.core.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p5846e.p5847a.C74505a;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86684f;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.shared.service.C87678af;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.C88491l;
import com.google.android.apps.gsa.search.shared.service.C88498s;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88263ve;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88265vg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88321xi;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88323xk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88324xl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88326xn;
import com.google.android.apps.gsa.search.shared.service.p6935b.aay;
import com.google.android.apps.gsa.search.shared.service.p6935b.aba;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p7066m.C90091ep;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.C91030n;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.p445a.C8848a;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.search.core.service.r */
/* compiled from: PG */
public final class C86775r extends C88491l implements C86697a, C91007g, C86681c {

    /* renamed from: a */
    public static final C59071e f234377a = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.r");

    /* renamed from: A */
    private final C90476a f234378A;

    /* renamed from: B */
    private final C86773p f234379B = new C86773p(this);

    /* renamed from: b */
    public final IBinder.DeathRecipient f234380b = new C86696f(this);

    /* renamed from: c */
    public final long f234381c;

    /* renamed from: d */
    public final C86626av f234382d;

    /* renamed from: e */
    public final C86771n f234383e;

    /* renamed from: f */
    public final ClientConfig f234384f;

    /* renamed from: g */
    public final C68214a f234385g;

    /* renamed from: h */
    public final long f234386h;

    /* renamed from: i */
    public boolean f234387i = false;

    /* renamed from: j */
    public long f234388j = 0;

    /* renamed from: k */
    public volatile long f234389k = 0;

    /* renamed from: l */
    public Bundle f234390l;

    /* renamed from: m */
    public C88431bb f234391m;

    /* renamed from: n */
    public boolean f234392n;

    /* renamed from: o */
    public volatile boolean f234393o;

    /* renamed from: p */
    public boolean f234394p;

    /* renamed from: q */
    public long f234395q;

    /* renamed from: r */
    public boolean f234396r;

    /* renamed from: s */
    public volatile C86684f f234397s;

    /* renamed from: t */
    public ClientEventData f234398t;

    /* renamed from: u */
    public boolean f234399u;

    /* renamed from: v */
    public Query f234400v;

    /* renamed from: w */
    public final boolean f234401w;

    /* renamed from: x */
    public final C22871g f234402x;

    /* renamed from: y */
    private final C22871g f234403y;

    /* renamed from: z */
    private final AtomicBoolean f234404z = new AtomicBoolean(false);

    public C86775r(long j, C86626av avVar, C88498s sVar, ClientConfig clientConfig, C22871g gVar, C90821bm bmVar, C68214a aVar, long j2, C90476a aVar2) {
        this.f234381c = j;
        this.f234382d = avVar;
        this.f234384f = clientConfig;
        this.f234403y = gVar;
        this.f234385g = aVar;
        this.f234386h = j2;
        this.f234383e = new C86771n(this, sVar);
        this.f234378A = aVar2;
        this.f234401w = sVar instanceof C8848a;
        this.f234402x = bmVar.mo85163a(C86774q.class);
    }

    /* renamed from: o */
    private final void m139817o() {
        this.f234400v = null;
        this.f234398t = null;
        this.f234399u = false;
    }

    /* renamed from: p */
    private static boolean m139818p(ClientEventData clientEventData) {
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        return a == C87739bu.START_CLIENT || a == C87739bu.STOP_CLIENT || a == C87739bu.TOP_RESUMED_ACTIVTIY;
    }

    /* renamed from: a */
    public final void mo80279a(ClientEventData clientEventData) {
        Object obj;
        Object obj2;
        C22872h.m42743c(C86593a.class);
        C58838bb.m90884s(!m139818p(clientEventData), "Lifecycle client events should be handled by {@link#handleLifecycleClientEvent(ClientEventData)}");
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 37) {
            this.f234382d.mo80245k(new C86769l(this, this, clientEventData));
        } else if (ordinal != 38 && ordinal != 47) {
            switch (ordinal) {
                case 42:
                    C62940bt btVar = C88263ve.f238733a;
                    C87741bw bwVar = clientEventData.f236955a;
                    C62940bt r0 = C62942bv.checkIsLite(btVar);
                    bwVar.mo58887l(r0);
                    Object l = bwVar.f169962ag.mo58854l(r0.f169971d);
                    if (l == null) {
                        obj = r0.f169969b;
                    } else {
                        obj = r0.mo58889c(l);
                    }
                    this.f234396r = ((C88265vg) obj).f238737b;
                    if (this.f234387i) {
                        this.f234382d.mo80245k(new C86768k(this, this, clientEventData));
                        return;
                    }
                    return;
                case 43:
                    this.f234382d.mo80244j(new C86698g(this, this, (Query) clientEventData.mo81912b(Query.class), clientEventData));
                    return;
                case 44:
                    this.f234382d.mo80244j(new C86748i(this, this, (Query) clientEventData.mo81912b(Query.class), clientEventData));
                    return;
                case 45:
                    this.f234382d.mo80244j(new C86733h(this, this, clientEventData));
                    return;
                default:
                    if (this.f234387i || C87678af.f237027c.contains(a)) {
                        this.f234382d.mo80238c().mo80224e(this.f234381c, clientEventData);
                    } else {
                        C86773p pVar = this.f234379B;
                        C58976aa aaVar = C58975e.f156826a;
                        pVar.f234375b.add(clientEventData);
                    }
                    if (a == C87739bu.WINDOW_FOCUS_CHANGED) {
                        C62940bt btVar2 = aay.f237114a;
                        C87741bw bwVar2 = clientEventData.f236955a;
                        C62940bt r02 = C62942bv.checkIsLite(btVar2);
                        bwVar2.mo58887l(r02);
                        Object l2 = bwVar2.f169962ag.mo58854l(r02.f169971d);
                        if (l2 == null) {
                            obj2 = r02.f169969b;
                        } else {
                            obj2 = r02.mo58889c(l2);
                        }
                        aba aba = (aba) obj2;
                        boolean z = aba.f237129b;
                        this.f234394p = z;
                        if (z) {
                            this.f234395q = aba.f237130c;
                            return;
                        } else {
                            this.f234395q = 0;
                            return;
                        }
                    } else {
                        return;
                    }
            }
        } else if (this.f234387i) {
            this.f234382d.mo80244j(new C86767j(this, this, clientEventData));
        } else {
            mo80384f();
        }
    }

    /* renamed from: b */
    public final long mo80304b() {
        C22872h.m42743c(C86593a.class);
        long j = this.f234388j;
        this.f234388j = 0;
        return j;
    }

    /* renamed from: c */
    public final C87682aj mo80305c() {
        return this.f234383e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C88431bb mo80383e() {
        C88431bb bbVar = this.f234391m;
        this.f234391m = C88431bb.f239082a;
        return bbVar;
    }

    /* renamed from: f */
    public final void mo80384f() {
        C58976aa aaVar = C58975e.f156826a;
        m139817o();
        C86773p pVar = this.f234379B;
        C58557jl.m90145z(pVar.f234375b, C86672d.f234148a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo80385g(ClientEventData clientEventData) {
        Object obj;
        Object obj2;
        C58528ij ijVar = C87678af.f237027c;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (ijVar.contains(a) && !this.f234382d.mo80254t(this)) {
            this.f234382d.mo80248n(this, false);
            C22872h.m42743c(C86593a.class);
            mo80388j(clientEventData, this);
        } else if (m139818p(clientEventData)) {
            C58838bb.m90883r(m139818p(clientEventData));
            C87739bu a2 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
            if (a2 == null) {
                a2 = C87739bu.UNKNOWN;
            }
            int ordinal = a2.ordinal();
            if (ordinal == 59) {
                C62940bt btVar = C88321xi.f238851a;
                C87741bw bwVar = clientEventData.f236955a;
                C62940bt r0 = C62942bv.checkIsLite(btVar);
                bwVar.mo58887l(r0);
                Object l = bwVar.f169962ag.mo58854l(r0.f169971d);
                if (l == null) {
                    obj = r0.f169969b;
                } else {
                    obj = r0.mo58889c(l);
                }
                C88323xk xkVar = (C88323xk) obj;
                this.f234389k = xkVar.f238858e;
                long j = xkVar.f238856c;
                long j2 = xkVar.f238855b;
                Bundle bundle = (Bundle) clientEventData.mo81912b(Bundle.class);
                C88431bb bbVar = xkVar.f238857d;
                if (bbVar == null) {
                    bbVar = C88431bb.f239082a;
                }
                C88431bb bbVar2 = bbVar;
                C58976aa aaVar = C58975e.f156826a;
                if (!this.f234384f.f236953f.equals("lens")) {
                    this.f234382d.mo80253s(j2, j, bundle, bbVar2);
                    return;
                }
                try {
                    this.f234382d.mo80253s(j2, j, bundle, bbVar2);
                } catch (RuntimeException e) {
                    ((C89911f) this.f234385g.mo27525b()).mo83755a((Throwable) null, 123236020, 29).mo83721a();
                    C59104x d = f234377a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "AttachedClient");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(8368)).mo56359L("#startClient: clientId=%d, handoverId=%d, sessionContext=%s", Long.valueOf(j2), Long.valueOf(j), bundle == null ? "null" : "non-null");
                    int i = C90755l.f253831a;
                }
            } else if (ordinal == 60) {
                C62940bt btVar2 = C88324xl.f238860a;
                C87741bw bwVar2 = clientEventData.f236955a;
                C62940bt r02 = C62942bv.checkIsLite(btVar2);
                bwVar2.mo58887l(r02);
                Object l2 = bwVar2.f169962ag.mo58854l(r02.f169971d);
                if (l2 == null) {
                    obj2 = r02.f169969b;
                } else {
                    obj2 = r02.mo58889c(l2);
                }
                C88326xn xnVar = (C88326xn) obj2;
                long j3 = xnVar.f238864b;
                boolean z = xnVar.f238865c;
                C86626av avVar = this.f234382d;
                C86775r rVar = (C86775r) avVar.f234024b.get(j3);
                if (rVar != null) {
                    rVar.f234392n = false;
                    if (z) {
                        rVar.mo80390l();
                    }
                    avVar.mo80241g(rVar, false, !z);
                }
            } else if (ordinal == 203 && this.f234392n && !this.f234387i && !this.f234382d.mo80254t(this)) {
                this.f234382d.mo80240f(this);
            }
        } else {
            if (this.f234392n && !this.f234387i && this.f234397s != null) {
                C58528ij e2 = this.f234397s.f234158a.mo80292e();
                C87739bu a3 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
                if (a3 == null) {
                    a3 = C87739bu.UNKNOWN;
                }
                if (e2.contains(a3)) {
                    C22872h.m42742b(C86593a.class);
                    mo80388j(clientEventData, C86674e.f234149a);
                    return;
                }
            }
            C86773p pVar = this.f234379B;
            int a4 = pVar.mo80382a() - 1;
            if (a4 == 0) {
                C58976aa aaVar2 = C58975e.f156826a;
                pVar.f234375b.add(clientEventData);
            } else if (a4 != 1) {
                C58976aa aaVar3 = C58975e.f156826a;
                C86775r rVar2 = pVar.f234376c;
                rVar2.mo80388j(clientEventData, rVar2);
            } else {
                C58976aa aaVar4 = C58975e.f156826a;
                pVar.f234374a.add(clientEventData);
                pVar.f234376c.f234382d.mo80251q(new C86772o(pVar));
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("AttachedClient");
        fVar.mo85279c("client ID").mo85276a(C90752i.m148230d(Long.valueOf(this.f234381c)));
        fVar.mo85279c("handing over").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f234393o)));
        fVar.mo85287n(this.f234379B);
        fVar.mo85285l(this.f234384f);
    }

    /* renamed from: h */
    public final void mo80386h(boolean z) {
        C22872h.m42743c(C86593a.class);
        if (z) {
            C58838bb.m90884s(this.f234387i, "AttachedClient#flushPendingItems on inactive client");
            C86610af c = this.f234382d.mo80238c();
            ClientEventData clientEventData = this.f234398t;
            if (clientEventData != null) {
                C58976aa aaVar = C58975e.f156826a;
                c.mo80224e(this.f234381c, clientEventData);
            }
            Query query = this.f234400v;
            if (query != null) {
                if (this.f234399u) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    C86610af c2 = this.f234382d.mo80238c();
                    long j = this.f234381c;
                    C88489j jVar = new C88489j(C87739bu.QUERY_EDIT);
                    jVar.mo82015c(query);
                    c2.mo80224e(j, jVar.mo82013a());
                } else {
                    C58976aa aaVar3 = C58975e.f156826a;
                    C86610af c3 = this.f234382d.mo80238c();
                    long j2 = this.f234381c;
                    C88489j jVar2 = new C88489j(C87739bu.QUERY_SET);
                    jVar2.mo82015c(query);
                    c3.mo80224e(j2, jVar2.mo82013a());
                }
            }
            C58838bb.m90884s(mo80392n(), "SessionContainer not set before flushing the events");
            C86773p pVar = this.f234379B;
            int size = pVar.f234375b.size();
            pVar.f234374a.addAll(pVar.f234375b);
            pVar.f234375b.clear();
            for (int i = 0; i < size; i++) {
                pVar.f234376c.f234382d.mo80251q(new C86772o(pVar));
            }
            m139817o();
            return;
        }
        C58976aa aaVar4 = C58975e.f156826a;
        m139817o();
        this.f234379B.f234375b.clear();
    }

    /* renamed from: i */
    public final void mo80387i(ClientEventData clientEventData) {
        try {
            if (this.f234378A.mo84225b()) {
                C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
                if (a == null) {
                    a = C87739bu.UNKNOWN;
                }
                String valueOf = String.valueOf(a);
                C91030n.m148695a("AttachedClient.onGenericClientEvent-[ClientEvent = " + valueOf + "]", this.f234378A);
            }
            this.f234403y.mo28212l("AttachedClient [handleClientEvent]", new C86660c(this, clientEventData));
            if (this.f234378A.mo84225b()) {
                C91030n.m148696b(this.f234378A);
            }
        } catch (Throwable th) {
            if (this.f234378A.mo84225b()) {
                C91030n.m148696b(this.f234378A);
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo80388j(ClientEventData clientEventData, C86681c cVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f234397s != null) {
            C86684f fVar = this.f234397s;
            long j = this.f234381c;
            fVar.mo80289a("#handleGenericClientEvent");
            fVar.mo80290b("#handleGenericClientEvent");
            ClientConfig clientConfig = null;
            try {
                fVar.f234158a.mo80293f(j, clientEventData, cVar);
            } finally {
                if (fVar.f234167j.mo79746e(C90091ep.f250549l)) {
                    try {
                        clientConfig = fVar.f234159b.mo80283a();
                    } catch (IllegalStateException unused) {
                    }
                    C118827a aVar = fVar.f234168k;
                    C118569b bVar = C118569b.CLIENT_EVENT_EMITTED_COUNT;
                    C118575h hVar = C118575h.SESSION_CLIENT_EVENT;
                    C118575h hVar2 = C118575h.SESSION_CLIENT_EVENT;
                    C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
                    if (a == null) {
                        a = C87739bu.UNKNOWN;
                    }
                    aVar.mo77946i(bVar, hVar, hVar2, C74505a.m120464a(clientConfig, a)).mo104025g(1);
                }
            }
        } else {
            C59104x c = f234377a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AttachedClient");
            C59052c cVar2 = (C59052c) ((C59052c) c).mo56372aa(8363);
            C87739bu a2 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
            if (a2 == null) {
                a2 = C87739bu.UNKNOWN;
            }
            cVar2.mo56353F("Dropping clientEvent = %s coming from client[%d]", a2, this.f234381c);
        }
    }

    /* renamed from: k */
    public final void mo80389k() {
        if (!this.f234404z.getAndSet(true)) {
            C86626av avVar = this.f234382d;
            if (C22872h.m42744d(C86593a.class)) {
                avVar.mo80241g(this, true, true);
            } else {
                avVar.f234026d.mo28212l("SearchServiceCore [onClientBinderFailed]", new C86620ap(avVar, this));
            }
        }
    }

    /* renamed from: l */
    public final void mo80390l() {
        this.f234393o = true;
        this.f234383e.mo80379b(new C87684al(C88244um.HAND_OVER).mo81964a());
    }

    /* renamed from: m */
    public final void mo80391m(Intent intent) {
        C86771n nVar = this.f234383e;
        C87684al alVar = new C87684al(C88244um.START_ACTIVITY);
        alVar.mo81966c(intent);
        nVar.mo80379b(alVar.mo81964a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo80392n() {
        return this.f234397s != null;
    }

    public final String toString() {
        long j = this.f234381c;
        String str = true != this.f234393o ? BuildConfig.FLAVOR : " (HANDING OVER)";
        String valueOf = String.valueOf(this.f234384f);
        return "AttachedClient[" + j + str + ", " + valueOf + "]";
    }
}
