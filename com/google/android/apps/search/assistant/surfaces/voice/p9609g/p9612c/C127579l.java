package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c;

import com.google.android.apps.gsa.binaries.satin.app.ans;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127538b;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127546j;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127547k;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127553q;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127558v;
import com.google.android.libraries.search.assistant.invocation.p2636j.p2637a.C33891b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.c.l */
/* compiled from: PG */
public final class C127579l extends C127558v {

    /* renamed from: a */
    public static final C59071e f351260a = C59071e.m91331h();

    /* renamed from: b */
    public final C71422aw f351261b;

    /* renamed from: c */
    public final C127553q f351262c;

    /* renamed from: d */
    public final C71788b f351263d = new C71799m();

    /* renamed from: e */
    public final Map f351264e = new HashMap();

    /* renamed from: f */
    public boolean f351265f;

    /* renamed from: g */
    private final C71422aw f351266g;

    /* renamed from: h */
    private final Set f351267h = new LinkedHashSet();

    /* renamed from: i */
    private C71643cp f351268i;

    /* renamed from: j */
    private final ans f351269j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127579l(C71422aw awVar, C71422aw awVar2, ans ans, C69585o oVar, C127553q qVar) {
        super(oVar);
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(awVar2, "backgroundScope");
        C69664n.m101061g(ans, "invocationLifecycleApiFactory");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(qVar, "resourceCleanupSearchMonitoringConnection");
        this.f351261b = awVar;
        this.f351266g = awVar2;
        this.f351269j = ans;
        this.f351262c = qVar;
    }

    /* renamed from: i */
    private final C60870cx m208574i(C34053bp bpVar, C127546j jVar) {
        C59052c cVar = (C59052c) f351260a.mo56224b();
        C61301b a = C34711b.m63445a(bpVar);
        cVar.mo56379ah(new C59094n(37493));
        cVar.mo56389s("Removing invocation %s", a);
        if (jVar == C127546j.EXECUTED) {
            return this.f351269j.mo66629a(bpVar).mo39119a(C33891b.EXECUTED);
        }
        return this.f351269j.mo66629a(bpVar).mo39119a(C33891b.CANCELED);
    }

