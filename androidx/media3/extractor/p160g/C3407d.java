package androidx.media3.extractor.p160g;

import androidx.media3.common.C2599az;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3339an;
import androidx.media3.extractor.C3341ap;
import androidx.media3.extractor.C3343ar;
import androidx.media3.extractor.C3344as;
import androidx.media3.extractor.C3350ay;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.C3627q;
import androidx.media3.extractor.C3636z;
import androidx.media3.extractor.metadata.id3.C3603g;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import java.io.EOFException;

/* renamed from: androidx.media3.extractor.g.d */
/* compiled from: PG */
public final class C3407d implements C3326aa {

    /* renamed from: a */
    public boolean f10423a;

    /* renamed from: b */
    private final int f10424b;

    /* renamed from: c */
    private final long f10425c;

    /* renamed from: d */
    private final C2604ac f10426d;

    /* renamed from: e */
    private final C3343ar f10427e;

    /* renamed from: f */
    private final C3339an f10428f;

    /* renamed from: g */
    private final C3341ap f10429g;

    /* renamed from: h */
    private final C3368bf f10430h;

    /* renamed from: i */
    private C3329ad f10431i;

    /* renamed from: j */
    private C3368bf f10432j;

    /* renamed from: k */
    private C3368bf f10433k;

    /* renamed from: l */
    private int f10434l;

    /* renamed from: m */
    private Metadata f10435m;

    /* renamed from: n */
    private long f10436n;

    /* renamed from: o */
    private long f10437o;

    /* renamed from: p */
    private long f10438p;

    /* renamed from: q */
    private int f10439q;

    /* renamed from: r */
    private C3409f f10440r;

