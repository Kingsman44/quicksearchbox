package com.google.android.apps.gsa.search.core.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.p5846e.p5847a.C74505a;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.p6511ah.C84507n;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86746c;
import com.google.android.apps.gsa.search.core.service.p6856h.C86747d;
import com.google.android.apps.gsa.search.core.service.p6856h.p6858b.C86745a;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.C86899cu;
import com.google.android.apps.gsa.search.core.state.C86977dc;
import com.google.android.apps.gsa.search.core.state.C86978dd;
import com.google.android.apps.gsa.search.core.state.C86996dv;
import com.google.android.apps.gsa.search.core.state.C87116hk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87138if;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.p6864a.C86787b;
import com.google.android.apps.gsa.search.core.state.p6864a.C86791f;
import com.google.android.apps.gsa.search.core.state.p6872d.C86913ag;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p7066m.C90091ep;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Collection;
import java.util.EnumMap;

/* renamed from: com.google.android.apps.gsa.search.core.service.af */
/* compiled from: PG */
public final class C86610af implements SharedPreferences.OnSharedPreferenceChangeListener, C87138if, C86776s, C86640bg, C91007g {

    /* renamed from: a */
    public static final C59071e f233966a = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.af");

    /* renamed from: b */
    public final Context f233967b;

    /* renamed from: c */
    public final C86913ag f233968c;

    /* renamed from: d */
    public final C86977dc f233969d;

    /* renamed from: e */
    public final C86899cu f233970e;

    /* renamed from: f */
    public final C22871g f233971f;

    /* renamed from: g */
    public final C86127w f233972g;

    /* renamed from: h */
    public final C68214a f233973h;

    /* renamed from: i */
    public final C86747d f233974i;

    /* renamed from: j */
    final C86746c f233975j;

    /* renamed from: k */
    public boolean f233976k;

    /* renamed from: l */
    public volatile C86775r f233977l;

    /* renamed from: m */
    public final C58881cr f233978m;

    /* renamed from: n */
    private final C86791f f233979n;

    /* renamed from: o */
    private final C86787b f233980o;

    /* renamed from: p */
    private final C86626av f233981p;

    /* renamed from: q */
    private final C86978dd f233982q;

    /* renamed from: r */
    private final C86996dv f233983r;

    /* renamed from: s */
    private final C68214a f233984s;

    /* renamed from: t */
    private final C86671ci f233985t;

    /* renamed from: u */
    private final C86124t f233986u;

    /* renamed from: v */
    private final C118827a f233987v;

    /* renamed from: w */
    private C86775r f233988w;

    /* renamed from: x */
    private final EnumMap f233989x;

    /* renamed from: y */
    private final EnumMap f233990y;

    public C86610af(Context context, C86626av avVar, C86978dd ddVar, C86996dv dvVar, C86913ag agVar, C86977dc dcVar, C86791f fVar, C86787b bVar, C86899cu cuVar, C22871g gVar, C86127w wVar, C68214a aVar, C84507n nVar, C86747d dVar, C68214a aVar2, C86671ci ciVar, C86124t tVar, C118827a aVar3) {
        C86747d dVar2 = dVar;
        C86606ab abVar = new C86606ab();
        this.f233975j = abVar;
        this.f233967b = context;
        this.f233981p = avVar;
        this.f233982q = ddVar;
        this.f233983r = dvVar;
        this.f233985t = ciVar;
        this.f233971f = gVar;
        this.f233972g = wVar;
        this.f233968c = agVar;
        this.f233969d = dcVar;
        this.f233979n = fVar;
        this.f233980o = bVar;
        this.f233970e = cuVar;
        this.f233974i = dVar2;
        dVar2.mo80359f(abVar);
        this.f233973h = aVar;
        this.f233984s = aVar2;
        this.f233986u = tVar;
        this.f233987v = aVar3;
        nVar.mo78212a();
        this.f233978m = C58886cw.m90973a(new C86783z(this, dcVar));
        this.f233989x = agVar.mo80759k();
        EnumMap k = dcVar.mo80759k();
        this.f233990y = k;
        for (C87739bu buVar : k.keySet()) {
            C58838bb.m90887v(!this.f233989x.containsKey(buVar), "Multiple states for ClientEvent %s", buVar);
        }
        this.f233972g.f232790a.mo79724c(this);
    }

