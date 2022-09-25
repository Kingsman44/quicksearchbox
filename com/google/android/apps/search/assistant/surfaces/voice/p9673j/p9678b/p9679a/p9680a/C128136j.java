package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9680a;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128174f;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.j */
/* compiled from: PG */
public final /* synthetic */ class C128136j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C128148v f352521a;

    /* renamed from: b */
    public final /* synthetic */ C70862aj f352522b;

    /* renamed from: c */
    public final /* synthetic */ C128174f f352523c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f352524d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f352525e;

    public /* synthetic */ C128136j(C128148v vVar, C70862aj ajVar, C128174f fVar, C60870cx cxVar, ArrayList arrayList) {
        this.f352521a = vVar;
        this.f352522b = ajVar;
        this.f352523c = fVar;
        this.f352524d = cxVar;
        this.f352525e = arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r15 = this;
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.v r0 = r15.f352521a
            io.grpc.i.aj r1 = r15.f352522b
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.f r2 = r15.f352523c
            com.google.common.util.concurrent.cx r3 = r15.f352524d
            java.util.ArrayList r4 = r15.f352525e
            com.google.android.libraries.search.b.b r5 = r0.f352542d
            com.google.android.libraries.search.b.i.g r6 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96962ca
            r5.mo19974a(r6)
            java.lang.Object r3 = com.google.common.util.concurrent.C60856cj.m92909r(r3)
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.c.k r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9682c.C128163k) r3
            com.google.android.apps.search.assistant.platform.pcp.f.b r5 = r2.f352602c
            if (r5 != 0) goto L_0x001d
            com.google.android.apps.search.assistant.platform.pcp.f.b r5 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123733b.f341776d
        L_0x001d:
            com.google.android.apps.search.assistant.platform.pcp.f.t r5 = r5.f341780b
            if (r5 != 0) goto L_0x0023
            com.google.android.apps.search.assistant.platform.pcp.f.t r5 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123791t.f341978d
        L_0x0023:
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r4)
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.o r6 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9680a.C128141o.f352530a
            j$.util.stream.Stream r4 = r4.flatMap(r6)
            j$.util.stream.Collector r6 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r4 = r4.collect(r6)
            com.google.common.b.gu r4 = (com.google.common.p4522b.C58485gu) r4
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.c.l r6 = r0.f352541c
            com.google.common.b.ih r7 = new com.google.common.b.ih
            r7.<init>()
            com.google.android.apps.gsa.nga.shared.h.ab r8 = r3.mo108348a()
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.j r9 = r3.mo108349b()
            boolean r10 = r5.f341982c
            r11 = 1
            if (r10 != 0) goto L_0x007b
            android.app.KeyguardManager r10 = r6.f352582k
            boolean r10 = r10.isKeyguardLocked()
            if (r10 != 0) goto L_0x007b
            int r10 = r5.f341980a
            r10 = r10 & r11
            if (r10 == 0) goto L_0x007b
            java.lang.String r10 = r5.f341981b
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.e r12 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128194e.f352655e
            r10.getClass()
            com.google.protobuf.dn r9 = r9.f352704d
            boolean r13 = r9.containsKey(r10)
            if (r13 == 0) goto L_0x006c
            java.lang.Object r9 = r9.get(r10)
            r12 = r9
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.e r12 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128194e) r12
        L_0x006c:
            long r9 = r12.f352658b
            long r12 = r6.f352576e
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x007b
            java.lang.String r9 = r5.f341981b
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.m r9 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128181m.OVER_APP
            r7.mo55373c(r9)
        L_0x007b:
            boolean r9 = r6.f352572a
            if (r9 == 0) goto L_0x0084
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.m r9 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128181m.NEW_USER
            r7.mo55373c(r9)
        L_0x0084:
            int r9 = r8.f222389h
            long r9 = (long) r9
            long r12 = r6.f352574c
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x009b
            int r9 = r8.f222390i
            long r9 = (long) r9
            long r12 = r6.f352575d
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x009b
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.m r9 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128181m.NEW_USER
            r7.mo55373c(r9)
        L_0x009b:
            com.google.protobuf.ck r9 = r8.f222391j
            int r9 = r9.size()
            if (r9 != 0) goto L_0x00a8
            j$.util.Optional r8 = p3186j$.util.Optional.empty()
            goto L_0x00be
        L_0x00a8:
            com.google.protobuf.ck r9 = r8.f222391j
            int r9 = r9.size()
            com.google.protobuf.ck r8 = r8.f222391j
            int r9 = r9 + -1
            long r8 = r8.mo58927a(r9)
            j$.time.Instant r8 = p3186j$.time.Instant.ofEpochMilli(r8)
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r8)
        L_0x00be:
            boolean r9 = r8.isPresent()
            if (r9 != 0) goto L_0x00c9
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.m r9 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128181m.NEW_USER
            r7.mo55373c(r9)
        L_0x00c9:
            boolean r9 = r8.isPresent()
            if (r9 == 0) goto L_0x00f3
            java.lang.Object r9 = r8.get()
            j$.time.Instant r9 = (p3186j$.time.Instant) r9
            j$.time.Duration r10 = r6.f352573b
            j$.time.Instant r9 = r9.plus(r10)
            com.google.common.v.i r10 = r6.f352580i
            j$.time.Instant r10 = r10.mo57444a()
            boolean r9 = r9.isBefore(r10)
            if (r9 == 0) goto L_0x00f3
            j$.time.Duration r6 = r6.f352573b
            j$.time.Instant r6 = p3186j$.time.Instant.EPOCH
            r8.orElse(r6)
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.m r6 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128181m.INACTIVE_USER
            r7.mo55373c(r6)
        L_0x00f3:
            com.google.common.b.ij r6 = r7.mo55486f()
            com.google.common.b.gu r6 = r6.mo55229u()
            j$.util.stream.Stream r6 = p3186j$.util.Collection.EL.stream(r6)
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.n r7 = new com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.n
            r7.<init>(r4)
            j$.util.stream.Stream r6 = r6.filter(r7)
            j$.util.Optional r6 = r6.findFirst()
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x0118
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.h r2 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128176h.f352604d
            goto L_0x0230
        L_0x0118:
            com.google.android.apps.search.assistant.platform.pcp.f.b r7 = r2.f352602c
            if (r7 != 0) goto L_0x011e
            com.google.android.apps.search.assistant.platform.pcp.f.b r7 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123733b.f341776d
        L_0x011e:
            java.lang.Object r8 = r6.get()
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.m r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128181m) r8
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r4)
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.m r9 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128181m.OVER_APP
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x0136
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.r r9 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9680a.C128144r.f352533a
            j$.util.stream.Stream r4 = r4.filter(r9)
        L_0x0136:
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.s r9 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9680a.C128145s.f352534a
            j$.util.stream.Collector r9 = p3186j$.util.stream.Collectors.toCollection(r9)
            java.lang.Object r4 = r4.collect(r9)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.t r9 = new com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.t
            r9.<init>(r8, r3, r7)
            java.util.Comparator r3 = p3186j$.util.Comparator.CC.comparingLong(r9)
            java.util.Collections.sort(r4, r3)
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r4)
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.a r7 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9680a.C128127a.f352507a
            boolean r3 = r3.noneMatch(r7)
            if (r3 == 0) goto L_0x015e
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.h r2 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128176h.f352604d
            goto L_0x0230
        L_0x015e:
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.h r3 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128176h.f352604d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.g r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128175g) r3
            int r2 = r2.f352601b
            java.util.Iterator r4 = r4.iterator()
            r7 = 0
            r8 = 0
        L_0x016e:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x01a6
            java.lang.Object r9 = r4.next()
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.j r9 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128178j) r9
            if (r7 != r2) goto L_0x017d
            goto L_0x01a6
        L_0x017d:
            boolean r10 = r9.f352618g
            if (r10 == 0) goto L_0x0186
            if (r8 == r2) goto L_0x016e
            int r8 = r8 + 1
            goto L_0x0188
        L_0x0186:
            int r7 = r7 + 1
        L_0x0188:
            r3.copyOnWrite()
            com.google.protobuf.bv r10 = r3.instance
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.h r10 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128176h) r10
            r9.getClass()
            com.google.protobuf.cq r12 = r10.f352607b
            boolean r13 = r12.mo58948c()
            if (r13 != 0) goto L_0x01a0
            com.google.protobuf.cq r12 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r12)
            r10.f352607b = r12
        L_0x01a0:
            com.google.protobuf.cq r10 = r10.f352607b
            r10.add(r9)
            goto L_0x016e
        L_0x01a6:
            java.lang.Object r2 = r6.get()
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.m r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128181m) r2
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.n r4 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128182n.f352629e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.k r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128179k) r4
            android.app.KeyguardManager r7 = r0.f352543e
            boolean r7 = r7.isKeyguardLocked()
            if (r7 == 0) goto L_0x01cd
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.n r5 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128182n) r5
            r7 = 2
            r5.f352632b = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r11)
            r5.f352633c = r7
            goto L_0x01f7
        L_0x01cd:
            boolean r7 = r5.f341982c
            if (r7 == 0) goto L_0x01e1
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.n r5 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128182n) r5
            r5.f352632b = r11
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r11)
            r5.f352633c = r7
            goto L_0x01f7
        L_0x01e1:
            int r7 = r5.f341980a
            r7 = r7 & r11
            if (r7 == 0) goto L_0x01f7
            java.lang.String r5 = r5.f341981b
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.n r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128182n) r7
            r5.getClass()
            r8 = 3
            r7.f352632b = r8
            r7.f352633c = r5
        L_0x01f7:
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.n r5 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128182n) r5
            int r2 = r2.f352628e
            r5.f352634d = r2
            int r2 = r5.f352631a
            r2 = r2 | 8
            r5.f352631a = r2
            com.google.protobuf.bv r2 = r4.build()
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.n r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128182n) r2
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.h r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128176h) r4
            r2.getClass()
            r4.f352608c = r2
            int r2 = r4.f352606a
            r2 = r2 | r11
            r4.f352606a = r2
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.Object r2 = r6.get()
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.m r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128181m) r2
            r2.name()
            com.google.protobuf.bv r2 = r3.build()
            com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.h r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128176h) r2
        L_0x0230:
            r1.mo20123c(r2)
            com.google.android.libraries.search.b.b r0 = r0.f352542d
            com.google.android.libraries.search.b.i.f r2 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96907bY
            com.google.android.libraries.search.b.i.a r2 = r2.mo40804b()
            r0.mo19974a(r2)
            r1.mo20121a()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9680a.C128136j.call():java.lang.Object");
    }
}
