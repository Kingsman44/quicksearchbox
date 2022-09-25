package androidx.media3.extractor.p172k;

import android.util.SparseArray;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2609ah;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3627q;

/* renamed from: androidx.media3.extractor.k.ae */
/* compiled from: PG */
public final class C3532ae implements C3326aa {

    /* renamed from: a */
    private final C2609ah f11047a = new C2609ah(0);

    /* renamed from: b */
    private final SparseArray f11048b = new SparseArray();

    /* renamed from: c */
    private final C2604ac f11049c = new C2604ac(4096);

    /* renamed from: d */
    private final C3530ac f11050d = new C3530ac();

    /* renamed from: e */
    private boolean f11051e;

    /* renamed from: f */
    private boolean f11052f;

    /* renamed from: g */
    private boolean f11053g;

    /* renamed from: h */
    private long f11054h;

    /* renamed from: i */
    private C3529ab f11055i;

    /* renamed from: j */
    private C3329ad f11056j;

    /* renamed from: k */
    private boolean f11057k;

    /* JADX WARNING: Removed duplicated region for block: B:97:0x0219  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo7152a(androidx.media3.extractor.C3327ab r19, androidx.media3.extractor.C3350ay r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            androidx.media3.extractor.ad r3 = r0.f11056j
            androidx.media3.common.p136b.C2601a.m6829a(r3)
            r3 = r1
            androidx.media3.extractor.q r3 = (androidx.media3.extractor.C3627q) r3
            long r10 = r3.f11565b
            r12 = 442(0x1ba, float:6.2E-43)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = 1
            r8 = 0
            r16 = -1
            int r6 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x010e
            androidx.media3.extractor.k.ac r6 = r0.f11050d
            boolean r7 = r6.f11035c
            if (r7 != 0) goto L_0x010e
            boolean r7 = r6.f11037e
            r13 = 20000(0x4e20, double:9.8813E-320)
            if (r7 != 0) goto L_0x0073
            long r13 = java.lang.Math.min(r13, r10)
            int r1 = (int) r13
            long r13 = (long) r1
            long r10 = r10 - r13
            long r13 = r3.f11566c
            int r7 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x003c
            r2.f10122a = r10
            goto L_0x010d
        L_0x003c:
            androidx.media3.common.b.ac r2 = r6.f11034b
            r2.mo6156x(r1)
            r3.f11568e = r8
            androidx.media3.common.b.ac r2 = r6.f11034b
            byte[] r2 = r2.f7234a
            r3.mo7320o(r2, r8, r1, r8)
            androidx.media3.common.b.ac r1 = r6.f11034b
            int r2 = r1.f7235b
            int r3 = r1.f7236c
            int r3 = r3 + -4
        L_0x0052:
            if (r3 < r2) goto L_0x006e
            byte[] r7 = r1.f7234a
            int r7 = androidx.media3.extractor.p172k.C3530ac.m10195c(r7, r3)
            if (r7 != r12) goto L_0x006b
            int r7 = r3 + 4
            r1.mo6131A(r7)
            long r9 = androidx.media3.extractor.p172k.C3530ac.m10194a(r1)
            int r7 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x006b
            r4 = r9
            goto L_0x006e
        L_0x006b:
            int r3 = r3 + -1
            goto L_0x0052
        L_0x006e:
            r6.f11039g = r4
            r6.f11037e = r15
            goto L_0x007c
        L_0x0073:
            long r8 = r6.f11039g
            int r7 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x007f
            r6.mo7453b(r1)
        L_0x007c:
            r15 = 0
            goto L_0x010d
        L_0x007f:
            boolean r7 = r6.f11036d
            if (r7 != 0) goto L_0x00cc
            long r7 = java.lang.Math.min(r13, r10)
            int r1 = (int) r7
            long r7 = r3.f11566c
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0094
            r2.f10122a = r9
            goto L_0x010d
        L_0x0094:
            androidx.media3.common.b.ac r2 = r6.f11034b
            r2.mo6156x(r1)
            r8 = 0
            r3.f11568e = r8
            androidx.media3.common.b.ac r2 = r6.f11034b
            byte[] r2 = r2.f7234a
            r3.mo7320o(r2, r8, r1, r8)
            androidx.media3.common.b.ac r1 = r6.f11034b
            int r2 = r1.f7235b
            int r3 = r1.f7236c
        L_0x00a9:
            int r7 = r3 + -3
            if (r2 >= r7) goto L_0x00c7
            byte[] r7 = r1.f7234a
            int r7 = androidx.media3.extractor.p172k.C3530ac.m10195c(r7, r2)
            if (r7 != r12) goto L_0x00c4
            int r7 = r2 + 4
            r1.mo6131A(r7)
            long r9 = androidx.media3.extractor.p172k.C3530ac.m10194a(r1)
            int r7 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x00c4
            r4 = r9
            goto L_0x00c7
        L_0x00c4:
            int r2 = r2 + 1
            goto L_0x00a9
        L_0x00c7:
            r6.f11038f = r4
            r6.f11036d = r15
            goto L_0x007c
        L_0x00cc:
            r8 = 0
            long r2 = r6.f11038f
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x00d7
            r6.mo7453b(r1)
            goto L_0x007c
        L_0x00d7:
            androidx.media3.common.b.ah r7 = r6.f11033a
            long r2 = r7.mo6180b(r2)
            androidx.media3.common.b.ah r7 = r6.f11033a
            long r9 = r6.f11039g
            long r9 = r7.mo6180b(r9)
            long r9 = r9 - r2
            r6.f11040h = r9
            r2 = 0
            int r7 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0108
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid duration: "
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r3 = ". Using TIME_UNSET instead."
            r2.append(r3)
            java.lang.String r3 = "PsDurationReader"
            java.lang.String r2 = r2.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r3, r2)
            r6.f11040h = r4
        L_0x0108:
            r6.mo7453b(r1)
            goto L_0x007c
        L_0x010d:
            return r15
        L_0x010e:
            boolean r6 = r0.f11057k
            if (r6 != 0) goto L_0x0142
            r0.f11057k = r15
            androidx.media3.extractor.k.ac r6 = r0.f11050d
            long r13 = r6.f11040h
            int r7 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0134
            androidx.media3.extractor.k.ab r9 = new androidx.media3.extractor.k.ab
            androidx.media3.common.b.ah r5 = r6.f11033a
            r4 = r9
            r6 = r13
            r13 = r9
            r14 = 0
            r8 = r10
            r4.<init>(r5, r6, r8)
            r0.f11055i = r13
            androidx.media3.extractor.ad r4 = r0.f11056j
            androidx.media3.extractor.g r5 = r13.f11419a
            r4.mo6989q(r5)
            r8 = 0
            goto L_0x0145
        L_0x0134:
            r14 = 0
            androidx.media3.extractor.ad r6 = r0.f11056j
            androidx.media3.extractor.ba r7 = new androidx.media3.extractor.ba
            r8 = 0
            r7.<init>(r4, r8)
            r6.mo6989q(r7)
            goto L_0x0145
        L_0x0142:
            r8 = 0
            r14 = 0
        L_0x0145:
            androidx.media3.extractor.k.ab r4 = r0.f11055i
            if (r4 == 0) goto L_0x0155
            boolean r5 = r4.mo7489c()
            if (r5 != 0) goto L_0x0150
            goto L_0x0155
        L_0x0150:
            int r1 = r4.mo7487a(r1, r2)
            return r1
        L_0x0155:
            r3.f11568e = r14
            int r2 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x0161
            long r4 = r19.mo7312e()
            long r10 = r10 - r4
            goto L_0x0163
        L_0x0161:
            r10 = r16
        L_0x0163:
            r2 = -1
            int r4 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0170
            r4 = 4
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x016f
            goto L_0x0170
        L_0x016f:
            return r2
        L_0x0170:
            androidx.media3.common.b.ac r4 = r0.f11049c
            byte[] r4 = r4.f7234a
            r5 = 4
            boolean r1 = r1.mo7320o(r4, r14, r5, r15)
            if (r1 != 0) goto L_0x017c
            return r2
        L_0x017c:
            androidx.media3.common.b.ac r1 = r0.f11049c
            r1.mo6131A(r14)
            androidx.media3.common.b.ac r1 = r0.f11049c
            int r1 = r1.mo6134b()
            r4 = 441(0x1b9, float:6.18E-43)
            if (r1 != r4) goto L_0x018c
            return r2
        L_0x018c:
            if (r1 != r12) goto L_0x01ac
            androidx.media3.common.b.ac r1 = r0.f11049c
            byte[] r1 = r1.f7234a
            r2 = 10
            r3.mo7320o(r1, r14, r2, r14)
            androidx.media3.common.b.ac r1 = r0.f11049c
            r2 = 9
            r1.mo6131A(r2)
            androidx.media3.common.b.ac r1 = r0.f11049c
            int r1 = r1.mo6139g()
            r1 = r1 & 7
            int r1 = r1 + 14
            r3.mo7639q(r1)
            return r14
        L_0x01ac:
            r2 = 443(0x1bb, float:6.21E-43)
            r4 = 2
            r6 = 6
            if (r1 != r2) goto L_0x01c9
            androidx.media3.common.b.ac r1 = r0.f11049c
            byte[] r1 = r1.f7234a
            r3.mo7320o(r1, r14, r4, r14)
            androidx.media3.common.b.ac r1 = r0.f11049c
            r1.mo6131A(r14)
            androidx.media3.common.b.ac r1 = r0.f11049c
            int r1 = r1.mo6142j()
            int r1 = r1 + r6
            r3.mo7639q(r1)
            return r14
        L_0x01c9:
            int r2 = r1 >> 8
            if (r2 == r15) goto L_0x01d1
            r3.mo7639q(r15)
            return r14
        L_0x01d1:
            r1 = r1 & 255(0xff, float:3.57E-43)
            android.util.SparseArray r2 = r0.f11048b
            java.lang.Object r2 = r2.get(r1)
            androidx.media3.extractor.k.ad r2 = (androidx.media3.extractor.p172k.C3531ad) r2
            boolean r7 = r0.f11051e
            if (r7 != 0) goto L_0x0250
            if (r2 != 0) goto L_0x0233
            r7 = 189(0xbd, float:2.65E-43)
            r10 = 0
            if (r1 != r7) goto L_0x01f3
            androidx.media3.extractor.k.b r7 = new androidx.media3.extractor.k.b
            r7.<init>(r10)
            r0.f11052f = r15
            long r10 = r3.f11566c
            r0.f11054h = r10
        L_0x01f1:
            r10 = r7
            goto L_0x0217
        L_0x01f3:
            r7 = r1 & 224(0xe0, float:3.14E-43)
            r11 = 192(0xc0, float:2.69E-43)
            if (r7 != r11) goto L_0x0205
            androidx.media3.extractor.k.w r7 = new androidx.media3.extractor.k.w
            r7.<init>(r10)
            r0.f11052f = r15
            long r10 = r3.f11566c
            r0.f11054h = r10
            goto L_0x01f1
        L_0x0205:
            r7 = r1 & 240(0xf0, float:3.36E-43)
            r11 = 224(0xe0, float:3.14E-43)
            if (r7 != r11) goto L_0x0217
            androidx.media3.extractor.k.l r7 = new androidx.media3.extractor.k.l
            r7.<init>(r10)
            r0.f11053g = r15
            long r10 = r3.f11566c
            r0.f11054h = r10
            goto L_0x01f1
        L_0x0217:
            if (r10 == 0) goto L_0x0233
            androidx.media3.extractor.k.ar r2 = new androidx.media3.extractor.k.ar
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 256(0x100, float:3.59E-43)
            r2.<init>(r7, r1, r11)
            androidx.media3.extractor.ad r7 = r0.f11056j
            r10.mo7467b(r7, r2)
            androidx.media3.extractor.k.ad r2 = new androidx.media3.extractor.k.ad
            androidx.media3.common.b.ah r7 = r0.f11047a
            r2.<init>(r10, r7)
            android.util.SparseArray r7 = r0.f11048b
            r7.put(r1, r2)
        L_0x0233:
            boolean r1 = r0.f11052f
            r10 = 1048576(0x100000, double:5.180654E-318)
            if (r1 == 0) goto L_0x0243
            boolean r1 = r0.f11053g
            if (r1 == 0) goto L_0x0243
            long r10 = r0.f11054h
            r12 = 8192(0x2000, double:4.0474E-320)
            long r10 = r10 + r12
        L_0x0243:
            long r12 = r3.f11566c
            int r1 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0250
            r0.f11051e = r15
            androidx.media3.extractor.ad r1 = r0.f11056j
            r1.mo6988fa()
        L_0x0250:
            androidx.media3.common.b.ac r1 = r0.f11049c
            byte[] r1 = r1.f7234a
            r3.mo7320o(r1, r14, r4, r14)
            androidx.media3.common.b.ac r1 = r0.f11049c
            r1.mo6131A(r14)
            androidx.media3.common.b.ac r1 = r0.f11049c
            int r1 = r1.mo6142j()
            int r1 = r1 + r6
            if (r2 != 0) goto L_0x026a
            r3.mo7639q(r1)
            goto L_0x0349
        L_0x026a:
            androidx.media3.common.b.ac r4 = r0.f11049c
            r4.mo6156x(r1)
            androidx.media3.common.b.ac r4 = r0.f11049c
            byte[] r4 = r4.f7234a
            r3.mo7321p(r4, r14, r1, r14)
            androidx.media3.common.b.ac r1 = r0.f11049c
            r1.mo6131A(r6)
            androidx.media3.common.b.ac r1 = r0.f11049c
            androidx.media3.common.b.ab r3 = r2.f11043c
            byte[] r3 = r3.f7230a
            r4 = 3
            r1.mo6155w(r3, r14, r4)
            androidx.media3.common.b.ab r3 = r2.f11043c
            r3.mo6124i(r14)
            androidx.media3.common.b.ab r3 = r2.f11043c
            r7 = 8
            r3.mo6126k(r7)
            androidx.media3.common.b.ab r3 = r2.f11043c
            boolean r3 = r3.mo6128m()
            r2.f11044d = r3
            androidx.media3.common.b.ab r3 = r2.f11043c
            boolean r3 = r3.mo6128m()
            r2.f11045e = r3
            androidx.media3.common.b.ab r3 = r2.f11043c
            r3.mo6126k(r6)
            androidx.media3.common.b.ab r3 = r2.f11043c
            int r3 = r3.mo6119d(r7)
            androidx.media3.common.b.ab r6 = r2.f11043c
            byte[] r6 = r6.f7230a
            r1.mo6155w(r6, r14, r3)
            androidx.media3.common.b.ab r3 = r2.f11043c
            r3.mo6124i(r14)
            boolean r3 = r2.f11044d
            if (r3 == 0) goto L_0x0331
            androidx.media3.common.b.ab r3 = r2.f11043c
            r3.mo6126k(r5)
            androidx.media3.common.b.ab r3 = r2.f11043c
            int r3 = r3.mo6119d(r4)
            androidx.media3.common.b.ab r6 = r2.f11043c
            r6.mo6126k(r15)
            androidx.media3.common.b.ab r6 = r2.f11043c
            r7 = 15
            int r6 = r6.mo6119d(r7)
            androidx.media3.common.b.ab r8 = r2.f11043c
            r8.mo6126k(r15)
            long r8 = (long) r3
            r3 = 30
            long r8 = r8 << r3
            int r6 = r6 << r7
            long r10 = (long) r6
            long r8 = r8 | r10
            androidx.media3.common.b.ab r6 = r2.f11043c
            int r6 = r6.mo6119d(r7)
            long r10 = (long) r6
            long r8 = r8 | r10
            androidx.media3.common.b.ab r6 = r2.f11043c
            r6.mo6126k(r15)
            boolean r6 = r2.f11046f
            if (r6 != 0) goto L_0x032a
            boolean r6 = r2.f11045e
            if (r6 == 0) goto L_0x032a
            androidx.media3.common.b.ab r6 = r2.f11043c
            r6.mo6126k(r5)
            androidx.media3.common.b.ab r6 = r2.f11043c
            int r4 = r6.mo6119d(r4)
            androidx.media3.common.b.ab r6 = r2.f11043c
            r6.mo6126k(r15)
            androidx.media3.common.b.ab r6 = r2.f11043c
            int r6 = r6.mo6119d(r7)
            androidx.media3.common.b.ab r10 = r2.f11043c
            r10.mo6126k(r15)
            androidx.media3.common.b.ab r10 = r2.f11043c
            int r10 = r10.mo6119d(r7)
            androidx.media3.common.b.ab r11 = r2.f11043c
            r11.mo6126k(r15)
            androidx.media3.common.b.ah r11 = r2.f11042b
            long r12 = (long) r4
            long r3 = r12 << r3
            int r6 = r6 << r7
            long r6 = (long) r6
            long r3 = r3 | r6
            long r6 = (long) r10
            long r3 = r3 | r6
            r11.mo6180b(r3)
            r2.f11046f = r15
        L_0x032a:
            androidx.media3.common.b.ah r3 = r2.f11042b
            long r3 = r3.mo6180b(r8)
            goto L_0x0332
        L_0x0331:
            r3 = r8
        L_0x0332:
            androidx.media3.extractor.k.j r6 = r2.f11041a
            r6.mo7469d(r3, r5)
            androidx.media3.extractor.k.j r3 = r2.f11041a
            r3.mo7466a(r1)
            androidx.media3.extractor.k.j r1 = r2.f11041a
            r1.mo7468c()
            androidx.media3.common.b.ac r1 = r0.f11049c
            byte[] r2 = r1.f7234a
            int r2 = r2.length
            r1.mo6158z(r2)
        L_0x0349:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p172k.C3532ae.mo7152a(androidx.media3.extractor.ab, androidx.media3.extractor.ay):int");
    }

    /* renamed from: c */
    public final void mo7153c() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0 != r7) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035 A[LOOP:0: B:13:0x002d->B:15:0x0035, LOOP_END] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7154d(long r5, long r7) {
        /*
            r4 = this;
            androidx.media3.common.b.ah r5 = r4.f11047a
            long r0 = r5.mo6183e()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0021
            long r0 = r5.mo6181c()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
        L_0x0021:
            r5.mo6184h(r7)
        L_0x0024:
            androidx.media3.extractor.k.ab r5 = r4.f11055i
            r6 = 0
            if (r5 == 0) goto L_0x002c
            r5.mo7488b(r7)
        L_0x002c:
            r5 = 0
        L_0x002d:
            android.util.SparseArray r7 = r4.f11048b
            int r7 = r7.size()
            if (r5 >= r7) goto L_0x0047
            android.util.SparseArray r7 = r4.f11048b
            java.lang.Object r7 = r7.valueAt(r5)
            androidx.media3.extractor.k.ad r7 = (androidx.media3.extractor.p172k.C3531ad) r7
            r7.f11046f = r6
            androidx.media3.extractor.k.j r7 = r7.f11041a
            r7.mo7470e()
            int r5 = r5 + 1
            goto L_0x002d
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p172k.C3532ae.mo7154d(long, long):void");
    }

    /* renamed from: e */
    public final boolean mo7155e(C3327ab abVar) {
        byte[] bArr = new byte[14];
        C3627q qVar = (C3627q) abVar;
        qVar.mo7320o(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        qVar.mo7319n(bArr[13] & 7, false);
        qVar.mo7320o(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    /* renamed from: s */
    public final void mo7156s(C3329ad adVar) {
        this.f11056j = adVar;
    }
}
