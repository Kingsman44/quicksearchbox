package androidx.media3.exoplayer.video.p153a;

/* renamed from: androidx.media3.exoplayer.video.a.i */
/* compiled from: PG */
final class C3284i {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        r0.mo6158z(r4);
        r0 = m9536c(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.media3.exoplayer.video.p153a.C3283h m9534a(byte[] r6, int r7) {
        /*
            androidx.media3.common.b.ac r0 = new androidx.media3.common.b.ac
            r0.<init>((byte[]) r6)
            r6 = 0
            r1 = 0
            int r2 = r0.f7235b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0052 }
            int r2 = r2 + 4
            r0.mo6131A(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0052 }
            int r2 = r0.mo6134b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0052 }
            r0.mo6131A(r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0052 }
            r3 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r2 != r3) goto L_0x004d
            int r2 = r0.f7235b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0052 }
            int r2 = r2 + 8
            r0.mo6131A(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0052 }
            int r2 = r0.f7235b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0052 }
            int r3 = r0.f7236c     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0052 }
        L_0x0025:
            if (r2 >= r3) goto L_0x0053
            int r4 = r0.mo6134b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0052 }
            int r4 = r4 + r2
            if (r4 <= r2) goto L_0x0053
            if (r4 <= r3) goto L_0x0031
            goto L_0x0053
        L_0x0031:
            int r2 = r0.mo6134b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0052 }
            r5 = 2037673328(0x79746d70, float:7.9321256E34)
            if (r2 == r5) goto L_0x0045
            r5 = 1836279920(0x6d736870, float:4.7081947E27)
            if (r2 != r5) goto L_0x0040
            goto L_0x0045
        L_0x0040:
            r0.mo6131A(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0052 }
            r2 = r4
            goto L_0x0025
        L_0x0045:
            r0.mo6158z(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0052 }
            java.util.ArrayList r0 = m9536c(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0052 }
            goto L_0x0054
        L_0x004d:
            java.util.ArrayList r0 = m9536c(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0052 }
            goto L_0x0054
        L_0x0052:
        L_0x0053:
            r0 = r1
        L_0x0054:
            if (r0 != 0) goto L_0x0057
            return r1
        L_0x0057:
            int r2 = r0.size()
            r3 = 1
            if (r2 == r3) goto L_0x0074
            r4 = 2
            if (r2 == r4) goto L_0x0062
            return r1
        L_0x0062:
            androidx.media3.exoplayer.video.a.h r1 = new androidx.media3.exoplayer.video.a.h
            java.lang.Object r6 = r0.get(r6)
            androidx.media3.exoplayer.video.a.f r6 = (androidx.media3.exoplayer.video.p153a.C3281f) r6
            java.lang.Object r0 = r0.get(r3)
            androidx.media3.exoplayer.video.a.f r0 = (androidx.media3.exoplayer.video.p153a.C3281f) r0
            r1.<init>(r6, r0, r7)
            return r1
        L_0x0074:
            androidx.media3.exoplayer.video.a.h r1 = new androidx.media3.exoplayer.video.a.h
            java.lang.Object r6 = r0.get(r6)
            androidx.media3.exoplayer.video.a.f r6 = (androidx.media3.exoplayer.video.p153a.C3281f) r6
            r1.<init>(r6, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.p153a.C3284i.m9534a(byte[], int):androidx.media3.exoplayer.video.a.h");
    }

    /* renamed from: b */
    private static int m9535b(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a9 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList m9536c(androidx.media3.common.p136b.C2604ac r26) {
        /*
            r0 = r26
            int r1 = r26.mo6139g()
            r2 = 0
            if (r1 != 0) goto L_0x01ad
            int r1 = r0.f7235b
            int r1 = r1 + 7
            r0.mo6131A(r1)
            int r1 = r26.mo6134b()
            r3 = 1684433976(0x64666c38, float:1.7002196E22)
            r4 = 1
            if (r1 != r3) goto L_0x0039
            androidx.media3.common.b.ac r1 = new androidx.media3.common.b.ac
            r1.<init>()
            java.util.zip.Inflater r3 = new java.util.zip.Inflater
            r3.<init>(r4)
            boolean r0 = androidx.media3.common.p136b.C2612ak.m6953ac(r0, r1, r3)     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x002e
            r3.end()
            return r2
        L_0x002e:
            r3.end()
            r0 = r1
            goto L_0x003f
        L_0x0033:
            r0 = move-exception
            r1 = r0
            r3.end()
            throw r1
        L_0x0039:
            r3 = 1918990112(0x72617720, float:4.465801E30)
            if (r1 == r3) goto L_0x003f
            return r2
        L_0x003f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r0.f7235b
            int r5 = r0.f7236c
        L_0x0048:
            if (r3 >= r5) goto L_0x01ab
            int r6 = r0.mo6134b()
            int r6 = r6 + r3
            if (r6 <= r3) goto L_0x01a9
            if (r6 <= r5) goto L_0x0055
            goto L_0x01ac
        L_0x0055:
            int r3 = r0.mo6134b()
            r7 = 1835365224(0x6d657368, float:4.438224E27)
            if (r3 != r7) goto L_0x019b
            int r3 = r0.mo6134b()
            r7 = 10000(0x2710, float:1.4013E-41)
            if (r3 <= r7) goto L_0x006c
        L_0x0066:
            r19 = r5
        L_0x0068:
            r16 = 1
            goto L_0x0194
        L_0x006c:
            float[] r7 = new float[r3]
            r9 = 0
        L_0x006f:
            if (r9 >= r3) goto L_0x007e
            int r10 = r0.mo6134b()
            float r10 = java.lang.Float.intBitsToFloat(r10)
            r7[r9] = r10
            int r9 = r9 + 1
            goto L_0x006f
        L_0x007e:
            int r9 = r0.mo6134b()
            r10 = 32000(0x7d00, float:4.4842E-41)
            if (r9 <= r10) goto L_0x0087
            goto L_0x0066
        L_0x0087:
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = java.lang.Math.log(r10)
            double r12 = (double) r3
            java.lang.Double.isNaN(r12)
            java.lang.Double.isNaN(r12)
            double r12 = r12 + r12
            double r12 = java.lang.Math.log(r12)
            double r12 = r12 / r10
            double r12 = java.lang.Math.ceil(r12)
            int r12 = (int) r12
            androidx.media3.common.b.ab r13 = new androidx.media3.common.b.ab
            byte[] r14 = r0.f7234a
            int r15 = r14.length
            r13.<init>(r14, r15)
            int r14 = r0.f7235b
            r15 = 8
            int r14 = r14 * 8
            r13.mo6124i(r14)
            int r14 = r9 * 5
            float[] r14 = new float[r14]
            r8 = 5
            int[] r2 = new int[r8]
            r4 = 0
            r17 = 0
        L_0x00ba:
            if (r4 >= r9) goto L_0x00e4
            r15 = 0
        L_0x00bd:
            if (r15 >= r8) goto L_0x00de
            r18 = r2[r15]
            int r19 = r13.mo6119d(r12)
            int r19 = m9535b(r19)
            int r8 = r18 + r19
            if (r8 >= r3) goto L_0x010d
            if (r8 >= 0) goto L_0x00d0
            goto L_0x010d
        L_0x00d0:
            int r18 = r17 + 1
            r19 = r7[r8]
            r14[r17] = r19
            r2[r15] = r8
            int r15 = r15 + 1
            r17 = r18
            r8 = 5
            goto L_0x00bd
        L_0x00de:
            int r4 = r4 + 1
            r8 = 5
            r15 = 8
            goto L_0x00ba
        L_0x00e4:
            int r2 = r13.mo6118c()
            int r2 = r2 + 7
            r2 = r2 & -8
            r13.mo6124i(r2)
            r2 = 32
            int r3 = r13.mo6119d(r2)
            androidx.media3.exoplayer.video.a.g[] r4 = new androidx.media3.exoplayer.video.p153a.C3282g[r3]
            r7 = 0
        L_0x00f8:
            if (r7 >= r3) goto L_0x018b
            r8 = 8
            int r12 = r13.mo6119d(r8)
            int r15 = r13.mo6119d(r8)
            int r8 = r13.mo6119d(r2)
            r2 = 128000(0x1f400, float:1.79366E-40)
            if (r8 <= r2) goto L_0x0112
        L_0x010d:
            r19 = r5
        L_0x010f:
            r2 = 0
            goto L_0x0068
        L_0x0112:
            r18 = r3
            double r2 = (double) r9
            java.lang.Double.isNaN(r2)
            java.lang.Double.isNaN(r2)
            double r2 = r2 + r2
            double r2 = java.lang.Math.log(r2)
            double r2 = r2 / r10
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            int r3 = r8 * 3
            float[] r3 = new float[r3]
            r19 = r5
            int r5 = r8 + r8
            float[] r5 = new float[r5]
            r20 = r10
            r10 = 0
            r11 = 0
        L_0x0134:
            if (r10 >= r8) goto L_0x0176
            int r22 = r13.mo6119d(r2)
            int r22 = m9535b(r22)
            int r11 = r11 + r22
            if (r11 < 0) goto L_0x0172
            if (r11 < r9) goto L_0x0145
            goto L_0x010f
        L_0x0145:
            int r22 = r10 * 3
            int r23 = r11 * 5
            r24 = r14[r23]
            r3[r22] = r24
            int r24 = r22 + 1
            int r25 = r23 + 1
            r25 = r14[r25]
            r3[r24] = r25
            int r22 = r22 + 2
            int r24 = r23 + 2
            r24 = r14[r24]
            r3[r22] = r24
            int r22 = r10 + r10
            int r24 = r23 + 3
            r24 = r14[r24]
            r5[r22] = r24
            r16 = 1
            int r22 = r22 + 1
            int r23 = r23 + 4
            r23 = r14[r23]
            r5[r22] = r23
            int r10 = r10 + 1
            goto L_0x0134
        L_0x0172:
            r16 = 1
            r2 = 0
            goto L_0x0194
        L_0x0176:
            r16 = 1
            androidx.media3.exoplayer.video.a.g r2 = new androidx.media3.exoplayer.video.a.g
            r2.<init>(r12, r3, r5, r15)
            r4[r7] = r2
            int r7 = r7 + 1
            r3 = r18
            r5 = r19
            r10 = r20
            r2 = 32
            goto L_0x00f8
        L_0x018b:
            r19 = r5
            r16 = 1
            androidx.media3.exoplayer.video.a.f r2 = new androidx.media3.exoplayer.video.a.f
            r2.<init>(r4)
        L_0x0194:
            if (r2 != 0) goto L_0x0197
            goto L_0x01a9
        L_0x0197:
            r1.add(r2)
            goto L_0x019f
        L_0x019b:
            r19 = r5
            r16 = 1
        L_0x019f:
            r0.mo6131A(r6)
            r3 = r6
            r5 = r19
            r2 = 0
            r4 = 1
            goto L_0x0048
        L_0x01a9:
            r2 = 0
            goto L_0x01ac
        L_0x01ab:
            r2 = r1
        L_0x01ac:
            return r2
        L_0x01ad:
            r0 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.p153a.C3284i.m9536c(androidx.media3.common.b.ac):java.util.ArrayList");
    }
}
