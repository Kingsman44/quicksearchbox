package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a.C33497h;
import com.google.android.libraries.search.assistant.invocation.p2641k.C33914a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34704n;
import com.google.android.libraries.search.assistant.p2697j.C34755i;
import com.google.android.libraries.search.p3055n.C39251aa;
import com.google.android.libraries.search.p3055n.C39253ac;
import com.google.android.libraries.search.p3055n.p3061c.C39379a;
import com.google.android.libraries.search.p3055n.p3061c.C39646c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.p4582b.C60943b;
import com.google.common.util.concurrent.C60888db;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.p5574b.C71471ab;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71486aq;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71546cw;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71574dx;
import kotlinx.coroutines.p5574b.C71594u;
import kotlinx.coroutines.p5574b.C71598y;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.bg */
/* compiled from: PG */
public final class C34563bg {

    /* renamed from: a */
    public static final C59071e f91824a = C59071e.m91331h();

    /* renamed from: b */
    public static final Duration f91825b = C60943b.m93087c(5);

    /* renamed from: g */
    private static final Duration f91826g = C60943b.m93087c(10);

    /* renamed from: c */
    public final C69626l f91827c;

    /* renamed from: d */
    public final C71548cy f91828d;

    /* renamed from: e */
    public final C71548cy f91829e;

    /* renamed from: f */
    public final C34586d f91830f;

    /* renamed from: h */
    private final C39646c f91831h;

    /* renamed from: i */
    private final C21370a f91832i;

    /* renamed from: j */
    private final C60888db f91833j;

    /* renamed from: k */
    private final C71422aw f91834k;

    /* renamed from: l */
    private final C71643cp f91835l;

    /* renamed from: m */
    private final C33497h f91836m;

    public C34563bg(C33497h hVar, C69626l lVar, C39646c cVar, C34704n nVar, C34610f fVar, C34586d dVar, C21370a aVar, C60888db dbVar, C71422aw awVar) {
        C69664n.m101061g(nVar, "invocationSourceStateObserver");
        C69664n.m101061g(dVar, "debug");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(dbVar, "lightweightExecutor");
        C69664n.m101061g(awVar, "backgroundScope");
        this.f91836m = hVar;
        this.f91827c = lVar;
        this.f91831h = cVar;
        this.f91830f = dVar;
        this.f91832i = aVar;
        this.f91833j = dbVar;
        this.f91834k = awVar;
        C71548cy b = C71574dx.m104480b((Object) null);
        this.f91828d = b;
        C34525aa aaVar = (C34525aa) C34526ab.f91759c.createBuilder();
        C69664n.m101060f(aaVar, "newBuilder()");
        C34528ad a = C69664n.m101061g(aaVar, "builder");
        C39251aa aaVar2 = (C39251aa) C39253ac.f103396c.createBuilder();
        C69664n.m101060f(aaVar2, "newBuilder()");
        a.mo39384b(C69664n.m101061g(aaVar2, "builder").mo41749a());
        C71548cy b2 = C71574dx.m104480b(a.mo39383a());
        this.f91829e = b2;
        C71643cp d = C71594u.m104517d(C71477ah.m104295b(C71486aq.m104309c(C71536cm.m104384b(C71471ab.m104286a(C71598y.m104523c(new C34560bd(C71536cm.m104384b(fVar, new C34543as(this, (C69577g) null))))), new C34544at(this)), 10, new C34530af(new C34545au(this, (C69577g) null), (C69577g) null)), new C34546av(this, (C69577g) null)), awVar);
        this.f91835l = d;
        d.mo62873s(new C34529ae(nVar.mo39285a(C34043bf.ENTRYPOINT_HDM_HOTWORD, C71546cw.m104399a(b2, b, new C34547aw((C69577g) null)))));
    }

    /* renamed from: d */
    private final Object m63290d(String str, C69626l lVar, C69577g gVar) {
        return C71423ax.m104196a(new C34755i(this.f91832i, this.f91833j, f91826g, lVar, new C34562bf(str), (C69577g) null), gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39414b(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34549ay
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.search.assistant.invocation.o.i.a.ay r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34549ay) r0
            int r1 = r0.f91799d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91799d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.o.i.a.ay r0 = new com.google.android.libraries.search.assistant.invocation.o.i.a.ay
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f91797b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f91799d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0056
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0032:
            java.lang.Object r2 = r0.f91796a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0048
        L_0x0038:
            p5462h.C69714l.m101134b(r6)
            kotlinx.coroutines.cp r6 = r5.f91835l
            r0.f91796a = r5
            r0.f91799d = r4
            java.lang.Object r6 = kotlinx.coroutines.C71647ct.m104637a(r6, r0)
            if (r6 == r1) goto L_0x0059
            r2 = r5
        L_0x0048:
            r6 = 0
            r0.f91796a = r6
            r0.f91799d = r3
            com.google.android.libraries.search.assistant.invocation.o.i.a.bg r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34563bg) r2
            java.lang.Object r6 = r2.mo39415c(r0)
            if (r6 != r1) goto L_0x0056
            return r1
        L_0x0056:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0059:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34563bg.mo39414b(h.c.g):java.lang.Object");
    }

