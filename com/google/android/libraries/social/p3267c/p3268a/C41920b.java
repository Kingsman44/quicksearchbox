package com.google.android.libraries.social.p3267c.p3268a;

import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;

/* renamed from: com.google.android.libraries.social.c.a.b */
/* compiled from: PG */
final class C41920b {

    /* renamed from: a */
    private static final char[] f109325a = "http://".toCharArray();

    /* renamed from: b */
    private static final char[] f109326b = "https://".toCharArray();

    /* renamed from: c */
    private static final char[] f109327c = "lh".toCharArray();

    /* renamed from: d */
    private static final char[] f109328d = "photos-image-dev.corp.google.com/".toCharArray();

    /* renamed from: e */
    private static final char[] f109329e = "ap".toCharArray();

    /* renamed from: f */
    private static final char[] f109330f = "yt".toCharArray();

    /* renamed from: g */
    private static final char[] f109331g = "sp".toCharArray();

    /* renamed from: h */
    private static final char[] f109332h = "bp".toCharArray();

    /* renamed from: i */
    private static final char[] f109333i = "ccp-lh".toCharArray();

    /* renamed from: j */
    private static final char[] f109334j = "play-lh".toCharArray();

    /* renamed from: k */
    private static final char[] f109335k = "play-ti-lh".toCharArray();

    /* renamed from: l */
    private static final char[] f109336l = "gz0".toCharArray();

    /* renamed from: m */
    private static final char[] f109337m = ".googleusercontent.com/".toCharArray();

    /* renamed from: n */
    private static final char[] f109338n = "www.google.com/visualsearch/lh/".toCharArray();

    /* renamed from: o */
    private static final char[] f109339o = ".google.com/".toCharArray();

    /* renamed from: p */
    private static final char[] f109340p = ".sandbox.google.com/".toCharArray();

    /* renamed from: q */
    private static final char[] f109341q = ".blogger.com/".toCharArray();

    /* renamed from: r */
    private static final char[] f109342r = ".bp.blogspot.com/".toCharArray();

    /* renamed from: s */
    private static final char[] f109343s = ".ggpht.com/".toCharArray();

    /* renamed from: t */
    private static final char[] f109344t = "image".toCharArray();

    /* renamed from: u */
    private static final char[] f109345u = "%3D".toCharArray();

    /* renamed from: v */
    private static final char[] f109346v = "%3d".toCharArray();

    /* renamed from: w */
    private static final char[][] f109347w = {new char[]{'O'}, new char[]{'J'}, new char[]{'U', 't'}, new char[]{'U'}, new char[]{'I'}};

    /* renamed from: A */
    private int f109348A;

    /* renamed from: B */
    private int f109349B;

    /* renamed from: C */
    private int f109350C;

    /* renamed from: D */
    private boolean f109351D;

    /* renamed from: E */
    private boolean f109352E;

    /* renamed from: F */
    private boolean f109353F;

    /* renamed from: G */
    private boolean f109354G;

    /* renamed from: H */
    private boolean f109355H;

    /* renamed from: I */
    private boolean f109356I = true;

    /* renamed from: J */
    private int f109357J;

    /* renamed from: K */
    private int f109358K;

    /* renamed from: L */
    private int f109359L;

    /* renamed from: M */
    private final int[] f109360M = new int[8];

    /* renamed from: N */
    private final int[] f109361N = new int[8];

    /* renamed from: x */
    private final char[] f109362x = new char[SimpleSnackbar.LENGTH_SHORT];

    /* renamed from: y */
    private int f109363y;

    /* renamed from: z */
    private int f109364z;

