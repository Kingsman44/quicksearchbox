package com.google.ads.interactivemedia.p367v3.internal;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aaw */
/* compiled from: PG */
public final class aaw extends abf {

    /* renamed from: a */
    public static final /* synthetic */ int f20155a = 0;

    /* renamed from: b */
    private static final int[] f20156b = new int[0];
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final asc f20157c = asc.m19476c(aal.f20077a);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final asc f20158d = asc.m19476c(aam.f20078a);

    /* renamed from: e */
    private final AtomicReference f20159e;

    /* renamed from: f */
    private final aah f20160f;

    @Deprecated
    public aaw() {
        aaq aaq = aaq.f20093a;
        throw null;
    }

    /* renamed from: b */
    protected static boolean m18093b(int i, boolean z) {
        int r = asn.m19531r(i);
        if (r != 4) {
            return z && r == 3;
        }
        return true;
    }

    /* renamed from: c */
    protected static String m18094c(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: d */
    protected static int m18095d(C6864cy cyVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(cyVar.f21803c)) {
            return 4;
        }
        String c = m18094c(str);
        String c2 = m18094c(cyVar.f21803c);
        if (c2 == null || c == null) {
            if (!z || c2 != null) {
                return 0;
            }
            return 1;
        } else if (c2.startsWith(c) || c.startsWith(c2)) {
            return 3;
        } else {
            if (aeu.m18483A(c2, "-")[0].equals(aeu.m18483A(c, "-")[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* renamed from: j */
    private static boolean m18098j(C6864cy cyVar, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if ((cyVar.f21805e & 16384) != 0 || !m18093b(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !aeu.m18533c(cyVar.f21812l, str)) {
            return false;
        }
        int i11 = cyVar.f21817q;
        if (i11 != -1 && (i7 > i11 || i11 > i3)) {
            return false;
        }
        int i12 = cyVar.f21818r;
        if (i12 != -1 && (i8 > i12 || i12 > i4)) {
            return false;
        }
        float f = cyVar.f21819s;
        if (f != -1.0f && (((float) i9) > f || f > ((float) i5))) {
            return false;
        }
        int i13 = cyVar.f21808h;
        if (i13 == -1) {
            return true;
        }
        if (i10 > i13 || i13 > i6) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List m18099k(com.google.ads.interactivemedia.p367v3.internal.C7360vh r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.f24048a
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L_0x0009:
            int r3 = r12.f24048a
            if (r2 >= r3) goto L_0x0017
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0017:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto L_0x00a5
            if (r14 == r2) goto L_0x00a5
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0022:
            int r5 = r12.f24048a
            if (r3 >= r5) goto L_0x007f
            com.google.ads.interactivemedia.v3.internal.cy r5 = r12.mo16648a(r3)
            int r6 = r5.f21817q
            if (r6 <= 0) goto L_0x007c
            int r7 = r5.f21818r
            if (r7 <= 0) goto L_0x007c
            if (r15 == 0) goto L_0x0042
            r8 = 1
            if (r6 > r7) goto L_0x0039
            r9 = 0
            goto L_0x003a
        L_0x0039:
            r9 = 1
        L_0x003a:
            if (r13 > r14) goto L_0x003d
            r8 = 0
        L_0x003d:
            if (r9 == r8) goto L_0x0042
            r8 = r13
            r9 = r14
            goto L_0x0044
        L_0x0042:
            r9 = r13
            r8 = r14
        L_0x0044:
            int r10 = r6 * r8
            int r11 = r7 * r9
            if (r10 < r11) goto L_0x0054
            android.graphics.Point r7 = new android.graphics.Point
            int r6 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18488F(r11, r6)
            r7.<init>(r9, r6)
            goto L_0x005e
        L_0x0054:
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18488F(r10, r7)
            r6.<init>(r7, r8)
            r7 = r6
        L_0x005e:
            int r6 = r5.f21817q
            int r8 = r5.f21818r
            int r8 = r8 * r6
            int r9 = r7.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r6 < r9) goto L_0x007c
            int r5 = r5.f21818r
            int r6 = r7.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L_0x007c
            if (r8 >= r4) goto L_0x007c
            r4 = r8
        L_0x007c:
            int r3 = r3 + 1
            goto L_0x0022
        L_0x007f:
            if (r4 == r2) goto L_0x00a5
            int r13 = r0.size()
            r14 = -1
            int r13 = r13 + r14
        L_0x0087:
            if (r13 < 0) goto L_0x00a5
            java.lang.Object r15 = r0.get(r13)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            com.google.ads.interactivemedia.v3.internal.cy r15 = r12.mo16648a(r15)
            int r15 = r15.mo15639d()
            if (r15 == r14) goto L_0x009f
            if (r15 <= r4) goto L_0x00a2
        L_0x009f:
            r0.remove(r13)
        L_0x00a2:
            int r13 = r13 + -1
            goto L_0x0087
        L_0x00a5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.aaw.m18099k(com.google.ads.interactivemedia.v3.internal.vh, int, int, boolean):java.util.List");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x015b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0161 A[LOOP:1: B:21:0x004a->B:63:0x0161, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x020d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair mo14369a(com.google.ads.interactivemedia.p367v3.internal.aay r44, int[][][] r45, int[] r46) {
        /*
            r43 = this;
            r0 = r43
            r1 = r44
            java.util.concurrent.atomic.AtomicReference r2 = r0.f20159e
            java.lang.Object r2 = r2.get()
            com.google.ads.interactivemedia.v3.internal.aaq r2 = (com.google.ads.interactivemedia.p367v3.internal.aaq) r2
            int r3 = r44.mo14370a()
            int r4 = r44.mo14370a()
            com.google.ads.interactivemedia.v3.internal.aaz[] r5 = new com.google.ads.interactivemedia.p367v3.internal.aaz[r4]
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0019:
            r10 = 2
            r13 = 1
            if (r7 >= r4) goto L_0x0246
            int r14 = r1.mo14371b(r7)
            if (r14 != r10) goto L_0x022d
            if (r8 != 0) goto L_0x0213
            com.google.ads.interactivemedia.v3.internal.vj r8 = r1.mo14372c(r7)
            r14 = r45[r7]
            r15 = r46[r7]
            boolean r12 = r2.f20117w
            if (r12 != 0) goto L_0x017c
            boolean r12 = r2.f20116v
            if (r12 != 0) goto L_0x017c
            boolean r12 = r2.f20106l
            if (r13 == r12) goto L_0x003c
            r12 = 16
            goto L_0x003e
        L_0x003c:
            r12 = 24
        L_0x003e:
            boolean r6 = r2.f20105k
            if (r6 == 0) goto L_0x0048
            r6 = r15 & r12
            if (r6 == 0) goto L_0x0048
            r6 = 1
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            r15 = 0
        L_0x004a:
            int r13 = r8.f24052b
            if (r15 >= r13) goto L_0x017c
            com.google.ads.interactivemedia.v3.internal.vh r13 = r8.mo16656a(r15)
            r29 = r14[r15]
            int r11 = r2.f20096b
            int r10 = r2.f20097c
            int r0 = r2.f20098d
            r30 = r3
            int r3 = r2.f20099e
            r31 = r4
            int r4 = r2.f20100f
            r32 = r9
            int r9 = r2.f20101g
            int r1 = r2.f20102h
            r33 = r5
            int r5 = r2.f20103i
            r34 = r7
            int r7 = r2.f20107m
            r35 = r14
            int r14 = r2.f20108n
            r36 = r8
            boolean r8 = r2.f20109o
            r37 = r2
            int r2 = r13.f24048a
            r38 = r15
            r15 = 2
            if (r2 >= r15) goto L_0x0087
            int[] r0 = f20156b
        L_0x0083:
            r39 = r6
            goto L_0x0158
        L_0x0087:
            java.util.List r2 = m18099k(r13, r7, r14, r8)
            int r7 = r2.size()
            if (r7 >= r15) goto L_0x0094
            int[] r0 = f20156b
            goto L_0x0083
        L_0x0094:
            if (r6 != 0) goto L_0x010e
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r39 = r6
            r8 = 0
            r14 = 0
            r15 = 0
        L_0x00a0:
            int r6 = r2.size()
            if (r14 >= r6) goto L_0x010b
            java.lang.Object r6 = r2.get(r14)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            com.google.ads.interactivemedia.v3.internal.cy r6 = r13.mo16648a(r6)
            java.lang.String r6 = r6.f21812l
            boolean r17 = r7.add(r6)
            if (r17 == 0) goto L_0x00fe
            r40 = r7
            r41 = r8
            r42 = r14
            r7 = 0
            r8 = 0
        L_0x00c4:
            int r14 = r2.size()
            if (r7 >= r14) goto L_0x00f9
            java.lang.Object r14 = r2.get(r7)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            com.google.ads.interactivemedia.v3.internal.cy r17 = r13.mo16648a(r14)
            r19 = r29[r14]
            r18 = r6
            r20 = r12
            r21 = r11
            r22 = r10
            r23 = r0
            r24 = r3
            r25 = r4
            r26 = r9
            r27 = r1
            r28 = r5
            boolean r14 = m18098j(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r14 == 0) goto L_0x00f6
            int r8 = r8 + 1
        L_0x00f6:
            int r7 = r7 + 1
            goto L_0x00c4
        L_0x00f9:
            if (r8 <= r15) goto L_0x0104
            r15 = r8
            r8 = r6
            goto L_0x0106
        L_0x00fe:
            r40 = r7
            r41 = r8
            r42 = r14
        L_0x0104:
            r8 = r41
        L_0x0106:
            int r14 = r42 + 1
            r7 = r40
            goto L_0x00a0
        L_0x010b:
            r41 = r8
            goto L_0x0112
        L_0x010e:
            r39 = r6
            r41 = 0
        L_0x0112:
            int r6 = r2.size()
            r7 = -1
            int r6 = r6 + r7
        L_0x0118:
            if (r6 < 0) goto L_0x014a
            java.lang.Object r7 = r2.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            com.google.ads.interactivemedia.v3.internal.cy r17 = r13.mo16648a(r7)
            r19 = r29[r7]
            r18 = r41
            r20 = r12
            r21 = r11
            r22 = r10
            r23 = r0
            r24 = r3
            r25 = r4
            r26 = r9
            r27 = r1
            r28 = r5
            boolean r7 = m18098j(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r7 != 0) goto L_0x0147
            r2.remove(r6)
        L_0x0147:
            int r6 = r6 + -1
            goto L_0x0118
        L_0x014a:
            int r0 = r2.size()
            r1 = 2
            if (r0 >= r1) goto L_0x0154
            int[] r0 = f20156b
            goto L_0x0158
        L_0x0154:
            int[] r0 = com.google.ads.interactivemedia.p367v3.internal.aqd.m19285m(r2)
        L_0x0158:
            int r1 = r0.length
            if (r1 <= 0) goto L_0x0161
            com.google.ads.interactivemedia.v3.internal.aaz r1 = new com.google.ads.interactivemedia.v3.internal.aaz
            r1.<init>(r13, r0)
            goto L_0x018d
        L_0x0161:
            int r15 = r38 + 1
            r0 = r43
            r1 = r44
            r3 = r30
            r4 = r31
            r9 = r32
            r5 = r33
            r7 = r34
            r14 = r35
            r8 = r36
            r2 = r37
            r6 = r39
            r10 = 2
            goto L_0x004a
        L_0x017c:
            r37 = r2
            r30 = r3
            r31 = r4
            r33 = r5
            r34 = r7
            r36 = r8
            r32 = r9
            r35 = r14
            r1 = 0
        L_0x018d:
            if (r1 != 0) goto L_0x0200
            r3 = r36
            r0 = 0
            r1 = 0
            r2 = 0
            r11 = -1
        L_0x0195:
            int r4 = r3.f24052b
            if (r2 >= r4) goto L_0x01ee
            com.google.ads.interactivemedia.v3.internal.vh r4 = r3.mo16656a(r2)
            r5 = r37
            int r6 = r5.f20107m
            int r7 = r5.f20108n
            boolean r8 = r5.f20109o
            java.util.List r6 = m18099k(r4, r6, r7, r8)
            r7 = r35[r2]
            r8 = 0
        L_0x01ac:
            int r9 = r4.f24048a
            if (r8 >= r9) goto L_0x01e9
            com.google.ads.interactivemedia.v3.internal.cy r9 = r4.mo16648a(r8)
            int r10 = r9.f21805e
            r10 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x01bb
            goto L_0x01e6
        L_0x01bb:
            r10 = r7[r8]
            boolean r12 = r5.f20118x
            boolean r12 = m18093b(r10, r12)
            if (r12 == 0) goto L_0x01e6
            com.google.ads.interactivemedia.v3.internal.aav r12 = new com.google.ads.interactivemedia.v3.internal.aav
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            boolean r13 = r6.contains(r13)
            r12.<init>(r9, r5, r10, r13)
            boolean r9 = r12.f20149a
            if (r9 != 0) goto L_0x01db
            boolean r9 = r5.f20104j
            if (r9 != 0) goto L_0x01db
            goto L_0x01e6
        L_0x01db:
            if (r1 == 0) goto L_0x01e3
            int r9 = r12.compareTo(r1)
            if (r9 <= 0) goto L_0x01e6
        L_0x01e3:
            r0 = r4
            r11 = r8
            r1 = r12
        L_0x01e6:
            int r8 = r8 + 1
            goto L_0x01ac
        L_0x01e9:
            int r2 = r2 + 1
            r37 = r5
            goto L_0x0195
        L_0x01ee:
            r5 = r37
            if (r0 != 0) goto L_0x01f4
            r12 = 0
            goto L_0x0203
        L_0x01f4:
            com.google.ads.interactivemedia.v3.internal.aaz r12 = new com.google.ads.interactivemedia.v3.internal.aaz
            r1 = 1
            int[] r2 = new int[r1]
            r1 = 0
            r2[r1] = r11
            r12.<init>(r0, r2)
            goto L_0x0203
        L_0x0200:
            r5 = r37
            r12 = r1
        L_0x0203:
            r33[r34] = r12
            if (r12 == 0) goto L_0x020d
            r0 = r44
            r6 = r34
            r8 = 1
            goto L_0x021f
        L_0x020d:
            r0 = r44
            r6 = r34
            r8 = 0
            goto L_0x021f
        L_0x0213:
            r30 = r3
            r31 = r4
            r33 = r5
            r32 = r9
            r5 = r2
            r0 = r44
            r6 = r7
        L_0x021f:
            com.google.ads.interactivemedia.v3.internal.vj r1 = r0.mo14372c(r6)
            int r1 = r1.f24052b
            if (r1 <= 0) goto L_0x0229
            r13 = 1
            goto L_0x022a
        L_0x0229:
            r13 = 0
        L_0x022a:
            r9 = r32 | r13
            goto L_0x0238
        L_0x022d:
            r0 = r1
            r30 = r3
            r31 = r4
            r33 = r5
            r6 = r7
            r32 = r9
            r5 = r2
        L_0x0238:
            int r7 = r6 + 1
            r1 = r0
            r2 = r5
            r3 = r30
            r4 = r31
            r5 = r33
            r0 = r43
            goto L_0x0019
        L_0x0246:
            r0 = r1
            r30 = r3
            r33 = r5
            r32 = r9
            r5 = r2
            r1 = 0
            r2 = 0
            r3 = -1
            r6 = 0
        L_0x0252:
            if (r2 >= r4) goto L_0x03b3
            int r7 = r0.mo14371b(r2)
            r8 = 1
            if (r7 != r8) goto L_0x039f
            r7 = r32 ^ 1
            com.google.ads.interactivemedia.v3.internal.vj r8 = r0.mo14372c(r2)
            r9 = r45[r2]
            r10 = r46[r2]
            r10 = 0
            r11 = 0
            r12 = -1
            r13 = -1
        L_0x0269:
            int r14 = r8.f24052b
            if (r11 >= r14) goto L_0x02be
            com.google.ads.interactivemedia.v3.internal.vh r14 = r8.mo16656a(r11)
            r15 = r9[r11]
            r17 = r12
            r18 = r13
            r12 = 0
        L_0x0278:
            int r13 = r14.f24048a
            if (r12 >= r13) goto L_0x02b5
            r13 = r15[r12]
            r19 = r6
            boolean r6 = r5.f20118x
            boolean r6 = m18093b(r13, r6)
            if (r6 == 0) goto L_0x02ac
            com.google.ads.interactivemedia.v3.internal.cy r6 = r14.mo16648a(r12)
            com.google.ads.interactivemedia.v3.internal.aan r13 = new com.google.ads.interactivemedia.v3.internal.aan
            r20 = r14
            r14 = r15[r12]
            r13.<init>(r6, r5, r14)
            boolean r6 = r13.f20079a
            if (r6 != 0) goto L_0x029e
            boolean r6 = r5.f20112r
            if (r6 != 0) goto L_0x029e
            goto L_0x02ae
        L_0x029e:
            if (r10 == 0) goto L_0x02a6
            int r6 = r13.compareTo(r10)
            if (r6 <= 0) goto L_0x02ae
        L_0x02a6:
            r17 = r11
            r18 = r12
            r10 = r13
            goto L_0x02ae
        L_0x02ac:
            r20 = r14
        L_0x02ae:
            int r12 = r12 + 1
            r6 = r19
            r14 = r20
            goto L_0x0278
        L_0x02b5:
            r19 = r6
            int r11 = r11 + 1
            r12 = r17
            r13 = r18
            goto L_0x0269
        L_0x02be:
            r19 = r6
            r6 = -1
            if (r12 != r6) goto L_0x02cc
            r17 = r2
            r31 = r4
            r37 = r5
            r0 = 0
            goto L_0x036f
        L_0x02cc:
            com.google.ads.interactivemedia.v3.internal.vh r6 = r8.mo16656a(r12)
            boolean r8 = r5.f20117w
            if (r8 != 0) goto L_0x0354
            boolean r8 = r5.f20116v
            if (r8 != 0) goto L_0x0354
            if (r7 == 0) goto L_0x0354
            r7 = r9[r12]
            int r8 = r5.f20111q
            boolean r9 = r5.f20113s
            boolean r11 = r5.f20114t
            boolean r12 = r5.f20115u
            com.google.ads.interactivemedia.v3.internal.cy r14 = r6.mo16648a(r13)
            int r15 = r6.f24048a
            int[] r15 = new int[r15]
            r31 = r4
            r37 = r5
            r0 = 0
            r5 = 0
        L_0x02f2:
            int r4 = r6.f24048a
            if (r5 >= r4) goto L_0x0344
            if (r5 == r13) goto L_0x0334
            com.google.ads.interactivemedia.v3.internal.cy r4 = r6.mo16648a(r5)
            r17 = r2
            r2 = r7[r5]
            r18 = r7
            r7 = 0
            boolean r2 = m18093b(r2, r7)
            if (r2 == 0) goto L_0x033d
            int r2 = r4.f21808h
            r7 = -1
            if (r2 == r7) goto L_0x0310
            if (r2 > r8) goto L_0x033d
        L_0x0310:
            if (r12 != 0) goto L_0x031a
            int r2 = r4.f21825y
            if (r2 == r7) goto L_0x033d
            int r7 = r14.f21825y
            if (r2 != r7) goto L_0x033d
        L_0x031a:
            if (r9 != 0) goto L_0x0328
            java.lang.String r2 = r4.f21812l
            if (r2 == 0) goto L_0x033d
            java.lang.String r7 = r14.f21812l
            boolean r2 = android.text.TextUtils.equals(r2, r7)
            if (r2 == 0) goto L_0x033d
        L_0x0328:
            if (r11 != 0) goto L_0x0338
            int r2 = r4.f21826z
            r4 = -1
            if (r2 == r4) goto L_0x033d
            int r4 = r14.f21826z
            if (r2 != r4) goto L_0x033d
            goto L_0x0338
        L_0x0334:
            r17 = r2
            r18 = r7
        L_0x0338:
            int r2 = r0 + 1
            r15[r0] = r5
            r0 = r2
        L_0x033d:
            int r5 = r5 + 1
            r2 = r17
            r7 = r18
            goto L_0x02f2
        L_0x0344:
            r17 = r2
            int[] r0 = java.util.Arrays.copyOf(r15, r0)
            int r2 = r0.length
            r4 = 1
            if (r2 <= r4) goto L_0x035b
            com.google.ads.interactivemedia.v3.internal.aaz r2 = new com.google.ads.interactivemedia.v3.internal.aaz
            r2.<init>(r6, r0)
            goto L_0x035c
        L_0x0354:
            r17 = r2
            r31 = r4
            r37 = r5
            r4 = 1
        L_0x035b:
            r2 = 0
        L_0x035c:
            if (r2 != 0) goto L_0x0368
            com.google.ads.interactivemedia.v3.internal.aaz r2 = new com.google.ads.interactivemedia.v3.internal.aaz
            int[] r0 = new int[r4]
            r4 = 0
            r0[r4] = r13
            r2.<init>(r6, r0)
        L_0x0368:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r10)
            android.util.Pair r0 = android.util.Pair.create(r2, r10)
        L_0x036f:
            if (r0 == 0) goto L_0x03a7
            if (r1 == 0) goto L_0x037d
            java.lang.Object r2 = r0.second
            com.google.ads.interactivemedia.v3.internal.aan r2 = (com.google.ads.interactivemedia.p367v3.internal.aan) r2
            int r2 = r2.compareTo(r1)
            if (r2 <= 0) goto L_0x03a7
        L_0x037d:
            r1 = -1
            if (r3 == r1) goto L_0x0383
            r1 = 0
            r33[r3] = r1
        L_0x0383:
            java.lang.Object r1 = r0.first
            com.google.ads.interactivemedia.v3.internal.aaz r1 = (com.google.ads.interactivemedia.p367v3.internal.aaz) r1
            r33[r17] = r1
            com.google.ads.interactivemedia.v3.internal.vh r2 = r1.f20166a
            int[] r1 = r1.f20167b
            r3 = 0
            r1 = r1[r3]
            com.google.ads.interactivemedia.v3.internal.cy r1 = r2.mo16648a(r1)
            java.lang.String r1 = r1.f21803c
            java.lang.Object r0 = r0.second
            com.google.ads.interactivemedia.v3.internal.aan r0 = (com.google.ads.interactivemedia.p367v3.internal.aan) r0
            r6 = r1
            r3 = r17
            r1 = r0
            goto L_0x03a9
        L_0x039f:
            r17 = r2
            r31 = r4
            r37 = r5
            r19 = r6
        L_0x03a7:
            r6 = r19
        L_0x03a9:
            int r2 = r17 + 1
            r0 = r44
            r4 = r31
            r5 = r37
            goto L_0x0252
        L_0x03b3:
            r37 = r5
            r19 = r6
            r3 = r4
            r0 = 0
            r1 = 0
            r2 = -1
        L_0x03bb:
            if (r1 >= r3) goto L_0x04de
            r4 = r44
            int r5 = r4.mo14371b(r1)
            r6 = 1
            if (r5 == r6) goto L_0x04d2
            r6 = 2
            if (r5 == r6) goto L_0x04d2
            r6 = 3
            if (r5 == r6) goto L_0x0437
            com.google.ads.interactivemedia.v3.internal.vj r5 = r4.mo14372c(r1)
            r6 = r45[r1]
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x03d6:
            int r11 = r5.f24052b
            if (r9 >= r11) goto L_0x0420
            com.google.ads.interactivemedia.v3.internal.vh r11 = r5.mo16656a(r9)
            r12 = r6[r9]
            r13 = 0
        L_0x03e1:
            int r14 = r11.f24048a
            if (r13 >= r14) goto L_0x0417
            r14 = r12[r13]
            r46 = r5
            r15 = r37
            boolean r5 = r15.f20118x
            boolean r5 = m18093b(r14, r5)
            if (r5 == 0) goto L_0x040c
            com.google.ads.interactivemedia.v3.internal.cy r5 = r11.mo16648a(r13)
            com.google.ads.interactivemedia.v3.internal.aao r14 = new com.google.ads.interactivemedia.v3.internal.aao
            r17 = r6
            r6 = r12[r13]
            r14.<init>(r5, r6)
            if (r8 == 0) goto L_0x0408
            int r5 = r14.compareTo(r8)
            if (r5 <= 0) goto L_0x040e
        L_0x0408:
            r7 = r11
            r10 = r13
            r8 = r14
            goto L_0x040e
        L_0x040c:
            r17 = r6
        L_0x040e:
            int r13 = r13 + 1
            r5 = r46
            r37 = r15
            r6 = r17
            goto L_0x03e1
        L_0x0417:
            r46 = r5
            r17 = r6
            r15 = r37
            int r9 = r9 + 1
            goto L_0x03d6
        L_0x0420:
            r15 = r37
            if (r7 != 0) goto L_0x0426
            r5 = 0
            goto L_0x0431
        L_0x0426:
            com.google.ads.interactivemedia.v3.internal.aaz r5 = new com.google.ads.interactivemedia.v3.internal.aaz
            r6 = 1
            int[] r8 = new int[r6]
            r6 = 0
            r8[r6] = r10
            r5.<init>(r7, r8)
        L_0x0431:
            r33[r1] = r5
            r11 = r19
            goto L_0x04d6
        L_0x0437:
            r15 = r37
            com.google.ads.interactivemedia.v3.internal.vj r5 = r4.mo14372c(r1)
            r6 = r45[r1]
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = -1
        L_0x0443:
            int r11 = r5.f24052b
            if (r9 >= r11) goto L_0x049a
            com.google.ads.interactivemedia.v3.internal.vh r11 = r5.mo16656a(r9)
            r12 = r6[r9]
            r13 = 0
        L_0x044e:
            int r14 = r11.f24048a
            if (r13 >= r14) goto L_0x0491
            r14 = r12[r13]
            r46 = r5
            boolean r5 = r15.f20118x
            boolean r5 = m18093b(r14, r5)
            if (r5 == 0) goto L_0x0480
            com.google.ads.interactivemedia.v3.internal.cy r5 = r11.mo16648a(r13)
            com.google.ads.interactivemedia.v3.internal.aau r14 = new com.google.ads.interactivemedia.v3.internal.aau
            r17 = r6
            r6 = r12[r13]
            r18 = r11
            r11 = r19
            r14.<init>(r5, r15, r6, r11)
            boolean r5 = r14.f20140a
            if (r5 == 0) goto L_0x0486
            if (r8 == 0) goto L_0x047b
            int r5 = r14.compareTo(r8)
            if (r5 <= 0) goto L_0x0486
        L_0x047b:
            r10 = r13
            r8 = r14
            r7 = r18
            goto L_0x0486
        L_0x0480:
            r17 = r6
            r18 = r11
            r11 = r19
        L_0x0486:
            int r13 = r13 + 1
            r5 = r46
            r19 = r11
            r6 = r17
            r11 = r18
            goto L_0x044e
        L_0x0491:
            r46 = r5
            r17 = r6
            r11 = r19
            int r9 = r9 + 1
            goto L_0x0443
        L_0x049a:
            r11 = r19
            if (r7 != 0) goto L_0x04a0
            r5 = 0
            goto L_0x04b2
        L_0x04a0:
            com.google.ads.interactivemedia.v3.internal.aaz r5 = new com.google.ads.interactivemedia.v3.internal.aaz
            r6 = 1
            int[] r9 = new int[r6]
            r6 = 0
            r9[r6] = r10
            r5.<init>(r7, r9)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r8)
            android.util.Pair r5 = android.util.Pair.create(r5, r8)
        L_0x04b2:
            if (r5 == 0) goto L_0x04d6
            if (r0 == 0) goto L_0x04c0
            java.lang.Object r6 = r5.second
            com.google.ads.interactivemedia.v3.internal.aau r6 = (com.google.ads.interactivemedia.p367v3.internal.aau) r6
            int r6 = r6.compareTo(r0)
            if (r6 <= 0) goto L_0x04d6
        L_0x04c0:
            r0 = -1
            if (r2 == r0) goto L_0x04c6
            r0 = 0
            r33[r2] = r0
        L_0x04c6:
            java.lang.Object r0 = r5.first
            com.google.ads.interactivemedia.v3.internal.aaz r0 = (com.google.ads.interactivemedia.p367v3.internal.aaz) r0
            r33[r1] = r0
            java.lang.Object r0 = r5.second
            com.google.ads.interactivemedia.v3.internal.aau r0 = (com.google.ads.interactivemedia.p367v3.internal.aau) r0
            r2 = r1
            goto L_0x04d6
        L_0x04d2:
            r11 = r19
            r15 = r37
        L_0x04d6:
            int r1 = r1 + 1
            r19 = r11
            r37 = r15
            goto L_0x03bb
        L_0x04de:
            r4 = r44
            r15 = r37
            r0 = r30
            r1 = 0
        L_0x04e5:
            if (r1 >= r0) goto L_0x051e
            boolean r2 = r15.mo14350b(r1)
            if (r2 == 0) goto L_0x04f1
            r2 = 0
            r33[r1] = r2
            goto L_0x051b
        L_0x04f1:
            r2 = 0
            com.google.ads.interactivemedia.v3.internal.vj r5 = r4.mo14372c(r1)
            boolean r6 = r15.mo14351c(r1, r5)
            if (r6 == 0) goto L_0x051b
            com.google.ads.interactivemedia.v3.internal.aat r6 = r15.mo14352d(r1, r5)
            if (r6 != 0) goto L_0x0504
            r7 = r2
            goto L_0x0519
        L_0x0504:
            com.google.ads.interactivemedia.v3.internal.aaz r7 = new com.google.ads.interactivemedia.v3.internal.aaz
            int r8 = r6.f20135a
            com.google.ads.interactivemedia.v3.internal.vh r5 = r5.mo16656a(r8)
            int[] r8 = r6.f20136b
            int r9 = r6.f20138d
            int r6 = r6.f20139e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r5, r8, r9, r6)
        L_0x0519:
            r33[r1] = r7
        L_0x051b:
            int r1 = r1 + 1
            goto L_0x04e5
        L_0x051e:
            r1 = r43
            r2 = 0
            com.google.ads.interactivemedia.v3.internal.aah r5 = r1.f20160f
            com.google.ads.interactivemedia.v3.internal.abq r6 = r43.mo14379g()
            com.google.ads.interactivemedia.v3.internal.aba[] r7 = new com.google.ads.interactivemedia.p367v3.internal.aba[r3]
            r8 = 0
            r9 = 0
        L_0x052b:
            if (r8 >= r3) goto L_0x055e
            r10 = r33[r8]
            if (r10 == 0) goto L_0x0559
            int[] r11 = r10.f20167b
            int r12 = r11.length
            r13 = 1
            if (r12 != r13) goto L_0x0559
            com.google.ads.interactivemedia.v3.internal.aax r12 = new com.google.ads.interactivemedia.v3.internal.aax
            com.google.ads.interactivemedia.v3.internal.vh r13 = r10.f20166a
            r14 = 0
            r11 = r11[r14]
            int r2 = r10.f20168c
            java.lang.Object r14 = r10.f20169d
            r12.<init>(r13, r11, r2, r14)
            r7[r8] = r12
            com.google.ads.interactivemedia.v3.internal.vh r2 = r10.f20166a
            int[] r10 = r10.f20167b
            r11 = 0
            r10 = r10[r11]
            com.google.ads.interactivemedia.v3.internal.cy r2 = r2.mo16648a(r10)
            int r2 = r2.f21808h
            r10 = -1
            if (r2 == r10) goto L_0x055a
            int r9 = r9 + r2
            goto L_0x055a
        L_0x0559:
            r11 = 0
        L_0x055a:
            int r8 = r8 + 1
            r2 = 0
            goto L_0x052b
        L_0x055e:
            r11 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r8 = 0
        L_0x0565:
            if (r8 >= r3) goto L_0x057f
            r10 = r33[r8]
            if (r10 == 0) goto L_0x057c
            int[] r12 = r10.f20167b
            int r13 = r12.length
            r14 = 1
            if (r13 <= r14) goto L_0x057c
            com.google.ads.interactivemedia.v3.internal.vh r10 = r10.f20166a
            com.google.ads.interactivemedia.v3.internal.aai r10 = r5.mo14318a(r10, r6, r12, r9)
            r2.add(r10)
            r7[r8] = r10
        L_0x057c:
            int r8 = r8 + 1
            goto L_0x0565
        L_0x057f:
            int r3 = r2.size()
            r5 = 1
            if (r3 <= r5) goto L_0x05d9
            int r3 = r2.size()
            long[][] r3 = new long[r3][]
            r5 = 0
        L_0x058d:
            int r6 = r2.size()
            if (r5 >= r6) goto L_0x05c0
            java.lang.Object r6 = r2.get(r5)
            com.google.ads.interactivemedia.v3.internal.aai r6 = (com.google.ads.interactivemedia.p367v3.internal.aai) r6
            int r8 = r6.mo14332l()
            long[] r8 = new long[r8]
            r3[r5] = r8
            r8 = 0
        L_0x05a2:
            int r9 = r6.mo14332l()
            if (r8 >= r9) goto L_0x05bd
            r9 = r3[r5]
            int r10 = r6.mo14332l()
            int r10 = r10 - r8
            r12 = -1
            int r10 = r10 + r12
            com.google.ads.interactivemedia.v3.internal.cy r10 = r6.mo14333m(r10)
            int r10 = r10.f21808h
            long r12 = (long) r10
            r9[r8] = r12
            int r8 = r8 + 1
            goto L_0x05a2
        L_0x05bd:
            int r5 = r5 + 1
            goto L_0x058d
        L_0x05c0:
            long[][][] r3 = com.google.ads.interactivemedia.p367v3.internal.aai.m18055j(r3)
            r5 = 0
        L_0x05c5:
            int r6 = r2.size()
            if (r5 >= r6) goto L_0x05d9
            java.lang.Object r6 = r2.get(r5)
            com.google.ads.interactivemedia.v3.internal.aai r6 = (com.google.ads.interactivemedia.p367v3.internal.aai) r6
            r8 = r3[r5]
            r6.mo14323e(r8)
            int r5 = r5 + 1
            goto L_0x05c5
        L_0x05d9:
            com.google.ads.interactivemedia.v3.internal.ef[] r2 = new com.google.ads.interactivemedia.p367v3.internal.C6899ef[r0]
            r3 = 0
        L_0x05dc:
            if (r3 >= r0) goto L_0x05f8
            boolean r5 = r15.mo14350b(r3)
            if (r5 != 0) goto L_0x05f2
            int r5 = r4.mo14371b(r3)
            r6 = 6
            if (r5 == r6) goto L_0x05ef
            r5 = r7[r3]
            if (r5 == 0) goto L_0x05f2
        L_0x05ef:
            com.google.ads.interactivemedia.v3.internal.ef r5 = com.google.ads.interactivemedia.p367v3.internal.C6899ef.f21967a
            goto L_0x05f3
        L_0x05f2:
            r5 = 0
        L_0x05f3:
            r2[r3] = r5
            int r3 = r3 + 1
            goto L_0x05dc
        L_0x05f8:
            int r0 = r15.f20119y
            if (r0 == 0) goto L_0x0666
            r3 = 0
            r5 = -1
            r6 = -1
        L_0x05ff:
            int r8 = r44.mo14370a()
            if (r3 >= r8) goto L_0x0652
            int r15 = r4.mo14371b(r3)
            r8 = r7[r3]
            r9 = 1
            if (r15 == r9) goto L_0x0613
            r9 = 2
            if (r15 != r9) goto L_0x064d
            r15 = 2
            goto L_0x0614
        L_0x0613:
            r9 = 2
        L_0x0614:
            if (r8 == 0) goto L_0x064d
            r10 = r45[r3]
            com.google.ads.interactivemedia.v3.internal.vj r12 = r4.mo14372c(r3)
            com.google.ads.interactivemedia.v3.internal.vh r13 = r8.mo14331k()
            int r12 = r12.mo16657b(r13)
            r13 = 0
        L_0x0625:
            int r14 = r8.mo14332l()
            if (r13 >= r14) goto L_0x063d
            r14 = r10[r12]
            int r16 = r8.mo14334n(r13)
            r14 = r14[r16]
            r9 = 32
            r14 = r14 & r9
            if (r14 == r9) goto L_0x0639
            goto L_0x064d
        L_0x0639:
            int r13 = r13 + 1
            r9 = 2
            goto L_0x0625
        L_0x063d:
            r9 = 1
            if (r15 != r9) goto L_0x0646
            r8 = -1
            if (r6 == r8) goto L_0x0644
            goto L_0x0649
        L_0x0644:
            r6 = r3
            goto L_0x064f
        L_0x0646:
            r8 = -1
            if (r5 == r8) goto L_0x064b
        L_0x0649:
            r3 = 0
            goto L_0x0655
        L_0x064b:
            r5 = r3
            goto L_0x064f
        L_0x064d:
            r8 = -1
            r9 = 1
        L_0x064f:
            int r3 = r3 + 1
            goto L_0x05ff
        L_0x0652:
            r8 = -1
            r9 = 1
            r3 = 1
        L_0x0655:
            if (r6 == r8) goto L_0x065a
            if (r5 == r8) goto L_0x065a
            r11 = 1
        L_0x065a:
            r3 = r3 & r11
            if (r3 == 0) goto L_0x0666
            com.google.ads.interactivemedia.v3.internal.ef r3 = new com.google.ads.interactivemedia.v3.internal.ef
            r3.<init>(r0)
            r2[r6] = r3
            r2[r5] = r3
        L_0x0666:
            android.util.Pair r0 = android.util.Pair.create(r2, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.aaw.mo14369a(com.google.ads.interactivemedia.v3.internal.aay, int[][][], int[]):android.util.Pair");
    }

    public aaw(aaq aaq, aah aah) {
        super((byte[]) null);
        this.f20160f = aah;
        this.f20159e = new AtomicReference(aaq);
    }
}
