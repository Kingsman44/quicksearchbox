package androidx.media3.extractor.p163j.p166c;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.p163j.C3470b;
import java.util.zip.Inflater;

/* renamed from: androidx.media3.extractor.j.c.b */
/* compiled from: PG */
public final class C3484b extends C3470b {

    /* renamed from: f */
    private final C2604ac f10838f = new C2604ac();

    /* renamed from: g */
    private final C2604ac f10839g = new C2604ac();

    /* renamed from: h */
    private final C3483a f10840h = new C3483a();

    /* renamed from: i */
    private Inflater f10841i;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        r9 = null;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.extractor.p163j.C3482c mo7433l(byte[] r22, int r23, boolean r24) {
        /*
            r21 = this;
            r0 = r21
            androidx.media3.common.b.ac r1 = r0.f10838f
            r2 = r22
            r3 = r23
            r1.mo6157y(r2, r3)
            androidx.media3.common.b.ac r1 = r0.f10838f
            int r2 = r1.f7236c
            int r3 = r1.f7235b
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x003a
            int r2 = r1.mo6133a()
            r3 = 120(0x78, float:1.68E-43)
            if (r2 != r3) goto L_0x003a
            java.util.zip.Inflater r2 = r0.f10841i
            if (r2 != 0) goto L_0x0027
            java.util.zip.Inflater r2 = new java.util.zip.Inflater
            r2.<init>()
            r0.f10841i = r2
        L_0x0027:
            androidx.media3.common.b.ac r2 = r0.f10839g
            java.util.zip.Inflater r3 = r0.f10841i
            boolean r2 = androidx.media3.common.p136b.C2612ak.m6953ac(r1, r2, r3)
            if (r2 == 0) goto L_0x003a
            androidx.media3.common.b.ac r2 = r0.f10839g
            byte[] r3 = r2.f7234a
            int r2 = r2.f7236c
            r1.mo6157y(r3, r2)
        L_0x003a:
            androidx.media3.extractor.j.c.a r1 = r0.f10840h
            r1.mo7434a()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0044:
            androidx.media3.common.b.ac r2 = r0.f10838f
            int r3 = r2.f7236c
            int r4 = r2.f7235b
            int r4 = r3 - r4
            r5 = 3
            if (r4 < r5) goto L_0x024c
            androidx.media3.extractor.j.c.a r4 = r0.f10840h
            int r5 = r2.mo6139g()
            int r6 = r2.mo6142j()
            int r7 = r2.f7235b
            int r8 = r7 + r6
            if (r8 <= r3) goto L_0x0067
            r2.mo6131A(r3)
            r24 = r1
            r9 = 0
            goto L_0x023a
        L_0x0067:
            r3 = 128(0x80, float:1.794E-43)
            r10 = 0
            if (r5 == r3) goto L_0x0186
            switch(r5) {
                case 20: goto L_0x00e8;
                case 21: goto L_0x0099;
                case 22: goto L_0x0074;
                default: goto L_0x006f;
            }
        L_0x006f:
            r24 = r1
        L_0x0071:
            r9 = 0
            goto L_0x0237
        L_0x0074:
            r3 = 19
            if (r6 >= r3) goto L_0x0079
            goto L_0x006f
        L_0x0079:
            int r3 = r2.mo6142j()
            r4.f10832d = r3
            int r3 = r2.mo6142j()
            r4.f10833e = r3
            int r3 = r2.f7235b
            int r3 = r3 + 11
            r2.mo6131A(r3)
            int r3 = r2.mo6142j()
            r4.f10834f = r3
            int r3 = r2.mo6142j()
            r4.f10835g = r3
            goto L_0x006f
        L_0x0099:
            r5 = 4
            if (r6 >= r5) goto L_0x009d
            goto L_0x006f
        L_0x009d:
            int r7 = r7 + 3
            r2.mo6131A(r7)
            int r6 = r6 + -4
            int r7 = r2.mo6139g()
            r3 = r3 & r7
            if (r3 == 0) goto L_0x00cb
            r3 = 7
            if (r6 >= r3) goto L_0x00af
            goto L_0x006f
        L_0x00af:
            int r3 = r2.mo6140h()
            if (r3 >= r5) goto L_0x00b6
            goto L_0x006f
        L_0x00b6:
            int r5 = r2.mo6142j()
            r4.f10836h = r5
            int r5 = r2.mo6142j()
            r4.f10837i = r5
            androidx.media3.common.b.ac r5 = r4.f10829a
            int r3 = r3 + -4
            r5.mo6156x(r3)
            int r6 = r6 + -7
        L_0x00cb:
            androidx.media3.common.b.ac r3 = r4.f10829a
            int r5 = r3.f7235b
            int r3 = r3.f7236c
            if (r5 >= r3) goto L_0x006f
            if (r6 <= 0) goto L_0x006f
            int r3 = r3 - r5
            int r3 = java.lang.Math.min(r6, r3)
            androidx.media3.common.b.ac r6 = r4.f10829a
            byte[] r6 = r6.f7234a
            r2.mo6155w(r6, r5, r3)
            androidx.media3.common.b.ac r4 = r4.f10829a
            int r5 = r5 + r3
            r4.mo6131A(r5)
            goto L_0x006f
        L_0x00e8:
            int r3 = r6 % 5
            r5 = 2
            if (r3 == r5) goto L_0x00ee
            goto L_0x006f
        L_0x00ee:
            int r7 = r7 + 2
            r2.mo6131A(r7)
            int[] r3 = r4.f10830b
            java.util.Arrays.fill(r3, r10)
            int r6 = r6 / 5
            r3 = 0
        L_0x00fb:
            if (r3 >= r6) goto L_0x017f
            int r5 = r2.mo6139g()
            int r7 = r2.mo6139g()
            int r11 = r2.mo6139g()
            int r12 = r2.mo6139g()
            int r13 = r2.mo6139g()
            double r14 = (double) r7
            int r11 = r11 + -128
            double r9 = (double) r11
            int r12 = r12 + -128
            double r11 = (double) r12
            int[] r7 = r4.f10830b
            int r13 = r13 << 24
            r16 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
            java.lang.Double.isNaN(r9)
            double r16 = r16 * r9
            java.lang.Double.isNaN(r14)
            r24 = r1
            double r0 = r14 + r16
            int r0 = (int) r0
            r1 = 255(0xff, float:3.57E-43)
            r16 = r6
            r6 = 0
            int r0 = androidx.media3.common.p136b.C2612ak.m6981f(r0, r6, r1)
            int r0 = r0 << 16
            r0 = r0 | r13
            r17 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
            java.lang.Double.isNaN(r11)
            double r17 = r17 * r11
            java.lang.Double.isNaN(r14)
            double r17 = r14 - r17
            r19 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
            java.lang.Double.isNaN(r9)
            double r9 = r9 * r19
            double r9 = r17 - r9
            int r6 = (int) r9
            r9 = 0
            int r6 = androidx.media3.common.p136b.C2612ak.m6981f(r6, r9, r1)
            int r6 = r6 << 8
            r0 = r0 | r6
            r17 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
            java.lang.Double.isNaN(r11)
            double r11 = r11 * r17
            java.lang.Double.isNaN(r14)
            double r14 = r14 + r11
            int r6 = (int) r14
            int r1 = androidx.media3.common.p136b.C2612ak.m6981f(r6, r9, r1)
            r0 = r0 | r1
            r7[r5] = r0
            int r3 = r3 + 1
            r0 = r21
            r1 = r24
            r6 = r16
            r10 = 0
            goto L_0x00fb
        L_0x017f:
            r24 = r1
            r0 = 1
            r4.f10831c = r0
            goto L_0x0071
        L_0x0186:
            r24 = r1
            int r0 = r4.f10832d
            if (r0 == 0) goto L_0x0233
            int r0 = r4.f10833e
            if (r0 == 0) goto L_0x0233
            int r0 = r4.f10836h
            if (r0 == 0) goto L_0x0233
            int r0 = r4.f10837i
            if (r0 == 0) goto L_0x0233
            androidx.media3.common.b.ac r0 = r4.f10829a
            int r1 = r0.f7236c
            if (r1 == 0) goto L_0x0233
            int r3 = r0.f7235b
            if (r3 != r1) goto L_0x0233
            boolean r1 = r4.f10831c
            if (r1 != 0) goto L_0x01a8
            goto L_0x0233
        L_0x01a8:
            r1 = 0
            r0.mo6131A(r1)
            int r0 = r4.f10836h
            int r1 = r4.f10837i
            int r0 = r0 * r1
            int[] r1 = new int[r0]
            r6 = 0
        L_0x01b5:
            if (r6 >= r0) goto L_0x01f8
            androidx.media3.common.b.ac r3 = r4.f10829a
            int r3 = r3.mo6139g()
            if (r3 == 0) goto L_0x01c9
            int r5 = r6 + 1
            int[] r7 = r4.f10830b
            r3 = r7[r3]
            r1[r6] = r3
        L_0x01c7:
            r6 = r5
            goto L_0x01b5
        L_0x01c9:
            androidx.media3.common.b.ac r3 = r4.f10829a
            int r3 = r3.mo6139g()
            if (r3 == 0) goto L_0x01b5
            r5 = r3 & 64
            if (r5 != 0) goto L_0x01d8
            r5 = r3 & 63
            goto L_0x01e3
        L_0x01d8:
            r5 = r3 & 63
            int r5 = r5 << 8
            androidx.media3.common.b.ac r7 = r4.f10829a
            int r7 = r7.mo6139g()
            r5 = r5 | r7
        L_0x01e3:
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x01e9
            r3 = 0
            goto L_0x01f3
        L_0x01e9:
            int[] r3 = r4.f10830b
            androidx.media3.common.b.ac r7 = r4.f10829a
            int r7 = r7.mo6139g()
            r3 = r3[r7]
        L_0x01f3:
            int r5 = r5 + r6
            java.util.Arrays.fill(r1, r6, r5, r3)
            goto L_0x01c7
        L_0x01f8:
            int r0 = r4.f10836h
            int r3 = r4.f10837i
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r0, r3, r5)
            androidx.media3.common.a.b r1 = new androidx.media3.common.a.b
            r1.<init>()
            r1.f7066b = r0
            int r0 = r4.f10834f
            int r3 = r4.f10832d
            float r3 = (float) r3
            float r0 = (float) r0
            float r0 = r0 / r3
            r1.f7072h = r0
            r0 = 0
            r1.f7073i = r0
            int r5 = r4.f10835g
            int r6 = r4.f10833e
            float r6 = (float) r6
            float r5 = (float) r5
            float r5 = r5 / r6
            r1.f7069e = r5
            r1.f7070f = r0
            r1.f7071g = r0
            int r0 = r4.f10836h
            float r0 = (float) r0
            float r0 = r0 / r3
            r1.f7076l = r0
            int r0 = r4.f10837i
            float r0 = (float) r0
            float r0 = r0 / r6
            r1.f7077m = r0
            androidx.media3.common.a.c r9 = r1.mo6076a()
            goto L_0x0234
        L_0x0233:
            r9 = 0
        L_0x0234:
            r4.mo7434a()
        L_0x0237:
            r2.mo6131A(r8)
        L_0x023a:
            if (r9 == 0) goto L_0x0246
            r0 = r24
            r0.add(r9)
            r1 = r0
            r0 = r21
            goto L_0x0044
        L_0x0246:
            r0 = r21
            r1 = r24
            goto L_0x0044
        L_0x024c:
            r0 = r1
            androidx.media3.extractor.j.c.c r1 = new androidx.media3.extractor.j.c.c
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p163j.p166c.C3484b.mo7433l(byte[], int, boolean):androidx.media3.extractor.j.c");
    }
}
