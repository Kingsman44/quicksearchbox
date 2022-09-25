package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120508e;
import com.google.android.apps.search.assistant.platform.p9080f.p9111h.C120704a;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import com.google.android.libraries.search.p3055n.C39653cg;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5573a.C71389v;
import kotlinx.coroutines.p5573a.C71392y;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.j.c.a.x */
/* compiled from: PG */
public final class C120749x {

    /* renamed from: a */
    public final C71422aw f335850a;

    /* renamed from: b */
    public final C39653cg f335851b;

    /* renamed from: c */
    public final C120704a f335852c;

    /* renamed from: d */
    public final C120508e f335853d;

    /* renamed from: e */
    public final C59071e f335854e = C59071e.m91331h();

    /* renamed from: f */
    public final C71389v f335855f = C71392y.m104158a(-2, (C71387t) null, 6);

    /* renamed from: g */
    public final C71389v f335856g = C71392y.m104158a(-2, (C71387t) null, 6);

    /* renamed from: h */
    public final C33447g f335857h;

    public C120749x(C71422aw awVar, C39653cg cgVar, C120704a aVar, C33447g gVar, C120508e eVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(cgVar, "sodaService");
        C69664n.m101061g(aVar, "localeProvider");
        C69664n.m101061g(gVar, "utteranceShutdownHookRegistry");
        C69664n.m101061g(eVar, "audioInput");
        this.f335850a = awVar;
        this.f335851b = cgVar;
        this.f335852c = aVar;
        this.f335857h = gVar;
        this.f335853d = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104912a(com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a.C120743r
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.f.j.c.a.r r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a.C120743r) r0
            int r1 = r0.f335836d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335836d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.f.j.c.a.r r0 = new com.google.android.apps.search.assistant.platform.f.j.c.a.r
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f335834b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f335836d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r5) goto L_0x0042
            if (r2 == r4) goto L_0x003a
            if (r2 == r3) goto L_0x0031
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            java.lang.Object r7 = r0.f335833a
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            p5462h.C69714l.m101134b(r8)
            goto L_0x00ae
        L_0x003a:
            java.lang.Object r7 = r0.f335833a
            com.google.android.apps.search.assistant.platform.f.j.c.a.x r7 = (com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a.C120749x) r7
            p5462h.C69714l.m101134b(r8)
            goto L_0x007c
        L_0x0042:
            java.lang.Object r7 = r0.f335833a
            com.google.android.apps.search.assistant.platform.f.j.c.a.x r7 = (com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a.C120749x) r7
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x004a }
            goto L_0x0069
        L_0x004a:
            r8 = move-exception
            goto L_0x009a
        L_0x004c:
            p5462h.C69714l.m101134b(r8)
            com.google.android.apps.search.assistant.platform.f.j.c.a.t r8 = new com.google.android.apps.search.assistant.platform.f.j.c.a.t     // Catch:{ all -> 0x0097 }
            r8.<init>(r6, r7)     // Catch:{ all -> 0x0097 }
            com.google.common.util.concurrent.cx r7 = r7.mo104770c(r8)     // Catch:{ all -> 0x0097 }
            java.lang.String r8 = "private suspend fun send… sending audio data\")\n  }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)     // Catch:{ all -> 0x0097 }
            r0.f335833a = r6     // Catch:{ all -> 0x0097 }
            r0.f335836d = r5     // Catch:{ all -> 0x0097 }
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)     // Catch:{ all -> 0x0097 }
            if (r7 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r7 = r6
        L_0x0069:
            com.google.common.f.e r8 = r7.f335854e
            kotlinx.coroutines.a.v r8 = r7.f335855f
            com.google.android.libraries.search.n.cx r2 = com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a.C120740o.m199911a()
            r0.f335833a = r7
            r0.f335836d = r4
            java.lang.Object r8 = r8.mo62729v(r2, r0)
            if (r8 != r1) goto L_0x007c
            return r1
        L_0x007c:
            com.google.common.f.e r7 = r7.f335854e
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.n r8 = new com.google.common.f.n
            r0 = 35581(0x8afd, float:4.986E-41)
            r8.<init>(r0)
            r7.mo56379ah(r8)
            java.lang.String r8 = "Done sending audio data"
            r7.mo56386p(r8)
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x0097:
            r7 = move-exception
            r8 = r7
            r7 = r6
        L_0x009a:
            com.google.common.f.e r2 = r7.f335854e
            kotlinx.coroutines.a.v r7 = r7.f335855f
            com.google.android.libraries.search.n.cx r2 = com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a.C120740o.m199911a()
            r0.f335833a = r8
            r0.f335836d = r3
            java.lang.Object r7 = r7.mo62729v(r2, r0)
            if (r7 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            r7 = r8
        L_0x00ae:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a.C120749x.mo104912a(com.google.android.apps.search.assistant.platform.f.b.h, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0194, code lost:
        if (r15 == r1) goto L_0x01da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104913b(com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h r13, java.lang.String r14, p5462h.p5466c.C69577g r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a.C120746u
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.google.android.apps.search.assistant.platform.f.j.c.a.u r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a.C120746u) r0
            int r1 = r0.f335846d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335846d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.f.j.c.a.u r0 = new com.google.android.apps.search.assistant.platform.f.j.c.a.u
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f335844b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f335846d
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x003c
            if (r2 == r3) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            java.lang.Object r13 = r0.f335843a
            p5462h.C69714l.m101134b(r15)
            goto L_0x0196
        L_0x002d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0035:
            java.lang.Object r13 = r0.f335843a
            p5462h.C69714l.m101134b(r15)
            goto L_0x0187
        L_0x003c:
            p5462h.C69714l.m101134b(r15)
            kotlinx.coroutines.a.v r15 = r12.f335855f
            java.lang.String r2 = "audioInputSession"
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r2)
            java.lang.String r2 = "localeString"
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r2)
            com.google.android.libraries.search.n.cx r2 = com.google.android.libraries.search.p3055n.C39670cx.f104424a
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.search.n.cw r2 = (com.google.android.libraries.search.p3055n.C39669cw) r2
            java.lang.String r5 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            com.google.android.libraries.search.n.cz r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.protobuf.bt r6 = com.google.android.libraries.search.p3055n.C39655ci.f104378k
            java.lang.String r7 = "requestId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            com.google.android.libraries.search.n.ci r7 = com.google.android.libraries.search.p3055n.C39655ci.f104377j
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.search.n.ch r7 = (com.google.android.libraries.search.p3055n.C39654ch) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r5)
            java.lang.String r8 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r8)
            com.google.android.libraries.search.n.az r9 = com.google.android.libraries.search.p3055n.C39276az.f103456b
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.libraries.search.n.ay r9 = (com.google.android.libraries.search.p3055n.C39275ay) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r5)
            com.google.android.libraries.search.n.bb r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            r9.mo41782c()
            r9.mo41781b(r14)
            com.google.android.libraries.search.n.az r14 = r9.mo41780a()
            java.lang.String r9 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r9)
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.android.libraries.search.n.ci r10 = (com.google.android.libraries.search.p3055n.C39655ci) r10
            r14.getClass()
            r10.f104382c = r14
            int r14 = r10.f104380a
            r14 = r14 | r4
            r10.f104380a = r14
            com.google.speech.j.g r14 = com.google.speech.p5218j.C66964g.NATCON_ONESHOT
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r9)
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.android.libraries.search.n.ci r10 = (com.google.android.libraries.search.p3055n.C39655ci) r10
            int r14 = r14.f182026k
            r10.f104386g = r14
            int r14 = r10.f104380a
            r14 = r14 | 32
            r10.f104380a = r14
            com.google.android.libraries.search.n.d r14 = com.google.android.libraries.search.p3055n.C39673d.f104428c
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.android.libraries.search.n.c r14 = (com.google.android.libraries.search.p3055n.C39378c) r14
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r5)
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r8)
            com.google.speech.j.t r8 = com.google.speech.p5218j.C67175t.f182588e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.speech.j.q r8 = (com.google.speech.p5218j.C67172q) r8
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r5)
            com.google.speech.j.fu r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")
            com.google.android.apps.search.assistant.platform.f.b.d r8 = r13.mo104768a()
            int r8 = r8.mo104781b()
            com.google.speech.j.q r10 = r5.f182008a
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.speech.j.t r10 = (com.google.speech.p5218j.C67175t) r10
            int r11 = r10.f182590a
            r11 = r11 | r4
            r10.f182590a = r11
            r10.f182592c = r8
            com.google.android.apps.search.assistant.platform.f.b.d r8 = r13.mo104768a()
            int r8 = r8.mo104780a()
            com.google.speech.j.q r10 = r5.f182008a
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.speech.j.t r10 = (com.google.speech.p5218j.C67175t) r10
            int r11 = r10.f182590a
            r11 = r11 | 4
            r10.f182590a = r11
            r10.f182593d = r8
            com.google.speech.j.t r5 = r5.mo59754a()
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r9)
            r14.copyOnWrite()
            com.google.protobuf.bv r8 = r14.instance
            com.google.android.libraries.search.n.d r8 = (com.google.android.libraries.search.p3055n.C39673d) r8
            r5.getClass()
            r8.f104431b = r5
            int r5 = r8.f104430a
            r5 = r5 | r3
            r8.f104430a = r5
            com.google.protobuf.bv r14 = r14.build()
            java.lang.String r5 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r5)
            com.google.android.libraries.search.n.d r14 = (com.google.android.libraries.search.p3055n.C39673d) r14
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r9)
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.libraries.search.n.ci r8 = (com.google.android.libraries.search.p3055n.C39655ci) r8
            r14.getClass()
            r8.f104383d = r14
            int r14 = r8.f104380a
            r14 = r14 | 4
            r8.f104380a = r14
            j$.util.Optional r14 = r13.mo104772d()
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x016c
            j$.util.Optional r13 = r13.mo104772d()
            java.lang.Object r13 = r13.get()
            java.lang.String r14 = "audioInputSession.hotwordEvent().get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)
            com.google.speech.j.je r13 = (com.google.speech.p5218j.C67050je) r13
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r9)
            r7.copyOnWrite()
            com.google.protobuf.bv r14 = r7.instance
            com.google.android.libraries.search.n.ci r14 = (com.google.android.libraries.search.p3055n.C39655ci) r14
            r13.getClass()
            r14.f104384e = r13
            int r13 = r14.f104380a
            r13 = r13 | 8
            r14.f104380a = r13
        L_0x016c:
            com.google.protobuf.bv r13 = r7.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r5)
            com.google.android.libraries.search.n.ci r13 = (com.google.android.libraries.search.p3055n.C39655ci) r13
            r2.mo41983b(r6, r13)
            com.google.android.libraries.search.n.cx r13 = r2.mo41982a()
            r0.f335843a = r12
            r0.f335846d = r3
            java.lang.Object r13 = r15.mo62729v(r13, r0)
            if (r13 == r1) goto L_0x01da
            r13 = r12
        L_0x0187:
            r14 = r13
            com.google.android.apps.search.assistant.platform.f.j.c.a.x r14 = (com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a.C120749x) r14
            kotlinx.coroutines.a.v r14 = r14.f335856g
            r0.f335843a = r13
            r0.f335846d = r4
            java.lang.Object r15 = r14.mo62718c(r0)
            if (r15 == r1) goto L_0x01da
        L_0x0196:
            com.google.android.libraries.search.n.cl r15 = (com.google.android.libraries.search.p3055n.C39658cl) r15
            com.google.android.libraries.search.n.cl r14 = com.google.android.libraries.search.p3055n.C39658cl.DEFAULT_UNKNOWN
            int r14 = r15.ordinal()
            if (r14 == r3) goto L_0x01bd
            if (r14 == r4) goto L_0x01b5
            r13 = 3
            if (r14 == r13) goto L_0x01ad
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Error initializing Soda."
            r13.<init>(r14)
            throw r13
        L_0x01ad:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "SODA internal failure."
            r13.<init>(r14)
            throw r13
        L_0x01b5:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Compatibility check failed."
            r13.<init>(r14)
            throw r13
        L_0x01bd:
            com.google.android.apps.search.assistant.platform.f.j.c.a.x r13 = (com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a.C120749x) r13
            com.google.common.f.e r13 = r13.f335854e
            com.google.common.f.x r13 = r13.mo56224b()
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            com.google.common.f.n r14 = new com.google.common.f.n
            r15 = 35584(0x8b00, float:4.9864E-41)
            r14.<init>(r15)
            r13.mo56379ah(r14)
            java.lang.String r14 = "SODA ASR started successfully"
            r13.mo56386p(r14)
            h.q r13 = p5462h.C69788q.f186170a
            return r13
        L_0x01da:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a.C120749x.mo104913b(com.google.android.apps.search.assistant.platform.f.b.h, java.lang.String, h.c.g):java.lang.Object");
    }
}
