package androidx.media3.extractor.p162i;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3371bi;
import androidx.media3.extractor.C3373bk;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.media3.extractor.i.n */
/* compiled from: PG */
final class C3454n extends C3452l {

    /* renamed from: a */
    private C3453m f10674a;

    /* renamed from: o */
    private int f10675o;

    /* renamed from: p */
    private boolean f10676p;

    /* renamed from: q */
    private C3373bk f10677q;

    /* renamed from: r */
    private C3371bi f10678r;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo7403a(C2604ac acVar) {
        int i;
        int i2 = 0;
        byte b = acVar.f7234a[0];
        if ((b & 1) == 1) {
            return -1;
        }
        C3453m mVar = this.f10674a;
        C2601a.m6829a(mVar);
        if (!mVar.f10672d[(b >> 1) & (PrivateKeyType.INVALID >>> (8 - mVar.f10673e))].f10192a) {
            i = mVar.f10669a.f10197e;
        } else {
            i = mVar.f10669a.f10198f;
        }
        if (this.f10676p) {
            i2 = (this.f10675o + i) / 4;
        }
        long j = (long) i2;
        byte[] bArr = acVar.f7234a;
        int length = bArr.length;
        int i3 = acVar.f7236c + 4;
        if (length < i3) {
            byte[] copyOf = Arrays.copyOf(bArr, i3);
            acVar.mo6157y(copyOf, copyOf.length);
        } else {
            acVar.mo6158z(i3);
        }
        byte[] bArr2 = acVar.f7234a;
        int i4 = acVar.f7236c;
        bArr2[i4 - 4] = (byte) ((int) (j & 255));
        bArr2[i4 - 3] = (byte) ((int) ((j >>> 8) & 255));
        bArr2[i4 - 2] = (byte) ((int) ((j >>> 16) & 255));
        bArr2[i4 - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.f10676p = true;
        this.f10675o = i;
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7404b(boolean z) {
        super.mo7404b(z);
        if (z) {
            this.f10674a = null;
            this.f10677q = null;
            this.f10678r = null;
        }
        this.f10675o = 0;
        this.f10676p = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo7412g(long j) {
        this.f10662h = j;
        int i = 0;
        this.f10676p = j != 0;
        C3373bk bkVar = this.f10677q;
        if (bkVar != null) {
            i = bkVar.f10197e;
        }
        this.f10675o = i;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03d7  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7405c(androidx.media3.common.p136b.C2604ac r25, long r26, androidx.media3.extractor.p162i.C3450j r28) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r28
            androidx.media3.extractor.i.m r3 = r0.f10674a
            r4 = 0
            if (r3 == 0) goto L_0x0011
            androidx.media3.common.x r1 = r2.f10654a
            r1.getClass()
            return r4
        L_0x0011:
            androidx.media3.extractor.bk r6 = r0.f10677q
            r5 = 4
            r11 = 1
            if (r6 != 0) goto L_0x006b
            androidx.media3.extractor.C3374bl.m9761d(r11, r1, r4)
            r25.mo6136d()
            int r13 = r25.mo6139g()
            int r14 = r25.mo6136d()
            int r4 = r25.mo6135c()
            if (r4 > 0) goto L_0x002d
            r15 = -1
            goto L_0x002e
        L_0x002d:
            r15 = r4
        L_0x002e:
            int r4 = r25.mo6135c()
            if (r4 > 0) goto L_0x0037
            r16 = -1
            goto L_0x0039
        L_0x0037:
            r16 = r4
        L_0x0039:
            r25.mo6135c()
            int r3 = r25.mo6139g()
            r4 = r3 & 15
            double r8 = (double) r4
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = java.lang.Math.pow(r11, r8)
            r3 = r3 & 240(0xf0, float:3.36E-43)
            int r3 = r3 >> r5
            double r3 = (double) r3
            double r3 = java.lang.Math.pow(r11, r3)
            r25.mo6139g()
            byte[] r5 = r1.f7234a
            int r1 = r1.f7236c
            byte[] r19 = java.util.Arrays.copyOf(r5, r1)
            androidx.media3.extractor.bk r1 = new androidx.media3.extractor.bk
            int r5 = (int) r8
            int r3 = (int) r3
            r12 = r1
            r17 = r5
            r18 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r0.f10677q = r1
            goto L_0x0076
        L_0x006b:
            androidx.media3.extractor.bi r8 = r0.f10678r
            if (r8 != 0) goto L_0x0079
            r9 = 1
            androidx.media3.extractor.bi r1 = androidx.media3.extractor.C3374bl.m9760c(r1, r9, r9)
            r0.f10678r = r1
        L_0x0076:
            r7 = 0
            goto L_0x03d1
        L_0x0079:
            r9 = 1
            int r10 = r1.f7236c
            byte[] r11 = new byte[r10]
            byte[] r12 = r1.f7234a
            java.lang.System.arraycopy(r12, r4, r11, r4, r10)
            int r10 = r6.f10193a
            r12 = 5
            androidx.media3.extractor.C3374bl.m9761d(r12, r1, r4)
            int r13 = r25.mo6139g()
            int r13 = r13 + r9
            androidx.media3.extractor.bh r9 = new androidx.media3.extractor.bh
            byte[] r14 = r1.f7234a
            r9.<init>(r14)
            int r1 = r1.f7235b
            r14 = 8
            int r1 = r1 * 8
            r9.mo7363b(r1)
            r1 = 0
        L_0x009f:
            r15 = 24
            r3 = 16
            if (r1 >= r13) goto L_0x01b2
            int r14 = r9.mo7362a(r15)
            r7 = 5653314(0x564342, float:7.92198E-39)
            if (r14 != r7) goto L_0x0195
            int r3 = r9.mo7362a(r3)
            int r7 = r9.mo7362a(r15)
            long[] r14 = new long[r7]
            boolean r15 = r9.mo7364c()
            r18 = 0
            if (r15 != 0) goto L_0x00fd
            boolean r15 = r9.mo7364c()
            r4 = 0
        L_0x00c5:
            if (r4 >= r7) goto L_0x00fa
            if (r15 == 0) goto L_0x00e5
            boolean r20 = r9.mo7364c()
            if (r20 == 0) goto L_0x00dd
            int r20 = r9.mo7362a(r12)
            r21 = 1
            int r5 = r20 + 1
            r22 = r13
            long r12 = (long) r5
            r14[r4] = r12
            goto L_0x00e3
        L_0x00dd:
            r22 = r13
            r21 = 1
            r14[r4] = r18
        L_0x00e3:
            r5 = 5
            goto L_0x00f3
        L_0x00e5:
            r22 = r13
            r5 = 5
            r21 = 1
            int r12 = r9.mo7362a(r5)
            int r12 = r12 + 1
            long r12 = (long) r12
            r14[r4] = r12
        L_0x00f3:
            int r4 = r4 + 1
            r13 = r22
            r5 = 4
            r12 = 5
            goto L_0x00c5
        L_0x00fa:
            r22 = r13
            goto L_0x012f
        L_0x00fd:
            r22 = r13
            r5 = 5
            r21 = 1
            int r4 = r9.mo7362a(r5)
            int r4 = r4 + 1
            r5 = 0
        L_0x0109:
            if (r5 >= r7) goto L_0x012f
            int r12 = r7 - r5
            int r12 = androidx.media3.extractor.C3374bl.m9758a(r12)
            int r12 = r9.mo7362a(r12)
            r13 = 0
        L_0x0116:
            if (r13 >= r12) goto L_0x0128
            if (r5 >= r7) goto L_0x0128
            r21 = r11
            r15 = r12
            long r11 = (long) r4
            r14[r5] = r11
            int r5 = r5 + 1
            int r13 = r13 + 1
            r12 = r15
            r11 = r21
            goto L_0x0116
        L_0x0128:
            r21 = r11
            int r4 = r4 + 1
            r11 = r21
            goto L_0x0109
        L_0x012f:
            r21 = r11
            r4 = 4
            int r5 = r9.mo7362a(r4)
            r11 = 2
            if (r5 > r11) goto L_0x0181
            r12 = 1
            if (r5 == r12) goto L_0x013f
            if (r5 != r11) goto L_0x0174
            r5 = 2
        L_0x013f:
            r11 = 32
            r9.mo7363b(r11)
            r9.mo7363b(r11)
            int r11 = r9.mo7362a(r4)
            int r11 = r11 + r12
            r9.mo7363b(r12)
            if (r5 != r12) goto L_0x0169
            if (r3 == 0) goto L_0x016d
            long r4 = (long) r7
            double r4 = (double) r4
            long r12 = (long) r3
            double r12 = (double) r12
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r12)
            double r14 = r14 / r12
            double r3 = java.lang.Math.pow(r4, r14)
            double r3 = java.lang.Math.floor(r3)
            long r3 = (long) r3
            r18 = r3
            goto L_0x016d
        L_0x0169:
            long r4 = (long) r7
            long r12 = (long) r3
            long r18 = r4 * r12
        L_0x016d:
            long r3 = (long) r11
            long r3 = r3 * r18
            int r4 = (int) r3
            r9.mo7363b(r4)
        L_0x0174:
            int r1 = r1 + 1
            r11 = r21
            r13 = r22
            r4 = 0
            r5 = 4
            r12 = 5
            r14 = 8
            goto L_0x009f
        L_0x0181:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "lookup type greater than 2 not decodable: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r2 = 0
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r2)
            throw r1
        L_0x0195:
            r2 = 0
            int r1 = r9.f10187a
            int r3 = r9.f10188b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "expected code book to start with [0x56, 0x43, 0x42] at "
            r4.<init>(r5)
            r5 = 8
            int r1 = r1 * 8
            int r1 = r1 + r3
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r2)
            throw r1
        L_0x01b2:
            r21 = r11
            r1 = 6
            int r4 = r9.mo7362a(r1)
            r5 = 1
            int r4 = r4 + r5
            r5 = 0
        L_0x01bc:
            if (r5 >= r4) goto L_0x01cf
            int r7 = r9.mo7362a(r3)
            if (r7 != 0) goto L_0x01c7
            int r5 = r5 + 1
            goto L_0x01bc
        L_0x01c7:
            java.lang.String r1 = "placeholder of time domain transforms not zeroed out"
            r2 = 0
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r2)
            throw r1
        L_0x01cf:
            int r4 = r9.mo7362a(r1)
            r5 = 1
            int r4 = r4 + r5
            r7 = 0
        L_0x01d6:
            r11 = 3
            if (r7 >= r4) goto L_0x0293
            int r12 = r9.mo7362a(r3)
            if (r12 == 0) goto L_0x0263
            if (r12 != r5) goto L_0x024f
            r5 = 5
            int r12 = r9.mo7362a(r5)
            int[] r5 = new int[r12]
            r13 = 0
            r14 = -1
        L_0x01ea:
            if (r13 >= r12) goto L_0x01fc
            r15 = 4
            int r1 = r9.mo7362a(r15)
            r5[r13] = r1
            if (r1 <= r14) goto L_0x01f6
            r14 = r1
        L_0x01f6:
            int r13 = r13 + 1
            r1 = 6
            r15 = 24
            goto L_0x01ea
        L_0x01fc:
            int r14 = r14 + 1
            int[] r1 = new int[r14]
            r13 = 0
        L_0x0201:
            if (r13 >= r14) goto L_0x0231
            int r15 = r9.mo7362a(r11)
            r22 = 1
            int r15 = r15 + 1
            r1[r13] = r15
            r15 = 2
            int r23 = r9.mo7362a(r15)
            if (r23 <= 0) goto L_0x021a
            r15 = 8
            r9.mo7363b(r15)
            goto L_0x021c
        L_0x021a:
            r15 = 8
        L_0x021c:
            r11 = 0
        L_0x021d:
            int r3 = r22 << r23
            if (r11 >= r3) goto L_0x022b
            r9.mo7363b(r15)
            int r11 = r11 + 1
            r15 = 8
            r22 = 1
            goto L_0x021d
        L_0x022b:
            int r13 = r13 + 1
            r3 = 16
            r11 = 3
            goto L_0x0201
        L_0x0231:
            r3 = 2
            r9.mo7363b(r3)
            r3 = 4
            int r11 = r9.mo7362a(r3)
            r3 = 0
            r13 = 0
            r14 = 0
        L_0x023d:
            if (r3 >= r12) goto L_0x0289
            r15 = r5[r3]
            r15 = r1[r15]
            int r13 = r13 + r15
        L_0x0244:
            if (r14 >= r13) goto L_0x024c
            r9.mo7363b(r11)
            int r14 = r14 + 1
            goto L_0x0244
        L_0x024c:
            int r3 = r3 + 1
            goto L_0x023d
        L_0x024f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "floor type greater than 1 not decodable: "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r2 = 0
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r2)
            throw r1
        L_0x0263:
            r1 = 8
            r9.mo7363b(r1)
            r3 = 16
            r9.mo7363b(r3)
            r9.mo7363b(r3)
            r3 = 6
            r9.mo7363b(r3)
            r9.mo7363b(r1)
            r3 = 4
            int r5 = r9.mo7362a(r3)
            r3 = 1
            int r5 = r5 + r3
            r3 = 0
        L_0x027f:
            if (r3 >= r5) goto L_0x0289
            r9.mo7363b(r1)
            int r3 = r3 + 1
            r1 = 8
            goto L_0x027f
        L_0x0289:
            int r7 = r7 + 1
            r1 = 6
            r3 = 16
            r5 = 1
            r15 = 24
            goto L_0x01d6
        L_0x0293:
            int r3 = r9.mo7362a(r1)
            r4 = 1
            int r3 = r3 + r4
            r5 = 0
        L_0x029a:
            if (r5 >= r3) goto L_0x0308
            r7 = 16
            int r11 = r9.mo7362a(r7)
            r7 = 2
            if (r11 > r7) goto L_0x0300
            r7 = 24
            r9.mo7363b(r7)
            r9.mo7363b(r7)
            r9.mo7363b(r7)
            int r11 = r9.mo7362a(r1)
            int r11 = r11 + r4
            r1 = 8
            r9.mo7363b(r1)
            int[] r4 = new int[r11]
            r12 = 0
        L_0x02bd:
            if (r12 >= r11) goto L_0x02dc
            r13 = 3
            int r14 = r9.mo7362a(r13)
            boolean r15 = r9.mo7364c()
            if (r15 == 0) goto L_0x02d0
            r15 = 5
            int r18 = r9.mo7362a(r15)
            goto L_0x02d3
        L_0x02d0:
            r15 = 5
            r18 = 0
        L_0x02d3:
            int r18 = r18 * 8
            int r18 = r18 + r14
            r4[r12] = r18
            int r12 = r12 + 1
            goto L_0x02bd
        L_0x02dc:
            r13 = 3
            r15 = 5
            r12 = 0
        L_0x02df:
            if (r12 >= r11) goto L_0x02fb
            r14 = 0
        L_0x02e2:
            if (r14 >= r1) goto L_0x02f6
            r18 = r4[r12]
            r20 = 1
            int r22 = r20 << r14
            r18 = r18 & r22
            if (r18 == 0) goto L_0x02f1
            r9.mo7363b(r1)
        L_0x02f1:
            int r14 = r14 + 1
            r1 = 8
            goto L_0x02e2
        L_0x02f6:
            int r12 = r12 + 1
            r1 = 8
            goto L_0x02df
        L_0x02fb:
            int r5 = r5 + 1
            r1 = 6
            r4 = 1
            goto L_0x029a
        L_0x0300:
            java.lang.String r1 = "residueType greater than 2 is not decodable"
            r2 = 0
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r2)
            throw r1
        L_0x0308:
            int r3 = r9.mo7362a(r1)
            r1 = 1
            int r3 = r3 + r1
            r1 = 0
        L_0x030f:
            if (r1 >= r3) goto L_0x0393
            r4 = 16
            int r5 = r9.mo7362a(r4)
            if (r5 == 0) goto L_0x032f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "mapping type other than 0 not supported: "
            r4.<init>(r7)
            r4.append(r5)
            java.lang.String r5 = "VorbisUtil"
            java.lang.String r4 = r4.toString()
            androidx.media3.common.p136b.C2633u.m7048c(r5, r4)
            r4 = 2
            r11 = 4
            goto L_0x0388
        L_0x032f:
            boolean r4 = r9.mo7364c()
            if (r4 == 0) goto L_0x033d
            r4 = 4
            int r5 = r9.mo7362a(r4)
            r4 = 1
            int r5 = r5 + r4
            goto L_0x033f
        L_0x033d:
            r4 = 1
            r5 = 1
        L_0x033f:
            boolean r7 = r9.mo7364c()
            if (r7 == 0) goto L_0x0362
            r7 = 8
            int r11 = r9.mo7362a(r7)
            int r11 = r11 + r4
            r4 = 0
        L_0x034d:
            if (r4 >= r11) goto L_0x0362
            int r7 = r10 + -1
            int r12 = androidx.media3.extractor.C3374bl.m9758a(r7)
            r9.mo7363b(r12)
            int r7 = androidx.media3.extractor.C3374bl.m9758a(r7)
            r9.mo7363b(r7)
            int r4 = r4 + 1
            goto L_0x034d
        L_0x0362:
            r4 = 2
            int r7 = r9.mo7362a(r4)
            if (r7 != 0) goto L_0x038b
            r7 = 1
            if (r5 <= r7) goto L_0x0376
            r7 = 0
        L_0x036d:
            if (r7 >= r10) goto L_0x0376
            r11 = 4
            r9.mo7363b(r11)
            int r7 = r7 + 1
            goto L_0x036d
        L_0x0376:
            r11 = 4
            r7 = 0
        L_0x0378:
            if (r7 >= r5) goto L_0x0388
            r12 = 8
            r9.mo7363b(r12)
            r9.mo7363b(r12)
            r9.mo7363b(r12)
            int r7 = r7 + 1
            goto L_0x0378
        L_0x0388:
            int r1 = r1 + 1
            goto L_0x030f
        L_0x038b:
            java.lang.String r1 = "to reserved bits must be zero after mapping coupling steps"
            r2 = 0
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r2)
            throw r1
        L_0x0393:
            r1 = 6
            int r1 = r9.mo7362a(r1)
            r3 = 1
            int r1 = r1 + r3
            androidx.media3.extractor.bj[] r3 = new androidx.media3.extractor.C3372bj[r1]
            r4 = 0
        L_0x039d:
            if (r4 >= r1) goto L_0x03ba
            boolean r5 = r9.mo7364c()
            r7 = 16
            r9.mo7362a(r7)
            r9.mo7362a(r7)
            r10 = 8
            r9.mo7362a(r10)
            androidx.media3.extractor.bj r11 = new androidx.media3.extractor.bj
            r11.<init>(r5)
            r3[r4] = r11
            int r4 = r4 + 1
            goto L_0x039d
        L_0x03ba:
            boolean r4 = r9.mo7364c()
            if (r4 == 0) goto L_0x041a
            androidx.media3.extractor.i.m r4 = new androidx.media3.extractor.i.m
            r5 = -1
            int r1 = r1 + r5
            int r10 = androidx.media3.extractor.C3374bl.m9758a(r1)
            r5 = r4
            r7 = r8
            r8 = r21
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            r7 = r4
        L_0x03d1:
            r0.f10674a = r7
            if (r7 != 0) goto L_0x03d7
            r1 = 1
            return r1
        L_0x03d7:
            androidx.media3.extractor.bk r1 = r7.f10669a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            byte[] r4 = r1.f10199g
            r3.add(r4)
            byte[] r4 = r7.f10671c
            r3.add(r4)
            androidx.media3.extractor.bi r4 = r7.f10670b
            java.lang.String[] r4 = r4.f10191a
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89844l(r4)
            androidx.media3.common.Metadata r4 = androidx.media3.extractor.C3374bl.m9759b(r4)
            androidx.media3.common.w r5 = new androidx.media3.common.w
            r5.<init>()
            java.lang.String r6 = "audio/vorbis"
            r5.f7459k = r6
            int r6 = r1.f10196d
            r5.f7454f = r6
            int r6 = r1.f10195c
            r5.f7455g = r6
            int r6 = r1.f10193a
            r5.f7472x = r6
            int r1 = r1.f10194b
            r5.f7473y = r1
            r5.f7461m = r3
            r5.f7457i = r4
            androidx.media3.common.x r1 = new androidx.media3.common.x
            r1.<init>(r5)
            r2.f10654a = r1
            r1 = 1
            return r1
        L_0x041a:
            java.lang.String r1 = "framing bit after modes not set as expected"
            r2 = 0
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r2)
            goto L_0x0423
        L_0x0422:
            throw r1
        L_0x0423:
            goto L_0x0422
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p162i.C3454n.mo7405c(androidx.media3.common.b.ac, long, androidx.media3.extractor.i.j):boolean");
    }
}
