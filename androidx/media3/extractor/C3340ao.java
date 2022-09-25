package androidx.media3.extractor;

import java.util.List;

/* renamed from: androidx.media3.extractor.ao */
/* compiled from: PG */
public final class C3340ao {

    /* renamed from: a */
    public final List f10075a;

    /* renamed from: b */
    public final int f10076b;

    /* renamed from: c */
    public final float f10077c;

    /* renamed from: d */
    public final String f10078d;

    private C3340ao(List list, int i, float f, String str) {
        this.f10075a = list;
        this.f10076b = i;
        this.f10077c = f;
        this.f10078d = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:163:0x0344 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x034d A[Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0362 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.media3.extractor.C3340ao m9682a(androidx.media3.common.p136b.C2604ac r38) {
        /*
            r0 = r38
            int r1 = r0.f7235b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r1 = r1 + 21
            r0.mo6131A(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r1 = r38.mo6139g()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r2 = 3
            r1 = r1 & r2
            int r3 = r38.mo6139g()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r4 = r0.f7235b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0018:
            r8 = 1
            if (r6 >= r3) goto L_0x003b
            int r9 = r0.f7235b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r9 = r9 + r8
            r0.mo6131A(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r8 = r38.mo6142j()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9 = 0
        L_0x0026:
            if (r9 >= r8) goto L_0x0038
            int r10 = r38.mo6142j()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r11 = r10 + 4
            int r7 = r7 + r11
            int r11 = r0.f7235b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r11 = r11 + r10
            r0.mo6131A(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r9 = r9 + 1
            goto L_0x0026
        L_0x0038:
            int r6 = r6 + 1
            goto L_0x0018
        L_0x003b:
            r0.mo6131A(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            byte[] r4 = new byte[r7]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9 = 0
            r10 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
        L_0x0045:
            if (r10 >= r3) goto L_0x03bd
            int r13 = r38.mo6139g()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r13 = r13 & 63
            int r14 = r38.mo6142j()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r15 = 0
        L_0x0052:
            if (r15 >= r14) goto L_0x03ac
            int r6 = r38.mo6142j()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            byte[] r8 = androidx.media3.extractor.C3347av.f10114a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r2 = 4
            java.lang.System.arraycopy(r8, r5, r4, r12, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r12 = r12 + 4
            byte[] r8 = r0.f7234a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r5 = r0.f7235b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            java.lang.System.arraycopy(r8, r5, r4, r12, r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r5 = 33
            if (r13 != r5) goto L_0x037c
            if (r15 != 0) goto L_0x037c
            int r5 = r12 + r6
            int r8 = r12 + 2
            androidx.media3.extractor.ax r9 = new androidx.media3.extractor.ax     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.<init>(r4, r8, r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7341f(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r5 = 3
            int r8 = r9.mo7336a(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7340e()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r5 = 2
            int r18 = r9.mo7336a(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            boolean r19 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r11 = 5
            int r20 = r9.mo7336a(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r15 = 0
            r21 = 0
        L_0x0092:
            r11 = 32
            if (r15 >= r11) goto L_0x00a4
            boolean r11 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r11 == 0) goto L_0x00a1
            r11 = 1
            int r23 = r11 << r15
            r21 = r21 | r23
        L_0x00a1:
            int r15 = r15 + 1
            goto L_0x0092
        L_0x00a4:
            r11 = 6
            int[] r15 = new int[r11]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r5 = 0
        L_0x00a8:
            r2 = 8
            if (r5 >= r11) goto L_0x00b5
            int r2 = r9.mo7336a(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r15[r5] = r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r5 = r5 + 1
            goto L_0x00a8
        L_0x00b5:
            int r5 = r9.mo7336a(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r2 = 0
            r11 = 0
        L_0x00bb:
            if (r2 >= r8) goto L_0x00d0
            boolean r26 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r26 == 0) goto L_0x00c5
            int r11 = r11 + 89
        L_0x00c5:
            boolean r26 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r26 == 0) goto L_0x00cd
            int r11 = r11 + 8
        L_0x00cd:
            int r2 = r2 + 1
            goto L_0x00bb
        L_0x00d0:
            r9.mo7341f(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r8 <= 0) goto L_0x00db
            int r2 = 8 - r8
            int r2 = r2 + r2
            r9.mo7341f(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
        L_0x00db:
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r2 = r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r11 = 3
            if (r2 != r11) goto L_0x00e8
            r9.mo7340e()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
        L_0x00e8:
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            boolean r2 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r2 == 0) goto L_0x0100
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
        L_0x0100:
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r2 = r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            boolean r11 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r26 = r3
            r3 = 1
            if (r3 == r11) goto L_0x0115
            r3 = r8
            goto L_0x0116
        L_0x0115:
            r3 = 0
        L_0x0116:
            if (r3 > r8) goto L_0x0124
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r3 = r3 + 1
            goto L_0x0116
        L_0x0124:
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            boolean r3 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r3 == 0) goto L_0x0188
            boolean r3 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r3 == 0) goto L_0x0188
            r3 = 0
        L_0x0143:
            r8 = 4
            if (r3 >= r8) goto L_0x0188
            r8 = 0
        L_0x0147:
            r11 = 6
            if (r8 >= r11) goto L_0x0180
            boolean r25 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r25 != 0) goto L_0x0157
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r28 = r13
        L_0x0155:
            r13 = 3
            goto L_0x0177
        L_0x0157:
            int r25 = r3 + r3
            r24 = 4
            int r25 = r25 + 4
            r28 = r13
            r11 = 1
            int r13 = r11 << r25
            r11 = 64
            int r11 = java.lang.Math.min(r11, r13)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r13 = 1
            if (r3 <= r13) goto L_0x016e
            r9.mo7338c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
        L_0x016e:
            r13 = 0
        L_0x016f:
            if (r13 >= r11) goto L_0x0155
            r9.mo7338c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r13 = r13 + 1
            goto L_0x016f
        L_0x0177:
            if (r3 != r13) goto L_0x017b
            r11 = 3
            goto L_0x017c
        L_0x017b:
            r11 = 1
        L_0x017c:
            int r8 = r8 + r11
            r13 = r28
            goto L_0x0147
        L_0x0180:
            r28 = r13
            r13 = 3
            int r3 = r3 + 1
            r13 = r28
            goto L_0x0143
        L_0x0188:
            r28 = r13
            r13 = 3
            r3 = 2
            r9.mo7341f(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            boolean r3 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r3 == 0) goto L_0x01a3
            r3 = 8
            r9.mo7341f(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7340e()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
        L_0x01a3:
            int r3 = r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r8 = 0
            int[] r11 = new int[r8]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int[] r13 = new int[r8]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r17 = -1
            r27 = r1
            r25 = r14
            r1 = 0
            r8 = -1
            r14 = -1
        L_0x01b5:
            if (r1 >= r3) goto L_0x02d3
            if (r1 == 0) goto L_0x0287
            boolean r29 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r29 == 0) goto L_0x0287
            r29 = r3
            int r3 = r8 + r14
            boolean r30 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r31 = r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r30 = r30 + r30
            r16 = 1
            int r30 = 1 - r30
            int r31 = r31 + 1
            int r30 = r30 * r31
            r31 = r4
            int r4 = r3 + 1
            r32 = r7
            boolean[] r7 = new boolean[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r33 = r10
            r10 = 0
        L_0x01e0:
            if (r10 > r3) goto L_0x01f6
            boolean r34 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r34 != 0) goto L_0x01ef
            boolean r34 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r7[r10] = r34     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            goto L_0x01f3
        L_0x01ef:
            r16 = 1
            r7[r10] = r16     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
        L_0x01f3:
            int r10 = r10 + 1
            goto L_0x01e0
        L_0x01f6:
            int[] r10 = new int[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int[] r4 = new int[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r34 = r14 + -1
            r35 = 0
        L_0x01fe:
            if (r34 < 0) goto L_0x0215
            r36 = r13[r34]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r36 = r36 + r30
            if (r36 >= 0) goto L_0x0212
            int r37 = r8 + r34
            boolean r37 = r7[r37]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r37 == 0) goto L_0x0212
            int r37 = r35 + 1
            r10[r35] = r36     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r35 = r37
        L_0x0212:
            int r34 = r34 + -1
            goto L_0x01fe
        L_0x0215:
            if (r30 >= 0) goto L_0x0221
            boolean r34 = r7[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r34 == 0) goto L_0x0221
            int r34 = r35 + 1
            r10[r35] = r30     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r35 = r34
        L_0x0221:
            r34 = r6
            r0 = r35
            r6 = 0
        L_0x0226:
            if (r6 >= r8) goto L_0x023b
            r35 = r11[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r35 = r35 + r30
            if (r35 >= 0) goto L_0x0238
            boolean r36 = r7[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r36 == 0) goto L_0x0238
            int r36 = r0 + 1
            r10[r0] = r35     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r0 = r36
        L_0x0238:
            int r6 = r6 + 1
            goto L_0x0226
        L_0x023b:
            int[] r6 = java.util.Arrays.copyOf(r10, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r10 = r8 + -1
            r35 = 0
        L_0x0243:
            if (r10 < 0) goto L_0x0258
            r36 = r11[r10]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r36 = r36 + r30
            if (r36 <= 0) goto L_0x0255
            boolean r37 = r7[r10]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r37 == 0) goto L_0x0255
            int r37 = r35 + 1
            r4[r35] = r36     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r35 = r37
        L_0x0255:
            int r10 = r10 + -1
            goto L_0x0243
        L_0x0258:
            if (r30 <= 0) goto L_0x0264
            boolean r3 = r7[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r3 == 0) goto L_0x0264
            int r3 = r35 + 1
            r4[r35] = r30     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r35 = r3
        L_0x0264:
            r3 = r35
            r10 = 0
        L_0x0267:
            if (r10 >= r14) goto L_0x027e
            r11 = r13[r10]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r11 = r11 + r30
            if (r11 <= 0) goto L_0x027b
            int r35 = r8 + r10
            boolean r35 = r7[r35]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r35 == 0) goto L_0x027b
            int r35 = r3 + 1
            r4[r3] = r11     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r3 = r35
        L_0x027b:
            int r10 = r10 + 1
            goto L_0x0267
        L_0x027e:
            int[] r4 = java.util.Arrays.copyOf(r4, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r8 = r0
            r14 = r3
            r13 = r4
            r11 = r6
            goto L_0x02c3
        L_0x0287:
            r29 = r3
            r31 = r4
            r34 = r6
            r32 = r7
            r33 = r10
            int r0 = r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r3 = r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int[] r4 = new int[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r6 = 0
        L_0x029c:
            if (r6 >= r0) goto L_0x02ac
            int r7 = r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r8 = 1
            int r7 = r7 + r8
            r4[r6] = r7     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7340e()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r6 = r6 + 1
            goto L_0x029c
        L_0x02ac:
            int[] r6 = new int[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r7 = 0
        L_0x02af:
            if (r7 >= r3) goto L_0x02bf
            int r8 = r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r10 = 1
            int r8 = r8 + r10
            r6[r7] = r8     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7340e()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r7 = r7 + 1
            goto L_0x02af
        L_0x02bf:
            r8 = r0
            r14 = r3
            r11 = r4
            r13 = r6
        L_0x02c3:
            int r1 = r1 + 1
            r0 = r38
            r3 = r29
            r4 = r31
            r7 = r32
            r10 = r33
            r6 = r34
            goto L_0x01b5
        L_0x02d3:
            r31 = r4
            r34 = r6
            r32 = r7
            r33 = r10
            boolean r0 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r0 == 0) goto L_0x02f1
            r0 = 0
        L_0x02e2:
            int r1 = r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r0 >= r1) goto L_0x02f1
            r1 = 5
            int r11 = r2 + 5
            r9.mo7341f(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r0 = r0 + 1
            goto L_0x02e2
        L_0x02f1:
            r0 = 2
            r9.mo7341f(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            boolean r0 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r0 == 0) goto L_0x036f
            boolean r0 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r0 == 0) goto L_0x033c
            r0 = 8
            int r0 = r9.mo7336a(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L_0x031d
            r0 = 16
            int r1 = r9.mo7336a(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r0 = r9.mo7336a(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r1 == 0) goto L_0x033c
            if (r0 == 0) goto L_0x033c
            float r1 = (float) r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            float r0 = (float) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            float r1 = r1 / r0
            goto L_0x033e
        L_0x031d:
            r1 = 17
            if (r0 >= r1) goto L_0x0326
            float[] r1 = androidx.media3.extractor.C3347av.f10115b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r1 = r1[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            goto L_0x033e
        L_0x0326:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r1.<init>()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            java.lang.String r2 = "Unexpected aspect_ratio_idc value: "
            r1.append(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            java.lang.String r0 = "NalUnitUtil"
            java.lang.String r1 = r1.toString()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            androidx.media3.common.p136b.C2633u.m7050e(r0, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
        L_0x033c:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x033e:
            boolean r0 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r0 == 0) goto L_0x0347
            r9.mo7340e()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
        L_0x0347:
            boolean r0 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r0 == 0) goto L_0x035c
            r0 = 4
            r9.mo7341f(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            boolean r0 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r0 == 0) goto L_0x035c
            r0 = 24
            r9.mo7341f(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
        L_0x035c:
            boolean r0 = r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            if (r0 == 0) goto L_0x0368
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7337b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
        L_0x0368:
            r9.mo7340e()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r9.mo7344i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            goto L_0x0371
        L_0x036f:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0371:
            r22 = r15
            r23 = r5
            java.lang.String r9 = androidx.media3.common.p136b.C2617e.m7014b(r18, r19, r20, r21, r22, r23)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r11 = r1
            r15 = 0
            goto L_0x038c
        L_0x037c:
            r27 = r1
            r26 = r3
            r31 = r4
            r34 = r6
            r32 = r7
            r33 = r10
            r28 = r13
            r25 = r14
        L_0x038c:
            int r12 = r12 + r34
            r0 = r38
            int r1 = r0.f7235b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            int r1 = r1 + r34
            r0.mo6131A(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r1 = 1
            int r15 = r15 + r1
            r14 = r25
            r3 = r26
            r1 = r27
            r13 = r28
            r4 = r31
            r7 = r32
            r10 = r33
            r2 = 3
            r5 = 0
            r8 = 1
            goto L_0x0052
        L_0x03ac:
            r27 = r1
            r26 = r3
            r31 = r4
            r32 = r7
            r33 = r10
            int r10 = r33 + 1
            r2 = 3
            r5 = 0
            r8 = 1
            goto L_0x0045
        L_0x03bd:
            r27 = r1
            r31 = r4
            r32 = r7
            if (r32 != 0) goto L_0x03ca
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            goto L_0x03ce
        L_0x03ca:
            java.util.List r0 = java.util.Collections.singletonList(r31)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
        L_0x03ce:
            androidx.media3.extractor.ao r1 = new androidx.media3.extractor.ao     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            r2 = 1
            int r2 = r27 + 1
            r1.<init>(r0, r2, r11, r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d7 }
            return r1
        L_0x03d7:
            r0 = move-exception
            java.lang.String r1 = "Error parsing HEVC config"
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r1, r0)
            goto L_0x03e0
        L_0x03df:
            throw r0
        L_0x03e0:
            goto L_0x03df
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.C3340ao.m9682a(androidx.media3.common.b.ac):androidx.media3.extractor.ao");
    }
}
