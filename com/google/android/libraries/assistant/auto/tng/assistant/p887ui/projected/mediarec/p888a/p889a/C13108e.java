package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.p888a.p889a;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C13108e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C13114k f40645a;

    public /* synthetic */ C13108e(C13114k kVar) {
        this.f40645a = kVar;
    }

    /* JADX WARNING: type inference failed for: r12v21, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.a.a.k r0 = r11.f40645a
            com.google.common.base.ax r12 = (com.google.common.base.C58833ax) r12
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.j r1 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13048j.f40502e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.g r1 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13045g) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.j r2 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13048j) r2
            r3 = 1
            r2.f40506c = r3
            int r4 = r2.f40504a
            r4 = r4 | r3
            r2.f40504a = r4
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.j r1 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13048j) r1
            com.google.apps.tiktok.dataservice.af r1 = com.google.apps.tiktok.dataservice.C46688af.m83206c(r1)
            boolean r2 = r12.mo56113h()
            if (r2 == 0) goto L_0x00f8
            java.lang.Object r2 = r12.mo56107c()
            com.google.apps.tiktok.cache.ah r2 = (com.google.apps.tiktok.cache.C46370ah) r2
            java.lang.Object r2 = r2.f121384a
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.l r2 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13050l) r2
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.j r4 = r2.f40512b
            if (r4 != 0) goto L_0x003b
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.j r4 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13048j.f40502e
        L_0x003b:
            java.lang.Object r12 = r12.mo56107c()
            com.google.apps.tiktok.cache.ah r12 = (com.google.apps.tiktok.cache.C46370ah) r12
            long r5 = r12.f121385b
            com.google.protobuf.cq r12 = r4.f40505b
            j$.util.stream.Stream r12 = p3186j$.util.Collection.EL.stream(r12)
            com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.a.a.f r7 = com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.p888a.p889a.C13109f.f40646a
            boolean r12 = r12.anyMatch(r7)
            if (r12 == 0) goto L_0x0062
            g.a.a r12 = r0.f40653b
            java.lang.Object r12 = r12.mo17428b()
            java.lang.Long r12 = (java.lang.Long) r12
            long r7 = r12.longValue()
            j$.time.Duration r12 = p3186j$.time.Duration.ofSeconds(r7)
            goto L_0x0072
        L_0x0062:
            g.a.a r12 = r0.f40654c
            java.lang.Object r12 = r12.mo17428b()
            java.lang.Long r12 = (java.lang.Long) r12
            long r7 = r12.longValue()
            j$.time.Duration r12 = p3186j$.time.Duration.ofSeconds(r7)
        L_0x0072:
            com.google.android.libraries.f.a r7 = r0.f40657f
            long r7 = r7.mo26870b()
            long r7 = r7 - r5
            long r9 = r12.toMillis()
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 >= 0) goto L_0x00f8
            g.a.a r12 = r0.f40656e
            java.lang.Object r12 = r12.mo17428b()
            java.lang.Long r12 = (java.lang.Long) r12
            long r9 = r12.longValue()
            j$.time.Duration r12 = p3186j$.time.Duration.ofSeconds(r9)
            long r9 = r12.toMillis()
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 <= 0) goto L_0x00f4
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.j r12 = r2.f40512b
            if (r12 != 0) goto L_0x009f
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.j r12 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13048j.f40502e
        L_0x009f:
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.j r1 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13048j.f40502e
            com.google.protobuf.bn r12 = r1.createBuilder(r12)
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.g r12 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13045g) r12
            int r1 = r2.f40513c
            r12.copyOnWrite()
            com.google.protobuf.bv r4 = r12.instance
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.j r4 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13048j) r4
            int r7 = r4.f40504a
            r7 = r7 | 2
            r4.f40504a = r7
            r4.f40507d = r1
            com.google.protobuf.bv r12 = r12.build()
            r4 = r12
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.j r4 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13048j) r4
            com.google.apps.tiktok.cache.v r12 = r0.f40659h
            com.google.protobuf.ey r0 = r0.mo20908g()
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.l r1 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13050l.f40509d
            com.google.protobuf.bn r1 = r1.createBuilder(r2)
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.k r1 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13049k) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.l r2 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13050l) r2
            r4.getClass()
            r2.f40512b = r4
            int r7 = r2.f40511a
            r3 = r3 | r7
            r2.f40511a = r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.l r1 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13050l) r1
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            com.google.common.util.concurrent.cx r12 = r12.mo50346f(r0, r1)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Failed to update the current rotation offset into the cache"
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r12, r1, r0)
        L_0x00f4:
            com.google.apps.tiktok.dataservice.af r1 = com.google.apps.tiktok.dataservice.C46688af.m83205b(r4, r5)
        L_0x00f8:
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.apps.tiktok.dataservice.ae r12 = r1.f121977b
            boolean r12 = r12.f121974b
            if (r12 == 0) goto L_0x0103
            r1.mo50740g()
        L_0x0103:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.p888a.p889a.C13108e.apply(java.lang.Object):java.lang.Object");
    }
}
