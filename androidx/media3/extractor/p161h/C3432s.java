package androidx.media3.extractor.p161h;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3347av;
import androidx.media3.extractor.C3351az;
import androidx.media3.extractor.C3364bb;
import androidx.media3.extractor.C3365bc;
import androidx.media3.extractor.C3369bg;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media3.extractor.h.s */
/* compiled from: PG */
public final class C3432s implements C3326aa, C3364bb {

    /* renamed from: a */
    public C3329ad f10552a;

    /* renamed from: b */
    private final C2604ac f10553b;

    /* renamed from: c */
    private final C2604ac f10554c;

    /* renamed from: d */
    private final C2604ac f10555d;

    /* renamed from: e */
    private final C2604ac f10556e;

    /* renamed from: f */
    private final ArrayDeque f10557f;

    /* renamed from: g */
    private final List f10558g;

    /* renamed from: h */
    private int f10559h;

    /* renamed from: i */
    private int f10560i;

    /* renamed from: j */
    private long f10561j;

    /* renamed from: k */
    private int f10562k;

    /* renamed from: l */
    private C2604ac f10563l;

    /* renamed from: m */
    private int f10564m;

    /* renamed from: n */
    private int f10565n;

    /* renamed from: o */
    private int f10566o;

    /* renamed from: p */
    private int f10567p;

    /* renamed from: q */
    private C3431r[] f10568q;

    /* renamed from: r */
    private long[][] f10569r;

    /* renamed from: s */
    private int f10570s;

    /* renamed from: t */
    private long f10571t;

    /* renamed from: u */
    private int f10572u;

    public C3432s() {
        this((byte[]) null);
    }