    /* renamed from: j */
    private final void m208575j() {
        try {
            C71643cp cpVar = this.f351268i;
            if (cpVar != null) {
                cpVar.mo62723u((CancellationException) null);
            }
        } catch (Throwable th) {
            C59052c cVar = (C59052c) ((C59052c) f351260a.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(37501));
            cVar.mo56386p("Cancelling job failed");
        } finally {
            this.f351268i = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a A[Catch:{ all -> 0x008b, all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108137d(p5462h.p5466c.C69577g r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127571d
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.surfaces.voice.g.c.d r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127571d) r0
            int r1 = r0.f351230e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f351230e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.g.c.d r0 = new com.google.android.apps.search.assistant.surfaces.voice.g.c.d
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f351228c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f351230e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r1 = r0.f351227b
            java.lang.Object r0 = r0.f351226a
            p5462h.C69714l.m101134b(r10)
            goto L_0x0047
        L_0x002c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0034:
            p5462h.C69714l.m101134b(r10)
            kotlinx.coroutines.j.b r10 = r9.f351263d
            r0.f351226a = r9
            r0.f351227b = r10
            r0.f351230e = r3
            java.lang.Object r0 = r10.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x00cb
            r0 = r9
            r1 = r10
        L_0x0047:
            r10 = r0
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r10 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r10     // Catch:{ all -> 0x00c6 }
            java.util.Map r10 = r10.f351264e     // Catch:{ all -> 0x00c6 }
            java.util.Set r10 = r10.entrySet()     // Catch:{ all -> 0x00c6 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x00c6 }
        L_0x0054:
            boolean r2 = r10.hasNext()     // Catch:{ all -> 0x00c6 }
            if (r2 == 0) goto L_0x00ab
            java.lang.Object r2 = r10.next()     // Catch:{ all -> 0x00c6 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00c6 }
            com.google.common.f.e r3 = f351260a     // Catch:{ all -> 0x00c6 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x00c6 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = "Closing Invocation %s"
            java.lang.Object r6 = r2.getKey()     // Catch:{ all -> 0x00c6 }
            com.google.common.f.n r7 = new com.google.common.f.n     // Catch:{ all -> 0x00c6 }
            r8 = 37495(0x9277, float:5.2542E-41)
            r7.<init>(r8)     // Catch:{ all -> 0x00c6 }
            r3.mo56379ah(r7)     // Catch:{ all -> 0x00c6 }
            r3.mo56389s(r5, r6)     // Catch:{ all -> 0x00c6 }
            java.lang.Object r2 = r2.getKey()     // Catch:{ all -> 0x008b }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r2     // Catch:{ all -> 0x008b }
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a.j r3 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127546j.CANCELLED     // Catch:{ all -> 0x008b }
            r5 = r0
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r5 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r5     // Catch:{ all -> 0x008b }
            r5.m208574i(r2, r3)     // Catch:{ all -> 0x008b }
            goto L_0x0054
        L_0x008b:
            r2 = move-exception
            com.google.common.f.e r3 = f351260a     // Catch:{ all -> 0x00c6 }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ all -> 0x00c6 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00c6 }
            com.google.common.f.x r2 = r3.mo56382g(r2)     // Catch:{ all -> 0x00c6 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00c6 }
            java.lang.String r3 = "Resource cleanup failed"
            com.google.common.f.n r5 = new com.google.common.f.n     // Catch:{ all -> 0x00c6 }
            r6 = 37496(0x9278, float:5.2543E-41)
            r5.<init>(r6)     // Catch:{ all -> 0x00c6 }
            r2.mo56379ah(r5)     // Catch:{ all -> 0x00c6 }
            r2.mo56386p(r3)     // Catch:{ all -> 0x00c6 }
            goto L_0x0054
        L_0x00ab:
            r10 = r0
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r10 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r10     // Catch:{ all -> 0x00c6 }
            java.util.Map r10 = r10.f351264e     // Catch:{ all -> 0x00c6 }
            r10.clear()     // Catch:{ all -> 0x00c6 }
            r10 = r0
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r10 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r10     // Catch:{ all -> 0x00c6 }
            java.util.Set r10 = r10.f351267h     // Catch:{ all -> 0x00c6 }
            r10.clear()     // Catch:{ all -> 0x00c6 }
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r0     // Catch:{ all -> 0x00c6 }
            r0.m208575j()     // Catch:{ all -> 0x00c6 }
            r1.mo63026c(r4)
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        L_0x00c6:
            r10 = move-exception
            r1.mo63026c(r4)
            throw r10
        L_0x00cb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l.mo108137d(h.c.g):java.lang.Object");
    }

    /* renamed from: e */
    public final Object mo108134e(C127538b bVar, C69577g gVar) {
        C127547k kVar = bVar.f351183a;
        if (kVar == null) {
            kVar = C127547k.f351196c;
        }
        C127546j a = C127546j.m208522a(kVar.f351199b);
        if (a == null) {
            a = C127546j.UNRECOGNIZED;
        }
        if (a != C127546j.UNSPECIFIED) {
            C127547k kVar2 = bVar.f351183a;
            if (kVar2 == null) {
                kVar2 = C127547k.f351196c;
            }
            C69664n.m101060f(kVar2, "request.invocationClosure");
            return mo108135b(kVar2, gVar);
        }
        throw new IllegalArgumentException("EndState must not be UNSPECIFIED");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108139g(com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127573f
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.surfaces.voice.g.c.f r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127573f) r0
            int r1 = r0.f351241e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f351241e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.g.c.f r0 = new com.google.android.apps.search.assistant.surfaces.voice.g.c.f
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f351239c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f351241e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r7 = r0.f351238b
            java.lang.Object r0 = r0.f351237a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0062
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            p5462h.C69714l.m101134b(r8)
            com.google.common.f.e r8 = f351260a
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.frameworks.client.a.a.b r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r7)
            com.google.common.f.n r2 = new com.google.common.f.n
            r5 = 37497(0x9279, float:5.2544E-41)
            r2.<init>(r5)
            r8.mo56379ah(r2)
            java.lang.String r2 = "#interactionStartFlowCompleted: %s, stopping recordUntrackedInvocationClosure"
            r8.mo56389s(r2, r7)
            kotlinx.coroutines.j.b r7 = r6.f351263d
            r0.f351237a = r6
            r0.f351238b = r7
            r0.f351241e = r3
            java.lang.Object r8 = r7.mo63025b(r4, r0)
            if (r8 == r1) goto L_0x007a
            r0 = r6
        L_0x0062:
            r8 = r0
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r8     // Catch:{ all -> 0x0075 }
            r1 = 0
            r8.f351265f = r1     // Catch:{ all -> 0x0075 }
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r0     // Catch:{ all -> 0x0075 }
            java.util.Set r8 = r0.f351267h     // Catch:{ all -> 0x0075 }
            r8.clear()     // Catch:{ all -> 0x0075 }
            r7.mo63026c(r4)
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x0075:
            r8 = move-exception
            r7.mo63026c(r4)
            throw r8
        L_0x007a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l.mo108139g(com.google.android.libraries.search.assistant.invocation.o.a.bp, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.google.android.libraries.search.assistant.invocation.o.a.bb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: com.google.android.libraries.search.assistant.invocation.o.a.bb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062 A[SYNTHETIC, Splitter:B:23:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f A[SYNTHETIC, Splitter:B:30:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108140h(com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34039bb r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127574g
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.surfaces.voice.g.c.g r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127574g) r0
            int r1 = r0.f351247f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f351247f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.g.c.g r0 = new com.google.android.apps.search.assistant.surfaces.voice.g.c.g
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f351245d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f351247f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r9 = r0.f351244c
            java.lang.Object r1 = r0.f351243b
            java.lang.Object r0 = r0.f351242a
            p5462h.C69714l.m101134b(r10)
            r10 = r9
            r9 = r1
            goto L_0x004c
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            p5462h.C69714l.m101134b(r10)
            kotlinx.coroutines.j.b r10 = r8.f351263d
            r0.f351242a = r8
            r0.f351243b = r9
            r0.f351244c = r10
            r0.f351247f = r3
            java.lang.Object r0 = r10.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x00f4
            r0 = r8
        L_0x004c:
            r1 = r0
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r1 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r1     // Catch:{ all -> 0x00ef }
            java.util.Set r1 = r1.f351267h     // Catch:{ all -> 0x00ef }
            r2 = r9
            com.google.android.libraries.search.assistant.invocation.o.a.bb r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34039bb) r2     // Catch:{ all -> 0x00ef }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = r2.f90720c     // Catch:{ all -> 0x00ef }
            if (r2 != 0) goto L_0x005a
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ all -> 0x00ef }
        L_0x005a:
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = "invocation.token"
            if (r1 == 0) goto L_0x008f
            com.google.common.f.e r0 = f351260a     // Catch:{ all -> 0x00ef }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x00ef }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "Invocation already closed, not adding to tracking set %s"
            com.google.android.libraries.search.assistant.invocation.o.a.bb r9 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34039bb) r9     // Catch:{ all -> 0x00ef }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r9 = r9.f90720c     // Catch:{ all -> 0x00ef }
            if (r9 != 0) goto L_0x0074
            com.google.android.libraries.search.assistant.invocation.o.a.bp r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ all -> 0x00ef }
        L_0x0074:
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)     // Catch:{ all -> 0x00ef }
            com.google.frameworks.client.a.a.b r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r9)     // Catch:{ all -> 0x00ef }
            com.google.common.f.n r2 = new com.google.common.f.n     // Catch:{ all -> 0x00ef }
            r3 = 37499(0x927b, float:5.2547E-41)
            r2.<init>(r3)     // Catch:{ all -> 0x00ef }
            r0.mo56379ah(r2)     // Catch:{ all -> 0x00ef }
            r0.mo56389s(r1, r9)     // Catch:{ all -> 0x00ef }
            h.q r9 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x00ef }
            r10.mo63026c(r4)
            return r9
        L_0x008f:
            com.google.common.f.e r1 = f351260a     // Catch:{ all -> 0x00ef }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x00ef }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00ef }
            java.lang.String r3 = "Adding Invocation %s"
            r5 = r9
            com.google.android.libraries.search.assistant.invocation.o.a.bb r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34039bb) r5     // Catch:{ all -> 0x00ef }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r5 = r5.f90720c     // Catch:{ all -> 0x00ef }
            if (r5 != 0) goto L_0x00a2
            com.google.android.libraries.search.assistant.invocation.o.a.bp r5 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ all -> 0x00ef }
        L_0x00a2:
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)     // Catch:{ all -> 0x00ef }
            com.google.frameworks.client.a.a.b r5 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r5)     // Catch:{ all -> 0x00ef }
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ all -> 0x00ef }
            r7 = 37498(0x927a, float:5.2546E-41)
            r6.<init>(r7)     // Catch:{ all -> 0x00ef }
            r1.mo56379ah(r6)     // Catch:{ all -> 0x00ef }
            r1.mo56389s(r3, r5)     // Catch:{ all -> 0x00ef }
            r1 = r0
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r1 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r1     // Catch:{ all -> 0x00ef }
            java.util.Map r1 = r1.f351264e     // Catch:{ all -> 0x00ef }
            com.google.android.libraries.search.assistant.invocation.o.a.bb r9 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34039bb) r9     // Catch:{ all -> 0x00ef }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r9 = r9.f90720c     // Catch:{ all -> 0x00ef }
            if (r9 != 0) goto L_0x00c4
            com.google.android.libraries.search.assistant.invocation.o.a.bp r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ all -> 0x00ef }
        L_0x00c4:
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)     // Catch:{ all -> 0x00ef }
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a r2 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127536a.PENDING     // Catch:{ all -> 0x00ef }
            r1.put(r9, r2)     // Catch:{ all -> 0x00ef }
            r9 = r0
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r9 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r9     // Catch:{ all -> 0x00ef }
            kotlinx.coroutines.cp r9 = r9.f351268i     // Catch:{ all -> 0x00ef }
            if (r9 != 0) goto L_0x00e9
            r9 = r0
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r9 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r9     // Catch:{ all -> 0x00ef }
            kotlinx.coroutines.aw r9 = r9.f351266g     // Catch:{ all -> 0x00ef }
            com.google.android.apps.search.assistant.surfaces.voice.g.c.j r1 = new com.google.android.apps.search.assistant.surfaces.voice.g.c.j     // Catch:{ all -> 0x00ef }
            r2 = r0
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r2     // Catch:{ all -> 0x00ef }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x00ef }
            r2 = 3
            kotlinx.coroutines.cp r9 = kotlinx.coroutines.C71803m.m105043d(r9, r4, r4, r1, r2)     // Catch:{ all -> 0x00ef }
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r0     // Catch:{ all -> 0x00ef }
            r0.f351268i = r9     // Catch:{ all -> 0x00ef }
        L_0x00e9:
            r10.mo63026c(r4)
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x00ef:
            r9 = move-exception
            r10.mo63026c(r4)
            throw r9
        L_0x00f4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l.mo108140h(com.google.android.libraries.search.assistant.invocation.o.a.bb, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d A[Catch:{ all -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f A[Catch:{ all -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108135b(com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127547k r11, p5462h.p5466c.C69577g r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127561b
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.assistant.surfaces.voice.g.c.b r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127561b) r0
            int r1 = r0.f351212e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f351212e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.g.c.b r0 = new com.google.android.apps.search.assistant.surfaces.voice.g.c.b
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f351210c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f351212e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0056
            if (r2 == r6) goto L_0x004c
            if (r2 == r5) goto L_0x0042
            if (r2 == r4) goto L_0x003e
            if (r2 == r3) goto L_0x0035
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0035:
            java.lang.Object r11 = r0.f351208a
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            p5462h.C69714l.m101134b(r12)
            goto L_0x00d7
        L_0x003e:
            p5462h.C69714l.m101134b(r12)
            goto L_0x00a5
        L_0x0042:
            java.lang.Object r11 = r0.f351209b
            java.lang.Object r2 = r0.f351208a
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r2
            p5462h.C69714l.m101134b(r12)     // Catch:{ all -> 0x00c4 }
            goto L_0x0096
        L_0x004c:
            java.lang.Object r11 = r0.f351209b
            java.lang.Object r2 = r0.f351208a
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r2
            p5462h.C69714l.m101134b(r12)
            goto L_0x0066
        L_0x0056:
            p5462h.C69714l.m101134b(r12)
            r0.f351208a = r10
            r0.f351209b = r11
            r0.f351212e = r6
            java.lang.Object r12 = r10.mo108136c(r11, r0)
            if (r12 == r1) goto L_0x00d8
            r2 = r10
        L_0x0066:
            r12 = r11
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k r12 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127547k) r12     // Catch:{ all -> 0x00c4 }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r12 = r12.f351198a     // Catch:{ all -> 0x00c4 }
            if (r12 != 0) goto L_0x006f
            com.google.android.libraries.search.assistant.invocation.o.a.bp r12 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ all -> 0x00c4 }
        L_0x006f:
            java.lang.String r6 = "invocationClosure.invocationToken"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r6)     // Catch:{ all -> 0x00c4 }
            r6 = r11
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127547k) r6     // Catch:{ all -> 0x00c4 }
            int r6 = r6.f351199b     // Catch:{ all -> 0x00c4 }
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a.j r6 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127546j.m208522a(r6)     // Catch:{ all -> 0x00c4 }
            if (r6 != 0) goto L_0x0081
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a.j r6 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127546j.UNRECOGNIZED     // Catch:{ all -> 0x00c4 }
        L_0x0081:
            java.lang.String r8 = "invocationClosure.state"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r8)     // Catch:{ all -> 0x00c4 }
            com.google.common.util.concurrent.cx r12 = r2.m208574i(r12, r6)     // Catch:{ all -> 0x00c4 }
            r0.f351208a = r2     // Catch:{ all -> 0x00c4 }
            r0.f351209b = r11     // Catch:{ all -> 0x00c4 }
            r0.f351212e = r5     // Catch:{ all -> 0x00c4 }
            java.lang.Object r12 = kotlinx.coroutines.p5578d.C71663i.m104690c(r12, r0)     // Catch:{ all -> 0x00c4 }
            if (r12 == r1) goto L_0x00c3
        L_0x0096:
            r0.f351208a = r7
            r0.f351209b = r7
            r0.f351212e = r4
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127547k) r11
            java.lang.Object r11 = r2.mo108138f(r11, r0)
            if (r11 != r1) goto L_0x00a5
            return r1
        L_0x00a5:
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a.f r11 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127542f.f351186a
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a.e r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127541e) r11
            java.lang.String r12 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r12)
            java.lang.String r12 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r12)
            com.google.protobuf.bv r11 = r11.build()
            java.lang.String r12 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r12)
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a.f r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127542f) r11
            return r11
        L_0x00c3:
            return r1
        L_0x00c4:
            r12 = move-exception
            r9 = r12
            r12 = r11
            r11 = r9
            r0.f351208a = r11
            r0.f351209b = r7
            r0.f351212e = r3
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k r12 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127547k) r12
            java.lang.Object r12 = r2.mo108138f(r12, r0)
            if (r12 != r1) goto L_0x00d7
            return r1
        L_0x00d7:
            throw r11
        L_0x00d8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l.mo108135b(com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k, h.c.g):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a A[Catch:{ all -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[Catch:{ all -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b8 A[Catch:{ all -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108136c(com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127547k r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            java.lang.String r0 = "invocationClosure.invocationToken"
            boolean r1 = r8 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127566c
            if (r1 == 0) goto L_0x0015
            r1 = r8
            com.google.android.apps.search.assistant.surfaces.voice.g.c.c r1 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127566c) r1
            int r2 = r1.f351225f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f351225f = r2
            goto L_0x001a
        L_0x0015:
            com.google.android.apps.search.assistant.surfaces.voice.g.c.c r1 = new com.google.android.apps.search.assistant.surfaces.voice.g.c.c
            r1.<init>(r6, r8)
        L_0x001a:
            java.lang.Object r8 = r1.f351223d
            h.c.a.a r2 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r3 = r1.f351225f
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x003a
            if (r3 != r4) goto L_0x0032
            java.lang.Object r7 = r1.f351222c
            java.lang.Object r2 = r1.f351221b
            java.lang.Object r1 = r1.f351220a
            p5462h.C69714l.m101134b(r8)
            r8 = r7
            r7 = r2
            goto L_0x004e
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.j.b r8 = r6.f351263d
            r1.f351220a = r6
            r1.f351221b = r7
            r1.f351222c = r8
            r1.f351225f = r4
            java.lang.Object r1 = r8.mo63025b(r5, r1)
            if (r1 == r2) goto L_0x00f2
            r1 = r6
        L_0x004e:
            r2 = r1
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r2     // Catch:{ all -> 0x00ed }
            java.util.Map r2 = r2.f351264e     // Catch:{ all -> 0x00ed }
            r3 = r7
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127547k) r3     // Catch:{ all -> 0x00ed }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = r3.f351198a     // Catch:{ all -> 0x00ed }
            if (r3 != 0) goto L_0x005c
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ all -> 0x00ed }
        L_0x005c:
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r0)     // Catch:{ all -> 0x00ed }
            boolean r2 = r2.containsKey(r3)     // Catch:{ all -> 0x00ed }
            if (r2 == 0) goto L_0x00b8
            r2 = r1
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r2     // Catch:{ all -> 0x00ed }
            java.util.Map r2 = r2.f351264e     // Catch:{ all -> 0x00ed }
            r3 = r7
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127547k) r3     // Catch:{ all -> 0x00ed }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = r3.f351198a     // Catch:{ all -> 0x00ed }
            if (r3 != 0) goto L_0x0073
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ all -> 0x00ed }
        L_0x0073:
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x00ed }
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a r3 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127536a.PENDING     // Catch:{ all -> 0x00ed }
            if (r2 != r3) goto L_0x0090
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r1 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r1     // Catch:{ all -> 0x00ed }
            java.util.Map r1 = r1.f351264e     // Catch:{ all -> 0x00ed }
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127547k) r7     // Catch:{ all -> 0x00ed }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r7 = r7.f351198a     // Catch:{ all -> 0x00ed }
            if (r7 != 0) goto L_0x0087
            com.google.android.libraries.search.assistant.invocation.o.a.bp r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ all -> 0x00ed }
        L_0x0087:
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)     // Catch:{ all -> 0x00ed }
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a r0 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127536a.IN_PROGRESS     // Catch:{ all -> 0x00ed }
            r1.put(r7, r0)     // Catch:{ all -> 0x00ed }
            goto L_0x00e7
        L_0x0090:
            com.google.common.f.e r0 = f351260a     // Catch:{ all -> 0x00ed }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x00ed }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x00ed }
            java.lang.String r1 = "Invocation closure in process : %s "
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127547k) r7     // Catch:{ all -> 0x00ed }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r7 = r7.f351198a     // Catch:{ all -> 0x00ed }
            if (r7 != 0) goto L_0x00a2
            com.google.android.libraries.search.assistant.invocation.o.a.bp r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ all -> 0x00ed }
        L_0x00a2:
            com.google.common.f.n r2 = new com.google.common.f.n     // Catch:{ all -> 0x00ed }
            r3 = 37494(0x9276, float:5.254E-41)
            r2.<init>(r3)     // Catch:{ all -> 0x00ed }
            r0.mo56379ah(r2)     // Catch:{ all -> 0x00ed }
            r0.mo56389s(r1, r7)     // Catch:{ all -> 0x00ed }
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "Double closure request"
            r7.<init>(r0)     // Catch:{ all -> 0x00ed }
            throw r7     // Catch:{ all -> 0x00ed }
        L_0x00b8:
            r2 = r1
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r2     // Catch:{ all -> 0x00ed }
            java.util.Map r2 = r2.f351264e     // Catch:{ all -> 0x00ed }
            r3 = r7
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127547k) r3     // Catch:{ all -> 0x00ed }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = r3.f351198a     // Catch:{ all -> 0x00ed }
            if (r3 != 0) goto L_0x00c6
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ all -> 0x00ed }
        L_0x00c6:
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r0)     // Catch:{ all -> 0x00ed }
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a r4 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127536a.IN_PROGRESS     // Catch:{ all -> 0x00ed }
            r2.put(r3, r4)     // Catch:{ all -> 0x00ed }
            r2 = r1
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r2     // Catch:{ all -> 0x00ed }
            boolean r2 = r2.f351265f     // Catch:{ all -> 0x00ed }
            if (r2 == 0) goto L_0x00e7
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r1 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r1     // Catch:{ all -> 0x00ed }
            java.util.Set r1 = r1.f351267h     // Catch:{ all -> 0x00ed }
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127547k) r7     // Catch:{ all -> 0x00ed }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r7 = r7.f351198a     // Catch:{ all -> 0x00ed }
            if (r7 != 0) goto L_0x00e1
            com.google.android.libraries.search.assistant.invocation.o.a.bp r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ all -> 0x00ed }
        L_0x00e1:
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)     // Catch:{ all -> 0x00ed }
            r1.add(r7)     // Catch:{ all -> 0x00ed }
        L_0x00e7:
            r8.mo63026c(r5)
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x00ed:
            r7 = move-exception
            r8.mo63026c(r5)
            throw r7
        L_0x00f2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l.mo108136c(com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k, h.c.g):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.apps.search.assistant.surfaces.voice.g.c.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057 A[Catch:{ all -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067 A[Catch:{ all -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108138f(com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127547k r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127572e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.voice.g.c.e r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127572e) r0
            int r1 = r0.f351236f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f351236f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.g.c.e r0 = new com.google.android.apps.search.assistant.surfaces.voice.g.c.e
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f351234d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f351236f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r6 = r0.f351233c
            java.lang.Object r1 = r0.f351232b
            java.lang.Object r0 = r0.f351231a
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
            kotlinx.coroutines.j.b r7 = r5.f351263d
            r0.f351231a = r5
            r0.f351232b = r6
            r0.f351233c = r7
            r0.f351236f = r3
            java.lang.Object r0 = r7.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x0077
            r0 = r5
        L_0x004c:
            r1 = r0
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r1 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r1     // Catch:{ all -> 0x0072 }
            java.util.Map r1 = r1.f351264e     // Catch:{ all -> 0x0072 }
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127547k) r6     // Catch:{ all -> 0x0072 }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r6 = r6.f351198a     // Catch:{ all -> 0x0072 }
            if (r6 != 0) goto L_0x0059
            com.google.android.libraries.search.assistant.invocation.o.a.bp r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ all -> 0x0072 }
        L_0x0059:
            r1.remove(r6)     // Catch:{ all -> 0x0072 }
            r6 = r0
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r6     // Catch:{ all -> 0x0072 }
            java.util.Map r6 = r6.f351264e     // Catch:{ all -> 0x0072 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0072 }
            if (r6 == 0) goto L_0x006c
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l) r0     // Catch:{ all -> 0x0072 }
            r0.m208575j()     // Catch:{ all -> 0x0072 }
        L_0x006c:
            r7.mo63026c(r4)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0072:
            r6 = move-exception
            r7.mo63026c(r4)
            throw r6
        L_0x0077:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l.mo108138f(com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k, h.c.g):java.lang.Object");
    }
}
