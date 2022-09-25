package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a;

import com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32258c;
import com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a.C32288i;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32777d;
import com.google.common.p4526f.C59071e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.i */
/* compiled from: PG */
public final class C32313i {
    @Deprecated

    /* renamed from: a */
    public static final C59071e f86565a = C59071e.m91331h();

    /* renamed from: b */
    public final C71422aw f86566b;

    /* renamed from: c */
    public final C32258c f86567c;

    /* renamed from: d */
    public final long f86568d;

    /* renamed from: e */
    public final Set f86569e;

    /* renamed from: f */
    public final C32327w f86570f;

    /* renamed from: g */
    public final C32324t f86571g;

    /* renamed from: h */
    public final C32314j f86572h;

    /* renamed from: i */
    public final C32288i f86573i;

    /* renamed from: j */
    public final C71788b f86574j = new C71799m();

    /* renamed from: k */
    public final Map f86575k = new LinkedHashMap();

    /* renamed from: l */
    private final C32777d f86576l;

    public C32313i(C71422aw awVar, C32258c cVar, C32777d dVar, long j, Set set, C32327w wVar, C32324t tVar, C32314j jVar, C32288i iVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(cVar, "debugDataProvider");
        this.f86566b = awVar;
        this.f86567c = cVar;
        this.f86576l = dVar;
        this.f86568d = j;
        this.f86569e = set;
        this.f86570f = wVar;
        this.f86571g = tVar;
        this.f86572h = jVar;
        this.f86573i = iVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.android.libraries.search.assistant.aa.c.a.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.libraries.search.assistant.aa.c.a.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.libraries.search.assistant.aa.c.a.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e A[Catch:{ all -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38035a(com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq r22, p5462h.p5466c.C69577g r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            boolean r2 = r0 instanceof com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32311g
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.google.android.libraries.search.assistant.aa.c.a.g r2 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32311g) r2
            int r3 = r2.f86556f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f86556f = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.libraries.search.assistant.aa.c.a.g r2 = new com.google.android.libraries.search.assistant.aa.c.a.g
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f86554d
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f86556f
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x003a
            if (r4 != r6) goto L_0x0032
            java.lang.Object r3 = r2.f86553c
            java.lang.Object r4 = r2.f86552b
            java.lang.Object r2 = r2.f86551a
            p5462h.C69714l.m101134b(r0)
            goto L_0x0051
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003a:
            p5462h.C69714l.m101134b(r0)
            kotlinx.coroutines.j.b r0 = r1.f86574j
            r2.f86551a = r1
            r4 = r22
            r2.f86552b = r4
            r2.f86553c = r0
            r2.f86556f = r6
            java.lang.Object r2 = r0.mo63025b(r5, r2)
            if (r2 == r3) goto L_0x012f
            r3 = r0
            r2 = r1
        L_0x0051:
            r0 = r2
            com.google.android.libraries.search.assistant.aa.c.a.i r0 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32313i) r0     // Catch:{ all -> 0x0129 }
            java.util.Map r0 = r0.f86575k     // Catch:{ all -> 0x0129 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0129 }
            com.google.android.libraries.search.assistant.aa.c.a.a r0 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32262a) r0     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x011f
            com.google.android.libraries.search.assistant.f.a.b r0 = r0.f86501a     // Catch:{ all -> 0x0129 }
            if (r0 != 0) goto L_0x0064
            goto L_0x011f
        L_0x0064:
            r6 = r2
            com.google.android.libraries.search.assistant.aa.c.a.i r6 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32313i) r6     // Catch:{ all -> 0x0129 }
            com.google.android.libraries.search.assistant.aa.b.a.c r6 = r6.f86567c     // Catch:{ all -> 0x0129 }
            java.util.concurrent.locks.ReentrantReadWriteLock r7 = r6.f86488c     // Catch:{ all -> 0x0129 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r7.readLock()     // Catch:{ all -> 0x0129 }
            int r9 = r7.getWriteHoldCount()     // Catch:{ all -> 0x0129 }
            if (r9 != 0) goto L_0x007a
            int r9 = r7.getReadHoldCount()     // Catch:{ all -> 0x0129 }
            goto L_0x007b
        L_0x007a:
            r9 = 0
        L_0x007b:
            r11 = 0
        L_0x007c:
            if (r11 >= r9) goto L_0x0084
            r8.unlock()     // Catch:{ all -> 0x0129 }
            int r11 = r11 + 1
            goto L_0x007c
        L_0x0084:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r7 = r7.writeLock()     // Catch:{ all -> 0x0129 }
            r7.lock()     // Catch:{ all -> 0x0129 }
            java.util.Queue r11 = r6.f86487b     // Catch:{ all -> 0x0111 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0111 }
        L_0x0091:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0111 }
            if (r12 == 0) goto L_0x00ab
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0111 }
            r13 = r12
            com.google.android.libraries.search.assistant.aa.b.a.d r13 = (com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32259d) r13     // Catch:{ all -> 0x0111 }
            com.google.android.libraries.search.assistant.f.a.d.d r13 = r13.f86491a     // Catch:{ all -> 0x0111 }
            com.google.android.libraries.search.assistant.f.a.d.d r14 = r0.mo38179a()     // Catch:{ all -> 0x0111 }
            boolean r13 = p5462h.p5473f.p5475b.C69664n.m101066l(r13, r14)     // Catch:{ all -> 0x0111 }
            if (r13 == 0) goto L_0x0091
            goto L_0x00ac
        L_0x00ab:
            r12 = r5
        L_0x00ac:
            com.google.android.libraries.search.assistant.aa.b.a.d r12 = (com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32259d) r12     // Catch:{ all -> 0x0111 }
            if (r12 != 0) goto L_0x00bd
            r10 = 0
        L_0x00b1:
            if (r10 >= r9) goto L_0x00b9
            r8.lock()     // Catch:{ all -> 0x0129 }
            int r10 = r10 + 1
            goto L_0x00b1
        L_0x00b9:
            r7.unlock()     // Catch:{ all -> 0x0129 }
            goto L_0x0100
        L_0x00bd:
            j$.time.Duration r18 = r6.mo38015b()     // Catch:{ all -> 0x0111 }
            com.google.android.libraries.search.assistant.f.a.d.d r14 = r12.f86491a     // Catch:{ all -> 0x0111 }
            com.google.android.libraries.search.assistant.f.a.d.cq r15 = r12.f86492b     // Catch:{ all -> 0x0111 }
            java.lang.Integer r0 = r12.f86493c     // Catch:{ all -> 0x0111 }
            j$.time.Duration r11 = r12.f86494d     // Catch:{ all -> 0x0111 }
            java.util.Map r13 = r12.f86496f     // Catch:{ all -> 0x0111 }
            java.util.Map r10 = r12.f86497g     // Catch:{ all -> 0x0111 }
            java.lang.String r5 = "accessSessionToken"
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r5)     // Catch:{ all -> 0x0111 }
            java.lang.String r5 = "sessionToken"
            p5462h.p5473f.p5475b.C69664n.m101061g(r15, r5)     // Catch:{ all -> 0x0111 }
            java.lang.String r5 = "creationTime"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r5)     // Catch:{ all -> 0x0111 }
            com.google.android.libraries.search.assistant.aa.b.a.d r5 = new com.google.android.libraries.search.assistant.aa.b.a.d     // Catch:{ all -> 0x0111 }
            r19 = r13
            r13 = r5
            r16 = r0
            r17 = r11
            r20 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0111 }
            java.util.Queue r0 = r6.f86487b     // Catch:{ all -> 0x0111 }
            r0.remove(r12)     // Catch:{ all -> 0x0111 }
            java.util.Queue r0 = r6.f86487b     // Catch:{ all -> 0x0111 }
            r0.add(r5)     // Catch:{ all -> 0x0111 }
            r10 = 0
        L_0x00f5:
            if (r10 >= r9) goto L_0x00fd
            r8.lock()     // Catch:{ all -> 0x0126 }
            int r10 = r10 + 1
            goto L_0x00f5
        L_0x00fd:
            r7.unlock()     // Catch:{ all -> 0x0126 }
        L_0x0100:
            com.google.android.libraries.search.assistant.aa.c.a.i r2 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32313i) r2     // Catch:{ all -> 0x0126 }
            java.util.Map r0 = r2.f86575k     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = r0.remove(r4)     // Catch:{ all -> 0x0126 }
            com.google.android.libraries.search.assistant.aa.c.a.a r0 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32262a) r0     // Catch:{ all -> 0x0126 }
            r2 = 0
            r3.mo63026c(r2)
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x0111:
            r0 = move-exception
            r10 = 0
        L_0x0113:
            if (r10 >= r9) goto L_0x011b
            r8.lock()     // Catch:{ all -> 0x0126 }
            int r10 = r10 + 1
            goto L_0x0113
        L_0x011b:
            r7.unlock()     // Catch:{ all -> 0x0126 }
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x011f:
            h.q r0 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x0126 }
            r2 = 0
            r3.mo63026c(r2)
            return r0
        L_0x0126:
            r0 = move-exception
            r2 = 0
            goto L_0x012b
        L_0x0129:
            r0 = move-exception
            r2 = r5
        L_0x012b:
            r3.mo63026c(r2)
            throw r0
        L_0x012f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32313i.mo38035a(com.google.android.libraries.search.assistant.f.a.d.cq, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.android.libraries.search.assistant.aa.c.a.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.libraries.search.assistant.f.a.d.cq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.android.libraries.search.assistant.f.a.d.cq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: com.google.android.libraries.search.assistant.aa.c.a.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: com.google.android.libraries.search.assistant.f.a.d.cq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: com.google.android.libraries.search.assistant.aa.c.a.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f A[SYNTHETIC, Splitter:B:26:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017e A[SYNTHETIC, Splitter:B:55:0x017e] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38036b(com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq r20, int r21, boolean r22, p5462h.p5466c.C69577g r23) {
        /*
            r19 = this;
            r1 = r19
            r0 = r23
            boolean r2 = r0 instanceof com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32312h
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.google.android.libraries.search.assistant.aa.c.a.h r2 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32312h) r2
            int r3 = r2.f86564h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f86564h = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.libraries.search.assistant.aa.c.a.h r2 = new com.google.android.libraries.search.assistant.aa.c.a.h
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f86562f
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f86564h
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x003f
            if (r4 != r6) goto L_0x0037
            boolean r3 = r2.f86561e
            int r4 = r2.f86560d
            java.lang.Object r7 = r2.f86559c
            java.lang.Object r8 = r2.f86558b
            java.lang.Object r2 = r2.f86557a
            p5462h.C69714l.m101134b(r0)
            r0 = r8
            goto L_0x005e
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003f:
            p5462h.C69714l.m101134b(r0)
            kotlinx.coroutines.j.b r7 = r1.f86574j
            r2.f86557a = r1
            r0 = r20
            r2.f86558b = r0
            r2.f86559c = r7
            r4 = r21
            r2.f86560d = r4
            r8 = r22
            r2.f86561e = r8
            r2.f86564h = r6
            java.lang.Object r2 = r7.mo63025b(r5, r2)
            if (r2 == r3) goto L_0x0191
            r2 = r1
            r3 = r8
        L_0x005e:
            r8 = r2
            com.google.android.libraries.search.assistant.aa.c.a.i r8 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32313i) r8     // Catch:{ all -> 0x018b }
            java.util.Map r8 = r8.f86575k     // Catch:{ all -> 0x018b }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ all -> 0x018b }
            com.google.android.libraries.search.assistant.aa.c.a.a r8 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32262a) r8     // Catch:{ all -> 0x018b }
            java.lang.String r9 = "Sbcp"
            if (r8 == 0) goto L_0x009f
            if (r3 == 0) goto L_0x0076
            com.google.android.libraries.search.assistant.aa.c.a.f r2 = r8.f86502b     // Catch:{ all -> 0x018b }
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.f86549b     // Catch:{ all -> 0x018b }
            r2.set(r6)     // Catch:{ all -> 0x018b }
        L_0x0076:
            com.google.common.f.e r2 = f86565a     // Catch:{ all -> 0x018b }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x018b }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x018b }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x018b }
            r2.mo56378ag(r3, r9)     // Catch:{ all -> 0x018b }
            java.lang.String r3 = "Using existing AccessSession for SessionToken: %s; RequestId: %s"
            com.google.android.libraries.search.assistant.f.a.d.cq r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r0     // Catch:{ all -> 0x018b }
            java.lang.String r0 = com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s.m60951b(r0)     // Catch:{ all -> 0x018b }
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ all -> 0x018b }
            r9 = 52549(0xcd45, float:7.3637E-41)
            r6.<init>(r9)     // Catch:{ all -> 0x018b }
            r2.mo56379ah(r6)     // Catch:{ all -> 0x018b }
            r2.mo56352E(r3, r0, r4)     // Catch:{ all -> 0x018b }
            com.google.android.libraries.search.assistant.f.a.b r0 = r8.f86501a     // Catch:{ all -> 0x018b }
            r7.mo63026c(r5)
            return r0
        L_0x009f:
            com.google.android.libraries.search.assistant.aa.c.a.f r6 = new com.google.android.libraries.search.assistant.aa.c.a.f     // Catch:{ all -> 0x018b }
            r8 = r2
            com.google.android.libraries.search.assistant.aa.c.a.i r8 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32313i) r8     // Catch:{ all -> 0x018b }
            r10 = r0
            com.google.android.libraries.search.assistant.f.a.d.cq r10 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r10     // Catch:{ all -> 0x018b }
            r6.<init>(r8, r10, r3)     // Catch:{ all -> 0x018b }
            r3 = r2
            com.google.android.libraries.search.assistant.aa.c.a.i r3 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32313i) r3     // Catch:{ all -> 0x018b }
            com.google.android.libraries.search.assistant.f.a.d r3 = r3.f86576l     // Catch:{ all -> 0x018b }
            java.lang.String r8 = "SBCP"
            r10 = r0
            com.google.android.libraries.search.assistant.f.a.d.cq r10 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r10     // Catch:{ all -> 0x018b }
            com.google.android.libraries.search.assistant.f.a.b r3 = r3.mo38218a(r8, r10, r6)     // Catch:{ all -> 0x018b }
            com.google.common.f.e r8 = f86565a     // Catch:{ all -> 0x018b }
            com.google.common.f.x r8 = r8.mo56224b()     // Catch:{ all -> 0x018b }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x018b }
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x018b }
            r8.mo56378ag(r10, r9)     // Catch:{ all -> 0x018b }
            java.lang.String r9 = "AccessSession created for SessionToken: %s; RequestId: %s"
            r10 = r0
            com.google.android.libraries.search.assistant.f.a.d.cq r10 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r10     // Catch:{ all -> 0x018b }
            java.lang.String r10 = com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s.m60951b(r10)     // Catch:{ all -> 0x018b }
            com.google.common.f.n r11 = new com.google.common.f.n     // Catch:{ all -> 0x018b }
            r12 = 52548(0xcd44, float:7.3635E-41)
            r11.<init>(r12)     // Catch:{ all -> 0x018b }
            r8.mo56379ah(r11)     // Catch:{ all -> 0x018b }
            r8.mo56352E(r9, r10, r4)     // Catch:{ all -> 0x018b }
            r8 = r2
            com.google.android.libraries.search.assistant.aa.c.a.i r8 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32313i) r8     // Catch:{ all -> 0x018b }
            java.util.Map r8 = r8.f86575k     // Catch:{ all -> 0x018b }
            com.google.android.libraries.search.assistant.aa.c.a.a r9 = new com.google.android.libraries.search.assistant.aa.c.a.a     // Catch:{ all -> 0x018b }
            java.lang.String r10 = "newAccessSession"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r10)     // Catch:{ all -> 0x018b }
            r9.<init>(r3, r6)     // Catch:{ all -> 0x018b }
            r8.put(r0, r9)     // Catch:{ all -> 0x018b }
            com.google.android.libraries.search.assistant.aa.c.a.i r2 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32313i) r2     // Catch:{ all -> 0x018b }
            com.google.android.libraries.search.assistant.aa.b.a.c r2 = r2.f86567c     // Catch:{ all -> 0x018b }
            java.lang.Integer r11 = new java.lang.Integer     // Catch:{ all -> 0x018b }
            r11.<init>(r4)     // Catch:{ all -> 0x018b }
            java.lang.String r4 = "accessSession"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r4)     // Catch:{ all -> 0x018b }
            java.lang.String r4 = "sessionToken"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r4)     // Catch:{ all -> 0x018b }
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r2.f86488c     // Catch:{ all -> 0x018b }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r6 = r4.readLock()     // Catch:{ all -> 0x018b }
            int r8 = r4.getWriteHoldCount()     // Catch:{ all -> 0x018b }
            r16 = 0
            if (r8 != 0) goto L_0x0115
            int r8 = r4.getReadHoldCount()     // Catch:{ all -> 0x018b }
            r15 = r8
            goto L_0x0116
        L_0x0115:
            r15 = 0
        L_0x0116:
            r8 = 0
        L_0x0117:
            if (r8 >= r15) goto L_0x011f
            r6.unlock()     // Catch:{ all -> 0x018b }
            int r8 = r8 + 1
            goto L_0x0117
        L_0x011f:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r4.writeLock()     // Catch:{ all -> 0x018b }
            r4.lock()     // Catch:{ all -> 0x018b }
            java.util.Queue r8 = r2.f86487b     // Catch:{ all -> 0x0179 }
            int r8 = r8.size()     // Catch:{ all -> 0x0179 }
            r9 = 10
            if (r8 != r9) goto L_0x0135
            java.util.Queue r8 = r2.f86487b     // Catch:{ all -> 0x0179 }
            r8.remove()     // Catch:{ all -> 0x0179 }
        L_0x0135:
            com.google.android.libraries.search.assistant.aa.b.a.d r14 = new com.google.android.libraries.search.assistant.aa.b.a.d     // Catch:{ all -> 0x0179 }
            com.google.android.libraries.search.assistant.f.a.d.d r9 = r3.mo38179a()     // Catch:{ all -> 0x0179 }
            java.lang.String r8 = "accessSession.token"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r8)     // Catch:{ all -> 0x0179 }
            j$.time.Duration r12 = r2.mo38015b()     // Catch:{ all -> 0x0179 }
            java.lang.String r8 = "now()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r8)     // Catch:{ all -> 0x0179 }
            java.util.LinkedHashMap r17 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0179 }
            r17.<init>()     // Catch:{ all -> 0x0179 }
            java.util.LinkedHashMap r18 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0179 }
            r18.<init>()     // Catch:{ all -> 0x0179 }
            r10 = r0
            com.google.android.libraries.search.assistant.f.a.d.cq r10 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r10     // Catch:{ all -> 0x0179 }
            r13 = 0
            r8 = r14
            r0 = r14
            r14 = r17
            r5 = r15
            r15 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0177 }
            java.util.Queue r2 = r2.f86487b     // Catch:{ all -> 0x0177 }
            r2.add(r0)     // Catch:{ all -> 0x0177 }
            r0 = 0
        L_0x0167:
            if (r0 >= r5) goto L_0x016f
            r6.lock()     // Catch:{ all -> 0x0188 }
            int r0 = r0 + 1
            goto L_0x0167
        L_0x016f:
            r4.unlock()     // Catch:{ all -> 0x0188 }
            r2 = 0
            r7.mo63026c(r2)
            return r3
        L_0x0177:
            r0 = move-exception
            goto L_0x017b
        L_0x0179:
            r0 = move-exception
            r5 = r15
        L_0x017b:
            r2 = 0
        L_0x017c:
            if (r2 >= r5) goto L_0x0184
            r6.lock()     // Catch:{ all -> 0x0188 }
            int r2 = r2 + 1
            goto L_0x017c
        L_0x0184:
            r4.unlock()     // Catch:{ all -> 0x0188 }
            throw r0     // Catch:{ all -> 0x0188 }
        L_0x0188:
            r0 = move-exception
            r2 = 0
            goto L_0x018d
        L_0x018b:
            r0 = move-exception
            r2 = r5
        L_0x018d:
            r7.mo63026c(r2)
            throw r0
        L_0x0191:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32313i.mo38036b(com.google.android.libraries.search.assistant.f.a.d.cq, int, boolean, h.c.g):java.lang.Object");
    }
}
