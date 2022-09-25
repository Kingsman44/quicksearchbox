package com.google.android.apps.search.googleapp.discover.p10249z.p10252c;

import com.google.android.apps.search.googleapp.discover.p10175ab.p10177b.C134094c;
import com.google.android.libraries.storage.protostore.C42876ab;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.c.f */
/* compiled from: PG */
public final class C135343f {

    /* renamed from: a */
    private final C42876ab f368757a;

    /* renamed from: b */
    private final Executor f368758b;

    /* renamed from: c */
    private final C134094c f368759c;

    /* renamed from: d */
    private final C71788b f368760d = new C71799m();

    public C135343f(C42876ab abVar, Executor executor, C71422aw awVar, C134094c cVar) {
        C69664n.m101061g(abVar, "dataStore");
        C69664n.m101061g(executor, "executor");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f368757a = abVar;
        this.f368758b = executor;
        this.f368759c = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112277a(com.google.p4283bv.p4354e.C57528m r7, java.util.List r8, p5462h.p5466c.C69577g r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.googleapp.discover.p10249z.p10252c.C135338a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.googleapp.discover.z.c.a r0 = (com.google.android.apps.search.googleapp.discover.p10249z.p10252c.C135338a) r0
            int r1 = r0.f368741e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f368741e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.z.c.a r0 = new com.google.android.apps.search.googleapp.discover.z.c.a
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f368739c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f368741e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r8 = r0.f368738b
            java.lang.Object r7 = r0.f368737a
            p5462h.C69714l.m101134b(r9)
            goto L_0x004d
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            p5462h.C69714l.m101134b(r9)
            com.google.android.libraries.storage.protostore.ab r9 = r6.f368757a
            com.google.common.util.concurrent.cx r9 = r9.mo46042d()
            java.lang.String r2 = "dataStore.data"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)
            r0.f368737a = r7
            r0.f368738b = r8
            r0.f368741e = r3
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)
            if (r9 == r1) goto L_0x00a2
        L_0x004d:
            com.google.android.apps.search.googleapp.z.b.d r9 = (com.google.android.apps.search.googleapp.p10544z.p10546b.C139909d) r9
            com.google.protobuf.dn r9 = r9.f380328a
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r9)
            java.lang.String r0 = "dataStore.data.await().shownSurfacesMap"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0063:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00a1
            java.lang.Object r1 = r8.next()
            r2 = r1
            com.google.android.apps.search.googleapp.discover.z.c.h r2 = (com.google.android.apps.search.googleapp.discover.p10249z.p10252c.C135345h) r2
            java.lang.String r2 = r2.f368761a
            com.google.android.apps.search.googleapp.z.b.g r4 = com.google.android.apps.search.googleapp.p10544z.p10546b.C139912g.f380330c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.search.googleapp.z.b.f r4 = (com.google.android.apps.search.googleapp.p10544z.p10546b.C139911f) r4
            java.lang.String r5 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            com.google.android.apps.search.googleapp.z.b.i r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")
            com.google.android.apps.search.googleapp.z.b.g r4 = r4.mo115329a()
            java.lang.Object r2 = p3186j$.util.Map.EL.getOrDefault(r9, r2, r4)
            com.google.android.apps.search.googleapp.z.b.g r2 = (com.google.android.apps.search.googleapp.p10544z.p10546b.C139912g) r2
            com.google.protobuf.cj r4 = new com.google.protobuf.cj
            com.google.protobuf.ch r2 = r2.f380332a
            com.google.protobuf.ci r5 = com.google.android.apps.search.googleapp.p10544z.p10546b.C139912g.f380329b
            r4.<init>(r2, r5)
            boolean r2 = r4.contains(r7)
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x0063
            r0.add(r1)
            goto L_0x0063
        L_0x00a1:
            return r0
        L_0x00a2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10249z.p10252c.C135343f.mo112277a(com.google.bv.e.m, java.util.List, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112278b(p5462h.p5466c.C69577g r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.googleapp.discover.p10249z.p10252c.C135339b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.googleapp.discover.z.c.b r0 = (com.google.android.apps.search.googleapp.discover.p10249z.p10252c.C135339b) r0
            int r1 = r0.f368746e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f368746e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.z.c.b r0 = new com.google.android.apps.search.googleapp.discover.z.c.b
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f368744c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f368746e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r0 = r0.f368742a
            kotlinx.coroutines.j.b r0 = (kotlinx.coroutines.p5584j.C71788b) r0
            p5462h.C69714l.m101134b(r9)     // Catch:{ all -> 0x002f }
            goto L_0x0073
        L_0x002f:
            r9 = move-exception
            goto L_0x007e
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0039:
            java.lang.Object r2 = r0.f368743b
            java.lang.Object r4 = r0.f368742a
            com.google.android.apps.search.googleapp.discover.z.c.f r4 = (com.google.android.apps.search.googleapp.discover.p10249z.p10252c.C135343f) r4
            p5462h.C69714l.m101134b(r9)
            r9 = r2
            goto L_0x0057
        L_0x0044:
            p5462h.C69714l.m101134b(r9)
            kotlinx.coroutines.j.b r9 = r8.f368760d
            r0.f368742a = r8
            r0.f368743b = r9
            r0.f368746e = r4
            java.lang.Object r2 = r9.mo63025b(r5, r0)
            if (r2 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r4 = r8
        L_0x0057:
            com.google.android.libraries.storage.protostore.ab r2 = r4.f368757a     // Catch:{ all -> 0x007a }
            com.google.android.apps.search.googleapp.discover.z.c.c r6 = com.google.android.apps.search.googleapp.discover.p10249z.p10252c.C135340c.f368747a     // Catch:{ all -> 0x007a }
            java.util.concurrent.Executor r4 = r4.f368758b     // Catch:{ all -> 0x007a }
            com.google.common.util.concurrent.cx r2 = r2.mo46039a(r6, r4)     // Catch:{ all -> 0x007a }
            java.lang.String r4 = "dataStore.updateData({ C…ltInstance() }, executor)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)     // Catch:{ all -> 0x007a }
            r0.f368742a = r9     // Catch:{ all -> 0x007a }
            r0.f368743b = r5     // Catch:{ all -> 0x007a }
            r0.f368746e = r3     // Catch:{ all -> 0x007a }
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r0)     // Catch:{ all -> 0x007a }
            if (r0 == r1) goto L_0x0079
            r0 = r9
        L_0x0073:
            r0.mo63026c(r5)
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x0079:
            return r1
        L_0x007a:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L_0x007e:
            r0.mo63026c(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10249z.p10252c.C135343f.mo112278b(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0101, code lost:
        if (kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0) != r1) goto L_0x0103;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.android.apps.search.googleapp.discover.streamui.h.q, code=java.lang.Object, for r12v0, types: [com.google.android.apps.search.googleapp.discover.streamui.h.q, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[Catch:{ all -> 0x0033 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c A[SYNTHETIC, Splitter:B:35:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112279c(java.lang.Object r12, java.util.List r13, p5462h.p5466c.C69577g r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.google.android.apps.search.googleapp.discover.p10249z.p10252c.C135341d
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.google.android.apps.search.googleapp.discover.z.c.d r0 = (com.google.android.apps.search.googleapp.discover.p10249z.p10252c.C135341d) r0
            int r1 = r0.f368754g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f368754g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.z.c.d r0 = new com.google.android.apps.search.googleapp.discover.z.c.d
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f368752e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f368754g
            r3 = 3
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x005f
            if (r2 == r4) goto L_0x004c
            if (r2 == r5) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r12 = r0.f368748a
            kotlinx.coroutines.j.b r12 = (kotlinx.coroutines.p5584j.C71788b) r12
            p5462h.C69714l.m101134b(r14)     // Catch:{ all -> 0x0033 }
            goto L_0x0103
        L_0x0033:
            r13 = move-exception
            goto L_0x010d
        L_0x0036:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003e:
            java.lang.Object r12 = r0.f368750c
            kotlinx.coroutines.j.b r12 = (kotlinx.coroutines.p5584j.C71788b) r12
            java.lang.Object r13 = r0.f368749b
            java.lang.Object r2 = r0.f368748a
            com.google.android.apps.search.googleapp.discover.z.c.f r2 = (com.google.android.apps.search.googleapp.discover.p10249z.p10252c.C135343f) r2
            p5462h.C69714l.m101134b(r14)     // Catch:{ all -> 0x0033 }
            goto L_0x008e
        L_0x004c:
            java.lang.Object r12 = r0.f368751d
            java.lang.Object r13 = r0.f368750c
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r2 = r0.f368749b
            java.lang.Object r4 = r0.f368748a
            com.google.android.apps.search.googleapp.discover.z.c.f r4 = (com.google.android.apps.search.googleapp.discover.p10249z.p10252c.C135343f) r4
            p5462h.C69714l.m101134b(r14)
            r14 = r12
            r12 = r2
            r2 = r4
            goto L_0x0075
        L_0x005f:
            p5462h.C69714l.m101134b(r14)
            kotlinx.coroutines.j.b r14 = r11.f368760d
            r0.f368748a = r11
            r0.f368749b = r12
            r0.f368750c = r13
            r0.f368751d = r14
            r0.f368754g = r4
            java.lang.Object r2 = r14.mo63025b(r6, r0)
            if (r2 == r1) goto L_0x0111
            r2 = r11
        L_0x0075:
            r4 = r12
            com.google.android.apps.search.googleapp.discover.streamui.h.q r4 = (com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q) r4     // Catch:{ all -> 0x010a }
            com.google.bv.e.m r4 = r4.f366956e     // Catch:{ all -> 0x010a }
            r0.f368748a = r2     // Catch:{ all -> 0x010a }
            r0.f368749b = r12     // Catch:{ all -> 0x010a }
            r0.f368750c = r14     // Catch:{ all -> 0x010a }
            r0.f368751d = r6     // Catch:{ all -> 0x010a }
            r0.f368754g = r5     // Catch:{ all -> 0x010a }
            java.lang.Object r13 = r2.mo112277a(r4, r13, r0)     // Catch:{ all -> 0x010a }
            if (r13 == r1) goto L_0x0109
            r10 = r13
            r13 = r12
            r12 = r14
            r14 = r10
        L_0x008e:
            java.util.List r14 = (java.util.List) r14     // Catch:{ all -> 0x0033 }
            boolean r4 = r14.isEmpty()     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x009c
            h.q r13 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x0033 }
            r12.mo63026c(r6)
            return r13
        L_0x009c:
            com.google.android.apps.search.googleapp.discover.ab.b.c r4 = r2.f368759c     // Catch:{ all -> 0x0033 }
            r7 = r13
            com.google.android.apps.search.googleapp.discover.streamui.h.q r7 = (com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q) r7     // Catch:{ all -> 0x0033 }
            com.google.android.libraries.search.rendering.xuikit.a.c.ah r4 = r4.mo111555a(r7)     // Catch:{ all -> 0x0033 }
            java.util.Iterator r7 = r14.iterator()     // Catch:{ all -> 0x0033 }
        L_0x00a9:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0033 }
            if (r8 == 0) goto L_0x00be
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0033 }
            com.google.android.apps.search.googleapp.discover.z.c.h r8 = (com.google.android.apps.search.googleapp.discover.p10249z.p10252c.C135345h) r8     // Catch:{ all -> 0x0033 }
            com.google.bv.j.b.a.b r8 = r8.f368762b     // Catch:{ all -> 0x0033 }
            r9 = r4
            com.google.android.libraries.search.rendering.xuikit.a.c.af r9 = (com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40025af) r9     // Catch:{ all -> 0x0033 }
            r9.mo42132f(r5, r8)     // Catch:{ all -> 0x0033 }
            goto L_0x00a9
        L_0x00be:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0033 }
            r5 = 10
            int r5 = p5462h.p5463a.C69540x.m100804k(r14, r5)     // Catch:{ all -> 0x0033 }
            r4.<init>(r5)     // Catch:{ all -> 0x0033 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x0033 }
        L_0x00cd:
            boolean r5 = r14.hasNext()     // Catch:{ all -> 0x0033 }
            if (r5 == 0) goto L_0x00df
            java.lang.Object r5 = r14.next()     // Catch:{ all -> 0x0033 }
            com.google.android.apps.search.googleapp.discover.z.c.h r5 = (com.google.android.apps.search.googleapp.discover.p10249z.p10252c.C135345h) r5     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r5.f368761a     // Catch:{ all -> 0x0033 }
            r4.add(r5)     // Catch:{ all -> 0x0033 }
            goto L_0x00cd
        L_0x00df:
            com.google.android.apps.search.googleapp.discover.streamui.h.q r13 = (com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q) r13     // Catch:{ all -> 0x0033 }
            com.google.bv.e.m r13 = r13.f366956e     // Catch:{ all -> 0x0033 }
            r0.f368748a = r12     // Catch:{ all -> 0x0033 }
            r0.f368749b = r6     // Catch:{ all -> 0x0033 }
            r0.f368750c = r6     // Catch:{ all -> 0x0033 }
            r0.f368754g = r3     // Catch:{ all -> 0x0033 }
            com.google.android.libraries.storage.protostore.ab r14 = r2.f368757a     // Catch:{ all -> 0x0033 }
            com.google.android.apps.search.googleapp.discover.z.c.e r3 = new com.google.android.apps.search.googleapp.discover.z.c.e     // Catch:{ all -> 0x0033 }
            r3.<init>(r4, r13)     // Catch:{ all -> 0x0033 }
            java.util.concurrent.Executor r13 = r2.f368758b     // Catch:{ all -> 0x0033 }
            com.google.common.util.concurrent.cx r13 = r14.mo46039a(r3, r13)     // Catch:{ all -> 0x0033 }
            java.lang.String r14 = "newContentIds: List<Stri…\n        executor\n      )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)     // Catch:{ all -> 0x0033 }
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0)     // Catch:{ all -> 0x0033 }
            if (r13 == r1) goto L_0x0109
        L_0x0103:
            r12.mo63026c(r6)
            h.q r12 = p5462h.C69788q.f186170a
            return r12
        L_0x0109:
            return r1
        L_0x010a:
            r12 = move-exception
            r13 = r12
            r12 = r14
        L_0x010d:
            r12.mo63026c(r6)
            throw r13
        L_0x0111:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10249z.p10252c.C135343f.mo112279c(com.google.android.apps.search.googleapp.discover.streamui.h.q, java.util.List, h.c.g):java.lang.Object");
    }
}
