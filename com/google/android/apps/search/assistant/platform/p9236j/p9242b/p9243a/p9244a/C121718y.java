package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a;

import com.google.android.apps.gsa.binaries.satin.app.aqr;
import com.google.android.apps.gsa.binaries.satin.app.aqs;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.C121721c;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.C121722d;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2594d.C33516b;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33729b;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2630e.C33881a;
import com.google.android.libraries.search.assistant.invocation.p2636j.p2637a.C33888a;
import com.google.android.libraries.search.assistant.invocation.p2636j.p2637a.C33891b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34065ca;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34093db;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.a.a.y */
/* compiled from: PG */
public final class C121718y implements C121721c, C121722d {

    /* renamed from: a */
    public static final C59071e f337748a = C59071e.m91331h();

    /* renamed from: b */
    public final C71422aw f337749b;

    /* renamed from: c */
    public final C121673ab f337750c;

    /* renamed from: d */
    public final C71788b f337751d = new C71799m();

    /* renamed from: e */
    public final aqs f337752e;

    /* renamed from: f */
    private final C121687ap f337753f;

    /* renamed from: g */
    private final C33881a f337754g;

    /* renamed from: h */
    private final C121694aw f337755h;

    /* renamed from: i */
    private final C121685an f337756i;

    /* renamed from: j */
    private final C39141kp f337757j;

    /* renamed from: k */
    private final aqr f337758k;

    public C121718y(C121687ap apVar, aqr aqr, C71422aw awVar, C121673ab abVar, C33881a aVar, C121694aw awVar2, aqs aqs, C121685an anVar, C39141kp kpVar) {
        C69664n.m101061g(apVar, "invocationTokenFactory");
        C69664n.m101061g(aqr, "invocationFactory");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(abVar, "invocationStore");
        C69664n.m101061g(aVar, "apaSessionStarter");
        C69664n.m101061g(aqs, "appFlowLoggerFactory");
        C69664n.m101061g(anVar, "invocationTimeoutTracker");
        C69664n.m101061g(kpVar, "clientStreamz");
        this.f337753f = apVar;
        this.f337758k = aqr;
        this.f337749b = awVar;
        this.f337750c = abVar;
        this.f337754g = aVar;
        this.f337755h = awVar2;
        this.f337752e = aqs;
        this.f337756i = anVar;
        this.f337757j = kpVar;
    }

    /* renamed from: d */
    public static final C33888a m201130d(C121706m mVar, C33891b bVar) {
        String name = C121719z.m201142a(mVar).name();
        String name2 = bVar.name();
        return new C33888a(name + " -> " + name2);
    }

