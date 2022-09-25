package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32785ag;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32840ch;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32867m;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32870p;
import com.google.android.libraries.search.assistant.p2517f.p2532b.p2533a.C32914i;
import com.google.android.libraries.search.assistant.p2517f.p2532b.p2533a.C32916k;
import com.google.android.libraries.search.assistant.p2517f.p2532b.p2534b.C32920c;
import com.google.android.libraries.search.assistant.p2703l.C34790d;
import com.google.android.libraries.search.assistant.p2703l.C34793g;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.C59071e;
import com.google.common.p4543n.p4548e.p4549a.C59425c;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5574b.C71552db;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70888j;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.be */
/* compiled from: PG */
public final class C32636be extends C32867m implements C32916k {
    @Deprecated

    /* renamed from: a */
    public static final C59071e f87460a = C59071e.m91331h();

    /* renamed from: b */
    public final C71604be f87461b;

    /* renamed from: c */
    public final C32920c f87462c;

    /* renamed from: d */
    public final C32661cc f87463d = new C32661cc();

    /* renamed from: e */
    public final C32870p f87464e;

    /* renamed from: f */
    public final C69626l f87465f = new C59425c(new C32635bd(this, (C69577g) null));

    /* renamed from: g */
    public C71643cp f87466g;

    /* renamed from: h */
    public final C71816z f87467h;

    /* renamed from: i */
    private final C71422aw f87468i;

    /* renamed from: j */
    private final C32849cq f87469j;

    /* renamed from: k */
    private final C58889cz f87470k;

    /* renamed from: l */
    private final C32752fm f87471l;

    /* renamed from: m */
    private final AtomicLong f87472m = new AtomicLong(0);

    /* renamed from: n */
    private final Closeable f87473n;

