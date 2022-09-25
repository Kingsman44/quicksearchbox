package com.google.android.apps.p8919h.p8920a.p8921a.p8922a;

import android.os.Build;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119080e;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119088m;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8925c.C119117a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58400dq;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58692ol;
import com.google.protobuf.C63088z;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5285d.p5290b.p5291a.p5292a.C68138aa;
import p5285d.p5290b.p5291a.p5292a.C68139ab;
import p5285d.p5290b.p5291a.p5292a.C68140ac;
import p5285d.p5290b.p5291a.p5292a.C68149al;
import p5285d.p5290b.p5291a.p5292a.C68150am;
import p5285d.p5290b.p5291a.p5292a.C68151an;
import p5285d.p5290b.p5291a.p5292a.C68157at;
import p5285d.p5290b.p5291a.p5292a.C68158au;
import p5285d.p5290b.p5291a.p5292a.C68159av;
import p5285d.p5290b.p5291a.p5292a.C68160aw;
import p5285d.p5290b.p5291a.p5292a.C68164b;
import p5285d.p5290b.p5291a.p5292a.C68170bf;
import p5285d.p5290b.p5291a.p5292a.C68173bi;
import p5285d.p5290b.p5291a.p5292a.C68174bj;
import p5285d.p5290b.p5291a.p5292a.C68181bq;
import p5285d.p5290b.p5291a.p5292a.C68189by;
import p5285d.p5290b.p5291a.p5292a.C68194g;
import p5285d.p5290b.p5291a.p5292a.C68195h;
import p5285d.p5290b.p5291a.p5292a.C68196i;
import p5285d.p5290b.p5291a.p5292a.C68199l;
import p5285d.p5290b.p5291a.p5292a.C68200m;
import p5285d.p5290b.p5291a.p5292a.C68201n;
import p5285d.p5290b.p5291a.p5292a.C68202o;
import p5488io.grpc.p5533i.C70868g;
import p5488io.grpc.p5533i.C70869h;

/* renamed from: com.google.android.apps.h.a.a.a.h */
/* compiled from: PG */
public final class C119126h extends C119075a {

    /* renamed from: k */
    public static Set f332262k;

    /* renamed from: l */
    public C58833ax f332263l = C58836b.f156633a;

    /* renamed from: m */
    public final C119127i f332264m;

    /* renamed from: n */
    public final C119131m f332265n;

    /* renamed from: o */
    public final C58692ol f332266o;

    /* renamed from: p */
    public final ConcurrentHashMap f332267p;

    /* renamed from: q */
    public final ScheduledExecutorService f332268q;

    /* renamed from: r */
    public String f332269r;

    /* renamed from: s */
    private String f332270s;

    /* renamed from: t */
    private final C68181bq f332271t;

    /* renamed from: u */
    private boolean f332272u;

    public C119126h(C119094ac acVar, C119127i iVar, ScheduledExecutorService scheduledExecutorService, C119131m mVar) {
        super(acVar);
        C58485gu.m89845m();
        this.f332270s = BuildConfig.FLAVOR;
        this.f332271t = C68181bq.f184490b;
        this.f332269r = BuildConfig.FLAVOR;
        this.f332264m = iVar;
        this.f332268q = scheduledExecutorService;
        this.f332265n = mVar;
        this.f332267p = new ConcurrentHashMap();
        this.f332266o = new C58400dq(new ConcurrentHashMap());
        mo104113e();
        mo104110b(new C119117a());
    }