    /* renamed from: l */
    private final void m139500l(C86775r rVar, C87739bu buVar, boolean z) {
        if (this.f233986u.mo79746e(C90091ep.f250549l)) {
            this.f233987v.mo77946i(C118569b.SEARCH_CLIENT_EVENT_EMITTED_RATE, C118575h.SEARCH_CLIENT_EVENT, C118575h.SEARCH_CLIENT_EVENT, C74505a.m120464a(rVar != null ? rVar.f234384f : null, buVar)).mo104025g(true != z ? 0 : 1);
        }
    }

    /* renamed from: m */
    private final void m139501m(C86775r rVar, boolean z) {
        C86775r rVar2 = this.f233977l;
        rVar2.getClass();
        rVar2.mo80386h(false);
        if (rVar == null && !z) {
            this.f233988w = this.f233977l;
        }
    }

    /* renamed from: a */
    public final C87116hk mo80220a() {
        return C86898ct.f234664B;
    }

    /* renamed from: b */
    public final void mo80221b(ClientEventData clientEventData) {
        C86775r rVar = this.f233977l;
        if (rVar != null) {
            C22872h.m42743c(C86593a.class);
            rVar.mo80385g(clientEventData);
            return;
        }
        ((C59052c) ((C59052c) f233966a.mo56225c()).mo56372aa(8388)).mo56386p("Failed to handle generic client: no active attached client.");
    }

    /* renamed from: c */
    public final void mo80222c(ServiceEventData serviceEventData) {
        C22872h.m42743c(C86593a.class);
        if (!mo80228i(serviceEventData)) {
            ((C59052c) ((C59052c) f233966a.mo56225c()).mo56372aa(8384)).mo56386p("Failed to handle generic service: no active attached client.");
        }
    }

