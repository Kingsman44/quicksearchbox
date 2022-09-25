package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.af */
/* compiled from: PG */
public final class C24541af extends C68247h {

    /* renamed from: a */
    private final C68283d f67214a;

    /* renamed from: c */
    private final C68283d f67215c;

    /* renamed from: d */
    private final C68283d f67216d;

    /* renamed from: e */
    private final C68283d f67217e;

    /* renamed from: f */
    private final C68283d f67218f;

    public C24541af(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C24541af.class), aVar);
        this.f67214a = C68236af.m98549d(dVar);
        this.f67215c = C68236af.m98549d(dVar2);
        this.f67216d = C68236af.m98549d(dVar3);
        this.f67217e = C68236af.m98549d(dVar4);
        this.f67218f = C68236af.m98549d(dVar5);
    }

    /* JADX WARNING: type inference failed for: r11v28, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.C60870cx mo20481a(java.lang.Object r11) {
        /*
            r10 = this;
            java.util.List r11 = (java.util.List) r11
            r0 = 0
            java.lang.Object r1 = r11.get(r0)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r2 = 1
            java.lang.Object r3 = r11.get(r2)
            com.google.lens.g.ae r3 = (com.google.lens.p4701g.C62255ae) r3
            r4 = 2
            java.lang.Object r5 = r11.get(r4)
            com.google.android.libraries.lens.ondevice.k.ap r5 = (com.google.android.libraries.lens.ondevice.p2034k.C24551ap) r5
            r6 = 3
            java.lang.Object r6 = r11.get(r6)
            com.google.android.libraries.lens.ondevice.i.h r6 = (com.google.android.libraries.lens.ondevice.p2032i.C24530h) r6
            r7 = 4
            java.lang.Object r11 = r11.get(r7)
            com.google.common.base.ax r11 = (com.google.common.base.C58833ax) r11
            com.google.common.base.ax r7 = com.google.android.libraries.lens.ondevice.p2025e.C24435b.m45508a(r11)
            java.lang.Class<com.google.android.libraries.lens.ondevice.k.ac> r8 = com.google.android.libraries.lens.ondevice.p2034k.C24538ac.class
            com.google.android.libraries.lens.ondevice.p2034k.C24653ej.m45755b(r8, r6)     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            boolean r8 = r11.mo56113h()     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            if (r8 == 0) goto L_0x0060
            com.google.protobuf.bn r3 = r3.toBuilder()     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.lens.g.ad r3 = (com.google.lens.p4701g.C62254ad) r3     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            java.lang.Object r11 = r11.mo56107c()     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.android.libraries.lens.ondevice.e.a r11 = (com.google.android.libraries.lens.ondevice.p2025e.C24434a) r11     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            int r11 = r11.mo29884k()     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            r3.copyOnWrite()     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.protobuf.bv r8 = r3.instance     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.lens.g.ae r8 = (com.google.lens.p4701g.C62255ae) r8     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            int r9 = r11 + -1
            if (r11 == 0) goto L_0x005e
            r8.f168081c = r9     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            int r11 = r8.f168079a     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            r11 = r11 | r2
            r8.f168079a = r11     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.protobuf.bv r11 = r3.build()     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            r3 = r11
            com.google.lens.g.ae r3 = (com.google.lens.p4701g.C62255ae) r3     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            goto L_0x0060
        L_0x005e:
            r11 = 0
            throw r11     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
        L_0x0060:
            com.google.lens.g.ac r11 = r5.f67232b     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            int r8 = r11.f168076k     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            if (r8 <= 0) goto L_0x0095
            int r9 = r3.f168082d     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            if (r9 <= r8) goto L_0x0095
            boolean r1 = r7.mo56113h()     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            if (r1 == 0) goto L_0x0092
            java.lang.Object r1 = r7.mo56107c()     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.android.libraries.lens.ondevice.e.a r1 = (com.google.android.libraries.lens.ondevice.p2025e.C24434a) r1     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            java.lang.String r8 = "Inpainting has been skipped because the word count (%d) is higher than the maximum allowed value (%d)."
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            int r3 = r3.f168082d     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            r4[r0] = r3     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            int r11 = r11.f168076k     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            r4[r2] = r11     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            java.lang.String.format(r5, r8, r4)     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            r1.mo29877d()     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
        L_0x0092:
            com.google.lens.g.r r11 = com.google.lens.p4701g.C62355r.f168332e     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            goto L_0x00ed
        L_0x0095:
            com.google.android.libraries.lens.ondevice.nativeapi.OnDeviceEngineNativeApi r11 = r5.f67231a     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.lens.g.p r5 = com.google.lens.p4701g.C62353p.f168325e     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.lens.g.o r5 = (com.google.lens.p4701g.C62352o) r5     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            r5.copyOnWrite()     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.protobuf.bv r8 = r5.instance     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.lens.g.p r8 = (com.google.lens.p4701g.C62353p) r8     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            r3.getClass()     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            r8.f168329c = r3     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            r3 = 13
            r8.f168328b = r3     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.protobuf.bv r3 = r5.build()     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.lens.g.p r3 = (com.google.lens.p4701g.C62353p) r3     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.lens.g.r r11 = r11.mo30012c(r3, r1)     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.lens.j.bh r1 = r11.f168337d     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            if (r1 != 0) goto L_0x00bf
            com.google.lens.j.bh r1 = com.google.lens.p4707j.C62431bh.f168521d     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
        L_0x00bf:
            int r1 = r1.f168524b     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.net.a.a.b r3 = com.google.net.p4726a.p4727a.C62722b.OK     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            int r3 = r3.f169415s     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            if (r1 == r3) goto L_0x00ed
            com.google.android.libraries.lens.ondevice.b.a.e r1 = new com.google.android.libraries.lens.ondevice.b.a.e     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            java.lang.String r3 = "Inpainting failed with %s, %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.lens.j.bh r11 = r11.f168337d     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            if (r11 != 0) goto L_0x00d4
            com.google.lens.j.bh r5 = com.google.lens.p4707j.C62431bh.f168521d     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            goto L_0x00d5
        L_0x00d4:
            r5 = r11
        L_0x00d5:
            int r5 = r5.f168524b     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            r4[r0] = r5     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            if (r11 != 0) goto L_0x00e1
            com.google.lens.j.bh r11 = com.google.lens.p4707j.C62431bh.f168521d     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
        L_0x00e1:
            java.lang.String r11 = r11.f168525c     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            r4[r2] = r11     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            java.lang.String r11 = java.lang.String.format(r3, r4)     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            r1.<init>(r11)     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            throw r1     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
        L_0x00ed:
            java.lang.Class<com.google.android.libraries.lens.ondevice.k.ac> r0 = com.google.android.libraries.lens.ondevice.p2034k.C24538ac.class
            com.google.android.libraries.lens.ondevice.p2034k.C24653ej.m45756c(r0, r6, r11)     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            int r0 = r11.f168334a     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            r1 = 17
            if (r0 != r1) goto L_0x00fd
            java.lang.Object r11 = r11.f168335b     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.lens.g.ag r11 = (com.google.lens.p4701g.C62257ag) r11     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            goto L_0x00ff
        L_0x00fd:
            com.google.lens.g.ag r11 = com.google.lens.p4701g.C62257ag.f168084d     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
        L_0x00ff:
            int r0 = com.google.android.libraries.lens.ondevice.p2034k.C24538ac.f67206a     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            boolean r0 = r7.mo56113h()     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            if (r0 == 0) goto L_0x011b
            int r0 = r11.f168086a     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            r0 = r0 & r2
            if (r0 == 0) goto L_0x011b
            java.lang.Object r0 = r7.mo56107c()     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.android.libraries.lens.ondevice.e.a r0 = (com.google.android.libraries.lens.ondevice.p2025e.C24434a) r0     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            com.google.protos.bf.a.a.g r1 = r11.f168088c     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
            if (r1 != 0) goto L_0x0118
            com.google.protos.bf.a.a.g r1 = com.google.protos.p4963bf.p4964a.p4965a.C64602g.f175147c     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
        L_0x0118:
            r0.mo29876c()     // Catch:{ ct -> 0x0124, e -> 0x0122, IllegalStateException -> 0x0120 }
        L_0x011b:
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
            return r11
        L_0x0120:
            r11 = move-exception
            goto L_0x0125
        L_0x0122:
            r11 = move-exception
            goto L_0x0125
        L_0x0124:
            r11 = move-exception
        L_0x0125:
            java.lang.Class<com.google.android.libraries.lens.ondevice.k.ac> r0 = com.google.android.libraries.lens.ondevice.p2034k.C24538ac.class
            com.google.android.libraries.lens.ondevice.p2034k.C24653ej.m45754a(r0, r6)
            r11.toString()
            com.google.android.libraries.lens.ondevice.p2025e.C24435b.m45509b(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.ondevice.p2034k.C24541af.mo20481a(java.lang.Object):com.google.common.util.concurrent.cx");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67214a.mo60297gq(), this.f67215c.mo60297gq(), this.f67216d.mo60297gq(), this.f67217e.mo60297gq(), this.f67218f.mo60297gq());
    }
}