    /* renamed from: u */
    private final C68139ab m197829u() {
        C68138aa aaVar = (C68138aa) C68139ab.f184417e.createBuilder();
        String str = this.f332175j;
        aaVar.copyOnWrite();
        str.getClass();
        ((C68139ab) aaVar.instance).f184419a = str;
        aaVar.copyOnWrite();
        ((C68139ab) aaVar.instance).f184420b = "android.1.5.0";
        int i = Build.VERSION.SDK_INT;
        aaVar.copyOnWrite();
        ((C68139ab) aaVar.instance).f184421c = i;
        String str2 = Build.MODEL;
        aaVar.copyOnWrite();
        str2.getClass();
        ((C68139ab) aaVar.instance).f184422d = str2;
        return (C68139ab) aaVar.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00cc, code lost:
        if (r4.f332222a.size() > 1) goto L_0x00ce;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo104109a(com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119103al r10) {
        /*
            r9 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r10
            java.lang.String r3 = "EndpointSpeakr"
            java.lang.String r4 = "Preload: %s"
            java.lang.String r1 = java.lang.String.format(r4, r1)
            android.util.Log.i(r3, r1)
            boolean r1 = r9.f332272u
            if (r1 != 0) goto L_0x004f
            com.google.android.apps.h.a.a.a.i r1 = r9.f332264m
            d.b.a.a.t r3 = p5285d.p5290b.p5291a.p5292a.C68207t.f184558b
            com.google.protobuf.bn r3 = r3.createBuilder()
            d.b.a.a.s r3 = (p5285d.p5290b.p5291a.p5292a.C68206s) r3
            d.b.a.a.ab r4 = r9.m197829u()
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            d.b.a.a.t r5 = (p5285d.p5290b.p5291a.p5292a.C68207t) r5
            r4.getClass()
            r5.f184560a = r4
            com.google.protobuf.bv r3 = r3.build()
            d.b.a.a.t r3 = (p5285d.p5290b.p5291a.p5292a.C68207t) r3
            com.google.common.util.concurrent.cx r1 = r1.mo104195a(r3)
            r9.f332272u = r0
            com.google.android.apps.h.a.a.a.g r3 = new com.google.android.apps.h.a.a.a.g
            r3.<init>()
            com.google.common.util.concurrent.bg r4 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r1, r3, r4)
            com.google.android.apps.h.a.a.a.d r3 = new com.google.android.apps.h.a.a.a.d
            r3.<init>(r9)
            com.google.common.util.concurrent.bg r4 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60922j.m93044g(r1, r3, r4)
        L_0x004f:
            java.lang.String r1 = "AbstractSpeakr"
            java.lang.String r3 = "preload: "
            java.lang.String r4 = java.lang.String.valueOf(r10)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r3 = r3.concat(r4)
            android.util.Log.d(r1, r3)
            r9.mo104116h()
            monitor-enter(r9)
            com.google.common.base.C58833ax.m90834k(r10)     // Catch:{ all -> 0x015d }
            monitor-exit(r9)     // Catch:{ all -> 0x015d }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r9.f332269r = r1
            com.google.android.apps.h.a.a.a.m r1 = r9.f332265n
            int r1 = r1.f332278a
            java.lang.String r3 = r9.f332269r
            com.google.android.apps.h.a.a.a.a.e r4 = new com.google.android.apps.h.a.a.a.a.e
            r4.<init>(r10, r2, r1, r3)
            com.google.common.b.ol r1 = r9.f332266o
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L_0x009b
            java.lang.String r10 = "There's already download in progress for paragraph 0"
            java.lang.String r0 = "EndpointSpeakr"
            android.util.Log.i(r0, r10)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r10)
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
            goto L_0x015c
        L_0x009b:
            com.google.common.b.ol r1 = r9.f332266o
            com.google.common.b.aq r1 = (com.google.common.p4522b.C58319aq) r1
            r1.mo54931lF(r4, r0)
            com.google.android.apps.h.a.a.a.b r1 = new com.google.android.apps.h.a.a.a.b
            com.google.android.apps.h.a.a.a.m r3 = r9.f332265n
            boolean r3 = r3.f332280c
            r1.<init>(r0, r9, r4, r3)
            j$.util.concurrent.ConcurrentHashMap r3 = r9.f332267p
            r3.put(r4, r1)
            d.b.a.a.i r3 = r9.mo104192o(r10)
            int r4 = r10.f332229a
            int r5 = com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119098ag.m197805a(r4)
            r6 = 2
            if (r5 == r0) goto L_0x00ce
            if (r4 != r6) goto L_0x00c4
            java.lang.Object r4 = r10.f332230b
            com.google.android.apps.h.a.a.a.ai r4 = (com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119100ai) r4
            goto L_0x00c6
        L_0x00c4:
            com.google.android.apps.h.a.a.a.ai r4 = com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119100ai.f332220c
        L_0x00c6:
            com.google.protobuf.cq r4 = r4.f332222a
            int r4 = r4.size()
            if (r4 <= r0) goto L_0x011c
        L_0x00ce:
            d.b.a.a.au r4 = p5285d.p5290b.p5291a.p5292a.C68158au.f184441d
            com.google.protobuf.bn r4 = r4.createBuilder()
            d.b.a.a.at r4 = (p5285d.p5290b.p5291a.p5292a.C68157at) r4
            d.b.a.a.am r5 = p5285d.p5290b.p5291a.p5292a.C68150am.f184434c
            com.google.protobuf.bn r5 = r5.createBuilder()
            d.b.a.a.al r5 = (p5285d.p5290b.p5291a.p5292a.C68149al) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            d.b.a.a.am r7 = (p5285d.p5290b.p5291a.p5292a.C68150am) r7
            r7.f184436a = r2
            com.google.android.apps.h.a.a.a.m r7 = r9.f332265n
            int r7 = r7.f332278a
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            d.b.a.a.am r8 = (p5285d.p5290b.p5291a.p5292a.C68150am) r8
            r8.f184437b = r7
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            d.b.a.a.au r7 = (p5285d.p5290b.p5291a.p5292a.C68158au) r7
            com.google.protobuf.bv r5 = r5.build()
            d.b.a.a.am r5 = (p5285d.p5290b.p5291a.p5292a.C68150am) r5
            r5.getClass()
            r7.f184444b = r5
            r7.f184443a = r0
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            d.b.a.a.m r5 = (p5285d.p5290b.p5291a.p5292a.C68200m) r5
            com.google.protobuf.bv r4 = r4.build()
            d.b.a.a.au r4 = (p5285d.p5290b.p5291a.p5292a.C68158au) r4
            d.b.a.a.m r7 = p5285d.p5290b.p5291a.p5292a.C68200m.f184542g
            r4.getClass()
            r5.f184548e = r4
        L_0x011c:
            com.google.android.apps.h.a.a.a.i r4 = r9.f332264m
            com.google.protobuf.bv r3 = r3.build()
            d.b.a.a.m r3 = (p5285d.p5290b.p5291a.p5292a.C68200m) r3
            boolean r10 = r10.f332232d
            if (r10 == 0) goto L_0x012f
            java.lang.String[] r10 = new java.lang.String[r0]
            java.lang.String r0 = "metadata"
            r10[r2] = r0
            goto L_0x013e
        L_0x012f:
            r10 = 3
            java.lang.String[] r10 = new java.lang.String[r10]
            java.lang.String r5 = "metadata"
            r10[r2] = r5
            java.lang.String r2 = "audio"
            r10[r0] = r2
            java.lang.String r0 = "text"
            r10[r6] = r0
        L_0x013e:
            r4.mo104196b(r3, r1, r10)
            com.google.common.util.concurrent.SettableFuture r10 = r1.f332244b
            com.google.common.util.concurrent.bs r10 = com.google.common.util.concurrent.C60838bs.m92859i(r10)
            com.google.android.apps.h.a.a.a.e r0 = new com.google.android.apps.h.a.a.a.e
            r0.<init>(r9)
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60922j.m93044g(r10, r0, r1)
            java.lang.Class<com.google.common.util.concurrent.ec> r0 = com.google.common.util.concurrent.C60916ec.class
            com.google.android.apps.h.a.a.a.f r1 = com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119124f.f332261a
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60846c.m92879h(r10, r0, r1, r2)
        L_0x015c:
            return r10
        L_0x015d:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x015d }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119126h.mo104109a(com.google.android.apps.h.a.a.a.al):com.google.common.util.concurrent.cx");
    }

    /* renamed from: h */
    public final synchronized void mo104116h() {
        for (C119108b bVar : this.f332267p.values()) {
            C70868g gVar = bVar.f332243a;
            if (gVar != null) {
                ((C70869h) gVar).f189042b.mo27480d("User requested cancellation", (Throwable) null);
            }
        }
        this.f332267p.clear();
        this.f332266o.clear();
        this.f332269r = BuildConfig.FLAVOR;
        super.mo104116h();
    }

    /* renamed from: o */
    public final C68196i mo104192o(C119103al alVar) {
        C68202o oVar;
        C119102ak akVar;
        C119100ai aiVar;
        C119100ai aiVar2;
        C68199l lVar;
        C68196i iVar = (C68196i) C68200m.f184542g.createBuilder();
        C68139ab u = m197829u();
        iVar.copyOnWrite();
        u.getClass();
        ((C68200m) iVar.instance).f184547d = u;
        if (this.f332263l.mo56113h()) {
            C68189by byVar = (C68189by) this.f332263l.mo56107c();
            iVar.copyOnWrite();
            byVar.getClass();
            ((C68200m) iVar.instance).f184549f = byVar;
        }
        C68194g gVar = (C68194g) C68195h.f184523l.createBuilder();
        String str = this.f332270s;
        gVar.copyOnWrite();
        str.getClass();
        ((C68195h) gVar.instance).f184528d = str;
        C68164b bVar = this.f332265n.f332281d;
        gVar.copyOnWrite();
        ((C68195h) gVar.instance).f184526b = bVar;
        gVar.copyOnWrite();
        int i = 1;
        ((C68195h) gVar.instance).f184525a = true;
        if (this.f332169d) {
            oVar = this.f332174i;
        } else {
            C68201n nVar = (C68201n) C68202o.f184551c.createBuilder(this.f332174i);
            nVar.copyOnWrite();
            ((C68202o) nVar.instance).f184553a = 1;
            oVar = (C68202o) nVar.build();
        }
        gVar.copyOnWrite();
        oVar.getClass();
        ((C68195h) gVar.instance).f184529e = oVar;
        C68181bq bqVar = this.f332271t;
        gVar.copyOnWrite();
        bqVar.getClass();
        ((C68195h) gVar.instance).f184530f = bqVar;
        gVar.mo60287a(this.f332265n.f332282e);
        C68170bf bfVar = this.f332265n.f332283f;
        gVar.copyOnWrite();
        ((C68195h) gVar.instance).f184531g = bfVar.getNumber();
        int b = C68140ac.m98489b(alVar.f332231c);
        if (b == 0) {
            b = 1;
        }
        gVar.copyOnWrite();
        ((C68195h) gVar.instance).f184534j = C68140ac.m98488a(b);
        C68194g gVar2 = (C68194g) ((C68195h) gVar.build()).toBuilder();
        C68159av avVar = (C68159av) C68160aw.f184446b.createBuilder();
        String str2 = this.f332269r;
        avVar.copyOnWrite();
        str2.getClass();
        ((C68160aw) avVar.instance).f184448a = str2;
        gVar2.copyOnWrite();
        C68160aw awVar = (C68160aw) avVar.build();
        awVar.getClass();
        ((C68195h) gVar2.instance).f184533i = awVar;
        iVar.copyOnWrite();
        C68195h hVar = (C68195h) gVar2.build();
        hVar.getClass();
        ((C68200m) iVar.instance).f184546c = hVar;
        int i2 = alVar.f332229a;
        int a = C119098ag.m197805a(i2);
        int i3 = a - 1;
        if (a != 0) {
            if (i3 == 0) {
                if (i2 == 1) {
                    akVar = (C119102ak) alVar.f332230b;
                } else {
                    akVar = C119102ak.f332224b;
                }
                String str3 = akVar.f332226a;
                iVar.copyOnWrite();
                C68200m mVar = (C68200m) iVar.instance;
                str3.getClass();
                mVar.f184544a = 6;
                mVar.f184545b = str3;
            } else if (i3 == 1) {
                C68173bi biVar = (C68173bi) C68174bj.f184478c.createBuilder();
                if (alVar.f332229a == 2) {
                    aiVar = (C119100ai) alVar.f332230b;
                } else {
                    aiVar = C119100ai.f332220c;
                }
                biVar.mo60282a(aiVar.f332222a);
                if (alVar.f332229a == 2) {
                    aiVar2 = (C119100ai) alVar.f332230b;
                } else {
                    aiVar2 = C119100ai.f332220c;
                }
                int b2 = C68151an.m98491b(aiVar2.f332223b);
                if (b2 != 0) {
                    i = b2;
                }
                biVar.copyOnWrite();
                ((C68174bj) biVar.instance).f184481b = C68151an.m98490a(i);
                iVar.copyOnWrite();
                C68200m mVar2 = (C68200m) iVar.instance;
                C68174bj bjVar = (C68174bj) biVar.build();
                bjVar.getClass();
                mVar2.f184545b = bjVar;
                mVar2.f184544a = 7;
            } else if (i3 == 2) {
                if (i2 == 3) {
                    lVar = (C68199l) alVar.f332230b;
                } else {
                    lVar = C68199l.f184537d;
                }
                iVar.copyOnWrite();
                C68200m mVar3 = (C68200m) iVar.instance;
                lVar.getClass();
                mVar3.f184545b = lVar;
                mVar3.f184544a = 11;
            } else if (i3 == 3) {
                throw new IllegalArgumentException("Missing input text. Either the url or the raw text should be populated");
            }
            return iVar;
        }
        throw null;
    }

    /* renamed from: p */
    public final void mo104193p(C119088m mVar) {
        this.f332266o.mo54928h(mVar, 0);
        this.f332267p.remove(mVar);
    }

    /* renamed from: q */
    public final void mo104185q(String str) {
        this.f332270s = str;
    }

    /* renamed from: r */
    public final boolean mo104186r() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r0 = r4.f332267p.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0.hasNext() == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        r2 = (com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119088m) r1.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r2.mo104147a() > r6) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if ((r2.mo104147a() + r2.mo104148b()) <= r6) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        r0 = com.google.common.base.C58833ax.m90834k((com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119108b) r1.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r0 = com.google.common.base.C58836b.f156633a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        if (r0.mo56113h() == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        android.util.Log.d("EndpointSpeakr", java.lang.String.format("Inflight request covering paragraph %s already exists.", new java.lang.Object[]{java.lang.Integer.valueOf(r6)}));
        r5 = (com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119108b) r0.mo56107c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r1 = new com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119080e(r5, r6, 3, r4.f332269r);
        ((com.google.common.p4522b.C58319aq) r4.f332266o).mo54931lF(r1, 1);
        mo104194t(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        return;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104173s(com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119103al r5, int r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.common.base.ax r0 = r4.f332173h     // Catch:{ all -> 0x0093 }
            boolean r0 = r0.mo56113h()     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0023
            com.google.common.base.ax r0 = r4.f332173h     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x0093 }
            d.b.a.a.f r0 = (p5285d.p5290b.p5291a.p5292a.C68193f) r0     // Catch:{ all -> 0x0093 }
            com.google.protobuf.cq r0 = r0.f184520f     // Catch:{ all -> 0x0093 }
            int r0 = r0.size()     // Catch:{ all -> 0x0093 }
            if (r6 >= r0) goto L_0x001a
            goto L_0x0023
        L_0x001a:
            java.lang.String r5 = "EndpointSpeakr"
            java.lang.String r6 = "Requested buffering beyond the end of the article. Doing nothing."
            android.util.Log.w(r5, r6)     // Catch:{ all -> 0x0093 }
            monitor-exit(r4)     // Catch:{ all -> 0x0093 }
            return
        L_0x0023:
            monitor-exit(r4)     // Catch:{ all -> 0x0093 }
            j$.util.concurrent.ConcurrentHashMap r0 = r4.f332267p
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x002e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.apps.h.a.a.a.a.m r2 = (com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119088m) r2
            int r3 = r2.mo104147a()
            if (r3 > r6) goto L_0x002e
            int r3 = r2.mo104147a()
            int r2 = r2.mo104148b()
            int r3 = r3 + r2
            if (r3 <= r6) goto L_0x002e
            java.lang.Object r0 = r1.getValue()
            com.google.android.apps.h.a.a.a.b r0 = (com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119108b) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x005e
        L_0x005c:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x005e:
            boolean r1 = r0.mo56113h()
            r2 = 1
            if (r1 == 0) goto L_0x0080
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r1 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r1] = r6
            java.lang.String r6 = "EndpointSpeakr"
            java.lang.String r1 = "Inflight request covering paragraph %s already exists."
            java.lang.String r5 = java.lang.String.format(r1, r5)
            android.util.Log.d(r6, r5)
            java.lang.Object r5 = r0.mo56107c()
            com.google.android.apps.h.a.a.a.b r5 = (com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119108b) r5
            return
        L_0x0080:
            java.lang.String r0 = r4.f332269r
            com.google.android.apps.h.a.a.a.a.e r1 = new com.google.android.apps.h.a.a.a.a.e
            r3 = 3
            r1.<init>(r5, r6, r3, r0)
            com.google.common.b.ol r5 = r4.f332266o
            com.google.common.b.aq r5 = (com.google.common.p4522b.C58319aq) r5
            r5.mo54931lF(r1, r2)
            r4.mo104194t(r1)
            return
        L_0x0093:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0093 }
            goto L_0x0097
        L_0x0096:
            throw r5
        L_0x0097:
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119126h.mo104173s(com.google.android.apps.h.a.a.a.al, int):void");
    }

    /* renamed from: t */
    public final void mo104194t(C119088m mVar) {
        C119080e eVar = (C119080e) mVar;
        C68196i o = mo104192o(eVar.f332187a);
        int i = eVar.f332188b;
        int i2 = eVar.f332189c;
        C68157at atVar = (C68157at) C68158au.f184441d.createBuilder();
        C68149al alVar = (C68149al) C68150am.f184434c.createBuilder();
        alVar.copyOnWrite();
        ((C68150am) alVar.instance).f184436a = i;
        alVar.copyOnWrite();
        ((C68150am) alVar.instance).f184437b = i2;
        atVar.copyOnWrite();
        C68158au auVar = (C68158au) atVar.instance;
        C68150am amVar = (C68150am) alVar.build();
        amVar.getClass();
        auVar.f184444b = amVar;
        auVar.f184443a = 1;
        C63088z zVar = this.f332170e;
        if (zVar != null) {
            atVar.copyOnWrite();
            ((C68158au) atVar.instance).f184445c = zVar;
        }
        C68158au auVar2 = (C68158au) atVar.build();
        o.copyOnWrite();
        C68200m mVar2 = C68200m.f184542g;
        auVar2.getClass();
        ((C68200m) o.instance).f184548e = auVar2;
        C119108b bVar = new C119108b(false, this, mVar, this.f332265n.f332280c);
        this.f332267p.put(mVar, bVar);
        this.f332264m.mo104196b((C68200m) o.build(), bVar, "audio", "text");
    }
}
