package androidx.media3.extractor.p172k;

import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.extractor.k.h */
/* compiled from: PG */
public final class C3555h implements C3557j {

    /* renamed from: a */
    private final C2604ac f11178a = new C2604ac(new byte[18]);

    /* renamed from: b */
    private final String f11179b;

    /* renamed from: c */
    private String f11180c;

    /* renamed from: d */
    private C3368bf f11181d;

    /* renamed from: e */
    private int f11182e = 0;

    /* renamed from: f */
    private int f11183f;

    /* renamed from: g */
    private int f11184g;

    /* renamed from: h */
    private long f11185h;

    /* renamed from: i */
    private C2680x f11186i;

    /* renamed from: j */
    private int f11187j;

    /* renamed from: k */
    private long f11188k = -9223372036854775807L;

    public C3555h(String str) {
        this.f11179b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0009 A[EDGE_INSN: B:88:0x0009->B:82:0x0009 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7466a(androidx.media3.common.p136b.C2604ac r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            androidx.media3.extractor.bf r2 = r0.f11181d
            androidx.media3.common.p136b.C2601a.m6829a(r2)
        L_0x0009:
            int r2 = r1.f7236c
            int r3 = r1.f7235b
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x02d1
            int r3 = r0.f11182e
            r5 = 8
            r6 = 2
            r7 = 0
            r9 = 1
            if (r3 == 0) goto L_0x0279
            if (r3 == r9) goto L_0x004f
            int r3 = r0.f11187j
            int r4 = r0.f11183f
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            androidx.media3.extractor.bf r3 = r0.f11181d
            r3.mo6851c(r1, r2)
            int r3 = r0.f11183f
            int r3 = r3 + r2
            r0.f11183f = r3
            int r12 = r0.f11187j
            if (r3 != r12) goto L_0x0009
            long r9 = r0.f11188k
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x004c
            androidx.media3.extractor.bf r8 = r0.f11181d
            r11 = 1
            r13 = 0
            r14 = 0
            r8.mo6852d(r9, r11, r12, r13, r14)
            long r2 = r0.f11188k
            long r4 = r0.f11185h
            long r2 = r2 + r4
            r0.f11188k = r2
        L_0x004c:
            r0.f11182e = r7
            goto L_0x0009
        L_0x004f:
            androidx.media3.common.b.ac r3 = r0.f11178a
            byte[] r3 = r3.f7234a
            int r10 = r0.f11183f
            r11 = 18
            int r10 = 18 - r10
            int r2 = java.lang.Math.min(r2, r10)
            int r10 = r0.f11183f
            r1.mo6155w(r3, r10, r2)
            int r3 = r0.f11183f
            int r3 = r3 + r2
            r0.f11183f = r3
            if (r3 != r11) goto L_0x0009
            androidx.media3.common.b.ac r2 = r0.f11178a
            byte[] r2 = r2.f7234a
            androidx.media3.common.x r3 = r0.f11186i
            r10 = 31
            r12 = -2
            r13 = 14
            r4 = -1
            if (r3 != 0) goto L_0x019a
            java.lang.String r3 = r0.f11180c
            java.lang.String r14 = r0.f11179b
            int[] r16 = androidx.media3.extractor.C3634x.f11580a
            byte r8 = r2[r7]
            r11 = 127(0x7f, float:1.78E-43)
            if (r8 != r11) goto L_0x008d
            androidx.media3.common.b.ab r8 = new androidx.media3.common.b.ab
            int r11 = r2.length
            r8.<init>(r2, r11)
        L_0x0089:
            r5 = 60
            goto L_0x0140
        L_0x008d:
            int r8 = r2.length
            byte[] r8 = java.util.Arrays.copyOf(r2, r8)
            byte r11 = r8[r7]
            if (r11 == r12) goto L_0x0098
            if (r11 != r4) goto L_0x00aa
        L_0x0098:
            r11 = 0
        L_0x0099:
            int r12 = r8.length
            int r12 = r12 + r4
            if (r11 >= r12) goto L_0x00aa
            byte r12 = r8[r11]
            int r17 = r11 + 1
            byte r18 = r8[r17]
            r8[r11] = r18
            r8[r17] = r12
            int r11 = r11 + 2
            goto L_0x0099
        L_0x00aa:
            androidx.media3.common.b.ab r11 = new androidx.media3.common.b.ab
            int r12 = r8.length
            r11.<init>(r8, r12)
            byte r15 = r8[r7]
            if (r15 != r10) goto L_0x0139
            androidx.media3.common.b.ab r15 = new androidx.media3.common.b.ab
            r15.<init>(r8, r12)
        L_0x00b9:
            int r12 = r15.mo6116a()
            r10 = 16
            if (r12 < r10) goto L_0x0139
            r15.mo6126k(r6)
            int r10 = r15.mo6119d(r13)
            r10 = r10 & 16383(0x3fff, float:2.2957E-41)
            int r12 = r11.f7232c
            int r12 = 8 - r12
            int r12 = java.lang.Math.min(r12, r13)
            int r7 = r11.f7232c
            int r19 = 8 - r7
            int r19 = r19 - r12
            byte[] r6 = r11.f7230a
            int r5 = r11.f7231b
            byte r20 = r6[r5]
            r21 = 65280(0xff00, float:9.1477E-41)
            int r7 = r21 >> r7
            int r21 = r9 << r19
            int r21 = r21 + -1
            r7 = r7 | r21
            r7 = r20 & r7
            byte r7 = (byte) r7
            r6[r5] = r7
            int r12 = 14 - r12
            int r20 = r10 >>> r12
            int r19 = r20 << r19
            r7 = r7 | r19
            byte r7 = (byte) r7
            r6[r5] = r7
            int r5 = r5 + r9
            r6 = 8
        L_0x00fc:
            if (r12 <= r6) goto L_0x010f
            int r6 = r5 + 1
            int r12 = r12 + -8
            byte[] r7 = r11.f7230a
            int r13 = r10 >>> r12
            byte r13 = (byte) r13
            r7[r5] = r13
            r5 = r6
            r6 = 8
            r13 = 14
            goto L_0x00fc
        L_0x010f:
            int r6 = 8 - r12
            byte[] r7 = r11.f7230a
            byte r13 = r7[r5]
            int r20 = r9 << r6
            int r20 = r20 + -1
            r13 = r13 & r20
            byte r13 = (byte) r13
            r7[r5] = r13
            int r12 = r9 << r12
            int r12 = r12 + r4
            r10 = r10 & r12
            int r6 = r10 << r6
            r6 = r6 | r13
            byte r6 = (byte) r6
            r7[r5] = r6
            r5 = 14
            r11.mo6126k(r5)
            r11.mo6121f()
            r5 = 8
            r6 = 2
            r7 = 0
            r10 = 31
            r13 = 14
            goto L_0x00b9
        L_0x0139:
            int r5 = r8.length
            r11.mo6123h(r8, r5)
            r8 = r11
            goto L_0x0089
        L_0x0140:
            r8.mo6126k(r5)
            r5 = 6
            int r6 = r8.mo6119d(r5)
            int[] r5 = androidx.media3.extractor.C3634x.f11580a
            r5 = r5[r6]
            r6 = 4
            int r7 = r8.mo6119d(r6)
            int[] r6 = androidx.media3.extractor.C3634x.f11581b
            r6 = r6[r7]
            r7 = 5
            int r10 = r8.mo6119d(r7)
            r7 = 29
            if (r10 < r7) goto L_0x0161
            r7 = -1
            r10 = 2
            goto L_0x0169
        L_0x0161:
            int[] r7 = androidx.media3.extractor.C3634x.f11582c
            r7 = r7[r10]
            int r7 = r7 * 1000
            r10 = 2
            int r7 = r7 / r10
        L_0x0169:
            r11 = 10
            r8.mo6126k(r11)
            int r8 = r8.mo6119d(r10)
            if (r8 <= 0) goto L_0x0176
            r8 = 1
            goto L_0x0177
        L_0x0176:
            r8 = 0
        L_0x0177:
            androidx.media3.common.w r10 = new androidx.media3.common.w
            r10.<init>()
            r10.f7449a = r3
            java.lang.String r3 = "audio/vnd.dts"
            r10.f7459k = r3
            r10.f7454f = r7
            int r5 = r5 + r8
            r10.f7472x = r5
            r10.f7473y = r6
            r3 = 0
            r10.f7462n = r3
            r10.f7451c = r14
            androidx.media3.common.x r3 = new androidx.media3.common.x
            r3.<init>(r10)
            r0.f11186i = r3
            androidx.media3.extractor.bf r5 = r0.f11181d
            r5.mo6850b(r3)
        L_0x019a:
            int[] r3 = androidx.media3.extractor.C3634x.f11580a
            r3 = 0
            byte r5 = r2[r3]
            r3 = 7
            r6 = -2
            if (r5 == r6) goto L_0x01f2
            if (r5 == r4) goto L_0x01d7
            r6 = 31
            if (r5 == r6) goto L_0x01bf
            r6 = 5
            byte r7 = r2[r6]
            r6 = 3
            r6 = r6 & r7
            int r6 = r6 << 12
            r7 = 6
            byte r8 = r2[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r10 = 4
            int r8 = r8 << r10
            r6 = r6 | r8
            byte r8 = r2[r3]
            r8 = r8 & 240(0xf0, float:3.36E-43)
            int r8 = r8 >> r10
            r6 = r6 | r8
            goto L_0x0206
        L_0x01bf:
            r7 = 6
            r10 = 4
            byte r6 = r2[r7]
            r7 = 3
            r6 = r6 & r7
            int r6 = r6 << 12
            byte r7 = r2[r3]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << r10
            r6 = r6 | r7
            r7 = 8
            byte r7 = r2[r7]
            r8 = 60
            r7 = r7 & r8
            r8 = 2
            int r7 = r7 >> r8
            goto L_0x01ee
        L_0x01d7:
            byte r6 = r2[r3]
            r7 = 3
            r6 = r6 & r7
            int r6 = r6 << 12
            r7 = 6
            byte r8 = r2[r7]
            r7 = r8 & 255(0xff, float:3.57E-43)
            r8 = 4
            int r7 = r7 << r8
            r6 = r6 | r7
            r7 = 9
            byte r7 = r2[r7]
            r10 = 60
            r7 = r7 & r10
            r10 = 2
            int r7 = r7 >> r10
        L_0x01ee:
            r6 = r6 | r7
            int r6 = r6 + r9
            r7 = 1
            goto L_0x0208
        L_0x01f2:
            r8 = 4
            byte r6 = r2[r8]
            r7 = 3
            r6 = r6 & r7
            int r6 = r6 << 12
            byte r7 = r2[r3]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << r8
            r6 = r6 | r7
            r7 = 6
            byte r10 = r2[r7]
            r7 = r10 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r8
            r6 = r6 | r7
        L_0x0206:
            int r6 = r6 + r9
            r7 = 0
        L_0x0208:
            if (r7 == 0) goto L_0x020f
            int r6 = r6 * 16
            r7 = 14
            int r6 = r6 / r7
        L_0x020f:
            r0.f11187j = r6
            r6 = -2
            if (r5 == r6) goto L_0x0244
            if (r5 == r4) goto L_0x0235
            r4 = 31
            if (r5 == r4) goto L_0x0227
            r4 = 4
            byte r3 = r2[r4]
            r3 = r3 & r9
            r5 = 6
            int r3 = r3 << r5
            r6 = 5
            byte r2 = r2[r6]
            r2 = r2 & 252(0xfc, float:3.53E-43)
            r7 = 2
            goto L_0x0250
        L_0x0227:
            r4 = 4
            r5 = 6
            r6 = 5
            r7 = 2
            byte r6 = r2[r6]
            r3 = r3 & r6
            int r3 = r3 << r4
            byte r2 = r2[r5]
            r5 = 60
            r2 = r2 & r5
            goto L_0x0250
        L_0x0235:
            r4 = 4
            r5 = 60
            r7 = 2
            byte r6 = r2[r4]
            r6 = r6 & r3
            int r4 = r6 << 4
            byte r2 = r2[r3]
            r2 = r2 & r5
            int r2 = r2 >> r7
            r2 = r2 | r4
            goto L_0x0252
        L_0x0244:
            r3 = 5
            r4 = 4
            r7 = 2
            byte r3 = r2[r3]
            r3 = r3 & r9
            r5 = 6
            int r3 = r3 << r5
            byte r2 = r2[r4]
            r2 = r2 & 252(0xfc, float:3.53E-43)
        L_0x0250:
            int r2 = r2 >> r7
            r2 = r2 | r3
        L_0x0252:
            int r2 = r2 + r9
            int r2 = r2 * 32
            long r2 = (long) r2
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r4
            androidx.media3.common.x r4 = r0.f11186i
            int r4 = r4.f7478B
            long r4 = (long) r4
            long r2 = r2 / r4
            int r3 = (int) r2
            long r2 = (long) r3
            r0.f11185h = r2
            androidx.media3.common.b.ac r2 = r0.f11178a
            r3 = 0
            r2.mo6131A(r3)
            androidx.media3.extractor.bf r2 = r0.f11181d
            androidx.media3.common.b.ac r3 = r0.f11178a
            r4 = 18
            r2.mo6851c(r3, r4)
            r2 = 2
            r0.f11182e = r2
            goto L_0x0009
        L_0x0279:
            int r2 = r1.f7236c
            int r3 = r1.f7235b
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x0009
            int r2 = r0.f11184g
            r3 = 8
            int r2 = r2 << r3
            r0.f11184g = r2
            int r4 = r23.mo6139g()
            r2 = r2 | r4
            r0.f11184g = r2
            int[] r4 = androidx.media3.extractor.C3634x.f11580a
            r4 = 2147385345(0x7ffe8001, float:NaN)
            if (r2 == r4) goto L_0x02a4
            r4 = -25230976(0xfffffffffe7f0180, float:-8.474023E37)
            if (r2 == r4) goto L_0x02a4
            r4 = 536864768(0x1fffe800, float:1.0838051E-19)
            if (r2 == r4) goto L_0x02a4
            r4 = -14745368(0xffffffffff1f00e8, float:-2.1135196E38)
            if (r2 != r4) goto L_0x0279
        L_0x02a4:
            androidx.media3.common.b.ac r2 = r0.f11178a
            byte[] r2 = r2.f7234a
            int r3 = r0.f11184g
            int r4 = r3 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r5 = 0
            r2[r5] = r4
            int r4 = r3 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2[r9] = r4
            int r4 = r3 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r5 = 2
            r2[r5] = r4
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r4 = 3
            r2[r4] = r3
            r2 = 4
            r0.f11183f = r2
            r2 = 0
            r0.f11184g = r2
            r0.f11182e = r9
            goto L_0x0009
        L_0x02d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p172k.C3555h.mo7466a(androidx.media3.common.b.ac):void");
    }

    /* renamed from: b */
    public final void mo7467b(C3329ad adVar, C3545ar arVar) {
        arVar.mo7462a();
        arVar.mo7463b();
        this.f11180c = arVar.f11109b;
        arVar.mo7463b();
        this.f11181d = adVar.mo6987eZ(arVar.f11108a, 1);
    }

    /* renamed from: c */
    public final void mo7468c() {
    }

    /* renamed from: d */
    public final void mo7469d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f11188k = j;
        }
    }

    /* renamed from: e */
    public final void mo7470e() {
        this.f11182e = 0;
        this.f11183f = 0;
        this.f11184g = 0;
        this.f11188k = -9223372036854775807L;
    }
}