    /* renamed from: d */
    public final void mo80223d(C87135ic icVar) {
        Collection<C86745a> b = this.f233974i.mo80356b();
        for (C86745a f : b) {
            f.mo79107f(icVar);
        }
        for (C86745a a : b) {
            a.mo79105a(icVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo80224e(long j, ClientEventData clientEventData) {
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if ((!this.f233968c.mo80763q() || !this.f233969d.mo80763q()) && (!this.f233989x.containsKey(a) || !this.f233968c.mo80763q())) {
            ((C89911f) this.f233984s.mo27525b()).mo83755a((Throwable) null, 65587551, 29).mo83721a();
        }
        C87141ii iiVar = (C87141ii) this.f233989x.get(a);
        if (iiVar == null) {
            iiVar = (C87141ii) this.f233990y.get(a);
        }
        if (iiVar != null) {
            try {
                iiVar.mo80408hr(j, clientEventData);
                C86775r rVar = this.f233977l;
                C87739bu a2 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
                if (a2 == null) {
                    a2 = C87739bu.UNKNOWN;
                }
                m139500l(rVar, a2, true);
            } catch (Throwable th) {
                C86775r rVar2 = this.f233977l;
                C87739bu a3 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
                if (a3 == null) {
                    a3 = C87739bu.UNKNOWN;
                }
                m139500l(rVar2, a3, false);
                throw th;
            }
        } else {
            ((C59052c) ((C59052c) f233966a.mo56226d()).mo56372aa(8387)).mo56389s("unhandled event %s", a);
            C86775r rVar3 = this.f233977l;
            C87739bu a4 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
            if (a4 == null) {
                a4 = C87739bu.UNKNOWN;
            }
            m139500l(rVar3, a4, false);
        }
    }

    @Deprecated
    /* renamed from: f */
    public final void mo80225f(C60870cx cxVar, long j, long j2) {
        C60856cj.m92911t(cxVar, new C86609ae(this, j, j2), C60826bg.f164896a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0101  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80226g(com.google.android.apps.gsa.search.core.service.C86775r r10) {
        /*
            r9 = this;
            com.google.common.f.ad r0 = com.google.common.p4526f.C58979ad.FULL
            java.lang.String r1 = "stack size"
            com.google.common.p4526f.p4534f.C59081b.m91349a(r0, r1)
            com.google.android.apps.gsa.search.core.service.r r0 = r9.f233977l
            if (r10 == r0) goto L_0x0113
            com.google.android.apps.gsa.search.core.service.r r0 = r9.f233977l
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x009a
            if (r10 != 0) goto L_0x0019
            boolean r3 = r0.f234393o
            if (r3 != 0) goto L_0x0019
            r3 = 1
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            long r4 = r0.f234389k
            com.google.android.apps.gsa.search.core.state.a.f r6 = r9.f233979n
            com.google.android.apps.gsa.search.shared.service.c.c r6 = r6.mo80447f()
            long r6 = r6.mo81991a()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x002c
            r4 = 1
            goto L_0x002d
        L_0x002c:
            r4 = 0
        L_0x002d:
            if (r4 == 0) goto L_0x0055
            if (r3 == 0) goto L_0x0055
            com.google.android.apps.gsa.search.core.service.ci r5 = r9.f233985t
            com.google.common.base.ax r5 = r5.f234147a
            boolean r6 = r5.mo56113h()
            if (r6 == 0) goto L_0x0044
            java.lang.Object r5 = r5.mo56107c()
            com.google.android.apps.gsa.search.core.service.ch r5 = (com.google.android.apps.gsa.search.core.service.C86670ch) r5
            r5.mo80278a()
        L_0x0044:
            com.google.android.apps.gsa.search.shared.service.ClientConfig r5 = r0.f234384f
            java.lang.String r5 = r5.f236953f
            java.lang.String r6 = "search"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0055
            com.google.android.apps.gsa.search.core.state.a.b r5 = r9.f233980o
            r5.mo80435i()
        L_0x0055:
            com.google.android.apps.gsa.search.core.state.a.f r5 = r9.f233979n
            com.google.android.apps.gsa.search.shared.service.c.c r5 = r5.mo80447f()
            java.lang.String r5 = r5.mo81992b()
            com.google.android.apps.gsa.search.core.state.cu r6 = r9.f233970e
            com.google.android.apps.gsa.search.core.state.a.j r5 = r6.mo80560b(r5)
            boolean r5 = r5.mo80456J()
            if (r5 != 0) goto L_0x0081
            com.google.android.apps.gsa.search.shared.service.ClientConfig r5 = r0.f234384f
            com.google.android.apps.gsa.shared.util.BitFlags r5 = r5.f236949b
            long r5 = r5.f253762b
            r7 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            boolean r5 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r5, r7)
            if (r5 != 0) goto L_0x007d
            goto L_0x0081
        L_0x007d:
            r9.m139501m(r10, r2)
            goto L_0x009a
        L_0x0081:
            r9.m139501m(r10, r3)
            if (r3 == 0) goto L_0x009a
            if (r4 == 0) goto L_0x009a
            com.google.android.apps.gsa.search.core.state.dd r3 = r9.f233982q
            long r4 = r0.f234389k
            com.google.android.apps.gsa.search.shared.service.ClientConfig r0 = r0.f234384f
            java.lang.String r0 = r0.f236953f
            com.google.android.apps.gsa.search.shared.service.c.a r6 = new com.google.android.apps.gsa.search.shared.service.c.a
            r6.<init>(r4, r0)
            boolean r0 = r3.mo80619d(r6)
            goto L_0x009b
        L_0x009a:
            r0 = 0
        L_0x009b:
            r9.f233977l = r10
            if (r10 == 0) goto L_0x0101
            com.google.android.apps.gsa.search.core.service.r r0 = r9.f233988w
            if (r0 == 0) goto L_0x00ac
            com.google.android.apps.gsa.search.core.service.r r3 = r9.f233977l
            if (r0 == r3) goto L_0x00ac
            com.google.android.apps.gsa.search.core.service.r r0 = r9.f233988w
            r0.mo80386h(r2)
        L_0x00ac:
            r0 = 0
            r9.f233988w = r0
            com.google.android.apps.gsa.search.core.state.d.ag r0 = r9.f233968c
            r0.mo80555e()
            com.google.android.apps.gsa.search.core.state.dd r0 = r9.f233982q     // Catch:{ all -> 0x00f1 }
            long r2 = r10.f234389k     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.gsa.search.shared.service.ClientConfig r4 = r10.f234384f     // Catch:{ all -> 0x00f1 }
            java.lang.String r4 = r4.f236953f     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.gsa.search.shared.service.c.a r5 = new com.google.android.apps.gsa.search.shared.service.c.a     // Catch:{ all -> 0x00f1 }
            r5.<init>(r2, r4)     // Catch:{ all -> 0x00f1 }
            long r2 = r10.mo80304b()     // Catch:{ all -> 0x00f1 }
            java.lang.Class<com.google.android.apps.gsa.search.core.service.a.a> r4 = com.google.android.apps.gsa.search.core.service.p6842a.C86593a.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42743c(r4)     // Catch:{ all -> 0x00f1 }
            android.os.Bundle r4 = r10.f234390l     // Catch:{ all -> 0x00f1 }
            r0.mo80618c(r5, r2, r4)     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.gsa.search.core.state.a.f r0 = r9.f233979n     // Catch:{ all -> 0x00f1 }
            long r2 = r10.f234381c     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.gsa.search.shared.service.ClientConfig r4 = r10.f234384f     // Catch:{ all -> 0x00f1 }
            java.lang.Class<com.google.android.apps.gsa.search.core.service.a.a> r5 = com.google.android.apps.gsa.search.core.service.p6842a.C86593a.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42743c(r5)     // Catch:{ all -> 0x00f1 }
            boolean r5 = r10.f234396r     // Catch:{ all -> 0x00f1 }
            r0.mo80443a(r2, r4, r5)     // Catch:{ all -> 0x00f1 }
            r10.mo80386h(r1)     // Catch:{ all -> 0x00f1 }
            com.google.android.apps.gsa.search.core.state.d.ag r0 = r9.f233968c
            r0.mo80554c()
            com.google.android.apps.gsa.search.core.state.dv r0 = r9.f233983r
            com.google.android.apps.gsa.search.shared.service.ClientConfig r10 = r10.f234384f
            java.lang.String r10 = r10.f236953f
            r0.mo80621f(r10)
            return
        L_0x00f1:
            r0 = move-exception
            com.google.android.apps.gsa.search.core.state.d.ag r1 = r9.f233968c
            r1.mo80554c()
            com.google.android.apps.gsa.search.core.state.dv r1 = r9.f233983r
            com.google.android.apps.gsa.search.shared.service.ClientConfig r10 = r10.f234384f
            java.lang.String r10 = r10.f236953f
            r1.mo80621f(r10)
            throw r0
        L_0x0101:
            com.google.android.apps.gsa.search.core.state.a.f r10 = r9.f233979n
            r3 = 0
            com.google.android.apps.gsa.search.shared.service.ClientConfig r1 = com.google.android.apps.gsa.search.shared.service.ClientConfig.f236948a
            r10.mo80443a(r3, r1, r2)
            if (r0 == 0) goto L_0x0113
            com.google.android.apps.gsa.search.core.state.dv r10 = r9.f233983r
            java.lang.String r0 = "none"
            r10.mo80621f(r0)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.service.C86610af.mo80226g(com.google.android.apps.gsa.search.core.service.r):void");
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchController");
        fVar.mo85287n(this.f233968c);
        fVar.mo85287n(this.f233974i);
        fVar.mo85285l((C90964a) this.f233973h.mo27525b());
    }

    @Deprecated
    /* renamed from: h */
    public final boolean mo80227h() {
        return this.f233977l != null && !this.f233977l.f234393o;
    }

    @Deprecated
    /* renamed from: i */
    public final boolean mo80228i(ServiceEventData serviceEventData) {
        if (!mo80227h()) {
            return false;
        }
        this.f233977l.f234383e.mo80379b(serviceEventData);
        return true;
    }

    /* renamed from: j */
    public final boolean mo80229j(long j, ServiceEventData serviceEventData) {
        C22872h.m42743c(C86593a.class);
        C86775r rVar = (C86775r) this.f233981p.f234024b.get(j);
        if (rVar == null) {
            return false;
        }
        rVar.f234383e.mo80379b(serviceEventData);
        return true;
    }

    /* renamed from: k */
    public final void mo80230k(long j) {
        mo80229j(j, new C87684al(C88244um.UNBIND_BACKGROUND_CLIENT).mo81964a());
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f233971f.mo28212l("notify global states on preference changed", new C86605aa(this, str));
    }
}
