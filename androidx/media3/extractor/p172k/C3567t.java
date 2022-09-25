package androidx.media3.extractor.p172k;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3347av;
import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.extractor.k.t */
/* compiled from: PG */
public final class C3567t implements C3557j {

    /* renamed from: a */
    private final C3535ah f11305a;

    /* renamed from: b */
    private String f11306b;

    /* renamed from: c */
    private C3368bf f11307c;

    /* renamed from: d */
    private C3566s f11308d;

    /* renamed from: e */
    private boolean f11309e;

    /* renamed from: f */
    private final boolean[] f11310f = new boolean[3];

    /* renamed from: g */
    private final C3571x f11311g = new C3571x(32);

    /* renamed from: h */
    private final C3571x f11312h = new C3571x(33);

    /* renamed from: i */
    private final C3571x f11313i = new C3571x(34);

    /* renamed from: j */
    private final C3571x f11314j = new C3571x(39);

    /* renamed from: k */
    private final C3571x f11315k = new C3571x(40);

    /* renamed from: l */
    private long f11316l;

    /* renamed from: m */
    private long f11317m = -9223372036854775807L;

    /* renamed from: n */
    private final C2604ac f11318n = new C2604ac();

    public C3567t(C3535ah ahVar) {
        this.f11305a = ahVar;
    }