    public C3407d() {
        this(0, -9223372036854775807L);
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x023c  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m9860f(androidx.media3.extractor.C3327ab r36) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            int r2 = r0.f10434l
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.m9864j(r1, r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            androidx.media3.extractor.g.f r2 = r0.f10440r
            r10 = 1
            if (r2 != 0) goto L_0x0323
            androidx.media3.common.b.ac r2 = new androidx.media3.common.b.ac
            androidx.media3.extractor.ar r11 = r0.f10427e
            int r11 = r11.f10086c
            r2.<init>((int) r11)
            byte[] r11 = r2.f7234a
            androidx.media3.extractor.ar r12 = r0.f10427e
            int r12 = r12.f10086c
            r13 = r1
            androidx.media3.extractor.q r13 = (androidx.media3.extractor.C3627q) r13
            r13.mo7320o(r11, r4, r12, r4)
            androidx.media3.extractor.ar r11 = r0.f10427e
            int r12 = r11.f10084a
            r12 = r12 & r10
            r14 = 36
            r15 = 21
            if (r12 == 0) goto L_0x003b
            int r11 = r11.f10088e
            if (r11 == r10) goto L_0x0042
            r15 = 36
            goto L_0x0042
        L_0x003b:
            int r11 = r11.f10088e
            if (r11 == r10) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r15 = 13
        L_0x0042:
            int r11 = r2.f7236c
            int r12 = r15 + 4
            r9 = 1483304551(0x58696e67, float:1.02664153E15)
            r5 = 1447187017(0x56425249, float:5.3414667E13)
            r6 = 1231971951(0x496e666f, float:976486.94)
            if (r11 < r12) goto L_0x0060
            r2.mo6131A(r15)
            int r11 = r2.mo6134b()
            if (r11 == r9) goto L_0x0074
            if (r11 != r6) goto L_0x0060
            r11 = 1231971951(0x496e666f, float:976486.94)
            goto L_0x0074
        L_0x0060:
            int r11 = r2.f7236c
            r12 = 40
            if (r11 < r12) goto L_0x0073
            r2.mo6131A(r14)
            int r11 = r2.mo6134b()
            if (r11 != r5) goto L_0x0073
            r11 = 1447187017(0x56425249, float:5.3414667E13)
            goto L_0x0074
        L_0x0073:
            r11 = 0
        L_0x0074:
            java.lang.String r12 = ", "
            r16 = -1
            r18 = 1000000(0xf4240, double:4.940656E-318)
            if (r11 == r9) goto L_0x015b
            if (r11 != r6) goto L_0x0081
            goto L_0x015b
        L_0x0081:
            if (r11 != r5) goto L_0x0154
            long r5 = r13.f11565b
            long r7 = r13.f11566c
            androidx.media3.extractor.ar r9 = r0.f10427e
            int r11 = r2.f7235b
            int r11 = r11 + 10
            r2.mo6131A(r11)
            int r11 = r2.mo6134b()
            if (r11 > 0) goto L_0x009a
            r8 = r13
            r2 = 0
            goto L_0x014b
        L_0x009a:
            int r15 = r9.f10087d
            long r3 = (long) r11
            r11 = 32000(0x7d00, float:4.4842E-41)
            if (r15 < r11) goto L_0x00a4
            r11 = 1152(0x480, float:1.614E-42)
            goto L_0x00a6
        L_0x00a4:
            r11 = 576(0x240, float:8.07E-43)
        L_0x00a6:
            long r10 = (long) r11
            long r22 = r10 * r18
            long r10 = (long) r15
            r20 = r3
            r24 = r10
            long r29 = androidx.media3.common.p136b.C2612ak.m7000y(r20, r22, r24)
            int r3 = r2.mo6142j()
            int r4 = r2.mo6142j()
            int r10 = r2.mo6142j()
            int r11 = r2.f7235b
            r15 = 2
            int r11 = r11 + r15
            r2.mo6131A(r11)
            int r9 = r9.f10086c
            long r14 = (long) r9
            long r14 = r14 + r7
            long[] r9 = new long[r3]
            long[] r11 = new long[r3]
            r0 = r7
            r7 = 0
        L_0x00cf:
            if (r7 >= r3) goto L_0x0112
            r21 = r12
            r8 = r13
            long r12 = (long) r7
            long r12 = r12 * r29
            r22 = r5
            long r5 = (long) r3
            long r12 = r12 / r5
            r9[r7] = r12
            long r5 = java.lang.Math.max(r0, r14)
            r11[r7] = r5
            r5 = 1
            if (r10 == r5) goto L_0x0100
            r5 = 2
            if (r10 == r5) goto L_0x00fb
            r6 = 3
            if (r10 == r6) goto L_0x00f6
            r6 = 4
            if (r10 == r6) goto L_0x00f1
            r2 = 0
            goto L_0x0149
        L_0x00f1:
            int r6 = r2.mo6141i()
            goto L_0x0105
        L_0x00f6:
            int r6 = r2.mo6140h()
            goto L_0x0105
        L_0x00fb:
            int r6 = r2.mo6142j()
            goto L_0x0105
        L_0x0100:
            r5 = 2
            int r6 = r2.mo6139g()
        L_0x0105:
            long r12 = (long) r6
            long r5 = (long) r4
            long r12 = r12 * r5
            long r0 = r0 + r12
            int r7 = r7 + 1
            r13 = r8
            r12 = r21
            r5 = r22
            goto L_0x00cf
        L_0x0112:
            r22 = r5
            r21 = r12
            r8 = r13
            int r2 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x013c
            int r2 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x013c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "VBRI data size mismatch: "
            r2.<init>(r3)
            r3 = r22
            r2.append(r3)
            r3 = r21
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = "VbriSeeker"
            java.lang.String r2 = r2.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r3, r2)
        L_0x013c:
            androidx.media3.extractor.g.g r2 = new androidx.media3.extractor.g.g
            r26 = r2
            r27 = r9
            r28 = r11
            r31 = r0
            r26.<init>(r27, r28, r29, r31)
        L_0x0149:
            r0 = r35
        L_0x014b:
            androidx.media3.extractor.ar r1 = r0.f10427e
            int r1 = r1.f10086c
            r8.mo7639q(r1)
            goto L_0x0236
        L_0x0154:
            r8 = r13
            r1 = 0
            r8.f11568e = r1
            r2 = 0
            goto L_0x0236
        L_0x015b:
            r3 = r12
            r8 = r13
            long r4 = r8.f11565b
            long r9 = r8.f11566c
            androidx.media3.extractor.ar r1 = r0.f10427e
            int r7 = r1.f10090g
            int r12 = r1.f10087d
            int r13 = r2.mo6134b()
            r14 = r13 & 1
            r6 = 1
            if (r14 != r6) goto L_0x01e6
            int r6 = r2.mo6141i()
            if (r6 != 0) goto L_0x0178
            goto L_0x01e6
        L_0x0178:
            r22 = r15
            long r14 = (long) r6
            long r6 = (long) r7
            long r28 = r6 * r18
            long r6 = (long) r12
            r26 = r14
            r30 = r6
            long r30 = androidx.media3.common.p136b.C2612ak.m7000y(r26, r28, r30)
            r6 = 6
            r7 = r13 & 6
            if (r7 == r6) goto L_0x019e
            androidx.media3.extractor.g.h r2 = new androidx.media3.extractor.g.h
            int r1 = r1.f10086c
            r32 = -1
            r34 = 0
            r26 = r2
            r27 = r9
            r29 = r1
            r26.<init>(r27, r29, r30, r32, r34)
            goto L_0x01e9
        L_0x019e:
            long r32 = r2.mo6146n()
            r6 = 100
            long[] r7 = new long[r6]
            r12 = 0
        L_0x01a7:
            if (r12 >= r6) goto L_0x01b3
            int r13 = r2.mo6139g()
            long r13 = (long) r13
            r7[r12] = r13
            int r12 = r12 + 1
            goto L_0x01a7
        L_0x01b3:
            int r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x01d6
            long r12 = r9 + r32
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x01d6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "XING data size mismatch: "
            r2.<init>(r6)
            r2.append(r4)
            r2.append(r3)
            r2.append(r12)
            java.lang.String r3 = "XingSeeker"
            java.lang.String r2 = r2.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r3, r2)
        L_0x01d6:
            androidx.media3.extractor.g.h r2 = new androidx.media3.extractor.g.h
            int r1 = r1.f10086c
            r26 = r2
            r27 = r9
            r29 = r1
            r34 = r7
            r26.<init>(r27, r29, r30, r32, r34)
            goto L_0x01e9
        L_0x01e6:
            r22 = r15
            r2 = 0
        L_0x01e9:
            if (r2 == 0) goto L_0x021e
            androidx.media3.extractor.an r1 = r0.f10428f
            boolean r1 = r1.mo7332a()
            if (r1 != 0) goto L_0x021e
            r1 = 0
            r8.f11568e = r1
            r15 = r22
            int r15 = r15 + 141
            r8.mo7319n(r15, r1)
            androidx.media3.common.b.ac r3 = r0.f10426d
            byte[] r3 = r3.f7234a
            r4 = 3
            r8.mo7320o(r3, r1, r4, r1)
            androidx.media3.common.b.ac r3 = r0.f10426d
            r3.mo6131A(r1)
            androidx.media3.extractor.an r1 = r0.f10428f
            androidx.media3.common.b.ac r3 = r0.f10426d
            int r3 = r3.mo6140h()
            int r4 = r3 >> 12
            r3 = r3 & 4095(0xfff, float:5.738E-42)
            if (r4 > 0) goto L_0x021a
            if (r3 <= 0) goto L_0x021e
        L_0x021a:
            r1.f10073a = r4
            r1.f10074b = r3
        L_0x021e:
            androidx.media3.extractor.ar r1 = r0.f10427e
            int r1 = r1.f10086c
            r8.mo7639q(r1)
            if (r2 == 0) goto L_0x0236
            boolean r1 = r2.mo7326t()
            if (r1 != 0) goto L_0x0236
            r1 = 1231971951(0x496e666f, float:976486.94)
            if (r11 != r1) goto L_0x0236
            androidx.media3.extractor.g.f r2 = r35.m9865k(r36)
        L_0x0236:
            androidx.media3.common.Metadata r1 = r0.f10435m
            long r3 = r8.f11566c
            if (r1 == 0) goto L_0x02bc
            androidx.media3.common.Metadata$Entry[] r5 = r1.f7056a
            int r5 = r5.length
            r6 = 0
        L_0x0240:
            if (r6 >= r5) goto L_0x02bc
            androidx.media3.common.Metadata$Entry[] r7 = r1.f7056a
            r9 = r7[r6]
            boolean r10 = r9 instanceof androidx.media3.extractor.metadata.id3.MlltFrame
            if (r10 == 0) goto L_0x02b7
            androidx.media3.extractor.metadata.id3.MlltFrame r9 = (androidx.media3.extractor.metadata.id3.MlltFrame) r9
            int r5 = r7.length
            r6 = 0
        L_0x024e:
            if (r6 >= r5) goto L_0x0272
            androidx.media3.common.Metadata$Entry[] r7 = r1.f7056a
            r7 = r7[r6]
            boolean r10 = r7 instanceof androidx.media3.extractor.metadata.id3.TextInformationFrame
            if (r10 == 0) goto L_0x026f
            androidx.media3.extractor.metadata.id3.TextInformationFrame r7 = (androidx.media3.extractor.metadata.id3.TextInformationFrame) r7
            java.lang.String r10 = r7.f11481f
            java.lang.String r11 = "TLEN"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x026f
            java.lang.String r1 = r7.f11493b
            long r5 = java.lang.Long.parseLong(r1)
            long r5 = androidx.media3.common.p136b.C2612ak.m6998w(r5)
            goto L_0x0277
        L_0x026f:
            int r6 = r6 + 1
            goto L_0x024e
        L_0x0272:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0277:
            int[] r1 = r9.f11488d
            int r1 = r1.length
            int r7 = r1 + 1
            long[] r10 = new long[r7]
            long[] r7 = new long[r7]
            r11 = 0
            r10[r11] = r3
            r12 = 0
            r7[r11] = r12
            r11 = 1
            r12 = 0
        L_0x028a:
            if (r11 > r1) goto L_0x02af
            int r14 = r11 + -1
            int r15 = r9.f11486b
            r16 = r1
            int[] r1 = r9.f11488d
            r1 = r1[r14]
            int r15 = r15 + r1
            r17 = r2
            long r1 = (long) r15
            long r3 = r3 + r1
            int r1 = r9.f11487c
            int[] r2 = r9.f11489e
            r2 = r2[r14]
            int r1 = r1 + r2
            long r1 = (long) r1
            long r12 = r12 + r1
            r10[r11] = r3
            r7[r11] = r12
            int r11 = r11 + 1
            r1 = r16
            r2 = r17
            goto L_0x028a
        L_0x02af:
            r17 = r2
            androidx.media3.extractor.g.c r1 = new androidx.media3.extractor.g.c
            r1.<init>(r10, r7, r5)
            goto L_0x02bf
        L_0x02b7:
            r17 = r2
            int r6 = r6 + 1
            goto L_0x0240
        L_0x02bc:
            r17 = r2
            r1 = 0
        L_0x02bf:
            boolean r2 = r0.f10423a
            if (r2 == 0) goto L_0x02c9
            androidx.media3.extractor.g.e r1 = new androidx.media3.extractor.g.e
            r1.<init>()
            goto L_0x02e6
        L_0x02c9:
            if (r1 == 0) goto L_0x02cd
            r2 = r1
            goto L_0x02d3
        L_0x02cd:
            if (r17 != 0) goto L_0x02d1
            r2 = 0
            goto L_0x02d3
        L_0x02d1:
            r2 = r17
        L_0x02d3:
            if (r2 == 0) goto L_0x02e2
            boolean r1 = r2.mo7326t()
            if (r1 != 0) goto L_0x02e0
            int r1 = r0.f10424b
            if (r1 == 0) goto L_0x02e0
            goto L_0x02e2
        L_0x02e0:
            r1 = r2
            goto L_0x02e6
        L_0x02e2:
            androidx.media3.extractor.g.f r1 = r35.m9865k(r36)
        L_0x02e6:
            r0.f10440r = r1
            androidx.media3.extractor.ad r2 = r0.f10431i
            r2.mo6989q(r1)
            androidx.media3.extractor.bf r1 = r0.f10433k
            androidx.media3.common.w r2 = new androidx.media3.common.w
            r2.<init>()
            androidx.media3.extractor.ar r3 = r0.f10427e
            java.lang.String r4 = r3.f10085b
            r2.f7459k = r4
            r4 = 4096(0x1000, float:5.74E-42)
            r2.f7460l = r4
            int r4 = r3.f10088e
            r2.f7472x = r4
            int r3 = r3.f10087d
            r2.f7473y = r3
            androidx.media3.extractor.an r3 = r0.f10428f
            int r4 = r3.f10073a
            r2.f7445A = r4
            int r3 = r3.f10074b
            r2.f7446B = r3
            androidx.media3.common.Metadata r3 = r0.f10435m
            r2.f7457i = r3
            androidx.media3.common.x r3 = new androidx.media3.common.x
            r3.<init>(r2)
            r1.mo6850b(r3)
            long r1 = r8.f11566c
            r0.f10438p = r1
            r3 = r36
            goto L_0x033b
        L_0x0323:
            long r1 = r0.f10438p
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = r36
            if (r5 == 0) goto L_0x033b
            r4 = r3
            androidx.media3.extractor.q r4 = (androidx.media3.extractor.C3627q) r4
            long r5 = r4.f11566c
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x033b
            long r1 = r1 - r5
            int r2 = (int) r1
            r4.mo7639q(r2)
        L_0x033b:
            int r1 = r0.f10439q
            if (r1 != 0) goto L_0x03bc
            r1 = r3
            androidx.media3.extractor.q r1 = (androidx.media3.extractor.C3627q) r1
            r2 = 0
            r1.f11568e = r2
            boolean r4 = r35.m9863i(r36)
            if (r4 == 0) goto L_0x034d
            goto L_0x03c6
        L_0x034d:
            androidx.media3.common.b.ac r4 = r0.f10426d
            r4.mo6131A(r2)
            androidx.media3.common.b.ac r2 = r0.f10426d
            int r2 = r2.mo6134b()
            int r4 = r0.f10434l
            long r4 = (long) r4
            boolean r4 = m9862h(r2, r4)
            if (r4 == 0) goto L_0x03b4
            int r4 = androidx.media3.extractor.C3344as.m9688a(r2)
            r5 = -1
            if (r4 != r5) goto L_0x0369
            goto L_0x03b4
        L_0x0369:
            androidx.media3.extractor.ar r4 = r0.f10427e
            r4.mo7335a(r2)
            long r4 = r0.f10436n
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0399
            androidx.media3.extractor.g.f r2 = r0.f10440r
            long r4 = r1.f11566c
            long r1 = r2.mo7378f(r4)
            r0.f10436n = r1
            long r1 = r0.f10425c
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0399
            androidx.media3.extractor.g.f r1 = r0.f10440r
            r4 = 0
            long r1 = r1.mo7378f(r4)
            long r4 = r0.f10436n
            long r6 = r0.f10425c
            long r6 = r6 - r1
            long r4 = r4 + r6
            r0.f10436n = r4
        L_0x0399:
            androidx.media3.extractor.ar r1 = r0.f10427e
            int r2 = r1.f10086c
            r0.f10439q = r2
            androidx.media3.extractor.g.f r4 = r0.f10440r
            boolean r5 = r4 instanceof androidx.media3.extractor.p160g.C3405b
            if (r5 != 0) goto L_0x03a7
            r1 = r2
            goto L_0x03bc
        L_0x03a7:
            androidx.media3.extractor.g.b r4 = (androidx.media3.extractor.p160g.C3405b) r4
            long r2 = r0.f10437o
            int r1 = r1.f10090g
            long r4 = (long) r1
            long r2 = r2 + r4
            r0.m9861g(r2)
            r1 = 0
            throw r1
        L_0x03b4:
            r2 = 1
            r1.mo7639q(r2)
            r1 = 0
            r0.f10434l = r1
            goto L_0x03cf
        L_0x03bc:
            r2 = 1
            androidx.media3.extractor.bf r4 = r0.f10433k
            int r1 = r4.mo6849a(r3, r1, r2)
            r2 = -1
            if (r1 != r2) goto L_0x03c8
        L_0x03c6:
            r3 = -1
            goto L_0x03d0
        L_0x03c8:
            int r2 = r0.f10439q
            int r2 = r2 - r1
            r0.f10439q = r2
            if (r2 <= 0) goto L_0x03d1
        L_0x03cf:
            r3 = 0
        L_0x03d0:
            return r3
        L_0x03d1:
            androidx.media3.extractor.bf r4 = r0.f10433k
            long r1 = r0.f10437o
            long r5 = r0.m9861g(r1)
            r7 = 1
            androidx.media3.extractor.ar r1 = r0.f10427e
            int r8 = r1.f10086c
            r9 = 0
            r10 = 0
            r4.mo6852d(r5, r7, r8, r9, r10)
            long r1 = r0.f10437o
            androidx.media3.extractor.ar r3 = r0.f10427e
            int r3 = r3.f10090g
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.f10437o = r1
            r1 = 0
            r0.f10439q = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p160g.C3407d.m9860f(androidx.media3.extractor.ab):int");
    }

    /* renamed from: g */
    private final long m9861g(long j) {
        return this.f10436n + ((j * 1000000) / ((long) this.f10427e.f10087d));
    }

    /* renamed from: h */
    private static boolean m9862h(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* renamed from: i */
    private final boolean m9863i(C3327ab abVar) {
        C3409f fVar = this.f10440r;
        if (fVar != null) {
            long e = fVar.mo7377e();
            if (e != -1 && abVar.mo7312e() > e - 4) {
                return true;
            }
        }
        try {
            return !abVar.mo7320o(this.f10426d.f7234a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* renamed from: j */
    private final boolean m9864j(C3327ab abVar, boolean z) {
        int i;
        int i2;
        int a;
        int i3 = true != z ? C89885b.S3REQUEST_VALUE : 32768;
        C3627q qVar = (C3627q) abVar;
        qVar.f11568e = 0;
        if (qVar.f11566c == 0) {
            Metadata a2 = this.f10429g.mo7334a(abVar, (C3603g) null);
            this.f10435m = a2;
            if (a2 != null) {
                this.f10428f.mo7333b(a2);
            }
            i = (int) abVar.mo7312e();
            if (!z) {
                qVar.mo7639q(i);
            }
            i2 = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!m9863i(abVar)) {
                this.f10426d.mo6131A(0);
                int b = this.f10426d.mo6134b();
                if ((i2 == 0 || m9862h(b, (long) i2)) && (a = C3344as.m9688a(b)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.f10427e.mo7335a(b);
                        i2 = b;
                    }
                    qVar.mo7319n(a - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 != i3) {
                        if (z) {
                            qVar.f11568e = 0;
                            qVar.mo7319n(i + i6, false);
                        } else {
                            qVar.mo7639q(1);
                        }
                        i5 = i6;
                        i2 = 0;
                        i4 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw C2599az.m6819a("Searched too many bytes.", (Throwable) null);
                    }
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            qVar.mo7639q(i + i5);
        } else {
            qVar.f11568e = 0;
        }
        this.f10434l = i2;
        return true;
    }

    /* renamed from: k */
    private final C3409f m9865k(C3327ab abVar) {
        C3627q qVar = (C3627q) abVar;
        qVar.mo7320o(this.f10426d.f7234a, 0, 4, false);
        this.f10426d.mo6131A(0);
        this.f10427e.mo7335a(this.f10426d.mo6134b());
        return new C3404a(qVar.f11565b, qVar.f11566c, this.f10427e);
    }

    /* renamed from: a */
    public final int mo7152a(C3327ab abVar, C3350ay ayVar) {
        C2601a.m6829a(this.f10432j);
        int i = C2612ak.f7249a;
        int f = m9860f(abVar);
        if (f != -1) {
            return f;
        }
        if (this.f10440r instanceof C3405b) {
            if (this.f10440r.mo7325r() != m9861g(this.f10437o)) {
                C3405b bVar = (C3405b) this.f10440r;
                throw null;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final void mo7153c() {
    }

    /* renamed from: d */
    public final void mo7154d(long j, long j2) {
        this.f10434l = 0;
        this.f10436n = -9223372036854775807L;
        this.f10437o = 0;
        this.f10439q = 0;
        C3409f fVar = this.f10440r;
        if (fVar instanceof C3405b) {
            C3405b bVar = (C3405b) fVar;
            throw null;
        }
    }

    /* renamed from: e */
    public final boolean mo7155e(C3327ab abVar) {
        return m9864j(abVar, true);
    }

    /* renamed from: s */
    public final void mo7156s(C3329ad adVar) {
        this.f10431i = adVar;
        C3368bf eZ = adVar.mo6987eZ(0, 1);
        this.f10432j = eZ;
        this.f10433k = eZ;
        this.f10431i.mo6988fa();
    }

    public C3407d(int i, long j) {
        this.f10424b = i;
        this.f10425c = j;
        this.f10426d = new C2604ac(10);
        this.f10427e = new C3343ar();
        this.f10428f = new C3339an();
        this.f10436n = -9223372036854775807L;
        this.f10429g = new C3341ap();
        C3636z zVar = new C3636z();
        this.f10430h = zVar;
        this.f10433k = zVar;
    }
}
