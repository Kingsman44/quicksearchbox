package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.il */
/* compiled from: PG */
public final class C7013il {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String[] f22432a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final int[] f22433b = {44100, 48000, 32000};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final int[] f22434c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final int[] f22435d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final int[] f22436e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final int[] f22437f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final int[] f22438g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: b */
    public static int m20764b(int i) {
        int i2;
        int i3;
        if (!m20774l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return m20775m(i2, i3);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m20774l(int i) {
        return (i & -2097152) == -2097152;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static int m20775m(int i, int i2) {
        return i2 != 1 ? i2 != 2 ? 384 : 1152 : i == 3 ? 1152 : 576;
    }

    /* renamed from: a */
    public static int m20763a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!m20774l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f22433b[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f22434c[i4 - 1] : f22435d[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f22436e[i4 - 1] : f22437f[i4 - 1];
        } else {
            i6 = f22438g[i4 - 1];
        }
        int i9 = 144;
        if (i2 == 3) {
            return ((i6 * 144) / i7) + i8;
        }
        if (i3 == 1) {
            i9 = 72;
        }
        return ((i9 * i6) / i7) + i8;
    }
}