    /* renamed from: f */
    private final void m10311f(byte[] bArr, int i, int i2) {
        C3566s sVar = this.f11308d;
        if (sVar.f11296e) {
            int i3 = sVar.f11294c;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                sVar.f11297f = (bArr[i4] & 128) != 0;
                sVar.f11296e = false;
            } else {
                sVar.f11294c = i3 + (i2 - i);
            }
        }
        if (!this.f11309e) {
            this.f11311g.mo7480a(bArr, i, i2);
            this.f11312h.mo7480a(bArr, i, i2);
            this.f11313i.mo7480a(bArr, i, i2);
        }
        this.f11314j.mo7480a(bArr, i, i2);
        this.f11315k.mo7480a(bArr, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:167:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x040c  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0430 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7466a(androidx.media3.common.p136b.C2604ac r34) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            androidx.media3.extractor.bf r2 = r0.f11307c
            androidx.media3.common.p136b.C2601a.m6829a(r2)
            int r2 = androidx.media3.common.p136b.C2612ak.f7249a
        L_0x000b:
            int r2 = r1.f7236c
            int r3 = r1.f7235b
            int r4 = r2 - r3
            if (r4 <= 0) goto L_0x044e
            byte[] r5 = r1.f7234a
            long r6 = r0.f11316l
            long r8 = (long) r4
            long r6 = r6 + r8
            r0.f11316l = r6
            androidx.media3.extractor.bf r6 = r0.f11307c
            r6.mo6851c(r1, r4)
        L_0x0020:
            if (r3 >= r2) goto L_0x044a
            boolean[] r4 = r0.f11310f
            int r4 = androidx.media3.extractor.C3347av.m9692a(r5, r3, r2, r4)
            if (r4 == r2) goto L_0x0444
            int r6 = r4 + 3
            byte r7 = r5[r6]
            r7 = r7 & 126(0x7e, float:1.77E-43)
            r8 = 1
            int r7 = r7 >> r8
            int r9 = r4 - r3
            if (r9 <= 0) goto L_0x0039
            r0.m10311f(r5, r3, r4)
        L_0x0039:
            int r3 = r2 - r4
            long r10 = r0.f11316l
            long r12 = (long) r3
            long r10 = r10 - r12
            r4 = 0
            if (r9 >= 0) goto L_0x0044
            int r9 = -r9
            goto L_0x0045
        L_0x0044:
            r9 = 0
        L_0x0045:
            long r12 = r0.f11317m
            androidx.media3.extractor.k.s r14 = r0.f11308d
            boolean r15 = r0.f11309e
            boolean r8 = r14.f11300i
            if (r8 == 0) goto L_0x005a
            boolean r8 = r14.f11297f
            if (r8 == 0) goto L_0x005a
            boolean r8 = r14.f11293b
            r14.f11303l = r8
            r14.f11300i = r4
            goto L_0x0063
        L_0x005a:
            boolean r8 = r14.f11298g
            if (r8 != 0) goto L_0x0065
            boolean r8 = r14.f11297f
            if (r8 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r8 = r5
            goto L_0x0086
        L_0x0065:
            if (r15 == 0) goto L_0x0076
            boolean r8 = r14.f11299h
            if (r8 == 0) goto L_0x0076
            r8 = r5
            long r4 = r14.f11292a
            long r4 = r10 - r4
            int r5 = (int) r4
            int r5 = r5 + r3
            r14.mo7479a(r5)
            goto L_0x0077
        L_0x0076:
            r8 = r5
        L_0x0077:
            long r4 = r14.f11292a
            r14.f11301j = r4
            long r4 = r14.f11295d
            r14.f11302k = r4
            boolean r4 = r14.f11293b
            r14.f11303l = r4
            r4 = 1
            r14.f11299h = r4
        L_0x0086:
            boolean r4 = r0.f11309e
            if (r4 != 0) goto L_0x0351
            androidx.media3.extractor.k.x r4 = r0.f11311g
            r4.mo7483d(r9)
            androidx.media3.extractor.k.x r4 = r0.f11312h
            r4.mo7483d(r9)
            androidx.media3.extractor.k.x r4 = r0.f11313i
            r4.mo7483d(r9)
            androidx.media3.extractor.k.x r4 = r0.f11311g
            boolean r14 = r4.f11358a
            if (r14 == 0) goto L_0x0351
            androidx.media3.extractor.k.x r14 = r0.f11312h
            boolean r5 = r14.f11358a
            if (r5 == 0) goto L_0x0351
            androidx.media3.extractor.k.x r5 = r0.f11313i
            boolean r15 = r5.f11358a
            if (r15 == 0) goto L_0x0351
            androidx.media3.extractor.bf r15 = r0.f11307c
            java.lang.String r1 = r0.f11306b
            r17 = r6
            int r6 = r4.f11360c
            r18 = r2
            int r2 = r14.f11360c
            int r2 = r2 + r6
            r19 = r8
            int r8 = r5.f11360c
            int r2 = r2 + r8
            byte[] r2 = new byte[r2]
            byte[] r8 = r4.f11359b
            r20 = r3
            r3 = 0
            java.lang.System.arraycopy(r8, r3, r2, r3, r6)
            byte[] r6 = r14.f11359b
            int r8 = r4.f11360c
            r16 = r7
            int r7 = r14.f11360c
            java.lang.System.arraycopy(r6, r3, r2, r8, r7)
            byte[] r6 = r5.f11359b
            int r4 = r4.f11360c
            int r7 = r14.f11360c
            int r4 = r4 + r7
            int r5 = r5.f11360c
            java.lang.System.arraycopy(r6, r3, r2, r4, r5)
            androidx.media3.extractor.ax r4 = new androidx.media3.extractor.ax
            byte[] r5 = r14.f11359b
            int r6 = r14.f11360c
            r4.<init>(r5, r3, r6)
            r5 = 44
            r4.mo7341f(r5)
            r5 = 3
            int r6 = r4.mo7336a(r5)
            r4.mo7340e()
            r7 = 2
            int r21 = r4.mo7336a(r7)
            boolean r22 = r4.mo7344i()
            r8 = 5
            int r23 = r4.mo7336a(r8)
            r8 = 0
            r14 = 32
            r24 = 0
        L_0x0107:
            if (r8 >= r14) goto L_0x011b
            boolean r14 = r4.mo7344i()
            if (r14 == 0) goto L_0x0116
            r14 = 1
            int r25 = r14 << r8
            r14 = r24 | r25
            r24 = r14
        L_0x0116:
            int r8 = r8 + 1
            r14 = 32
            goto L_0x0107
        L_0x011b:
            r8 = 6
            int[] r14 = new int[r8]
            r3 = 0
        L_0x011f:
            r7 = 8
            if (r3 >= r8) goto L_0x012c
            int r7 = r4.mo7336a(r7)
            r14[r3] = r7
            int r3 = r3 + 1
            goto L_0x011f
        L_0x012c:
            int r26 = r4.mo7336a(r7)
            r3 = 0
            r7 = 0
        L_0x0132:
            if (r3 >= r6) goto L_0x0147
            boolean r27 = r4.mo7344i()
            if (r27 == 0) goto L_0x013c
            int r7 = r7 + 89
        L_0x013c:
            boolean r27 = r4.mo7344i()
            if (r27 == 0) goto L_0x0144
            int r7 = r7 + 8
        L_0x0144:
            int r3 = r3 + 1
            goto L_0x0132
        L_0x0147:
            r4.mo7341f(r7)
            if (r6 <= 0) goto L_0x0152
            int r3 = 8 - r6
            int r3 = r3 + r3
            r4.mo7341f(r3)
        L_0x0152:
            r4.mo7337b()
            int r3 = r4.mo7337b()
            if (r3 != r5) goto L_0x015f
            r4.mo7340e()
            r3 = 3
        L_0x015f:
            int r7 = r4.mo7337b()
            int r27 = r4.mo7337b()
            boolean r28 = r4.mo7344i()
            if (r28 == 0) goto L_0x019b
            int r28 = r4.mo7337b()
            int r29 = r4.mo7337b()
            int r30 = r4.mo7337b()
            int r31 = r4.mo7337b()
            r5 = 1
            if (r3 == r5) goto L_0x0189
            r8 = 2
            if (r3 != r8) goto L_0x0186
            r3 = 2
            r8 = 2
            goto L_0x018b
        L_0x0186:
            r8 = r3
            r3 = 1
            goto L_0x018b
        L_0x0189:
            r8 = r3
            r3 = 2
        L_0x018b:
            if (r8 != r5) goto L_0x018f
            r5 = 2
            goto L_0x0190
        L_0x018f:
            r5 = 1
        L_0x0190:
            int r28 = r28 + r29
            int r3 = r3 * r28
            int r7 = r7 - r3
            int r30 = r30 + r31
            int r5 = r5 * r30
            int r27 = r27 - r5
        L_0x019b:
            r4.mo7337b()
            r4.mo7337b()
            int r3 = r4.mo7337b()
            boolean r5 = r4.mo7344i()
            r8 = 1
            if (r8 == r5) goto L_0x01ae
            r5 = r6
            goto L_0x01af
        L_0x01ae:
            r5 = 0
        L_0x01af:
            if (r5 > r6) goto L_0x01bd
            r4.mo7337b()
            r4.mo7337b()
            r4.mo7337b()
            int r5 = r5 + 1
            goto L_0x01af
        L_0x01bd:
            r4.mo7337b()
            r4.mo7337b()
            r4.mo7337b()
            r4.mo7337b()
            r4.mo7337b()
            r4.mo7337b()
            boolean r5 = r4.mo7344i()
            r6 = 4
            if (r5 == 0) goto L_0x0220
            boolean r5 = r4.mo7344i()
            if (r5 == 0) goto L_0x0220
            r5 = 0
        L_0x01dd:
            if (r5 >= r6) goto L_0x0220
            r6 = 6
            r8 = 0
        L_0x01e1:
            if (r8 >= r6) goto L_0x0219
            boolean r29 = r4.mo7344i()
            if (r29 != 0) goto L_0x01f0
            r4.mo7337b()
            r30 = r10
        L_0x01ee:
            r6 = 3
            goto L_0x020f
        L_0x01f0:
            int r29 = r5 + r5
            r28 = 4
            int r29 = r29 + 4
            r30 = r10
            r6 = 1
            int r10 = r6 << r29
            r11 = 64
            int r10 = java.lang.Math.min(r11, r10)
            if (r5 <= r6) goto L_0x0206
            r4.mo7338c()
        L_0x0206:
            r6 = 0
        L_0x0207:
            if (r6 >= r10) goto L_0x01ee
            r4.mo7338c()
            int r6 = r6 + 1
            goto L_0x0207
        L_0x020f:
            if (r5 != r6) goto L_0x0213
            r10 = 3
            goto L_0x0214
        L_0x0213:
            r10 = 1
        L_0x0214:
            int r8 = r8 + r10
            r10 = r30
            r6 = 6
            goto L_0x01e1
        L_0x0219:
            r30 = r10
            r6 = 3
            int r5 = r5 + 1
            r6 = 4
            goto L_0x01dd
        L_0x0220:
            r30 = r10
            r5 = 2
            r4.mo7341f(r5)
            boolean r5 = r4.mo7344i()
            if (r5 == 0) goto L_0x023a
            r5 = 8
            r4.mo7341f(r5)
            r4.mo7337b()
            r4.mo7337b()
            r4.mo7340e()
        L_0x023a:
            int r5 = r4.mo7337b()
            r6 = 0
            r8 = 0
            r10 = 0
        L_0x0241:
            if (r6 >= r5) goto L_0x028e
            if (r6 == 0) goto L_0x0249
            boolean r8 = r4.mo7344i()
        L_0x0249:
            if (r8 == 0) goto L_0x0263
            r4.mo7340e()
            r4.mo7337b()
            r11 = 0
        L_0x0252:
            if (r11 > r10) goto L_0x0260
            boolean r29 = r4.mo7344i()
            if (r29 == 0) goto L_0x025d
            r4.mo7340e()
        L_0x025d:
            int r11 = r11 + 1
            goto L_0x0252
        L_0x0260:
            r32 = r5
            goto L_0x0289
        L_0x0263:
            int r10 = r4.mo7337b()
            int r11 = r4.mo7337b()
            int r29 = r10 + r11
            r32 = r5
            r5 = 0
        L_0x0270:
            if (r5 >= r10) goto L_0x027b
            r4.mo7337b()
            r4.mo7340e()
            int r5 = r5 + 1
            goto L_0x0270
        L_0x027b:
            r5 = 0
        L_0x027c:
            if (r5 >= r11) goto L_0x0287
            r4.mo7337b()
            r4.mo7340e()
            int r5 = r5 + 1
            goto L_0x027c
        L_0x0287:
            r10 = r29
        L_0x0289:
            int r6 = r6 + 1
            r5 = r32
            goto L_0x0241
        L_0x028e:
            boolean r5 = r4.mo7344i()
            if (r5 == 0) goto L_0x02a4
            r5 = 0
        L_0x0295:
            int r6 = r4.mo7337b()
            if (r5 >= r6) goto L_0x02a4
            r6 = 5
            int r8 = r3 + 5
            r4.mo7341f(r8)
            int r5 = r5 + 1
            goto L_0x0295
        L_0x02a4:
            r3 = 2
            r4.mo7341f(r3)
            boolean r3 = r4.mo7344i()
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x0324
            boolean r3 = r4.mo7344i()
            if (r3 == 0) goto L_0x02ef
            r3 = 8
            int r3 = r4.mo7336a(r3)
            r6 = 255(0xff, float:3.57E-43)
            if (r3 != r6) goto L_0x02d2
            r6 = 16
            int r3 = r4.mo7336a(r6)
            int r8 = r4.mo7336a(r6)
            if (r3 == 0) goto L_0x02ef
            if (r8 == 0) goto L_0x02ef
            float r3 = (float) r3
            float r5 = (float) r8
            float r3 = r3 / r5
            goto L_0x02da
        L_0x02d2:
            r6 = 17
            if (r3 >= r6) goto L_0x02dc
            float[] r5 = androidx.media3.extractor.C3347av.f10115b
            r3 = r5[r3]
        L_0x02da:
            r5 = r3
            goto L_0x02ef
        L_0x02dc:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Unexpected aspect_ratio_idc value: "
            r6.<init>(r8)
            r6.append(r3)
            java.lang.String r3 = "H265Reader"
            java.lang.String r6 = r6.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r3, r6)
        L_0x02ef:
            boolean r3 = r4.mo7344i()
            if (r3 == 0) goto L_0x02f8
            r4.mo7340e()
        L_0x02f8:
            boolean r3 = r4.mo7344i()
            if (r3 == 0) goto L_0x030d
            r3 = 4
            r4.mo7341f(r3)
            boolean r3 = r4.mo7344i()
            if (r3 == 0) goto L_0x030d
            r3 = 24
            r4.mo7341f(r3)
        L_0x030d:
            boolean r3 = r4.mo7344i()
            if (r3 == 0) goto L_0x0319
            r4.mo7337b()
            r4.mo7337b()
        L_0x0319:
            r4.mo7340e()
            boolean r3 = r4.mo7344i()
            if (r3 == 0) goto L_0x0324
            int r27 = r27 + r27
        L_0x0324:
            r3 = r27
            r25 = r14
            java.lang.String r4 = androidx.media3.common.p136b.C2617e.m7014b(r21, r22, r23, r24, r25, r26)
            androidx.media3.common.w r6 = new androidx.media3.common.w
            r6.<init>()
            r6.f7449a = r1
            java.lang.String r1 = "video/hevc"
            r6.f7459k = r1
            r6.f7456h = r4
            r6.f7464p = r7
            r6.f7465q = r3
            r6.f7468t = r5
            java.util.List r1 = java.util.Collections.singletonList(r2)
            r6.f7461m = r1
            androidx.media3.common.x r1 = new androidx.media3.common.x
            r1.<init>(r6)
            r15.mo6850b(r1)
            r1 = 1
            r0.f11309e = r1
            goto L_0x035d
        L_0x0351:
            r18 = r2
            r20 = r3
            r17 = r6
            r16 = r7
            r19 = r8
            r30 = r10
        L_0x035d:
            androidx.media3.extractor.k.x r1 = r0.f11314j
            boolean r1 = r1.mo7483d(r9)
            if (r1 == 0) goto L_0x038a
            androidx.media3.extractor.k.x r1 = r0.f11314j
            byte[] r2 = r1.f11359b
            int r1 = r1.f11360c
            int r1 = androidx.media3.extractor.C3347av.m9693b(r2, r1)
            androidx.media3.common.b.ac r2 = r0.f11318n
            androidx.media3.extractor.k.x r3 = r0.f11314j
            byte[] r3 = r3.f11359b
            r2.mo6157y(r3, r1)
            androidx.media3.common.b.ac r1 = r0.f11318n
            int r2 = r1.f7235b
            r3 = 5
            int r2 = r2 + r3
            r1.mo6131A(r2)
            androidx.media3.extractor.k.ah r1 = r0.f11305a
            androidx.media3.common.b.ac r2 = r0.f11318n
            androidx.media3.extractor.bf[] r1 = r1.f11064a
            androidx.media3.extractor.C3624n.m10438a(r12, r2, r1)
        L_0x038a:
            androidx.media3.extractor.k.x r1 = r0.f11315k
            boolean r1 = r1.mo7483d(r9)
            if (r1 == 0) goto L_0x03b7
            androidx.media3.extractor.k.x r1 = r0.f11315k
            byte[] r2 = r1.f11359b
            int r1 = r1.f11360c
            int r1 = androidx.media3.extractor.C3347av.m9693b(r2, r1)
            androidx.media3.common.b.ac r2 = r0.f11318n
            androidx.media3.extractor.k.x r3 = r0.f11315k
            byte[] r3 = r3.f11359b
            r2.mo6157y(r3, r1)
            androidx.media3.common.b.ac r1 = r0.f11318n
            int r2 = r1.f7235b
            r3 = 5
            int r2 = r2 + r3
            r1.mo6131A(r2)
            androidx.media3.extractor.k.ah r1 = r0.f11305a
            androidx.media3.common.b.ac r2 = r0.f11318n
            androidx.media3.extractor.bf[] r1 = r1.f11064a
            androidx.media3.extractor.C3624n.m10438a(r12, r2, r1)
        L_0x03b7:
            long r1 = r0.f11317m
            androidx.media3.extractor.k.s r3 = r0.f11308d
            boolean r4 = r0.f11309e
            r5 = 0
            r3.f11297f = r5
            r3.f11298g = r5
            r3.f11295d = r1
            r3.f11294c = r5
            r10 = r30
            r3.f11292a = r10
            r1 = r16
            r2 = 32
            if (r1 < r2) goto L_0x0402
            r2 = 40
            if (r1 != r2) goto L_0x03d9
            r2 = 16
            r4 = 0
        L_0x03d7:
            r5 = 1
            goto L_0x0406
        L_0x03d9:
            boolean r2 = r3.f11299h
            if (r2 == 0) goto L_0x03ec
            boolean r2 = r3.f11300i
            if (r2 != 0) goto L_0x03ec
            if (r4 == 0) goto L_0x03e8
            r2 = r20
            r3.mo7479a(r2)
        L_0x03e8:
            r4 = 0
            r3.f11299h = r4
            goto L_0x03ed
        L_0x03ec:
            r4 = 0
        L_0x03ed:
            r2 = 35
            if (r1 <= r2) goto L_0x03f9
            r2 = 39
            if (r1 != r2) goto L_0x03f6
            goto L_0x03f9
        L_0x03f6:
            r2 = 16
            goto L_0x03d7
        L_0x03f9:
            boolean r2 = r3.f11300i
            r5 = 1
            r2 = r2 ^ r5
            r3.f11298g = r2
            r3.f11300i = r5
            goto L_0x0404
        L_0x0402:
            r4 = 0
            r5 = 1
        L_0x0404:
            r2 = 16
        L_0x0406:
            if (r1 < r2) goto L_0x040e
            r2 = 21
            if (r1 > r2) goto L_0x040e
            r2 = 1
            goto L_0x040f
        L_0x040e:
            r2 = 0
        L_0x040f:
            r3.f11293b = r2
            if (r2 != 0) goto L_0x041a
            r2 = 9
            if (r1 > r2) goto L_0x0418
            goto L_0x041a
        L_0x0418:
            r8 = 0
            goto L_0x041b
        L_0x041a:
            r8 = 1
        L_0x041b:
            r3.f11296e = r8
            boolean r2 = r0.f11309e
            if (r2 != 0) goto L_0x0430
            androidx.media3.extractor.k.x r2 = r0.f11311g
            r2.mo7482c(r1)
            androidx.media3.extractor.k.x r2 = r0.f11312h
            r2.mo7482c(r1)
            androidx.media3.extractor.k.x r2 = r0.f11313i
            r2.mo7482c(r1)
        L_0x0430:
            androidx.media3.extractor.k.x r2 = r0.f11314j
            r2.mo7482c(r1)
            androidx.media3.extractor.k.x r2 = r0.f11315k
            r2.mo7482c(r1)
            r1 = r34
            r3 = r17
            r2 = r18
            r5 = r19
            goto L_0x0020
        L_0x0444:
            r1 = r2
            r2 = r5
            r0.m10311f(r2, r3, r1)
            return
        L_0x044a:
            r1 = r34
            goto L_0x000b
        L_0x044e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p172k.C3567t.mo7466a(androidx.media3.common.b.ac):void");
    }

    /* renamed from: b */
    public final void mo7467b(C3329ad adVar, C3545ar arVar) {
        arVar.mo7462a();
        arVar.mo7463b();
        this.f11306b = arVar.f11109b;
        arVar.mo7463b();
        this.f11307c = adVar.mo6987eZ(arVar.f11108a, 2);
        this.f11308d = new C3566s(this.f11307c);
        this.f11305a.mo7459a(adVar, arVar);
    }

    /* renamed from: c */
    public final void mo7468c() {
    }

    /* renamed from: d */
    public final void mo7469d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f11317m = j;
        }
    }

    /* renamed from: e */
    public final void mo7470e() {
        this.f11316l = 0;
        this.f11317m = -9223372036854775807L;
        C3347av.m9695d(this.f11310f);
        this.f11311g.mo7481b();
        this.f11312h.mo7481b();
        this.f11313i.mo7481b();
        this.f11314j.mo7481b();
        this.f11315k.mo7481b();
        C3566s sVar = this.f11308d;
        if (sVar != null) {
            sVar.f11296e = false;
            sVar.f11297f = false;
            sVar.f11298g = false;
            sVar.f11299h = false;
            sVar.f11300i = false;
        }
    }
}
