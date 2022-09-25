package com.google.android.libraries.lens.view.infopanel;

import androidx.lifecycle.C2333ah;

/* renamed from: com.google.android.libraries.lens.view.infopanel.j */
/* compiled from: PG */
public final /* synthetic */ class C27192j implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C27195m f74325a;

    public /* synthetic */ C27192j(C27195m mVar) {
        this.f74325a = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006e, code lost:
        if (((com.google.android.libraries.lens.view.infopanel.p2144e.C27132ah) r8).f74137a.f167625a == 42) goto L_0x0087;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb  */
    /* renamed from: hX */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo774hX(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.android.libraries.lens.view.infopanel.m r0 = r11.f74325a
            com.google.android.libraries.lens.view.infopanel.a.d r12 = (com.google.android.libraries.lens.view.infopanel.p2138a.C26968d) r12
            com.google.android.libraries.lens.view.infopanel.a.p r1 = r0.f74344h
            com.google.android.libraries.lens.view.infopanel.a.i r1 = r1.mo32436b()
            com.google.android.libraries.lens.view.infopanel.a.p r2 = r0.f74344h
            com.google.android.libraries.lens.view.d.g r2 = r2.f73571e
            java.lang.Object r2 = r2.mo3842a()
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2
            com.google.common.base.ax r3 = r1.mo32422k()
            boolean r3 = r3.mo56113h()
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 != 0) goto L_0x0087
            boolean r3 = r1.mo32433q()
            if (r3 != 0) goto L_0x0087
            boolean r3 = r2.mo56113h()
            if (r3 == 0) goto L_0x0043
            com.google.android.libraries.lens.view.infopanel.d r3 = com.google.android.libraries.lens.view.infopanel.C27091d.f73836a
            com.google.common.base.ax r2 = r2.mo56106b(r3)
            java.lang.String r3 = ""
            java.lang.Object r2 = r2.mo56109e(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0043
            goto L_0x0087
        L_0x0043:
            com.google.android.libraries.lens.view.infopanel.e.ad r2 = com.google.android.libraries.lens.view.infopanel.p2144e.C27128ad.NATIVE_CARD_ITEM
            int r2 = r1.mo32432o(r2)
            if (r2 != r7) goto L_0x0071
            com.google.common.b.gu r1 = r1.mo32423l()
            int r2 = r1.size()
            r3 = 0
        L_0x0054:
            if (r3 >= r2) goto L_0x0085
            java.lang.Object r8 = r1.get(r3)
            com.google.android.libraries.lens.view.infopanel.e.ae r8 = (com.google.android.libraries.lens.view.infopanel.p2144e.C27129ae) r8
            int r3 = r3 + 1
            com.google.android.libraries.lens.view.infopanel.e.ad r9 = r8.mo32561a()
            com.google.android.libraries.lens.view.infopanel.e.ad r10 = com.google.android.libraries.lens.view.infopanel.p2144e.C27128ad.NATIVE_CARD_ITEM
            if (r9 != r10) goto L_0x0054
            com.google.android.libraries.lens.view.infopanel.e.ah r8 = (com.google.android.libraries.lens.view.infopanel.p2144e.C27132ah) r8
            com.google.lens.a.ax r1 = r8.f74137a
            int r1 = r1.f167625a
            r2 = 42
            if (r1 != r2) goto L_0x0085
            goto L_0x0087
        L_0x0071:
            com.google.common.b.gu r2 = r1.mo32423l()
            int r2 = r2.size()
            if (r2 != r7) goto L_0x0085
            com.google.android.libraries.lens.view.infopanel.e.ad r2 = com.google.android.libraries.lens.view.infopanel.p2144e.C27128ad.OFFLINE_ITEM
            int r1 = r1.mo32432o(r2)
            if (r1 != r7) goto L_0x0085
            r1 = 3
            goto L_0x0088
        L_0x0085:
            r1 = 2
            goto L_0x0088
        L_0x0087:
            r1 = 1
        L_0x0088:
            com.google.android.libraries.lens.view.infopanel.InfoPanelView r2 = r0.f74361y
            com.google.android.libraries.lens.view.infopanel.bottomsheet.LensResultPanelBottomsheetBehavior r3 = com.google.android.libraries.lens.view.infopanel.bottomsheet.LensResultPanelBottomsheetBehavior.m50197t(r2)
            r12.name()
            int r8 = r3.f73753k
            int r12 = r12.ordinal()
            if (r12 == 0) goto L_0x00bb
            if (r12 == r7) goto L_0x00ab
            r5 = 4
            if (r12 == r6) goto L_0x00a5
            if (r12 == r5) goto L_0x00a1
            goto L_0x00bd
        L_0x00a1:
            r12 = 5
            r2.f73497k = r12
            goto L_0x00bd
        L_0x00a5:
            r2.f73497k = r5
        L_0x00a7:
            r2.mo32377v(r3, r1)
            goto L_0x00c4
        L_0x00ab:
            int r12 = r3.f73753k
            if (r12 != r5) goto L_0x00b7
            com.google.android.libraries.lens.view.infopanel.c.i r12 = new com.google.android.libraries.lens.view.infopanel.c.i
            r12.<init>()
            com.google.apps.tiktok.p3674l.p3679c.C47393f.m84237h(r12, r2)
        L_0x00b7:
            r12 = 6
            r2.f73497k = r12
            goto L_0x00a7
        L_0x00bb:
            r2.f73497k = r5
        L_0x00bd:
            int r12 = r2.f73497k
            r2.f73490d = r4
            r3.mo32503y(r12)
        L_0x00c4:
            com.google.android.libraries.lens.view.infopanel.InfoPanelView r12 = r0.f74361y
            r12.mo32363m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.infopanel.C27192j.mo774hX(java.lang.Object):void");
    }
}