    /* renamed from: l */
    private final Object m201131l(boolean z, C33729b bVar, C34053bp bpVar, C69577g gVar) {
        C34065ca caVar = bVar.f90084e;
        C34093db dbVar = bVar.f90085f;
        boolean z2 = true;
        boolean z3 = !z && (caVar.f90772a & 2) != 0;
        if (z || (caVar.f90772a & 1) == 0) {
            z2 = false;
        }
        C33516b bVar2 = new C33516b(z2, z3, dbVar);
        C59052c cVar = (C59052c) f337748a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "INV.Manager");
        Boolean valueOf = Boolean.valueOf(z3);
        Boolean valueOf2 = Boolean.valueOf(z2);
        C61301b a = C34711b.m63445a(bpVar);
        cVar.mo56379ah(new C59094n(35919));
        cVar.mo56359L("Starting VoiceInteractionSession(needsScreenshot=%s, needsAssistData=%s) for token(%s).", valueOf, valueOf2, a);
        return this.f337754g.mo39108v(bVar2, gVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.google.android.libraries.search.assistant.invocation.o.a.bp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.google.android.libraries.search.assistant.invocation.o.a.bp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: com.google.android.libraries.search.assistant.invocation.o.a.bp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: com.google.android.libraries.search.assistant.invocation.o.a.bp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: com.google.android.libraries.search.assistant.invocation.o.a.bp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010d A[Catch:{ all -> 0x01ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0134 A[Catch:{ all -> 0x01ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0137 A[Catch:{ all -> 0x01ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0173 A[Catch:{ all -> 0x01fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0183 A[Catch:{ all -> 0x01fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01f7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01fb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105316a(com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33729b r25, p5462h.p5466c.C69577g r26) {
        /*
            r24 = this;
            r1 = r24
            r0 = r26
            java.lang.String r2 = "INV.Manager"
            boolean r3 = r0 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121714u
            if (r3 == 0) goto L_0x0019
            r3 = r0
            com.google.android.apps.search.assistant.platform.j.b.a.a.u r3 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121714u) r3
            int r4 = r3.f337727h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f337727h = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.apps.search.assistant.platform.j.b.a.a.u r3 = new com.google.android.apps.search.assistant.platform.j.b.a.a.u
            r3.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r0 = r3.f337725f
            h.c.a.a r11 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r3.f337727h
            r12 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r13 = 0
            if (r4 == 0) goto L_0x008d
            if (r4 == r7) goto L_0x007a
            if (r4 == r6) goto L_0x0064
            if (r4 == r5) goto L_0x004c
            if (r4 != r12) goto L_0x0044
            java.lang.Object r2 = r3.f337721b
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121706m) r2
            java.lang.Object r3 = r3.f337720a
            kotlinx.coroutines.j.b r3 = (kotlinx.coroutines.p5584j.C71788b) r3
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0042 }
            r6 = r2
            r2 = r13
            goto L_0x01f3
        L_0x0042:
            r0 = move-exception
            goto L_0x0077
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004c:
            java.lang.Object r2 = r3.f337724e
            java.lang.Object r4 = r3.f337723d
            java.lang.Object r5 = r3.f337722c
            java.lang.Object r6 = r3.f337721b
            com.google.android.libraries.search.assistant.invocation.f.b.b r6 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33729b) r6
            java.lang.Object r7 = r3.f337720a
            com.google.android.apps.search.assistant.platform.j.b.a.a.y r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y) r7
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0061 }
            r19 = r6
            goto L_0x019d
        L_0x0061:
            r0 = move-exception
            r3 = r5
            goto L_0x0077
        L_0x0064:
            java.lang.Object r2 = r3.f337723d
            java.lang.Object r4 = r3.f337722c
            java.lang.Object r6 = r3.f337721b
            com.google.android.libraries.search.assistant.invocation.f.b.b r6 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33729b) r6
            java.lang.Object r7 = r3.f337720a
            com.google.android.apps.search.assistant.platform.j.b.a.a.y r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y) r7
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0075 }
            goto L_0x014f
        L_0x0075:
            r0 = move-exception
            r3 = r4
        L_0x0077:
            r2 = r13
            goto L_0x0202
        L_0x007a:
            java.lang.Object r4 = r3.f337722c
            java.lang.Object r8 = r3.f337721b
            com.google.android.libraries.search.assistant.invocation.f.b.b r8 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33729b) r8
            java.lang.Object r9 = r3.f337720a
            com.google.android.apps.search.assistant.platform.j.b.a.a.y r9 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y) r9
            p5462h.C69714l.m101134b(r0)
            r23 = r8
            r8 = r4
            r4 = r23
            goto L_0x00a4
        L_0x008d:
            p5462h.C69714l.m101134b(r0)
            kotlinx.coroutines.j.b r0 = r1.f337751d
            r3.f337720a = r1
            r4 = r25
            r3.f337721b = r4
            r3.f337722c = r0
            r3.f337727h = r7
            java.lang.Object r8 = r0.mo63025b(r13, r3)
            if (r8 == r11) goto L_0x0206
            r8 = r0
            r9 = r1
        L_0x00a4:
            com.google.android.apps.search.assistant.platform.j.b.a.a.ap r0 = r9.f337753f     // Catch:{ all -> 0x01ff }
            java.util.Locale r10 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x01ff }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x01ff }
            h.f r0 = r0.f337601b     // Catch:{ all -> 0x01ff }
            java.lang.Object r0 = r0.mo5768a()     // Catch:{ all -> 0x01ff }
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0     // Catch:{ all -> 0x01ff }
            long r15 = r0.getAndIncrement()     // Catch:{ all -> 0x01ff }
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x01ff }
            r15 = 0
            r14[r15] = r0     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = "%015d"
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r14, r7)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = java.lang.String.format(r10, r0, r7)     // Catch:{ all -> 0x01ff }
            java.lang.String r7 = "format(locale, this, *args)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r7)     // Catch:{ all -> 0x01ff }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r0 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.C34705a.m63440a(r0)     // Catch:{ all -> 0x01ff }
            com.google.common.f.e r7 = f337748a     // Catch:{ all -> 0x01ff }
            com.google.common.f.x r10 = r7.mo56224b()     // Catch:{ all -> 0x01ff }
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10     // Catch:{ all -> 0x01ff }
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01ff }
            r10.mo56378ag(r14, r2)     // Catch:{ all -> 0x01ff }
            java.lang.String r14 = "InvocationManager#startInvocation with token(%s) from entrypoint(%s)."
            com.google.frameworks.client.a.a.b r15 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r0)     // Catch:{ all -> 0x01ff }
            com.google.android.libraries.search.assistant.invocation.o.a.bf r12 = r4.f90081b     // Catch:{ all -> 0x01ff }
            java.lang.String r12 = r12.name()     // Catch:{ all -> 0x01ff }
            com.google.common.f.n r13 = new com.google.common.f.n     // Catch:{ all -> 0x01ff }
            r5 = 35917(0x8c4d, float:5.033E-41)
            r13.<init>(r5)     // Catch:{ all -> 0x01ff }
            r10.mo56379ah(r13)     // Catch:{ all -> 0x01ff }
            r10.mo56354G(r14, r15, r12)     // Catch:{ all -> 0x01ff }
            com.google.android.libraries.search.assistant.invocation.o.i.g r5 = r4.f90082c     // Catch:{ all -> 0x01ff }
            java.lang.String r10 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r10)     // Catch:{ all -> 0x01ff }
            com.google.protobuf.bt r10 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2691e.C34691b.f92109d     // Catch:{ all -> 0x01ff }
            java.lang.String r12 = "sessionInvocationInputExtras"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r12)     // Catch:{ all -> 0x01ff }
            java.lang.Object r5 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34689e.m63423a(r5, r10)     // Catch:{ all -> 0x01ff }
            com.google.android.libraries.search.assistant.invocation.o.i.e.b r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2691e.C34691b) r5     // Catch:{ all -> 0x01ff }
            if (r5 == 0) goto L_0x0134
            long r12 = r5.f92112b     // Catch:{ all -> 0x01ff }
            com.google.common.f.x r5 = r7.mo56224b()     // Catch:{ all -> 0x01ff }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x01ff }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01ff }
            r5.mo56378ag(r7, r2)     // Catch:{ all -> 0x01ff }
            java.lang.String r2 = "Existing session with SessionId(%s) from InvocationParams is provided and will be used for Invocation for token(%s)."
            com.google.frameworks.client.a.a.b r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r0)     // Catch:{ all -> 0x01ff }
            com.google.common.f.n r10 = new com.google.common.f.n     // Catch:{ all -> 0x01ff }
            r14 = 35918(0x8c4e, float:5.0332E-41)
            r10.<init>(r14)     // Catch:{ all -> 0x01ff }
            r5.mo56379ah(r10)     // Catch:{ all -> 0x01ff }
            r5.mo56351D(r2, r12, r7)     // Catch:{ all -> 0x01ff }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r2 = new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d     // Catch:{ all -> 0x01ff }
            r2.<init>(r12)     // Catch:{ all -> 0x01ff }
            goto L_0x0135
        L_0x0134:
            r2 = 0
        L_0x0135:
            if (r2 != 0) goto L_0x015f
            r3.f337720a = r9     // Catch:{ all -> 0x01ff }
            r3.f337721b = r4     // Catch:{ all -> 0x01ff }
            r3.f337722c = r8     // Catch:{ all -> 0x01ff }
            r3.f337723d = r0     // Catch:{ all -> 0x01ff }
            r3.f337727h = r6     // Catch:{ all -> 0x01ff }
            java.lang.Object r2 = r9.mo105325k(r4, r0, r3)     // Catch:{ all -> 0x01ff }
            if (r2 == r11) goto L_0x015e
            r6 = r4
            r4 = r8
            r7 = r9
            r23 = r2
            r2 = r0
            r0 = r23
        L_0x014f:
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r0 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d) r0     // Catch:{ all -> 0x015a }
            r12 = r4
            r13 = r6
            r14 = r7
            r23 = r2
            r2 = r0
            r0 = r23
            goto L_0x0162
        L_0x015a:
            r0 = move-exception
            r3 = r4
            goto L_0x0201
        L_0x015e:
            return r11
        L_0x015f:
            r13 = r4
            r12 = r8
            r14 = r9
        L_0x0162:
            r3.f337720a = r14     // Catch:{ all -> 0x01fc }
            r3.f337721b = r13     // Catch:{ all -> 0x01fc }
            r3.f337722c = r12     // Catch:{ all -> 0x01fc }
            r3.f337723d = r0     // Catch:{ all -> 0x01fc }
            r3.f337724e = r2     // Catch:{ all -> 0x01fc }
            r4 = 3
            r3.f337727h = r4     // Catch:{ all -> 0x01fc }
            boolean r4 = r13.f90083d     // Catch:{ all -> 0x01fc }
            if (r4 == 0) goto L_0x0183
            com.google.android.apps.search.assistant.platform.j.b.a.a.aw r4 = r14.f337755h     // Catch:{ all -> 0x01fc }
            h.a.ao r9 = p5462h.p5463a.C69498ao.f185920a     // Catch:{ all -> 0x01fc }
            r6 = r0
            com.google.android.libraries.search.assistant.invocation.o.a.bp r6 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r6     // Catch:{ all -> 0x01fc }
            r8 = 1
            r5 = r13
            r7 = r2
            r10 = r3
            java.lang.Object r4 = r4.mo105306a(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01fc }
            goto L_0x0192
        L_0x0183:
            com.google.android.apps.search.assistant.platform.j.b.a.a.aw r4 = r14.f337755h     // Catch:{ all -> 0x01fc }
            h.a.ao r9 = p5462h.p5463a.C69498ao.f185920a     // Catch:{ all -> 0x01fc }
            r6 = r0
            com.google.android.libraries.search.assistant.invocation.o.a.bp r6 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r6     // Catch:{ all -> 0x01fc }
            r8 = 0
            r5 = r13
            r7 = r2
            r10 = r3
            java.lang.Object r4 = r4.mo105306a(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01fc }
        L_0x0192:
            if (r4 == r11) goto L_0x01fb
            r5 = r12
            r19 = r13
            r7 = r14
            r23 = r4
            r4 = r0
            r0 = r23
        L_0x019d:
            r21 = r0
            java.util.Set r21 = (java.util.Set) r21     // Catch:{ all -> 0x01f8 }
            com.google.android.apps.gsa.binaries.satin.app.aqr r0 = r7.f337758k     // Catch:{ all -> 0x01f8 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r6 = new com.google.android.apps.search.assistant.platform.j.b.a.a.m     // Catch:{ all -> 0x01f8 }
            com.google.android.apps.gsa.binaries.satin.app.aqx r0 = r0.f199888a     // Catch:{ all -> 0x01f8 }
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r0.a     // Catch:{ all -> 0x01f8 }
            g.a.a r0 = r0.H     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r0.mo17428b()     // Catch:{ all -> 0x01f8 }
            r22 = r0
            kotlinx.coroutines.aw r22 = (kotlinx.coroutines.C71422aw) r22     // Catch:{ all -> 0x01f8 }
            r18 = r4
            com.google.android.libraries.search.assistant.invocation.o.a.bp r18 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r18     // Catch:{ all -> 0x01f8 }
            r20 = r2
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r20 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d) r20     // Catch:{ all -> 0x01f8 }
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x01f8 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.ab r0 = r7.f337750c     // Catch:{ all -> 0x01f8 }
            kotlinx.coroutines.b.cy r0 = r0.f337565a     // Catch:{ all -> 0x01f8 }
        L_0x01c4:
            java.lang.Object r2 = r0.mo62784e()     // Catch:{ all -> 0x01f8 }
            r4 = r2
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x01f8 }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r8 = r6.f337671a     // Catch:{ all -> 0x01f8 }
            h.i r9 = new h.i     // Catch:{ all -> 0x01f8 }
            r9.<init>(r8, r6)     // Catch:{ all -> 0x01f8 }
            java.util.Map r4 = p5462h.p5463a.C69505av.m100873o(r4, r9)     // Catch:{ all -> 0x01f8 }
            boolean r2 = r0.mo62808g(r2, r4)     // Catch:{ all -> 0x01f8 }
            if (r2 == 0) goto L_0x01c4
            com.google.android.apps.search.assistant.platform.j.b.a.a.an r0 = r7.f337756i     // Catch:{ all -> 0x01f8 }
            r3.f337720a = r5     // Catch:{ all -> 0x01f8 }
            r3.f337721b = r6     // Catch:{ all -> 0x01f8 }
            r2 = 0
            r3.f337722c = r2     // Catch:{ all -> 0x01f8 }
            r3.f337723d = r2     // Catch:{ all -> 0x01f8 }
            r3.f337724e = r2     // Catch:{ all -> 0x01f8 }
            r4 = 4
            r3.f337727h = r4     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r0.mo105292a(r6, r3)     // Catch:{ all -> 0x01f8 }
            if (r0 == r11) goto L_0x01f7
            r3 = r5
        L_0x01f3:
            r3.mo63026c(r2)
            return r6
        L_0x01f7:
            return r11
        L_0x01f8:
            r0 = move-exception
            r3 = r5
            goto L_0x0201
        L_0x01fb:
            return r11
        L_0x01fc:
            r0 = move-exception
            r3 = r12
            goto L_0x0201
        L_0x01ff:
            r0 = move-exception
            r3 = r8
        L_0x0201:
            r2 = 0
        L_0x0202:
            r3.mo63026c(r2)
            throw r0
        L_0x0206:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y.mo105316a(com.google.android.libraries.search.assistant.invocation.f.b.b, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: com.google.android.apps.search.assistant.platform.j.b.a.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.google.android.libraries.search.assistant.invocation.o.a.bp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: com.google.android.apps.search.assistant.platform.j.b.a.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: com.google.android.libraries.search.assistant.invocation.o.a.bp} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105317b(com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp r12, com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.C121723e r13, p5462h.p5466c.C69577g r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121716w
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.google.android.apps.search.assistant.platform.j.b.a.a.w r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121716w) r0
            int r1 = r0.f337739h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337739h = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.a.a.w r0 = new com.google.android.apps.search.assistant.platform.j.b.a.a.w
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f337737f
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f337739h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004f
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r12 = r0.f337732a
            kotlinx.coroutines.j.b r12 = (kotlinx.coroutines.p5584j.C71788b) r12
            p5462h.C69714l.m101134b(r14)     // Catch:{ all -> 0x0030 }
            goto L_0x00c9
        L_0x0030:
            r13 = move-exception
            goto L_0x00d3
        L_0x0033:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003b:
            java.lang.Object r12 = r0.f337736e
            java.lang.Object r13 = r0.f337735d
            java.lang.Object r2 = r0.f337734c
            java.lang.Object r4 = r0.f337733b
            java.lang.Object r6 = r0.f337732a
            com.google.android.apps.search.assistant.platform.j.b.a.a.y r6 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y) r6
            p5462h.C69714l.m101134b(r14)
            r14 = r13
            r13 = r2
            r2 = r12
            r12 = r4
            goto L_0x0080
        L_0x004f:
            p5462h.C69714l.m101134b(r14)
            com.google.android.apps.search.assistant.platform.j.b.a.e r14 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.C121723e.CLIENT_DISCONNECTED
            com.google.android.libraries.search.assistant.invocation.j.a.b r14 = com.google.android.libraries.search.assistant.invocation.p2636j.p2637a.C33891b.INVOCATION_STATE_UNSPECIFIED
            com.google.android.apps.search.assistant.platform.j.b.a.a.g r14 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121700g.IMPLICIT
            int r14 = r13.ordinal()
            if (r14 == 0) goto L_0x0069
            if (r14 != r4) goto L_0x0063
            com.google.android.apps.search.assistant.platform.j.b.a.a.g r14 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121700g.TIMED_OUT
            goto L_0x006b
        L_0x0063:
            h.g r12 = new h.g
            r12.<init>()
            throw r12
        L_0x0069:
            com.google.android.apps.search.assistant.platform.j.b.a.a.g r14 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121700g.CLIENT_DISCONNECT
        L_0x006b:
            kotlinx.coroutines.j.b r2 = r11.f337751d
            r0.f337732a = r11
            r0.f337733b = r12
            r0.f337734c = r13
            r0.f337735d = r14
            r0.f337736e = r2
            r0.f337739h = r4
            java.lang.Object r4 = r2.mo63025b(r5, r0)
            if (r4 == r1) goto L_0x00d7
            r6 = r11
        L_0x0080:
            com.google.common.f.e r4 = f337748a     // Catch:{ all -> 0x00d0 }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ all -> 0x00d0 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x00d0 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00d0 }
            java.lang.String r8 = "INV.Manager"
            r4.mo56378ag(r7, r8)     // Catch:{ all -> 0x00d0 }
            java.lang.String r7 = "InvocationManager#terminateInvocation with token(%s) and reason(%s)."
            r8 = r12
            com.google.android.libraries.search.assistant.invocation.o.a.bp r8 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r8     // Catch:{ all -> 0x00d0 }
            com.google.frameworks.client.a.a.b r8 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r8)     // Catch:{ all -> 0x00d0 }
            com.google.android.apps.search.assistant.platform.j.b.a.e r13 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.C121723e) r13     // Catch:{ all -> 0x00d0 }
            java.lang.String r13 = r13.name()     // Catch:{ all -> 0x00d0 }
            com.google.common.f.n r9 = new com.google.common.f.n     // Catch:{ all -> 0x00d0 }
            r10 = 35921(0x8c51, float:5.0336E-41)
            r9.<init>(r10)     // Catch:{ all -> 0x00d0 }
            r4.mo56379ah(r9)     // Catch:{ all -> 0x00d0 }
            r4.mo56354G(r7, r8, r13)     // Catch:{ all -> 0x00d0 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.ab r13 = r6.f337750c     // Catch:{ all -> 0x00d0 }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r12 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r12     // Catch:{ all -> 0x00d0 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r12 = r13.mo105289a(r12)     // Catch:{ all -> 0x00d0 }
            r0.f337732a = r2     // Catch:{ all -> 0x00d0 }
            r0.f337733b = r5     // Catch:{ all -> 0x00d0 }
            r0.f337734c = r5     // Catch:{ all -> 0x00d0 }
            r0.f337735d = r5     // Catch:{ all -> 0x00d0 }
            r0.f337736e = r5     // Catch:{ all -> 0x00d0 }
            r0.f337739h = r3     // Catch:{ all -> 0x00d0 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.g r14 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121700g) r14     // Catch:{ all -> 0x00d0 }
            java.lang.Object r12 = r6.mo105319e(r12, r14, r0)     // Catch:{ all -> 0x00d0 }
            if (r12 == r1) goto L_0x00cf
            r12 = r2
        L_0x00c9:
            r12.mo63026c(r5)
            h.q r12 = p5462h.C69788q.f186170a
            return r12
        L_0x00cf:
            return r1
        L_0x00d0:
            r12 = move-exception
            r13 = r12
            r12 = r2
        L_0x00d3:
            r12.mo63026c(r5)
            throw r13
        L_0x00d7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y.mo105317b(com.google.android.libraries.search.assistant.invocation.o.a.bp, com.google.android.apps.search.assistant.platform.j.b.a.e, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: com.google.android.libraries.search.assistant.invocation.k.b.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: com.google.android.apps.search.assistant.platform.j.b.a.a.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: com.google.android.libraries.search.assistant.invocation.k.b.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: com.google.android.libraries.search.assistant.invocation.k.b.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: com.google.android.libraries.search.assistant.invocation.k.b.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: com.google.android.libraries.search.assistant.invocation.k.b.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: com.google.android.libraries.search.assistant.invocation.k.b.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: com.google.android.libraries.search.assistant.invocation.k.b.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: com.google.android.apps.search.assistant.platform.j.b.a.a.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105319e(com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121706m r11, com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121700g r12, p5462h.p5466c.C69577g r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121707n
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.apps.search.assistant.platform.j.b.a.a.n r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121707n) r0
            int r1 = r0.f337684f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337684f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.a.a.n r0 = new com.google.android.apps.search.assistant.platform.j.b.a.a.n
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f337682d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f337684f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r5) goto L_0x0032
            java.lang.Object r11 = r0.f337681c
            java.lang.Object r12 = r0.f337680b
            java.lang.Object r0 = r0.f337679a
            p5462h.C69714l.m101134b(r13)
            r13 = r11
            r11 = r12
            goto L_0x00c4
        L_0x0032:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003a:
            p5462h.C69714l.m101134b(r13)
            com.google.android.apps.search.assistant.platform.j.b.a.e r13 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.C121723e.CLIENT_DISCONNECTED
            com.google.android.libraries.search.assistant.invocation.j.a.b r13 = com.google.android.libraries.search.assistant.invocation.p2636j.p2637a.C33891b.INVOCATION_STATE_UNSPECIFIED
            com.google.android.apps.search.assistant.platform.j.b.a.a.g r13 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121700g.IMPLICIT
            int r13 = r12.ordinal()
            java.lang.String r2 = "Not a completion state"
            if (r13 == 0) goto L_0x0140
            if (r13 == r5) goto L_0x013a
            r2 = 0
            if (r13 == r4) goto L_0x0067
            if (r13 == r3) goto L_0x0064
            r6 = 4
            if (r13 == r6) goto L_0x0061
            r6 = 5
            if (r13 != r6) goto L_0x005b
            com.google.android.libraries.search.assistant.invocation.k.b.b r13 = com.google.android.libraries.search.assistant.invocation.p2641k.p2643b.C33923b.CLIENT_DISCONNECT
            goto L_0x0068
        L_0x005b:
            h.g r11 = new h.g
            r11.<init>()
            throw r11
        L_0x0061:
            com.google.android.libraries.search.assistant.invocation.k.b.b r13 = com.google.android.libraries.search.assistant.invocation.p2641k.p2643b.C33923b.TIMED_OUT
            goto L_0x0068
        L_0x0064:
            com.google.android.libraries.search.assistant.invocation.k.b.b r13 = com.google.android.libraries.search.assistant.invocation.p2641k.p2643b.C33923b.CANCELED
            goto L_0x0068
        L_0x0067:
            r13 = r2
        L_0x0068:
            com.google.common.f.e r6 = f337748a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r8 = "INV.Manager"
            r6.mo56378ag(r7, r8)
            com.google.android.libraries.search.assistant.invocation.o.a.bp r7 = r11.f337671a
            com.google.frameworks.client.a.a.b r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r7)
            if (r13 == 0) goto L_0x0083
            java.lang.String r2 = r13.name()
        L_0x0083:
            com.google.common.f.n r8 = new com.google.common.f.n
            r9 = 35911(0x8c47, float:5.0322E-41)
            r8.<init>(r9)
            r6.mo56379ah(r8)
            java.lang.String r8 = "InvocationManager#endInvocation with token(%s) and errorCode(%s)"
            r6.mo56354G(r8, r7, r2)
            com.google.android.apps.search.assistant.platform.j.b.a.a.ab r2 = r10.f337750c
            com.google.android.libraries.search.assistant.invocation.o.a.bp r6 = r11.f337671a
            java.lang.String r7 = "token"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r7)
            kotlinx.coroutines.b.cy r7 = r2.f337565a
        L_0x009e:
            java.lang.Object r2 = r7.mo62784e()
            r8 = r2
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r9 = r8.get(r6)
            java.util.Map r8 = p5462h.p5463a.C69505av.m100869k(r8, r6)
            boolean r2 = r7.mo62808g(r2, r8)
            if (r2 == 0) goto L_0x009e
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r9 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121706m) r9
            r0.f337679a = r10
            r0.f337680b = r11
            r0.f337681c = r13
            r0.f337684f = r5
            java.lang.Object r12 = r11.mo105314d(r12, r0)
            if (r12 == r1) goto L_0x0139
            r0 = r10
        L_0x00c4:
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12 = r11
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r12 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121706m) r12
            com.google.android.libraries.search.assistant.invocation.o.a.bp r1 = r12.f337671a
            com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r1)
            com.google.android.apps.search.assistant.platform.j.b.a.a.y r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y) r0
            com.google.android.libraries.search.logging.d.kp r1 = r0.f337757j
            if (r13 == 0) goto L_0x00dd
            r2 = r13
            com.google.android.libraries.search.assistant.invocation.k.b.b r2 = (com.google.android.libraries.search.assistant.invocation.p2641k.p2643b.C33923b) r2
            java.lang.String r2 = r2.name()
            if (r2 != 0) goto L_0x00df
        L_0x00dd:
            java.lang.String r2 = ""
        L_0x00df:
            com.google.android.libraries.search.assistant.invocation.f.b.b r6 = r12.f337672b
            com.google.android.libraries.search.assistant.invocation.o.c.a r6 = r6.f90080a
            com.google.android.libraries.search.assistant.invocation.o.a.b r6 = r6.f90869a
            java.lang.String r6 = r6.name()
            com.google.android.libraries.search.assistant.invocation.f.b.b r12 = r12.f337672b
            com.google.android.libraries.search.assistant.invocation.o.a.bf r12 = r12.f90081b
            java.lang.String r12 = r12.name()
            com.google.common.base.cr r1 = r1.f103047s
            java.lang.Object r1 = r1.mo6453a()
            com.google.android.libraries.au.d r1 = (com.google.android.libraries.p1635au.C19567d) r1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r7 = 0
            r3[r7] = r2
            r3[r5] = r6
            r3[r4] = r12
            r4 = 1
            r1.mo24822a(r4, r3)
            com.google.android.apps.gsa.binaries.satin.app.aqs r12 = r0.f337752e
            com.google.android.libraries.search.assistant.invocation.k.a.c r11 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.C121720b.m201143a(r12, r11)
            if (r13 != 0) goto L_0x011d
            com.google.android.libraries.search.b.i.f r12 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97042eA
            com.google.net.a.a.b r13 = com.google.net.p4726a.p4727a.C62722b.OK
            com.google.android.libraries.search.b.i.a r12 = r12.mo40805c(r13)
            j.a.c.c.a.ew r13 = r11.f90466b
            r11.mo39128a(r12, r13)
            goto L_0x0136
        L_0x011d:
            com.google.protobuf.bt r12 = com.google.android.libraries.search.assistant.invocation.p2641k.p2643b.C33924c.f90483a
            com.google.android.libraries.search.assistant.n.a r12 = com.google.android.libraries.search.assistant.p2705n.C34819a.m63580c(r12, r13)
            com.google.android.libraries.search.b.i.f r13 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97042eA
            int r0 = r12.mo39520a()
            java.lang.String r12 = r12.mo39522e()
            com.google.android.libraries.search.b.i.a r12 = r13.mo40803a(r0, r12)
            j.a.c.c.a.ew r13 = r11.f90466b
            r11.mo39128a(r12, r13)
        L_0x0136:
            h.q r11 = p5462h.C69788q.f186170a
            return r11
        L_0x0139:
            return r1
        L_0x013a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r2)
            throw r11
        L_0x0140:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r2)
            goto L_0x0147
        L_0x0146:
            throw r11
        L_0x0147:
            goto L_0x0146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y.mo105319e(com.google.android.apps.search.assistant.platform.j.b.a.a.m, com.google.android.apps.search.assistant.platform.j.b.a.a.g, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b A[Catch:{ all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c A[Catch:{ all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080 A[Catch:{ all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f A[Catch:{ all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f5 A[SYNTHETIC, Splitter:B:41:0x00f5] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0110 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105320f(com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            java.lang.String r0 = "Token("
            boolean r1 = r11 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121708o
            if (r1 == 0) goto L_0x0015
            r1 = r11
            com.google.android.apps.search.assistant.platform.j.b.a.a.o r1 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121708o) r1
            int r2 = r1.f337690f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f337690f = r2
            goto L_0x001a
        L_0x0015:
            com.google.android.apps.search.assistant.platform.j.b.a.a.o r1 = new com.google.android.apps.search.assistant.platform.j.b.a.a.o
            r1.<init>(r9, r11)
        L_0x001a:
            java.lang.Object r11 = r1.f337688d
            h.c.a.a r2 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r3 = r1.f337690f
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0057
            if (r3 == r6) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r10 = r1.f337687c
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r10 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121706m) r10
            java.lang.Object r2 = r1.f337686b
            kotlinx.coroutines.j.b r2 = (kotlinx.coroutines.p5584j.C71788b) r2
            java.lang.Object r1 = r1.f337685a
            com.google.android.libraries.search.assistant.invocation.o.a.bp r1 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r1
            p5462h.C69714l.m101134b(r11)     // Catch:{ all -> 0x003a }
            goto L_0x00a8
        L_0x003a:
            r10 = move-exception
            goto L_0x0113
        L_0x003d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0045:
            java.lang.Object r10 = r1.f337687c
            kotlinx.coroutines.j.b r10 = (kotlinx.coroutines.p5584j.C71788b) r10
            java.lang.Object r3 = r1.f337686b
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r3
            java.lang.Object r7 = r1.f337685a
            com.google.android.apps.search.assistant.platform.j.b.a.a.y r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y) r7
            p5462h.C69714l.m101134b(r11)
            r11 = r10
            r10 = r3
            goto L_0x006b
        L_0x0057:
            p5462h.C69714l.m101134b(r11)
            kotlinx.coroutines.j.b r11 = r9.f337751d
            r1.f337685a = r9
            r1.f337686b = r10
            r1.f337687c = r11
            r1.f337690f = r6
            java.lang.Object r3 = r11.mo63025b(r5, r1)
            if (r3 == r2) goto L_0x0117
            r7 = r9
        L_0x006b:
            com.google.android.apps.search.assistant.platform.j.b.a.a.aw r3 = r7.f337755h     // Catch:{ all -> 0x0111 }
            boolean r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2693a.C34708c.m63443b(r10)     // Catch:{ all -> 0x0111 }
            java.lang.String r8 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.C34705a.m63441b(r10)     // Catch:{ all -> 0x0111 }
            int r8 = r8.length()     // Catch:{ all -> 0x0111 }
            if (r8 != 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r6 = 0
        L_0x007d:
            r6 = r6 | r7
            if (r6 == 0) goto L_0x008f
            com.google.android.apps.search.assistant.platform.j.b.a.a.ab r6 = r3.f337632b     // Catch:{ all -> 0x0111 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r6 = r6.mo105290b()     // Catch:{ all -> 0x0111 }
            if (r6 == 0) goto L_0x0089
            goto L_0x0095
        L_0x0089:
            com.google.android.libraries.search.assistant.invocation.b.g r10 = new com.google.android.libraries.search.assistant.invocation.b.g     // Catch:{ all -> 0x0111 }
            r10.<init>()     // Catch:{ all -> 0x0111 }
            throw r10     // Catch:{ all -> 0x0111 }
        L_0x008f:
            com.google.android.apps.search.assistant.platform.j.b.a.a.ab r6 = r3.f337632b     // Catch:{ all -> 0x0111 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r6 = r6.mo105289a(r10)     // Catch:{ all -> 0x0111 }
        L_0x0095:
            com.google.android.apps.search.assistant.platform.j.b.a.a.an r3 = r3.f337633c     // Catch:{ all -> 0x0111 }
            r1.f337685a = r10     // Catch:{ all -> 0x0111 }
            r1.f337686b = r11     // Catch:{ all -> 0x0111 }
            r1.f337687c = r6     // Catch:{ all -> 0x0111 }
            r1.f337690f = r4     // Catch:{ all -> 0x0111 }
            java.lang.Object r1 = r3.mo105293b(r6)     // Catch:{ all -> 0x0111 }
            if (r1 == r2) goto L_0x0110
            r1 = r10
            r2 = r11
            r10 = r6
        L_0x00a8:
            com.google.common.f.e r11 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121694aw.f337631a     // Catch:{ all -> 0x003a }
            com.google.common.f.x r11 = r11.mo56224b()     // Catch:{ all -> 0x003a }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ all -> 0x003a }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "INV.ResourceManager"
            r11.mo56378ag(r3, r4)     // Catch:{ all -> 0x003a }
            java.lang.String r3 = "Accessing %s for token(%s)"
            java.lang.Class<com.google.android.apps.search.assistant.platform.j.b.b.a.o> r4 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121738o.class
            int r6 = p5462h.p5473f.p5475b.C69649af.f186028a     // Catch:{ all -> 0x003a }
            h.f.b.g r6 = new h.f.b.g     // Catch:{ all -> 0x003a }
            r6.<init>(r4)     // Catch:{ all -> 0x003a }
            java.lang.String r4 = r6.mo61379b()     // Catch:{ all -> 0x003a }
            com.google.frameworks.client.a.a.b r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r1)     // Catch:{ all -> 0x003a }
            com.google.common.f.n r7 = new com.google.common.f.n     // Catch:{ all -> 0x003a }
            r8 = 35913(0x8c49, float:5.0325E-41)
            r7.<init>(r8)     // Catch:{ all -> 0x003a }
            r11.mo56379ah(r7)     // Catch:{ all -> 0x003a }
            r11.mo56354G(r3, r4, r6)     // Catch:{ all -> 0x003a }
            kotlinx.coroutines.b.du r10 = r10.f337675e     // Catch:{ all -> 0x003a }
            java.lang.Object r10 = r10.mo62784e()     // Catch:{ all -> 0x003a }
            com.google.android.apps.search.assistant.platform.j.b.a.a.f r10 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121699f) r10     // Catch:{ all -> 0x003a }
            java.util.Map r10 = r10.f337651b     // Catch:{ all -> 0x003a }
            java.lang.Class<com.google.android.apps.search.assistant.platform.j.b.b.a.o> r11 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121738o.class
            h.f.b.g r3 = new h.f.b.g     // Catch:{ all -> 0x003a }
            r3.<init>(r11)     // Catch:{ all -> 0x003a }
            java.lang.Object r10 = r10.get(r3)     // Catch:{ all -> 0x003a }
            com.google.android.apps.search.assistant.platform.j.b.b.a.o r10 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a.C121738o) r10     // Catch:{ all -> 0x003a }
            if (r10 == 0) goto L_0x00f5
            r2.mo63026c(r5)
            return r10
        L_0x00f5:
            com.google.android.libraries.search.assistant.invocation.b.g r10 = new com.google.android.libraries.search.assistant.invocation.b.g     // Catch:{ all -> 0x003a }
            com.google.frameworks.client.a.a.b r11 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r1)     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r1.<init>(r0)     // Catch:{ all -> 0x003a }
            r1.append(r11)     // Catch:{ all -> 0x003a }
            java.lang.String r11 = ")"
            r1.append(r11)     // Catch:{ all -> 0x003a }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x003a }
            r10.<init>(r11)     // Catch:{ all -> 0x003a }
            throw r10     // Catch:{ all -> 0x003a }
        L_0x0110:
            return r2
        L_0x0111:
            r10 = move-exception
            r2 = r11
        L_0x0113:
            r2.mo63026c(r5)
            throw r10
        L_0x0117:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y.mo105320f(com.google.android.libraries.search.assistant.invocation.o.a.bp, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b A[Catch:{ all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c A[Catch:{ all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080 A[Catch:{ all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f A[Catch:{ all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f5 A[SYNTHETIC, Splitter:B:41:0x00f5] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0110 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105322h(com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            java.lang.String r0 = "Token("
            boolean r1 = r11 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121710q
            if (r1 == 0) goto L_0x0015
            r1 = r11
            com.google.android.apps.search.assistant.platform.j.b.a.a.q r1 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121710q) r1
            int r2 = r1.f337702f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f337702f = r2
            goto L_0x001a
        L_0x0015:
            com.google.android.apps.search.assistant.platform.j.b.a.a.q r1 = new com.google.android.apps.search.assistant.platform.j.b.a.a.q
            r1.<init>(r9, r11)
        L_0x001a:
            java.lang.Object r11 = r1.f337700d
            h.c.a.a r2 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r3 = r1.f337702f
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0057
            if (r3 == r6) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r10 = r1.f337699c
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r10 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121706m) r10
            java.lang.Object r2 = r1.f337698b
            kotlinx.coroutines.j.b r2 = (kotlinx.coroutines.p5584j.C71788b) r2
            java.lang.Object r1 = r1.f337697a
            com.google.android.libraries.search.assistant.invocation.o.a.bp r1 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r1
            p5462h.C69714l.m101134b(r11)     // Catch:{ all -> 0x003a }
            goto L_0x00a8
        L_0x003a:
            r10 = move-exception
            goto L_0x0113
        L_0x003d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0045:
            java.lang.Object r10 = r1.f337699c
            kotlinx.coroutines.j.b r10 = (kotlinx.coroutines.p5584j.C71788b) r10
            java.lang.Object r3 = r1.f337698b
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r3
            java.lang.Object r7 = r1.f337697a
            com.google.android.apps.search.assistant.platform.j.b.a.a.y r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y) r7
            p5462h.C69714l.m101134b(r11)
            r11 = r10
            r10 = r3
            goto L_0x006b
        L_0x0057:
            p5462h.C69714l.m101134b(r11)
            kotlinx.coroutines.j.b r11 = r9.f337751d
            r1.f337697a = r9
            r1.f337698b = r10
            r1.f337699c = r11
            r1.f337702f = r6
            java.lang.Object r3 = r11.mo63025b(r5, r1)
            if (r3 == r2) goto L_0x0117
            r7 = r9
        L_0x006b:
            com.google.android.apps.search.assistant.platform.j.b.a.a.aw r3 = r7.f337755h     // Catch:{ all -> 0x0111 }
            boolean r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2693a.C34708c.m63443b(r10)     // Catch:{ all -> 0x0111 }
            java.lang.String r8 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.C34705a.m63441b(r10)     // Catch:{ all -> 0x0111 }
            int r8 = r8.length()     // Catch:{ all -> 0x0111 }
            if (r8 != 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r6 = 0
        L_0x007d:
            r6 = r6 | r7
            if (r6 == 0) goto L_0x008f
            com.google.android.apps.search.assistant.platform.j.b.a.a.ab r6 = r3.f337632b     // Catch:{ all -> 0x0111 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r6 = r6.mo105290b()     // Catch:{ all -> 0x0111 }
            if (r6 == 0) goto L_0x0089
            goto L_0x0095
        L_0x0089:
            com.google.android.libraries.search.assistant.invocation.b.g r10 = new com.google.android.libraries.search.assistant.invocation.b.g     // Catch:{ all -> 0x0111 }
            r10.<init>()     // Catch:{ all -> 0x0111 }
            throw r10     // Catch:{ all -> 0x0111 }
        L_0x008f:
            com.google.android.apps.search.assistant.platform.j.b.a.a.ab r6 = r3.f337632b     // Catch:{ all -> 0x0111 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r6 = r6.mo105289a(r10)     // Catch:{ all -> 0x0111 }
        L_0x0095:
            com.google.android.apps.search.assistant.platform.j.b.a.a.an r3 = r3.f337633c     // Catch:{ all -> 0x0111 }
            r1.f337697a = r10     // Catch:{ all -> 0x0111 }
            r1.f337698b = r11     // Catch:{ all -> 0x0111 }
            r1.f337699c = r6     // Catch:{ all -> 0x0111 }
            r1.f337702f = r4     // Catch:{ all -> 0x0111 }
            java.lang.Object r1 = r3.mo105293b(r6)     // Catch:{ all -> 0x0111 }
            if (r1 == r2) goto L_0x0110
            r1 = r10
            r2 = r11
            r10 = r6
        L_0x00a8:
            com.google.common.f.e r11 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121694aw.f337631a     // Catch:{ all -> 0x003a }
            com.google.common.f.x r11 = r11.mo56224b()     // Catch:{ all -> 0x003a }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ all -> 0x003a }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "INV.ResourceManager"
            r11.mo56378ag(r3, r4)     // Catch:{ all -> 0x003a }
            java.lang.String r3 = "Accessing %s for token(%s)"
            java.lang.Class<com.google.android.apps.search.assistant.platform.j.b.b.c.ag> r4 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121758ag.class
            int r6 = p5462h.p5473f.p5475b.C69649af.f186028a     // Catch:{ all -> 0x003a }
            h.f.b.g r6 = new h.f.b.g     // Catch:{ all -> 0x003a }
            r6.<init>(r4)     // Catch:{ all -> 0x003a }
            java.lang.String r4 = r6.mo61379b()     // Catch:{ all -> 0x003a }
            com.google.frameworks.client.a.a.b r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r1)     // Catch:{ all -> 0x003a }
            com.google.common.f.n r7 = new com.google.common.f.n     // Catch:{ all -> 0x003a }
            r8 = 35915(0x8c4b, float:5.0328E-41)
            r7.<init>(r8)     // Catch:{ all -> 0x003a }
            r11.mo56379ah(r7)     // Catch:{ all -> 0x003a }
            r11.mo56354G(r3, r4, r6)     // Catch:{ all -> 0x003a }
            kotlinx.coroutines.b.du r10 = r10.f337675e     // Catch:{ all -> 0x003a }
            java.lang.Object r10 = r10.mo62784e()     // Catch:{ all -> 0x003a }
            com.google.android.apps.search.assistant.platform.j.b.a.a.f r10 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121699f) r10     // Catch:{ all -> 0x003a }
            java.util.Map r10 = r10.f337651b     // Catch:{ all -> 0x003a }
            java.lang.Class<com.google.android.apps.search.assistant.platform.j.b.b.c.ag> r11 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121758ag.class
            h.f.b.g r3 = new h.f.b.g     // Catch:{ all -> 0x003a }
            r3.<init>(r11)     // Catch:{ all -> 0x003a }
            java.lang.Object r10 = r10.get(r3)     // Catch:{ all -> 0x003a }
            com.google.android.apps.search.assistant.platform.j.b.b.c.ag r10 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121758ag) r10     // Catch:{ all -> 0x003a }
            if (r10 == 0) goto L_0x00f5
            r2.mo63026c(r5)
            return r10
        L_0x00f5:
            com.google.android.libraries.search.assistant.invocation.b.g r10 = new com.google.android.libraries.search.assistant.invocation.b.g     // Catch:{ all -> 0x003a }
            com.google.frameworks.client.a.a.b r11 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r1)     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r1.<init>(r0)     // Catch:{ all -> 0x003a }
            r1.append(r11)     // Catch:{ all -> 0x003a }
            java.lang.String r11 = ")"
            r1.append(r11)     // Catch:{ all -> 0x003a }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x003a }
            r10.<init>(r11)     // Catch:{ all -> 0x003a }
            throw r10     // Catch:{ all -> 0x003a }
        L_0x0110:
            return r2
        L_0x0111:
            r10 = move-exception
            r2 = r11
        L_0x0113:
            r2.mo63026c(r5)
            throw r10
        L_0x0117:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y.mo105322h(com.google.android.libraries.search.assistant.invocation.o.a.bp, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: com.google.android.apps.search.assistant.platform.j.b.a.a.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.google.android.apps.search.assistant.platform.j.b.a.a.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.google.android.apps.search.assistant.platform.j.b.a.a.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: com.google.android.apps.search.assistant.platform.j.b.a.a.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: com.google.android.apps.search.assistant.platform.j.b.a.a.y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0117 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105324j(com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121706m r18, p5462h.p5466c.C69577g r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121712s
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.google.android.apps.search.assistant.platform.j.b.a.a.s r3 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121712s) r3
            int r4 = r3.f337713e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f337713e = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.apps.search.assistant.platform.j.b.a.a.s r3 = new com.google.android.apps.search.assistant.platform.j.b.a.a.s
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f337711c
            h.c.a.a r11 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r3.f337713e
            r12 = 3
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x004d
            if (r4 == r6) goto L_0x0045
            if (r4 == r5) goto L_0x003c
            if (r4 != r12) goto L_0x0034
            p5462h.C69714l.m101134b(r2)
            goto L_0x0118
        L_0x0034:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003c:
            java.lang.Object r1 = r3.f337710b
            java.lang.Object r4 = r3.f337709a
            p5462h.C69714l.m101134b(r2)
            goto L_0x00a8
        L_0x0045:
            java.lang.Object r1 = r3.f337710b
            java.lang.Object r4 = r3.f337709a
            p5462h.C69714l.m101134b(r2)
            goto L_0x0073
        L_0x004d:
            p5462h.C69714l.m101134b(r2)
            com.google.android.libraries.search.assistant.invocation.f.b.b r2 = r1.f337672b
            com.google.android.libraries.search.assistant.invocation.o.a.ca r4 = r2.f90084e
            int r4 = r4.f90772a
            r7 = r4 & 1
            if (r7 == 0) goto L_0x005b
            goto L_0x0063
        L_0x005b:
            r4 = r4 & r5
            if (r4 != 0) goto L_0x0063
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r2 = r1.f337673c
            r7 = r2
            r2 = r0
            goto L_0x0077
        L_0x0063:
            com.google.android.libraries.search.assistant.invocation.o.a.bp r4 = r1.f337671a
            r3.f337709a = r0
            r3.f337710b = r1
            r3.f337713e = r6
            r6 = 0
            java.lang.Object r2 = r0.m201131l(r6, r2, r4, r3)
            if (r2 == r11) goto L_0x013a
            r4 = r0
        L_0x0073:
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r2 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d) r2
            r7 = r2
            r2 = r4
        L_0x0077:
            r4 = r2
            com.google.android.apps.search.assistant.platform.j.b.a.a.y r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y) r4
            com.google.android.apps.search.assistant.platform.j.b.a.a.aw r4 = r4.f337755h
            r6 = r1
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r6 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121706m) r6
            com.google.android.libraries.search.assistant.invocation.f.b.b r8 = r6.f337672b
            com.google.android.libraries.search.assistant.invocation.o.a.bp r9 = r6.f337671a
            kotlinx.coroutines.b.du r6 = r6.f337675e
            java.lang.Object r6 = r6.mo62784e()
            com.google.android.apps.search.assistant.platform.j.b.a.a.f r6 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121699f) r6
            java.util.Map r6 = r6.f337651b
            java.util.Set r10 = r6.keySet()
            r3.f337709a = r2
            r3.f337710b = r1
            r3.f337713e = r5
            r13 = 0
            r5 = r8
            r6 = r9
            r8 = r13
            r9 = r10
            r10 = r3
            java.lang.Object r4 = r4.mo105306a(r5, r6, r7, r8, r9, r10)
            if (r4 == r11) goto L_0x013a
            r16 = r4
            r4 = r2
            r2 = r16
        L_0x00a8:
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r5 = "explicitResources"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r1 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121706m) r1
            kotlinx.coroutines.b.cy r5 = r1.f337674d
        L_0x00b3:
            java.lang.Object r6 = r5.mo62784e()
            r7 = r6
            com.google.android.apps.search.assistant.platform.j.b.a.a.f r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121699f) r7
            boolean r8 = r7.f337652c
            if (r8 != 0) goto L_0x011b
            com.google.android.apps.search.assistant.platform.j.b.a.a.g r8 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121700g.EXPLICIT
            java.util.Map r7 = r7.f337651b
            r9 = 10
            int r9 = p5462h.p5463a.C69540x.m100804k(r2, r9)
            int r9 = p5462h.p5463a.C69505av.m100860b(r9)
            r10 = 16
            if (r9 >= r10) goto L_0x00d2
            r9 = 16
        L_0x00d2:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>(r9)
            java.util.Iterator r9 = r2.iterator()
        L_0x00db:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x00f7
            java.lang.Object r13 = r9.next()
            r14 = r13
            com.google.android.libraries.search.assistant.invocation.f.b.c r14 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33733c) r14
            java.lang.Class r14 = r14.getClass()
            int r15 = p5462h.p5473f.p5475b.C69649af.f186028a
            h.f.b.g r15 = new h.f.b.g
            r15.<init>(r14)
            r10.put(r15, r13)
            goto L_0x00db
        L_0x00f7:
            java.util.Map r7 = p5462h.p5463a.C69505av.m100872n(r7, r10)
            com.google.android.apps.search.assistant.platform.j.b.a.a.f r9 = new com.google.android.apps.search.assistant.platform.j.b.a.a.f
            r9.<init>(r8, r7)
            boolean r6 = r5.mo62808g(r6, r9)
            if (r6 == 0) goto L_0x00b3
            com.google.android.apps.search.assistant.platform.j.b.a.a.y r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y) r4
            com.google.android.apps.search.assistant.platform.j.b.a.a.an r2 = r4.f337756i
            r4 = 0
            r3.f337709a = r4
            r3.f337710b = r4
            r3.f337713e = r12
            java.lang.Object r1 = r2.mo105293b(r1)
            if (r1 != r11) goto L_0x0118
            return r11
        L_0x0118:
            h.q r1 = p5462h.C69788q.f186170a
            return r1
        L_0x011b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            com.google.android.libraries.search.assistant.invocation.o.a.bp r1 = r1.f337671a
            com.google.frameworks.client.a.a.b r1 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invocation "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " was already completed"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x013a:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y.mo105324j(com.google.android.apps.search.assistant.platform.j.b.a.a.m, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105325k(com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33729b r6, com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp r7, p5462h.p5466c.C69577g r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121715v
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.j.b.a.a.v r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121715v) r0
            int r1 = r0.f337731d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337731d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.a.a.v r0 = new com.google.android.apps.search.assistant.platform.j.b.a.a.v
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f337729b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f337731d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            java.lang.Object r7 = r0.f337728a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0058
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.search.assistant.invocation.o.a.ca r8 = r6.f90084e
            int r8 = r8.f90772a
            r2 = r8 & 1
            if (r2 == 0) goto L_0x003e
            goto L_0x004c
        L_0x003e:
            r2 = r8 & 4
            if (r2 != 0) goto L_0x004c
            r2 = r8 & 2
            if (r2 != 0) goto L_0x004c
            r8 = r8 & 8
            if (r8 != 0) goto L_0x004c
            r8 = r3
            goto L_0x005a
        L_0x004c:
            boolean r8 = r6.f90083d
            r0.f337728a = r7
            r0.f337731d = r4
            java.lang.Object r8 = r5.m201131l(r8, r6, r7, r0)
            if (r8 == r1) goto L_0x0089
        L_0x0058:
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r8 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d) r8
        L_0x005a:
            com.google.common.f.e r6 = f337748a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "INV.Manager"
            r6.mo56378ag(r0, r1)
            if (r8 == 0) goto L_0x0072
            long r0 = r8.f89676a
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r0)
        L_0x0072:
            com.google.android.libraries.search.assistant.invocation.o.a.bp r7 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r7
            com.google.frameworks.client.a.a.b r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r7)
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 35920(0x8c50, float:5.0335E-41)
            r0.<init>(r1)
            r6.mo56379ah(r0)
            java.lang.String r0 = "SessionId(%s) from newly started session for token(%s)."
            r6.mo56354G(r0, r3, r7)
            return r8
        L_0x0089:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y.mo105325k(com.google.android.libraries.search.assistant.invocation.f.b.b, com.google.android.libraries.search.assistant.invocation.o.a.bp, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b A[Catch:{ all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c A[Catch:{ all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080 A[Catch:{ all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f A[Catch:{ all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f5 A[SYNTHETIC, Splitter:B:41:0x00f5] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0110 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105321g(com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            java.lang.String r0 = "Token("
            boolean r1 = r11 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121709p
            if (r1 == 0) goto L_0x0015
            r1 = r11
            com.google.android.apps.search.assistant.platform.j.b.a.a.p r1 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121709p) r1
            int r2 = r1.f337696f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f337696f = r2
            goto L_0x001a
        L_0x0015:
            com.google.android.apps.search.assistant.platform.j.b.a.a.p r1 = new com.google.android.apps.search.assistant.platform.j.b.a.a.p
            r1.<init>(r9, r11)
        L_0x001a:
            java.lang.Object r11 = r1.f337694d
            h.c.a.a r2 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r3 = r1.f337696f
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0057
            if (r3 == r6) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r10 = r1.f337693c
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r10 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121706m) r10
            java.lang.Object r2 = r1.f337692b
            kotlinx.coroutines.j.b r2 = (kotlinx.coroutines.p5584j.C71788b) r2
            java.lang.Object r1 = r1.f337691a
            com.google.android.libraries.search.assistant.invocation.o.a.bp r1 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r1
            p5462h.C69714l.m101134b(r11)     // Catch:{ all -> 0x003a }
            goto L_0x00a8
        L_0x003a:
            r10 = move-exception
            goto L_0x0113
        L_0x003d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0045:
            java.lang.Object r10 = r1.f337693c
            kotlinx.coroutines.j.b r10 = (kotlinx.coroutines.p5584j.C71788b) r10
            java.lang.Object r3 = r1.f337692b
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r3
            java.lang.Object r7 = r1.f337691a
            com.google.android.apps.search.assistant.platform.j.b.a.a.y r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y) r7
            p5462h.C69714l.m101134b(r11)
            r11 = r10
            r10 = r3
            goto L_0x006b
        L_0x0057:
            p5462h.C69714l.m101134b(r11)
            kotlinx.coroutines.j.b r11 = r9.f337751d
            r1.f337691a = r9
            r1.f337692b = r10
            r1.f337693c = r11
            r1.f337696f = r6
            java.lang.Object r3 = r11.mo63025b(r5, r1)
            if (r3 == r2) goto L_0x0117
            r7 = r9
        L_0x006b:
            com.google.android.apps.search.assistant.platform.j.b.a.a.aw r3 = r7.f337755h     // Catch:{ all -> 0x0111 }
            boolean r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2693a.C34708c.m63443b(r10)     // Catch:{ all -> 0x0111 }
            java.lang.String r8 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.C34705a.m63441b(r10)     // Catch:{ all -> 0x0111 }
            int r8 = r8.length()     // Catch:{ all -> 0x0111 }
            if (r8 != 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r6 = 0
        L_0x007d:
            r6 = r6 | r7
            if (r6 == 0) goto L_0x008f
            com.google.android.apps.search.assistant.platform.j.b.a.a.ab r6 = r3.f337632b     // Catch:{ all -> 0x0111 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r6 = r6.mo105290b()     // Catch:{ all -> 0x0111 }
            if (r6 == 0) goto L_0x0089
            goto L_0x0095
        L_0x0089:
            com.google.android.libraries.search.assistant.invocation.b.g r10 = new com.google.android.libraries.search.assistant.invocation.b.g     // Catch:{ all -> 0x0111 }
            r10.<init>()     // Catch:{ all -> 0x0111 }
            throw r10     // Catch:{ all -> 0x0111 }
        L_0x008f:
            com.google.android.apps.search.assistant.platform.j.b.a.a.ab r6 = r3.f337632b     // Catch:{ all -> 0x0111 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r6 = r6.mo105289a(r10)     // Catch:{ all -> 0x0111 }
        L_0x0095:
            com.google.android.apps.search.assistant.platform.j.b.a.a.an r3 = r3.f337633c     // Catch:{ all -> 0x0111 }
            r1.f337691a = r10     // Catch:{ all -> 0x0111 }
            r1.f337692b = r11     // Catch:{ all -> 0x0111 }
            r1.f337693c = r6     // Catch:{ all -> 0x0111 }
            r1.f337696f = r4     // Catch:{ all -> 0x0111 }
            java.lang.Object r1 = r3.mo105293b(r6)     // Catch:{ all -> 0x0111 }
            if (r1 == r2) goto L_0x0110
            r1 = r10
            r2 = r11
            r10 = r6
        L_0x00a8:
            com.google.common.f.e r11 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121694aw.f337631a     // Catch:{ all -> 0x003a }
            com.google.common.f.x r11 = r11.mo56224b()     // Catch:{ all -> 0x003a }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ all -> 0x003a }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "INV.ResourceManager"
            r11.mo56378ag(r3, r4)     // Catch:{ all -> 0x003a }
            java.lang.String r3 = "Accessing %s for token(%s)"
            java.lang.Class<com.google.android.apps.search.assistant.platform.j.b.b.b.j> r4 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j.class
            int r6 = p5462h.p5473f.p5475b.C69649af.f186028a     // Catch:{ all -> 0x003a }
            h.f.b.g r6 = new h.f.b.g     // Catch:{ all -> 0x003a }
            r6.<init>(r4)     // Catch:{ all -> 0x003a }
            java.lang.String r4 = r6.mo61379b()     // Catch:{ all -> 0x003a }
            com.google.frameworks.client.a.a.b r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r1)     // Catch:{ all -> 0x003a }
            com.google.common.f.n r7 = new com.google.common.f.n     // Catch:{ all -> 0x003a }
            r8 = 35914(0x8c4a, float:5.0326E-41)
            r7.<init>(r8)     // Catch:{ all -> 0x003a }
            r11.mo56379ah(r7)     // Catch:{ all -> 0x003a }
            r11.mo56354G(r3, r4, r6)     // Catch:{ all -> 0x003a }
            kotlinx.coroutines.b.du r10 = r10.f337675e     // Catch:{ all -> 0x003a }
            java.lang.Object r10 = r10.mo62784e()     // Catch:{ all -> 0x003a }
            com.google.android.apps.search.assistant.platform.j.b.a.a.f r10 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121699f) r10     // Catch:{ all -> 0x003a }
            java.util.Map r10 = r10.f337651b     // Catch:{ all -> 0x003a }
            java.lang.Class<com.google.android.apps.search.assistant.platform.j.b.b.b.j> r11 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j.class
            h.f.b.g r3 = new h.f.b.g     // Catch:{ all -> 0x003a }
            r3.<init>(r11)     // Catch:{ all -> 0x003a }
            java.lang.Object r10 = r10.get(r3)     // Catch:{ all -> 0x003a }
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r10 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r10     // Catch:{ all -> 0x003a }
            if (r10 == 0) goto L_0x00f5
            r2.mo63026c(r5)
            return r10
        L_0x00f5:
            com.google.android.libraries.search.assistant.invocation.b.g r10 = new com.google.android.libraries.search.assistant.invocation.b.g     // Catch:{ all -> 0x003a }
            com.google.frameworks.client.a.a.b r11 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r1)     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r1.<init>(r0)     // Catch:{ all -> 0x003a }
            r1.append(r11)     // Catch:{ all -> 0x003a }
            java.lang.String r11 = ")"
            r1.append(r11)     // Catch:{ all -> 0x003a }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x003a }
            r10.<init>(r11)     // Catch:{ all -> 0x003a }
            throw r10     // Catch:{ all -> 0x003a }
        L_0x0110:
            return r2
        L_0x0111:
            r10 = move-exception
            r2 = r11
        L_0x0113:
            r2.mo63026c(r5)
            throw r10
        L_0x0117:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y.mo105321g(com.google.android.libraries.search.assistant.invocation.o.a.bp, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b A[Catch:{ all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c A[Catch:{ all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080 A[Catch:{ all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f A[Catch:{ all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f5 A[SYNTHETIC, Splitter:B:41:0x00f5] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0110 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105323i(com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            java.lang.String r0 = "Token("
            boolean r1 = r11 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121711r
            if (r1 == 0) goto L_0x0015
            r1 = r11
            com.google.android.apps.search.assistant.platform.j.b.a.a.r r1 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121711r) r1
            int r2 = r1.f337708f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f337708f = r2
            goto L_0x001a
        L_0x0015:
            com.google.android.apps.search.assistant.platform.j.b.a.a.r r1 = new com.google.android.apps.search.assistant.platform.j.b.a.a.r
            r1.<init>(r9, r11)
        L_0x001a:
            java.lang.Object r11 = r1.f337706d
            h.c.a.a r2 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r3 = r1.f337708f
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0057
            if (r3 == r6) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r10 = r1.f337705c
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r10 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121706m) r10
            java.lang.Object r2 = r1.f337704b
            kotlinx.coroutines.j.b r2 = (kotlinx.coroutines.p5584j.C71788b) r2
            java.lang.Object r1 = r1.f337703a
            com.google.android.libraries.search.assistant.invocation.o.a.bp r1 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r1
            p5462h.C69714l.m101134b(r11)     // Catch:{ all -> 0x003a }
            goto L_0x00a8
        L_0x003a:
            r10 = move-exception
            goto L_0x0113
        L_0x003d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0045:
            java.lang.Object r10 = r1.f337705c
            kotlinx.coroutines.j.b r10 = (kotlinx.coroutines.p5584j.C71788b) r10
            java.lang.Object r3 = r1.f337704b
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r3
            java.lang.Object r7 = r1.f337703a
            com.google.android.apps.search.assistant.platform.j.b.a.a.y r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y) r7
            p5462h.C69714l.m101134b(r11)
            r11 = r10
            r10 = r3
            goto L_0x006b
        L_0x0057:
            p5462h.C69714l.m101134b(r11)
            kotlinx.coroutines.j.b r11 = r9.f337751d
            r1.f337703a = r9
            r1.f337704b = r10
            r1.f337705c = r11
            r1.f337708f = r6
            java.lang.Object r3 = r11.mo63025b(r5, r1)
            if (r3 == r2) goto L_0x0117
            r7 = r9
        L_0x006b:
            com.google.android.apps.search.assistant.platform.j.b.a.a.aw r3 = r7.f337755h     // Catch:{ all -> 0x0111 }
            boolean r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2693a.C34708c.m63443b(r10)     // Catch:{ all -> 0x0111 }
            java.lang.String r8 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.C34705a.m63441b(r10)     // Catch:{ all -> 0x0111 }
            int r8 = r8.length()     // Catch:{ all -> 0x0111 }
            if (r8 != 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r6 = 0
        L_0x007d:
            r6 = r6 | r7
            if (r6 == 0) goto L_0x008f
            com.google.android.apps.search.assistant.platform.j.b.a.a.ab r6 = r3.f337632b     // Catch:{ all -> 0x0111 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r6 = r6.mo105290b()     // Catch:{ all -> 0x0111 }
            if (r6 == 0) goto L_0x0089
            goto L_0x0095
        L_0x0089:
            com.google.android.libraries.search.assistant.invocation.b.g r10 = new com.google.android.libraries.search.assistant.invocation.b.g     // Catch:{ all -> 0x0111 }
            r10.<init>()     // Catch:{ all -> 0x0111 }
            throw r10     // Catch:{ all -> 0x0111 }
        L_0x008f:
            com.google.android.apps.search.assistant.platform.j.b.a.a.ab r6 = r3.f337632b     // Catch:{ all -> 0x0111 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.m r6 = r6.mo105289a(r10)     // Catch:{ all -> 0x0111 }
        L_0x0095:
            com.google.android.apps.search.assistant.platform.j.b.a.a.an r3 = r3.f337633c     // Catch:{ all -> 0x0111 }
            r1.f337703a = r10     // Catch:{ all -> 0x0111 }
            r1.f337704b = r11     // Catch:{ all -> 0x0111 }
            r1.f337705c = r6     // Catch:{ all -> 0x0111 }
            r1.f337708f = r4     // Catch:{ all -> 0x0111 }
            java.lang.Object r1 = r3.mo105293b(r6)     // Catch:{ all -> 0x0111 }
            if (r1 == r2) goto L_0x0110
            r1 = r10
            r2 = r11
            r10 = r6
        L_0x00a8:
            com.google.common.f.e r11 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121694aw.f337631a     // Catch:{ all -> 0x003a }
            com.google.common.f.x r11 = r11.mo56224b()     // Catch:{ all -> 0x003a }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ all -> 0x003a }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "INV.ResourceManager"
            r11.mo56378ag(r3, r4)     // Catch:{ all -> 0x003a }
            java.lang.String r3 = "Accessing %s for token(%s)"
            java.lang.Class<com.google.android.libraries.search.assistant.invocation.f.b.d.e> r4 = com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d.C33753e.class
            int r6 = p5462h.p5473f.p5475b.C69649af.f186028a     // Catch:{ all -> 0x003a }
            h.f.b.g r6 = new h.f.b.g     // Catch:{ all -> 0x003a }
            r6.<init>(r4)     // Catch:{ all -> 0x003a }
            java.lang.String r4 = r6.mo61379b()     // Catch:{ all -> 0x003a }
            com.google.frameworks.client.a.a.b r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r1)     // Catch:{ all -> 0x003a }
            com.google.common.f.n r7 = new com.google.common.f.n     // Catch:{ all -> 0x003a }
            r8 = 35916(0x8c4c, float:5.0329E-41)
            r7.<init>(r8)     // Catch:{ all -> 0x003a }
            r11.mo56379ah(r7)     // Catch:{ all -> 0x003a }
            r11.mo56354G(r3, r4, r6)     // Catch:{ all -> 0x003a }
            kotlinx.coroutines.b.du r10 = r10.f337675e     // Catch:{ all -> 0x003a }
            java.lang.Object r10 = r10.mo62784e()     // Catch:{ all -> 0x003a }
            com.google.android.apps.search.assistant.platform.j.b.a.a.f r10 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121699f) r10     // Catch:{ all -> 0x003a }
            java.util.Map r10 = r10.f337651b     // Catch:{ all -> 0x003a }
            java.lang.Class<com.google.android.libraries.search.assistant.invocation.f.b.d.e> r11 = com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d.C33753e.class
            h.f.b.g r3 = new h.f.b.g     // Catch:{ all -> 0x003a }
            r3.<init>(r11)     // Catch:{ all -> 0x003a }
            java.lang.Object r10 = r10.get(r3)     // Catch:{ all -> 0x003a }
            com.google.android.libraries.search.assistant.invocation.f.b.d.e r10 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d.C33753e) r10     // Catch:{ all -> 0x003a }
            if (r10 == 0) goto L_0x00f5
            r2.mo63026c(r5)
            return r10
        L_0x00f5:
            com.google.android.libraries.search.assistant.invocation.b.g r10 = new com.google.android.libraries.search.assistant.invocation.b.g     // Catch:{ all -> 0x003a }
            com.google.frameworks.client.a.a.b r11 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r1)     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r1.<init>(r0)     // Catch:{ all -> 0x003a }
            r1.append(r11)     // Catch:{ all -> 0x003a }
            java.lang.String r11 = ")"
            r1.append(r11)     // Catch:{ all -> 0x003a }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x003a }
            r10.<init>(r11)     // Catch:{ all -> 0x003a }
            throw r10     // Catch:{ all -> 0x003a }
        L_0x0110:
            return r2
        L_0x0111:
            r10 = move-exception
            r2 = r11
        L_0x0113:
            r2.mo63026c(r5)
            throw r10
        L_0x0117:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y.mo105323i(com.google.android.libraries.search.assistant.invocation.o.a.bp, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.google.android.libraries.search.assistant.invocation.o.a.bp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.google.android.libraries.search.assistant.invocation.o.a.bp} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105318c(com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121713t
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.platform.j.b.a.a.t r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121713t) r0
            int r1 = r0.f337719f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337719f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.a.a.t r0 = new com.google.android.apps.search.assistant.platform.j.b.a.a.t
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f337717d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f337719f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r6 = r0.f337716c
            java.lang.Object r1 = r0.f337715b
            java.lang.Object r0 = r0.f337714a
            p5462h.C69714l.m101134b(r7)
            r7 = r6
            r6 = r1
            goto L_0x004c
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            p5462h.C69714l.m101134b(r7)
            kotlinx.coroutines.j.b r7 = r5.f337751d
            r0.f337714a = r5
            r0.f337715b = r6
            r0.f337716c = r7
            r0.f337719f = r3
            java.lang.Object r0 = r7.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x006e
            r0 = r5
        L_0x004c:
            com.google.android.apps.search.assistant.platform.j.b.a.a.y r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y) r0     // Catch:{ all -> 0x0069 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.ab r0 = r0.f337750c     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = "token"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r1)     // Catch:{ all -> 0x0069 }
            kotlinx.coroutines.b.cy r0 = r0.f337565a     // Catch:{ all -> 0x0069 }
            java.lang.Object r0 = r0.mo62784e()     // Catch:{ all -> 0x0069 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0069 }
            boolean r6 = r0.containsKey(r6)     // Catch:{ all -> 0x0069 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0069 }
            r7.mo63026c(r4)
            return r6
        L_0x0069:
            r6 = move-exception
            r7.mo63026c(r4)
            throw r6
        L_0x006e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y.mo105318c(com.google.android.libraries.search.assistant.invocation.o.a.bp, h.c.g):java.lang.Object");
    }
}
