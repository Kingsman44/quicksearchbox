package com.google.android.apps.gsa.shared.p7192v;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.util.concurrent.C60931s;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.shared.v.n */
/* compiled from: PG */
public final /* synthetic */ class C91161n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C86124t f254520a;

    /* renamed from: b */
    public final /* synthetic */ C42876ab f254521b;

    /* renamed from: c */
    public final /* synthetic */ Instant f254522c;

    public /* synthetic */ C91161n(C86124t tVar, C42876ab abVar, Instant instant) {
        this.f254520a = tVar;
        this.f254521b = abVar;
        this.f254522c = instant;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: f.a.a.a.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.android.apps.gsa.search.core.i.t r0 = r11.f254520a
            com.google.android.libraries.storage.protostore.ab r1 = r11.f254521b
            j$.time.Instant r2 = r11.f254522c
            com.google.common.o.tw r12 = (com.google.common.p4552o.C60545tw) r12
            com.google.android.apps.gsa.shared.m.g r3 = com.google.android.apps.gsa.shared.p7066m.C89972ak.f246536K
            f.a.a.a.e r4 = p5451f.p5452a.p5453a.p5454a.C69440e.f185813b
            com.google.protobuf.eb r4 = r4.getParserForType()
            com.google.protobuf.MessageLite r0 = r0.mo79754t(r3, r4)
            f.a.a.a.e r0 = (p5451f.p5452a.p5453a.p5454a.C69440e) r0
            if (r0 != 0) goto L_0x001c
            com.google.common.util.concurrent.cx r12 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            goto L_0x014f
        L_0x001c:
            com.google.android.apps.search.googleapp.p.az r3 = com.google.android.apps.search.googleapp.p10370p.C136859az.f372506b
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.search.googleapp.p.ax r3 = (com.google.android.apps.search.googleapp.p10370p.C136857ax) r3
            com.google.protobuf.cq r12 = r12.f164032a
            java.util.Iterator r12 = r12.iterator()
        L_0x002a:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x013a
            java.lang.Object r4 = r12.next()
            com.google.common.o.tv r4 = (com.google.common.p4552o.C60544tv) r4
            int r5 = r4.f164024b
            f.a.a.a.b r6 = p5451f.p5452a.p5453a.p5454a.C69405b.f185711e
            com.google.protobuf.dn r7 = r0.f185815a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r8 = r7.containsKey(r5)
            if (r8 == 0) goto L_0x004d
            java.lang.Object r5 = r7.get(r5)
            r6 = r5
            f.a.a.a.b r6 = (p5451f.p5452a.p5453a.p5454a.C69405b) r6
        L_0x004d:
            com.google.android.apps.search.googleapp.p.ar r5 = com.google.android.apps.search.googleapp.p10370p.C136851ar.f372487f
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.search.googleapp.p.aq r5 = (com.google.android.apps.search.googleapp.p10370p.C136850aq) r5
            f.a.a.a.g r7 = r6.f185713a
            if (r7 != 0) goto L_0x005b
            f.a.a.a.g r7 = p5451f.p5452a.p5453a.p5454a.C69442g.f185816c
        L_0x005b:
            com.google.protobuf.dn r8 = r4.f164029g
            java.util.Map r8 = java.util.Collections.unmodifiableMap(r8)
            r9 = 7
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r8 = p3186j$.util.Map.EL.getOrDefault(r8, r9, r10)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            f.a.a.a.p r7 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148933h(r7, r8)
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.android.apps.search.googleapp.p.ar r8 = (com.google.android.apps.search.googleapp.p10370p.C136851ar) r8
            int r7 = r7.f185860g
            r8.f372490b = r7
            int r7 = r8.f372489a
            r7 = r7 | 1
            r8.f372489a = r7
            f.a.a.a.g r7 = r6.f185715c
            if (r7 != 0) goto L_0x0090
            f.a.a.a.g r7 = p5451f.p5452a.p5453a.p5454a.C69442g.f185816c
        L_0x0090:
            com.google.protobuf.dn r8 = r4.f164028f
            java.util.Map r8 = java.util.Collections.unmodifiableMap(r8)
            java.lang.Object r8 = p3186j$.util.Map.EL.getOrDefault(r8, r9, r10)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            f.a.a.a.p r7 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148933h(r7, r8)
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.android.apps.search.googleapp.p.ar r8 = (com.google.android.apps.search.googleapp.p10370p.C136851ar) r8
            int r7 = r7.f185860g
            r8.f372491c = r7
            int r7 = r8.f372489a
            r7 = r7 | 2
            r8.f372489a = r7
            f.a.a.a.g r7 = r6.f185714b
            if (r7 != 0) goto L_0x00bb
            f.a.a.a.g r7 = p5451f.p5452a.p5453a.p5454a.C69442g.f185816c
        L_0x00bb:
            com.google.protobuf.dn r8 = r4.f164029g
            java.util.Map r8 = java.util.Collections.unmodifiableMap(r8)
            r9 = 28
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r8 = p3186j$.util.Map.EL.getOrDefault(r8, r9, r10)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            f.a.a.a.p r7 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148933h(r7, r8)
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.android.apps.search.googleapp.p.ar r8 = (com.google.android.apps.search.googleapp.p10370p.C136851ar) r8
            int r7 = r7.f185860g
            r8.f372492d = r7
            int r7 = r8.f372489a
            r7 = r7 | 4
            r8.f372489a = r7
            f.a.a.a.g r6 = r6.f185716d
            if (r6 != 0) goto L_0x00ec
            f.a.a.a.g r6 = p5451f.p5452a.p5453a.p5454a.C69442g.f185816c
        L_0x00ec:
            com.google.protobuf.dn r7 = r4.f164028f
            java.util.Map r7 = java.util.Collections.unmodifiableMap(r7)
            java.lang.Object r7 = p3186j$.util.Map.EL.getOrDefault(r7, r9, r10)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            f.a.a.a.p r6 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148933h(r6, r7)
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.apps.search.googleapp.p.ar r7 = (com.google.android.apps.search.googleapp.p10370p.C136851ar) r7
            int r6 = r6.f185860g
            r7.f372493e = r6
            int r6 = r7.f372489a
            r6 = r6 | 8
            r7.f372489a = r6
            com.google.protobuf.bv r5 = r5.build()
            com.google.android.apps.search.googleapp.p.ar r5 = (com.google.android.apps.search.googleapp.p10370p.C136851ar) r5
            int r4 = r4.f164024b
            r5.getClass()
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.apps.search.googleapp.p.az r6 = (com.google.android.apps.search.googleapp.p10370p.C136859az) r6
            com.google.protobuf.dn r7 = r6.f372508a
            boolean r8 = r7.f170058b
            if (r8 != 0) goto L_0x012f
            com.google.protobuf.dn r7 = r7.mo58980a()
            r6.f372508a = r7
        L_0x012f:
            com.google.protobuf.dn r6 = r6.f372508a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.put(r4, r5)
            goto L_0x002a
        L_0x013a:
            com.google.protobuf.bv r12 = r3.build()
            com.google.android.apps.search.googleapp.p.az r12 = (com.google.android.apps.search.googleapp.p10370p.C136859az) r12
            com.google.android.apps.gsa.shared.v.h r0 = new com.google.android.apps.gsa.shared.v.h
            r0.<init>(r2, r12)
            com.google.common.util.concurrent.bg r12 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r12 = r1.mo46039a(r0, r12)
            com.google.common.util.concurrent.cx r12 = com.google.android.apps.gsa.p8883x.C118826c.m197213c(r12)
        L_0x014f:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7192v.C91161n.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
