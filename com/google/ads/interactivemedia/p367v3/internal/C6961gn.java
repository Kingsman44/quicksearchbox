package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.gn */
/* compiled from: PG */
public final class C6961gn {

    /* renamed from: a */
    public static final /* synthetic */ int f22203a = 0;

    /* renamed from: b */
    private static final int[] f22204b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f22205c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static C6960gm m20510a(byte[] bArr) {
        return m20511b(new aed(bArr), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00be, code lost:
        if (r12 != 3) goto L_0x00e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.ads.interactivemedia.p367v3.internal.C6960gm m20511b(com.google.ads.interactivemedia.p367v3.internal.aed r12, boolean r13) {
        /*
            int r0 = m20513d(r12)
            int r1 = m20514e(r12)
            r2 = 4
            int r3 = r12.mo14532i(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 19
            r4.<init>(r5)
            java.lang.String r6 = "mp4a.40."
            r4.append(r6)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r6 = 5
            r7 = 22
            if (r0 == r6) goto L_0x0029
            r6 = 29
            if (r0 != r6) goto L_0x0037
        L_0x0029:
            int r1 = m20514e(r12)
            int r0 = m20513d(r12)
            if (r0 != r7) goto L_0x0037
            int r3 = r12.mo14532i(r2)
        L_0x0037:
            r6 = 1
            if (r13 == 0) goto L_0x00e1
            r13 = 17
            r8 = 6
            r9 = 2
            r10 = 3
            if (r0 == r6) goto L_0x006a
            if (r0 == r9) goto L_0x006a
            if (r0 == r10) goto L_0x006a
            if (r0 == r2) goto L_0x006a
            if (r0 == r8) goto L_0x006a
            r2 = 7
            if (r0 == r2) goto L_0x006a
            if (r0 == r13) goto L_0x006a
            switch(r0) {
                case 19: goto L_0x006a;
                case 20: goto L_0x006a;
                case 21: goto L_0x006a;
                case 22: goto L_0x006a;
                case 23: goto L_0x006a;
                default: goto L_0x0051;
            }
        L_0x0051:
            com.google.ads.interactivemedia.v3.internal.dt r12 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r1 = 42
            r13.<init>(r1)
            java.lang.String r1 = "Unsupported audio object type: "
            r13.append(r1)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>((java.lang.String) r13)
            throw r12
        L_0x006a:
            boolean r2 = r12.mo14531h()
            if (r2 == 0) goto L_0x0077
            java.lang.String r2 = "AacUtil"
            java.lang.String r11 = "Unexpected frameLengthFlag = 1"
            android.util.Log.w(r2, r11)
        L_0x0077:
            boolean r2 = r12.mo14531h()
            if (r2 == 0) goto L_0x0082
            r2 = 14
            r12.mo14530g(r2)
        L_0x0082:
            boolean r2 = r12.mo14531h()
            if (r3 == 0) goto L_0x00db
            r11 = 20
            if (r0 == r8) goto L_0x0095
            if (r0 != r11) goto L_0x0093
            r0 = 20
            r8 = 20
            goto L_0x0096
        L_0x0093:
            r8 = r0
            goto L_0x0099
        L_0x0095:
            r8 = r0
        L_0x0096:
            r12.mo14530g(r10)
        L_0x0099:
            if (r2 == 0) goto L_0x00b4
            if (r0 != r7) goto L_0x00a3
            r0 = 16
            r12.mo14530g(r0)
            goto L_0x00a4
        L_0x00a3:
            r7 = r0
        L_0x00a4:
            if (r7 == r13) goto L_0x00ae
            if (r7 == r5) goto L_0x00ae
            if (r7 == r11) goto L_0x00ae
            r13 = 23
            if (r7 != r13) goto L_0x00b1
        L_0x00ae:
            r12.mo14530g(r10)
        L_0x00b1:
            r12.mo14530g(r6)
        L_0x00b4:
            switch(r8) {
                case 17: goto L_0x00b8;
                case 18: goto L_0x00b7;
                case 19: goto L_0x00b8;
                case 20: goto L_0x00b8;
                case 21: goto L_0x00b8;
                case 22: goto L_0x00b8;
                case 23: goto L_0x00b8;
                default: goto L_0x00b7;
            }
        L_0x00b7:
            goto L_0x00e1
        L_0x00b8:
            int r12 = r12.mo14532i(r9)
            if (r12 == r9) goto L_0x00c1
            if (r12 == r10) goto L_0x00c2
            goto L_0x00e1
        L_0x00c1:
            r10 = r12
        L_0x00c2:
            com.google.ads.interactivemedia.v3.internal.dt r12 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r0 = 33
            r13.<init>(r0)
            java.lang.String r0 = "Unsupported epConfig: "
            r13.append(r0)
            r13.append(r10)
            java.lang.String r13 = r13.toString()
            r12.<init>((java.lang.String) r13)
            throw r12
        L_0x00db:
            java.lang.UnsupportedOperationException r12 = new java.lang.UnsupportedOperationException
            r12.<init>()
            throw r12
        L_0x00e1:
            int[] r12 = f22205c
            r12 = r12[r3]
            r13 = -1
            if (r12 == r13) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r6 = 0
        L_0x00ea:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19462o(r6)
            com.google.ads.interactivemedia.v3.internal.gm r13 = new com.google.ads.interactivemedia.v3.internal.gm
            r13.<init>(r1, r12, r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C6961gn.m20511b(com.google.ads.interactivemedia.v3.internal.aed, boolean):com.google.ads.interactivemedia.v3.internal.gm");
    }

    /* renamed from: c */
    public static int m20512c(int i) {
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    /* renamed from: d */
    private static int m20513d(aed aed) {
        int i = aed.mo14532i(5);
        return i == 31 ? aed.mo14532i(6) + 32 : i;
    }

    /* renamed from: e */
    private static int m20514e(aed aed) {
        int i = aed.mo14532i(4);
        if (i == 15) {
            return aed.mo14532i(24);
        }
        ary.m19462o(i < 13);
        return f22204b[i];
    }
}
