package org.p5623b.p5629b.p5630a;

/* renamed from: org.b.b.a.h */
/* compiled from: PG */
public final class C72122h {

    /* renamed from: a */
    private static final short[] f191955a = new short[128];

    /* renamed from: b */
    private static final byte[] f191956b;

    static {
        byte[] bArr = new byte[112];
        f191956b = bArr;
        byte[] bArr2 = new byte[128];
        m105658b(bArr2, 0, 15, (byte) 1);
        m105658b(bArr2, 16, 31, (byte) 2);
        m105658b(bArr2, 32, 63, (byte) 3);
        m105658b(bArr2, 64, 65, (byte) 0);
        m105658b(bArr2, 66, 95, (byte) 4);
        m105658b(bArr2, 96, 96, (byte) 5);
        m105658b(bArr2, 97, 108, (byte) 6);
        m105658b(bArr2, 109, 109, (byte) 7);
        m105658b(bArr2, 110, 111, (byte) 6);
        m105658b(bArr2, 112, 112, (byte) 8);
        m105658b(bArr2, 113, 115, (byte) 9);
        m105658b(bArr2, 116, 116, (byte) 10);
        m105658b(bArr2, 117, 127, (byte) 0);
        m105658b(bArr, 0, 111, (byte) -2);
        m105658b(bArr, 8, 11, (byte) -1);
        m105658b(bArr, 24, 27, (byte) 0);
        m105658b(bArr, 40, 43, (byte) 16);
        m105658b(bArr, 58, 59, (byte) 0);
        m105658b(bArr, 72, 73, (byte) 0);
        m105658b(bArr, 89, 91, (byte) 16);
        m105658b(bArr, 104, 104, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
        for (int i = 0; i < 128; i++) {
            byte b = bArr2[i];
            byte b2 = bArr3[b];
            f191955a[i] = (short) (bArr4[b] | ((b2 & i) << 8));
        }
    }

    /* renamed from: a */
    public static int m105657a(byte[] bArr, char[] cArr) {
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                short s = f191955a[b & Byte.MAX_VALUE];
                int i4 = s >>> 8;
                byte b2 = (byte) s;
                while (b2 >= 0) {
                    if (i3 >= bArr.length) {
                        return -1;
                    }
                    int i5 = i3 + 1;
                    byte b3 = bArr[i3];
                    i4 = (i4 << 6) | (b3 & 63);
                    b2 = f191956b[b2 + ((b3 & 255) >>> 4)];
                    i3 = i5;
                }
                if (b2 == -2) {
                    return -1;
                }
                if (i4 <= 65535) {
                    if (i2 >= cArr.length) {
                        return -1;
                    }
                    cArr[i2] = (char) i4;
                    i2++;
                } else if (i2 >= cArr.length - 1) {
                    return -1;
                } else {
                    int i6 = i2 + 1;
                    cArr[i2] = (char) ((i4 >>> 10) + 55232);
                    i2 = i6 + 1;
                    cArr[i6] = (char) ((i4 & 1023) | 56320);
                }
                i = i3;
            } else if (i2 >= cArr.length) {
                return -1;
            } else {
                cArr[i2] = (char) b;
                i = i3;
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: b */
    private static void m105658b(byte[] bArr, int i, int i2, byte b) {
        while (i <= i2) {
            bArr[i] = b;
            i++;
        }
    }
}