    public final String toString() {
        C39379a aVar = (C39379a) this.f91828d.mo62784e();
        String a = C33914a.m62566a(aVar);
        boolean z = aVar != null;
        return "(@" + a + ", running=" + z + ")";
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39415c(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34550az
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.search.assistant.invocation.o.i.a.az r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34550az) r0
            int r1 = r0.f91802c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91802c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.o.i.a.az r0 = new com.google.android.libraries.search.assistant.invocation.o.i.a.az
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f91800a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f91802c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r8)
            goto L_0x0079
        L_0x0027:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x002f:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.b.cy r8 = r7.f91828d
        L_0x0034:
            java.lang.Object r2 = r8.mo62784e()
            r4 = r2
            com.google.android.libraries.search.n.c.a r4 = (com.google.android.libraries.search.p3055n.p3061c.C39379a) r4
            r5 = 0
            boolean r2 = r8.mo62808g(r2, r5)
            if (r2 == 0) goto L_0x0034
            if (r4 != 0) goto L_0x004a
            r8 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L_0x004a:
            com.google.common.f.e r8 = f91824a
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "TRG.HotwordFrontend"
            r8.mo56378ag(r2, r6)
            com.google.common.f.n r2 = new com.google.common.f.n
            r6 = 51376(0xc8b0, float:7.1993E-41)
            r2.<init>(r6)
            r8.mo56379ah(r2)
            java.lang.String r2 = "Shutting down HDM frontend."
            r8.mo56386p(r2)
            com.google.android.libraries.search.assistant.invocation.o.i.a.ba r8 = new com.google.android.libraries.search.assistant.invocation.o.i.a.ba
            r8.<init>(r4, r5)
            r0.f91802c = r3
            java.lang.String r2 = "Frontend shutdown takes significant amount of time (%s)."
            java.lang.Object r8 = r7.m63290d(r2, r8, r0)
            if (r8 != r1) goto L_0x0079
            return r1
        L_0x0079:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34563bg.mo39415c(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.google.android.libraries.search.assistant.invocation.o.i.a.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: com.google.android.libraries.search.assistant.invocation.o.i.a.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39413a(com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34646m r31, p5462h.p5466c.C69577g r32) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            boolean r3 = r2 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34542ar
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.google.android.libraries.search.assistant.invocation.o.i.a.ar r3 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34542ar) r3
            int r4 = r3.f91783e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f91783e = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.libraries.search.assistant.invocation.o.i.a.ar r3 = new com.google.android.libraries.search.assistant.invocation.o.i.a.ar
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f91781c
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f91783e
            r6 = 2
            java.lang.String r7 = "TRG.HotwordFrontend"
            r8 = 1
            if (r5 == 0) goto L_0x0048
            if (r5 == r8) goto L_0x003f
            if (r5 != r6) goto L_0x0037
            java.lang.Object r1 = r3.f91780b
            java.lang.Object r3 = r3.f91779a
            p5462h.C69714l.m101134b(r2)
            goto L_0x0229
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003f:
            java.lang.Object r1 = r3.f91780b
            java.lang.Object r3 = r3.f91779a
            p5462h.C69714l.m101134b(r2)
            goto L_0x020f
        L_0x0048:
            p5462h.C69714l.m101134b(r2)
            com.google.android.libraries.search.assistant.invocation.o.i.a.d r2 = r0.f91830f
            com.google.android.libraries.search.assistant.invocation.o.i.a.al r5 = new com.google.android.libraries.search.assistant.invocation.o.i.a.al
            r5.<init>(r1)
            r2.mo39440a(r5)
            r2 = 0
            if (r1 == 0) goto L_0x0215
            r3.f91779a = r0
            r3.f91780b = r1
            r3.f91783e = r8
            kotlinx.coroutines.b.cy r5 = r0.f91828d
        L_0x0060:
            java.lang.Object r6 = r5.mo62784e()
            r9 = r6
            com.google.android.libraries.search.n.c.a r9 = (com.google.android.libraries.search.p3055n.p3061c.C39379a) r9
            if (r9 == 0) goto L_0x006c
            r10 = 0
            goto L_0x016e
        L_0x006c:
            com.google.android.libraries.search.n.c.c r9 = r0.f91831h
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.a.h r10 = r0.f91836m
            com.google.common.base.ax r12 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "<this>")
            com.google.android.libraries.search.assistant.invocation.o.i.a.ag r10 = new com.google.android.libraries.search.assistant.invocation.o.i.a.ag
            r13 = r10
            r10.<init>(r0)
            com.google.android.libraries.search.n.c.a.cu r10 = new com.google.android.libraries.search.n.c.a.cu
            r11 = r10
            com.google.android.libraries.search.n.c.a.cv r9 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.C39480cv) r9
            g.a.a r14 = r9.f103976a
            java.lang.Object r14 = r14.mo17428b()
            r15 = r14
            com.google.android.libraries.search.n.c.a.f.a.i r15 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39526i) r15
            r14 = r15
            r15.getClass()
            g.a.a r15 = r9.f103977b
            java.lang.Object r15 = r15.mo17428b()
            com.google.android.libraries.search.n.c.a.cw r15 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.C39481cw) r15
            r15.getClass()
            g.a.a r15 = r9.f103978c
            java.lang.Object r15 = r15.mo17428b()
            r16 = r15
            com.google.android.libraries.search.n.c.a.e.f r16 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39501f) r16
            r15 = r16
            r16.getClass()
            g.a.a r8 = r9.f103979d
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.libraries.search.n.c.a.d.h r8 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.p3066d.C39493h) r8
            r16 = r8
            r8.getClass()
            g.a.a r8 = r9.f103980e
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.libraries.search.n.c.a.aw r8 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.C39407aw) r8
            r17 = r8
            r8.getClass()
            g.a.a r8 = r9.f103981f
            java.lang.Object r8 = r8.mo17428b()
            java.util.concurrent.Executor r8 = (java.util.concurrent.Executor) r8
            r18 = r8
            r8.getClass()
            g.a.a r8 = r9.f103982g
            java.lang.Object r8 = r8.mo17428b()
            java.util.concurrent.ScheduledExecutorService r8 = (java.util.concurrent.ScheduledExecutorService) r8
            r19 = r8
            r8.getClass()
            g.a.a r8 = r9.f103983h
            java.lang.Object r8 = r8.mo17428b()
            android.content.Context r8 = (android.content.Context) r8
            r20 = r8
            r8.getClass()
            g.a.a r8 = r9.f103984i
            java.lang.Object r8 = r8.mo17428b()
            java.util.Map r8 = (java.util.Map) r8
            r21 = r8
            r8.getClass()
            g.a.a r8 = r9.f103985j
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.libraries.search.n.c.a.i.m r8 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.p3072i.C39621m) r8
            r22 = r8
            r8.getClass()
            g.a.a r8 = r9.f103986k
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.libraries.search.n.d.b r8 = (com.google.android.libraries.search.p3055n.p3074d.C39675b) r8
            r23 = r8
            r8.getClass()
            g.a.a r8 = r9.f103987l
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.libraries.search.n.c.a.aa r8 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.C39385aa) r8
            r24 = r8
            r8.getClass()
            g.a.a r8 = r9.f103988m
            java.lang.Object r8 = r8.mo17428b()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r8.getClass()
            boolean r25 = r8.booleanValue()
            g.a.a r8 = r9.f103989n
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.libraries.search.n.c.a.ac r8 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.C39387ac) r8
            r26 = r8
            r8.getClass()
            g.a.a r8 = r9.f103990o
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.libraries.search.n.c.a.a.c r8 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.p3063a.C39383c) r8
            r27 = r8
            r8.getClass()
            g.a.a r8 = r9.f103991p
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.libraries.search.n.c.a.g.d r8 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.p3070g.C39533d) r8
            r28 = r8
            r8.getClass()
            g.a.a r8 = r9.f103992q
            java.lang.Object r8 = r8.mo17428b()
            android.os.PowerManager r8 = (android.os.PowerManager) r8
            r29 = r8
            r8.getClass()
            g.a.a r8 = r9.f103993r
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.libraries.search.n.c.a.ay r8 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.C39409ay) r8
            r8.getClass()
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r9 = r10
            r10 = 1
        L_0x016e:
            boolean r6 = r5.mo62808g(r6, r9)
            if (r6 == 0) goto L_0x0212
            h.i r5 = new h.i
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r10)
            r5.<init>(r9, r6)
            java.lang.Object r6 = r5.f186052a
            com.google.android.libraries.search.n.c.a r6 = (com.google.android.libraries.search.p3055n.p3061c.C39379a) r6
            java.lang.Object r5 = r5.f186053b
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x01cc
            com.google.common.f.e r5 = f91824a
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r8, r7)
            java.lang.String r8 = com.google.android.libraries.search.assistant.invocation.p2641k.C33914a.m62566a(r31)
            com.google.common.f.n r9 = new com.google.common.f.n
            r10 = 51374(0xc8ae, float:7.199E-41)
            r9.<init>(r10)
            r5.mo56379ah(r9)
            java.lang.String r9 = "Initializing HDM frontend with configuration=@%s."
            r5.mo56389s(r9, r8)
            com.google.android.libraries.search.assistant.invocation.o.i.a.d r5 = r0.f91830f
            com.google.android.libraries.search.assistant.invocation.o.i.a.am r8 = new com.google.android.libraries.search.assistant.invocation.o.i.a.am
            r8.<init>(r1)
            r5.mo39440a(r8)
            com.google.android.libraries.search.assistant.invocation.o.i.a.ax r5 = new com.google.android.libraries.search.assistant.invocation.o.i.a.ax
            r5.<init>(r6, r1, r2)
            java.lang.String r2 = "Frontend initialize takes significant amount of time (%s)."
            java.lang.Object r2 = r0.m63290d(r2, r5, r3)
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r2 == r3) goto L_0x01c7
            h.q r2 = p5462h.C69788q.f186170a
        L_0x01c7:
            if (r2 == r3) goto L_0x020c
            h.q r2 = p5462h.C69788q.f186170a
            goto L_0x020c
        L_0x01cc:
            com.google.common.f.e r5 = f91824a
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r8, r7)
            java.lang.String r8 = com.google.android.libraries.search.assistant.invocation.p2641k.C33914a.m62566a(r31)
            com.google.common.f.n r9 = new com.google.common.f.n
            r10 = 51377(0xc8b1, float:7.1995E-41)
            r9.<init>(r10)
            r5.mo56379ah(r9)
            java.lang.String r9 = "Updating HDM frontend with configuration=@%s."
            r5.mo56389s(r9, r8)
            com.google.android.libraries.search.assistant.invocation.o.i.a.d r5 = r0.f91830f
            com.google.android.libraries.search.assistant.invocation.o.i.a.an r8 = new com.google.android.libraries.search.assistant.invocation.o.i.a.an
            r8.<init>(r1)
            r5.mo39440a(r8)
            com.google.android.libraries.search.assistant.invocation.o.i.a.be r5 = new com.google.android.libraries.search.assistant.invocation.o.i.a.be
            r5.<init>(r6, r1, r2)
            java.lang.String r2 = "Frontend update takes significant amount of time (%s)."
            java.lang.Object r2 = r0.m63290d(r2, r5, r3)
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r2 == r3) goto L_0x0208
            h.q r2 = p5462h.C69788q.f186170a
        L_0x0208:
            if (r2 == r3) goto L_0x020c
            h.q r2 = p5462h.C69788q.f186170a
        L_0x020c:
            if (r2 == r4) goto L_0x0211
            r3 = r0
        L_0x020f:
            r8 = 1
            goto L_0x022f
        L_0x0211:
            return r4
        L_0x0212:
            r8 = 1
            goto L_0x0060
        L_0x0215:
            com.google.android.libraries.search.assistant.invocation.o.i.a.d r5 = r0.f91830f
            com.google.android.libraries.search.assistant.invocation.o.i.a.ap r8 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34540ap.f91777a
            r5.mo39440a(r8)
            r3.f91779a = r0
            r3.f91780b = r2
            r3.f91783e = r6
            java.lang.Object r2 = r0.mo39415c(r3)
            if (r2 == r4) goto L_0x026f
            r3 = r0
        L_0x0229:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r8 = r2.booleanValue()
        L_0x022f:
            if (r8 == 0) goto L_0x024f
            com.google.common.f.e r2 = f91824a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r7)
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 51373(0xc8ad, float:7.1989E-41)
            r4.<init>(r5)
            r2.mo56379ah(r4)
            java.lang.String r4 = "Frontend=%s has been updated to configuration=%s."
            r2.mo56354G(r4, r3, r1)
            goto L_0x026c
        L_0x024f:
            com.google.common.f.e r2 = f91824a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r7)
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 51372(0xc8ac, float:7.1988E-41)
            r4.<init>(r5)
            r2.mo56379ah(r4)
            java.lang.String r4 = "Configuration=%s changed; frontend=%s is not running."
            r2.mo56354G(r4, r1, r3)
        L_0x026c:
            h.q r1 = p5462h.C69788q.f186170a
            return r1
        L_0x026f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34563bg.mo39413a(com.google.android.libraries.search.assistant.invocation.o.i.a.m, h.c.g):java.lang.Object");
    }
}
