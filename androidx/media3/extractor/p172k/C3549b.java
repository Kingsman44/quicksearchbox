package androidx.media3.extractor.p172k;

import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2603ab;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.extractor.k.b */
/* compiled from: PG */
public final class C3549b implements C3557j {

    /* renamed from: a */
    private final C2603ab f11115a;

    /* renamed from: b */
    private final C2604ac f11116b;

    /* renamed from: c */
    private final String f11117c;

    /* renamed from: d */
    private String f11118d;

    /* renamed from: e */
    private C3368bf f11119e;

    /* renamed from: f */
    private int f11120f;

    /* renamed from: g */
    private int f11121g;

    /* renamed from: h */
    private boolean f11122h;

    /* renamed from: i */
    private long f11123i;

    /* renamed from: j */
    private C2680x f11124j;

    /* renamed from: k */
    private int f11125k;

    /* renamed from: l */
    private long f11126l;

    public C3549b() {
        this((String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:136:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x028a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7466a(androidx.media3.common.p136b.C2604ac r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            androidx.media3.extractor.bf r2 = r0.f11119e
            androidx.media3.common.p136b.C2601a.m6829a(r2)
        L_0x0009:
            int r2 = r1.f7236c
            int r3 = r1.f7235b
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x036d
            int r3 = r0.f11120f
            r4 = 11
            r5 = 0
            r6 = 1
            r7 = 2
            if (r3 == 0) goto L_0x0334
            if (r3 == r6) goto L_0x004f
            int r3 = r0.f11125k
            int r4 = r0.f11121g
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            androidx.media3.extractor.bf r3 = r0.f11119e
            r3.mo6851c(r1, r2)
            int r3 = r0.f11121g
            int r3 = r3 + r2
            r0.f11121g = r3
            int r10 = r0.f11125k
            if (r3 != r10) goto L_0x0009
            long r7 = r0.f11126l
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x004c
            androidx.media3.extractor.bf r6 = r0.f11119e
            r9 = 1
            r11 = 0
            r12 = 0
            r6.mo6852d(r7, r9, r10, r11, r12)
            long r2 = r0.f11126l
            long r6 = r0.f11123i
            long r2 = r2 + r6
            r0.f11126l = r2
        L_0x004c:
            r0.f11120f = r5
            goto L_0x0009
        L_0x004f:
            androidx.media3.common.b.ac r3 = r0.f11116b
            byte[] r3 = r3.f7234a
            int r8 = r0.f11121g
            r9 = 128(0x80, float:1.794E-43)
            int r8 = 128 - r8
            int r2 = java.lang.Math.min(r2, r8)
            int r8 = r0.f11121g
            r1.mo6155w(r3, r8, r2)
            int r3 = r0.f11121g
            int r3 = r3 + r2
            r0.f11121g = r3
            if (r3 != r9) goto L_0x0009
            androidx.media3.common.b.ab r2 = r0.f11115a
            r2.mo6124i(r5)
            androidx.media3.common.b.ab r2 = r0.f11115a
            int[] r3 = androidx.media3.extractor.C3375c.f10200a
            int r3 = r2.mo6118c()
            r8 = 40
            r2.mo6126k(r8)
            r8 = 5
            int r10 = r2.mo6119d(r8)
            r2.mo6124i(r3)
            r3 = -1
            r11 = 10
            r12 = 8
            r13 = 6
            r14 = 3
            if (r10 <= r11) goto L_0x0291
            r10 = 16
            r2.mo6126k(r10)
            int r15 = r2.mo6119d(r7)
            if (r15 == 0) goto L_0x00a0
            if (r15 == r6) goto L_0x009e
            if (r15 == r7) goto L_0x009c
            goto L_0x00a1
        L_0x009c:
            r3 = 2
            goto L_0x00a1
        L_0x009e:
            r3 = 1
            goto L_0x00a1
        L_0x00a0:
            r3 = 0
        L_0x00a1:
            r2.mo6126k(r14)
            int r4 = r2.mo6119d(r4)
            int r4 = r4 + r6
            int r4 = r4 + r4
            int r15 = r2.mo6119d(r7)
            if (r15 != r14) goto L_0x00be
            int[] r16 = androidx.media3.extractor.C3375c.f10202c
            int r17 = r2.mo6119d(r7)
            r16 = r16[r17]
            r18 = r16
            r9 = 6
            r16 = 3
            goto L_0x00cc
        L_0x00be:
            int r16 = r2.mo6119d(r7)
            int[] r17 = androidx.media3.extractor.C3375c.f10200a
            r17 = r17[r16]
            int[] r18 = androidx.media3.extractor.C3375c.f10201b
            r18 = r18[r15]
            r9 = r17
        L_0x00cc:
            int r5 = r9 * 256
            int r19 = r2.mo6119d(r14)
            boolean r20 = r2.mo6128m()
            int[] r21 = androidx.media3.extractor.C3375c.f10203d
            r21 = r21[r19]
            int r21 = r21 + r20
            r2.mo6126k(r11)
            boolean r11 = r2.mo6128m()
            if (r11 == 0) goto L_0x00e8
            r2.mo6126k(r12)
        L_0x00e8:
            if (r19 != 0) goto L_0x00fa
            r2.mo6126k(r8)
            boolean r11 = r2.mo6128m()
            if (r11 == 0) goto L_0x00f6
            r2.mo6126k(r12)
        L_0x00f6:
            r11 = 0
            r19 = 0
            goto L_0x00fc
        L_0x00fa:
            r11 = r19
        L_0x00fc:
            if (r3 != r6) goto L_0x0108
            boolean r3 = r2.mo6128m()
            if (r3 == 0) goto L_0x0107
            r2.mo6126k(r10)
        L_0x0107:
            r3 = 1
        L_0x0108:
            boolean r10 = r2.mo6128m()
            r12 = 4
            if (r10 == 0) goto L_0x022a
            if (r11 <= r7) goto L_0x0114
            r2.mo6126k(r7)
        L_0x0114:
            r10 = r11 & 1
            if (r10 == 0) goto L_0x011d
            if (r11 <= r7) goto L_0x011d
            r2.mo6126k(r13)
        L_0x011d:
            r10 = r11 & 4
            if (r10 == 0) goto L_0x0124
            r2.mo6126k(r13)
        L_0x0124:
            if (r20 == 0) goto L_0x012f
            boolean r10 = r2.mo6128m()
            if (r10 == 0) goto L_0x012f
            r2.mo6126k(r8)
        L_0x012f:
            if (r3 != 0) goto L_0x022a
            boolean r3 = r2.mo6128m()
            if (r3 == 0) goto L_0x013a
            r2.mo6126k(r13)
        L_0x013a:
            if (r11 != 0) goto L_0x0145
            boolean r3 = r2.mo6128m()
            if (r3 == 0) goto L_0x0145
            r2.mo6126k(r13)
        L_0x0145:
            boolean r3 = r2.mo6128m()
            if (r3 == 0) goto L_0x014e
            r2.mo6126k(r13)
        L_0x014e:
            int r3 = r2.mo6119d(r7)
            if (r3 != r6) goto L_0x0159
            r2.mo6126k(r8)
            goto L_0x01f2
        L_0x0159:
            if (r3 != r7) goto L_0x0162
            r3 = 12
            r2.mo6126k(r3)
            goto L_0x01f2
        L_0x0162:
            if (r3 != r14) goto L_0x01f2
            int r3 = r2.mo6119d(r8)
            boolean r10 = r2.mo6128m()
            if (r10 == 0) goto L_0x01c8
            r2.mo6126k(r8)
            boolean r10 = r2.mo6128m()
            if (r10 == 0) goto L_0x017a
            r2.mo6126k(r12)
        L_0x017a:
            boolean r10 = r2.mo6128m()
            if (r10 == 0) goto L_0x0183
            r2.mo6126k(r12)
        L_0x0183:
            boolean r10 = r2.mo6128m()
            if (r10 == 0) goto L_0x018c
            r2.mo6126k(r12)
        L_0x018c:
            boolean r10 = r2.mo6128m()
            if (r10 == 0) goto L_0x0195
            r2.mo6126k(r12)
        L_0x0195:
            boolean r10 = r2.mo6128m()
            if (r10 == 0) goto L_0x019e
            r2.mo6126k(r12)
        L_0x019e:
            boolean r10 = r2.mo6128m()
            if (r10 == 0) goto L_0x01a7
            r2.mo6126k(r12)
        L_0x01a7:
            boolean r10 = r2.mo6128m()
            if (r10 == 0) goto L_0x01b0
            r2.mo6126k(r12)
        L_0x01b0:
            boolean r10 = r2.mo6128m()
            if (r10 == 0) goto L_0x01c8
            boolean r10 = r2.mo6128m()
            if (r10 == 0) goto L_0x01bf
            r2.mo6126k(r12)
        L_0x01bf:
            boolean r10 = r2.mo6128m()
            if (r10 == 0) goto L_0x01c8
            r2.mo6126k(r12)
        L_0x01c8:
            boolean r10 = r2.mo6128m()
            if (r10 == 0) goto L_0x01e7
            r2.mo6126k(r8)
            boolean r10 = r2.mo6128m()
            if (r10 == 0) goto L_0x01e7
            r10 = 7
            r2.mo6126k(r10)
            boolean r10 = r2.mo6128m()
            if (r10 == 0) goto L_0x01e7
            r10 = 8
            r2.mo6126k(r10)
            goto L_0x01e9
        L_0x01e7:
            r10 = 8
        L_0x01e9:
            int r3 = r3 + r7
            int r3 = r3 * 8
            r2.mo6126k(r3)
            r2.mo6122g()
        L_0x01f2:
            if (r11 >= r7) goto L_0x020a
            boolean r3 = r2.mo6128m()
            r10 = 14
            if (r3 == 0) goto L_0x01ff
            r2.mo6126k(r10)
        L_0x01ff:
            if (r19 != 0) goto L_0x020a
            boolean r3 = r2.mo6128m()
            if (r3 == 0) goto L_0x020a
            r2.mo6126k(r10)
        L_0x020a:
            boolean r3 = r2.mo6128m()
            if (r3 == 0) goto L_0x0226
            if (r16 != 0) goto L_0x0217
            r2.mo6126k(r8)
            r3 = 0
            goto L_0x0228
        L_0x0217:
            r3 = 0
        L_0x0218:
            if (r3 >= r9) goto L_0x0226
            boolean r10 = r2.mo6128m()
            if (r10 == 0) goto L_0x0223
            r2.mo6126k(r8)
        L_0x0223:
            int r3 = r3 + 1
            goto L_0x0218
        L_0x0226:
            r3 = r16
        L_0x0228:
            r9 = 0
            goto L_0x022d
        L_0x022a:
            r9 = r3
            r3 = r16
        L_0x022d:
            boolean r10 = r2.mo6128m()
            if (r10 == 0) goto L_0x025f
            r2.mo6126k(r8)
            if (r11 != r7) goto L_0x023c
            r2.mo6126k(r12)
            r11 = 2
        L_0x023c:
            if (r11 < r13) goto L_0x0241
            r2.mo6126k(r7)
        L_0x0241:
            boolean r8 = r2.mo6128m()
            if (r8 == 0) goto L_0x024d
            r8 = 8
            r2.mo6126k(r8)
            goto L_0x024f
        L_0x024d:
            r8 = 8
        L_0x024f:
            if (r11 != 0) goto L_0x025a
            boolean r10 = r2.mo6128m()
            if (r10 == 0) goto L_0x025a
            r2.mo6126k(r8)
        L_0x025a:
            if (r15 >= r14) goto L_0x025f
            r2.mo6125j()
        L_0x025f:
            if (r9 != 0) goto L_0x0266
            if (r3 == r14) goto L_0x0266
            r2.mo6125j()
        L_0x0266:
            if (r9 != r7) goto L_0x0273
            if (r3 == r14) goto L_0x0270
            boolean r3 = r2.mo6128m()
            if (r3 == 0) goto L_0x0273
        L_0x0270:
            r2.mo6126k(r13)
        L_0x0273:
            boolean r3 = r2.mo6128m()
            if (r3 == 0) goto L_0x028a
            int r3 = r2.mo6119d(r13)
            if (r3 != r6) goto L_0x028a
            r3 = 8
            int r2 = r2.mo6119d(r3)
            if (r2 != r6) goto L_0x028a
            java.lang.String r2 = "audio/eac3-joc"
            goto L_0x028c
        L_0x028a:
            java.lang.String r2 = "audio/eac3"
        L_0x028c:
            r3 = r18
            r6 = r21
            goto L_0x02de
        L_0x0291:
            r4 = 32
            r2.mo6126k(r4)
            int r4 = r2.mo6119d(r7)
            if (r4 != r14) goto L_0x029e
            r5 = 0
            goto L_0x02a0
        L_0x029e:
            java.lang.String r5 = "audio/ac3"
        L_0x02a0:
            int r8 = r2.mo6119d(r13)
            int r8 = androidx.media3.extractor.C3375c.m9762a(r4, r8)
            r9 = 8
            r2.mo6126k(r9)
            int r9 = r2.mo6119d(r14)
            r10 = r9 & 1
            if (r10 == 0) goto L_0x02ba
            if (r9 == r6) goto L_0x02ba
            r2.mo6126k(r7)
        L_0x02ba:
            r6 = r9 & 4
            if (r6 == 0) goto L_0x02c1
            r2.mo6126k(r7)
        L_0x02c1:
            if (r9 != r7) goto L_0x02c6
            r2.mo6126k(r7)
        L_0x02c6:
            if (r4 >= r14) goto L_0x02cc
            int[] r3 = androidx.media3.extractor.C3375c.f10201b
            r3 = r3[r4]
        L_0x02cc:
            boolean r2 = r2.mo6128m()
            int[] r4 = androidx.media3.extractor.C3375c.f10203d
            r4 = r4[r9]
            int r21 = r4 + r2
            r2 = 1536(0x600, float:2.152E-42)
            r2 = r5
            r4 = r8
            r6 = r21
            r5 = 1536(0x600, float:2.152E-42)
        L_0x02de:
            androidx.media3.common.x r8 = r0.f11124j
            if (r8 == 0) goto L_0x02f2
            int r9 = r8.f7477A
            if (r6 != r9) goto L_0x02f2
            int r9 = r8.f7478B
            if (r3 != r9) goto L_0x02f2
            java.lang.String r8 = r8.f7496n
            boolean r8 = androidx.media3.common.p136b.C2612ak.m6951aa(r2, r8)
            if (r8 != 0) goto L_0x0311
        L_0x02f2:
            androidx.media3.common.w r8 = new androidx.media3.common.w
            r8.<init>()
            java.lang.String r9 = r0.f11118d
            r8.f7449a = r9
            r8.f7459k = r2
            r8.f7472x = r6
            r8.f7473y = r3
            java.lang.String r2 = r0.f11117c
            r8.f7451c = r2
            androidx.media3.common.x r2 = new androidx.media3.common.x
            r2.<init>(r8)
            r0.f11124j = r2
            androidx.media3.extractor.bf r3 = r0.f11119e
            r3.mo6850b(r2)
        L_0x0311:
            r0.f11125k = r4
            long r2 = (long) r5
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r4
            androidx.media3.common.x r4 = r0.f11124j
            int r4 = r4.f7478B
            long r4 = (long) r4
            long r2 = r2 / r4
            r0.f11123i = r2
            androidx.media3.common.b.ac r2 = r0.f11116b
            r3 = 0
            r2.mo6131A(r3)
            androidx.media3.extractor.bf r2 = r0.f11119e
            androidx.media3.common.b.ac r3 = r0.f11116b
            r4 = 128(0x80, float:1.794E-43)
            r2.mo6851c(r3, r4)
            r0.f11120f = r7
            goto L_0x0009
        L_0x0334:
            int r2 = r1.f7236c
            int r3 = r1.f7235b
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x0009
            boolean r2 = r0.f11122h
            if (r2 != 0) goto L_0x034b
            int r2 = r23.mo6139g()
            if (r2 != r4) goto L_0x0347
            r3 = 1
            goto L_0x0348
        L_0x0347:
            r3 = 0
        L_0x0348:
            r0.f11122h = r3
            goto L_0x0334
        L_0x034b:
            int r2 = r23.mo6139g()
            r3 = 119(0x77, float:1.67E-43)
            if (r2 != r3) goto L_0x0364
            r5 = 0
            r0.f11122h = r5
            r0.f11120f = r6
            androidx.media3.common.b.ac r2 = r0.f11116b
            byte[] r2 = r2.f7234a
            r2[r5] = r4
            r2[r6] = r3
            r0.f11121g = r7
            goto L_0x0009
        L_0x0364:
            r5 = 0
            if (r2 != r4) goto L_0x0369
            r3 = 1
            goto L_0x036a
        L_0x0369:
            r3 = 0
        L_0x036a:
            r0.f11122h = r3
            goto L_0x0334
        L_0x036d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p172k.C3549b.mo7466a(androidx.media3.common.b.ac):void");
    }

    /* renamed from: b */
    public final void mo7467b(C3329ad adVar, C3545ar arVar) {
        arVar.mo7462a();
        arVar.mo7463b();
        this.f11118d = arVar.f11109b;
        arVar.mo7463b();
        this.f11119e = adVar.mo6987eZ(arVar.f11108a, 1);
    }

    /* renamed from: c */
    public final void mo7468c() {
    }

    /* renamed from: d */
    public final void mo7469d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f11126l = j;
        }
    }

    /* renamed from: e */
    public final void mo7470e() {
        this.f11120f = 0;
        this.f11121g = 0;
        this.f11122h = false;
        this.f11126l = -9223372036854775807L;
    }

    public C3549b(String str) {
        C2603ab abVar = new C2603ab(new byte[128], 128);
        this.f11115a = abVar;
        this.f11116b = new C2604ac(abVar.f7230a);
        this.f11120f = 0;
        this.f11126l = -9223372036854775807L;
        this.f11117c = str;
    }
}
