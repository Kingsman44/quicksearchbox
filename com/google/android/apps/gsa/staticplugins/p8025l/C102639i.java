package com.google.android.apps.gsa.staticplugins.p8025l;

import com.google.android.apps.gsa.binaries.satin.app.C73981cx;
import com.google.android.apps.gsa.binaries.satin.app.cz;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6787f.C85768a;
import com.google.android.apps.gsa.search.core.p6787f.C85769b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86195ae;
import com.google.android.apps.gsa.search.core.p6816p.C86227bj;
import com.google.android.apps.gsa.search.core.p6816p.C86245ca;
import com.google.android.apps.gsa.search.core.p6816p.C86246cb;
import com.google.android.apps.gsa.search.core.p6816p.C86248cd;
import com.google.android.apps.gsa.search.core.p6816p.C86255j;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.shared.actions.errors.VoiceSearchError;
import com.google.android.apps.gsa.shared.logger.C89956x;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89067w;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7127q.C90455b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.assistant.assistantactions.p621c.C11055a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59071e;
import com.google.p4449cd.p4453d.C57960f;
import dagger.C68214a;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.staticplugins.l.i */
/* compiled from: PG */
public final class C102639i implements C85769b {

    /* renamed from: a */
    public static final C59071e f286463a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.l.i");

    /* renamed from: b */
    public final C22871g f286464b;

    /* renamed from: c */
    public final C89859i f286465c;

    /* renamed from: d */
    public final Query f286466d;

    /* renamed from: e */
    public final C85768a f286467e;

    /* renamed from: f */
    private final C90931ca f286468f;

    /* renamed from: g */
    private final C85929cw f286469g;

    /* renamed from: h */
    private final C21370a f286470h;

    /* renamed from: i */
    private final C68214a f286471i;

    /* renamed from: j */
    private final C84474e f286472j;

    /* renamed from: k */
    private final C86124t f286473k;

    /* renamed from: l */
    private final C68214a f286474l;

    /* renamed from: m */
    private final C86195ae f286475m;

    /* renamed from: n */
    private final C68214a f286476n;

    /* renamed from: o */
    private final C90476a f286477o;

    /* renamed from: p */
    private final C90479a f286478p;

    /* renamed from: q */
    private final C86255j f286479q;

    /* renamed from: r */
    private final C86248cd f286480r;

    /* renamed from: s */
    private final C68214a f286481s;

    /* renamed from: t */
    private final C11055a f286482t;

    /* renamed from: u */
    private final Object f286483u = new Object();

    /* renamed from: v */
    private C86246cb f286484v;

    /* renamed from: w */
    private C57960f f286485w;

    /* renamed from: x */
    private boolean f286486x;

    /* renamed from: y */
    private final C84466a f286487y;

