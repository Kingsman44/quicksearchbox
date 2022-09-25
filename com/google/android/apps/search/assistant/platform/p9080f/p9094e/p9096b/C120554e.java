package com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b;

import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3908d.p3909a.C51180k;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62942bv;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71000b;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71054d;

/* renamed from: com.google.android.apps.search.assistant.platform.f.e.b.e */
/* compiled from: PG */
public final class C120554e {

    /* renamed from: b */
    private static final C59071e f335288b = C59071e.m91331h();

    /* renamed from: a */
    public final C21370a f335289a;

    /* renamed from: c */
    private final C71422aw f335290c;

    public C120554e(C71422aw awVar, C21370a aVar) {
        this.f335290c = awVar;
        this.f335289a = aVar;
    }

    /* renamed from: d */
    private final void m199683d(List list) {
        C52076ei eiVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C120563n nVar = (C120563n) it.next();
            C52083ep epVar = nVar.f335319a;
            if (epVar.f136692b == 4) {
                eiVar = (C52076ei) epVar.f136693c;
            } else {
                eiVar = C52076ei.f136664f;
            }
            C51809dy dyVar = eiVar.f136668c;
            if (dyVar == null) {
                dyVar = C51809dy.f135933f;
            }
            C69664n.m101060f(dyVar.f135936b, "session.interaction.from…ant.clientOp.clientOpName");
            nVar.f335320b.mo104300b();
        }
    }

    /* renamed from: e */
    private final void m199684e(List list, List list2) {
        C52076ei eiVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C120563n nVar = (C120563n) it.next();
            Duration ofNanos = Duration.ofNanos(this.f335289a.mo26872d());
            C52083ep epVar = nVar.f335319a;
            if (epVar.f136692b == 4) {
                eiVar = (C52076ei) epVar.f136693c;
            } else {
                eiVar = C52076ei.f136664f;
            }
            C51809dy dyVar = eiVar.f136668c;
            if (dyVar == null) {
                dyVar = C51809dy.f135933f;
            }
            String str = dyVar.f135936b;
            C69664n.m101060f(str, "session.interaction.from…ant.clientOp.clientOpName");
            try {
                C71803m.m105043d(this.f335290c, (C69585o) null, (C71424ay) null, new C120543a(nVar, str, list2, this, ofNanos, (C69577g) null), 3);
            } catch (RuntimeException e) {
                int i = nVar.f335319a.f136694d;
                C59052c cVar = (C59052c) ((C59052c) f335288b.mo56226d()).mo56382g(e);
                cVar.mo56379ah(new C59094n(35487));
                cVar.mo56395y("failed to commit iid=%d, clientOpName = %s", i, str);
                C52083ep epVar2 = nVar.f335319a;
                C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
                C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
                C52235kf kfVar = C52235kf.UNKNOWN;
                kdVar.copyOnWrite();
                C52236kg kgVar = (C52236kg) kdVar.instance;
                kgVar.f137092b = kfVar.f137088t;
                kgVar.f137091a |= 1;
                C52236kg kgVar2 = (C52236kg) kdVar.build();
                dzVar.copyOnWrite();
                C52070ec ecVar = (C52070ec) dzVar.instance;
                kgVar2.getClass();
                ecVar.f136654b = kgVar2;
                ecVar.f136653a |= 1;
                C69664n.m101060f(ofNanos, "startNanos");
                Duration ofNanos2 = Duration.ofNanos(this.f335289a.mo26872d());
                C69664n.m101060f(ofNanos2, "ofNanos(clock.elapsedRealtimeNanos())");
                list2.add(mo104834c(epVar2, (C52070ec) dzVar.build(), ofNanos, ofNanos2));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: j$.time.Duration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: com.google.android.apps.search.assistant.platform.f.e.b.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: j$.time.Duration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: com.google.android.apps.search.assistant.platform.f.e.b.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: com.google.android.apps.search.assistant.platform.f.e.b.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: java.util.Iterator} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public final java.lang.Object mo104832a(int r11, com.google.assistant.p3897e.p3908d.p3909a.C51183n r12, java.util.List r13, java.util.List r14, p5462h.p5466c.C69577g r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120551b
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.google.android.apps.search.assistant.platform.f.e.b.b r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120551b) r0
            int r1 = r0.f335269j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335269j = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.f.e.b.b r0 = new com.google.android.apps.search.assistant.platform.f.e.b.b
            r0.<init>(r10, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f335267h
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f335269j
            r3 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r11 = r0.f335266g
            java.lang.Object r12 = r0.f335265f
            java.lang.Object r13 = r0.f335264e
            java.lang.Object r14 = r0.f335263d
            java.lang.Object r2 = r0.f335262c
            java.lang.Object r4 = r0.f335261b
            java.lang.Object r5 = r0.f335260a
            p5462h.C69714l.m101134b(r15)
            r9 = r15
            r15 = r12
            r12 = r4
            r4 = r1
            r1 = r0
            r0 = r9
            goto L_0x00f3
        L_0x003c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0044:
            p5462h.C69714l.m101134b(r15)
            com.google.protobuf.cq r12 = r12.f133229b
            java.lang.String r15 = "executionPlan.basicBlocksList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r15)
            java.util.Iterator r12 = r12.iterator()
        L_0x0052:
            boolean r15 = r12.hasNext()
            r2 = 0
            if (r15 == 0) goto L_0x0065
            java.lang.Object r15 = r12.next()
            r4 = r15
            com.google.assistant.e.d.a.f r4 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r4
            int r4 = r4.f133208b
            if (r4 != r11) goto L_0x0052
            goto L_0x0066
        L_0x0065:
            r15 = r2
        L_0x0066:
            com.google.assistant.e.d.a.f r15 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r15
            if (r15 == 0) goto L_0x006c
            com.google.protobuf.ch r2 = r15.f133211e
        L_0x006c:
            if (r2 == 0) goto L_0x0153
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r13.iterator()
        L_0x0077:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0097
            java.lang.Object r13 = r12.next()
            r15 = r13
            com.google.android.apps.search.assistant.platform.f.e.b.n r15 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120563n) r15
            com.google.assistant.e.j.ep r15 = r15.f335319a
            int r15 = r15.f136694d
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r15)
            boolean r15 = r2.contains(r4)
            if (r15 == 0) goto L_0x0077
            r11.add(r13)
            goto L_0x0077
        L_0x0097:
            int r12 = r11.size()
            int r13 = r2.size()
            if (r12 != r13) goto L_0x0139
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = p5462h.p5463a.C69540x.m100804k(r11, r13)
            r12.<init>(r13)
            java.util.Iterator r11 = r11.iterator()
            r5 = r10
            r9 = r14
            r14 = r11
            r11 = r12
            r12 = r9
        L_0x00b5:
            boolean r13 = r14.hasNext()
            if (r13 == 0) goto L_0x0138
            java.lang.Object r13 = r14.next()
            com.google.android.apps.search.assistant.platform.f.e.b.n r13 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120563n) r13
            r15 = r5
            com.google.android.apps.search.assistant.platform.f.e.b.e r15 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120554e) r15
            com.google.android.libraries.f.a r15 = r15.f335289a
            long r6 = r15.mo26872d()
            j$.time.Duration r15 = p3186j$.time.Duration.ofNanos(r6)
            com.google.android.apps.search.assistant.platform.b.a.e r2 = r13.f335320b
            com.google.common.util.concurrent.cx r2 = r2.mo104299a()
            java.lang.String r4 = "it.clientOpPrefetchSession.commit()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            r0.f335260a = r5
            r0.f335261b = r12
            r0.f335262c = r11
            r0.f335263d = r14
            r0.f335264e = r13
            r0.f335265f = r15
            r0.f335266g = r11
            r0.f335269j = r3
            java.lang.Object r2 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r0)
            if (r2 == r1) goto L_0x0137
            r4 = r1
            r1 = r0
            r0 = r2
            r2 = r11
        L_0x00f3:
            com.google.assistant.e.j.ec r0 = (com.google.assistant.p3897e.p3921j.C52070ec) r0
            monitor-enter(r12)
            r6 = r13
            com.google.android.apps.search.assistant.platform.f.e.b.n r6 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120563n) r6     // Catch:{ all -> 0x0134 }
            com.google.assistant.e.j.ep r6 = r6.f335319a     // Catch:{ all -> 0x0134 }
            java.lang.String r7 = "startNanos"
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r7)     // Catch:{ all -> 0x0134 }
            r7 = r5
            com.google.android.apps.search.assistant.platform.f.e.b.e r7 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120554e) r7     // Catch:{ all -> 0x0134 }
            com.google.android.libraries.f.a r7 = r7.f335289a     // Catch:{ all -> 0x0134 }
            long r7 = r7.mo26872d()     // Catch:{ all -> 0x0134 }
            j$.time.Duration r7 = p3186j$.time.Duration.ofNanos(r7)     // Catch:{ all -> 0x0134 }
            java.lang.String r8 = "ofNanos(clock.elapsedRealtimeNanos())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)     // Catch:{ all -> 0x0134 }
            r8 = r5
            com.google.android.apps.search.assistant.platform.f.e.b.e r8 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120554e) r8     // Catch:{ all -> 0x0134 }
            j$.time.Duration r15 = (p3186j$.time.Duration) r15     // Catch:{ all -> 0x0134 }
            j.a.c.c.a.d r15 = r8.mo104834c(r6, r0, r15, r7)     // Catch:{ all -> 0x0134 }
            r12.add(r15)     // Catch:{ all -> 0x0134 }
            monitor-exit(r12)
            com.google.android.apps.search.assistant.platform.f.e.b.ae r15 = new com.google.android.apps.search.assistant.platform.f.e.b.ae
            com.google.android.apps.search.assistant.platform.f.e.b.n r13 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120563n) r13
            com.google.assistant.e.j.ep r13 = r13.f335319a
            java.lang.String r6 = "result"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)
            r15.<init>(r13, r0)
            r11.add(r15)
            r0 = r1
            r11 = r2
            r1 = r4
            goto L_0x00b5
        L_0x0134:
            r11 = move-exception
            monitor-exit(r12)
            throw r11
        L_0x0137:
            return r1
        L_0x0138:
            return r11
        L_0x0139:
            java.security.InvalidParameterException r11 = new java.security.InvalidParameterException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "can not find all sessions of "
            r12.<init>(r13)
            java.lang.String r13 = "can not find all sessions of "
            r12.append(r2)
            java.lang.String r12 = r2.toString()
            java.lang.String r12 = r13.concat(r12)
            r11.<init>(r12)
            throw r11
        L_0x0153:
            java.security.InvalidParameterException r12 = new java.security.InvalidParameterException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "block with id="
            r13.<init>(r14)
            r13.append(r11)
            java.lang.String r11 = " is not found"
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r12.<init>(r11)
            goto L_0x016d
        L_0x016c:
            throw r12
        L_0x016d:
            goto L_0x016c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120554e.mo104832a(int, com.google.assistant.e.d.a.n, java.util.List, java.util.List, h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final C71054d mo104834c(C52083ep epVar, C52070ec ecVar, Duration duration, Duration duration2) {
        C69664n.m101061g(epVar, "interaction");
        C69664n.m101061g(duration, "startNanos");
        C69664n.m101061g(duration2, "endNanos");
        C71000b bVar = (C71000b) C71054d.f189493g.createBuilder();
        C69664n.m101060f(bVar, "newBuilder()");
        if (epVar.f136692b == 4) {
            C51809dy dyVar = ((C52076ei) epVar.f136693c).f136668c;
            if (dyVar == null) {
                dyVar = C51809dy.f135933f;
            }
            String str = dyVar.f135936b;
            bVar.copyOnWrite();
            C71054d dVar = (C71054d) bVar.instance;
            str.getClass();
            dVar.f189495a |= 1;
            dVar.f189496b = str;
        }
        if (ecVar != null) {
            C52236kg kgVar = ecVar.f136654b;
            if (kgVar == null) {
                kgVar = C52236kg.f137089d;
            }
            C52235kf a = C52235kf.m86549a(kgVar.f137092b);
            if (a == null) {
                a = C52235kf.OK;
            }
            C69664n.m101060f(a, "result.responseCode.statusCode");
            C51180k kVar = C51180k.NO_OP;
            int ordinal = a.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    bVar.copyOnWrite();
                    C71054d dVar2 = (C71054d) bVar.instance;
                    dVar2.f189498d = 3;
                    dVar2.f189495a |= 4;
                } else if (ordinal != 17) {
                    bVar.copyOnWrite();
                    C71054d dVar3 = (C71054d) bVar.instance;
                    dVar3.f189498d = 2;
                    dVar3.f189495a |= 4;
                }
                int i = a.f137088t;
                bVar.copyOnWrite();
                C71054d dVar4 = (C71054d) bVar.instance;
                dVar4.f189495a = 2 | dVar4.f189495a;
                dVar4.f189497c = i;
            }
            bVar.copyOnWrite();
            C71054d dVar5 = (C71054d) bVar.instance;
            dVar5.f189498d = 1;
            dVar5.f189495a |= 4;
            int i2 = a.f137088t;
            bVar.copyOnWrite();
            C71054d dVar42 = (C71054d) bVar.instance;
            dVar42.f189495a = 2 | dVar42.f189495a;
            dVar42.f189497c = i2;
        }
        long nanos = duration.toNanos();
        bVar.copyOnWrite();
        C71054d dVar6 = (C71054d) bVar.instance;
        dVar6.f189495a |= 8;
        dVar6.f189499e = nanos;
        long nanos2 = duration2.toNanos();
        bVar.copyOnWrite();
        C71054d dVar7 = (C71054d) bVar.instance;
        dVar7.f189495a |= 16;
        dVar7.f189500f = nanos2;
        C62942bv build = bVar.build();
        C69664n.m101060f(build, "metadata.build()");
        return (C71054d) build;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.google.assistant.e.d.a.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.google.assistant.e.d.a.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: com.google.assistant.e.d.a.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: com.google.assistant.e.d.a.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: com.google.assistant.e.d.a.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: com.google.assistant.e.d.a.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: com.google.assistant.e.d.a.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: com.google.assistant.e.d.a.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v35, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: com.google.assistant.e.d.a.n} */
    /* JADX WARNING: type inference failed for: r4v11, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r12 = r11.f133225c;
        p5462h.p5473f.p5475b.C69664n.m101060f(r12, "instruction.bbArgsList");
        r15 = r10.keySet();
        p5462h.p5473f.p5475b.C69664n.m101061g(r12, "<this>");
        p5462h.p5473f.p5475b.C69664n.m101061g(r15, "other");
        r6 = p5462h.p5463a.C69540x.m100845aa(r12);
        p5462h.p5463a.C69540x.m100813t(r6, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ba, code lost:
        if (r6.isEmpty() == false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bc, code lost:
        r6 = r11.f133225c;
        p5462h.p5473f.p5475b.C69664n.m101060f(r6, "instruction.bbArgsList");
        r6 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c5, code lost:
        r14 = r18;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r0 = p5462h.p5463a.C69540x.m100851ag(r6, ",", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (p5462h.p5473f.p5474a.C69626l) null, 62);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013c, code lost:
        throw new java.lang.IllegalStateException("can not join, block is not running [" + r0 + "]");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c A[Catch:{ all -> 0x027a }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cd A[Catch:{ all -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104833b(java.util.List r27, com.google.assistant.p3897e.p3908d.p3909a.C51183n r28, java.util.List r29, p5462h.p5466c.C69577g r30) {
        /*
            r26 = this;
            r0 = r30
            boolean r1 = r0 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120552c
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.google.android.apps.search.assistant.platform.f.e.b.c r1 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120552c) r1
            int r2 = r1.f335281l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f335281l = r2
            r2 = r26
            goto L_0x001e
        L_0x0017:
            com.google.android.apps.search.assistant.platform.f.e.b.c r1 = new com.google.android.apps.search.assistant.platform.f.e.b.c
            r2 = r26
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f335279j
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r1.f335281l
            r5 = 1
            if (r4 == 0) goto L_0x0058
            if (r4 != r5) goto L_0x0050
            java.lang.Object r4 = r1.f335278i
            java.lang.Object r7 = r1.f335277h
            java.lang.Object r8 = r1.f335276g
            java.lang.Object r9 = r1.f335275f
            java.lang.Object r10 = r1.f335274e
            java.lang.Object r11 = r1.f335273d
            java.lang.Object r12 = r1.f335272c
            java.lang.Object r13 = r1.f335271b
            java.lang.Object r14 = r1.f335270a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x004a }
            r6 = r7
            r7 = r1
            r1 = r13
            r25 = r8
            r8 = r3
            r3 = r11
            r11 = r10
            r10 = r25
            goto L_0x00fc
        L_0x004a:
            r0 = move-exception
            r3 = r11
            r4 = r12
            r1 = r13
            goto L_0x0289
        L_0x0050:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0058:
            p5462h.C69714l.m101134b(r0)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0280 }
            r0.<init>()     // Catch:{ all -> 0x0280 }
            r4 = r28
            com.google.protobuf.cq r7 = r4.f133230c     // Catch:{ all -> 0x027e }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x027e }
            r18 = r2
            r8 = r3
            r9 = r7
            r3 = r29
            r7 = r1
            r1 = r27
        L_0x0076:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x027a }
            if (r11 == 0) goto L_0x01e3
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x027a }
            com.google.assistant.e.d.a.l r11 = (com.google.assistant.p3897e.p3908d.p3909a.C51181l) r11     // Catch:{ all -> 0x027a }
            int r12 = r11.f133224b     // Catch:{ all -> 0x027a }
            com.google.assistant.e.d.a.k r12 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.m86072a(r12)     // Catch:{ all -> 0x027a }
            if (r12 != 0) goto L_0x008c
            com.google.assistant.e.d.a.k r12 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.NO_OP     // Catch:{ all -> 0x027a }
        L_0x008c:
            com.google.assistant.e.j.kf r13 = com.google.assistant.p3897e.p3921j.C52235kf.OK     // Catch:{ all -> 0x027a }
            int r12 = r12.ordinal()     // Catch:{ all -> 0x027a }
            java.lang.String r13 = "]"
            java.lang.String r14 = "instruction.bbArgsList"
            if (r12 == r5) goto L_0x013d
            r15 = 2
            if (r12 == r15) goto L_0x009c
            goto L_0x0076
        L_0x009c:
            com.google.protobuf.ch r12 = r11.f133225c     // Catch:{ all -> 0x027a }
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r14)     // Catch:{ all -> 0x027a }
            java.util.Set r15 = r10.keySet()     // Catch:{ all -> 0x027a }
            java.lang.String r6 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r6)     // Catch:{ all -> 0x027a }
            java.lang.String r6 = "other"
            p5462h.p5473f.p5475b.C69664n.m101061g(r15, r6)     // Catch:{ all -> 0x027a }
            java.util.Set r6 = p5462h.p5463a.C69540x.m100845aa(r12)     // Catch:{ all -> 0x027a }
            p5462h.p5463a.C69540x.m100813t(r6, r15)     // Catch:{ all -> 0x027a }
            boolean r12 = r6.isEmpty()     // Catch:{ all -> 0x027a }
            if (r12 == 0) goto L_0x0113
            com.google.protobuf.ch r6 = r11.f133225c     // Catch:{ all -> 0x027a }
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r14)     // Catch:{ all -> 0x027a }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x027a }
            r14 = r18
        L_0x00c7:
            boolean r11 = r6.hasNext()     // Catch:{ all -> 0x0110 }
            if (r11 == 0) goto L_0x010c
            java.lang.Object r11 = r6.next()     // Catch:{ all -> 0x0110 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x0110 }
            java.lang.Object r11 = r10.get(r11)     // Catch:{ all -> 0x0110 }
            p5462h.p5473f.p5475b.C69664n.m101058d(r11)     // Catch:{ all -> 0x0110 }
            kotlinx.coroutines.be r11 = (kotlinx.coroutines.C71604be) r11     // Catch:{ all -> 0x0110 }
            r7.f335270a = r14     // Catch:{ all -> 0x0110 }
            r7.f335271b = r1     // Catch:{ all -> 0x0110 }
            r7.f335272c = r4     // Catch:{ all -> 0x0110 }
            r7.f335273d = r3     // Catch:{ all -> 0x0110 }
            r7.f335274e = r10     // Catch:{ all -> 0x0110 }
            r7.f335275f = r0     // Catch:{ all -> 0x0110 }
            r7.f335276g = r9     // Catch:{ all -> 0x0110 }
            r7.f335277h = r6     // Catch:{ all -> 0x0110 }
            r7.f335278i = r0     // Catch:{ all -> 0x0110 }
            r7.f335281l = r5     // Catch:{ all -> 0x0110 }
            java.lang.Object r11 = r11.mo62825a(r7)     // Catch:{ all -> 0x0110 }
            if (r11 == r8) goto L_0x010b
            r12 = r4
            r4 = r0
            r0 = r11
            r11 = r10
            r10 = r9
            r9 = r4
        L_0x00fc:
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0106 }
            p5462h.p5463a.C69540x.m100811r(r4, r0)     // Catch:{ all -> 0x0106 }
            r0 = r9
            r9 = r10
            r10 = r11
            r4 = r12
            goto L_0x00c7
        L_0x0106:
            r0 = move-exception
            r10 = r11
            r4 = r12
            goto L_0x0289
        L_0x010b:
            return r8
        L_0x010c:
            r18 = r14
            goto L_0x0076
        L_0x0110:
            r0 = move-exception
            goto L_0x0289
        L_0x0113:
            java.lang.String r20 = ","
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 62
            r19 = r6
            java.lang.String r0 = p5462h.p5463a.C69540x.m100851ag(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x027a }
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x027a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x027a }
            r6.<init>()     // Catch:{ all -> 0x027a }
            java.lang.String r7 = "can not join, block is not running ["
            r6.append(r7)     // Catch:{ all -> 0x027a }
            r6.append(r0)     // Catch:{ all -> 0x027a }
            r6.append(r13)     // Catch:{ all -> 0x027a }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x027a }
            r5.<init>(r0)     // Catch:{ all -> 0x027a }
            throw r5     // Catch:{ all -> 0x027a }
        L_0x013d:
            com.google.protobuf.ch r6 = r11.f133225c     // Catch:{ all -> 0x027a }
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r14)     // Catch:{ all -> 0x027a }
            java.util.Set r12 = r10.keySet()     // Catch:{ all -> 0x027a }
            java.util.Set r19 = p5462h.p5463a.C69540x.m100844Z(r6, r12)     // Catch:{ all -> 0x027a }
            boolean r6 = r19.isEmpty()     // Catch:{ all -> 0x027a }
            if (r6 == 0) goto L_0x01bb
            com.google.protobuf.ch r6 = r11.f133225c     // Catch:{ all -> 0x027a }
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r14)     // Catch:{ all -> 0x027a }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x027a }
            r11 = 10
            int r11 = p5462h.p5463a.C69540x.m100804k(r6, r11)     // Catch:{ all -> 0x027a }
            r15.<init>(r11)     // Catch:{ all -> 0x027a }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x027a }
        L_0x0164:
            boolean r11 = r6.hasNext()     // Catch:{ all -> 0x027a }
            if (r11 == 0) goto L_0x01b5
            java.lang.Object r11 = r6.next()     // Catch:{ all -> 0x027a }
            r14 = r11
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x027a }
            java.lang.String r11 = "it"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r11)     // Catch:{ all -> 0x027a }
            r11 = r18
            com.google.android.apps.search.assistant.platform.f.e.b.e r11 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120554e) r11     // Catch:{ all -> 0x027a }
            kotlinx.coroutines.aw r13 = r11.f335290c     // Catch:{ all -> 0x027a }
            com.google.android.apps.search.assistant.platform.f.e.b.d r12 = new com.google.android.apps.search.assistant.platform.f.e.b.d     // Catch:{ all -> 0x027a }
            r16 = r18
            com.google.android.apps.search.assistant.platform.f.e.b.e r16 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120554e) r16     // Catch:{ all -> 0x027a }
            r17 = r4
            com.google.assistant.e.d.a.n r17 = (com.google.assistant.p3897e.p3908d.p3909a.C51183n) r17     // Catch:{ all -> 0x027a }
            r19 = 0
            r11 = r12
            r5 = r12
            r12 = r16
            r2 = r13
            r13 = r14
            r27 = r6
            r6 = r14
            r14 = r17
            r28 = r7
            r7 = r15
            r15 = r1
            r16 = r3
            r17 = r19
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x027a }
            r11 = 3
            r12 = 0
            kotlinx.coroutines.be r2 = kotlinx.coroutines.C71803m.m105042c(r2, r12, r12, r5, r11)     // Catch:{ all -> 0x027a }
            r10.put(r6, r2)     // Catch:{ all -> 0x027a }
            h.q r2 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x027a }
            r7.add(r2)     // Catch:{ all -> 0x027a }
            r2 = r26
            r6 = r27
            r15 = r7
            r5 = 1
            r7 = r28
            goto L_0x0164
        L_0x01b5:
            r28 = r7
            r2 = r26
            goto L_0x0076
        L_0x01bb:
            java.lang.String r20 = ","
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 62
            java.lang.String r0 = p5462h.p5463a.C69540x.m100851ag(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x027a }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x027a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x027a }
            r5.<init>()     // Catch:{ all -> 0x027a }
            java.lang.String r6 = "can not start, block is already running. ["
            r5.append(r6)     // Catch:{ all -> 0x027a }
            r5.append(r0)     // Catch:{ all -> 0x027a }
            r5.append(r13)     // Catch:{ all -> 0x027a }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x027a }
            r2.<init>(r0)     // Catch:{ all -> 0x027a }
            throw r2     // Catch:{ all -> 0x027a }
        L_0x01e3:
            java.util.Set r2 = r10.keySet()
            com.google.assistant.e.d.a.n r4 = (com.google.assistant.p3897e.p3908d.p3909a.C51183n) r4
            java.util.List r2 = com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120556g.m199688a(r4, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r1.iterator()
        L_0x01f6:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x022e
            java.lang.Object r6 = r5.next()
            r7 = r6
            com.google.android.apps.search.assistant.platform.f.e.b.n r7 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120563n) r7
            com.google.assistant.e.j.ep r8 = r7.f335319a
            int r9 = r8.f136692b
            r10 = 4
            if (r9 != r10) goto L_0x020f
            java.lang.Object r8 = r8.f136693c
            com.google.assistant.e.j.ei r8 = (com.google.assistant.p3897e.p3921j.C52076ei) r8
            goto L_0x0211
        L_0x020f:
            com.google.assistant.e.j.ei r8 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x0211:
            com.google.assistant.e.j.dy r8 = r8.f136668c
            if (r8 != 0) goto L_0x0217
            com.google.assistant.e.j.dy r8 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x0217:
            boolean r8 = r8.f135939e
            if (r8 == 0) goto L_0x01f6
            com.google.assistant.e.j.ep r7 = r7.f335319a
            int r7 = r7.f136694d
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            boolean r7 = r2.contains(r8)
            if (r7 != 0) goto L_0x01f6
            r4.add(r6)
            goto L_0x01f6
        L_0x022e:
            r5 = r18
            com.google.android.apps.search.assistant.platform.f.e.b.e r5 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120554e) r5
            r5.m199684e(r4, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x023e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0276
            java.lang.Object r4 = r1.next()
            r6 = r4
            com.google.android.apps.search.assistant.platform.f.e.b.n r6 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120563n) r6
            com.google.assistant.e.j.ep r7 = r6.f335319a
            int r8 = r7.f136692b
            r9 = 4
            if (r8 != r9) goto L_0x0257
            java.lang.Object r7 = r7.f136693c
            com.google.assistant.e.j.ei r7 = (com.google.assistant.p3897e.p3921j.C52076ei) r7
            goto L_0x0259
        L_0x0257:
            com.google.assistant.e.j.ei r7 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x0259:
            com.google.assistant.e.j.dy r7 = r7.f136668c
            if (r7 != 0) goto L_0x025f
            com.google.assistant.e.j.dy r7 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x025f:
            boolean r7 = r7.f135939e
            if (r7 != 0) goto L_0x023e
            com.google.assistant.e.j.ep r6 = r6.f335319a
            int r6 = r6.f136694d
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            boolean r6 = r2.contains(r7)
            if (r6 != 0) goto L_0x023e
            r3.add(r4)
            goto L_0x023e
        L_0x0276:
            r5.m199683d(r3)
            return r0
        L_0x027a:
            r0 = move-exception
            r14 = r18
            goto L_0x0289
        L_0x027e:
            r0 = move-exception
            goto L_0x0283
        L_0x0280:
            r0 = move-exception
            r4 = r28
        L_0x0283:
            r14 = r26
            r1 = r27
            r3 = r29
        L_0x0289:
            java.util.Set r2 = r10.keySet()
            com.google.assistant.e.d.a.n r4 = (com.google.assistant.p3897e.p3908d.p3909a.C51183n) r4
            java.util.List r2 = com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120556g.m199688a(r4, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r1.iterator()
        L_0x029c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02d4
            java.lang.Object r6 = r5.next()
            r7 = r6
            com.google.android.apps.search.assistant.platform.f.e.b.n r7 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120563n) r7
            com.google.assistant.e.j.ep r8 = r7.f335319a
            int r9 = r8.f136692b
            r10 = 4
            if (r9 != r10) goto L_0x02b5
            java.lang.Object r8 = r8.f136693c
            com.google.assistant.e.j.ei r8 = (com.google.assistant.p3897e.p3921j.C52076ei) r8
            goto L_0x02b7
        L_0x02b5:
            com.google.assistant.e.j.ei r8 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x02b7:
            com.google.assistant.e.j.dy r8 = r8.f136668c
            if (r8 != 0) goto L_0x02bd
            com.google.assistant.e.j.dy r8 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x02bd:
            boolean r8 = r8.f135939e
            if (r8 == 0) goto L_0x029c
            com.google.assistant.e.j.ep r7 = r7.f335319a
            int r7 = r7.f136694d
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            boolean r7 = r2.contains(r8)
            if (r7 != 0) goto L_0x029c
            r4.add(r6)
            goto L_0x029c
        L_0x02d4:
            com.google.android.apps.search.assistant.platform.f.e.b.e r14 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120554e) r14
            r14.m199684e(r4, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x02e2:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x031a
            java.lang.Object r4 = r1.next()
            r5 = r4
            com.google.android.apps.search.assistant.platform.f.e.b.n r5 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120563n) r5
            com.google.assistant.e.j.ep r6 = r5.f335319a
            int r7 = r6.f136692b
            r8 = 4
            if (r7 != r8) goto L_0x02fb
            java.lang.Object r6 = r6.f136693c
            com.google.assistant.e.j.ei r6 = (com.google.assistant.p3897e.p3921j.C52076ei) r6
            goto L_0x02fd
        L_0x02fb:
            com.google.assistant.e.j.ei r6 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x02fd:
            com.google.assistant.e.j.dy r6 = r6.f136668c
            if (r6 != 0) goto L_0x0303
            com.google.assistant.e.j.dy r6 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x0303:
            boolean r6 = r6.f135939e
            if (r6 != 0) goto L_0x02e2
            com.google.assistant.e.j.ep r5 = r5.f335319a
            int r5 = r5.f136694d
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            boolean r5 = r2.contains(r6)
            if (r5 != 0) goto L_0x02e2
            r3.add(r4)
            goto L_0x02e2
        L_0x031a:
            r14.m199683d(r3)
            goto L_0x031f
        L_0x031e:
            throw r0
        L_0x031f:
            goto L_0x031e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120554e.mo104833b(java.util.List, com.google.assistant.e.d.a.n, java.util.List, h.c.g):java.lang.Object");
    }
}
