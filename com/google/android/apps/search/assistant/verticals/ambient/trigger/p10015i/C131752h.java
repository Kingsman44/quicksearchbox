package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10015i;

import com.google.assistant.p4016z.C53734s;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.i.h */
/* compiled from: PG */
public final /* synthetic */ class C131752h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131755k f359904a;

    /* renamed from: b */
    public final /* synthetic */ C53734s f359905b;

    /* renamed from: c */
    public final /* synthetic */ long f359906c;

    public /* synthetic */ C131752h(C131755k kVar, C53734s sVar, long j) {
        this.f359904a = kVar;
        this.f359905b = sVar;
        this.f359906c = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x026e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            com.google.android.apps.search.assistant.verticals.ambient.trigger.i.k r7 = r0.f359904a
            com.google.assistant.z.s r3 = r0.f359905b
            long r5 = r0.f359906c
            r4 = r18
            com.google.assistant.z.w r4 = (com.google.assistant.p4016z.C53738w) r4
            com.google.android.apps.search.assistant.verticals.ambient.trigger.i.e r1 = r7.f359916c
            java.util.concurrent.atomic.AtomicReference r2 = r1.f359897a
            java.lang.Object r2 = r2.get()
            r8 = 0
            r9 = 1
            if (r2 != 0) goto L_0x001a
        L_0x0018:
            r2 = 0
            goto L_0x0069
        L_0x001a:
            com.google.cg.k r2 = r4.f141082b
            if (r2 != 0) goto L_0x0020
            com.google.cg.k r2 = com.google.p4479cg.C58079k.f155250c
        L_0x0020:
            double r10 = r2.f155252a
            com.google.cg.k r2 = r4.f141082b
            if (r2 != 0) goto L_0x0028
            com.google.cg.k r2 = com.google.p4479cg.C58079k.f155250c
        L_0x0028:
            double r12 = r2.f155253b
            com.google.common.g.at r2 = com.google.common.p4535g.C59127at.m91610b(r10, r12)
            java.util.concurrent.atomic.AtomicReference r10 = r1.f359897a
            java.lang.Object r10 = r10.get()
            com.google.assistant.z.w r10 = (com.google.assistant.p4016z.C53738w) r10
            com.google.cg.k r10 = r10.f141082b
            if (r10 != 0) goto L_0x003c
            com.google.cg.k r10 = com.google.p4479cg.C58079k.f155250c
        L_0x003c:
            double r10 = r10.f155252a
            java.util.concurrent.atomic.AtomicReference r12 = r1.f359897a
            java.lang.Object r12 = r12.get()
            com.google.assistant.z.w r12 = (com.google.assistant.p4016z.C53738w) r12
            com.google.cg.k r12 = r12.f141082b
            if (r12 != 0) goto L_0x004c
            com.google.cg.k r12 = com.google.p4479cg.C58079k.f155250c
        L_0x004c:
            double r12 = r12.f155253b
            com.google.common.g.at r10 = com.google.common.p4535g.C59127at.m91610b(r10, r12)
            com.google.common.g.l r2 = r2.mo56452a(r10)
            com.google.common.n.g.c r2 = com.google.p381aj.p385b.C8262a.m22968a(r2)
            double r10 = r2.mo56958a()
            java.lang.Double r2 = r1.f359900d
            double r12 = r2.doubleValue()
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x0018
            r2 = 1
        L_0x0069:
            com.google.assistant.z.aa r10 = r4.f141083c
            if (r10 != 0) goto L_0x006f
            com.google.assistant.z.aa r10 = com.google.assistant.p4016z.C53676aa.f140889i
        L_0x006f:
            float r10 = r10.f140893c
            double r10 = (double) r10
            java.lang.Double r12 = r1.f359898b
            double r12 = r12.doubleValue()
            r15 = 3
            r14 = 2
            int r16 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x00b4
            com.google.android.apps.search.assistant.verticals.ambient.trigger.i.c r1 = com.google.android.apps.search.assistant.verticals.ambient.trigger.p10015i.C131748d.m214230e()
            r1.mo110290d(r9)
            java.util.Locale r10 = java.util.Locale.US
            java.lang.Object[] r11 = new java.lang.Object[r14]
            com.google.assistant.z.aa r12 = r4.f141083c
            if (r12 != 0) goto L_0x008f
            com.google.assistant.z.aa r12 = com.google.assistant.p4016z.C53676aa.f140889i
        L_0x008f:
            float r12 = r12.f140893c
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r11[r8] = r12
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            r11[r9] = r8
            java.lang.String r8 = "Accuracy radius too large: %.1fm, clear chips: %b"
            java.lang.String r8 = java.lang.String.format(r10, r8, r11)
            r1.mo110288b(r8)
            r8 = r1
            com.google.android.apps.search.assistant.verticals.ambient.trigger.i.a r8 = (com.google.android.apps.search.assistant.verticals.ambient.trigger.p10015i.C131745a) r8
            r8.f359889b = r15
            r1.mo110289c(r2)
            com.google.android.apps.search.assistant.verticals.ambient.trigger.i.d r1 = r1.mo110287a()
            goto L_0x015c
        L_0x00b4:
            com.google.assistant.z.aa r10 = r4.f141083c
            if (r10 != 0) goto L_0x00ba
            com.google.assistant.z.aa r10 = com.google.assistant.p4016z.C53676aa.f140889i
        L_0x00ba:
            com.google.protobuf.ar r10 = r10.f140898h
            if (r10 != 0) goto L_0x00c0
            com.google.protobuf.ar r10 = com.google.protobuf.C62910ar.f169858c
        L_0x00c0:
            com.google.protobuf.ar r11 = r1.f359901e
            int r10 = com.google.protobuf.p4750c.C62948a.m95450a(r10, r11)
            if (r10 <= 0) goto L_0x0103
            com.google.android.apps.search.assistant.verticals.ambient.trigger.i.c r1 = com.google.android.apps.search.assistant.verticals.ambient.trigger.p10015i.C131748d.m214230e()
            r1.mo110290d(r9)
            java.util.Locale r10 = java.util.Locale.US
            java.lang.Object[] r11 = new java.lang.Object[r14]
            com.google.assistant.z.aa r12 = r4.f141083c
            if (r12 != 0) goto L_0x00d9
            com.google.assistant.z.aa r12 = com.google.assistant.p4016z.C53676aa.f140889i
        L_0x00d9:
            com.google.protobuf.ar r12 = r12.f140898h
            if (r12 != 0) goto L_0x00df
            com.google.protobuf.ar r12 = com.google.protobuf.C62910ar.f169858c
        L_0x00df:
            long r12 = r12.f169860a
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r11[r8] = r12
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            r11[r9] = r8
            java.lang.String r8 = "Location too old: %d seconds, clear chips: %b"
            java.lang.String r8 = java.lang.String.format(r10, r8, r11)
            r1.mo110288b(r8)
            r8 = r1
            com.google.android.apps.search.assistant.verticals.ambient.trigger.i.a r8 = (com.google.android.apps.search.assistant.verticals.ambient.trigger.p10015i.C131745a) r8
            r8.f359889b = r14
            r1.mo110289c(r2)
            com.google.android.apps.search.assistant.verticals.ambient.trigger.i.d r1 = r1.mo110287a()
            goto L_0x015c
        L_0x0103:
            com.google.assistant.z.aa r10 = r4.f141083c
            if (r10 != 0) goto L_0x0109
            com.google.assistant.z.aa r10 = com.google.assistant.p4016z.C53676aa.f140889i
        L_0x0109:
            float r10 = r10.f140895e
            double r10 = (double) r10
            java.lang.Double r12 = r1.f359899c
            double r12 = r12.doubleValue()
            int r16 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x014c
            com.google.android.apps.search.assistant.verticals.ambient.trigger.i.c r1 = com.google.android.apps.search.assistant.verticals.ambient.trigger.p10015i.C131748d.m214230e()
            r1.mo110290d(r9)
            java.util.Locale r10 = java.util.Locale.US
            java.lang.Object[] r11 = new java.lang.Object[r14]
            com.google.assistant.z.aa r12 = r4.f141083c
            if (r12 != 0) goto L_0x0127
            com.google.assistant.z.aa r12 = com.google.assistant.p4016z.C53676aa.f140889i
        L_0x0127:
            float r12 = r12.f140895e
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r11[r8] = r12
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r11[r9] = r2
            java.lang.String r2 = "Speed too high: %.1fm/s, clear chips: %b"
            java.lang.String r2 = java.lang.String.format(r10, r2, r11)
            r1.mo110288b(r2)
            r2 = r1
            com.google.android.apps.search.assistant.verticals.ambient.trigger.i.a r2 = (com.google.android.apps.search.assistant.verticals.ambient.trigger.p10015i.C131745a) r2
            r8 = 4
            r2.f359889b = r8
            r1.mo110289c(r9)
            com.google.android.apps.search.assistant.verticals.ambient.trigger.i.d r1 = r1.mo110287a()
            goto L_0x015c
        L_0x014c:
            java.util.concurrent.atomic.AtomicReference r1 = r1.f359897a
            r1.set(r4)
            com.google.android.apps.search.assistant.verticals.ambient.trigger.i.c r1 = com.google.android.apps.search.assistant.verticals.ambient.trigger.p10015i.C131748d.m214230e()
            r1.mo110290d(r8)
            com.google.android.apps.search.assistant.verticals.ambient.trigger.i.d r1 = r1.mo110287a()
        L_0x015c:
            boolean r2 = r1.mo110293c()
            if (r2 == 0) goto L_0x026e
            r1.mo110291a()
            int r2 = r1.mo110294d()
            int r8 = r2 + -1
            if (r2 == 0) goto L_0x026c
            if (r8 == r9) goto L_0x0208
            if (r8 == r14) goto L_0x01c2
            if (r8 == r15) goto L_0x017a
            com.google.android.apps.search.assistant.verticals.ambient.u.f r2 = r7.f359915b
            r2.mo110339f(r3, r9, r5)
            goto L_0x024f
        L_0x017a:
            com.google.android.apps.search.assistant.verticals.ambient.u.f r2 = r7.f359915b
            r8 = 7
            r2.mo110339f(r3, r8, r5)
            com.google.android.apps.search.assistant.verticals.ambient.u.f r2 = r7.f359915b
            com.google.assistant.z.p r3 = com.google.assistant.p4016z.C53731p.f141061c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.z.o r3 = (com.google.assistant.p4016z.C53730o) r3
            com.google.assistant.z.ag r10 = com.google.assistant.p4016z.C53682ag.f140907c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.z.af r10 = (com.google.assistant.p4016z.C53681af) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.assistant.z.ag r11 = (com.google.assistant.p4016z.C53682ag) r11
            r4.getClass()
            r11.f140910b = r4
            int r4 = r11.f140909a
            r4 = r4 | r9
            r11.f140909a = r4
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.z.p r4 = (com.google.assistant.p4016z.C53731p) r4
            com.google.protobuf.bv r9 = r10.build()
            com.google.assistant.z.ag r9 = (com.google.assistant.p4016z.C53682ag) r9
            r9.getClass()
            r4.f141064b = r9
            r4.f141063a = r8
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.z.p r3 = (com.google.assistant.p4016z.C53731p) r3
            r2.mo110337d(r3, r5)
            goto L_0x024f
        L_0x01c2:
            com.google.android.apps.search.assistant.verticals.ambient.u.f r2 = r7.f359915b
            r2.mo110339f(r3, r15, r5)
            com.google.android.apps.search.assistant.verticals.ambient.u.f r2 = r7.f359915b
            com.google.assistant.z.p r3 = com.google.assistant.p4016z.C53731p.f141061c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.z.o r3 = (com.google.assistant.p4016z.C53730o) r3
            com.google.assistant.z.ae r8 = com.google.assistant.p4016z.C53680ae.f140903c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.z.ad r8 = (com.google.assistant.p4016z.C53679ad) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.z.ae r10 = (com.google.assistant.p4016z.C53680ae) r10
            r4.getClass()
            r10.f140906b = r4
            int r4 = r10.f140905a
            r4 = r4 | r9
            r10.f140905a = r4
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.z.p r4 = (com.google.assistant.p4016z.C53731p) r4
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.z.ae r8 = (com.google.assistant.p4016z.C53680ae) r8
            r8.getClass()
            r4.f141064b = r8
            r4.f141063a = r15
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.z.p r3 = (com.google.assistant.p4016z.C53731p) r3
            r2.mo110337d(r3, r5)
            goto L_0x024f
        L_0x0208:
            com.google.android.apps.search.assistant.verticals.ambient.u.f r2 = r7.f359915b
            r8 = 4
            r2.mo110339f(r3, r8, r5)
            com.google.android.apps.search.assistant.verticals.ambient.u.f r2 = r7.f359915b
            com.google.assistant.z.p r3 = com.google.assistant.p4016z.C53731p.f141061c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.z.o r3 = (com.google.assistant.p4016z.C53730o) r3
            com.google.assistant.z.ac r8 = com.google.assistant.p4016z.C53678ac.f140899c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.z.ab r8 = (com.google.assistant.p4016z.C53677ab) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.z.ac r10 = (com.google.assistant.p4016z.C53678ac) r10
            r4.getClass()
            r10.f140902b = r4
            int r4 = r10.f140901a
            r4 = r4 | r9
            r10.f140901a = r4
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.z.p r4 = (com.google.assistant.p4016z.C53731p) r4
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.z.ac r8 = (com.google.assistant.p4016z.C53678ac) r8
            r8.getClass()
            r4.f141064b = r8
            r8 = 6
            r4.f141063a = r8
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.z.p r3 = (com.google.assistant.p4016z.C53731p) r3
            r2.mo110337d(r3, r5)
        L_0x024f:
            boolean r1 = r1.mo110292b()
            if (r1 != 0) goto L_0x0258
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x0285
        L_0x0258:
            j$.util.Optional r1 = r7.f359918e
            java.lang.Object r1 = r1.get()
            com.google.android.apps.search.assistant.verticals.ambient.trigger.d r1 = (com.google.android.apps.search.assistant.verticals.ambient.trigger.C131713d) r1
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.m.b r2 = com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8226m.C106588b.f297185b
            com.google.android.apps.search.assistant.verticals.ambient.trigger.a r3 = new com.google.android.apps.search.assistant.verticals.ambient.trigger.a
            r3.<init>(r2, r5)
            com.google.common.util.concurrent.cx r1 = r1.mo110075a(r3)
            goto L_0x0285
        L_0x026c:
            r1 = 0
            throw r1
        L_0x026e:
            com.google.android.apps.search.assistant.verticals.ambient.k.d r1 = r7.f359914a
            com.google.common.util.concurrent.cx r8 = r1.mo109842a(r4)
            com.google.android.apps.search.assistant.verticals.ambient.trigger.i.i r9 = new com.google.android.apps.search.assistant.verticals.ambient.trigger.i.i
            r1 = r9
            r2 = r7
            r1.<init>(r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r1 = r7.f359917d
            com.google.common.util.concurrent.s r2 = com.google.apps.tiktok.tracing.C47810es.m84966f(r9)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93045h(r8, r2, r1)
        L_0x0285:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.trigger.p10015i.C131752h.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
