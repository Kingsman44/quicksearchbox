package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a;

import com.google.android.apps.search.googleapp.search.suggest.C138027as;
import com.google.android.apps.search.googleapp.search.suggest.C138029au;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138058o;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138068y;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138235n;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138445bt;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4552o.apd;
import com.google.protobuf.C62942bv;
import com.google.protos.p4948ba.p4949a.C64369b;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m */
/* compiled from: PG */
public final class C138165m {

    /* renamed from: a */
    public static final C69613f f375923a = new C69747m(C138153a.f375865a);

    /* renamed from: b */
    public final C138068y f375924b;

    /* renamed from: c */
    public final C71422aw f375925c;

    /* renamed from: d */
    private final C138235n f375926d;

    /* renamed from: e */
    private final C138058o f375927e;

    /* renamed from: f */
    private final C138445bt f375928f;

    /* renamed from: g */
    private final C21370a f375929g;

    /* renamed from: h */
    private final Executor f375930h;

    public C138165m(C138235n nVar, C138068y yVar, C138058o oVar, C138445bt btVar, C21370a aVar, Executor executor, C71422aw awVar) {
        C69664n.m101061g(yVar, "suggestLoggingState");
        C69664n.m101061g(oVar, "suggestLogger");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(executor, "uiExecutor");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f375926d = nVar;
        this.f375924b = yVar;
        this.f375927e = oVar;
        this.f375928f = btVar;
        this.f375929g = aVar;
        this.f375930h = executor;
        this.f375925c = awVar;
    }

    /* renamed from: g */
    public static final String m224528g(apd apd) {
        String e = C138068y.m224389e(apd);
        C69664n.m101060f(e, "encodeSearchboxStatsCgiValue(searchboxStats)");
        return e;
    }

