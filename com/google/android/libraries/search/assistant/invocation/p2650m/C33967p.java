package com.google.android.libraries.search.assistant.invocation.p2650m;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.C33499c;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a.C33497h;
import com.google.android.libraries.search.assistant.p2485a.C32240a;
import com.google.android.libraries.search.assistant.p2485a.C32245f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.m.p */
/* compiled from: PG */
public final class C33967p implements C33499c {

    /* renamed from: a */
    public static final C59071e f90576a = C59071e.m91331h();

    /* renamed from: b */
    public final C33955d f90577b;

    /* renamed from: c */
    public final C71422aw f90578c;

    /* renamed from: d */
    public final AtomicReference f90579d = new AtomicReference();

    /* renamed from: e */
    public final C32245f f90580e;

    /* renamed from: f */
    private final C47632e f90581f = new C47632e();

    /* renamed from: g */
    private final C32240a f90582g;

    public C33967p(C32240a aVar, C32245f fVar, C33955d dVar, C71422aw awVar) {
        C69664n.m101061g(aVar, "assistantAccountEntryPoints");
        C69664n.m101061g(dVar, "debugDataProvider");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f90582g = aVar;
        this.f90580e = fVar;
        this.f90577b = dVar;
        this.f90578c = awVar;
    }

    /* renamed from: h */
    private final Object m62626h(C69630p pVar, C69577g gVar) {
        Object c = C71663i.m104690c(mo39157a(pVar), gVar);
        return c == C69554a.COROUTINE_SUSPENDED ? c : C69788q.f186170a;
    }