    /* renamed from: o */
    private final C69626l f87474o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32636be(C69585o oVar, C34790d dVar, C71422aw awVar, C32849cq cqVar, C71604be beVar, C32914i iVar, C58889cz czVar, C32920c cVar, C32752fm fmVar) {
        super(oVar);
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(dVar, "dynamicServiceConnector");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(iVar, "contextDebugDataProvider");
        C69664n.m101061g(czVar, "ticker");
        C69664n.m101061g(cVar, "streamz");
        this.f87468i = awVar;
        this.f87469j = cqVar;
        this.f87461b = beVar;
        this.f87470k = czVar;
        this.f87462c = cVar;
        this.f87471l = fmVar;
        this.f87473n = iVar.mo38345d(this);
        this.f87474o = new C59425c(new C32634bc(this, (C69577g) null));
        this.f87467h = new C71816z();
        C34793g gVar = C32681cw.m60576a(cqVar).f88065a;
        gVar = gVar == null ? C34793g.f92320c : gVar;
        C69664n.m101060f(gVar, "sessionToken.parseInternals().sourceServiceAddress");
        try {
            C70888j a = dVar.mo39512a(gVar);
            C69664n.m101060f(a, "dynamicServiceConnector.connectTo(sourceAddress)");
            this.f87464e = new C32870p(a);
        } catch (Throwable th) {
            throw new IllegalStateException("open service init AccessSession disconnected", th);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bc A[Catch:{ all -> 0x00da }, LOOP:0: B:25:0x00b6->B:27:0x00bc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38189b(java.util.List r8, p5462h.p5466c.C69577g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32608ad
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.search.assistant.f.a.b.ad r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32608ad) r0
            int r1 = r0.f87336g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87336g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.f.a.b.ad r0 = new com.google.android.libraries.search.assistant.f.a.b.ad
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f87334e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87336g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0043
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r8 = r0.f87333d
            java.lang.Object r1 = r0.f87332c
            java.lang.Object r2 = r0.f87331b
            java.lang.Object r0 = r0.f87330a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0075
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            java.lang.Object r8 = r0.f87331b
            java.lang.Object r2 = r0.f87330a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0053
        L_0x0043:
            p5462h.C69714l.m101134b(r9)
            r0.f87330a = r7
            r0.f87331b = r8
            r0.f87336g = r4
            java.lang.Object r9 = r7.mo38195i(r8, r4, r0)
            if (r9 == r1) goto L_0x00df
            r2 = r7
        L_0x0053:
            r9 = r2
            com.google.android.libraries.search.assistant.f.a.b.be r9 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be) r9
            kotlinx.coroutines.cp r4 = r9.f87466g
            if (r4 == 0) goto L_0x005d
            r4.mo62723u(r5)
        L_0x005d:
            com.google.android.libraries.search.assistant.f.a.b.cc r9 = r9.f87463d
            kotlinx.coroutines.j.b r4 = r9.f87546a
            r0.f87330a = r2
            r0.f87331b = r8
            r0.f87332c = r9
            r0.f87333d = r4
            r0.f87336g = r3
            java.lang.Object r0 = r4.mo63025b(r5, r0)
            if (r0 == r1) goto L_0x00df
            r1 = r9
            r0 = r2
            r2 = r8
            r8 = r4
        L_0x0075:
            com.google.android.libraries.search.assistant.f.a.b.cc r1 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32661cc) r1     // Catch:{ all -> 0x00da }
            com.google.android.libraries.search.assistant.f.a.b.by r9 = r1.mo38222a()     // Catch:{ all -> 0x00da }
            com.google.common.f.e r1 = f87460a     // Catch:{ all -> 0x00da }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x00da }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00da }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00da }
            java.lang.String r4 = "Context.RootService"
            r1.mo56378ag(r3, r4)     // Catch:{ all -> 0x00da }
            java.lang.String r3 = "logger\n        .atInfo()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)     // Catch:{ all -> 0x00da }
            com.google.common.f.c r1 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32692dg.m60595a(r1, r2)     // Catch:{ all -> 0x00da }
            java.lang.String r2 = "Closing %d invalidation channels and canceling all fetches in static cache."
            java.util.List r3 = r9.f87532a     // Catch:{ all -> 0x00da }
            int r3 = r3.size()     // Catch:{ all -> 0x00da }
            com.google.common.f.n r4 = new com.google.common.f.n     // Catch:{ all -> 0x00da }
            r6 = 50578(0xc592, float:7.0875E-41)
            r4.<init>(r6)     // Catch:{ all -> 0x00da }
            r1.mo56379ah(r4)     // Catch:{ all -> 0x00da }
            r1.mo56387q(r2, r3)     // Catch:{ all -> 0x00da }
            com.google.android.libraries.search.assistant.f.a.b.bx r1 = r9.f87533b     // Catch:{ all -> 0x00da }
            com.google.android.libraries.search.assistant.f.a.b.bs r1 = r1.f87531b     // Catch:{ all -> 0x00da }
            r1.mo38217d()     // Catch:{ all -> 0x00da }
            java.util.List r1 = r9.f87532a     // Catch:{ all -> 0x00da }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00da }
        L_0x00b6:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00da }
            if (r2 == 0) goto L_0x00c8
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00da }
            com.google.android.libraries.search.assistant.f.a.b.bz r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32657bz) r2     // Catch:{ all -> 0x00da }
            kotlinx.coroutines.a.v r2 = r2.f87534a     // Catch:{ all -> 0x00da }
            r2.mo62727D(r5)     // Catch:{ all -> 0x00da }
            goto L_0x00b6
        L_0x00c8:
            java.util.List r9 = r9.f87532a     // Catch:{ all -> 0x00da }
            r9.clear()     // Catch:{ all -> 0x00da }
            r8.mo63026c(r5)
            com.google.android.libraries.search.assistant.f.a.b.be r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be) r0
            java.io.Closeable r8 = r0.f87473n
            r8.close()
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x00da:
            r9 = move-exception
            r8.mo63026c(r5)
            throw r9
        L_0x00df:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be.mo38189b(java.util.List, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00aa A[PHI: r10 
      PHI: (r10v2 java.lang.Object) = (r10v5 java.lang.Object), (r10v1 java.lang.Object) binds: [B:23:0x00a7, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38190c(p5462h.p5466c.C69577g r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32610af
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.libraries.search.assistant.f.a.b.af r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32610af) r0
            int r1 = r0.f87352f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87352f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.f.a.b.af r0 = new com.google.android.libraries.search.assistant.f.a.b.af
            r0.<init>(r9, r10)
        L_0x0018:
            r7 = r0
            java.lang.Object r10 = r7.f87350d
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f87352f
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0052
            if (r1 == r4) goto L_0x0046
            if (r1 == r3) goto L_0x0037
            if (r1 != r2) goto L_0x002f
            p5462h.C69714l.m101134b(r10)
            goto L_0x00aa
        L_0x002f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0037:
            java.lang.Object r1 = r7.f87349c
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r7.f87348b
            java.lang.Object r4 = r7.f87347a
            p5462h.C69714l.m101134b(r10)
            r8 = r3
            r3 = r1
            r1 = r8
            goto L_0x0089
        L_0x0046:
            java.lang.Object r1 = r7.f87349c
            com.google.android.libraries.search.assistant.f.a.b.dc r1 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32688dc) r1
            java.lang.Object r1 = r7.f87348b
            java.lang.Object r4 = r7.f87347a
            p5462h.C69714l.m101134b(r10)
            goto L_0x006d
        L_0x0052:
            p5462h.C69714l.m101134b(r10)
            com.google.android.libraries.search.assistant.f.a.b.bo r10 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32646bo.f87505a
            com.google.android.libraries.search.assistant.f.a.b.dc r1 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32691df.f87607a
            h.f.a.l r5 = r9.f87465f
            r7.f87347a = r9
            r7.f87348b = r10
            r7.f87349c = r1
            r7.f87352f = r4
            java.lang.Object r1 = r5.mo5761a(r7)
            if (r1 == r0) goto L_0x00ab
            r4 = r9
            r8 = r1
            r1 = r10
            r10 = r8
        L_0x006d:
            com.google.android.libraries.search.assistant.f.a.d.d r10 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d) r10
            java.util.List r5 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32691df.f87608b
            java.util.List r10 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32688dc.m60590c(r10, r5)
            r7.f87347a = r4
            r7.f87348b = r1
            r7.f87349c = r10
            r7.f87352f = r3
            r3 = r4
            com.google.android.libraries.search.assistant.f.a.b.be r3 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be) r3
            java.lang.Object r3 = r3.mo38194h(r7)
            if (r3 == r0) goto L_0x00ab
            r8 = r3
            r3 = r10
            r10 = r8
        L_0x0089:
            com.google.android.libraries.search.assistant.f.a.d.ch r10 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32840ch) r10
            r5 = r4
            com.google.android.libraries.search.assistant.f.a.b.be r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be) r5
            h.f.a.l r5 = r5.f87474o
            com.google.android.libraries.search.assistant.f.a.b.ag r6 = new com.google.android.libraries.search.assistant.f.a.b.ag
            r6.<init>(r4)
            r4 = 0
            r7.f87347a = r4
            r7.f87348b = r4
            r7.f87349c = r4
            r7.f87352f = r2
            com.google.android.libraries.search.assistant.f.a.b.bo r1 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32646bo) r1
            r4 = 0
            r2 = r3
            r3 = r10
            java.lang.Object r10 = r1.mo38204a(r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L_0x00aa
            return r0
        L_0x00aa:
            return r10
        L_0x00ab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be.mo38190c(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: java.lang.StringBuilder} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38184e(java.lang.String r13, p3186j$.time.Instant r14, p5462h.p5466c.C69577g r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32609ae
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.google.android.libraries.search.assistant.f.a.b.ae r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32609ae) r0
            int r1 = r0.f87346j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87346j = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.f.a.b.ae r0 = new com.google.android.libraries.search.assistant.f.a.b.ae
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f87344h
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87346j
            r3 = 2
            r4 = 1
            r5 = 10
            if (r2 == 0) goto L_0x0057
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r13 = r0.f87338b
            java.lang.StringBuilder r13 = (java.lang.StringBuilder) r13
            java.lang.Object r14 = r0.f87337a
            java.lang.StringBuilder r14 = (java.lang.StringBuilder) r14
            p5462h.C69714l.m101134b(r15)
            goto L_0x0109
        L_0x0035:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003d:
            java.lang.Object r13 = r0.f87343g
            java.lang.Object r14 = r0.f87342f
            java.lang.Object r2 = r0.f87341e
            java.lang.Object r4 = r0.f87340d
            java.lang.Object r6 = r0.f87339c
            java.lang.Object r7 = r0.f87338b
            j$.time.Instant r7 = (p3186j$.time.Instant) r7
            java.lang.Object r8 = r0.f87337a
            com.google.android.libraries.search.assistant.f.a.b.be r8 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be) r8
            p5462h.C69714l.m101134b(r15)
            r11 = r2
            r2 = r15
            r15 = r4
            r4 = r11
            goto L_0x0098
        L_0x0057:
            p5462h.C69714l.m101134b(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r2 = java.lang.String.valueOf(r13)
            java.lang.String r6 = "\t"
            java.lang.String r2 = r2.concat(r6)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r6 = "AccessSessionRootService:"
            java.lang.String r13 = r13.concat(r6)
            r15.append(r13)
            r15.append(r5)
            h.f.a.l r13 = r12.f87465f
            r0.f87337a = r12
            r0.f87338b = r14
            r0.f87339c = r15
            r0.f87340d = r15
            r0.f87341e = r2
            r0.f87342f = r2
            r0.f87343g = r15
            r0.f87346j = r4
            java.lang.Object r13 = r13.mo5761a(r0)
            if (r13 == r1) goto L_0x011c
            r8 = r12
            r7 = r14
            r6 = r15
            r14 = r2
            r4 = r14
            r2 = r13
            r13 = r6
        L_0x0098:
            com.google.android.libraries.search.assistant.f.a.d.d r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d) r2
            java.util.List r9 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32691df.f87608b
            java.util.List r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32688dc.m60590c(r2, r9)
            java.lang.String r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32691df.m60594a(r2)
            r9 = r13
            java.lang.StringBuilder r9 = (java.lang.StringBuilder) r9
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r14 = r14.concat(r2)
            r9.append(r14)
            java.lang.String r14 = "append(value)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)
            r9.append(r5)
            java.lang.String r2 = "append('\\n')"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r2)
            com.google.android.libraries.search.assistant.f.a.d.cq r13 = r8.f87469j
            java.util.List r9 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32691df.f87608b
            java.util.List r13 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32688dc.m60591d(r13, r9)
            java.lang.String r13 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32691df.m60594a(r13)
            r9 = r15
            java.lang.StringBuilder r9 = (java.lang.StringBuilder) r9
            java.lang.String r10 = java.lang.String.valueOf(r4)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r13 = r10.concat(r13)
            r9.append(r13)
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r14)
            r9.append(r5)
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r2)
            com.google.android.libraries.search.assistant.f.a.b.cc r13 = r8.f87463d
            r0.f87337a = r6
            r0.f87338b = r15
            r14 = 0
            r0.f87339c = r14
            r0.f87340d = r14
            r0.f87341e = r14
            r0.f87342f = r14
            r0.f87343g = r14
            r0.f87346j = r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r13 = r13.mo38184e(r4, r7, r0)
            if (r13 == r1) goto L_0x011c
            r14 = r6
            r11 = r15
            r15 = r13
            r13 = r11
        L_0x0109:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.StringBuilder r13 = (java.lang.StringBuilder) r13
            r13.append(r15)
            java.lang.StringBuilder r14 = (java.lang.StringBuilder) r14
            java.lang.String r13 = r14.toString()
            java.lang.String r14 = "StringBuilder().apply(builderAction).toString()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)
            return r13
        L_0x011c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be.mo38184e(java.lang.String, j$.time.Instant, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38194h(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32617am
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.libraries.search.assistant.f.a.b.am r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32617am) r0
            int r1 = r0.f87388g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87388g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.f.a.b.am r0 = new com.google.android.libraries.search.assistant.f.a.b.am
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f87386e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87388g
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r1 = r0.f87385d
            java.lang.Object r2 = r0.f87384c
            java.lang.Object r3 = r0.f87383b
            java.lang.Object r0 = r0.f87382a
            p5462h.C69714l.m101134b(r5)
            goto L_0x0062
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            p5462h.C69714l.m101134b(r5)
            com.google.android.libraries.search.assistant.f.a.d.ch r5 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32840ch.f88047e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.search.assistant.f.a.d.cg r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32839cg) r5
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            com.google.android.libraries.search.assistant.f.a.d.cj r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            h.f.a.l r2 = r4.f87465f
            r0.f87382a = r4
            r0.f87383b = r5
            r0.f87384c = r5
            r0.f87385d = r5
            r0.f87388g = r3
            java.lang.Object r0 = r2.mo5761a(r0)
            if (r0 == r1) goto L_0x0087
            r1 = r5
            r2 = r1
            r3 = r2
            r5 = r0
            r0 = r4
        L_0x0062:
            com.google.android.libraries.search.assistant.f.a.d.d r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d) r5
            com.google.android.libraries.search.assistant.f.a.d.cj r1 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32842cj) r1
            r1.mo38323b(r5)
            com.google.android.libraries.search.assistant.f.a.b.be r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be) r0
            java.util.concurrent.atomic.AtomicLong r5 = r0.f87472m
            long r0 = r5.incrementAndGet()
            com.google.android.libraries.search.assistant.f.a.d.cj r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32842cj) r2
            com.google.android.libraries.search.assistant.f.a.d.cg r5 = r2.f88053a
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.android.libraries.search.assistant.f.a.d.ch r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32840ch) r5
            com.google.android.libraries.search.assistant.f.a.d.ch r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32840ch.f88047e
            r5.f88052d = r0
            com.google.android.libraries.search.assistant.f.a.d.cj r3 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32842cj) r3
            com.google.android.libraries.search.assistant.f.a.d.ch r5 = r3.mo38322a()
            return r5
        L_0x0087:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be.mo38194h(h.c.g):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38195i(java.util.List r7, boolean r8, p5462h.p5466c.C69577g r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32620ap
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.search.assistant.f.a.b.ap r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32620ap) r0
            int r1 = r0.f87412h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87412h = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.f.a.b.ap r0 = new com.google.android.libraries.search.assistant.f.a.b.ap
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f87410f
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87412h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            boolean r8 = r0.f87409e
            java.lang.Object r7 = r0.f87408d
            java.lang.Object r1 = r0.f87407c
            java.lang.Object r2 = r0.f87406b
            java.lang.Object r0 = r0.f87405a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0058
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            p5462h.C69714l.m101134b(r9)
            com.google.android.libraries.search.assistant.f.a.b.cc r9 = r6.f87463d
            kotlinx.coroutines.j.b r2 = r9.f87546a
            r0.f87405a = r6
            r0.f87406b = r7
            r0.f87407c = r9
            r0.f87408d = r2
            r0.f87409e = r8
            r0.f87412h = r3
            java.lang.Object r0 = r2.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x0095
            r0 = r6
            r1 = r9
            r5 = r2
            r2 = r7
            r7 = r5
        L_0x0058:
            com.google.android.libraries.search.assistant.f.a.b.cc r1 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32661cc) r1     // Catch:{ all -> 0x0090 }
            com.google.android.libraries.search.assistant.f.a.b.by r9 = r1.mo38222a()     // Catch:{ all -> 0x0090 }
            com.google.android.libraries.search.assistant.f.a.b.bx r9 = r9.f87533b     // Catch:{ all -> 0x0090 }
            com.google.android.libraries.search.assistant.f.a.b.bs r9 = r9.f87531b     // Catch:{ all -> 0x0090 }
            com.google.android.libraries.search.assistant.f.a.b.bq r9 = r9.mo38215b()     // Catch:{ all -> 0x0090 }
            r7.mo63026c(r4)
            com.google.common.f.e$a r7 = com.google.common.p4526f.C59071e.f157037b
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.f.c r7 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32692dg.m60595a(r7, r2)
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 50586(0xc59a, float:7.0886E-41)
            r1.<init>(r2)
            r7.mo56379ah(r1)
            java.lang.String r1 = "Static cache size: %s"
            r7.mo56389s(r1, r9)
            com.google.android.libraries.search.assistant.f.a.b.be r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be) r0
            kotlinx.coroutines.z r7 = r0.f87467h
            com.google.android.libraries.search.assistant.f.a.b.aq r1 = new com.google.android.libraries.search.assistant.f.a.b.aq
            r1.<init>(r0, r9, r8)
            com.google.android.libraries.search.assistant.p2517f.p2532b.p2534b.C32922e.m60928a(r7, r1)
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x0090:
            r8 = move-exception
            r7.mo63026c(r4)
            throw r8
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be.mo38195i(java.util.List, boolean, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: com.google.android.libraries.search.assistant.f.a.b.fm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: java.util.List} */
    /* JADX WARNING: type inference failed for: r4v5, types: [h.c.g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0101 A[Catch:{ all -> 0x006f }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38196j(java.util.List r18, p5462h.p5466c.C69577g r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            boolean r2 = r0 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32632ba
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.google.android.libraries.search.assistant.f.a.b.ba r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32632ba) r2
            int r3 = r2.f87451i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f87451i = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.libraries.search.assistant.f.a.b.ba r2 = new com.google.android.libraries.search.assistant.f.a.b.ba
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f87449g
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f87451i
            java.lang.String r5 = "executor.schedule({}, du…), TimeUnit.MILLISECONDS)"
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L_0x0086
            if (r4 == r9) goto L_0x0072
            if (r4 == r8) goto L_0x005e
            if (r4 == r7) goto L_0x004e
            if (r4 != r6) goto L_0x0046
            java.lang.Object r4 = r2.f87447e
            java.lang.Object r9 = r2.f87446d
            java.lang.Object r10 = r2.f87445c
            java.lang.Object r11 = r2.f87444b
            java.lang.Object r12 = r2.f87443a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0082 }
            r0 = r10
            r10 = r9
            r9 = r4
            r4 = r11
            r11 = r12
            goto L_0x0133
        L_0x0046:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004e:
            java.lang.Object r4 = r2.f87447e
            java.lang.Object r9 = r2.f87446d
            java.lang.Object r10 = r2.f87445c
            java.lang.Object r11 = r2.f87444b
            java.lang.Object r12 = r2.f87443a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0082 }
            r13 = r12
            goto L_0x0105
        L_0x005e:
            java.lang.Object r4 = r2.f87448f
            java.lang.Object r9 = r2.f87447e
            java.lang.Object r10 = r2.f87446d
            java.lang.Object r11 = r2.f87445c
            java.lang.Object r12 = r2.f87444b
            java.lang.Object r13 = r2.f87443a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x006f }
            goto L_0x00e1
        L_0x006f:
            r0 = move-exception
            goto L_0x013c
        L_0x0072:
            java.lang.Object r4 = r2.f87447e
            java.lang.Object r9 = r2.f87446d
            java.lang.Object r10 = r2.f87445c
            java.lang.Object r11 = r2.f87444b
            java.lang.Object r12 = r2.f87443a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0082 }
            r0 = r11
            r11 = r12
            goto L_0x00bd
        L_0x0082:
            r0 = move-exception
            r13 = r12
            goto L_0x013c
        L_0x0086:
            p5462h.C69714l.m101134b(r0)
            com.google.android.libraries.search.assistant.f.a.b.fm r10 = r1.f87471l     // Catch:{ all -> 0x0138 }
            r11 = 24
            j$.time.Duration r0 = com.google.common.p4580v.p4582b.C60943b.m93085a(r11)     // Catch:{ all -> 0x0138 }
            j$.time.Duration r4 = com.google.common.p4580v.p4582b.C60943b.m93085a(r11)     // Catch:{ all -> 0x0138 }
            com.google.common.util.concurrent.db r11 = r10.f87884a     // Catch:{ all -> 0x0138 }
            com.google.android.libraries.search.assistant.f.a.b.fl r12 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32751fl.f87883a     // Catch:{ all -> 0x0138 }
            long r13 = r0.toMillis()     // Catch:{ all -> 0x0138 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0138 }
            com.google.common.util.concurrent.cz r0 = r11.mo29164d(r12, r13, r0)     // Catch:{ all -> 0x0138 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r5)     // Catch:{ all -> 0x0138 }
            r11 = r18
            r2.f87443a = r11     // Catch:{ all -> 0x0136 }
            r2.f87444b = r1     // Catch:{ all -> 0x0136 }
            r2.f87445c = r10     // Catch:{ all -> 0x0136 }
            r2.f87446d = r4     // Catch:{ all -> 0x0136 }
            r2.f87447e = r2     // Catch:{ all -> 0x0136 }
            r2.f87451i = r9     // Catch:{ all -> 0x0136 }
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r0, r2)     // Catch:{ all -> 0x0136 }
            if (r0 == r3) goto L_0x0135
            r0 = r1
            r9 = r4
            r4 = r2
        L_0x00bd:
            r16 = r4
            r4 = r0
            r0 = r10
            r10 = r9
            r9 = r16
        L_0x00c4:
            r12 = r4
            com.google.android.libraries.search.assistant.f.a.b.be r12 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be) r12     // Catch:{ all -> 0x0136 }
            h.f.a.l r12 = r12.f87465f     // Catch:{ all -> 0x0136 }
            r2.f87443a = r11     // Catch:{ all -> 0x0136 }
            r2.f87444b = r4     // Catch:{ all -> 0x0136 }
            r2.f87445c = r0     // Catch:{ all -> 0x0136 }
            r2.f87446d = r10     // Catch:{ all -> 0x0136 }
            r2.f87447e = r9     // Catch:{ all -> 0x0136 }
            r2.f87448f = r4     // Catch:{ all -> 0x0136 }
            r2.f87451i = r8     // Catch:{ all -> 0x0136 }
            java.lang.Object r12 = r12.mo5761a(r2)     // Catch:{ all -> 0x0136 }
            if (r12 == r3) goto L_0x0135
            r13 = r11
            r11 = r0
            r0 = r12
            r12 = r4
        L_0x00e1:
            com.google.android.libraries.search.assistant.f.a.d.d r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d) r0     // Catch:{ all -> 0x006f }
            java.util.List r14 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32691df.f87608b     // Catch:{ all -> 0x006f }
            java.util.List r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32688dc.m60590c(r0, r14)     // Catch:{ all -> 0x006f }
            r2.f87443a = r13     // Catch:{ all -> 0x006f }
            r2.f87444b = r12     // Catch:{ all -> 0x006f }
            r2.f87445c = r11     // Catch:{ all -> 0x006f }
            r2.f87446d = r10     // Catch:{ all -> 0x006f }
            r2.f87447e = r9     // Catch:{ all -> 0x006f }
            r14 = 0
            r2.f87448f = r14     // Catch:{ all -> 0x006f }
            r2.f87451i = r7     // Catch:{ all -> 0x006f }
            com.google.android.libraries.search.assistant.f.a.b.be r4 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be) r4     // Catch:{ all -> 0x006f }
            r14 = 0
            java.lang.Object r0 = r4.mo38195i(r0, r14, r2)     // Catch:{ all -> 0x006f }
            if (r0 == r3) goto L_0x0135
            r4 = r9
            r9 = r10
            r10 = r11
            r11 = r12
        L_0x0105:
            r0 = r10
            com.google.android.libraries.search.assistant.f.a.b.fm r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32752fm) r0     // Catch:{ all -> 0x006f }
            com.google.common.util.concurrent.db r0 = r0.f87884a     // Catch:{ all -> 0x006f }
            com.google.android.libraries.search.assistant.f.a.b.fl r12 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32751fl.f87883a     // Catch:{ all -> 0x006f }
            r14 = r9
            j$.time.Duration r14 = (p3186j$.time.Duration) r14     // Catch:{ all -> 0x006f }
            long r14 = r14.toMillis()     // Catch:{ all -> 0x006f }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x006f }
            com.google.common.util.concurrent.cz r0 = r0.mo29164d(r12, r14, r7)     // Catch:{ all -> 0x006f }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r5)     // Catch:{ all -> 0x006f }
            r2.f87443a = r13     // Catch:{ all -> 0x006f }
            r2.f87444b = r11     // Catch:{ all -> 0x006f }
            r2.f87445c = r10     // Catch:{ all -> 0x006f }
            r2.f87446d = r9     // Catch:{ all -> 0x006f }
            r2.f87447e = r4     // Catch:{ all -> 0x006f }
            r2.f87451i = r6     // Catch:{ all -> 0x006f }
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r0, r4)     // Catch:{ all -> 0x006f }
            if (r0 == r3) goto L_0x0135
            r0 = r10
            r10 = r9
            r9 = r4
            r4 = r11
            r11 = r13
        L_0x0133:
            r7 = 3
            goto L_0x00c4
        L_0x0135:
            return r3
        L_0x0136:
            r0 = move-exception
            goto L_0x013b
        L_0x0138:
            r0 = move-exception
            r11 = r18
        L_0x013b:
            r13 = r11
        L_0x013c:
            java.lang.Object r0 = p5462h.C69714l.m101133a(r0)
            java.lang.Throwable r2 = p5462h.C69702k.m101124a(r0)
            if (r2 == 0) goto L_0x0191
            boolean r3 = r2 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L_0x0163
            com.google.common.f.e$a r2 = com.google.common.p4526f.C59071e.f157037b
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.f.c r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32692dg.m60595a(r2, r13)
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 50588(0xc59c, float:7.0889E-41)
            r3.<init>(r4)
            r2.mo56379ah(r3)
            java.lang.String r3 = "Cache size logging stopped"
            r2.mo56386p(r3)
            goto L_0x0191
        L_0x0163:
            com.google.common.f.e r3 = f87460a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "Context.RootService"
            r3.mo56378ag(r4, r5)
            com.google.common.f.x r2 = r3.mo56382g(r2)
            java.lang.String r3 = "logger.atWarning().withCause(it)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.c r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32692dg.m60595a(r2, r13)
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 50587(0xc59b, float:7.0887E-41)
            r3.<init>(r4)
            r2.mo56379ah(r3)
            java.lang.String r3 = "Cache size logging failed"
            r2.mo56386p(r3)
        L_0x0191:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be.mo38196j(java.util.List, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057 A[PHI: r6 
      PHI: (r6v2 java.lang.Object) = (r6v5 java.lang.Object), (r6v1 java.lang.Object) binds: [B:17:0x0054, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38197k(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32633bb
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.search.assistant.f.a.b.bb r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32633bb) r0
            int r1 = r0.f87455d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87455d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.f.a.b.bb r0 = new com.google.android.libraries.search.assistant.f.a.b.bb
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f87453b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87455d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0057
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0032:
            java.lang.Object r2 = r0.f87452a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0047
        L_0x0038:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.search.assistant.f.a.d.p r2 = r5.f87464e
            r0.f87452a = r2
            r0.f87455d = r4
            java.lang.Object r6 = r5.mo38194h(r0)
            if (r6 == r1) goto L_0x0058
        L_0x0047:
            com.google.android.libraries.search.assistant.f.a.d.ch r6 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32840ch) r6
            r4 = 0
            r0.f87452a = r4
            r0.f87455d = r3
            com.google.android.libraries.search.assistant.f.a.d.p r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32870p) r2
            java.lang.Object r6 = r2.mo38328c(r6, new p5488io.grpc.C70334de(), r0)
            if (r6 != r1) goto L_0x0057
            return r1
        L_0x0057:
            return r6
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be.mo38197k(h.c.g):java.lang.Object");
    }

    /* renamed from: l */
    public final C71604be mo38198l(C32785ag agVar) {
        return C71803m.m105042c(this.f87468i, (C69585o) null, (C71424ay) null, new C32612ah(this, agVar, (C69577g) null), 3);
    }

    /* renamed from: m */
    public final C71587n mo38199m(C32840ch chVar) {
        C69664n.m101061g(chVar, "request");
        return new C71552db(new C32619ao(chVar, this, (C69577g) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38192f(com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32840ch r8, p5462h.p5466c.C69577g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32615ak
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.search.assistant.f.a.b.ak r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32615ak) r0
            int r1 = r0.f87375f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87375f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.f.a.b.ak r0 = new com.google.android.libraries.search.assistant.f.a.b.ak
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f87373d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87375f
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r8 = r0.f87372c
            java.lang.Object r1 = r0.f87371b
            java.lang.Object r0 = r0.f87370a
            p5462h.C69714l.m101134b(r9)     // Catch:{ all -> 0x002d }
            goto L_0x0059
        L_0x002d:
            r9 = move-exception
            goto L_0x0063
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            p5462h.C69714l.m101134b(r9)
            com.google.android.libraries.search.assistant.f.a.b.db r9 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32687db.f87602a
            java.util.List r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32691df.f87608b
            java.util.List r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32688dc.m60592e(r8, r2)
            com.google.protos.j.a.a.b.a.a.a.a.a.b r2 = com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5114a.p5115a.p5116a.C65570b.ERROR_UNKNOWN_CONSUMER_GET_SUPPORTED_KEYS
            h.f.a.l r4 = r7.f87474o     // Catch:{ all -> 0x005d }
            r0.f87370a = r9     // Catch:{ all -> 0x005d }
            r0.f87371b = r8     // Catch:{ all -> 0x005d }
            r0.f87372c = r2     // Catch:{ all -> 0x005d }
            r0.f87375f = r3     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r4.mo5761a(r0)     // Catch:{ all -> 0x005d }
            if (r0 == r1) goto L_0x005c
            r1 = r8
            r8 = r2
            r6 = r0
            r0 = r9
            r9 = r6
        L_0x0059:
            com.google.android.libraries.search.assistant.f.a.d.cw r9 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32855cw) r9     // Catch:{ all -> 0x002d }
            return r9
        L_0x005c:
            return r1
        L_0x005d:
            r0 = move-exception
            r1 = r8
            r8 = r2
            r6 = r0
            r0 = r9
            r9 = r6
        L_0x0063:
            com.google.android.libraries.search.assistant.f.a.b.db r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32687db) r0
            boolean r2 = r0.mo38251c(r9)
            java.lang.String r3 = "Context.Utils"
            if (r2 != 0) goto L_0x00fe
            boolean r2 = r9 instanceof p5488io.grpc.StatusException
            if (r2 == 0) goto L_0x0082
            r2 = r9
            io.grpc.StatusException r2 = (p5488io.grpc.StatusException) r2
            io.grpc.Status r2 = r2.f186943a
            io.grpc.Status$Code r2 = r2.getCode()
            io.grpc.Status r4 = p5488io.grpc.Status.f186916n
            io.grpc.Status$Code r4 = r4.getCode()
            if (r2 == r4) goto L_0x0124
        L_0x0082:
            java.util.Set r2 = com.google.android.libraries.search.assistant.p2517f.p2532b.C32925c.f88249a
            com.google.android.libraries.search.assistant.n.a r2 = com.google.android.libraries.search.assistant.p2517f.p2532b.C32925c.m60930a(r9)
            boolean r2 = com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d.m63596c(r2)
            if (r2 == 0) goto L_0x00d1
            com.google.common.f.e r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32687db.f87603b
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r3)
            java.lang.String r3 = "logger\n              .atSevere()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.common.f.c r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32692dg.m60595a(r2, r1)
            com.google.common.f.x r2 = r2.mo56382g(r9)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.aa r3 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101864b
            java.lang.Integer r4 = new java.lang.Integer
            r5 = 232510331(0xddbd37b, float:1.3547829E-30)
            r4.<init>(r5)
            r2.mo56378ag(r3, r4)
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 50584(0xc598, float:7.0883E-41)
            r3.<init>(r4)
            r2.mo56379ah(r3)
            java.lang.String r3 = "ContextAPI service call failed with a low quality error"
            r2.mo56386p(r3)
            if (r8 != 0) goto L_0x00ca
            goto L_0x0124
        L_0x00ca:
            com.google.protos.j.a.a.b.a.a.a.a.a.b r8 = (com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5114a.p5115a.p5116a.C65570b) r8
            com.google.android.libraries.search.assistant.f.a.b.ce r9 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32662cd.m60552d(r1, r8, r9)
            goto L_0x0124
        L_0x00d1:
            com.google.common.f.e r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32687db.f87603b
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r2, r3)
            java.lang.String r2 = "logger.atWarning()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)
            com.google.common.f.c r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32692dg.m60595a(r8, r1)
            com.google.common.f.x r8 = r8.mo56382g(r9)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 50583(0xc597, float:7.0882E-41)
            r1.<init>(r2)
            r8.mo56379ah(r1)
            java.lang.String r1 = "ContextAPI service call failed"
            r8.mo56386p(r1)
            goto L_0x0124
        L_0x00fe:
            com.google.common.f.e r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32687db.f87603b
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r2, r3)
            java.lang.String r2 = "logger.atInfo()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)
            com.google.common.f.c r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32692dg.m60595a(r8, r1)
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 50585(0xc599, float:7.0885E-41)
            r1.<init>(r2)
            r8.mo56379ah(r1)
            java.lang.String r1 = "exceptionsToGrpc: passing Cancellation"
            r8.mo56386p(r1)
        L_0x0124:
            java.lang.Throwable r8 = r0.mo38250b(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be.mo38192f(com.google.android.libraries.search.assistant.f.a.d.ch, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: com.google.protos.j.a.a.b.a.a.a.a.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: com.google.protos.j.a.a.b.a.a.a.a.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x029b A[Catch:{ all -> 0x031e }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02c9 A[Catch:{ all -> 0x031e }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0302 A[Catch:{ all -> 0x0317, all -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0308 A[Catch:{ all -> 0x0317, all -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x031d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x032a A[Catch:{ all -> 0x0336, all -> 0x033c }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0340 A[SYNTHETIC, Splitter:B:152:0x0340] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0154 A[Catch:{ all -> 0x0351 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a6 A[Catch:{ all -> 0x0345 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01dd A[Catch:{ all -> 0x0336, all -> 0x033c }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01e5 A[Catch:{ all -> 0x0336, all -> 0x033c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38191d(com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32785ag r18, p5462h.p5466c.C69577g r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            boolean r3 = r2 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32613ai
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.google.android.libraries.search.assistant.f.a.b.ai r3 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32613ai) r3
            int r4 = r3.f87367l
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f87367l = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.libraries.search.assistant.f.a.b.ai r3 = new com.google.android.libraries.search.assistant.f.a.b.ai
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f87365j
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f87367l
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            if (r5 == 0) goto L_0x010e
            if (r5 == r10) goto L_0x00e6
            if (r5 == r9) goto L_0x00bc
            if (r5 == r8) goto L_0x0089
            if (r5 == r7) goto L_0x0066
            if (r5 != r6) goto L_0x005e
            java.lang.Object r0 = r3.f87363h
            kotlinx.coroutines.j.b r0 = (kotlinx.coroutines.p5584j.C71788b) r0
            java.lang.Object r4 = r3.f87362g
            com.google.android.libraries.search.assistant.f.a.b.cc r4 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32661cc) r4
            java.lang.Object r5 = r3.f87361f
            com.google.android.libraries.search.assistant.f.a.d.bp r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32821bp) r5
            java.lang.Object r6 = r3.f87360e
            com.google.android.libraries.search.assistant.f.a.d.bp r6 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32821bp) r6
            java.lang.Object r7 = r3.f87359d
            com.google.protos.j.a.a.b.a.a.a.a.a.b r7 = (com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5114a.p5115a.p5116a.C65570b) r7
            java.lang.Object r8 = r3.f87358c
            com.google.android.libraries.search.assistant.f.a.b.db r8 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32687db) r8
            java.lang.Object r9 = r3.f87357b
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r3 = r3.f87356a
            com.google.android.libraries.search.assistant.f.a.d.ag r3 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32785ag) r3
            p5462h.C69714l.m101134b(r2)     // Catch:{ all -> 0x005b }
            r1 = r0
            goto L_0x02ec
        L_0x005b:
            r0 = move-exception
            goto L_0x0359
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0066:
            java.lang.Object r0 = r3.f87362g
            com.google.android.libraries.search.assistant.f.a.b.bk r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32642bk) r0
            java.lang.Object r5 = r3.f87361f
            com.google.common.base.ci r5 = (com.google.common.base.C58872ci) r5
            java.lang.Object r7 = r3.f87360e
            com.google.protos.j.a.a.b.a.a.a.a.a.b r7 = (com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5114a.p5115a.p5116a.C65570b) r7
            java.lang.Object r8 = r3.f87359d
            com.google.android.libraries.search.assistant.f.a.b.db r8 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32687db) r8
            java.lang.Object r9 = r3.f87358c
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r3.f87357b
            com.google.android.libraries.search.assistant.f.a.d.ag r10 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32785ag) r10
            java.lang.Object r12 = r3.f87356a
            com.google.android.libraries.search.assistant.f.a.b.be r12 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be) r12
            p5462h.C69714l.m101134b(r2)     // Catch:{ all -> 0x005b }
            r6 = r7
            r7 = r10
            goto L_0x0295
        L_0x0089:
            java.lang.Object r0 = r3.f87364i
            java.lang.Object r5 = r3.f87363h
            com.google.android.libraries.search.assistant.f.a.b.cc r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32661cc) r5
            java.lang.Object r12 = r3.f87362g
            com.google.common.base.ci r12 = (com.google.common.base.C58872ci) r12
            java.lang.Object r13 = r3.f87361f
            com.google.android.libraries.search.assistant.f.a.d.ar r13 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar) r13
            java.lang.Object r14 = r3.f87360e
            com.google.protos.j.a.a.b.a.a.a.a.a.b r14 = (com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5114a.p5115a.p5116a.C65570b) r14
            java.lang.Object r15 = r3.f87359d
            com.google.android.libraries.search.assistant.f.a.b.db r15 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32687db) r15
            java.lang.Object r6 = r3.f87358c
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r3.f87357b
            com.google.android.libraries.search.assistant.f.a.d.ag r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32785ag) r7
            java.lang.Object r11 = r3.f87356a
            com.google.android.libraries.search.assistant.f.a.b.be r11 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be) r11
            p5462h.C69714l.m101134b(r2)     // Catch:{ all -> 0x00b6 }
            r2 = r12
            r8 = r15
            r12 = r11
            r11 = r6
            r6 = r14
            r14 = r0
            goto L_0x01cf
        L_0x00b6:
            r0 = move-exception
            r9 = r6
            r7 = r14
            r8 = r15
            goto L_0x0359
        L_0x00bc:
            java.lang.Object r0 = r3.f87362g
            com.google.android.libraries.search.assistant.f.a.d.ar r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar) r0
            java.lang.Object r5 = r3.f87361f
            com.google.android.libraries.search.assistant.f.a.b.cu r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32679cu) r5
            java.lang.Object r5 = r3.f87360e
            r7 = r5
            com.google.protos.j.a.a.b.a.a.a.a.a.b r7 = (com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5114a.p5115a.p5116a.C65570b) r7
            java.lang.Object r5 = r3.f87359d
            com.google.android.libraries.search.assistant.f.a.b.db r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32687db) r5
            java.lang.Object r6 = r3.f87358c
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r11 = r3.f87357b
            com.google.android.libraries.search.assistant.f.a.d.ag r11 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32785ag) r11
            java.lang.Object r12 = r3.f87356a
            com.google.android.libraries.search.assistant.f.a.b.be r12 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be) r12
            p5462h.C69714l.m101134b(r2)     // Catch:{ all -> 0x0109 }
            r13 = r0
            r16 = r6
            r6 = r5
            r5 = r7
            r7 = r11
            r11 = r16
            goto L_0x019a
        L_0x00e6:
            java.lang.Object r0 = r3.f87361f
            com.google.android.libraries.search.assistant.f.a.d.d r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d) r0
            java.lang.Object r5 = r3.f87360e
            r7 = r5
            com.google.protos.j.a.a.b.a.a.a.a.a.b r7 = (com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5114a.p5115a.p5116a.C65570b) r7
            java.lang.Object r5 = r3.f87359d
            com.google.android.libraries.search.assistant.f.a.b.db r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32687db) r5
            java.lang.Object r6 = r3.f87358c
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r11 = r3.f87357b
            com.google.android.libraries.search.assistant.f.a.d.ag r11 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32785ag) r11
            java.lang.Object r12 = r3.f87356a
            com.google.android.libraries.search.assistant.f.a.b.be r12 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be) r12
            p5462h.C69714l.m101134b(r2)     // Catch:{ all -> 0x0109 }
            r16 = r6
            r6 = r0
            r0 = r11
            r11 = r16
            goto L_0x014e
        L_0x0109:
            r0 = move-exception
            r8 = r5
            r9 = r6
            goto L_0x0359
        L_0x010e:
            p5462h.C69714l.m101134b(r2)
            com.google.android.libraries.search.assistant.f.a.d.ch r2 = r0.f87959a
            if (r2 != 0) goto L_0x0117
            com.google.android.libraries.search.assistant.f.a.d.ch r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32840ch.f88047e
        L_0x0117:
            java.lang.String r5 = "request.requestId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            java.util.List r5 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32691df.f87608b
            java.util.List r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32688dc.m60592e(r2, r5)
            com.google.android.libraries.search.assistant.f.a.b.db r5 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32687db.f87602a
            com.google.protos.j.a.a.b.a.a.a.a.a.b r7 = com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5114a.p5115a.p5116a.C65570b.ERROR_UNKNOWN_CONSUMER_GET_CONTEXT
            com.google.android.libraries.search.assistant.f.a.d.ch r6 = r0.f87959a     // Catch:{ all -> 0x0356 }
            if (r6 != 0) goto L_0x012c
            com.google.android.libraries.search.assistant.f.a.d.ch r6 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32840ch.f88047e     // Catch:{ all -> 0x0356 }
        L_0x012c:
            com.google.android.libraries.search.assistant.f.a.d.d r6 = r6.f88050b     // Catch:{ all -> 0x0356 }
            if (r6 != 0) goto L_0x0132
            com.google.android.libraries.search.assistant.f.a.d.d r6 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d.f88081c     // Catch:{ all -> 0x0356 }
        L_0x0132:
            h.f.a.l r11 = r1.f87465f     // Catch:{ all -> 0x0356 }
            r3.f87356a = r1     // Catch:{ all -> 0x0356 }
            r3.f87357b = r0     // Catch:{ all -> 0x0356 }
            r3.f87358c = r2     // Catch:{ all -> 0x0356 }
            r3.f87359d = r5     // Catch:{ all -> 0x0356 }
            r3.f87360e = r7     // Catch:{ all -> 0x0356 }
            r3.f87361f = r6     // Catch:{ all -> 0x0356 }
            r3.f87367l = r10     // Catch:{ all -> 0x0356 }
            java.lang.Object r11 = r11.mo5761a(r3)     // Catch:{ all -> 0x0356 }
            if (r11 == r4) goto L_0x0355
            r12 = r1
            r16 = r11
            r11 = r2
            r2 = r16
        L_0x014e:
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r6, r2)     // Catch:{ all -> 0x0351 }
            if (r2 == 0) goto L_0x034a
            kotlinx.coroutines.cp r2 = r12.f87466g     // Catch:{ all -> 0x0351 }
            if (r2 == 0) goto L_0x0164
            boolean r2 = r2.mo62868mk()     // Catch:{ all -> 0x0351 }
            if (r2 == r10) goto L_0x015f
            goto L_0x0164
        L_0x015f:
            com.google.android.libraries.search.assistant.f.a.b.ce r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32662cd.m60549a(r11)     // Catch:{ all -> 0x0351 }
            throw r0     // Catch:{ all -> 0x0351 }
        L_0x0164:
            com.google.android.libraries.search.assistant.f.a.d.y r2 = r0.f87960b     // Catch:{ all -> 0x0351 }
            if (r2 != 0) goto L_0x016a
            com.google.android.libraries.search.assistant.f.a.d.y r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y.f88112f     // Catch:{ all -> 0x0351 }
        L_0x016a:
            com.google.android.libraries.search.assistant.f.a.d.be r2 = r2.f88115b     // Catch:{ all -> 0x0351 }
            if (r2 != 0) goto L_0x0170
            com.google.android.libraries.search.assistant.f.a.d.be r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be.f87993c     // Catch:{ all -> 0x0351 }
        L_0x0170:
            com.google.android.libraries.search.assistant.f.a.d.ar r2 = r2.f87996b     // Catch:{ all -> 0x0351 }
            if (r2 != 0) goto L_0x0176
            com.google.android.libraries.search.assistant.f.a.d.ar r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar.f87973c     // Catch:{ all -> 0x0351 }
        L_0x0176:
            java.lang.String r6 = "request.request.fetchContextRequest.contextKey"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r6)     // Catch:{ all -> 0x0351 }
            com.google.android.libraries.search.assistant.f.a.b.cu r6 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32680cv.f87585a     // Catch:{ all -> 0x0351 }
            h.f.a.l r13 = r12.f87474o     // Catch:{ all -> 0x0351 }
            r3.f87356a = r12     // Catch:{ all -> 0x0351 }
            r3.f87357b = r0     // Catch:{ all -> 0x0351 }
            r3.f87358c = r11     // Catch:{ all -> 0x0351 }
            r3.f87359d = r5     // Catch:{ all -> 0x0351 }
            r3.f87360e = r7     // Catch:{ all -> 0x0351 }
            r3.f87361f = r6     // Catch:{ all -> 0x0351 }
            r3.f87362g = r2     // Catch:{ all -> 0x0351 }
            r3.f87367l = r9     // Catch:{ all -> 0x0351 }
            java.lang.Object r6 = r13.mo5761a(r3)     // Catch:{ all -> 0x0351 }
            if (r6 == r4) goto L_0x0349
            r13 = r2
            r2 = r6
            r6 = r5
            r5 = r7
            r7 = r0
        L_0x019a:
            com.google.android.libraries.search.assistant.f.a.d.cw r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32855cw) r2     // Catch:{ all -> 0x0345 }
            com.google.android.libraries.search.assistant.f.a.b.cv r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32679cu.m60573a(r2)     // Catch:{ all -> 0x0345 }
            boolean r0 = r0.mo38241b(r13)     // Catch:{ all -> 0x0345 }
            if (r0 == 0) goto L_0x0340
            com.google.common.base.cz r0 = r12.f87470k     // Catch:{ all -> 0x0345 }
            com.google.common.base.ci r2 = new com.google.common.base.ci     // Catch:{ all -> 0x0345 }
            r2.<init>(r0)     // Catch:{ all -> 0x0345 }
            com.google.android.libraries.search.assistant.f.a.b.cc r0 = r12.f87463d     // Catch:{ all -> 0x0345 }
            kotlinx.coroutines.j.b r14 = r0.f87546a     // Catch:{ all -> 0x0345 }
            r3.f87356a = r12     // Catch:{ all -> 0x0345 }
            r3.f87357b = r7     // Catch:{ all -> 0x0345 }
            r3.f87358c = r11     // Catch:{ all -> 0x0345 }
            r3.f87359d = r6     // Catch:{ all -> 0x0345 }
            r3.f87360e = r5     // Catch:{ all -> 0x0345 }
            r3.f87361f = r13     // Catch:{ all -> 0x0345 }
            r3.f87362g = r2     // Catch:{ all -> 0x0345 }
            r3.f87363h = r0     // Catch:{ all -> 0x0345 }
            r3.f87364i = r14     // Catch:{ all -> 0x0345 }
            r3.f87367l = r8     // Catch:{ all -> 0x0345 }
            r15 = 0
            java.lang.Object r8 = r14.mo63025b(r15, r3)     // Catch:{ all -> 0x0345 }
            if (r8 == r4) goto L_0x033f
            r8 = r6
            r6 = r5
            r5 = r0
        L_0x01cf:
            com.google.android.libraries.search.assistant.f.a.b.by r0 = r5.mo38222a()     // Catch:{ all -> 0x0336 }
            com.google.android.libraries.search.assistant.f.a.b.bx r0 = r0.f87533b     // Catch:{ all -> 0x0336 }
            int r5 = r7.f87961c     // Catch:{ all -> 0x0336 }
            com.google.android.libraries.search.assistant.f.a.d.q r5 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q.m60836a(r5)     // Catch:{ all -> 0x0336 }
            if (r5 != 0) goto L_0x01df
            com.google.android.libraries.search.assistant.f.a.d.q r5 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q.UNRECOGNIZED     // Catch:{ all -> 0x0336 }
        L_0x01df:
            int r5 = r5.ordinal()     // Catch:{ all -> 0x0336 }
            if (r5 == 0) goto L_0x0322
            if (r5 == r10) goto L_0x0201
            if (r5 == r9) goto L_0x01f4
            r0 = 3
            if (r5 != r0) goto L_0x01ee
            goto L_0x0322
        L_0x01ee:
            h.g r0 = new h.g     // Catch:{ all -> 0x0336 }
            r0.<init>()     // Catch:{ all -> 0x0336 }
            throw r0     // Catch:{ all -> 0x0336 }
        L_0x01f4:
            kotlinx.coroutines.be r0 = r12.mo38198l(r7)     // Catch:{ all -> 0x0336 }
            com.google.android.libraries.search.assistant.f.a.b.bk r5 = new com.google.android.libraries.search.assistant.f.a.b.bk     // Catch:{ all -> 0x0336 }
            r9 = 0
            r5.<init>(r0, r9)     // Catch:{ all -> 0x0336 }
        L_0x01fe:
            r0 = r5
            r5 = 0
            goto L_0x0226
        L_0x0201:
            com.google.android.libraries.search.assistant.f.a.b.bs r0 = r0.f87531b     // Catch:{ all -> 0x0336 }
            com.google.android.libraries.search.assistant.f.a.d.y r5 = r7.f87960b     // Catch:{ all -> 0x0336 }
            if (r5 != 0) goto L_0x0209
            com.google.android.libraries.search.assistant.f.a.d.y r5 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y.f88112f     // Catch:{ all -> 0x0336 }
        L_0x0209:
            java.lang.String r9 = "request.request"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r9)     // Catch:{ all -> 0x0336 }
            com.google.android.libraries.search.assistant.f.a.b.aj r9 = new com.google.android.libraries.search.assistant.f.a.b.aj     // Catch:{ all -> 0x0336 }
            r9.<init>(r12, r7)     // Catch:{ all -> 0x0336 }
            r10 = 0
            com.google.android.libraries.search.assistant.f.a.b.bk r0 = r0.mo38214a(r5, r10, r9)     // Catch:{ all -> 0x0336 }
            com.google.android.libraries.search.assistant.f.a.b.bk r5 = new com.google.android.libraries.search.assistant.f.a.b.bk     // Catch:{ all -> 0x0336 }
            java.lang.Object r9 = r0.f87490a     // Catch:{ all -> 0x0336 }
            com.google.android.libraries.search.assistant.f.a.b.fn r9 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32753fn) r9     // Catch:{ all -> 0x0336 }
            kotlinx.coroutines.be r9 = r9.f87885a     // Catch:{ all -> 0x0336 }
            boolean r0 = r0.f87491b     // Catch:{ all -> 0x0336 }
            r5.<init>(r9, r0)     // Catch:{ all -> 0x0336 }
            goto L_0x01fe
        L_0x0226:
            r14.mo63026c(r5)     // Catch:{ all -> 0x033c }
            r2.mo56161f()     // Catch:{ all -> 0x033c }
            boolean r5 = r0.f87491b     // Catch:{ all -> 0x033c }
            if (r5 == 0) goto L_0x0272
            com.google.common.f.e r5 = f87460a     // Catch:{ all -> 0x033c }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ all -> 0x033c }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x033c }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x033c }
            java.lang.String r10 = "Context.RootService"
            r5.mo56378ag(r9, r10)     // Catch:{ all -> 0x033c }
            java.lang.String r9 = "logger\n                .atInfo()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r9)     // Catch:{ all -> 0x033c }
            com.google.common.f.c r5 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32692dg.m60595a(r5, r11)     // Catch:{ all -> 0x033c }
            java.lang.String r9 = "GetContext(%s, %s): Fetching from static cache (status: %s)"
            java.lang.String r10 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g.m60429b(r13)     // Catch:{ all -> 0x033c }
            int r13 = r7.f87961c     // Catch:{ all -> 0x033c }
            com.google.android.libraries.search.assistant.f.a.d.q r13 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q.m60836a(r13)     // Catch:{ all -> 0x033c }
            if (r13 != 0) goto L_0x0258
            com.google.android.libraries.search.assistant.f.a.d.q r13 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q.UNRECOGNIZED     // Catch:{ all -> 0x033c }
        L_0x0258:
            java.lang.String r13 = r13.name()     // Catch:{ all -> 0x033c }
            java.lang.Object r14 = r0.f87490a     // Catch:{ all -> 0x033c }
            kotlinx.coroutines.be r14 = (kotlinx.coroutines.C71604be) r14     // Catch:{ all -> 0x033c }
            java.lang.String r14 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32692dg.m60596b(r14)     // Catch:{ all -> 0x033c }
            com.google.common.f.n r15 = new com.google.common.f.n     // Catch:{ all -> 0x033c }
            r1 = 50582(0xc596, float:7.088E-41)
            r15.<init>(r1)     // Catch:{ all -> 0x033c }
            r5.mo56379ah(r15)     // Catch:{ all -> 0x033c }
            r5.mo56359L(r9, r10, r13, r14)     // Catch:{ all -> 0x033c }
        L_0x0272:
            java.lang.Object r1 = r0.f87490a     // Catch:{ all -> 0x033c }
            kotlinx.coroutines.be r1 = (kotlinx.coroutines.C71604be) r1     // Catch:{ all -> 0x033c }
            r3.f87356a = r12     // Catch:{ all -> 0x033c }
            r3.f87357b = r7     // Catch:{ all -> 0x033c }
            r3.f87358c = r11     // Catch:{ all -> 0x033c }
            r3.f87359d = r8     // Catch:{ all -> 0x033c }
            r3.f87360e = r6     // Catch:{ all -> 0x033c }
            r3.f87361f = r2     // Catch:{ all -> 0x033c }
            r3.f87362g = r0     // Catch:{ all -> 0x033c }
            r5 = 0
            r3.f87363h = r5     // Catch:{ all -> 0x033c }
            r3.f87364i = r5     // Catch:{ all -> 0x033c }
            r5 = 4
            r3.f87367l = r5     // Catch:{ all -> 0x033c }
            java.lang.Object r1 = r1.mo62825a(r3)     // Catch:{ all -> 0x033c }
            if (r1 == r4) goto L_0x0321
            r5 = r2
            r9 = r11
            r2 = r1
        L_0x0295:
            com.google.android.libraries.search.assistant.f.a.d.bp r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32821bp) r2     // Catch:{ all -> 0x031e }
            boolean r0 = r0.f87491b     // Catch:{ all -> 0x031e }
            if (r0 == 0) goto L_0x02c9
            com.google.protobuf.bn r0 = r2.toBuilder()     // Catch:{ all -> 0x031e }
            java.lang.String r1 = "this.toBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)     // Catch:{ all -> 0x031e }
            com.google.android.libraries.search.assistant.f.a.d.bn r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32819bn) r0     // Catch:{ all -> 0x031e }
            com.google.android.libraries.search.assistant.f.a.d.br r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")     // Catch:{ all -> 0x031e }
            com.google.android.libraries.search.assistant.f.a.d.bo r1 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32820bo.STATIC_CACHE     // Catch:{ all -> 0x031e }
            r0.mo38314c(r1)     // Catch:{ all -> 0x031e }
            long r1 = r5.mo56159b()     // Catch:{ all -> 0x031e }
            j$.time.Duration r1 = p3186j$.time.Duration.ofNanos(r1)     // Catch:{ all -> 0x031e }
            java.lang.String r2 = "fetchStopwatch.elapsed()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)     // Catch:{ all -> 0x031e }
            com.google.protobuf.ar r1 = com.google.protobuf.p4750c.p4751a.C62949a.m95466a(r1)     // Catch:{ all -> 0x031e }
            r0.mo38313b(r1)     // Catch:{ all -> 0x031e }
            com.google.android.libraries.search.assistant.f.a.d.bp r0 = r0.mo38312a()     // Catch:{ all -> 0x031e }
            r5 = r0
            goto L_0x02ca
        L_0x02c9:
            r5 = r2
        L_0x02ca:
            com.google.android.libraries.search.assistant.f.a.b.cc r0 = r12.f87463d     // Catch:{ all -> 0x031e }
            kotlinx.coroutines.j.b r1 = r0.f87546a     // Catch:{ all -> 0x031e }
            r3.f87356a = r7     // Catch:{ all -> 0x031e }
            r3.f87357b = r9     // Catch:{ all -> 0x031e }
            r3.f87358c = r8     // Catch:{ all -> 0x031e }
            r3.f87359d = r6     // Catch:{ all -> 0x031e }
            r3.f87360e = r5     // Catch:{ all -> 0x031e }
            r3.f87361f = r5     // Catch:{ all -> 0x031e }
            r3.f87362g = r0     // Catch:{ all -> 0x031e }
            r3.f87363h = r1     // Catch:{ all -> 0x031e }
            r2 = 5
            r3.f87367l = r2     // Catch:{ all -> 0x031e }
            r2 = 0
            java.lang.Object r3 = r1.mo63025b(r2, r3)     // Catch:{ all -> 0x031e }
            if (r3 == r4) goto L_0x031d
            r4 = r0
            r3 = r7
            r7 = r6
            r6 = r5
        L_0x02ec:
            com.google.android.libraries.search.assistant.f.a.b.by r0 = r4.mo38222a()     // Catch:{ all -> 0x0317 }
            com.google.android.libraries.search.assistant.f.a.b.bx r0 = r0.f87533b     // Catch:{ all -> 0x0317 }
            java.lang.String r2 = "request"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r2)     // Catch:{ all -> 0x0317 }
            java.lang.String r2 = "result"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r2)     // Catch:{ all -> 0x0317 }
            com.google.android.libraries.search.assistant.f.a.b.cf r0 = r0.f87530a     // Catch:{ all -> 0x0317 }
            com.google.android.libraries.search.assistant.f.a.d.y r2 = r3.f87960b     // Catch:{ all -> 0x0317 }
            if (r2 != 0) goto L_0x0304
            com.google.android.libraries.search.assistant.f.a.d.y r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y.f88112f     // Catch:{ all -> 0x0317 }
        L_0x0304:
            com.google.android.libraries.search.assistant.f.a.d.be r2 = r2.f88115b     // Catch:{ all -> 0x0317 }
            if (r2 != 0) goto L_0x030a
            com.google.android.libraries.search.assistant.f.a.d.be r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be.f87993c     // Catch:{ all -> 0x0317 }
        L_0x030a:
            java.lang.String r3 = "request.request.fetchContextRequest"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)     // Catch:{ all -> 0x0317 }
            r0.mo38223a(r2, r5)     // Catch:{ all -> 0x0317 }
            r2 = 0
            r1.mo63026c(r2)     // Catch:{ all -> 0x005b }
            return r6
        L_0x0317:
            r0 = move-exception
            r2 = 0
            r1.mo63026c(r2)     // Catch:{ all -> 0x005b }
            throw r0     // Catch:{ all -> 0x005b }
        L_0x031d:
            return r4
        L_0x031e:
            r0 = move-exception
            r7 = r6
            goto L_0x0359
        L_0x0321:
            return r4
        L_0x0322:
            int r0 = r7.f87961c     // Catch:{ all -> 0x0336 }
            com.google.android.libraries.search.assistant.f.a.d.q r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q.m60836a(r0)     // Catch:{ all -> 0x0336 }
            if (r0 != 0) goto L_0x032c
            com.google.android.libraries.search.assistant.f.a.d.q r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q.UNRECOGNIZED     // Catch:{ all -> 0x0336 }
        L_0x032c:
            java.lang.String r1 = "request.cachingStrategy"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)     // Catch:{ all -> 0x0336 }
            com.google.android.libraries.search.assistant.f.a.b.ce r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32662cd.m60551c(r11, r0)     // Catch:{ all -> 0x0336 }
            throw r0     // Catch:{ all -> 0x0336 }
        L_0x0336:
            r0 = move-exception
            r1 = 0
            r14.mo63026c(r1)     // Catch:{ all -> 0x033c }
            throw r0     // Catch:{ all -> 0x033c }
        L_0x033c:
            r0 = move-exception
            r7 = r6
            goto L_0x0353
        L_0x033f:
            return r4
        L_0x0340:
            com.google.android.libraries.search.assistant.f.a.b.ce r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32662cd.m60554f(r11, r13)     // Catch:{ all -> 0x0345 }
            throw r0     // Catch:{ all -> 0x0345 }
        L_0x0345:
            r0 = move-exception
            r7 = r5
            r8 = r6
            goto L_0x0353
        L_0x0349:
            return r4
        L_0x034a:
            java.lang.String r0 = "Request AccessSessionKey did not match (in getContext)"
            com.google.android.libraries.search.assistant.f.a.b.ce r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32662cd.m60550b(r11, r0)     // Catch:{ all -> 0x0351 }
            throw r0     // Catch:{ all -> 0x0351 }
        L_0x0351:
            r0 = move-exception
            r8 = r5
        L_0x0353:
            r9 = r11
            goto L_0x0359
        L_0x0355:
            return r4
        L_0x0356:
            r0 = move-exception
            r9 = r2
            r8 = r5
        L_0x0359:
            boolean r1 = r8.mo38251c(r0)
            java.lang.String r2 = "Context.Utils"
            if (r1 != 0) goto L_0x03ef
            boolean r1 = r0 instanceof p5488io.grpc.StatusException
            if (r1 == 0) goto L_0x0376
            r1 = r0
            io.grpc.StatusException r1 = (p5488io.grpc.StatusException) r1
            io.grpc.Status r1 = r1.f186943a
            io.grpc.Status$Code r1 = r1.getCode()
            io.grpc.Status r3 = p5488io.grpc.Status.f186916n
            io.grpc.Status$Code r3 = r3.getCode()
            if (r1 == r3) goto L_0x0415
        L_0x0376:
            java.util.Set r1 = com.google.android.libraries.search.assistant.p2517f.p2532b.C32925c.f88249a
            com.google.android.libraries.search.assistant.n.a r1 = com.google.android.libraries.search.assistant.p2517f.p2532b.C32925c.m60930a(r0)
            boolean r1 = com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d.m63596c(r1)
            if (r1 == 0) goto L_0x03c2
            com.google.common.f.e r1 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32687db.f87603b
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            java.lang.String r2 = "logger\n              .atSevere()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.common.f.c r1 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32692dg.m60595a(r1, r9)
            com.google.common.f.x r1 = r1.mo56382g(r0)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.aa r2 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101864b
            java.lang.Integer r3 = new java.lang.Integer
            r4 = 232510331(0xddbd37b, float:1.3547829E-30)
            r3.<init>(r4)
            r1.mo56378ag(r2, r3)
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 50580(0xc594, float:7.0878E-41)
            r2.<init>(r3)
            r1.mo56379ah(r2)
            java.lang.String r2 = "ContextAPI service call failed with a low quality error"
            r1.mo56386p(r2)
            if (r7 == 0) goto L_0x0415
            com.google.android.libraries.search.assistant.f.a.b.ce r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32662cd.m60552d(r9, r7, r0)
            goto L_0x0415
        L_0x03c2:
            com.google.common.f.e r1 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32687db.f87603b
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            java.lang.String r2 = "logger.atWarning()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.common.f.c r1 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32692dg.m60595a(r1, r9)
            com.google.common.f.x r1 = r1.mo56382g(r0)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 50579(0xc593, float:7.0876E-41)
            r2.<init>(r3)
            r1.mo56379ah(r2)
            java.lang.String r2 = "ContextAPI service call failed"
            r1.mo56386p(r2)
            goto L_0x0415
        L_0x03ef:
            com.google.common.f.e r1 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32687db.f87603b
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            java.lang.String r2 = "logger.atInfo()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.common.f.c r1 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32692dg.m60595a(r1, r9)
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 50581(0xc595, float:7.0879E-41)
            r2.<init>(r3)
            r1.mo56379ah(r2)
            java.lang.String r2 = "exceptionsToGrpc: passing Cancellation"
            r1.mo56386p(r2)
        L_0x0415:
            java.lang.Throwable r0 = r8.mo38250b(r0)
            goto L_0x041b
        L_0x041a:
            throw r0
        L_0x041b:
            goto L_0x041a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be.mo38191d(com.google.android.libraries.search.assistant.f.a.d.ag, h.c.g):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38193g(com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar r8, p5462h.p5466c.C69577g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32616al
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.search.assistant.f.a.b.al r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32616al) r0
            int r1 = r0.f87381f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87381f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.f.a.b.al r0 = new com.google.android.libraries.search.assistant.f.a.b.al
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f87379d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87381f
            java.lang.String r3 = "newBuilder()"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x003d
            if (r2 != r4) goto L_0x0035
            java.lang.Object r8 = r0.f87377b
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r2 = r0.f87376a
            com.google.android.libraries.search.assistant.f.a.d.bt r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32825bt) r2
            p5462h.C69714l.m101134b(r9)
            goto L_0x008b
        L_0x0035:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003d:
            java.lang.Object r8 = r0.f87378c
            java.lang.Object r2 = r0.f87377b
            com.google.android.libraries.search.assistant.f.a.b.cc r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32661cc) r2
            java.lang.Object r5 = r0.f87376a
            com.google.android.libraries.search.assistant.f.a.d.ar r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar) r5
            p5462h.C69714l.m101134b(r9)
            goto L_0x0062
        L_0x004b:
            p5462h.C69714l.m101134b(r9)
            com.google.android.libraries.search.assistant.f.a.b.cc r2 = r7.f87463d
            kotlinx.coroutines.j.b r9 = r2.f87546a
            r0.f87376a = r8
            r0.f87377b = r2
            r0.f87378c = r9
            r0.f87381f = r5
            java.lang.Object r5 = r9.mo63025b(r6, r0)
            if (r5 == r1) goto L_0x00c4
            r5 = r8
            r8 = r9
        L_0x0062:
            com.google.android.libraries.search.assistant.f.a.b.by r9 = r2.mo38222a()     // Catch:{ all -> 0x00bf }
            java.util.List r9 = r9.f87532a     // Catch:{ all -> 0x00bf }
            java.util.List r9 = p5462h.p5463a.C69540x.m100840V(r9)     // Catch:{ all -> 0x00bf }
            r8.mo63026c(r6)
            com.google.android.libraries.search.assistant.f.a.d.bt r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32825bt.f88021b
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.search.assistant.f.a.d.bs r8 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32824bs) r8
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r3)
            com.google.android.libraries.search.assistant.f.a.d.bv r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")
            r8.mo38316b(r5)
            com.google.android.libraries.search.assistant.f.a.d.bt r8 = r8.mo38315a()
            java.util.Iterator r9 = r9.iterator()
            r2 = r8
            r8 = r9
        L_0x008b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00ab
            java.lang.Object r9 = r8.next()
            com.google.android.libraries.search.assistant.f.a.b.bz r9 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32657bz) r9
            com.google.android.libraries.search.assistant.f.a.b.db r5 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32687db.f87602a
            kotlinx.coroutines.a.v r9 = r9.f87534a
            r0.f87376a = r2
            r0.f87377b = r8
            r0.f87378c = r6
            r0.f87381f = r4
            java.lang.Object r9 = r5.mo38249a(r9, r2, r0)
            if (r9 == r1) goto L_0x00aa
            goto L_0x008b
        L_0x00aa:
            return r1
        L_0x00ab:
            com.google.protobuf.at r8 = com.google.protobuf.C62912at.f169862a
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.protobuf.as r8 = (com.google.protobuf.C62911as) r8
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r3)
            com.google.protobuf.av r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")
            com.google.protobuf.at r8 = r8.mo58809a()
            return r8
        L_0x00bf:
            r9 = move-exception
            r8.mo63026c(r6)
            throw r9
        L_0x00c4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32636be.mo38193g(com.google.android.libraries.search.assistant.f.a.d.ar, h.c.g):java.lang.Object");
    }
}