    /* renamed from: h */
    private final C138030av m224529h(int i) {
        C138027as asVar = (C138027as) C138030av.f375536m.createBuilder();
        C138029au auVar = C138029au.ONE_SEARCH_ON_DEVICE;
        asVar.copyOnWrite();
        C138030av avVar = (C138030av) asVar.instance;
        avVar.f375541d = auVar.f375534n;
        avVar.f375538a |= 4;
        asVar.mo114079a(C64369b.SUBTYPE_ONE_SEARCH_ON_DEVICE);
        C138034az azVar = C138034az.ONE_SEARCH_ON_DEVICE;
        asVar.copyOnWrite();
        C138030av avVar2 = (C138030av) asVar.instance;
        avVar2.f375545i = azVar.f375590i;
        avVar2.f375538a |= 32;
        asVar.copyOnWrite();
        C138030av avVar3 = (C138030av) asVar.instance;
        avVar3.f375538a |= 64;
        avVar3.f375546j = i;
        C62942bv build = asVar.build();
        C69664n.m101060f(build, "newBuilder()\n      .setT…ore(index)\n      .build()");
        return (C138030av) build;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0111, code lost:
        if (kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0) == r1) goto L_0x0116;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0163 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114170a(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138167ab r12, p5462h.p5466c.C69577g r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138156d
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.d r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138156d) r0
            int r1 = r0.f375873e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f375873e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.d r0 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.d
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f375871c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f375873e
            r3 = 3
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x0041
            if (r2 == r5) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r12 = r0.f375869a
            p5462h.C69714l.m101134b(r13)
            goto L_0x0164
        L_0x0030:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0038:
            java.lang.Object r12 = r0.f375870b
            java.lang.Object r2 = r0.f375869a
            p5462h.C69714l.m101134b(r13)
            goto L_0x0113
        L_0x0041:
            java.lang.Object r12 = r0.f375870b
            java.lang.Object r2 = r0.f375869a
            p5462h.C69714l.m101134b(r13)
            goto L_0x00f9
        L_0x004a:
            p5462h.C69714l.m101134b(r13)
            long r6 = r12.f375934b
            int r13 = r12.f375933a
            r13 = r13 & r5
            if (r13 == 0) goto L_0x0117
            com.google.protobuf.z r13 = r12.f375935c
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.s r2 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138240s.f376117f
            com.google.protobuf.bv r13 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (com.google.protobuf.C63088z) r13)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.s r13 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138240s) r13
            java.lang.String r2 = "parseFrom(request.zeroStateInternalBytes)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r2)
            com.google.protobuf.dn r2 = r13.f376120b
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            java.util.Set r2 = r2.entrySet()
            java.lang.Object r2 = p5462h.p5463a.C69540x.m100856z(r2)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r6 = r2.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r2.getValue()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n) r2
            com.google.protobuf.bn r13 = r13.toBuilder()
            java.lang.String r7 = "this.toBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r7)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.o r13 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138236o) r13
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.u r13 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")
            r13.mo114219f()
            r13.mo114215b()
            r13.mo114219f()
            java.lang.String r8 = "responseId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r8)
            java.lang.String r8 = "getSuggestionsRequest"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r8)
            com.google.protobuf.bn r2 = r2.toBuilder()
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.m r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138262m) r2
            java.lang.String r7 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r7)
            long r7 = r12.f375934b
            r2.copyOnWrite()
            com.google.protobuf.bv r9 = r2.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n r9 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n) r9
            int r10 = r9.f376171a
            r10 = r10 | 32
            r9.f376171a = r10
            r9.f376177g = r7
            com.google.protobuf.bv r2 = r2.build()
            java.lang.String r7 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n) r2
            r13.mo114217d(r6, r2)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.s r13 = r13.mo114214a()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.n r2 = r11.f375926d
            r0.f375869a = r11
            r0.f375870b = r12
            r0.f375873e = r4
            com.google.android.libraries.storage.protostore.ab r2 = r2.f376113a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.m r4 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.m
            r4.<init>(r13)
            com.google.common.util.concurrent.bg r13 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r13 = r2.mo46039a(r4, r13)
            java.lang.String r2 = "newCacheEntry: OneSearch…ntry }, directExecutor())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r2)
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0)
            h.c.a.a r2 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r13 == r2) goto L_0x00f6
            h.q r13 = p5462h.C69788q.f186170a
        L_0x00f6:
            if (r13 == r1) goto L_0x0116
            r2 = r11
        L_0x00f9:
            r13 = r2
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r13 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m) r13
            com.google.android.apps.search.googleapp.search.suggest.sources.a.bt r13 = r13.f375928f
            com.google.common.util.concurrent.cx r13 = r13.mo114252e()
            java.lang.String r4 = "completeServerSuggestSource.reset()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r4)
            r0.f375869a = r2
            r0.f375870b = r12
            r0.f375873e = r5
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0)
            if (r13 == r1) goto L_0x0116
        L_0x0113:
            r13 = r12
            r12 = r2
            goto L_0x0119
        L_0x0116:
            return r1
        L_0x0117:
            r13 = r12
            r12 = r11
        L_0x0119:
            r2 = r12
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m) r2
            com.google.android.apps.search.googleapp.search.suggest.b.o r4 = r2.f375927e
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ab r13 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138167ab) r13
            long r5 = r13.f375934b
            j$.time.Duration r5 = p3186j$.time.Duration.ofMillis(r5)
            java.lang.String r6 = "ONESEARCH"
            r4.mo114112j(r5, r6)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            boolean r4 = com.google.android.libraries.p1623at.p1632e.C19559g.m37305d(r4)
            if (r4 == 0) goto L_0x0147
            com.google.android.apps.search.googleapp.search.suggest.b.y r2 = r2.f375924b
            long r4 = r13.f375934b
            j$.time.Duration r13 = p3186j$.time.Duration.ofMillis(r4)
            r2.mo114118h(r13)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ad r13 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138169ad.f375936a
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60856cj.m92900i(r13)
            goto L_0x0156
        L_0x0147:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.l r4 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.l
            r4.<init>(r2, r13)
            java.util.concurrent.Executor r13 = r2.f375930h
            java.util.concurrent.Callable r2 = com.google.apps.tiktok.tracing.C47810es.m84978r(r4)
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60856cj.m92904m(r2, r13)
        L_0x0156:
            r0.f375869a = r12
            r2 = 0
            r0.f375870b = r2
            r0.f375873e = r3
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0)
            if (r13 != r1) goto L_0x0164
            return r1
        L_0x0164:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r12 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m) r12
            com.google.android.apps.search.googleapp.search.suggest.sources.a.bt r12 = r12.f375928f
            com.google.android.apps.search.googleapp.t.e.d r13 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.UNKNOWN
            r12.mo114255h()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ad r12 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138169ad.f375936a
            java.lang.String r13 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m.mo114170a(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ab, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: j$.time.Duration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114171b(com.google.common.p4552o.aod r8, java.lang.String r9, java.lang.String r10, java.lang.Integer r11, p3186j$.time.Duration r12, com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138171af r13, p5462h.p5466c.C69577g r14) {
        /*
            r7 = this;
            boolean r0 = r14 instanceof com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138157e
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.e r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138157e) r0
            int r1 = r0.f375882i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f375882i = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.e r0 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.e
            r0.<init>(r7, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f375880g
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f375882i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0060
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r8 = r0.f375878e
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n r8 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n) r8
            java.lang.Object r9 = r0.f375877d
            j$.time.Duration r9 = (p3186j$.time.Duration) r9
            java.lang.Object r10 = r0.f375876c
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r11 = r0.f375875b
            java.lang.Object r12 = r0.f375874a
            p5462h.C69714l.m101134b(r14)
            goto L_0x00ca
        L_0x003c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0044:
            java.lang.Object r13 = r0.f375879f
            java.lang.Object r8 = r0.f375878e
            r12 = r8
            j$.time.Duration r12 = (p3186j$.time.Duration) r12
            java.lang.Object r8 = r0.f375877d
            r11 = r8
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.Object r8 = r0.f375876c
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r8 = r0.f375875b
            java.lang.Object r9 = r0.f375874a
            p5462h.C69714l.m101134b(r14)
            r6 = r12
            r12 = r9
            r9 = r6
            goto L_0x007b
        L_0x0060:
            p5462h.C69714l.m101134b(r14)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.n r14 = r7.f375926d
            r0.f375874a = r7
            r0.f375875b = r8
            r0.f375876c = r10
            r0.f375877d = r11
            r0.f375878e = r12
            r0.f375879f = r13
            r0.f375882i = r4
            java.lang.Object r14 = r14.mo114207a(r9, r0)
            if (r14 == r1) goto L_0x0159
            r9 = r12
            r12 = r7
        L_0x007b:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n r14 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n) r14
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.af r2 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138171af.ENTRY_POINT_UNKNOWN
            if (r13 == r2) goto L_0x0082
            goto L_0x0090
        L_0x0082:
            if (r14 == 0) goto L_0x008f
            int r13 = r14.f376176f
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.af r13 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138171af.m224536a(r13)
            if (r13 != 0) goto L_0x0090
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.af r13 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138171af.ENTRY_POINT_UNKNOWN
            goto L_0x0090
        L_0x008f:
            r13 = r5
        L_0x0090:
            if (r13 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.af r13 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138171af) r13
            int r13 = r13.ordinal()
            if (r13 == r4) goto L_0x00a3
            if (r13 == r3) goto L_0x00a0
        L_0x009d:
            com.google.android.apps.search.googleapp.t.e.d r13 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.ONE_SEARCH_UNKNOWN
            goto L_0x00a5
        L_0x00a0:
            com.google.android.apps.search.googleapp.t.e.d r13 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.ONE_SEARCH_ALL_APPS
            goto L_0x00a5
        L_0x00a3:
            com.google.android.apps.search.googleapp.t.e.d r13 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.ONE_SEARCH_QSB
        L_0x00a5:
            r2 = r12
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m) r2
            com.google.android.apps.search.googleapp.search.suggest.b.y r4 = r2.f375924b
            r4.mo114120j(r13)
            if (r10 == 0) goto L_0x00e5
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.n r13 = r2.f375926d
            r0.f375874a = r12
            r0.f375875b = r8
            r0.f375876c = r11
            r0.f375877d = r9
            r0.f375878e = r14
            r0.f375879f = r5
            r0.f375882i = r3
            java.lang.Object r10 = r13.mo114208b(r10, r0)
            if (r10 == r1) goto L_0x00e4
            r6 = r11
            r11 = r8
            r8 = r14
            r14 = r10
            r10 = r6
        L_0x00ca:
            com.google.android.apps.search.googleapp.search.suggest.av r14 = (com.google.android.apps.search.googleapp.search.suggest.C138030av) r14
            if (r14 == 0) goto L_0x00dc
            r13 = r12
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r13 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m) r13
            com.google.android.apps.search.googleapp.search.suggest.b.y r13 = r13.f375924b
            r13.mo114119i(r14)
            r6 = r14
            r14 = r8
            r8 = r11
            r11 = r10
            r10 = r6
            goto L_0x00e6
        L_0x00dc:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Invalid SelectedSuggestionId when logging."
            r8.<init>(r9)
            throw r8
        L_0x00e4:
            return r1
        L_0x00e5:
            r10 = r5
        L_0x00e6:
            if (r11 == 0) goto L_0x00f8
            r13 = r12
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r13 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m) r13
            com.google.android.apps.search.googleapp.search.suggest.b.y r0 = r13.f375924b
            int r1 = r11.intValue()
            com.google.android.apps.search.googleapp.search.suggest.av r13 = r13.m224529h(r1)
            r0.mo114119i(r13)
        L_0x00f8:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r12 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m) r12
            com.google.android.apps.search.googleapp.search.suggest.b.y r13 = r12.f375924b
            if (r14 == 0) goto L_0x0100
            java.lang.String r5 = r14.f376172b
        L_0x0100:
            r14 = r8
            com.google.common.o.aod r14 = (com.google.common.p4552o.aod) r14
            com.google.common.o.apd r13 = r13.mo114114c(r5, r14, r9)
            java.lang.String r14 = "searchboxStats"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)
            com.google.common.o.aod r14 = com.google.common.p4552o.aod.ENTER_KEY
            java.lang.String r0 = "ONESEARCH"
            if (r8 != r14) goto L_0x0118
            com.google.android.apps.search.googleapp.search.suggest.b.o r8 = r12.f375927e
            r8.mo114107e(r13, r9, r0)
            goto L_0x0158
        L_0x0118:
            com.google.common.o.aod r14 = com.google.common.p4552o.aod.ABANDONMENT
            if (r8 != r14) goto L_0x0122
            com.google.android.apps.search.googleapp.search.suggest.b.o r8 = r12.f375927e
            r8.mo114103a(r13, r9, r0)
            goto L_0x0158
        L_0x0122:
            com.google.common.o.aod r14 = com.google.common.p4552o.aod.CLICKED_SUGGESTION
            if (r8 != r14) goto L_0x0158
            if (r10 == 0) goto L_0x0151
            int r8 = r10.f375541d
            com.google.android.apps.search.googleapp.search.suggest.au r8 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r8)
            if (r8 != 0) goto L_0x0132
            com.google.android.apps.search.googleapp.search.suggest.au r8 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x0132:
            com.google.android.apps.search.googleapp.search.suggest.au r11 = com.google.android.apps.search.googleapp.search.suggest.C138029au.NAVIGATION
            if (r8 == r11) goto L_0x014b
            int r8 = r10.f375541d
            com.google.android.apps.search.googleapp.search.suggest.au r8 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r8)
            if (r8 != 0) goto L_0x0140
            com.google.android.apps.search.googleapp.search.suggest.au r8 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x0140:
            com.google.android.apps.search.googleapp.search.suggest.au r10 = com.google.android.apps.search.googleapp.search.suggest.C138029au.PERSONALIZED_NAVIGATION
            if (r8 != r10) goto L_0x0145
            goto L_0x014b
        L_0x0145:
            com.google.android.apps.search.googleapp.search.suggest.b.o r8 = r12.f375927e
            r8.mo114111i(r13, r9, r0)
            goto L_0x0158
        L_0x014b:
            com.google.android.apps.search.googleapp.search.suggest.b.o r8 = r12.f375927e
            r8.mo114110h(r13, r9, r0)
            goto L_0x0158
        L_0x0151:
            if (r11 == 0) goto L_0x0158
            com.google.android.apps.search.googleapp.search.suggest.b.o r8 = r12.f375927e
            r8.mo114105c(r13, r9, r0)
        L_0x0158:
            return r13
        L_0x0159:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m.mo114171b(com.google.common.o.aod, java.lang.String, java.lang.String, java.lang.Integer, j$.time.Duration, com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.af, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114172c(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138335t r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138159g
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.g r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138159g) r0
            int r1 = r0.f375888c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f375888c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.g r0 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.g
            r0.<init>(r8, r10)
        L_0x0018:
            r7 = r0
            java.lang.Object r10 = r7.f375886a
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f375888c
            r2 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r2) goto L_0x0028
            p5462h.C69714l.m101134b(r10)
            goto L_0x0065
        L_0x0028:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0030:
            p5462h.C69714l.m101134b(r10)
            int r10 = r9.f376367a
            r10 = r10 & 2
            if (r10 == 0) goto L_0x003c
            long r3 = r9.f376369c
            goto L_0x0042
        L_0x003c:
            com.google.android.libraries.f.a r10 = r8.f375929g
            long r3 = r10.mo26871c()
        L_0x0042:
            j$.time.Duration r6 = p3186j$.time.Duration.ofMillis(r3)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb r9 = r9.f376368b
            if (r9 != 0) goto L_0x004c
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb r9 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138246cb.f376127h
        L_0x004c:
            r4 = r9
            java.lang.String r9 = "request.sessionSummaryLog"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r9)
            com.google.common.o.aod r5 = com.google.common.p4552o.aod.ABANDONMENT
            java.lang.String r9 = "abandonTime"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r9)
            r7.f375888c = r2
            r2 = 0
            r3 = 0
            r1 = r8
            java.lang.Object r9 = r1.mo114174e(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L_0x0065
            return r0
        L_0x0065:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.v r9 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138337v.f376370a
            java.lang.String r10 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m.mo114172c(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.t, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114173d(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138339x r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138161i
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.i r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138161i) r0
            int r1 = r0.f375894c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f375894c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.i r0 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.i
            r0.<init>(r8, r10)
        L_0x0018:
            r7 = r0
            java.lang.Object r10 = r7.f375892a
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f375894c
            r2 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r2) goto L_0x0028
            p5462h.C69714l.m101134b(r10)
            goto L_0x005e
        L_0x0028:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0030:
            p5462h.C69714l.m101134b(r10)
            int r10 = r9.f376374a
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r10)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb r10 = r9.f376375b
            if (r10 != 0) goto L_0x0040
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb r10 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138246cb.f376127h
        L_0x0040:
            r4 = r10
            java.lang.String r10 = "request.sessionSummaryLog"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r10)
            com.google.common.o.aod r5 = com.google.common.p4552o.aod.CLICKED_SUGGESTION
            long r9 = r9.f376376c
            j$.time.Duration r6 = p3186j$.time.Duration.ofMillis(r9)
            java.lang.String r9 = "ofMillis(request.selectionTimeMs)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r9)
            r7.f375894c = r2
            r2 = 0
            r1 = r8
            java.lang.Object r9 = r1.mo114174e(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L_0x005e
            return r0
        L_0x005e:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.z r9 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138341z.f376378a
            java.lang.String r10 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m.mo114173d(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.x, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.util.LinkedHashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: j$.time.Duration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.google.common.o.aod} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.util.LinkedHashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: j$.time.Duration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.common.o.aod} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.util.LinkedHashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.google.common.o.aod} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: j$.time.Duration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.google.common.o.aod} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.util.LinkedHashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: j$.time.Duration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d4 A[LOOP:0: B:24:0x00cc->B:26:0x00d4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ff A[LOOP:1: B:28:0x00f9->B:30:0x00ff, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x017b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114174e(java.lang.String r20, java.lang.Integer r21, com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138246cb r22, com.google.common.p4552o.aod r23, p3186j$.time.Duration r24, p5462h.p5466c.C69577g r25) {
        /*
            r19 = this;
            r0 = r25
            boolean r1 = r0 instanceof com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138162j
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.j r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138162j) r1
            int r2 = r1.f375905k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f375905k = r2
            r2 = r19
            goto L_0x001e
        L_0x0017:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.j r1 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.j
            r2 = r19
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f375903i
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r1.f375905k
            java.lang.String r5 = "summaryLog.suggestionsList"
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x005d
            if (r4 == r7) goto L_0x003b
            if (r4 != r6) goto L_0x0033
            p5462h.C69714l.m101134b(r0)
            goto L_0x017c
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            java.lang.Object r4 = r1.f375902h
            java.lang.Object r8 = r1.f375901g
            java.lang.Object r9 = r1.f375900f
            java.lang.Object r10 = r1.f375899e
            java.lang.Object r11 = r1.f375898d
            java.lang.Object r12 = r1.f375897c
            java.lang.Object r13 = r1.f375896b
            java.lang.Object r14 = r1.f375895a
            p5462h.C69714l.m101134b(r0)
            r15 = r1
            r1 = r12
            r0 = r13
            r6 = 1
            r18 = r14
            r14 = r3
            r3 = r10
            r10 = r8
            r8 = r9
            r9 = r4
            r4 = r11
            r11 = r18
            goto L_0x00bb
        L_0x005d:
            p5462h.C69714l.m101134b(r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r4 = r22
            com.google.protobuf.cq r8 = r4.f376130b
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r5)
            java.util.Iterator r8 = r8.iterator()
            r10 = r0
            r15 = r1
            r11 = r2
            r14 = r3
            r9 = r8
            r0 = r20
            r1 = r21
            r3 = r23
            r8 = r24
        L_0x007d:
            boolean r12 = r9.hasNext()
            java.lang.String r13 = "it"
            if (r12 == 0) goto L_0x00bf
            java.lang.Object r12 = r9.next()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bp r12 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138208bp) r12
            long r6 = r12.f376041b
            j$.time.Duration r6 = p3186j$.time.Duration.ofMillis(r6)
            java.lang.String r7 = "ofMillis(it.suggestionsRenderedTimestampMs)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            boolean r6 = r10.add(r6)
            if (r6 == 0) goto L_0x00bb
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)
            r15.f375895a = r11
            r15.f375896b = r0
            r15.f375897c = r1
            r15.f375898d = r4
            r15.f375899e = r3
            r15.f375900f = r8
            r15.f375901g = r10
            r15.f375902h = r9
            r6 = 1
            r15.f375905k = r6
            r7 = r11
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r7 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m) r7
            java.lang.Object r7 = r7.mo114175f(r12, r15)
            if (r7 == r14) goto L_0x00be
        L_0x00bb:
            r6 = 2
            r7 = 1
            goto L_0x007d
        L_0x00be:
            return r14
        L_0x00bf:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb r4 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138246cb) r4
            com.google.protobuf.ck r6 = r4.f376133e
            java.lang.String r7 = "summaryLog.suggestionLongPressTimesMsList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            java.util.Iterator r6 = r6.iterator()
        L_0x00cc:
            boolean r7 = r6.hasNext()
            java.lang.String r9 = "ONESEARCH"
            if (r7 == 0) goto L_0x00ee
            java.lang.Object r7 = r6.next()
            java.lang.Long r7 = (java.lang.Long) r7
            r10 = r11
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r10 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m) r10
            com.google.android.apps.search.googleapp.search.suggest.b.o r10 = r10.f375927e
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r13)
            long r16 = r7.longValue()
            j$.time.Duration r7 = p3186j$.time.Duration.ofMillis(r16)
            r10.mo114108f(r7, r9)
            goto L_0x00cc
        L_0x00ee:
            com.google.protobuf.ck r6 = r4.f376134f
            java.lang.String r7 = "summaryLog.queryClearTapTimesMsList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            java.util.Iterator r6 = r6.iterator()
        L_0x00f9:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0119
            java.lang.Object r7 = r6.next()
            java.lang.Long r7 = (java.lang.Long) r7
            r10 = r11
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r10 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m) r10
            com.google.android.apps.search.googleapp.search.suggest.b.o r10 = r10.f375927e
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r13)
            long r16 = r7.longValue()
            j$.time.Duration r7 = p3186j$.time.Duration.ofMillis(r16)
            r10.mo114104b(r7, r9)
            goto L_0x00f9
        L_0x0119:
            r9 = r11
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r9 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m) r9
            com.google.android.apps.search.googleapp.search.suggest.b.y r6 = r9.f375924b
            long r10 = r4.f376131c
            j$.time.Duration r7 = p3186j$.time.Duration.ofMillis(r10)
            long r10 = r4.f376132d
            j$.time.Duration r10 = p3186j$.time.Duration.ofMillis(r10)
            r6.f375654j = r7
            r6.f375653i = r10
            com.google.protobuf.cq r6 = r4.f376130b
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r5)
            java.lang.Object r5 = p5462h.p5463a.C69540x.m100823E(r6)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bp r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138208bp) r5
            java.lang.String r11 = r5.f376042c
            java.lang.String r5 = "summaryLog.suggestionsLi…t().suggestionsResponseId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r5)
            int r4 = r4.f376135g
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.af r4 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138171af.m224536a(r4)
            if (r4 != 0) goto L_0x014a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.af r4 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138171af.ENTRY_POINT_UNKNOWN
        L_0x014a:
            java.lang.String r5 = "summaryLog.entryPoint"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            r5 = 0
            r15.f375895a = r5
            r15.f375896b = r5
            r15.f375897c = r5
            r15.f375898d = r5
            r15.f375899e = r5
            r15.f375900f = r5
            r15.f375901g = r5
            r15.f375902h = r5
            r5 = 2
            r15.f375905k = r5
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
            r13 = r1
            java.lang.Integer r13 = (java.lang.Integer) r13
            r10 = r3
            com.google.common.o.aod r10 = (com.google.common.p4552o.aod) r10
            r0 = r8
            j$.time.Duration r0 = (p3186j$.time.Duration) r0
            r3 = r14
            r14 = r0
            r1 = r15
            r15 = r4
            r16 = r1
            java.lang.Object r0 = r9.mo114171b(r10, r11, r12, r13, r14, r15, r16)
            if (r0 != r3) goto L_0x017c
            return r3
        L_0x017c:
            r1 = r0
            com.google.common.o.apd r1 = (com.google.common.p4552o.apd) r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m.mo114174e(java.lang.String, java.lang.Integer, com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb, com.google.common.o.aod, j$.time.Duration, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114175f(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138208bp r24, p5462h.p5466c.C69577g r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            boolean r3 = r2 instanceof com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138163k
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.k r3 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138163k) r3
            int r4 = r3.f375920o
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f375920o = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.k r3 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.k
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f375918m
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f375920o
            java.lang.String r7 = "suggestions.suggestionsResponseId"
            r8 = 3
            r9 = 2
            r10 = 1
            if (r5 == 0) goto L_0x006b
            if (r5 == r10) goto L_0x0062
            if (r5 == r9) goto L_0x0058
            if (r5 != r8) goto L_0x0050
            int r1 = r3.f375917l
            java.lang.Object r5 = r3.f375916k
            java.lang.Object r7 = r3.f375915j
            java.lang.Object r11 = r3.f375914i
            java.lang.Object r12 = r3.f375913h
            java.lang.Object r13 = r3.f375912g
            java.lang.Object r14 = r3.f375911f
            java.lang.Object r15 = r3.f375910e
            java.lang.Object r6 = r3.f375909d
            java.lang.Object r8 = r3.f375908c
            java.lang.Object r9 = r3.f375907b
            java.lang.Object r10 = r3.f375906a
            p5462h.C69714l.m101134b(r2)
            r0 = r4
            r4 = 3
            goto L_0x0148
        L_0x0050:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0058:
            java.lang.Object r1 = r3.f375908c
            java.lang.Object r5 = r3.f375907b
            java.lang.Object r6 = r3.f375906a
            p5462h.C69714l.m101134b(r2)
            goto L_0x00a9
        L_0x0062:
            java.lang.Object r1 = r3.f375907b
            java.lang.Object r5 = r3.f375906a
            p5462h.C69714l.m101134b(r2)
            r6 = r5
            goto L_0x0083
        L_0x006b:
            p5462h.C69714l.m101134b(r2)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.n r2 = r0.f375926d
            java.lang.String r5 = r1.f376042c
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r7)
            r3.f375906a = r0
            r3.f375907b = r1
            r6 = 1
            r3.f375920o = r6
            java.lang.Object r2 = r2.mo114210d(r5, r3)
            if (r2 == r4) goto L_0x01eb
            r6 = r0
        L_0x0083:
            com.google.android.apps.search.googleapp.search.suggest.t r2 = (com.google.android.apps.search.googleapp.search.suggest.C138542t) r2
            if (r2 == 0) goto L_0x01e3
            r5 = r6
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m) r5
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.n r5 = r5.f375926d
            r8 = r1
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bp r8 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138208bp) r8
            java.lang.String r8 = r8.f376042c
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r7)
            r3.f375906a = r6
            r3.f375907b = r1
            r3.f375908c = r2
            r7 = 2
            r3.f375920o = r7
            java.lang.Object r5 = r5.mo114207a(r8, r3)
            if (r5 == r4) goto L_0x01e2
            r22 = r5
            r5 = r1
            r1 = r2
            r2 = r22
        L_0x00a9:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n) r2
            if (r2 == 0) goto L_0x01da
            java.lang.String r7 = r2.f376172b
            java.lang.String r8 = "request.query"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            r8 = r5
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bp r8 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138208bp) r8
            com.google.protobuf.cq r8 = r8.f376040a
            java.lang.String r9 = "suggestions.oneSearchRenderedBlocksList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
            r10 = 0
        L_0x00c8:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x017e
            java.lang.Object r11 = r8.next()
            int r12 = r10 + 1
            if (r10 >= 0) goto L_0x00d9
            p5462h.p5463a.C69540x.m100952j()
        L_0x00d9:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bo r11 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138207bo) r11
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            int r14 = r11.f376036a
            r15 = 1
            if (r14 != r15) goto L_0x0168
            java.lang.Object r10 = r11.f376037b
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bl r10 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138204bl) r10
            com.google.protobuf.cq r10 = r10.f376031a
            java.lang.String r11 = "block.googleBlock.suggestionIdsList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
            r14 = r9
            r9 = r5
            r5 = r10
            r10 = r6
            r6 = r2
            r2 = r7
            r7 = r11
            r11 = r13
            r13 = r8
            r8 = r1
            r1 = r12
            r12 = r11
        L_0x0105:
            boolean r18 = r5.hasNext()
            if (r18 == 0) goto L_0x0156
            java.lang.Object r18 = r5.next()
            r15 = r18
            java.lang.String r15 = (java.lang.String) r15
            r0 = r10
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m) r0
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.n r0 = r0.f375926d
            r18 = r4
            java.lang.String r4 = "it"
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r4)
            r3.f375906a = r10
            r3.f375907b = r9
            r3.f375908c = r8
            r3.f375909d = r6
            r3.f375910e = r2
            r3.f375911f = r14
            r3.f375912g = r13
            r3.f375913h = r12
            r3.f375914i = r11
            r3.f375915j = r7
            r3.f375916k = r5
            r3.f375917l = r1
            r4 = 3
            r3.f375920o = r4
            java.lang.Object r0 = r0.mo114208b(r15, r3)
            r15 = r18
            if (r0 == r15) goto L_0x0155
            r22 = r2
            r2 = r0
            r0 = r15
            r15 = r22
        L_0x0148:
            com.google.android.apps.search.googleapp.search.suggest.av r2 = (com.google.android.apps.search.googleapp.search.suggest.C138030av) r2
            if (r2 == 0) goto L_0x014f
            r7.add(r2)
        L_0x014f:
            r4 = r0
            r2 = r15
            r15 = 1
            r0 = r23
            goto L_0x0105
        L_0x0155:
            return r15
        L_0x0156:
            r15 = r4
            r4 = 3
            r11.addAll(r7)
            r7 = r2
            r2 = r6
            r5 = r9
            r6 = r10
            r9 = r14
            r4 = r15
            r0 = 3
            r11 = 2
            r10 = r1
            r1 = r8
            r8 = r13
            r13 = r12
            goto L_0x0177
        L_0x0168:
            r0 = 3
            r11 = 2
            if (r14 != r11) goto L_0x0176
            r14 = r6
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r14 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m) r14
            com.google.android.apps.search.googleapp.search.suggest.av r10 = r14.m224529h(r10)
            r13.add(r10)
        L_0x0176:
            r10 = r12
        L_0x0177:
            p5462h.p5463a.C69540x.m100811r(r9, r13)
            r0 = r23
            goto L_0x00c8
        L_0x017e:
            r15 = r9
            java.util.List r15 = (java.util.List) r15
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n) r2
            boolean r0 = r2.f376175e
            java.lang.String r3 = "ONESEARCH"
            if (r0 == 0) goto L_0x01a1
            r0 = r6
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m) r0
            com.google.android.apps.search.googleapp.search.suggest.b.y r4 = r0.f375924b
            long r8 = r2.f376177g
            j$.time.Duration r8 = p3186j$.time.Duration.ofMillis(r8)
            r4.f375655k = r8
            com.google.android.apps.search.googleapp.search.suggest.b.o r0 = r0.f375927e
            long r8 = r2.f376177g
            j$.time.Duration r4 = p3186j$.time.Duration.ofMillis(r8)
            r0.mo114106d(r4, r3)
        L_0x01a1:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r6 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m) r6
            com.google.android.apps.search.googleapp.search.suggest.b.y r14 = r6.f375924b
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bp r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138208bp) r5
            long r8 = r5.f376041b
            long r10 = r2.f376177g
            int r0 = r7.length()
            if (r0 != 0) goto L_0x01b4
            r21 = 1
            goto L_0x01b6
        L_0x01b4:
            r21 = 0
        L_0x01b6:
            r20 = r1
            com.google.android.apps.search.googleapp.search.suggest.t r20 = (com.google.android.apps.search.googleapp.search.suggest.C138542t) r20
            r16 = r8
            r18 = r10
            r14.mo114116f(r15, r16, r18, r20, r21)
            int r0 = r7.length()
            if (r0 != 0) goto L_0x01cc
            com.google.android.apps.search.googleapp.search.suggest.b.y r0 = r6.f375924b
            r0.mo114121l()
        L_0x01cc:
            com.google.android.apps.search.googleapp.search.suggest.b.o r0 = r6.f375927e
            long r1 = r5.f376041b
            j$.time.Duration r1 = p3186j$.time.Duration.ofMillis(r1)
            r0.mo114109g(r1, r3)
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x01da:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not find last GetSuggestionRequest"
            r0.<init>(r1)
            throw r0
        L_0x01e2:
            return r4
        L_0x01e3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not find last Last Response Parameters"
            r0.<init>(r1)
            throw r0
        L_0x01eb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m.mo114175f(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bp, h.c.g):java.lang.Object");
    }
}
