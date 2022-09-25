package com.google.android.setupdesign.p3558f;

import android.content.Intent;

/* renamed from: com.google.android.setupdesign.f.k */
/* compiled from: PG */
public final class C45317k {

    /* renamed from: d */
    private static C45317k f118378d;

    /* renamed from: a */
    public final int f118379a;

    /* renamed from: b */
    public final String f118380b = null;

    /* renamed from: c */
    public final boolean f118381c = true;

    public C45317k(int i) {
        this.f118379a = i;
    }

    /* renamed from: c */
    public static C45317k m80773c() {
        if (f118378d == null) {
            f118378d = C45316j.m80772a(2132150211);
        }
        return f118378d;
    }

    /* renamed from: a */
    public final int mo49238a(Intent intent, boolean z) {
        return mo49239b(intent.getStringExtra("theme"), z);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo49239b(java.lang.String r20, boolean r21) {
        /*
            r19 = this;
            r0 = r20
            r5 = 5
            r6 = 7
            r7 = 2
            r8 = 8
            r9 = 4
            java.lang.String r10 = "glif_light"
            java.lang.String r11 = "material"
            java.lang.String r12 = "glif_v4"
            java.lang.String r13 = "glif_v3"
            java.lang.String r14 = "glif_v2"
            java.lang.String r15 = "glif"
            java.lang.String r1 = "glif_v4_light"
            java.lang.String r2 = "glif_v3_light"
            java.lang.String r3 = "material_light"
            java.lang.String r4 = "glif_v2_light"
            r16 = -1
            r17 = 0
            if (r21 != 0) goto L_0x009d
            if (r0 == 0) goto L_0x0125
            int r18 = r20.hashCode()
            switch(r18) {
                case -2128555920: goto L_0x0076;
                case -1270463490: goto L_0x006d;
                case -1241052239: goto L_0x0065;
                case -353548558: goto L_0x005d;
                case 3175618: goto L_0x0055;
                case 115650329: goto L_0x004d;
                case 115650330: goto L_0x0045;
                case 115650331: goto L_0x003d;
                case 299066663: goto L_0x0034;
                case 767685465: goto L_0x002c;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x007e
        L_0x002c:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x007e
            r1 = 6
            goto L_0x007f
        L_0x0034:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x007e
            r1 = 9
            goto L_0x007f
        L_0x003d:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x007e
            r1 = 1
            goto L_0x007f
        L_0x0045:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x007e
            r1 = 3
            goto L_0x007f
        L_0x004d:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x007e
            r1 = 5
            goto L_0x007f
        L_0x0055:
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x007e
            r1 = 7
            goto L_0x007f
        L_0x005d:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007e
            r1 = 0
            goto L_0x007f
        L_0x0065:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007e
            r1 = 2
            goto L_0x007f
        L_0x006d:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x007e
            r1 = 8
            goto L_0x007f
        L_0x0076:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x007e
            r1 = 4
            goto L_0x007f
        L_0x007e:
            r1 = -1
        L_0x007f:
            switch(r1) {
                case 0: goto L_0x0098;
                case 1: goto L_0x0098;
                case 2: goto L_0x0093;
                case 3: goto L_0x0093;
                case 4: goto L_0x008e;
                case 5: goto L_0x008e;
                case 6: goto L_0x0089;
                case 7: goto L_0x0089;
                case 8: goto L_0x0084;
                case 9: goto L_0x0084;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0125
        L_0x0084:
            r17 = 2132150223(0x7f1607cf, float:1.9942474E38)
            goto L_0x0125
        L_0x0089:
            r17 = 2132150211(0x7f1607c3, float:1.994245E38)
            goto L_0x0125
        L_0x008e:
            r17 = 2132150214(0x7f1607c6, float:1.9942456E38)
            goto L_0x0125
        L_0x0093:
            r17 = 2132150217(0x7f1607c9, float:1.9942462E38)
            goto L_0x0125
        L_0x0098:
            r17 = 2132150220(0x7f1607cc, float:1.9942468E38)
            goto L_0x0125
        L_0x009d:
            if (r0 == 0) goto L_0x0125
            int r18 = r20.hashCode()
            switch(r18) {
                case -2128555920: goto L_0x00f1;
                case -1270463490: goto L_0x00e8;
                case -1241052239: goto L_0x00e0;
                case -353548558: goto L_0x00d8;
                case 3175618: goto L_0x00d0;
                case 115650329: goto L_0x00c8;
                case 115650330: goto L_0x00c0;
                case 115650331: goto L_0x00b8;
                case 299066663: goto L_0x00af;
                case 767685465: goto L_0x00a7;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            goto L_0x00f9
        L_0x00a7:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00f9
            r1 = 6
            goto L_0x00fa
        L_0x00af:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00f9
            r1 = 9
            goto L_0x00fa
        L_0x00b8:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00f9
            r1 = 1
            goto L_0x00fa
        L_0x00c0:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00f9
            r1 = 3
            goto L_0x00fa
        L_0x00c8:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00f9
            r1 = 5
            goto L_0x00fa
        L_0x00d0:
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00f9
            r1 = 7
            goto L_0x00fa
        L_0x00d8:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f9
            r1 = 0
            goto L_0x00fa
        L_0x00e0:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f9
            r1 = 2
            goto L_0x00fa
        L_0x00e8:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00f9
            r1 = 8
            goto L_0x00fa
        L_0x00f1:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00f9
            r1 = 4
            goto L_0x00fa
        L_0x00f9:
            r1 = -1
        L_0x00fa:
            switch(r1) {
                case 0: goto L_0x0122;
                case 1: goto L_0x011e;
                case 2: goto L_0x011a;
                case 3: goto L_0x0116;
                case 4: goto L_0x0112;
                case 5: goto L_0x010e;
                case 6: goto L_0x010a;
                case 7: goto L_0x0106;
                case 8: goto L_0x0102;
                case 9: goto L_0x00fe;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            goto L_0x0125
        L_0x00fe:
            r17 = 2132150222(0x7f1607ce, float:1.9942472E38)
            goto L_0x0125
        L_0x0102:
            r17 = 2132150224(0x7f1607d0, float:1.9942476E38)
            goto L_0x0125
        L_0x0106:
            r17 = 2132150210(0x7f1607c2, float:1.9942448E38)
            goto L_0x0125
        L_0x010a:
            r17 = 2132150212(0x7f1607c4, float:1.9942452E38)
            goto L_0x0125
        L_0x010e:
            r17 = 2132150213(0x7f1607c5, float:1.9942454E38)
            goto L_0x0125
        L_0x0112:
            r17 = 2132150215(0x7f1607c7, float:1.9942458E38)
            goto L_0x0125
        L_0x0116:
            r17 = 2132150216(0x7f1607c8, float:1.994246E38)
            goto L_0x0125
        L_0x011a:
            r17 = 2132150218(0x7f1607ca, float:1.9942464E38)
            goto L_0x0125
        L_0x011e:
            r17 = 2132150219(0x7f1607cb, float:1.9942466E38)
            goto L_0x0125
        L_0x0122:
            r17 = 2132150221(0x7f1607cd, float:1.994247E38)
        L_0x0125:
            r0 = r19
            if (r17 != 0) goto L_0x012c
            int r1 = r0.f118379a
            return r1
        L_0x012c:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupdesign.p3558f.C45317k.mo49239b(java.lang.String, boolean):int");
    }
}