    /* renamed from: f */
    private static int m9942f(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: g */
    private static int m9943g(C3414aa aaVar, long j) {
        int a = aaVar.mo7384a(j);
        return a == -1 ? aaVar.mo7385b(j) : a;
    }

    /* renamed from: h */
    private static long m9944h(C3414aa aaVar, long j, long j2) {
        int g = m9943g(aaVar, j);
        if (g == -1) {
            return j2;
        }
        return Math.min(aaVar.f10456c[g], j2);
    }

    /* renamed from: i */
    private final void m9945i() {
        this.f10559h = 0;
        this.f10562k = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x017c A[LOOP:3: B:70:0x0179->B:72:0x017c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a4  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m9946j(long r28) {
        /*
            r27 = this;
            r0 = r27
        L_0x0002:
            java.util.ArrayDeque r1 = r0.f10557f
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x025d
            java.util.ArrayDeque r1 = r0.f10557f
            java.lang.Object r1 = r1.peek()
            androidx.media3.extractor.h.a r1 = (androidx.media3.extractor.p161h.C3413a) r1
            long r3 = r1.f10451a
            int r1 = (r3 > r28 ? 1 : (r3 == r28 ? 0 : -1))
            if (r1 != 0) goto L_0x025d
            java.util.ArrayDeque r1 = r0.f10557f
            java.lang.Object r1 = r1.pop()
            r3 = r1
            androidx.media3.extractor.h.a r3 = (androidx.media3.extractor.p161h.C3413a) r3
            int r1 = r3.f10463d
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r1 != r4) goto L_0x0246
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r0.f10572u
            r11 = 1
            if (r4 != r11) goto L_0x0034
            r8 = 1
            goto L_0x0035
        L_0x0034:
            r8 = 0
        L_0x0035:
            androidx.media3.extractor.an r12 = new androidx.media3.extractor.an
            r12.<init>()
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            androidx.media3.extractor.h.b r4 = r3.mo7380b(r4)
            if (r4 == 0) goto L_0x0057
            android.util.Pair r4 = androidx.media3.extractor.p161h.C3423j.m9905a(r4)
            java.lang.Object r5 = r4.first
            androidx.media3.common.Metadata r5 = (androidx.media3.common.Metadata) r5
            java.lang.Object r4 = r4.second
            androidx.media3.common.Metadata r4 = (androidx.media3.common.Metadata) r4
            if (r5 == 0) goto L_0x0054
            r12.mo7333b(r5)
        L_0x0054:
            r14 = r4
            r15 = r5
            goto L_0x0059
        L_0x0057:
            r14 = 0
            r15 = 0
        L_0x0059:
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            androidx.media3.extractor.h.a r4 = r3.mo7379a(r4)
            if (r4 == 0) goto L_0x0068
            androidx.media3.common.Metadata r4 = androidx.media3.extractor.p161h.C3423j.m9906b(r4)
            r9 = r4
            goto L_0x0069
        L_0x0068:
            r9 = 0
        L_0x0069:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            androidx.media3.extractor.h.q r16 = androidx.media3.extractor.p161h.C3430q.f10546a
            r4 = r12
            r13 = r9
            r9 = r16
            java.util.List r3 = androidx.media3.extractor.p161h.C3423j.m9908d(r3, r4, r5, r7, r8, r9)
            int r4 = r3.size()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = r6
            r8 = 0
            r9 = -1
        L_0x0085:
            r17 = 0
            if (r8 >= r4) goto L_0x01b9
            java.lang.Object r19 = r3.get(r8)
            r5 = r19
            androidx.media3.extractor.h.aa r5 = (androidx.media3.extractor.p161h.C3414aa) r5
            int r2 = r5.f10455b
            if (r2 != 0) goto L_0x009f
            r20 = r3
            r21 = r4
            r3 = r6
            r25 = r12
            r0 = -1
            goto L_0x01ac
        L_0x009f:
            androidx.media3.extractor.h.x r2 = r5.f10454a
            r20 = r3
            r21 = r4
            long r3 = r2.f10580e
            int r22 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r22 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            long r3 = r5.f10461h
        L_0x00ae:
            long r10 = java.lang.Math.max(r10, r3)
            androidx.media3.extractor.h.r r6 = new androidx.media3.extractor.h.r
            androidx.media3.extractor.ad r7 = r0.f10552a
            r23 = r10
            int r10 = r2.f10577b
            androidx.media3.extractor.bf r7 = r7.mo6987eZ(r8, r10)
            r6.<init>(r2, r5, r7)
            androidx.media3.common.x r7 = r2.f10581f
            java.lang.String r7 = r7.f7496n
            java.lang.String r10 = "audio/true-hd"
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x00d2
            int r7 = r5.f10458e
            int r7 = r7 * 16
            goto L_0x00d6
        L_0x00d2:
            int r7 = r5.f10458e
            int r7 = r7 + 30
        L_0x00d6:
            androidx.media3.common.x r10 = r2.f10581f
            androidx.media3.common.w r11 = new androidx.media3.common.w
            r11.<init>(r10)
            r11.f7460l = r7
            int r7 = r2.f10577b
            r10 = 2
            if (r7 != r10) goto L_0x00f7
            int r7 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r7 <= 0) goto L_0x00f6
            int r5 = r5.f10455b
            r7 = 1
            if (r5 <= r7) goto L_0x00f6
            float r5 = (float) r5
            float r3 = (float) r3
            r4 = 1232348160(0x49742400, float:1000000.0)
            float r3 = r3 / r4
            float r5 = r5 / r3
            r11.f7466r = r5
        L_0x00f6:
            r7 = 2
        L_0x00f7:
            int r3 = androidx.media3.extractor.p161h.C3429p.f10545b
            r3 = 1
            if (r7 != r3) goto L_0x010a
            boolean r3 = r12.mo7332a()
            if (r3 == 0) goto L_0x010a
            int r3 = r12.f10073a
            r11.f7445A = r3
            int r3 = r12.f10074b
            r11.f7446B = r3
        L_0x010a:
            int r3 = r2.f10577b
            r4 = 2
            androidx.media3.common.Metadata[] r5 = new androidx.media3.common.Metadata[r4]
            r4 = 0
            r5[r4] = r14
            java.util.List r7 = r0.f10558g
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x011c
            r7 = 0
            goto L_0x0123
        L_0x011c:
            androidx.media3.common.Metadata r7 = new androidx.media3.common.Metadata
            java.util.List r10 = r0.f10558g
            r7.<init>((java.util.List) r10)
        L_0x0123:
            r10 = 1
            r5[r10] = r7
            androidx.media3.common.Metadata r7 = new androidx.media3.common.Metadata
            r25 = r12
            androidx.media3.common.Metadata$Entry[] r12 = new androidx.media3.common.Metadata.Entry[r4]
            r26 = r1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.<init>(r0, r12)
            if (r3 != r10) goto L_0x0141
            if (r15 == 0) goto L_0x013b
            r7 = r15
        L_0x013b:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0178
        L_0x0141:
            r0 = 2
            if (r3 != r0) goto L_0x013b
            if (r13 == 0) goto L_0x013b
            r0 = 0
        L_0x0147:
            androidx.media3.common.Metadata$Entry[] r1 = r13.f7056a
            int r3 = r1.length
            if (r0 >= r3) goto L_0x013b
            r1 = r1[r0]
            boolean r3 = r1 instanceof androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry
            if (r3 == 0) goto L_0x0170
            androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry r1 = (androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry) r1
            java.lang.String r3 = "com.android.capture.fps"
            java.lang.String r4 = r1.f11502a
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0170
            androidx.media3.common.Metadata r7 = new androidx.media3.common.Metadata
            r0 = 1
            androidx.media3.common.Metadata$Entry[] r3 = new androidx.media3.common.Metadata.Entry[r0]
            r0 = 0
            r3[r0] = r1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.<init>(r0, r3)
            r3 = r0
            goto L_0x0178
        L_0x0170:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = r0 + 1
            goto L_0x0147
        L_0x0178:
            r0 = 0
        L_0x0179:
            r1 = 2
            if (r0 >= r1) goto L_0x0185
            r1 = r5[r0]
            androidx.media3.common.Metadata r7 = r7.mo6060b(r1)
            int r0 = r0 + 1
            goto L_0x0179
        L_0x0185:
            androidx.media3.common.Metadata$Entry[] r0 = r7.f7056a
            int r0 = r0.length
            if (r0 <= 0) goto L_0x018c
            r11.f7457i = r7
        L_0x018c:
            androidx.media3.extractor.bf r0 = r6.f10549c
            androidx.media3.common.x r1 = new androidx.media3.common.x
            r1.<init>(r11)
            r0.mo6850b(r1)
            int r0 = r2.f10577b
            r1 = 2
            if (r0 != r1) goto L_0x01a4
            r0 = -1
            if (r9 != r0) goto L_0x01a5
            int r1 = r26.size()
            r9 = r1
            goto L_0x01a5
        L_0x01a4:
            r0 = -1
        L_0x01a5:
            r1 = r26
            r1.add(r6)
            r10 = r23
        L_0x01ac:
            int r8 = r8 + 1
            r0 = r27
            r6 = r3
            r3 = r20
            r4 = r21
            r12 = r25
            goto L_0x0085
        L_0x01b9:
            r2 = r0
            r0 = -1
            r2.f10570s = r9
            r2.f10571t = r10
            r3 = 0
            androidx.media3.extractor.h.r[] r4 = new androidx.media3.extractor.p161h.C3431r[r3]
            java.lang.Object[] r1 = r1.toArray(r4)
            androidx.media3.extractor.h.r[] r1 = (androidx.media3.extractor.p161h.C3431r[]) r1
            r2.f10568q = r1
            int r3 = r1.length
            long[][] r4 = new long[r3][]
            int[] r5 = new int[r3]
            long[] r6 = new long[r3]
            boolean[] r3 = new boolean[r3]
            r7 = 0
        L_0x01d4:
            int r8 = r1.length
            if (r7 >= r8) goto L_0x01ef
            r8 = r1[r7]
            androidx.media3.extractor.h.aa r8 = r8.f10548b
            int r8 = r8.f10455b
            long[] r8 = new long[r8]
            r4[r7] = r8
            r8 = r1[r7]
            androidx.media3.extractor.h.aa r8 = r8.f10548b
            long[] r8 = r8.f10459f
            r9 = 0
            r10 = r8[r9]
            r6[r7] = r10
            int r7 = r7 + 1
            goto L_0x01d4
        L_0x01ef:
            r9 = 0
            r7 = 0
        L_0x01f1:
            int r8 = r1.length
            if (r7 >= r8) goto L_0x0231
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = 0
            r12 = -1
        L_0x01fb:
            int r13 = r1.length
            if (r8 >= r13) goto L_0x020d
            boolean r13 = r3[r8]
            if (r13 != 0) goto L_0x020a
            r13 = r6[r8]
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 > 0) goto L_0x020a
            r12 = r8
            r10 = r13
        L_0x020a:
            int r8 = r8 + 1
            goto L_0x01fb
        L_0x020d:
            r8 = r5[r12]
            r10 = r4[r12]
            r10[r8] = r17
            r11 = r1[r12]
            androidx.media3.extractor.h.aa r11 = r11.f10548b
            int[] r13 = r11.f10457d
            r13 = r13[r8]
            long r13 = (long) r13
            long r17 = r17 + r13
            r13 = 1
            int r8 = r8 + r13
            r5[r12] = r8
            int r10 = r10.length
            if (r8 >= r10) goto L_0x022c
            long[] r10 = r11.f10459f
            r14 = r10[r8]
            r6[r12] = r14
            goto L_0x01f1
        L_0x022c:
            r3[r12] = r13
            int r7 = r7 + 1
            goto L_0x01f1
        L_0x0231:
            r2.f10569r = r4
            androidx.media3.extractor.ad r0 = r2.f10552a
            r0.mo6988fa()
            androidx.media3.extractor.ad r0 = r2.f10552a
            r0.mo6989q(r2)
            java.util.ArrayDeque r0 = r2.f10557f
            r0.clear()
            r0 = 2
            r2.f10559h = r0
            goto L_0x025a
        L_0x0246:
            r2 = r0
            java.util.ArrayDeque r0 = r2.f10557f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x025a
            java.util.ArrayDeque r0 = r2.f10557f
            java.lang.Object r0 = r0.peek()
            androidx.media3.extractor.h.a r0 = (androidx.media3.extractor.p161h.C3413a) r0
            r0.mo7381c(r3)
        L_0x025a:
            r0 = r2
            goto L_0x0002
        L_0x025d:
            r2 = r0
            int r0 = r2.f10559h
            r1 = 2
            if (r0 == r1) goto L_0x0266
            r27.m9945i()
        L_0x0266:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p161h.C3432s.m9946j(long):void");
    }

    /* renamed from: b */
    public final C3351az mo7324b(long j) {
        long j2;
        long j3;
        int b;
        C3431r[] rVarArr = this.f10568q;
        if (rVarArr.length == 0) {
            C3365bc bcVar = C3365bc.f10173a;
            return new C3351az(bcVar, bcVar);
        }
        int i = this.f10570s;
        long j4 = -1;
        if (i != -1) {
            C3414aa aaVar = rVarArr[i].f10548b;
            int g = m9943g(aaVar, j);
            if (g == -1) {
                C3365bc bcVar2 = C3365bc.f10173a;
                return new C3351az(bcVar2, bcVar2);
            }
            long j5 = aaVar.f10459f[g];
            j2 = aaVar.f10456c[g];
            if (j5 >= j || g >= aaVar.f10455b - 1 || (b = aaVar.mo7385b(j)) == -1 || b == g) {
                j3 = -9223372036854775807L;
            } else {
                j3 = aaVar.f10459f[b];
                j4 = aaVar.f10456c[b];
            }
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            C3431r[] rVarArr2 = this.f10568q;
            if (i2 >= rVarArr2.length) {
                break;
            }
            if (i2 != this.f10570s) {
                C3414aa aaVar2 = rVarArr2[i2].f10548b;
                long h = m9944h(aaVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = m9944h(aaVar2, j3, j4);
                }
                j2 = h;
            }
            i2++;
        }
        C3365bc bcVar3 = new C3365bc(j, j2);
        if (j3 == -9223372036854775807L) {
            return new C3351az(bcVar3, bcVar3);
        }
        return new C3351az(bcVar3, new C3365bc(j3, j4));
    }

    /* renamed from: c */
    public final void mo7153c() {
    }

    /* renamed from: d */
    public final void mo7154d(long j, long j2) {
        this.f10557f.clear();
        this.f10562k = 0;
        this.f10564m = -1;
        this.f10565n = 0;
        this.f10566o = 0;
        this.f10567p = 0;
        if (j == 0) {
            m9945i();
            return;
        }
        for (C3431r rVar : this.f10568q) {
            C3414aa aaVar = rVar.f10548b;
            int a = aaVar.mo7384a(j2);
            if (a == -1) {
                a = aaVar.mo7385b(j2);
            }
            rVar.f10551e = a;
            C3369bg bgVar = rVar.f10550d;
            if (bgVar != null) {
                bgVar.mo7359b();
            }
        }
    }

    /* renamed from: e */
    public final boolean mo7155e(C3327ab abVar) {
        return C3436w.m9957a(abVar, false);
    }

    /* renamed from: r */
    public final long mo7325r() {
        return this.f10571t;
    }

    /* renamed from: s */
    public final void mo7156s(C3329ad adVar) {
        this.f10552a = adVar;
    }

    /* renamed from: t */
    public final boolean mo7326t() {
        return true;
    }

    public C3432s(byte[] bArr) {
        this.f10559h = 0;
        int i = C3435v.f10574a;
        new ArrayList();
        this.f10558g = new ArrayList();
        this.f10556e = new C2604ac(16);
        this.f10557f = new ArrayDeque();
        this.f10553b = new C2604ac(C3347av.f10114a);
        this.f10554c = new C2604ac(4);
        this.f10555d = new C2604ac();
        this.f10564m = -1;
        this.f10552a = C3329ad.f10053E;
        this.f10568q = new C3431r[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:208:0x0085 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo7152a(androidx.media3.extractor.C3327ab r33, androidx.media3.extractor.C3350ay r34) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
        L_0x0006:
            int r3 = r0.f10559h
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            r6 = 0
            r8 = -1
            r9 = 8
            r10 = 1
            if (r3 == 0) goto L_0x0250
            r13 = 262144(0x40000, double:1.295163E-318)
            if (r3 == r10) goto L_0x01ce
            long r3 = r33.mo7313f()
            int r9 = r0.f10564m
            if (r9 != r8) goto L_0x00a3
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = r16
            r22 = r18
            r25 = r22
            r9 = 0
            r20 = -1
            r21 = 1
            r24 = 1
            r27 = -1
        L_0x0034:
            androidx.media3.extractor.h.r[] r5 = r0.f10568q
            int r15 = r5.length
            if (r9 >= r15) goto L_0x0088
            r5 = r5[r9]
            int r15 = r5.f10551e
            androidx.media3.extractor.h.aa r5 = r5.f10548b
            int r12 = r5.f10455b
            if (r15 != r12) goto L_0x0044
            goto L_0x0085
        L_0x0044:
            long[] r5 = r5.f10456c
            r28 = r5[r15]
            long[][] r5 = r0.f10569r
            java.lang.Object r5 = androidx.media3.common.p136b.C2612ak.m6927J(r5)
            long[][] r5 = (long[][]) r5
            r5 = r5[r9]
            r30 = r5[r15]
            long r28 = r28 - r3
            int r5 = (r28 > r6 ? 1 : (r28 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0061
            int r5 = (r28 > r13 ? 1 : (r28 == r13 ? 0 : -1))
            if (r5 < 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r5 = 0
            goto L_0x0062
        L_0x0061:
            r5 = 1
        L_0x0062:
            if (r5 != 0) goto L_0x0068
            if (r24 != 0) goto L_0x0070
            r12 = 0
            goto L_0x006a
        L_0x0068:
            r12 = r24
        L_0x006a:
            if (r5 != r12) goto L_0x0079
            int r15 = (r28 > r22 ? 1 : (r28 == r22 ? 0 : -1))
            if (r15 >= 0) goto L_0x0079
        L_0x0070:
            r24 = r5
            r20 = r9
            r22 = r28
            r25 = r30
            goto L_0x007b
        L_0x0079:
            r24 = r12
        L_0x007b:
            int r12 = (r30 > r18 ? 1 : (r30 == r18 ? 0 : -1))
            if (r12 >= 0) goto L_0x0085
            r21 = r5
            r27 = r9
            r18 = r30
        L_0x0085:
            int r9 = r9 + 1
            goto L_0x0034
        L_0x0088:
            int r5 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x009b
            if (r21 == 0) goto L_0x009b
            r15 = 10485760(0xa00000, double:5.180654E-317)
            long r18 = r18 + r15
            int r5 = (r25 > r18 ? 1 : (r25 == r18 ? 0 : -1))
            if (r5 >= 0) goto L_0x0098
            goto L_0x009b
        L_0x0098:
            r9 = r27
            goto L_0x009d
        L_0x009b:
            r9 = r20
        L_0x009d:
            r0.f10564m = r9
            if (r9 != r8) goto L_0x00a3
            goto L_0x01cd
        L_0x00a3:
            androidx.media3.extractor.h.r[] r5 = r0.f10568q
            r5 = r5[r9]
            androidx.media3.extractor.bf r9 = r5.f10549c
            int r12 = r5.f10551e
            androidx.media3.extractor.h.aa r15 = r5.f10548b
            long[] r8 = r15.f10456c
            r10 = r8[r12]
            int[] r8 = r15.f10457d
            r8 = r8[r12]
            androidx.media3.extractor.bg r15 = r5.f10550d
            long r3 = r10 - r3
            int r13 = r0.f10565n
            long r13 = (long) r13
            long r3 = r3 + r13
            int r13 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x01ca
            r6 = 262144(0x40000, double:1.295163E-318)
            int r13 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x00ca
            goto L_0x01ca
        L_0x00ca:
            androidx.media3.extractor.h.x r2 = r5.f10547a
            int r2 = r2.f10582g
            r6 = 1
            if (r2 != r6) goto L_0x00d6
            r6 = 8
            long r3 = r3 + r6
            int r8 = r8 + -8
        L_0x00d6:
            int r2 = (int) r3
            r1.mo7318m(r2)
            androidx.media3.extractor.h.x r2 = r5.f10547a
            int r3 = r2.f10585j
            if (r3 == 0) goto L_0x013e
            androidx.media3.common.b.ac r2 = r0.f10554c
            byte[] r2 = r2.f7234a
            r4 = 0
            r2[r4] = r4
            r6 = 1
            r2[r6] = r4
            r6 = 2
            r2[r6] = r4
            int r4 = 4 - r3
        L_0x00ef:
            int r6 = r0.f10566o
            if (r6 >= r8) goto L_0x0181
            int r6 = r0.f10567p
            if (r6 != 0) goto L_0x0129
            r1.mo7316k(r2, r4, r3)
            int r6 = r0.f10565n
            int r6 = r6 + r3
            r0.f10565n = r6
            androidx.media3.common.b.ac r6 = r0.f10554c
            r7 = 0
            r6.mo6131A(r7)
            androidx.media3.common.b.ac r6 = r0.f10554c
            int r6 = r6.mo6134b()
            if (r6 < 0) goto L_0x0121
            r0.f10567p = r6
            androidx.media3.common.b.ac r6 = r0.f10553b
            r6.mo6131A(r7)
            androidx.media3.common.b.ac r6 = r0.f10553b
            r10 = 4
            r9.mo6851c(r6, r10)
            int r6 = r0.f10566o
            int r6 = r6 + r10
            r0.f10566o = r6
            int r8 = r8 + r4
            goto L_0x00ef
        L_0x0121:
            java.lang.String r1 = "Invalid NAL length"
            r2 = 0
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r2)
            throw r1
        L_0x0129:
            r7 = 0
            int r6 = r9.mo6849a(r1, r6, r7)
            int r7 = r0.f10565n
            int r7 = r7 + r6
            r0.f10565n = r7
            int r7 = r0.f10566o
            int r7 = r7 + r6
            r0.f10566o = r7
            int r7 = r0.f10567p
            int r7 = r7 - r6
            r0.f10567p = r7
            goto L_0x00ef
        L_0x013e:
            androidx.media3.common.x r2 = r2.f10581f
            java.lang.String r2 = r2.f7496n
            java.lang.String r3 = "audio/ac4"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0161
            int r2 = r0.f10566o
            if (r2 != 0) goto L_0x015e
            androidx.media3.common.b.ac r2 = r0.f10555d
            androidx.media3.extractor.C3387e.m9795b(r8, r2)
            androidx.media3.common.b.ac r2 = r0.f10555d
            r3 = 7
            r9.mo6851c(r2, r3)
            int r2 = r0.f10566o
            int r2 = r2 + r3
            r0.f10566o = r2
        L_0x015e:
            int r8 = r8 + 7
            goto L_0x0166
        L_0x0161:
            if (r15 == 0) goto L_0x0166
            r15.mo7361d(r1)
        L_0x0166:
            int r2 = r0.f10566o
            if (r2 >= r8) goto L_0x0181
            int r2 = r8 - r2
            r3 = 0
            int r2 = r9.mo6849a(r1, r2, r3)
            int r3 = r0.f10565n
            int r3 = r3 + r2
            r0.f10565n = r3
            int r3 = r0.f10566o
            int r3 = r3 + r2
            r0.f10566o = r3
            int r3 = r0.f10567p
            int r3 = r3 - r2
            r0.f10567p = r3
            goto L_0x0166
        L_0x0181:
            androidx.media3.extractor.h.aa r1 = r5.f10548b
            long[] r2 = r1.f10459f
            r3 = r2[r12]
            int[] r1 = r1.f10460g
            r1 = r1[r12]
            if (r15 == 0) goto L_0x01aa
            r21 = 0
            r22 = 0
            r2 = r15
            r16 = r9
            r17 = r3
            r19 = r1
            r20 = r8
            r15.mo7360c(r16, r17, r19, r20, r21, r22)
            r1 = 1
            int r12 = r12 + r1
            androidx.media3.extractor.h.aa r1 = r5.f10548b
            int r1 = r1.f10455b
            if (r12 != r1) goto L_0x01b8
            r1 = 0
            r2.mo7358a(r9, r1)
            goto L_0x01b8
        L_0x01aa:
            r20 = 0
            r21 = 0
            r15 = r9
            r16 = r3
            r18 = r1
            r19 = r8
            r15.mo6852d(r16, r18, r19, r20, r21)
        L_0x01b8:
            int r1 = r5.f10551e
            r2 = 1
            int r1 = r1 + r2
            r5.f10551e = r1
            r1 = -1
            r0.f10564m = r1
            r1 = 0
            r0.f10565n = r1
            r0.f10566o = r1
            r0.f10567p = r1
            r8 = 0
            goto L_0x01cd
        L_0x01ca:
            r2.f10122a = r10
            r8 = 1
        L_0x01cd:
            return r8
        L_0x01ce:
            long r5 = r0.f10561j
            int r3 = r0.f10562k
            long r7 = (long) r3
            long r5 = r5 - r7
            long r7 = r33.mo7313f()
            long r7 = r7 + r5
            androidx.media3.common.b.ac r3 = r0.f10563l
            if (r3 == 0) goto L_0x022f
            byte[] r10 = r3.f7234a
            int r11 = r0.f10562k
            int r6 = (int) r5
            r1.mo7316k(r10, r11, r6)
            int r5 = r0.f10560i
            if (r5 != r4) goto L_0x0214
            r3.mo6131A(r9)
            int r4 = r3.mo6134b()
            int r4 = m9942f(r4)
            if (r4 == 0) goto L_0x01f7
            goto L_0x0211
        L_0x01f7:
            int r4 = r3.f7235b
            r5 = 4
            int r4 = r4 + r5
            r3.mo6131A(r4)
        L_0x01fe:
            int r4 = r3.f7236c
            int r5 = r3.f7235b
            int r4 = r4 - r5
            if (r4 <= 0) goto L_0x0210
            int r4 = r3.mo6134b()
            int r4 = m9942f(r4)
            if (r4 == 0) goto L_0x01fe
            goto L_0x0211
        L_0x0210:
            r4 = 0
        L_0x0211:
            r0.f10572u = r4
            goto L_0x023a
        L_0x0214:
            java.util.ArrayDeque r4 = r0.f10557f
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x023a
            java.util.ArrayDeque r4 = r0.f10557f
            java.lang.Object r4 = r4.peek()
            androidx.media3.extractor.h.a r4 = (androidx.media3.extractor.p161h.C3413a) r4
            androidx.media3.extractor.h.b r5 = new androidx.media3.extractor.h.b
            int r6 = r0.f10560i
            r5.<init>(r6, r3)
            r4.mo7382d(r5)
            goto L_0x023a
        L_0x022f:
            r3 = 262144(0x40000, double:1.295163E-318)
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x023c
            int r3 = (int) r5
            r1.mo7318m(r3)
        L_0x023a:
            r11 = 0
            goto L_0x0244
        L_0x023c:
            long r3 = r33.mo7313f()
            long r3 = r3 + r5
            r2.f10122a = r3
            r11 = 1
        L_0x0244:
            r0.m9946j(r7)
            if (r11 == 0) goto L_0x0006
            int r3 = r0.f10559h
            r4 = 2
            if (r3 == r4) goto L_0x0006
            r3 = 1
            return r3
        L_0x0250:
            r3 = 1
            int r5 = r0.f10562k
            if (r5 != 0) goto L_0x0279
            androidx.media3.common.b.ac r5 = r0.f10556e
            byte[] r5 = r5.f7234a
            r8 = 0
            boolean r5 = r1.mo7321p(r5, r8, r9, r3)
            if (r5 != 0) goto L_0x0262
            r3 = -1
            return r3
        L_0x0262:
            r0.f10562k = r9
            androidx.media3.common.b.ac r3 = r0.f10556e
            r3.mo6131A(r8)
            androidx.media3.common.b.ac r3 = r0.f10556e
            long r10 = r3.mo6146n()
            r0.f10561j = r10
            androidx.media3.common.b.ac r3 = r0.f10556e
            int r3 = r3.mo6134b()
            r0.f10560i = r3
        L_0x0279:
            long r10 = r0.f10561j
            r12 = 1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x0296
            androidx.media3.common.b.ac r3 = r0.f10556e
            byte[] r3 = r3.f7234a
            r1.mo7316k(r3, r9, r9)
            int r3 = r0.f10562k
            int r3 = r3 + r9
            r0.f10562k = r3
            androidx.media3.common.b.ac r3 = r0.f10556e
            long r5 = r3.mo6147o()
            r0.f10561j = r5
            goto L_0x02c1
        L_0x0296:
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x02c1
            long r5 = r33.mo7311d()
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x02b2
            java.util.ArrayDeque r3 = r0.f10557f
            java.lang.Object r3 = r3.peek()
            androidx.media3.extractor.h.a r3 = (androidx.media3.extractor.p161h.C3413a) r3
            if (r3 == 0) goto L_0x02b1
            long r5 = r3.f10451a
            goto L_0x02b2
        L_0x02b1:
            r5 = r7
        L_0x02b2:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x02c1
            long r7 = r33.mo7313f()
            long r5 = r5 - r7
            int r3 = r0.f10562k
            long r7 = (long) r3
            long r5 = r5 + r7
            r0.f10561j = r5
        L_0x02c1:
            long r5 = r0.f10561j
            int r3 = r0.f10562k
            long r7 = (long) r3
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto L_0x03d2
            int r5 = r0.f10560i
            r6 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r5 == r6) goto L_0x0384
            r6 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r6) goto L_0x0384
            r6 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r5 == r6) goto L_0x0384
            r6 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r5 == r6) goto L_0x0384
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r5 == r6) goto L_0x0384
            r6 = 1701082227(0x65647473, float:6.742798E22)
            if (r5 == r6) goto L_0x0384
            if (r5 != r7) goto L_0x02f1
            goto L_0x0384
        L_0x02f1:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r5 == r6) goto L_0x0354
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r5 == r6) goto L_0x0354
            r6 = 1751411826(0x68646c72, float:4.3148E24)
            if (r5 == r6) goto L_0x0354
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            if (r5 == r6) goto L_0x0354
            r6 = 1937011827(0x73747473, float:1.9367711E31)
            if (r5 == r6) goto L_0x0354
            r6 = 1937011571(0x73747373, float:1.9367401E31)
            if (r5 == r6) goto L_0x0354
            r6 = 1668576371(0x63747473, float:4.5093966E21)
            if (r5 == r6) goto L_0x0354
            r6 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r5 == r6) goto L_0x0354
            r6 = 1937011555(0x73747363, float:1.9367382E31)
            if (r5 == r6) goto L_0x0354
            r6 = 1937011578(0x7374737a, float:1.936741E31)
            if (r5 == r6) goto L_0x0354
            r6 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r5 == r6) goto L_0x0354
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r5 == r6) goto L_0x0354
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r5 == r6) goto L_0x0354
            r6 = 1953196132(0x746b6864, float:7.46037E31)
            if (r5 == r6) goto L_0x0354
            if (r5 == r4) goto L_0x0354
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r5 == r4) goto L_0x0354
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r5 == r4) goto L_0x0354
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r5 != r4) goto L_0x0349
            goto L_0x0354
        L_0x0349:
            r33.mo7313f()
            r3 = 0
            r0.f10563l = r3
            r3 = 1
            r0.f10559h = r3
            goto L_0x0006
        L_0x0354:
            if (r3 != r9) goto L_0x0358
            r3 = 1
            goto L_0x0359
        L_0x0358:
            r3 = 0
        L_0x0359:
            androidx.media3.common.p136b.C2601a.m6832d(r3)
            long r3 = r0.f10561j
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0367
            r3 = 1
            goto L_0x0368
        L_0x0367:
            r3 = 0
        L_0x0368:
            androidx.media3.common.p136b.C2601a.m6832d(r3)
            androidx.media3.common.b.ac r3 = new androidx.media3.common.b.ac
            long r4 = r0.f10561j
            int r5 = (int) r4
            r3.<init>((int) r5)
            androidx.media3.common.b.ac r4 = r0.f10556e
            byte[] r4 = r4.f7234a
            byte[] r5 = r3.f7234a
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r9)
            r0.f10563l = r3
            r3 = 1
            r0.f10559h = r3
            goto L_0x0006
        L_0x0384:
            long r3 = r33.mo7313f()
            long r5 = r0.f10561j
            int r8 = r0.f10562k
            long r10 = (long) r8
            long r3 = r3 + r5
            long r3 = r3 - r10
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x03b3
            int r5 = r0.f10560i
            if (r5 != r7) goto L_0x03b3
            androidx.media3.common.b.ac r5 = r0.f10555d
            r5.mo6156x(r9)
            androidx.media3.common.b.ac r5 = r0.f10555d
            byte[] r5 = r5.f7234a
            r6 = 0
            r1.mo7315j(r5, r6, r9)
            androidx.media3.common.b.ac r5 = r0.f10555d
            androidx.media3.extractor.p161h.C3423j.m9907c(r5)
            androidx.media3.common.b.ac r5 = r0.f10555d
            int r5 = r5.f7235b
            r1.mo7318m(r5)
            r33.mo7317l()
        L_0x03b3:
            java.util.ArrayDeque r5 = r0.f10557f
            androidx.media3.extractor.h.a r6 = new androidx.media3.extractor.h.a
            int r7 = r0.f10560i
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r0.f10561j
            int r7 = r0.f10562k
            long r7 = (long) r7
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x03cd
            r0.m9946j(r3)
            goto L_0x0006
        L_0x03cd:
            r32.m9945i()
            goto L_0x0006
        L_0x03d2:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6822d(r1)
            goto L_0x03da
        L_0x03d9:
            throw r1
        L_0x03da:
            goto L_0x03d9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p161h.C3432s.mo7152a(androidx.media3.extractor.ab, androidx.media3.extractor.ay):int");
    }
}
