package androidx.media3.extractor;

import androidx.media3.common.p136b.C2601a;
import java.util.Arrays;

/* renamed from: androidx.media3.extractor.av */
/* compiled from: PG */
public final class C3347av {

    /* renamed from: a */
    public static final byte[] f10114a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f10115b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f10116c = new Object();

    /* renamed from: d */
    private static int[] f10117d = new int[10];

    /* renamed from: a */
    public static int m9692a(byte[] bArr, int i, int i2, boolean[] zArr) {
        boolean z;
        int i3 = i2 - i;
        boolean z2 = false;
        C2601a.m6832d(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m9695d(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m9695d(zArr);
            return i - 2;
        } else if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b = bArr[i5];
                if ((b & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                        m9695d(zArr);
                        return i6;
                    }
                    i5 = i6;
                }
                i5 += 3;
            }
            if (i3 <= 2 ? i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 - 2] == 0 && bArr[i4] == 1) : !(bArr[i2 - 3] == 0 && bArr[i2 - 2] == 0 && bArr[i4] == 1)) {
                z = false;
            } else {
                z = true;
            }
            zArr[0] = z;
            zArr[1] = i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : bArr[i2 + -2] == 0 && bArr[i4] == 0;
            if (bArr[i4] == 0) {
                z2 = true;
            }
            zArr[2] = z2;
            return i2;
        } else {
            m9695d(zArr);
            return i - 1;
        }
    }

    /* renamed from: b */
    public static int m9693b(byte[] bArr, int i) {
        int i2;
        synchronized (f10116c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f10117d;
                    int length = iArr.length;
                    if (length <= i4) {
                        f10117d = Arrays.copyOf(iArr, length + length);
                    }
                    f10117d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f10117d[i7] - i5;
                System.arraycopy(bArr, i5, bArr, i6, i8);
                int i9 = i6 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i6 = i10 + 1;
                bArr[i10] = 0;
                i5 += i8 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i6, i2 - i6);
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0165  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.media3.extractor.C3346au m9694c(byte[] r22, int r23, int r24) {
        /*
            androidx.media3.extractor.ax r0 = new androidx.media3.extractor.ax
            r1 = r22
            r2 = r23
            r3 = r24
            r0.<init>(r1, r2, r3)
            r1 = 8
            int r2 = r0.mo7336a(r1)
            int r5 = r0.mo7336a(r1)
            int r6 = r0.mo7336a(r1)
            int r7 = r0.mo7337b()
            r3 = 100
            r4 = 3
            r8 = 16
            r10 = 1
            if (r2 == r3) goto L_0x004f
            r3 = 110(0x6e, float:1.54E-43)
            if (r2 == r3) goto L_0x004f
            r3 = 122(0x7a, float:1.71E-43)
            if (r2 == r3) goto L_0x004f
            r3 = 244(0xf4, float:3.42E-43)
            if (r2 == r3) goto L_0x004f
            r3 = 44
            if (r2 == r3) goto L_0x004f
            r3 = 83
            if (r2 == r3) goto L_0x004f
            r3 = 86
            if (r2 == r3) goto L_0x004f
            r3 = 118(0x76, float:1.65E-43)
            if (r2 == r3) goto L_0x004f
            r3 = 128(0x80, float:1.794E-43)
            if (r2 == r3) goto L_0x004f
            r3 = 138(0x8a, float:1.93E-43)
            if (r2 != r3) goto L_0x004c
            r2 = 138(0x8a, float:1.93E-43)
            goto L_0x004f
        L_0x004c:
            r3 = 1
            r11 = 0
            goto L_0x00a3
        L_0x004f:
            int r3 = r0.mo7337b()
            if (r3 != r4) goto L_0x005b
            boolean r11 = r0.mo7344i()
            r12 = 3
            goto L_0x005d
        L_0x005b:
            r12 = r3
            r11 = 0
        L_0x005d:
            r0.mo7337b()
            r0.mo7337b()
            r0.mo7340e()
            boolean r13 = r0.mo7344i()
            if (r13 == 0) goto L_0x00a3
            if (r12 == r4) goto L_0x0071
            r12 = 8
            goto L_0x0073
        L_0x0071:
            r12 = 12
        L_0x0073:
            r13 = 0
        L_0x0074:
            if (r13 >= r12) goto L_0x00a3
            boolean r14 = r0.mo7344i()
            if (r14 == 0) goto L_0x00a0
            r14 = 6
            if (r13 >= r14) goto L_0x0082
            r14 = 16
            goto L_0x0084
        L_0x0082:
            r14 = 64
        L_0x0084:
            r15 = 0
            r16 = 8
            r17 = 8
        L_0x0089:
            if (r15 >= r14) goto L_0x00a0
            if (r16 == 0) goto L_0x0099
            int r16 = r0.mo7338c()
            int r9 = r17 + r16
            int r9 = r9 + 256
            int r9 = r9 % 256
            r16 = r9
        L_0x0099:
            if (r16 == 0) goto L_0x009d
            r17 = r16
        L_0x009d:
            int r15 = r15 + 1
            goto L_0x0089
        L_0x00a0:
            int r13 = r13 + 1
            goto L_0x0074
        L_0x00a3:
            int r9 = r0.mo7337b()
            int r13 = r9 + 4
            int r9 = r0.mo7337b()
            if (r9 != 0) goto L_0x00bc
            int r12 = r0.mo7337b()
            int r12 = r12 + 4
            r24 = r2
            r14 = r9
            r15 = r12
        L_0x00b9:
            r16 = 0
            goto L_0x00e5
        L_0x00bc:
            if (r9 != r10) goto L_0x00e0
            boolean r9 = r0.mo7344i()
            r0.mo7338c()
            r0.mo7338c()
            int r12 = r0.mo7337b()
            long r14 = (long) r12
            r24 = r2
            r12 = 0
        L_0x00d0:
            long r1 = (long) r12
            int r16 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x00db
            r0.mo7337b()
            int r12 = r12 + 1
            goto L_0x00d0
        L_0x00db:
            r16 = r9
            r14 = 1
            r15 = 0
            goto L_0x00e5
        L_0x00e0:
            r24 = r2
            r14 = r9
            r15 = 0
            goto L_0x00b9
        L_0x00e5:
            r0.mo7337b()
            r0.mo7340e()
            int r1 = r0.mo7337b()
            int r1 = r1 + r10
            int r2 = r0.mo7337b()
            boolean r12 = r0.mo7344i()
            int r9 = 2 - r12
            int r2 = r2 + r10
            int r2 = r2 * r9
            if (r12 != 0) goto L_0x0102
            r0.mo7340e()
        L_0x0102:
            r0.mo7340e()
            int r1 = r1 * 16
            int r2 = r2 * 16
            boolean r17 = r0.mo7344i()
            if (r17 == 0) goto L_0x013b
            int r17 = r0.mo7337b()
            int r18 = r0.mo7337b()
            int r19 = r0.mo7337b()
            int r20 = r0.mo7337b()
            if (r3 != 0) goto L_0x0122
            goto L_0x012f
        L_0x0122:
            r21 = 2
            if (r3 != r4) goto L_0x0128
            r4 = 1
            goto L_0x0129
        L_0x0128:
            r4 = 2
        L_0x0129:
            if (r3 != r10) goto L_0x012c
            r10 = 2
        L_0x012c:
            int r9 = r9 * r10
            r10 = r4
        L_0x012f:
            int r17 = r17 + r18
            int r17 = r17 * r10
            int r1 = r1 - r17
            int r19 = r19 + r20
            int r19 = r19 * r9
            int r2 = r2 - r19
        L_0x013b:
            r9 = r2
            boolean r2 = r0.mo7344i()
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0182
            boolean r2 = r0.mo7344i()
            if (r2 == 0) goto L_0x0182
            r2 = 8
            int r2 = r0.mo7336a(r2)
            r4 = 255(0xff, float:3.57E-43)
            if (r2 != r4) goto L_0x0165
            int r2 = r0.mo7336a(r8)
            int r0 = r0.mo7336a(r8)
            if (r2 == 0) goto L_0x0182
            if (r0 == 0) goto L_0x0182
            float r2 = (float) r2
            float r0 = (float) r0
            float r2 = r2 / r0
            r10 = r2
            goto L_0x0184
        L_0x0165:
            r0 = 17
            if (r2 >= r0) goto L_0x016f
            float[] r0 = f10115b
            r0 = r0[r2]
            r10 = r0
            goto L_0x0184
        L_0x016f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected aspect_ratio_idc value: "
            r0.<init>(r4)
            r0.append(r2)
            java.lang.String r2 = "NalUnitUtil"
            java.lang.String r0 = r0.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r2, r0)
        L_0x0182:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x0184:
            androidx.media3.extractor.au r0 = new androidx.media3.extractor.au
            r3 = r0
            r4 = r24
            r8 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.C3347av.m9694c(byte[], int, int):androidx.media3.extractor.au");
    }

    /* renamed from: d */
    public static void m9695d(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: e */
    public static C3345at m9696e(byte[] bArr, int i) {
        C3349ax axVar = new C3349ax(bArr, 4, i);
        int b = axVar.mo7337b();
        int b2 = axVar.mo7337b();
        axVar.mo7340e();
        return new C3345at(b, b2, axVar.mo7344i());
    }
}
