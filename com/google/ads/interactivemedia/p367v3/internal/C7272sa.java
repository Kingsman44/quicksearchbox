package com.google.ads.interactivemedia.p367v3.internal;

import com.evernote.android.state.BuildConfig;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.google.ads.interactivemedia.v3.internal.sa */
/* compiled from: PG */
public final class C7272sa extends C7245ra {

    /* renamed from: a */
    public static final C7269ry f23737a = C7268rx.f23729a;

    /* renamed from: b */
    private final C7269ry f23738b;

    public C7272sa() {
        this((C7269ry) null);
    }

    public C7272sa(C7269ry ryVar) {
        this.f23738b = ryVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if ((r10 & 128) != 0) goto L_0x008a;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m21704d(com.google.ads.interactivemedia.p367v3.internal.aee r19, int r20, int r21, boolean r22) {
        /*
            r1 = r19
            r0 = r20
            int r2 = r19.mo14553g()
        L_0x0008:
            int r3 = r19.mo14550d()     // Catch:{ all -> 0x00ae }
            r4 = 1
            r5 = r21
            if (r3 < r5) goto L_0x00aa
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r19.mo14568v()     // Catch:{ all -> 0x00ae }
            long r8 = r19.mo14566t()     // Catch:{ all -> 0x00ae }
            int r10 = r19.mo14561o()     // Catch:{ all -> 0x00ae }
            goto L_0x002c
        L_0x0022:
            int r7 = r19.mo14564r()     // Catch:{ all -> 0x00ae }
            int r8 = r19.mo14564r()     // Catch:{ all -> 0x00ae }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003b
            if (r10 == 0) goto L_0x0037
            goto L_0x003b
        L_0x0037:
            r1.mo14554h(r2)
            return r4
        L_0x003b:
            r7 = 4
            if (r0 != r7) goto L_0x006a
            if (r22 != 0) goto L_0x006a
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004c
            r1.mo14554h(r2)
            return r6
        L_0x004c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r11 = r11 & r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 24
            long r8 = r8 >> r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L_0x006a:
            if (r0 != r7) goto L_0x007a
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            r3 = r10 & 1
            r18 = r4
            r4 = r3
            r3 = r18
            goto L_0x008a
        L_0x007a:
            if (r0 != r3) goto L_0x0088
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0082
            r3 = 1
            goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0088:
            r3 = 0
        L_0x0089:
            r4 = 0
        L_0x008a:
            if (r4 == 0) goto L_0x008e
            int r3 = r3 + 4
        L_0x008e:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0097
            r1.mo14554h(r2)
            return r6
        L_0x0097:
            int r3 = r19.mo14550d()     // Catch:{ all -> 0x00ae }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a4
            r1.mo14554h(r2)
            return r6
        L_0x00a4:
            int r3 = (int) r8
            r1.mo14557k(r3)     // Catch:{ all -> 0x00ae }
            goto L_0x0008
        L_0x00aa:
            r1.mo14554h(r2)
            return r4
        L_0x00ae:
            r0 = move-exception
            r1.mo14554h(r2)
            goto L_0x00b4
        L_0x00b3:
            throw r0
        L_0x00b4:
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7272sa.m21704d(com.google.ads.interactivemedia.v3.internal.aee, int, int, boolean):boolean");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [com.google.ads.interactivemedia.v3.internal.sb] */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r6v25, types: [com.google.ads.interactivemedia.v3.internal.ru] */
    /* JADX WARNING: type inference failed for: r6v26 */
    /* JADX WARNING: type inference failed for: r5v32, types: [com.google.ads.interactivemedia.v3.internal.rm] */
    /* JADX WARNING: type inference failed for: r6v54 */
    /* JADX WARNING: type inference failed for: r6v56 */
    /* JADX WARNING: type inference failed for: r12v19, types: [com.google.ads.interactivemedia.v3.internal.sf] */
    /* JADX WARNING: type inference failed for: r10v39, types: [com.google.ads.interactivemedia.v3.internal.rs] */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0317, code lost:
        r2 = "Id3Decoder";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0536, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0537, code lost:
        r12 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x053a, code lost:
        r2 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0545, code lost:
        r12 = r20;
        r2 = r21;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:129:0x0227, B:152:0x029c] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0329 A[ADDED_TO_REGION, Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0494 A[Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x04f1 A[Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0507  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0536 A[ExcHandler: all (th java.lang.Throwable), PHI: r20 
      PHI: (r20v1 int) = (r20v2 int), (r20v2 int), (r20v2 int), (r20v5 int), (r20v8 int) binds: [B:243:0x0509, B:246:0x0532, B:247:?, B:152:0x029c, B:129:0x0227] A[DONT_GENERATE, DONT_INLINE], Splitter:B:129:0x0227] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.ads.interactivemedia.p367v3.internal.C7273sb m21705e(int r24, com.google.ads.interactivemedia.p367v3.internal.aee r25, boolean r26, int r27, com.google.ads.interactivemedia.p367v3.internal.C7269ry r28) {
        /*
            r0 = r24
            r1 = r25
            int r2 = r25.mo14560n()
            int r3 = r25.mo14560n()
            int r4 = r25.mo14560n()
            r5 = 0
            r6 = 3
            if (r0 < r6) goto L_0x0019
            int r7 = r25.mo14560n()
            goto L_0x001a
        L_0x0019:
            r7 = 0
        L_0x001a:
            r8 = 4
            if (r0 != r8) goto L_0x0039
            int r9 = r25.mo14538B()
            if (r26 != 0) goto L_0x0044
            r10 = r9 & 255(0xff, float:3.57E-43)
            int r11 = r9 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 7
            r10 = r10 | r11
            int r11 = r9 >> 16
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 14
            r10 = r10 | r11
            int r9 = r9 >> 24
            int r9 = r9 << 21
            r9 = r9 | r10
            goto L_0x0044
        L_0x0039:
            if (r0 != r6) goto L_0x0040
            int r9 = r25.mo14538B()
            goto L_0x0044
        L_0x0040:
            int r9 = r25.mo14564r()
        L_0x0044:
            if (r0 < r6) goto L_0x004b
            int r10 = r25.mo14561o()
            goto L_0x004c
        L_0x004b:
            r10 = 0
        L_0x004c:
            r11 = 0
            if (r2 != 0) goto L_0x0062
            if (r3 != 0) goto L_0x0062
            if (r4 != 0) goto L_0x0062
            if (r7 != 0) goto L_0x0062
            if (r9 != 0) goto L_0x0062
            if (r10 == 0) goto L_0x005a
            goto L_0x0062
        L_0x005a:
            int r0 = r25.mo14551e()
            r1.mo14554h(r0)
            return r11
        L_0x0062:
            int r12 = r25.mo14553g()
            int r12 = r12 + r9
            int r13 = r25.mo14551e()
            java.lang.String r14 = "Id3Decoder"
            if (r12 <= r13) goto L_0x007c
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            android.util.Log.w(r14, r0)
            int r0 = r25.mo14551e()
            r1.mo14554h(r0)
            return r11
        L_0x007c:
            if (r28 == 0) goto L_0x0089
            boolean r13 = r28.mo16419a()
            if (r13 == 0) goto L_0x0085
            goto L_0x0089
        L_0x0085:
            r1.mo14554h(r12)
            return r11
        L_0x0089:
            r13 = 1
            if (r0 != r6) goto L_0x00aa
            r15 = r10 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L_0x0092
            r15 = 1
            goto L_0x0093
        L_0x0092:
            r15 = 0
        L_0x0093:
            r16 = r10 & 64
            if (r16 == 0) goto L_0x009a
            r16 = 1
            goto L_0x009c
        L_0x009a:
            r16 = 0
        L_0x009c:
            r10 = r10 & 32
            if (r10 == 0) goto L_0x00a2
            r10 = 1
            goto L_0x00a3
        L_0x00a2:
            r10 = 0
        L_0x00a3:
            r17 = r16
            r18 = 0
            r16 = r15
            goto L_0x00df
        L_0x00aa:
            if (r0 != r8) goto L_0x00d7
            r15 = r10 & 64
            if (r15 == 0) goto L_0x00b2
            r15 = 1
            goto L_0x00b3
        L_0x00b2:
            r15 = 0
        L_0x00b3:
            r16 = r10 & 8
            if (r16 == 0) goto L_0x00ba
            r16 = 1
            goto L_0x00bc
        L_0x00ba:
            r16 = 0
        L_0x00bc:
            r17 = r10 & 4
            if (r17 == 0) goto L_0x00c3
            r17 = 1
            goto L_0x00c5
        L_0x00c3:
            r17 = 0
        L_0x00c5:
            r18 = r10 & 2
            if (r18 == 0) goto L_0x00cc
            r18 = 1
            goto L_0x00ce
        L_0x00cc:
            r18 = 0
        L_0x00ce:
            r10 = r10 & r13
            r23 = r16
            r16 = r10
            r10 = r15
            r15 = r23
            goto L_0x00df
        L_0x00d7:
            r10 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x00df:
            if (r15 != 0) goto L_0x0557
            if (r17 == 0) goto L_0x00e5
            goto L_0x0557
        L_0x00e5:
            if (r10 == 0) goto L_0x00ec
            int r9 = r9 + -1
            r1.mo14557k(r13)
        L_0x00ec:
            if (r16 == 0) goto L_0x00f3
            int r9 = r9 + -4
            r1.mo14557k(r8)
        L_0x00f3:
            if (r18 == 0) goto L_0x00f9
            int r9 = m21706f(r1, r9)
        L_0x00f9:
            r10 = 84
            r15 = 88
            r8 = 2
            if (r2 != r10) goto L_0x0139
            if (r3 != r15) goto L_0x0139
            if (r4 != r15) goto L_0x0139
            if (r0 == r8) goto L_0x0108
            if (r7 != r15) goto L_0x0139
        L_0x0108:
            if (r9 > 0) goto L_0x010b
            goto L_0x0141
        L_0x010b:
            int r6 = r25.mo14560n()     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            java.lang.String r8 = m21707g(r6)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            int r10 = r9 + -1
            byte[] r13 = new byte[r10]     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r1.mo14559m(r13, r5, r10)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            int r10 = m21709i(r13, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            java.lang.String r15 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r15.<init>(r13, r5, r10, r8)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            int r5 = m21711k(r6)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            int r10 = r10 + r5
            int r5 = m21709i(r13, r10, r6)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            java.lang.String r5 = m21713m(r13, r10, r5, r8)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            com.google.ads.interactivemedia.v3.internal.sj r6 = new com.google.ads.interactivemedia.v3.internal.sj     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            java.lang.String r8 = "TXXX"
            r6.<init>(r8, r15, r5)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            goto L_0x01cf
        L_0x0139:
            if (r2 != r10) goto L_0x0173
            java.lang.String r6 = m21708h(r0, r10, r3, r4, r7)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            if (r9 > 0) goto L_0x014b
        L_0x0141:
            r22 = r2
            r5 = r7
            r6 = r11
        L_0x0145:
            r20 = r12
        L_0x0147:
            r21 = r14
            goto L_0x0505
        L_0x014b:
            int r8 = r25.mo14560n()     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            java.lang.String r10 = m21707g(r8)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            int r13 = r9 + -1
            byte[] r15 = new byte[r13]     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r1.mo14559m(r15, r5, r13)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            int r8 = m21709i(r15, r5, r8)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            java.lang.String r13 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r13.<init>(r15, r5, r8, r10)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            com.google.ads.interactivemedia.v3.internal.sj r5 = new com.google.ads.interactivemedia.v3.internal.sj     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r5.<init>(r6, r11, r13)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r22 = r2
            r6 = r5
        L_0x016b:
            r5 = r7
            goto L_0x0145
        L_0x016d:
            r0 = move-exception
            goto L_0x0553
        L_0x0170:
            r2 = r14
            goto L_0x0549
        L_0x0173:
            r10 = 87
            java.lang.String r6 = "ISO-8859-1"
            if (r2 != r10) goto L_0x01b4
            if (r3 != r15) goto L_0x01b1
            if (r4 != r15) goto L_0x01b1
            if (r0 == r8) goto L_0x0181
            if (r7 != r15) goto L_0x01b1
        L_0x0181:
            if (r9 > 0) goto L_0x0184
            goto L_0x0141
        L_0x0184:
            int r8 = r25.mo14560n()     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            java.lang.String r10 = m21707g(r8)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            int r13 = r9 + -1
            byte[] r15 = new byte[r13]     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r1.mo14559m(r15, r5, r13)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            int r13 = m21709i(r15, r5, r8)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r11.<init>(r15, r5, r13, r10)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            int r5 = m21711k(r8)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            int r13 = r13 + r5
            int r5 = m21710j(r15, r13)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            java.lang.String r5 = m21713m(r15, r13, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            com.google.ads.interactivemedia.v3.internal.sl r6 = new com.google.ads.interactivemedia.v3.internal.sl     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            java.lang.String r8 = "WXXX"
            r6.<init>(r8, r11, r5)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            goto L_0x01cf
        L_0x01b1:
            r11 = 87
            goto L_0x01b5
        L_0x01b4:
            r11 = r2
        L_0x01b5:
            if (r11 != r10) goto L_0x01d2
            java.lang.String r8 = m21708h(r0, r10, r3, r4, r7)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            byte[] r10 = new byte[r9]     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r1.mo14559m(r10, r5, r9)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            int r11 = m21710j(r10, r5)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            java.lang.String r13 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r13.<init>(r10, r5, r11, r6)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            com.google.ads.interactivemedia.v3.internal.sl r6 = new com.google.ads.interactivemedia.v3.internal.sl     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r5 = 0
            r6.<init>(r8, r5, r13)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
        L_0x01cf:
            r22 = r2
            goto L_0x016b
        L_0x01d2:
            r10 = 73
            r15 = 80
            if (r11 != r15) goto L_0x01fd
            r11 = 82
            if (r3 != r11) goto L_0x01fb
            if (r4 != r10) goto L_0x01fb
            r11 = 86
            if (r7 != r11) goto L_0x01fb
            byte[] r8 = new byte[r9]     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r1.mo14559m(r8, r5, r9)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            int r10 = m21710j(r8, r5)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r11.<init>(r8, r5, r10, r6)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            int r10 = r10 + r13
            byte[] r5 = m21712l(r8, r10, r9)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            com.google.ads.interactivemedia.v3.internal.sh r6 = new com.google.ads.interactivemedia.v3.internal.sh     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r6.<init>(r11, r5)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            goto L_0x01cf
        L_0x01fb:
            r11 = 80
        L_0x01fd:
            r10 = 79
            r15 = 71
            if (r11 != r15) goto L_0x025a
            r11 = 69
            if (r3 != r11) goto L_0x0255
            if (r4 != r10) goto L_0x0255
            r11 = 66
            if (r7 == r11) goto L_0x020f
            if (r0 != r8) goto L_0x0255
        L_0x020f:
            int r8 = r25.mo14560n()     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            java.lang.String r10 = m21707g(r8)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            int r11 = r9 + -1
            byte[] r15 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r1.mo14559m(r15, r5, r11)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            int r13 = m21710j(r15, r5)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r20 = r12
            r12 = 0
            r5.<init>(r15, r12, r13, r6)     // Catch:{ UnsupportedEncodingException -> 0x0317, all -> 0x0536 }
            r6 = 1
            int r13 = r13 + r6
            int r6 = m21709i(r15, r13, r8)     // Catch:{ UnsupportedEncodingException -> 0x0317, all -> 0x0536 }
            java.lang.String r12 = m21713m(r15, r13, r6, r10)     // Catch:{ UnsupportedEncodingException -> 0x0317, all -> 0x0536 }
            int r13 = m21711k(r8)     // Catch:{ UnsupportedEncodingException -> 0x0317, all -> 0x0536 }
            int r6 = r6 + r13
            int r13 = m21709i(r15, r6, r8)     // Catch:{ UnsupportedEncodingException -> 0x0317, all -> 0x0536 }
            java.lang.String r6 = m21713m(r15, r6, r13, r10)     // Catch:{ UnsupportedEncodingException -> 0x0317, all -> 0x0536 }
            int r8 = m21711k(r8)     // Catch:{ UnsupportedEncodingException -> 0x0317, all -> 0x0536 }
            int r13 = r13 + r8
            byte[] r8 = m21712l(r15, r13, r11)     // Catch:{ UnsupportedEncodingException -> 0x0317, all -> 0x0536 }
            com.google.ads.interactivemedia.v3.internal.rw r10 = new com.google.ads.interactivemedia.v3.internal.rw     // Catch:{ UnsupportedEncodingException -> 0x0317, all -> 0x0536 }
            r10.<init>(r5, r12, r6, r8)     // Catch:{ UnsupportedEncodingException -> 0x0317, all -> 0x0536 }
            r22 = r2
            r5 = r7
            r6 = r10
            goto L_0x0147
        L_0x0255:
            r20 = r12
            r11 = 71
            goto L_0x025c
        L_0x025a:
            r20 = r12
        L_0x025c:
            r5 = 65
            r12 = 67
            if (r0 != r8) goto L_0x0275
            r13 = 80
            if (r11 != r13) goto L_0x0321
            r15 = 73
            if (r3 != r15) goto L_0x026d
            if (r4 != r12) goto L_0x026d
            goto L_0x0283
        L_0x026d:
            r22 = r2
            r21 = r14
            r11 = 80
            goto L_0x0325
        L_0x0275:
            r13 = 80
            r15 = 73
            if (r11 != r5) goto L_0x0321
            if (r3 != r13) goto L_0x031a
            if (r4 != r15) goto L_0x031a
            if (r7 == r12) goto L_0x0283
            goto L_0x031a
        L_0x0283:
            int r5 = r25.mo14560n()     // Catch:{ UnsupportedEncodingException -> 0x0317, all -> 0x0536 }
            java.lang.String r10 = m21707g(r5)     // Catch:{ UnsupportedEncodingException -> 0x0317, all -> 0x0536 }
            int r11 = r9 + -1
            byte[] r12 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0317, all -> 0x0536 }
            r13 = 0
            r1.mo14559m(r12, r13, r11)     // Catch:{ UnsupportedEncodingException -> 0x0317, all -> 0x0536 }
            if (r0 != r8) goto L_0x02c3
            java.lang.String r15 = "image/"
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0317, all -> 0x0536 }
            r21 = r14
            r14 = 3
            r8.<init>(r12, r13, r14, r6)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            java.lang.String r6 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18485C(r8)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r8 = r6.length()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            if (r8 == 0) goto L_0x02b2
            java.lang.String r6 = r15.concat(r6)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            goto L_0x02b7
        L_0x02b2:
            java.lang.String r6 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r6.<init>(r15)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
        L_0x02b7:
            java.lang.String r8 = "image/jpg"
            boolean r8 = r8.equals(r6)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            if (r8 == 0) goto L_0x02c1
            java.lang.String r6 = "image/jpeg"
        L_0x02c1:
            r13 = 2
            goto L_0x02f2
        L_0x02c3:
            r21 = r14
            r8 = 0
            int r13 = m21710j(r12, r8)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            java.lang.String r14 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r14.<init>(r12, r8, r13, r6)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            java.lang.String r6 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18485C(r14)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r8 = 47
            int r8 = r6.indexOf(r8)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r14 = -1
            if (r8 != r14) goto L_0x02f2
            java.lang.String r8 = "image/"
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r14 = r6.length()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            if (r14 == 0) goto L_0x02ed
            java.lang.String r6 = r8.concat(r6)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            goto L_0x02f2
        L_0x02ed:
            java.lang.String r6 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r6.<init>(r8)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
        L_0x02f2:
            int r8 = r13 + 1
            byte r8 = r12[r8]     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r8 = r8 & 255(0xff, float:3.57E-43)
            r14 = 2
            int r13 = r13 + r14
            int r14 = m21709i(r12, r13, r5)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            java.lang.String r15 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r22 = r2
            int r2 = r14 - r13
            r15.<init>(r12, r13, r2, r10)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r2 = m21711k(r5)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r14 = r14 + r2
            byte[] r2 = m21712l(r12, r14, r11)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            com.google.ads.interactivemedia.v3.internal.rm r5 = new com.google.ads.interactivemedia.v3.internal.rm     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r5.<init>(r6, r15, r8, r2)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r6 = r5
            goto L_0x036f
        L_0x0317:
            r2 = r14
            goto L_0x053c
        L_0x031a:
            r22 = r2
            r21 = r14
            r11 = 65
            goto L_0x0325
        L_0x0321:
            r22 = r2
            r21 = r14
        L_0x0325:
            r2 = 77
            if (r11 != r12) goto L_0x0372
            if (r3 != r10) goto L_0x0372
            if (r4 != r2) goto L_0x0372
            if (r7 == r2) goto L_0x0332
            r8 = 2
            if (r0 != r8) goto L_0x0372
        L_0x0332:
            r2 = 4
            if (r9 >= r2) goto L_0x0339
            r5 = r7
            r6 = 0
            goto L_0x0505
        L_0x0339:
            int r2 = r25.mo14560n()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            java.lang.String r5 = m21707g(r2)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r6 = 3
            byte[] r8 = new byte[r6]     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r10 = 0
            r1.mo14559m(r8, r10, r6)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r11.<init>(r8, r10, r6)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r6 = r9 + -4
            byte[] r8 = new byte[r6]     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r1.mo14559m(r8, r10, r6)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r6 = m21709i(r8, r10, r2)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r12.<init>(r8, r10, r6, r5)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r10 = m21711k(r2)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r6 = r6 + r10
            int r2 = m21709i(r8, r6, r2)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            java.lang.String r2 = m21713m(r8, r6, r2, r5)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            com.google.ads.interactivemedia.v3.internal.ru r6 = new com.google.ads.interactivemedia.v3.internal.ru     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r6.<init>(r11, r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
        L_0x036f:
            r5 = r7
            goto L_0x0505
        L_0x0372:
            if (r11 != r12) goto L_0x03eb
            r8 = 72
            if (r3 != r8) goto L_0x03eb
            if (r4 != r5) goto L_0x03eb
            r5 = 80
            if (r7 != r5) goto L_0x03eb
            int r2 = r25.mo14553g()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            byte[] r5 = r25.mo14555i()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r5 = m21710j(r5, r2)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            byte[] r8 = r25.mo14555i()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r10 = r5 - r2
            r11.<init>(r8, r2, r10, r6)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r6 = 1
            int r5 = r5 + r6
            r1.mo14554h(r5)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r12 = r25.mo14568v()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r13 = r25.mo14568v()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            long r5 = r25.mo14566t()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 != 0) goto L_0x03b1
            r5 = -1
        L_0x03b1:
            r14 = r5
            long r5 = r25.mo14566t()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r8 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r8 != 0) goto L_0x03c1
            r5 = -1
        L_0x03c1:
            r16 = r5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r5.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r2 = r2 + r9
        L_0x03c9:
            int r6 = r25.mo14553g()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            if (r6 >= r2) goto L_0x03d9
            com.google.ads.interactivemedia.v3.internal.sb r6 = m21705e(r24, r25, r26, r27, r28)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            if (r6 == 0) goto L_0x03c9
            r5.add(r6)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            goto L_0x03c9
        L_0x03d9:
            r2 = 0
            com.google.ads.interactivemedia.v3.internal.sb[] r2 = new com.google.ads.interactivemedia.p367v3.internal.C7273sb[r2]     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            java.lang.Object[] r2 = r5.toArray(r2)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r18 = r2
            com.google.ads.interactivemedia.v3.internal.sb[] r18 = (com.google.ads.interactivemedia.p367v3.internal.C7273sb[]) r18     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            com.google.ads.interactivemedia.v3.internal.rq r6 = new com.google.ads.interactivemedia.v3.internal.rq     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r10 = r6
            r10.<init>(r11, r12, r13, r14, r16, r18)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            goto L_0x036f
        L_0x03eb:
            if (r11 != r12) goto L_0x0488
            r5 = 84
            if (r3 != r5) goto L_0x0488
            if (r4 != r10) goto L_0x0488
            if (r7 != r12) goto L_0x0488
            int r2 = r25.mo14553g()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            byte[] r5 = r25.mo14555i()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r5 = m21710j(r5, r2)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            byte[] r8 = r25.mo14555i()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r10 = r5 - r2
            r11.<init>(r8, r2, r10, r6)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r19 = 1
            int r5 = r5 + 1
            r1.mo14554h(r5)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r5 = r25.mo14560n()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r8 = r5 & 2
            if (r8 == 0) goto L_0x041d
            r12 = 1
            goto L_0x041e
        L_0x041d:
            r12 = 0
        L_0x041e:
            r5 = r5 & 1
            int r8 = r25.mo14560n()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            java.lang.String[] r14 = new java.lang.String[r8]     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r10 = 0
        L_0x0427:
            if (r10 >= r8) goto L_0x0454
            int r13 = r25.mo14553g()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            byte[] r15 = r25.mo14555i()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r15 = m21710j(r15, r13)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r16 = r8
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            byte[] r0 = r25.mo14555i()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r18 = r7
            int r7 = r15 - r13
            r8.<init>(r0, r13, r7, r6)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r14[r10] = r8     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r15 = r15 + 1
            r1.mo14554h(r15)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r10 = r10 + 1
            r0 = r24
            r8 = r16
            r7 = r18
            goto L_0x0427
        L_0x0454:
            r18 = r7
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r0.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r2 = r2 + r9
        L_0x045c:
            int r6 = r25.mo14553g()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            if (r6 >= r2) goto L_0x046c
            com.google.ads.interactivemedia.v3.internal.sb r6 = m21705e(r24, r25, r26, r27, r28)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            if (r6 == 0) goto L_0x045c
            r0.add(r6)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            goto L_0x045c
        L_0x046c:
            r2 = 0
            com.google.ads.interactivemedia.v3.internal.sb[] r6 = new com.google.ads.interactivemedia.p367v3.internal.C7273sb[r2]     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            java.lang.Object[] r0 = r0.toArray(r6)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r15 = r0
            com.google.ads.interactivemedia.v3.internal.sb[] r15 = (com.google.ads.interactivemedia.p367v3.internal.C7273sb[]) r15     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            com.google.ads.interactivemedia.v3.internal.rs r6 = new com.google.ads.interactivemedia.v3.internal.rs     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r0 = 1
            if (r0 == r5) goto L_0x047d
            r13 = 0
            goto L_0x047e
        L_0x047d:
            r13 = 1
        L_0x047e:
            r10 = r6
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r0 = r24
            r5 = r18
            goto L_0x0505
        L_0x0488:
            r18 = r7
            if (r11 != r2) goto L_0x04f1
            r0 = 76
            if (r3 != r0) goto L_0x04f1
            r0 = 76
            if (r4 != r0) goto L_0x04f1
            r5 = r18
            r0 = 84
            if (r5 != r0) goto L_0x04f3
            int r13 = r25.mo14561o()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r14 = r25.mo14564r()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r15 = r25.mo14564r()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r0 = r25.mo14560n()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r2 = r25.mo14560n()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            com.google.ads.interactivemedia.v3.internal.aed r6 = new com.google.ads.interactivemedia.v3.internal.aed     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r6.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            byte[] r7 = r25.mo14555i()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r8 = r25.mo14551e()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r6.mo14525b(r7, r8)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r7 = r25.mo14553g()     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r7 = r7 * 8
            r6.mo14528e(r7)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r7 = r9 + -10
            int r7 = r7 * 8
            int r8 = r0 + r2
            int r7 = r7 / r8
            int[] r8 = new int[r7]     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int[] r10 = new int[r7]     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r11 = 0
        L_0x04d3:
            if (r11 >= r7) goto L_0x04e4
            int r12 = r6.mo14532i(r0)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r16 = r6.mo14532i(r2)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r8[r11] = r12     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r10[r11] = r16     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            int r11 = r11 + 1
            goto L_0x04d3
        L_0x04e4:
            com.google.ads.interactivemedia.v3.internal.sf r6 = new com.google.ads.interactivemedia.v3.internal.sf     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r12 = r6
            r16 = r8
            r17 = r10
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r0 = r24
            goto L_0x0505
        L_0x04f1:
            r5 = r18
        L_0x04f3:
            r0 = r24
            java.lang.String r2 = m21708h(r0, r11, r3, r4, r5)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            byte[] r6 = new byte[r9]     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r7 = 0
            r1.mo14559m(r6, r7, r9)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            com.google.ads.interactivemedia.v3.internal.ro r7 = new com.google.ads.interactivemedia.v3.internal.ro     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r7.<init>(r2, r6)     // Catch:{ UnsupportedEncodingException -> 0x0545, all -> 0x0536 }
            r6 = r7
        L_0x0505:
            if (r6 != 0) goto L_0x053f
            r2 = r22
            java.lang.String r0 = m21708h(r0, r2, r3, r4, r5)     // Catch:{ UnsupportedEncodingException -> 0x053a, all -> 0x0536 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ UnsupportedEncodingException -> 0x053a, all -> 0x0536 }
            int r2 = r2.length()     // Catch:{ UnsupportedEncodingException -> 0x053a, all -> 0x0536 }
            int r2 = r2 + 50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x053a, all -> 0x0536 }
            r3.<init>(r2)     // Catch:{ UnsupportedEncodingException -> 0x053a, all -> 0x0536 }
            java.lang.String r2 = "Failed to decode frame: id="
            r3.append(r2)     // Catch:{ UnsupportedEncodingException -> 0x053a, all -> 0x0536 }
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x053a, all -> 0x0536 }
            java.lang.String r0 = ", frameSize="
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x053a, all -> 0x0536 }
            r3.append(r9)     // Catch:{ UnsupportedEncodingException -> 0x053a, all -> 0x0536 }
            java.lang.String r0 = r3.toString()     // Catch:{ UnsupportedEncodingException -> 0x053a, all -> 0x0536 }
            r2 = r21
            android.util.Log.w(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x053c, all -> 0x0536 }
            goto L_0x053f
        L_0x0536:
            r0 = move-exception
            r12 = r20
            goto L_0x0553
        L_0x053a:
            r2 = r21
        L_0x053c:
            r12 = r20
            goto L_0x0549
        L_0x053f:
            r12 = r20
            r1.mo14554h(r12)
            return r6
        L_0x0545:
            r12 = r20
            r2 = r21
        L_0x0549:
            java.lang.String r0 = "Unsupported character encoding"
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x016d }
            r1.mo14554h(r12)
            r0 = 0
            return r0
        L_0x0553:
            r1.mo14554h(r12)
            throw r0
        L_0x0557:
            r0 = r11
            r2 = r14
            java.lang.String r3 = "Skipping unsupported compressed or encrypted frame"
            android.util.Log.w(r2, r3)
            r1.mo14554h(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7272sa.m21705e(int, com.google.ads.interactivemedia.v3.internal.aee, boolean, int, com.google.ads.interactivemedia.v3.internal.ry):com.google.ads.interactivemedia.v3.internal.sb");
    }

    /* renamed from: f */
    private static int m21706f(aee aee, int i) {
        byte[] i2 = aee.mo14555i();
        int g = aee.mo14553g();
        int i3 = g;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= g + i) {
                return i;
            }
            if ((i2[i3] & 255) == 255 && i2[i4] == 0) {
                System.arraycopy(i2, i3 + 2, i2, i4, (i - (i3 - g)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* renamed from: g */
    private static String m21707g(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: h */
    private static String m21708h(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: i */
    private static int m21709i(byte[] bArr, int i, int i2) {
        int j = m21710j(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return j;
        }
        while (true) {
            int length = bArr.length;
            if (j >= length - 1) {
                return length;
            }
            if (j % 2 == 0 && bArr[j + 1] == 0) {
                return j;
            }
            j = m21710j(bArr, j + 1);
        }
    }

    /* renamed from: j */
    private static int m21710j(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: k */
    private static int m21711k(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: l */
    private static byte[] m21712l(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return aeu.f20471f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* renamed from: m */
    private static String m21713m(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? BuildConfig.FLAVOR : new String(bArr, i, i2 - i, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C7243qz mo16356b(ByteBuffer byteBuffer) {
        return mo16424c(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.ads.interactivemedia.p367v3.internal.C7243qz mo16424c(byte[] r13, int r14) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.ads.interactivemedia.v3.internal.aee r1 = new com.google.ads.interactivemedia.v3.internal.aee
            r1.<init>(r13, r14)
            int r13 = r1.mo14550d()
            r14 = 2
            r2 = 4
            r3 = 0
            r4 = 1
            java.lang.String r5 = "Id3Decoder"
            r6 = 0
            r7 = 10
            if (r13 >= r7) goto L_0x0021
            java.lang.String r13 = "Data too short to be an ID3 tag"
            android.util.Log.w(r5, r13)
        L_0x001e:
            r10 = r6
            goto L_0x00bb
        L_0x0021:
            int r13 = r1.mo14564r()
            r8 = 4801587(0x494433, float:6.728456E-39)
            if (r13 == r8) goto L_0x0052
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r8[r3] = r13
            java.lang.String r13 = "%06X"
            java.lang.String r13 = java.lang.String.format(r13, r8)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r8 = r13.length()
            java.lang.String r9 = "Unexpected first three bytes of ID3 tag header: 0x"
            if (r8 == 0) goto L_0x0049
            java.lang.String r13 = r9.concat(r13)
            goto L_0x004e
        L_0x0049:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r9)
        L_0x004e:
            android.util.Log.w(r5, r13)
            goto L_0x001e
        L_0x0052:
            int r13 = r1.mo14560n()
            r1.mo14557k(r4)
            int r8 = r1.mo14560n()
            int r9 = r1.mo14537A()
            if (r13 != r14) goto L_0x006d
            r10 = r8 & 64
            if (r10 == 0) goto L_0x0094
            java.lang.String r13 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            android.util.Log.w(r5, r13)
            goto L_0x001e
        L_0x006d:
            r10 = 3
            if (r13 != r10) goto L_0x007e
            r10 = r8 & 64
            if (r10 == 0) goto L_0x0094
            int r10 = r1.mo14568v()
            r1.mo14557k(r10)
            int r10 = r10 + r2
            int r9 = r9 - r10
            goto L_0x0094
        L_0x007e:
            if (r13 != r2) goto L_0x00a3
            r10 = r8 & 64
            if (r10 == 0) goto L_0x008e
            int r10 = r1.mo14537A()
            int r11 = r10 + -4
            r1.mo14557k(r11)
            int r9 = r9 - r10
        L_0x008e:
            r10 = r8 & 16
            if (r10 == 0) goto L_0x0094
            int r9 = r9 + -10
        L_0x0094:
            if (r13 >= r2) goto L_0x009c
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x009c
            r8 = 1
            goto L_0x009d
        L_0x009c:
            r8 = 0
        L_0x009d:
            com.google.ads.interactivemedia.v3.internal.rz r10 = new com.google.ads.interactivemedia.v3.internal.rz
            r10.<init>(r13, r8, r9)
            goto L_0x00bb
        L_0x00a3:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 57
            r8.<init>(r9)
            java.lang.String r9 = "Skipped ID3 tag with unsupported majorVersion="
            r8.append(r9)
            r8.append(r13)
            java.lang.String r13 = r8.toString()
            android.util.Log.w(r5, r13)
            goto L_0x001e
        L_0x00bb:
            if (r10 != 0) goto L_0x00be
            return r6
        L_0x00be:
            int r13 = r1.mo14553g()
            int r8 = r10.f23730a
            if (r8 != r14) goto L_0x00c9
            r7 = 6
        L_0x00c9:
            int r14 = r10.f23732c
            boolean r8 = r10.f23731b
            if (r8 == 0) goto L_0x00db
            int r14 = r10.f23732c
            int r14 = m21706f(r1, r14)
        L_0x00db:
            int r13 = r13 + r14
            r1.mo14552f(r13)
            int r13 = r10.f23730a
            boolean r13 = m21704d(r1, r13, r7, r3)
            if (r13 != 0) goto L_0x0112
            int r13 = r10.f23730a
            if (r13 != r2) goto L_0x00f7
            boolean r13 = m21704d(r1, r2, r7, r4)
            if (r13 == 0) goto L_0x00f7
            r3 = 1
            goto L_0x0112
        L_0x00f7:
            int r13 = r10.f23730a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r0 = 56
            r14.<init>(r0)
            java.lang.String r0 = "Failed to validate ID3 tag with majorVersion="
            r14.append(r0)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            android.util.Log.w(r5, r13)
            return r6
        L_0x0112:
            int r13 = r1.mo14550d()
            if (r13 < r7) goto L_0x0128
            int r13 = r10.f23730a
            com.google.ads.interactivemedia.v3.internal.ry r14 = r12.f23738b
            com.google.ads.interactivemedia.v3.internal.sb r13 = m21705e(r13, r1, r3, r7, r14)
            if (r13 == 0) goto L_0x0112
            r0.add(r13)
            goto L_0x0112
        L_0x0128:
            com.google.ads.interactivemedia.v3.internal.qz r13 = new com.google.ads.interactivemedia.v3.internal.qz
            r13.<init>((java.util.List) r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7272sa.mo16424c(byte[], int):com.google.ads.interactivemedia.v3.internal.qz");
    }
}
