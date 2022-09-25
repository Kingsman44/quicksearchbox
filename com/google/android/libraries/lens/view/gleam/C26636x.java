package com.google.android.libraries.lens.view.gleam;

import com.google.android.libraries.lens.view.p2154p.p2156b.C27542b;

/* renamed from: com.google.android.libraries.lens.view.gleam.x */
/* compiled from: PG */
final class C26636x implements C27542b {

    /* renamed from: a */
    final /* synthetic */ C26637y f72642a;

    public C26636x(C26637y yVar) {
        this.f72642a = yVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31214a(com.google.common.base.C58833ax r13) {
        /*
            r12 = this;
            boolean r0 = r13.mo56113h()
            if (r0 == 0) goto L_0x0155
            java.lang.Object r0 = r13.mo56107c()
            com.google.bp.f.b.a.br r0 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56264br) r0
            com.google.protobuf.cq r0 = r0.f149960b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0155
            com.google.android.libraries.lens.view.gleam.y r0 = r12.f72642a
            java.lang.Object r13 = r13.mo56107c()
            com.google.bp.f.b.a.br r13 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56264br) r13
            com.google.protobuf.cq r13 = r13.f149960b
            r1 = 0
            java.lang.Object r13 = r13.get(r1)
            com.google.lens.e.l r13 = (com.google.lens.p4699e.C62231l) r13
            com.google.common.base.ax r2 = r0.mo31917a()
            java.lang.Object r2 = r2.mo56111f()
            boolean r2 = com.google.common.base.C58832aw.m90831a(r2, r13)
            if (r2 == 0) goto L_0x0034
            return
        L_0x0034:
            com.google.lens.j.dn r2 = r13.f168026b
            if (r2 != 0) goto L_0x003a
            com.google.lens.j.dn r2 = com.google.lens.p4707j.C62491dn.f168710e
        L_0x003a:
            com.google.protobuf.cq r2 = r2.f168713b
            int r2 = r2.size()
            r3 = 4
            r4 = 1
            if (r2 != r3) goto L_0x0046
            r2 = 1
            goto L_0x0047
        L_0x0046:
            r2 = 0
        L_0x0047:
            com.google.common.base.C58838bb.m90868c(r2)
            com.google.android.libraries.lens.view.p.a.i r13 = com.google.android.libraries.lens.view.p2154p.p2155a.C27539i.m51291h(r13)
            dagger.a r2 = r0.f72644b
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.libraries.lens.view.p.a.e r2 = (com.google.android.libraries.lens.view.p2154p.p2155a.C27535e) r2
            r2.f75315b = r13
            boolean[] r3 = new boolean[r3]
            r2.f75322i = r3
            com.google.android.libraries.lens.view.p.a.j r3 = r13.mo33079b()
            r2.f75316c = r3
            dagger.a r0 = r0.f72644b
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.lens.view.p.a.e r0 = (com.google.android.libraries.lens.view.p2154p.p2155a.C27535e) r0
            com.google.android.libraries.lens.view.p.a.j r13 = r13.mo33079b()
            com.google.android.libraries.lens.view.p.a.j r2 = r0.f75316c
            r2.getClass()
            com.google.common.f.e r3 = com.google.android.libraries.lens.view.p2154p.p2155a.C27535e.f75314a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r5 = 49302(0xc096, float:6.9087E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r5)
            r5 = r3
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            java.lang.String r6 = "updateMatrix. picture width: %d, picture height: %d, UI width: %d, UI height: %d."
            int r3 = r2.mo33085b()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            int r3 = r2.mo33084a()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            int r3 = r13.mo33085b()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            int r3 = r13.mo33084a()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r5.mo56360M(r6, r7, r8, r9, r10)
            int r3 = r13.mo33085b()
            r0.f75318e = r3
            int r3 = r13.mo33084a()
            r0.f75319f = r3
            android.graphics.Matrix r3 = r0.f75320g
            int r5 = r2.mo33085b()
            int r2 = r2.mo33084a()
            int r6 = r13.mo33085b()
            int r13 = r13.mo33084a()
            int r7 = com.google.android.libraries.lens.view.p2154p.p2155a.C27537g.m51284c(r1)
            int r8 = com.google.android.libraries.lens.view.p2154p.p2155a.C27537g.m51284c(r7)
            r9 = 270(0x10e, float:3.78E-43)
            r10 = 90
            if (r8 == r10) goto L_0x00db
            if (r8 != r9) goto L_0x00d9
            goto L_0x00db
        L_0x00d9:
            r8 = 0
            goto L_0x00dc
        L_0x00db:
            r8 = 1
        L_0x00dc:
            if (r4 == r8) goto L_0x00e0
            r11 = r5
            goto L_0x00e1
        L_0x00e0:
            r11 = r2
        L_0x00e1:
            if (r4 == r8) goto L_0x00e4
            r5 = r2
        L_0x00e4:
            if (r7 == 0) goto L_0x0103
            if (r7 == r10) goto L_0x0102
            r2 = 180(0xb4, float:2.52E-43)
            if (r7 == r2) goto L_0x00ff
            if (r7 == r9) goto L_0x00fd
            com.google.common.f.e r2 = com.google.android.libraries.lens.view.p2154p.p2155a.C27537g.f75326a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r8 = "Invalid camera rotationDegrees: %d"
            r9 = 49305(0xc099, float:6.9091E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r9)).mo56387q(r8, r7)
            goto L_0x0103
        L_0x00fd:
            r2 = r5
            goto L_0x0104
        L_0x00ff:
            r2 = r5
            r1 = r11
            goto L_0x0104
        L_0x0102:
            r1 = r11
        L_0x0103:
            r2 = 0
        L_0x0104:
            r3.reset()
            float r7 = (float) r7
            r3.setRotate(r7)
            float r1 = (float) r1
            float r2 = (float) r2
            r3.postTranslate(r1, r2)
            float r1 = (float) r11
            float r2 = (float) r5
            float r5 = (float) r6
            float r13 = (float) r13
            float r6 = r1 / r2
            float r7 = r5 / r13
            float r6 = r6 - r7
            float r6 = java.lang.Math.abs(r6)
            r7 = 1028443341(0x3d4ccccd, float:0.05)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x0126
            r6 = 1
            goto L_0x0127
        L_0x0126:
            r6 = 2
        L_0x0127:
            float r7 = r2 * r5
            float r8 = r13 * r1
            int r6 = r6 + -1
            if (r6 == r4) goto L_0x0134
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x013b
            goto L_0x0138
        L_0x0134:
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x013b
        L_0x0138:
            float r4 = r13 / r2
            goto L_0x013d
        L_0x013b:
            float r4 = r5 / r1
        L_0x013d:
            r3.postScale(r4, r4)
            float r1 = r1 * r4
            float r5 = r5 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r1
            float r4 = r4 * r2
            float r13 = r13 - r4
            float r13 = r13 / r1
            r3.postTranslate(r5, r13)
            android.graphics.Matrix r13 = r0.f75320g
            android.graphics.Matrix r0 = r0.f75321h
            r13.invert(r0)
            return
        L_0x0155:
            com.google.android.libraries.lens.view.gleam.y r13 = r12.f72642a
            dagger.a r13 = r13.f72644b
            java.lang.Object r13 = r13.mo27525b()
            com.google.android.libraries.lens.view.p.a.e r13 = (com.google.android.libraries.lens.view.p2154p.p2155a.C27535e) r13
            r0 = 0
            r13.f75315b = r0
            r13.f75316c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.gleam.C26636x.mo31214a(com.google.common.base.ax):void");
    }
}
