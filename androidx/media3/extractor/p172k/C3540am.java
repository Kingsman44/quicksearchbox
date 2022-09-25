package androidx.media3.extractor.p172k;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.common.p136b.C2603ab;
import androidx.media3.common.p136b.C2609ah;
import androidx.media3.extractor.C3329ad;

/* renamed from: androidx.media3.extractor.k.am */
/* compiled from: PG */
final class C3540am implements C3533af {

    /* renamed from: a */
    final /* synthetic */ C3541an f11079a;

    /* renamed from: b */
    private final C2603ab f11080b = new C2603ab(new byte[5], 5);

    /* renamed from: c */
    private final SparseArray f11081c = new SparseArray();

    /* renamed from: d */
    private final SparseIntArray f11082d = new SparseIntArray();

    /* renamed from: e */
    private final int f11083e;

    public C3540am(C3541an anVar, int i) {
        this.f11079a = anVar;
        this.f11083e = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0129, code lost:
        if (r26.mo6139g() == r15) goto L_0x0105;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7454a(androidx.media3.common.p136b.C2604ac r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            int r2 = r26.mo6139g()
            r3 = 2
            if (r2 == r3) goto L_0x000c
            return
        L_0x000c:
            androidx.media3.extractor.k.an r2 = r0.f11079a
            java.util.List r2 = r2.f11085b
            r4 = 0
            java.lang.Object r2 = r2.get(r4)
            androidx.media3.common.b.ah r2 = (androidx.media3.common.p136b.C2609ah) r2
            int r5 = r26.mo6139g()
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x0288
            int r5 = r1.f7235b
            r6 = 1
            int r5 = r5 + r6
            r1.mo6131A(r5)
            int r5 = r26.mo6142j()
            int r7 = r1.f7235b
            r8 = 3
            int r7 = r7 + r8
            r1.mo6131A(r7)
            androidx.media3.common.b.ab r7 = r0.f11080b
            r1.mo6154v(r7, r3)
            androidx.media3.common.b.ab r7 = r0.f11080b
            r7.mo6126k(r8)
            androidx.media3.extractor.k.an r7 = r0.f11079a
            androidx.media3.common.b.ab r9 = r0.f11080b
            r10 = 13
            int r9 = r9.mo6119d(r10)
            r7.f11094k = r9
            androidx.media3.common.b.ab r7 = r0.f11080b
            r1.mo6154v(r7, r3)
            androidx.media3.common.b.ab r7 = r0.f11080b
            r9 = 4
            r7.mo6126k(r9)
            androidx.media3.common.b.ab r7 = r0.f11080b
            r11 = 12
            int r7 = r7.mo6119d(r11)
            int r12 = r1.f7235b
            int r12 = r12 + r7
            r1.mo6131A(r12)
            androidx.media3.extractor.k.an r7 = r0.f11079a
            int r12 = r7.f11084a
            r13 = 8192(0x2000, float:1.14794E-41)
            r14 = 0
            r15 = 21
            if (r12 != r3) goto L_0x0090
            androidx.media3.extractor.k.as r7 = r7.f11093j
            if (r7 != 0) goto L_0x0090
            androidx.media3.extractor.k.ap r7 = new androidx.media3.extractor.k.ap
            byte[] r12 = androidx.media3.common.p136b.C2612ak.f7254f
            r7.<init>(r15, r14, r14, r12)
            androidx.media3.extractor.k.an r12 = r0.f11079a
            androidx.media3.extractor.k.aq r14 = r12.f11086c
            androidx.media3.extractor.k.as r7 = r14.mo7461a(r15, r7)
            r12.f11093j = r7
            androidx.media3.extractor.k.an r7 = r0.f11079a
            androidx.media3.extractor.k.as r12 = r7.f11093j
            if (r12 == 0) goto L_0x0090
            androidx.media3.extractor.ad r7 = r7.f11090g
            androidx.media3.extractor.k.ar r14 = new androidx.media3.extractor.k.ar
            r14.<init>(r5, r15, r13)
            r12.mo7457b(r2, r7, r14)
        L_0x0090:
            android.util.SparseArray r7 = r0.f11081c
            r7.clear()
            android.util.SparseIntArray r7 = r0.f11082d
            r7.clear()
            int r7 = r1.f7236c
            int r12 = r1.f7235b
            int r7 = r7 - r12
        L_0x009f:
            if (r7 <= 0) goto L_0x01fd
            androidx.media3.common.b.ab r14 = r0.f11080b
            r12 = 5
            r1.mo6154v(r14, r12)
            androidx.media3.common.b.ab r14 = r0.f11080b
            r6 = 8
            int r6 = r14.mo6119d(r6)
            androidx.media3.common.b.ab r14 = r0.f11080b
            r14.mo6126k(r8)
            androidx.media3.common.b.ab r14 = r0.f11080b
            int r14 = r14.mo6119d(r10)
            androidx.media3.common.b.ab r10 = r0.f11080b
            r10.mo6126k(r9)
            androidx.media3.common.b.ab r10 = r0.f11080b
            int r10 = r10.mo6119d(r11)
            int r11 = r1.f7235b
            int r13 = r11 + r10
            r3 = -1
            r17 = 0
            r18 = 0
        L_0x00ce:
            int r4 = r1.f7235b
            if (r4 >= r13) goto L_0x018c
            int r4 = r26.mo6139g()
            int r16 = r26.mo6139g()
            int r9 = r1.f7235b
            int r9 = r9 + r16
            if (r9 <= r13) goto L_0x00e2
            goto L_0x018c
        L_0x00e2:
            r16 = 172(0xac, float:2.41E-43)
            r19 = 135(0x87, float:1.89E-43)
            r20 = 129(0x81, float:1.81E-43)
            if (r4 != r12) goto L_0x0112
            long r21 = r26.mo6146n()
            r23 = 1094921523(0x41432d33, double:5.409631094E-315)
            int r4 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r4 != 0) goto L_0x00f6
            goto L_0x0116
        L_0x00f6:
            r23 = 1161904947(0x45414333, double:5.74057318E-315)
            int r4 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r4 != 0) goto L_0x00fe
            goto L_0x011e
        L_0x00fe:
            r19 = 1094921524(0x41432d34, double:5.4096311E-315)
            int r4 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r4 != 0) goto L_0x0108
        L_0x0105:
            r3 = 172(0xac, float:2.41E-43)
            goto L_0x0118
        L_0x0108:
            r19 = 1212503619(0x48455643, double:5.990563836E-315)
            int r4 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r4 != 0) goto L_0x0118
            r3 = 36
            goto L_0x0118
        L_0x0112:
            r12 = 106(0x6a, float:1.49E-43)
            if (r4 != r12) goto L_0x011a
        L_0x0116:
            r3 = 129(0x81, float:1.81E-43)
        L_0x0118:
            r8 = 4
            goto L_0x017e
        L_0x011a:
            r12 = 122(0x7a, float:1.71E-43)
            if (r4 != r12) goto L_0x0121
        L_0x011e:
            r3 = 135(0x87, float:1.89E-43)
            goto L_0x0118
        L_0x0121:
            r12 = 127(0x7f, float:1.78E-43)
            if (r4 != r12) goto L_0x012c
            int r4 = r26.mo6139g()
            if (r4 != r15) goto L_0x0118
            goto L_0x0105
        L_0x012c:
            r12 = 123(0x7b, float:1.72E-43)
            if (r4 != r12) goto L_0x0133
            r3 = 138(0x8a, float:1.93E-43)
            goto L_0x0118
        L_0x0133:
            r12 = 10
            if (r4 != r12) goto L_0x0142
            java.nio.charset.Charset r4 = com.google.common.base.C58913w.f156754c
            java.lang.String r4 = r1.mo6151s(r8, r4)
            java.lang.String r17 = r4.trim()
            goto L_0x0118
        L_0x0142:
            r12 = 89
            if (r4 != r12) goto L_0x0177
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x014b:
            int r4 = r1.f7235b
            if (r4 >= r9) goto L_0x0171
            java.nio.charset.Charset r4 = com.google.common.base.C58913w.f156754c
            java.lang.String r4 = r1.mo6151s(r8, r4)
            java.lang.String r4 = r4.trim()
            r26.mo6139g()
            r8 = 4
            byte[] r12 = new byte[r8]
            r15 = 0
            r1.mo6155w(r12, r15, r8)
            androidx.media3.extractor.k.ao r15 = new androidx.media3.extractor.k.ao
            r15.<init>(r4, r12)
            r3.add(r15)
            r8 = 3
            r12 = 89
            r15 = 21
            goto L_0x014b
        L_0x0171:
            r8 = 4
            r18 = r3
            r3 = 89
            goto L_0x017e
        L_0x0177:
            r8 = 4
            r12 = 111(0x6f, float:1.56E-43)
            if (r4 != r12) goto L_0x017e
            r3 = 257(0x101, float:3.6E-43)
        L_0x017e:
            int r4 = r1.f7235b
            int r9 = r9 - r4
            int r4 = r4 + r9
            r1.mo6131A(r4)
            r8 = 3
            r9 = 4
            r12 = 5
            r15 = 21
            goto L_0x00ce
        L_0x018c:
            r8 = 4
            r1.mo6131A(r13)
            androidx.media3.extractor.k.ap r4 = new androidx.media3.extractor.k.ap
            byte[] r9 = r1.f7234a
            byte[] r9 = java.util.Arrays.copyOfRange(r9, r11, r13)
            r11 = r17
            r12 = r18
            r4.<init>(r3, r11, r12, r9)
            r3 = 6
            if (r6 == r3) goto L_0x01a5
            r3 = 5
            if (r6 != r3) goto L_0x01a7
        L_0x01a5:
            int r6 = r4.f11104a
        L_0x01a7:
            int r10 = r10 + 5
            int r7 = r7 - r10
            androidx.media3.extractor.k.an r3 = r0.f11079a
            int r9 = r3.f11084a
            r10 = 2
            if (r9 != r10) goto L_0x01b3
            r9 = r6
            goto L_0x01b4
        L_0x01b3:
            r9 = r14
        L_0x01b4:
            android.util.SparseBooleanArray r3 = r3.f11088e
            boolean r3 = r3.get(r9)
            if (r3 == 0) goto L_0x01bf
            r11 = 21
            goto L_0x01ee
        L_0x01bf:
            androidx.media3.extractor.k.an r3 = r0.f11079a
            int r11 = r3.f11084a
            if (r11 != r10) goto L_0x01cc
            r11 = 21
            if (r6 != r11) goto L_0x01ce
            androidx.media3.extractor.k.as r3 = r3.f11093j
            goto L_0x01d4
        L_0x01cc:
            r11 = 21
        L_0x01ce:
            androidx.media3.extractor.k.aq r3 = r3.f11086c
            androidx.media3.extractor.k.as r3 = r3.mo7461a(r6, r4)
        L_0x01d4:
            androidx.media3.extractor.k.an r4 = r0.f11079a
            int r4 = r4.f11084a
            if (r4 != r10) goto L_0x01e4
            android.util.SparseIntArray r4 = r0.f11082d
            r6 = 8192(0x2000, float:1.14794E-41)
            int r4 = r4.get(r9, r6)
            if (r14 >= r4) goto L_0x01ee
        L_0x01e4:
            android.util.SparseIntArray r4 = r0.f11082d
            r4.put(r9, r14)
            android.util.SparseArray r4 = r0.f11081c
            r4.put(r9, r3)
        L_0x01ee:
            r3 = 2
            r4 = 0
            r6 = 1
            r8 = 3
            r9 = 4
            r10 = 13
            r11 = 12
            r13 = 8192(0x2000, float:1.14794E-41)
            r15 = 21
            goto L_0x009f
        L_0x01fd:
            android.util.SparseIntArray r1 = r0.f11082d
            int r1 = r1.size()
            r15 = 0
        L_0x0204:
            if (r15 >= r1) goto L_0x024d
            android.util.SparseIntArray r3 = r0.f11082d
            int r3 = r3.keyAt(r15)
            android.util.SparseIntArray r4 = r0.f11082d
            int r4 = r4.valueAt(r15)
            androidx.media3.extractor.k.an r6 = r0.f11079a
            android.util.SparseBooleanArray r6 = r6.f11088e
            r7 = 1
            r6.put(r3, r7)
            androidx.media3.extractor.k.an r6 = r0.f11079a
            android.util.SparseBooleanArray r6 = r6.f11089f
            r6.put(r4, r7)
            android.util.SparseArray r6 = r0.f11081c
            java.lang.Object r6 = r6.valueAt(r15)
            androidx.media3.extractor.k.as r6 = (androidx.media3.extractor.p172k.C3546as) r6
            if (r6 == 0) goto L_0x0248
            androidx.media3.extractor.k.an r7 = r0.f11079a
            androidx.media3.extractor.k.as r8 = r7.f11093j
            if (r6 == r8) goto L_0x023e
            androidx.media3.extractor.ad r7 = r7.f11090g
            androidx.media3.extractor.k.ar r8 = new androidx.media3.extractor.k.ar
            r9 = 8192(0x2000, float:1.14794E-41)
            r8.<init>(r5, r3, r9)
            r6.mo7457b(r2, r7, r8)
            goto L_0x0240
        L_0x023e:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0240:
            androidx.media3.extractor.k.an r3 = r0.f11079a
            android.util.SparseArray r3 = r3.f11087d
            r3.put(r4, r6)
            goto L_0x024a
        L_0x0248:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x024a:
            int r15 = r15 + 1
            goto L_0x0204
        L_0x024d:
            androidx.media3.extractor.k.an r1 = r0.f11079a
            int r2 = r1.f11084a
            r3 = 2
            if (r2 != r3) goto L_0x0266
            boolean r2 = r1.f11092i
            if (r2 != 0) goto L_0x0288
            androidx.media3.extractor.ad r1 = r1.f11090g
            r1.mo6988fa()
            androidx.media3.extractor.k.an r1 = r0.f11079a
            r2 = 0
            r1.f11091h = r2
            r3 = 1
            r1.f11092i = r3
            return
        L_0x0266:
            r2 = 0
            r3 = 1
            android.util.SparseArray r1 = r1.f11087d
            int r4 = r0.f11083e
            r1.remove(r4)
            androidx.media3.extractor.k.an r1 = r0.f11079a
            int r4 = r1.f11084a
            if (r4 != r3) goto L_0x0277
            r4 = 0
            goto L_0x027b
        L_0x0277:
            int r2 = r1.f11091h
            r4 = -1
            int r4 = r4 + r2
        L_0x027b:
            r1.f11091h = r4
            if (r4 != 0) goto L_0x0288
            androidx.media3.extractor.ad r1 = r1.f11090g
            r1.mo6988fa()
            androidx.media3.extractor.k.an r1 = r0.f11079a
            r1.f11092i = r3
        L_0x0288:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p172k.C3540am.mo7454a(androidx.media3.common.b.ac):void");
    }

    /* renamed from: b */
    public final void mo7455b(C2609ah ahVar, C3329ad adVar, C3545ar arVar) {
    }
}