    public C102639i(Query query, C85768a aVar, C90931ca caVar, C22871g gVar, C85929cw cwVar, C21370a aVar2, C68214a aVar3, C89859i iVar, C84474e eVar, C86124t tVar, C68214a aVar4, C86195ae aeVar, C68214a aVar5, C90476a aVar6, C90479a aVar7, C86255j jVar, C86248cd cdVar, C84466a aVar8, C68214a aVar9, C11055a aVar10) {
        boolean z = false;
        if ((query.mo84403cj() || query.mo84399cf()) && (query.mo84392cY() || query.mo84385cR())) {
            z = true;
        }
        C58838bb.m90868c(z);
        this.f286466d = query;
        this.f286467e = aVar;
        this.f286468f = caVar;
        this.f286464b = gVar;
        this.f286469g = cwVar;
        this.f286470h = aVar2;
        this.f286471i = aVar3;
        this.f286465c = iVar;
        this.f286472j = eVar;
        this.f286473k = tVar;
        this.f286474l = aVar4;
        this.f286475m = aeVar;
        this.f286476n = aVar5;
        this.f286477o = aVar6;
        this.f286478p = aVar7;
        this.f286479q = jVar;
        this.f286480r = cdVar;
        this.f286487y = aVar8;
        this.f286481s = aVar9;
        this.f286482t = aVar10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        if (r5.f286473k.mo79746e(com.google.android.apps.gsa.shared.p7066m.C90014bt.f247371fr) == false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f4, code lost:
        if (r5.f286473k.mo79746e(com.google.android.apps.gsa.shared.p7066m.C90014bt.f247372fs) == false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f6, code lost:
        r5.f286465c.mo83702b(com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FLUID_ACTION_FLOW_START);
        r0 = r5.f286466d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0105, code lost:
        if (r0.mo84364bx("android.opa.extra.CONVERSATION_DELTA") == false) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r0 = r5.f286482t.mo19525a((com.google.assistant.p3897e.p3921j.C52081en) com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) com.google.assistant.p3897e.p3921j.C52081en.f136679i, r0.mo84439dT()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011b, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) f286463a.mo56226d()).mo56382g(r0)).mo56372aa(14006)).mo56386p("Failed to parse ConversationDelta, aborting");
        r0 = com.google.common.util.concurrent.C60856cj.m92900i(com.google.common.base.C58836b.f156633a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012f, code lost:
        r0 = com.google.common.util.concurrent.C60856cj.m92900i(com.google.common.base.C58836b.f156633a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0140, code lost:
        mo93351e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0143, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79427a() {
        /*
            r5 = this;
            com.google.android.apps.gsa.shared.search.Query r0 = r5.f286466d
            boolean r1 = r0.mo84385cR()
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = "android.opa.extra.ASSISTANT_RESPONSE"
            byte[] r1 = r0.mo84440dU(r1)
            if (r1 == 0) goto L_0x0051
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0020 }
            com.google.assistant.e.e.a.j r3 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n     // Catch:{ ct -> 0x0020 }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r1, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x0020 }
            com.google.assistant.e.e.a.j r1 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r1     // Catch:{ ct -> 0x0020 }
            r5.mo93350d(r1)     // Catch:{ ct -> 0x0020 }
            goto L_0x002e
        L_0x0020:
            r1 = move-exception
            com.google.common.f.e r2 = f286463a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Couldn't parse AssistantResponse"
            r4 = 14017(0x36c1, float:1.9642E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56386p(r3)
        L_0x002e:
            java.lang.String r1 = "android.search.extra.TTS_BYTES"
            byte[] r1 = r0.mo84440dU(r1)
            if (r1 == 0) goto L_0x004b
            com.google.android.apps.gsa.shared.speech.m r2 = new com.google.android.apps.gsa.shared.speech.m
            r2.<init>()
            com.google.protobuf.z r1 = com.google.protobuf.C63088z.m96139A(r1)
            r2.mo84746b(r1)
            com.google.android.apps.gsa.shared.speech.n r1 = r2.mo84745a()
            com.google.android.apps.gsa.search.core.f.a r2 = r5.f286467e
            r2.mo79424c(r0, r1)
        L_0x004b:
            com.google.android.apps.gsa.search.core.f.a r1 = r5.f286467e
            r1.mo79425d(r0)
            return
        L_0x0051:
            com.google.common.f.e r0 = f286463a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Sentinel OPA query without AssistantResponse, ignored"
            r2 = 14016(0x36c0, float:1.964E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            return
        L_0x005f:
            com.google.android.apps.gsa.shared.search.Query r0 = r5.f286466d
            long r1 = r0.f252752J
            com.google.android.apps.gsa.search.core.p.j r3 = r5.f286479q
            com.google.common.base.ax r3 = r3.mo79954b(r1)
            boolean r4 = r3.mo56113h()
            if (r4 == 0) goto L_0x0099
            java.lang.Object r4 = r3.mo56107c()
            com.google.android.apps.gsa.search.core.p.bo r4 = (com.google.android.apps.gsa.search.core.p6816p.C86232bo) r4
            boolean r4 = r4.mo79880P()
            if (r4 != 0) goto L_0x0099
            java.lang.Object r4 = r3.mo56107c()
            com.google.android.apps.gsa.search.core.p.bo r4 = (com.google.android.apps.gsa.search.core.p6816p.C86232bo) r4
            boolean r4 = r4.mo79882R()
            if (r4 == 0) goto L_0x0088
            goto L_0x0099
        L_0x0088:
            com.google.android.apps.gsa.search.core.f.a r1 = r5.f286467e
            java.lang.Object r2 = r3.mo56107c()
            com.google.android.apps.gsa.search.core.p.bo r2 = (com.google.android.apps.gsa.search.core.p6816p.C86232bo) r2
            r1.mo79426f(r0, r2)
            com.google.android.apps.gsa.search.core.f.a r1 = r5.f286467e
            r1.mo79425d(r0)
            return
        L_0x0099:
            boolean r3 = r0.mo84410cq()
            if (r3 == 0) goto L_0x00d5
            com.google.android.apps.gsa.search.core.p.cd r3 = r5.f286480r
            com.google.common.base.ax r1 = r3.mo79944a(r1)
            boolean r2 = r1.mo56113h()
            if (r2 == 0) goto L_0x00d5
            java.lang.Object r2 = r1.mo56107c()
            com.google.android.apps.gsa.search.core.p.bo r2 = (com.google.android.apps.gsa.search.core.p6816p.C86232bo) r2
            boolean r2 = r2.mo79880P()
            if (r2 != 0) goto L_0x00d5
            java.lang.Object r2 = r1.mo56107c()
            com.google.android.apps.gsa.search.core.p.bo r2 = (com.google.android.apps.gsa.search.core.p6816p.C86232bo) r2
            boolean r2 = r2.mo79882R()
            if (r2 == 0) goto L_0x00c4
            goto L_0x00d5
        L_0x00c4:
            com.google.android.apps.gsa.search.core.f.a r2 = r5.f286467e
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.search.core.p.bo r1 = (com.google.android.apps.gsa.search.core.p6816p.C86232bo) r1
            r2.mo79426f(r0, r1)
            com.google.android.apps.gsa.search.core.f.a r1 = r5.f286467e
            r1.mo79425d(r0)
            return
        L_0x00d5:
            java.lang.Object r0 = r5.f286483u
            monitor-enter(r0)
            boolean r1 = r5.f286486x     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x00de
            monitor-exit(r0)     // Catch:{ all -> 0x0144 }
            return
        L_0x00de:
            r1 = 1
            r5.f286486x = r1     // Catch:{ all -> 0x0144 }
            monitor-exit(r0)     // Catch:{ all -> 0x0144 }
            com.google.android.apps.gsa.search.core.i.t r0 = r5.f286473k
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247371fr
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0140
            com.google.android.apps.gsa.search.core.i.t r0 = r5.f286473k
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247372fs
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0140
            com.google.android.apps.gsa.shared.logger.b.i r0 = r5.f286465c
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FLUID_ACTION_FLOW_START
            r0.mo83702b(r1)
            com.google.android.apps.gsa.shared.search.Query r0 = r5.f286466d
            java.lang.String r1 = "android.opa.extra.CONVERSATION_DELTA"
            boolean r1 = r0.mo84364bx(r1)
            if (r1 == 0) goto L_0x012f
            com.google.android.libraries.assistant.assistantactions.c.a r1 = r5.f286482t     // Catch:{ ct -> 0x011a }
            byte[] r0 = r0.mo84439dT()     // Catch:{ ct -> 0x011a }
            com.google.assistant.e.j.en r2 = com.google.assistant.p3897e.p3921j.C52081en.f136679i     // Catch:{ ct -> 0x011a }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (byte[]) r0)     // Catch:{ ct -> 0x011a }
            com.google.assistant.e.j.en r0 = (com.google.assistant.p3897e.p3921j.C52081en) r0     // Catch:{ ct -> 0x011a }
            com.google.common.util.concurrent.cx r0 = r1.mo19525a(r0)     // Catch:{ ct -> 0x011a }
            goto L_0x0135
        L_0x011a:
            r0 = move-exception
            com.google.common.f.e r1 = f286463a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Failed to parse ConversationDelta, aborting"
            r3 = 14006(0x36b6, float:1.9627E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0135
        L_0x012f:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x0135:
            com.google.android.apps.gsa.staticplugins.l.h r1 = new com.google.android.apps.gsa.staticplugins.l.h
            r1.<init>(r5)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r0, r1, r2)
            return
        L_0x0140:
            r5.mo93351e()
            return
        L_0x0144:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0144 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8025l.C102639i.mo79427a():void");
    }

    /* renamed from: b */
    public final void mo79428b() {
        synchronized (this.f286483u) {
            C57960f fVar = this.f286485w;
            if (fVar != null) {
                fVar.mo54566a();
                this.f286486x = false;
            }
        }
    }

    /* renamed from: c */
    public final void mo93349c(Throwable th) {
        C90523o oVar;
        C90523o oVar2;
        if (th instanceof C90523o) {
            oVar = (C90523o) th;
        } else {
            if (th instanceof C90455b) {
                oVar2 = new C90523o(th, ((C90455b) th).mo79843a());
            } else {
                oVar2 = new C90523o(th, (int) C89885b.INTERNAL_ERROR_SEE_STACK_TRACE_VALUE);
            }
            oVar = oVar2;
        }
        this.f286467e.mo79423a(this.f286466d, new VoiceSearchError(this.f286466d, oVar, (String) null));
        this.f286467e.mo79425d(this.f286466d);
    }

    /* renamed from: d */
    public final void mo93350d(C51195j jVar) {
        C22872h.m42743c(C86593a.class);
        C89849ae aeVar = C89849ae.ASSISTANT_RESULT_DOWNLOADED;
        C89859i iVar = this.f286465c;
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.mo83701c("rId", Long.toString(this.f286466d.f252749G));
        iVar.mo74236a(fVar.mo83699a());
        if (this.f286484v == null) {
            this.f286484v = C86245ca.m138881a(this.f286466d, this.f286470h.mo26871c(), this.f286471i, this.f286465c, this.f286476n, this.f286473k);
        }
        C86246cb cbVar = this.f286484v;
        Query query = this.f286466d;
        C22872h.m42743c(C86593a.class);
        C58881cr A = this.f286469g.mo79560A(query);
        C86246cb cbVar2 = cbVar;
        new C86227bj(cbVar2, this.f286468f, this.f286472j, this.f286473k, new C89956x(query.f252749G, C90719ac.f253778a.f253779b.nextLong()), A, (C89067w) this.f286474l.mo27525b(), this.f286470h, this.f286475m, this.f286476n, this.f286477o, this.f286478p).mo79850C(jVar);
        this.f286467e.mo79426f(this.f286466d, cbVar);
    }

    /* renamed from: e */
    public final void mo93351e() {
        C89356b b = this.f286487y.mo78026b("AssistantTextSearchGraph", C118575h.GRAPH_ASSISTANT_TEXT_SEARCH, C118575h.WORKER_ASSISTANT_TEXT_SEARCH);
        synchronized (this.f286483u) {
            this.f286485w = b.mo83286e();
        }
        C73981cx cxVar = (C73981cx) this.f286481s.mo27525b();
        cxVar.f205880d = b;
        cxVar.f205879c = "assistant-voiceless";
        Query query = this.f286466d;
        query.getClass();
        cxVar.f205881e = query;
        C68225k.m98529a(cxVar.f205879c, String.class);
        C68225k.m98529a(cxVar.f205880d, C89356b.class);
        C68225k.m98529a(cxVar.f205881e, Query.class);
        cz czVar = new cz(cxVar.f205877a, cxVar.f205878b, cxVar.f205879c, cxVar.f205880d, cxVar.f205881e);
        new C90873ag(czVar.d.mo60297gq(), this.f286464b, "ATS: tts result", new C102606a(this)).mo85223a(C102626b.f286415a);
        new C90873ag(czVar.h.mo60297gq(), this.f286464b, "ATS: search result", new C102629c(this, czVar)).mo85223a(new C102634d(this));
    }
}