    /* renamed from: c */
    private final int m73446c(int i, int i2, char[] cArr) {
        int length = cArr.length;
        while (i + length < i2) {
            int i3 = 0;
            while (i3 < length) {
                if (this.f109362x[i + i3] != cArr[i3]) {
                    i++;
                } else {
                    i3++;
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01bd, code lost:
        if (m73448e(f109337m) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01e2, code lost:
        if (m73448e(f109337m) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0205, code lost:
        if (m73448e(f109341q) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0224, code lost:
        if (m73448e(f109342r) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0230, code lost:
        if (m73448e(f109337m) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        if (m73448e(f109337m) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
        if (m73448e(f109337m) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00aa, code lost:
        if (r5 == '-') goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0100, code lost:
        if (m73448e(f109337m) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011e, code lost:
        if (m73448e(f109343s) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0155, code lost:
        if (m73448e(f109343s) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0180, code lost:
        if (m73448e(f109343s) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a9, code lost:
        if (m73448e(f109343s) == false) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x033c A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m73447d(java.lang.String r10) {
        /*
            r9 = this;
            int r0 = r10.length()
            r9.f109363y = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            if (r0 < r1) goto L_0x000e
            r9.f109356I = r2
            return
        L_0x000e:
            char[] r1 = r9.f109362x
            r10.getChars(r2, r0, r1, r2)
            r9.f109364z = r2
            r9.f109353F = r2
            r9.f109354G = r2
            r9.f109355H = r2
            char[] r10 = f109325a
            boolean r10 = r9.m73448e(r10)
            r0 = 3
            r1 = 2
            r3 = -1
            r4 = 1
            if (r10 != 0) goto L_0x0032
            char[] r10 = f109326b
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0032
        L_0x002f:
            r10 = 0
            goto L_0x023a
        L_0x0032:
            int r10 = r9.f109364z
            r9.f109348A = r10
            char[] r10 = f109327c
            boolean r10 = r9.m73448e(r10)
            r5 = 51
            if (r10 == 0) goto L_0x0122
            r9.f109353F = r4
            char[] r10 = r9.f109362x
            int r6 = r9.f109364z
            char r7 = r10[r6]
            if (r7 < r5) goto L_0x002f
            r5 = 54
            if (r7 > r5) goto L_0x002f
            int r6 = r6 + r4
            r9.f109364z = r6
            char r5 = r10[r6]
            r7 = 45
            if (r5 != r7) goto L_0x008c
            int r5 = r6 + 1
            char r5 = r10[r5]
            r8 = 100
            if (r5 != r8) goto L_0x008a
            r9.f109352E = r4
            int r6 = r6 + r1
            r9.f109364z = r6
            char r10 = r10[r6]
            r5 = 97
            if (r10 < r5) goto L_0x006e
            r5 = 103(0x67, float:1.44E-43)
            if (r10 <= r5) goto L_0x0072
        L_0x006e:
            r5 = 122(0x7a, float:1.71E-43)
            if (r10 != r5) goto L_0x002f
        L_0x0072:
            int r6 = r6 + r4
            r9.f109364z = r6
            char[] r10 = f109340p
            boolean r10 = r9.m73448e(r10)
            if (r10 == 0) goto L_0x0081
            r9.f109354G = r4
            goto L_0x0234
        L_0x0081:
            char[] r10 = f109337m
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0234
            goto L_0x002f
        L_0x008a:
            r5 = 45
        L_0x008c:
            r8 = 116(0x74, float:1.63E-43)
            if (r5 != r7) goto L_0x00aa
            int r5 = r6 + 1
            char r5 = r10[r5]
            if (r5 != r8) goto L_0x00ac
            int r5 = r6 + 2
            char r5 = r10[r5]
            if (r5 != r8) goto L_0x00ac
            r9.f109352E = r4
            int r6 = r6 + r0
            r9.f109364z = r6
            char[] r10 = f109337m
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0234
            goto L_0x002f
        L_0x00aa:
            if (r5 != r7) goto L_0x0104
        L_0x00ac:
            int r5 = r6 + 1
            char r5 = r10[r5]
            if (r5 != r8) goto L_0x0104
            int r5 = r6 + 2
            char r5 = r10[r5]
            r7 = 101(0x65, float:1.42E-43)
            if (r5 != r7) goto L_0x0104
            int r5 = r6 + 3
            char r5 = r10[r5]
            r7 = 115(0x73, float:1.61E-43)
            if (r5 != r7) goto L_0x0104
            int r5 = r6 + 4
            char r5 = r10[r5]
            if (r5 != r8) goto L_0x0104
            int r5 = r6 + 5
            char r5 = r10[r5]
            r7 = 111(0x6f, float:1.56E-43)
            if (r5 != r7) goto L_0x0104
            int r5 = r6 + 6
            char r5 = r10[r5]
            r7 = 110(0x6e, float:1.54E-43)
            if (r5 != r7) goto L_0x0104
            int r5 = r6 + 7
            char r5 = r10[r5]
            r7 = 108(0x6c, float:1.51E-43)
            if (r5 != r7) goto L_0x0104
            int r5 = r6 + 8
            char r10 = r10[r5]
            r5 = 121(0x79, float:1.7E-43)
            if (r10 != r5) goto L_0x0104
            r9.f109352E = r4
            int r6 = r6 + 9
            r9.f109364z = r6
            char[] r10 = f109339o
            boolean r10 = r9.m73448e(r10)
            if (r10 == 0) goto L_0x00fa
            r9.f109354G = r4
            goto L_0x0234
        L_0x00fa:
            char[] r10 = f109337m
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0234
            goto L_0x002f
        L_0x0104:
            char[] r10 = f109339o
            boolean r10 = r9.m73448e(r10)
            if (r10 == 0) goto L_0x0110
            r9.f109354G = r4
            goto L_0x0234
        L_0x0110:
            char[] r10 = f109337m
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0234
            char[] r10 = f109343s
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0234
            goto L_0x002f
        L_0x0122:
            char[] r10 = f109328d
            boolean r10 = r9.m73448e(r10)
            if (r10 == 0) goto L_0x012e
            r9.f109353F = r4
            goto L_0x0234
        L_0x012e:
            char[] r10 = f109331g
            boolean r10 = r9.m73448e(r10)
            r6 = 49
            if (r10 == 0) goto L_0x0159
            r9.f109353F = r4
            char[] r10 = r9.f109362x
            int r7 = r9.f109364z
            char r10 = r10[r7]
            if (r10 < r6) goto L_0x002f
            if (r10 > r5) goto L_0x002f
            int r7 = r7 + r4
            r9.f109364z = r7
            char[] r10 = f109337m
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0234
            char[] r10 = f109343s
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0234
            goto L_0x002f
        L_0x0159:
            char[] r10 = f109330f
            boolean r10 = r9.m73448e(r10)
            r7 = 52
            if (r10 == 0) goto L_0x0184
            r9.f109353F = r4
            char[] r10 = r9.f109362x
            int r6 = r9.f109364z
            char r10 = r10[r6]
            if (r10 < r5) goto L_0x002f
            if (r10 > r7) goto L_0x002f
            int r6 = r6 + r4
            r9.f109364z = r6
            char[] r10 = f109337m
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0234
            char[] r10 = f109343s
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0234
            goto L_0x002f
        L_0x0184:
            char[] r10 = f109329e
            boolean r10 = r9.m73448e(r10)
            if (r10 == 0) goto L_0x01ad
            r9.f109353F = r4
            char[] r10 = r9.f109362x
            int r5 = r9.f109364z
            char r10 = r10[r5]
            r6 = 50
            if (r10 != r6) goto L_0x002f
            int r5 = r5 + r4
            r9.f109364z = r5
            char[] r10 = f109337m
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0234
            char[] r10 = f109343s
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0234
            goto L_0x002f
        L_0x01ad:
            char[] r10 = f109333i
            boolean r10 = r9.m73448e(r10)
            if (r10 == 0) goto L_0x01c1
            r9.f109353F = r2
            char[] r10 = f109337m
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0234
            goto L_0x002f
        L_0x01c1:
            char[] r10 = f109334j
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0228
            char[] r10 = f109335k
            boolean r10 = r9.m73448e(r10)
            if (r10 == 0) goto L_0x01d2
            goto L_0x0228
        L_0x01d2:
            char[] r10 = f109336l
            boolean r10 = r9.m73448e(r10)
            if (r10 == 0) goto L_0x01e6
            r9.f109353F = r2
            char[] r10 = f109337m
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0234
            goto L_0x002f
        L_0x01e6:
            r9.f109353F = r2
            char[] r10 = f109332h
            boolean r10 = r9.m73448e(r10)
            if (r10 == 0) goto L_0x0209
            char[] r10 = r9.f109362x
            int r6 = r9.f109364z
            char r10 = r10[r6]
            r7 = 48
            if (r10 < r7) goto L_0x002f
            if (r10 > r5) goto L_0x002f
            int r6 = r6 + r4
            r9.f109364z = r6
            char[] r10 = f109341q
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0234
            goto L_0x002f
        L_0x0209:
            char[] r10 = f109338n
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0234
            char[] r10 = r9.f109362x
            int r5 = r9.f109364z
            char r10 = r10[r5]
            if (r10 < r6) goto L_0x002f
            if (r10 > r7) goto L_0x002f
            int r5 = r5 + r4
            r9.f109364z = r5
            char[] r10 = f109342r
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0234
            goto L_0x002f
        L_0x0228:
            r9.f109353F = r2
            char[] r10 = f109337m
            boolean r10 = r9.m73448e(r10)
            if (r10 != 0) goto L_0x0234
            goto L_0x002f
        L_0x0234:
            int r10 = r9.f109364z
            int r10 = r10 + r3
            r9.f109358K = r10
            r10 = 1
        L_0x023a:
            r9.f109351D = r10
            if (r10 != 0) goto L_0x0241
            r9.f109356I = r2
            return
        L_0x0241:
            int r10 = r9.f109364z
            r9.f109359L = r2
            r5 = r10
        L_0x0246:
            int r6 = r9.f109363y
            if (r10 == r6) goto L_0x0266
            char[] r7 = r9.f109362x
            char r7 = r7[r10]
            r8 = 47
            if (r7 != r8) goto L_0x0253
            goto L_0x0266
        L_0x0253:
            r8 = 63
            if (r7 != r8) goto L_0x0286
            int[] r6 = r9.f109360M
            int r7 = r9.f109359L
            r6[r7] = r5
            int[] r6 = r9.f109361N
            int r10 = r10 - r5
            r6[r7] = r10
            int r7 = r7 + r4
            r9.f109359L = r7
            goto L_0x0288
        L_0x0266:
            if (r10 != r5) goto L_0x026d
            if (r10 == r6) goto L_0x026d
            int r5 = r10 + 1
            goto L_0x0286
        L_0x026d:
            int r7 = r9.f109359L
            r8 = 8
            if (r7 < r8) goto L_0x0276
            r9.f109356I = r2
            return
        L_0x0276:
            int[] r8 = r9.f109360M
            r8[r7] = r5
            int[] r8 = r9.f109361N
            int r5 = r10 - r5
            r8[r7] = r5
            int r5 = r10 + 1
            int r7 = r7 + 1
            r9.f109359L = r7
        L_0x0286:
            if (r10 != r6) goto L_0x0375
        L_0x0288:
            int r10 = r9.f109359L
            if (r10 <= r4) goto L_0x02a1
            int[] r10 = r9.f109361N
            r10 = r10[r2]
            char[] r5 = f109344t
            int r6 = r5.length
            if (r10 != r6) goto L_0x02a1
            int[] r10 = r9.f109360M
            r10 = r10[r2]
            boolean r10 = r9.m73449f(r10, r5)
            if (r10 == 0) goto L_0x02a1
            r10 = 1
            goto L_0x02a2
        L_0x02a1:
            r10 = 0
        L_0x02a2:
            r5 = 4
            r6 = 5
            if (r10 != 0) goto L_0x02b3
            int r7 = r9.f109359L
            if (r7 != r6) goto L_0x02b3
            int[] r10 = r9.f109360M
            r10 = r10[r5]
        L_0x02ae:
            r9.f109349B = r10
            r9.f109357J = r2
            goto L_0x02e4
        L_0x02b3:
            r7 = 6
            if (r10 == 0) goto L_0x02bf
            int r8 = r9.f109359L
            if (r8 != r7) goto L_0x02bf
            int[] r10 = r9.f109360M
            r10 = r10[r6]
            goto L_0x02ae
        L_0x02bf:
            if (r10 != 0) goto L_0x02d2
            int r8 = r9.f109359L
            if (r8 != r7) goto L_0x02d2
            int[] r10 = r9.f109360M
            r10 = r10[r5]
            r9.f109349B = r10
            int[] r10 = r9.f109361N
            r10 = r10[r5]
        L_0x02cf:
            r9.f109357J = r10
            goto L_0x02e4
        L_0x02d2:
            if (r10 == 0) goto L_0x02e9
            int r10 = r9.f109359L
            r5 = 7
            if (r10 != r5) goto L_0x02e9
            int[] r10 = r9.f109360M
            r10 = r10[r6]
            r9.f109349B = r10
            int[] r10 = r9.f109361N
            r10 = r10[r6]
            goto L_0x02cf
        L_0x02e4:
            r9.f109355H = r4
            r9.f109356I = r4
            return
        L_0x02e9:
            int r10 = r9.f109359L
            if (r10 > 0) goto L_0x02ef
            goto L_0x0372
        L_0x02ef:
            int[] r10 = r9.f109361N
            r10 = r10[r2]
            char[] r5 = f109344t
            int r6 = r5.length
            if (r10 != r6) goto L_0x0304
            int[] r10 = r9.f109360M
            r10 = r10[r2]
            boolean r10 = r9.m73449f(r10, r5)
            if (r10 == 0) goto L_0x0304
            r10 = 1
            goto L_0x0305
        L_0x0304:
            r10 = 0
        L_0x0305:
            int r5 = r9.f109359L
            if (r5 != r4) goto L_0x0315
            if (r10 != 0) goto L_0x0314
            int[] r10 = r9.f109360M
            r10 = r10[r2]
            int[] r0 = r9.f109361N
            r0 = r0[r2]
            goto L_0x032c
        L_0x0314:
            r5 = 1
        L_0x0315:
            if (r5 != r1) goto L_0x0320
            int[] r10 = r9.f109360M
            r10 = r10[r4]
            int[] r0 = r9.f109361N
            r0 = r0[r4]
            goto L_0x032c
        L_0x0320:
            if (r5 != r0) goto L_0x0372
            if (r10 == 0) goto L_0x0372
            int[] r10 = r9.f109360M
            r10 = r10[r1]
            int[] r0 = r9.f109361N
            r0 = r0[r1]
        L_0x032c:
            int r1 = r10 + r0
            r5 = r10
        L_0x032f:
            if (r5 >= r1) goto L_0x033c
            char[] r6 = r9.f109362x
            char r6 = r6[r5]
            r7 = 61
            if (r6 == r7) goto L_0x033d
            int r5 = r5 + 1
            goto L_0x032f
        L_0x033c:
            r5 = -1
        L_0x033d:
            r9.f109350C = r5
            if (r5 == r3) goto L_0x0346
            int r6 = r5 + 1
            r9.f109349B = r6
            goto L_0x035e
        L_0x0346:
            char[] r5 = f109345u
            int r5 = r9.m73446c(r10, r1, r5)
            r9.f109350C = r5
            if (r5 != r3) goto L_0x0358
            char[] r5 = f109346v
            int r5 = r9.m73446c(r10, r1, r5)
            r9.f109350C = r5
        L_0x0358:
            if (r5 == r3) goto L_0x035e
            int r6 = r5 + 3
            r9.f109349B = r6
        L_0x035e:
            if (r5 == r3) goto L_0x0367
            int r1 = r9.f109349B
            int r1 = r1 - r10
            int r0 = r0 - r1
            r9.f109357J = r0
            goto L_0x036d
        L_0x0367:
            r9.f109350C = r1
            r9.f109349B = r1
            r9.f109357J = r2
        L_0x036d:
            r9.f109355H = r2
            r9.f109356I = r4
            return
        L_0x0372:
            r9.f109356I = r2
            return
        L_0x0375:
            int r10 = r10 + 1
            goto L_0x0246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.p3267c.p3268a.C41920b.m73447d(java.lang.String):void");
    }

    /* renamed from: e */
    private final boolean m73448e(char[] cArr) {
        int i = this.f109364z;
        int length = cArr.length;
        if (i + length > this.f109363y) {
            return false;
        }
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            int i4 = i2 + 1;
            if (this.f109362x[i] != cArr[i2]) {
                return false;
            }
            i = i3;
            i2 = i4;
        }
        this.f109364z = i;
        return true;
    }

    /* renamed from: f */
    private final boolean m73449f(int i, char[] cArr) {
        int length = cArr.length;
        if (i + length > this.f109363y) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f109362x[i + i2] != cArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo44383a(String str) {
        m73447d(str);
        return this.f109351D;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x016a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo44384b(java.lang.String r18, int r19, int r20, int r21, int r22, int r23) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r23
            monitor-enter(r17)
            r17.m73447d(r18)     // Catch:{ all -> 0x0292 }
            boolean r3 = r1.f109356I     // Catch:{ all -> 0x0292 }
            if (r3 == 0) goto L_0x028f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0292 }
            int r4 = r1.f109363y     // Catch:{ all -> 0x0292 }
            r5 = 50
            int r4 = r4 + r5
            r3.<init>(r4)     // Catch:{ all -> 0x0292 }
            r4 = r0 & 8192(0x2000, float:1.14794E-41)
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L_0x0020
            r4 = 1
            goto L_0x0021
        L_0x0020:
            r4 = 0
        L_0x0021:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0027
            r8 = 1
            goto L_0x0028
        L_0x0027:
            r8 = 0
        L_0x0028:
            int r9 = com.google.android.libraries.social.p3267c.p3268a.C41921c.f109365a     // Catch:{ all -> 0x0292 }
            boolean r9 = r1.f109353F     // Catch:{ all -> 0x0292 }
            if (r9 == 0) goto L_0x0077
            if (r4 != 0) goto L_0x0033
            if (r8 == 0) goto L_0x0077
            r8 = 1
        L_0x0033:
            char[] r9 = r1.f109362x     // Catch:{ all -> 0x0292 }
            int r10 = r1.f109348A     // Catch:{ all -> 0x0292 }
            r3.append(r9, r6, r10)     // Catch:{ all -> 0x0292 }
            boolean r9 = r1.f109354G     // Catch:{ all -> 0x0292 }
            if (r9 != 0) goto L_0x004f
            if (r8 == 0) goto L_0x004f
            boolean r8 = r1.f109352E     // Catch:{ all -> 0x0292 }
            if (r8 != 0) goto L_0x004f
            char[] r4 = f109331g     // Catch:{ all -> 0x0292 }
            r3.append(r4)     // Catch:{ all -> 0x0292 }
            r4 = 49
            r3.append(r4)     // Catch:{ all -> 0x0292 }
            goto L_0x0068
        L_0x004f:
            if (r4 == 0) goto L_0x005e
            boolean r4 = r1.f109352E     // Catch:{ all -> 0x0292 }
            if (r4 != 0) goto L_0x005e
            char[] r4 = f109329e     // Catch:{ all -> 0x0292 }
            r3.append(r4)     // Catch:{ all -> 0x0292 }
            r3.append(r5)     // Catch:{ all -> 0x0292 }
            goto L_0x0068
        L_0x005e:
            char[] r4 = f109327c     // Catch:{ all -> 0x0292 }
            r3.append(r4)     // Catch:{ all -> 0x0292 }
            r4 = 51
            r3.append(r4)     // Catch:{ all -> 0x0292 }
        L_0x0068:
            int r4 = r1.f109348A     // Catch:{ all -> 0x0292 }
            int r4 = r4 + 3
            char[] r5 = r1.f109362x     // Catch:{ all -> 0x0292 }
            int r8 = r1.f109358K     // Catch:{ all -> 0x0292 }
            int r8 = r8 - r4
            r3.append(r5, r4, r8)     // Catch:{ all -> 0x0292 }
            int r4 = r1.f109358K     // Catch:{ all -> 0x0292 }
            goto L_0x0078
        L_0x0077:
            r4 = 0
        L_0x0078:
            boolean r5 = r1.f109355H     // Catch:{ all -> 0x0292 }
            if (r5 == 0) goto L_0x0085
            char[] r5 = r1.f109362x     // Catch:{ all -> 0x0292 }
            int r8 = r1.f109349B     // Catch:{ all -> 0x0292 }
            int r8 = r8 - r4
            r3.append(r5, r4, r8)     // Catch:{ all -> 0x0292 }
            goto L_0x0092
        L_0x0085:
            char[] r5 = r1.f109362x     // Catch:{ all -> 0x0292 }
            int r8 = r1.f109350C     // Catch:{ all -> 0x0292 }
            int r8 = r8 - r4
            r3.append(r5, r4, r8)     // Catch:{ all -> 0x0292 }
            r4 = 61
            r3.append(r4)     // Catch:{ all -> 0x0292 }
        L_0x0092:
            int r4 = r3.length()     // Catch:{ all -> 0x0292 }
            if (r20 != 0) goto L_0x00a6
            if (r21 != 0) goto L_0x00a2
            java.lang.String r5 = "s0-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
            r5 = 0
            r8 = 0
            goto L_0x00aa
        L_0x00a2:
            r8 = r21
            r5 = 0
            goto L_0x00aa
        L_0x00a6:
            r5 = r20
            r8 = r21
        L_0x00aa:
            r9 = 45
            if (r5 == 0) goto L_0x00b9
            r10 = 119(0x77, float:1.67E-43)
            r3.append(r10)     // Catch:{ all -> 0x0292 }
            r3.append(r5)     // Catch:{ all -> 0x0292 }
            r3.append(r9)     // Catch:{ all -> 0x0292 }
        L_0x00b9:
            if (r8 == 0) goto L_0x00c6
            r5 = 104(0x68, float:1.46E-43)
            r3.append(r5)     // Catch:{ all -> 0x0292 }
            r3.append(r8)     // Catch:{ all -> 0x0292 }
            r3.append(r9)     // Catch:{ all -> 0x0292 }
        L_0x00c6:
            r5 = r0 & 32
            if (r5 == 0) goto L_0x00cf
            java.lang.String r5 = "rw-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x00cf:
            r5 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 & r0
            if (r5 == 0) goto L_0x00d9
            java.lang.String r5 = "mo-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x00d9:
            r5 = 1048576(0x100000, float:1.469368E-39)
            r5 = r5 & r0
            if (r5 == 0) goto L_0x00e3
            java.lang.String r5 = "pa-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x00e3:
            r5 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L_0x00ec
            java.lang.String r5 = "rwa-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x00ec:
            r5 = r0 & 1
            if (r5 == 0) goto L_0x00f5
            java.lang.String r5 = "c-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x00f5:
            r5 = 4194304(0x400000, float:5.877472E-39)
            r5 = r5 & r0
            if (r5 == 0) goto L_0x00ff
            java.lang.String r5 = "cc-c0-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x00ff:
            r5 = 33554432(0x2000000, float:9.403955E-38)
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0109
            java.lang.String r5 = "n-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x0109:
            r5 = r0 & 2
            if (r5 == 0) goto L_0x0112
            java.lang.String r5 = "d-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x0112:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x011b
            java.lang.String r5 = "k-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x011b:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0124
            java.lang.String r5 = "no-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x0124:
            r5 = r0 & 64
            if (r5 == 0) goto L_0x012d
            java.lang.String r5 = "nu-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x012d:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0136
            java.lang.String r5 = "p-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x0136:
            r5 = r0 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L_0x013f
            java.lang.String r5 = "lf-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x013f:
            r5 = r0 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x0148
            java.lang.String r5 = "fSoften=0,25,0-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x0148:
            r5 = r0 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0151
            java.lang.String r5 = "ip-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x0151:
            r5 = r0 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x015a
            java.lang.String r5 = "rj-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x015a:
            r5 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0165
            java.lang.String r5 = "fBoxBlur=2,24,24-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x0165:
            r5 = 65536(0x10000, float:9.18355E-41)
            r5 = r5 & r0
            if (r5 == 0) goto L_0x016f
            java.lang.String r5 = "al-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x016f:
            r5 = 131072(0x20000, float:1.83671E-40)
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0179
            java.lang.String r5 = "rh-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x0179:
            r5 = 2097152(0x200000, float:2.938736E-39)
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0183
            java.lang.String r5 = "m18-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x0183:
            r5 = 262144(0x40000, float:3.67342E-40)
            r5 = r5 & r0
            if (r5 == 0) goto L_0x018d
            java.lang.String r5 = "ns-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x018d:
            r5 = 8388608(0x800000, float:1.17549435E-38)
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0197
            java.lang.String r5 = "sg-"
            r3.append(r5)     // Catch:{ all -> 0x0292 }
        L_0x0197:
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r5
            if (r0 == 0) goto L_0x01a1
            java.lang.String r0 = "gd-"
            r3.append(r0)     // Catch:{ all -> 0x0292 }
        L_0x01a1:
            r0 = 118(0x76, float:1.65E-43)
            r5 = -1
            r8 = r22
            if (r8 == r5) goto L_0x01b3
            if (r2 == r5) goto L_0x01b3
            r3.append(r0)     // Catch:{ all -> 0x0292 }
            r3.append(r2)     // Catch:{ all -> 0x0292 }
            r3.append(r9)     // Catch:{ all -> 0x0292 }
        L_0x01b3:
            int r2 = r1.f109349B     // Catch:{ all -> 0x0292 }
            int r8 = r1.f109357J     // Catch:{ all -> 0x0292 }
            int r8 = r8 + r2
        L_0x01b8:
            if (r2 >= r8) goto L_0x020c
            r10 = 0
        L_0x01bb:
            char[][] r11 = f109347w     // Catch:{ all -> 0x0292 }
            int r12 = r11.length     // Catch:{ all -> 0x0292 }
            r12 = 5
            if (r10 >= r12) goto L_0x01fd
            r11 = r11[r10]     // Catch:{ all -> 0x0292 }
            r13 = r2
            r12 = 0
        L_0x01c5:
            int r14 = r11.length     // Catch:{ all -> 0x0292 }
            if (r12 >= r14) goto L_0x01e0
            if (r13 >= r8) goto L_0x01e0
            int r15 = r12 + 1
            int r16 = r13 + 1
            char r12 = r11[r12]     // Catch:{ all -> 0x0292 }
            char[] r6 = r1.f109362x     // Catch:{ all -> 0x0292 }
            char r6 = r6[r13]     // Catch:{ all -> 0x0292 }
            if (r12 == r6) goto L_0x01db
            r12 = r15
            r13 = r16
            r6 = 0
            goto L_0x01e1
        L_0x01db:
            r12 = r15
            r13 = r16
            r6 = 0
            goto L_0x01c5
        L_0x01e0:
            r6 = 1
        L_0x01e1:
            if (r6 == 0) goto L_0x01f9
            if (r12 != r14) goto L_0x01f9
            if (r13 == r8) goto L_0x01ee
            char[] r6 = r1.f109362x     // Catch:{ all -> 0x0292 }
            char r6 = r6[r13]     // Catch:{ all -> 0x0292 }
            if (r6 == r9) goto L_0x01ee
            goto L_0x01f9
        L_0x01ee:
            char[][] r6 = f109347w     // Catch:{ all -> 0x0292 }
            r6 = r6[r10]     // Catch:{ all -> 0x0292 }
            r3.append(r6)     // Catch:{ all -> 0x0292 }
            r3.append(r9)     // Catch:{ all -> 0x0292 }
            goto L_0x01fd
        L_0x01f9:
            int r10 = r10 + 1
            r6 = 0
            goto L_0x01bb
        L_0x01fd:
            if (r2 >= r8) goto L_0x0208
            char[] r6 = r1.f109362x     // Catch:{ all -> 0x0292 }
            char r6 = r6[r2]     // Catch:{ all -> 0x0292 }
            if (r6 == r9) goto L_0x0208
            int r2 = r2 + 1
            goto L_0x01fd
        L_0x0208:
            int r2 = r2 + 1
            r6 = 0
            goto L_0x01b8
        L_0x020c:
            int r2 = r1.f109349B     // Catch:{ all -> 0x0292 }
            int r6 = r1.f109357J     // Catch:{ all -> 0x0292 }
            int r6 = r6 + r2
        L_0x0211:
            if (r2 >= r6) goto L_0x0231
            char[] r8 = r1.f109362x     // Catch:{ all -> 0x0292 }
            char r8 = r8[r2]     // Catch:{ all -> 0x0292 }
        L_0x0217:
            r10 = 102(0x66, float:1.43E-43)
            if (r2 >= r6) goto L_0x0229
            char[] r11 = r1.f109362x     // Catch:{ all -> 0x0292 }
            char r11 = r11[r2]     // Catch:{ all -> 0x0292 }
            if (r11 == r9) goto L_0x0229
            if (r8 != r10) goto L_0x0226
            r3.append(r11)     // Catch:{ all -> 0x0292 }
        L_0x0226:
            int r2 = r2 + 1
            goto L_0x0217
        L_0x0229:
            if (r8 != r10) goto L_0x022e
            r3.append(r9)     // Catch:{ all -> 0x0292 }
        L_0x022e:
            int r2 = r2 + 1
            goto L_0x0211
        L_0x0231:
            int r2 = r1.f109349B     // Catch:{ all -> 0x0292 }
            int r6 = r1.f109357J     // Catch:{ all -> 0x0292 }
            int r6 = r6 + r2
        L_0x0236:
            if (r2 >= r6) goto L_0x0261
            char[] r8 = r1.f109362x     // Catch:{ all -> 0x0292 }
            char r10 = r8[r2]     // Catch:{ all -> 0x0292 }
            r11 = 105(0x69, float:1.47E-43)
            if (r10 != r11) goto L_0x0248
            int r10 = r2 + 1
            char r8 = r8[r10]     // Catch:{ all -> 0x0292 }
            if (r8 != r0) goto L_0x0248
            r8 = 1
            goto L_0x0249
        L_0x0248:
            r8 = 0
        L_0x0249:
            if (r2 >= r6) goto L_0x0259
            char[] r10 = r1.f109362x     // Catch:{ all -> 0x0292 }
            char r10 = r10[r2]     // Catch:{ all -> 0x0292 }
            if (r10 == r9) goto L_0x0259
            if (r8 == 0) goto L_0x0256
            r3.append(r10)     // Catch:{ all -> 0x0292 }
        L_0x0256:
            int r2 = r2 + 1
            goto L_0x0249
        L_0x0259:
            if (r8 == 0) goto L_0x025e
            r3.append(r9)     // Catch:{ all -> 0x0292 }
        L_0x025e:
            int r2 = r2 + 1
            goto L_0x0236
        L_0x0261:
            int r0 = r3.length()     // Catch:{ all -> 0x0292 }
            if (r0 <= r4) goto L_0x026f
            int r0 = r3.length()     // Catch:{ all -> 0x0292 }
            int r0 = r0 + r5
            r3.setLength(r0)     // Catch:{ all -> 0x0292 }
        L_0x026f:
            boolean r0 = r1.f109355H     // Catch:{ all -> 0x0292 }
            if (r0 == 0) goto L_0x027c
            int r0 = r1.f109357J     // Catch:{ all -> 0x0292 }
            if (r0 != 0) goto L_0x027c
            r0 = 47
            r3.append(r0)     // Catch:{ all -> 0x0292 }
        L_0x027c:
            char[] r0 = r1.f109362x     // Catch:{ all -> 0x0292 }
            int r2 = r1.f109349B     // Catch:{ all -> 0x0292 }
            int r4 = r1.f109357J     // Catch:{ all -> 0x0292 }
            int r2 = r2 + r4
            int r4 = r1.f109363y     // Catch:{ all -> 0x0292 }
            int r4 = r4 - r2
            r3.append(r0, r2, r4)     // Catch:{ all -> 0x0292 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0292 }
            monitor-exit(r17)
            return r0
        L_0x028f:
            monitor-exit(r17)
            r0 = 0
            return r0
        L_0x0292:
            r0 = move-exception
            monitor-exit(r17)
            goto L_0x0296
        L_0x0295:
            throw r0
        L_0x0296:
            goto L_0x0295
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.p3267c.p3268a.C41920b.mo44384b(java.lang.String, int, int, int, int, int):java.lang.String");
    }
}
