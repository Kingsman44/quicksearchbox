package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.assistant.p3861at.C49826ak;
import com.google.common.util.concurrent.SettableFuture;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.aj */
/* compiled from: PG */
final class C10323aj implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C49826ak f34979a;

    /* renamed from: b */
    final /* synthetic */ Optional f34980b;

    /* renamed from: c */
    final /* synthetic */ SettableFuture f34981c;

    /* renamed from: d */
    final /* synthetic */ C10325al f34982d;

    /* renamed from: e */
    final /* synthetic */ C10321ah f34983e;

    public C10323aj(C10325al alVar, C49826ak akVar, Optional optional, C10321ah ahVar, SettableFuture settableFuture) {
        this.f34982d = alVar;
        this.f34979a = akVar;
        this.f34980b = optional;
        this.f34983e = ahVar;
        this.f34981c = settableFuture;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        this.f34981c.mo57357o(th);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: gm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo17702gm(java.lang.Object r11) {
        /*
            r10 = this;
            j$.util.Optional r11 = (p3186j$.util.Optional) r11
            boolean r0 = r11.isPresent()
            r1 = 2
            if (r0 == 0) goto L_0x01b7
            com.google.android.apps.gsa.assistant.settings.features.appactions.data.al r0 = r10.f34982d
            java.lang.Object r11 = r11.get()
            com.google.assistant.e.c.c.ev r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r11
            com.google.assistant.at.ak r2 = r10.f34979a
            j$.util.Optional r3 = r10.f34980b
            com.google.android.apps.gsa.assistant.settings.features.appactions.data.al r4 = r10.f34982d
            java.util.concurrent.ConcurrentMap r4 = r4.f34997l
            p3186j$.util.Objects.requireNonNull(r4)
            com.google.android.apps.gsa.assistant.settings.features.appactions.data.ai r5 = new com.google.android.apps.gsa.assistant.settings.features.appactions.data.ai
            r5.<init>(r4)
            j$.util.Optional r3 = r3.map(r5)
            com.google.android.apps.gsa.assistant.settings.features.appactions.data.ah r4 = r10.f34983e
            java.util.concurrent.atomic.AtomicBoolean r5 = r0.f34999n
            r6 = 1
            boolean r5 = r5.getAndSet(r6)
            if (r5 == 0) goto L_0x0031
            return
        L_0x0031:
            com.google.assistant.at.ao r5 = com.google.assistant.p3861at.C49830ao.f129482j
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.at.an r5 = (com.google.assistant.p3861at.C49829an) r5
            int r7 = r2.f129472i
            int r7 = com.google.assistant.p3825an.p3830c.p3831a.C49255aa.m85393b(r7)
            if (r7 != 0) goto L_0x0042
            r7 = 2
        L_0x0042:
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.assistant.at.ao r8 = (com.google.assistant.p3861at.C49830ao) r8
            int r7 = com.google.assistant.p3825an.p3830c.p3831a.C49255aa.m85392a(r7)
            r8.f129487d = r7
            int r7 = r8.f129484a
            r7 = r7 | r6
            r8.f129484a = r7
            com.google.protobuf.z r7 = r2.f129473j
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.assistant.at.ao r8 = (com.google.assistant.p3861at.C49830ao) r8
            r7.getClass()
            int r9 = r8.f129484a
            r9 = r9 | 64
            r8.f129484a = r9
            r8.f129490g = r7
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.at.ao r7 = (com.google.assistant.p3861at.C49830ao) r7
            r11.getClass()
            r7.f129488e = r11
            int r11 = r7.f129484a
            r11 = r11 | 4
            r7.f129484a = r11
            com.google.protobuf.cq r11 = r2.f129465b
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.at.ao r7 = (com.google.assistant.p3861at.C49830ao) r7
            r7.mo53366a()
            com.google.protobuf.cq r7 = r7.f129489f
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r11, (java.util.List) r7)
            com.google.assistant.ab.r r11 = com.google.assistant.p3745ab.C48384r.f125066b
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.ab.o r11 = (com.google.assistant.p3745ab.C48363o) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r7 = r11.instance
            com.google.assistant.ab.r r7 = (com.google.assistant.p3745ab.C48384r) r7
            r8 = 3
            int r8 = com.google.assistant.p3745ab.C48381q.m85221a(r8)
            r7.f125068a = r8
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.ab.r r11 = (com.google.assistant.p3745ab.C48384r) r11
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.at.ao r7 = (com.google.assistant.p3861at.C49830ao) r7
            r11.getClass()
            r7.f129491h = r11
            int r11 = r7.f129484a
            r11 = r11 | 128(0x80, float:1.794E-43)
            r7.f129484a = r11
            java.lang.String r11 = r2.f129476m
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x016a
            com.google.assistant.at.ay r11 = com.google.android.apps.gsa.assistant.shared.appactions.p5807g.C73821h.m108390a(r2)
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.assistant.at.ao r2 = (com.google.assistant.p3861at.C49830ao) r2
            r11.getClass()
            r2.f129492i = r11
            int r11 = r2.f129484a
            r11 = r11 | 256(0x100, float:3.59E-43)
            r2.f129484a = r11
            boolean r11 = r3.isPresent()
            if (r11 == 0) goto L_0x016a
            com.google.assistant.at.bc r11 = com.google.assistant.p3861at.C49845bc.f129538c
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.at.bb r11 = (com.google.assistant.p3861at.C49844bb) r11
            java.lang.Object r2 = r3.get()
            com.google.assistant.an.c.a.au r2 = (com.google.assistant.p3825an.p3830c.p3831a.C49275au) r2
            int r2 = r2.f127373a
            java.lang.String r7 = ""
            if (r2 != r1) goto L_0x010f
            java.lang.Object r2 = r3.get()
            com.google.assistant.an.c.a.au r2 = (com.google.assistant.p3825an.p3830c.p3831a.C49275au) r2
            int r3 = r2.f127373a
            if (r3 != r1) goto L_0x0100
            java.lang.Object r2 = r2.f127374b
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
        L_0x0100:
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.assistant.at.bc r2 = (com.google.assistant.p3861at.C49845bc) r2
            r7.getClass()
            r2.f129540a = r6
            r2.f129541b = r7
            goto L_0x0136
        L_0x010f:
            java.lang.Object r2 = r3.get()
            com.google.assistant.an.c.a.au r2 = (com.google.assistant.p3825an.p3830c.p3831a.C49275au) r2
            int r2 = r2.f127373a
            if (r2 != r6) goto L_0x0136
            java.lang.Object r2 = r3.get()
            com.google.assistant.an.c.a.au r2 = (com.google.assistant.p3825an.p3830c.p3831a.C49275au) r2
            int r3 = r2.f127373a
            if (r3 != r6) goto L_0x0128
            java.lang.Object r2 = r2.f127374b
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
        L_0x0128:
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.assistant.at.bc r2 = (com.google.assistant.p3861at.C49845bc) r2
            r7.getClass()
            r2.f129540a = r1
            r2.f129541b = r7
        L_0x0136:
            com.google.assistant.at.ae r2 = com.google.assistant.p3861at.C49819ae.f129086e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.at.ad r2 = (com.google.assistant.p3861at.C49817ad) r2
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.at.bc r11 = (com.google.assistant.p3861at.C49845bc) r11
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.at.ae r3 = (com.google.assistant.p3861at.C49819ae) r3
            r11.getClass()
            r3.f129091d = r11
            int r11 = r3.f129088a
            r11 = r11 | r1
            r3.f129088a = r11
            r5.copyOnWrite()
            com.google.protobuf.bv r11 = r5.instance
            com.google.assistant.at.ao r11 = (com.google.assistant.p3861at.C49830ao) r11
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.at.ae r2 = (com.google.assistant.p3861at.C49819ae) r2
            r2.getClass()
            r11.f129486c = r2
            r2 = 6
            r11.f129485b = r2
        L_0x016a:
            com.google.protobuf.bv r11 = r5.build()
            com.google.assistant.at.ao r11 = (com.google.assistant.p3861at.C49830ao) r11
            com.google.assistant.at.y r2 = com.google.assistant.p3861at.C50463y.f131328c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.at.x r2 = (com.google.assistant.p3861at.C50436x) r2
            com.google.assistant.at.acx r3 = com.google.assistant.p3861at.acx.f128971H
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.at.acw r3 = (com.google.assistant.p3861at.acw) r3
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.at.y r5 = (com.google.assistant.p3861at.C50463y) r5
            r11.getClass()
            r5.f131331b = r11
            r5.f131330a = r1
            com.google.protobuf.bv r11 = r2.build()
            com.google.assistant.at.y r11 = (com.google.assistant.p3861at.C50463y) r11
            r3.copyOnWrite()
            com.google.protobuf.bv r1 = r3.instance
            com.google.assistant.at.acx r1 = (com.google.assistant.p3861at.acx) r1
            r11.getClass()
            r1.f129009z = r11
            int r11 = r1.f128985b
            r11 = r11 | 512(0x200, float:7.175E-43)
            r1.f128985b = r11
            com.google.protobuf.bv r11 = r3.build()
            com.google.assistant.at.acx r11 = (com.google.assistant.p3861at.acx) r11
            com.google.android.apps.gsa.assistant.settings.d.a r1 = r0.f34987b
            com.google.android.apps.gsa.assistant.settings.features.appactions.data.ak r2 = new com.google.android.apps.gsa.assistant.settings.features.appactions.data.ak
            r2.<init>(r0, r4)
            r1.mo17844i(r11, r2)
            return
        L_0x01b7:
            com.google.common.util.concurrent.SettableFuture r11 = r10.f34981c
            com.google.android.apps.gsa.assistant.settings.features.appactions.data.DataType$UpdateResult r0 = com.google.android.apps.gsa.assistant.settings.features.appactions.data.DataType$UpdateResult.m25244d(r1)
            r11.mo57356n(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10323aj.mo17702gm(java.lang.Object):void");
    }
}