    /* renamed from: a */
    public final C60870cx mo39157a(C69630p pVar) {
        C60870cx b = this.f90581f.mo51512b(new C33966o(this, pVar), C60826bg.f164896a);
        C69664n.m101060f(b, "private fun <T> withSequ…ion) }, directExecutor())");
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39158b(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.search.assistant.invocation.p2650m.C33957f
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.search.assistant.invocation.m.f r0 = (com.google.android.libraries.search.assistant.invocation.p2650m.C33957f) r0
            int r1 = r0.f90543d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f90543d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.m.f r0 = new com.google.android.libraries.search.assistant.invocation.m.f
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f90541b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f90543d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r0 = r0.f90540a
            java.util.Set r0 = (java.util.Set) r0
            p5462h.C69714l.m101134b(r6)
            goto L_0x0069
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            java.lang.Object r2 = r0.f90540a
            com.google.android.libraries.search.assistant.invocation.m.p r2 = (com.google.android.libraries.search.assistant.invocation.p2650m.C33967p) r2
            p5462h.C69714l.m101134b(r6)
            goto L_0x0056
        L_0x003e:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.search.assistant.a.a r6 = r5.f90582g
            com.google.android.apps.search.assistant.platform.a.b r6 = r6.f86461a
            java.lang.Class<com.google.android.libraries.search.assistant.invocation.m.b> r2 = com.google.android.libraries.search.assistant.invocation.p2650m.C33953b.class
            com.google.common.util.concurrent.cx r6 = r6.mo104411a(r2)
            r0.f90540a = r5
            r0.f90543d = r4
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)
            if (r6 == r1) goto L_0x006a
            r2 = r5
        L_0x0056:
            com.google.android.libraries.search.assistant.invocation.m.b r6 = (com.google.android.libraries.search.assistant.invocation.p2650m.C33953b) r6
            java.util.Set r6 = r6.mo39152js()
            com.google.android.libraries.search.assistant.invocation.m.g r4 = com.google.android.libraries.search.assistant.invocation.p2650m.C33958g.f90544a
            r0.f90540a = r6
            r0.f90543d = r3
            java.lang.Object r0 = r2.mo39160g(r6, r4, r0)
            if (r0 == r1) goto L_0x006a
            r0 = r6
        L_0x0069:
            return r0
        L_0x006a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2650m.C33967p.mo39158b(h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo38908c(C69577g gVar) {
        return true;
    }

    /* renamed from: d */
    public final Object mo38909d(C69577g gVar) {
        Object h = m62626h(new C33965n(this, (C69577g) null), gVar);
        return h == C69554a.COROUTINE_SUSPENDED ? h : C69788q.f186170a;
    }

    /* renamed from: e */
    public final Object mo38910e(C33497h hVar, C69577g gVar) {
        Object h = m62626h(new C33964m(this, (C69577g) null), gVar);
        return h == C69554a.COROUTINE_SUSPENDED ? h : C69788q.f186170a;
    }

    /* renamed from: f */
    public final Object mo39159f(Set set, C69577g gVar) {
        Object g = mo39160g(set, C33959h.f90545a, gVar);
        return g == C69554a.COROUTINE_SUSPENDED ? g : C69788q.f186170a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: h.k.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: h.k.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: h.k.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: h.k.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: h.k.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: h.k.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: h.k.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0110 A[LOOP:1: B:41:0x010a->B:43:0x0110, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39160g(java.util.Set r18, p5462h.p5481k.C69706d r19, p5462h.p5466c.C69577g r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            boolean r2 = r0 instanceof com.google.android.libraries.search.assistant.invocation.p2650m.C33961j
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.google.android.libraries.search.assistant.invocation.m.j r2 = (com.google.android.libraries.search.assistant.invocation.p2650m.C33961j) r2
            int r3 = r2.f90559i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f90559i = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.libraries.search.assistant.invocation.m.j r2 = new com.google.android.libraries.search.assistant.invocation.m.j
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f90557g
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f90559i
            r5 = 10
            r6 = 1
            java.lang.String r7 = "ApaPinning"
            r8 = 0
            if (r4 == 0) goto L_0x0048
            if (r4 != r6) goto L_0x0040
            java.lang.Object r4 = r2.f90556f
            java.lang.Object r9 = r2.f90555e
            java.lang.Object r10 = r2.f90554d
            java.lang.Object r11 = r2.f90553c
            java.lang.Object r12 = r2.f90552b
            java.lang.Object r13 = r2.f90551a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x003d }
            goto L_0x00de
        L_0x003d:
            r0 = move-exception
            goto L_0x00eb
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0048:
            p5462h.C69714l.m101134b(r0)
            com.google.common.f.e r0 = f90576a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r7)
            java.lang.String r4 = r19.mo61373c()
            java.lang.String r9 = com.google.android.libraries.search.assistant.invocation.p2641k.C33914a.m62567b(r18)
            com.google.common.f.n r10 = new com.google.common.f.n
            r11 = 51314(0xc872, float:7.1906E-41)
            r10.<init>(r11)
            r0.mo56379ah(r10)
            java.lang.String r10 = "Running action(%s) over lifecycles(%s)."
            r0.mo56354G(r10, r4, r9)
            java.util.ArrayList r0 = new java.util.ArrayList
            r4 = r18
            int r9 = p5462h.p5463a.C69540x.m100804k(r4, r5)
            r0.<init>(r9)
            java.util.Iterator r9 = r18.iterator()
        L_0x007f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00a2
            java.lang.Object r10 = r9.next()
            com.google.android.libraries.search.assistant.invocation.m.a r10 = (com.google.android.libraries.search.assistant.invocation.p2650m.C33952a) r10
            kotlinx.coroutines.aw r11 = r1.f90578c
            com.google.android.libraries.search.assistant.invocation.m.k r12 = new com.google.android.libraries.search.assistant.invocation.m.k
            r13 = r19
            r12.<init>(r13, r10, r8)
            r14 = 3
            kotlinx.coroutines.be r11 = kotlinx.coroutines.C71803m.m105042c(r11, r8, r8, r12, r14)
            h.i r12 = new h.i
            r12.<init>(r10, r11)
            r0.add(r12)
            goto L_0x007f
        L_0x00a2:
            r13 = r19
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r0.iterator()
            r11 = r1
            r10 = r9
            r9 = r0
        L_0x00b0:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0106
            java.lang.Object r0 = r9.next()
            h.i r0 = (p5462h.C69685i) r0
            java.lang.Object r12 = r0.f186052a
            java.lang.Object r0 = r0.f186053b
            kotlinx.coroutines.be r0 = (kotlinx.coroutines.C71604be) r0
            r2.f90551a = r11     // Catch:{ all -> 0x00e2 }
            r2.f90552b = r4     // Catch:{ all -> 0x00e2 }
            r2.f90553c = r13     // Catch:{ all -> 0x00e2 }
            r2.f90554d = r10     // Catch:{ all -> 0x00e2 }
            r2.f90555e = r9     // Catch:{ all -> 0x00e2 }
            r2.f90556f = r12     // Catch:{ all -> 0x00e2 }
            r2.f90559i = r6     // Catch:{ all -> 0x00e2 }
            java.lang.Object r0 = r0.mo62825a(r2)     // Catch:{ all -> 0x00e2 }
            if (r0 == r3) goto L_0x00e1
            r15 = r12
            r12 = r4
            r4 = r15
            r16 = r13
            r13 = r11
            r11 = r16
        L_0x00de:
            java.lang.Void r0 = (java.lang.Void) r0     // Catch:{ all -> 0x003d }
            goto L_0x00ef
        L_0x00e1:
            return r3
        L_0x00e2:
            r0 = move-exception
            r15 = r12
            r12 = r4
            r4 = r15
            r16 = r13
            r13 = r11
            r11 = r16
        L_0x00eb:
            java.lang.Object r0 = p5462h.C69714l.m101133a(r0)
        L_0x00ef:
            r15 = r13
            r13 = r11
            r11 = r15
            java.lang.Throwable r0 = p5462h.C69702k.m101124a(r0)
            if (r0 == 0) goto L_0x00fe
            h.i r14 = new h.i
            r14.<init>(r4, r0)
            goto L_0x00ff
        L_0x00fe:
            r14 = r8
        L_0x00ff:
            if (r14 == 0) goto L_0x0104
            r10.add(r14)
        L_0x0104:
            r4 = r12
            goto L_0x00b0
        L_0x0106:
            java.util.Iterator r0 = r10.iterator()
        L_0x010a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x014a
            java.lang.Object r2 = r0.next()
            h.i r2 = (p5462h.C69685i) r2
            java.lang.Object r3 = r2.f186052a
            com.google.android.libraries.search.assistant.invocation.m.a r3 = (com.google.android.libraries.search.assistant.invocation.p2650m.C33952a) r3
            java.lang.Object r2 = r2.f186053b
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            com.google.common.f.e r6 = f90576a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r8, r7)
            com.google.common.f.x r2 = r6.mo56382g(r2)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            java.lang.String r6 = r13.mo61373c()
            java.lang.String r3 = com.google.android.libraries.search.assistant.invocation.p2641k.C33914a.m62568c(r3)
            com.google.common.f.n r8 = new com.google.common.f.n
            r9 = 51316(0xc874, float:7.1909E-41)
            r8.<init>(r9)
            r2.mo56379ah(r8)
            java.lang.String r8 = "Failure running %s for %s."
            r2.mo56354G(r8, r6, r3)
            goto L_0x010a
        L_0x014a:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0178
            com.google.common.f.e r0 = f90576a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r7)
            java.lang.String r2 = r13.mo61373c()
            java.lang.String r3 = com.google.android.libraries.search.assistant.invocation.p2641k.C33914a.m62567b(r4)
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 51315(0xc873, float:7.1908E-41)
            r4.<init>(r5)
            r0.mo56379ah(r4)
            java.lang.String r4 = "Done action(%s) over lifecycles(%s)."
            r0.mo56354G(r4, r2, r3)
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x0178:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = p5462h.p5463a.C69540x.m100804k(r10, r5)
            r0.<init>(r2)
            java.util.Iterator r2 = r10.iterator()
        L_0x0185:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x019d
            java.lang.Object r3 = r2.next()
            h.i r3 = (p5462h.C69685i) r3
            java.lang.Object r3 = r3.f186052a
            com.google.android.libraries.search.assistant.invocation.m.a r3 = (com.google.android.libraries.search.assistant.invocation.p2650m.C33952a) r3
            java.lang.String r3 = com.google.android.libraries.search.assistant.invocation.p2641k.C33914a.m62568c(r3)
            r0.add(r3)
            goto L_0x0185
        L_0x019d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = r13.mo61373c()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failure(s) when running "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = " for lifecycles: "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = "."
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            java.util.Iterator r0 = r10.iterator()
        L_0x01c5:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01d9
            java.lang.Object r3 = r0.next()
            h.i r3 = (p5462h.C69685i) r3
            java.lang.Object r3 = r3.f186053b
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            p5462h.C69465a.m100953a(r2, r3)
            goto L_0x01c5
        L_0x01d9:
            goto L_0x01db
        L_0x01da:
            throw r2
        L_0x01db:
            goto L_0x01da
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2650m.C33967p.mo39160g(java.util.Set, h.k.d, h.c.g):java.lang.Object");
    }
}
