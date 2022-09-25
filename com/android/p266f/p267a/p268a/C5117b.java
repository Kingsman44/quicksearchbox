package com.android.p266f.p267a.p268a;

import org.chromium.net.PrivateKeyType;

/* renamed from: com.android.f.a.a.b */
/* compiled from: PG */
public final class C5117b {

    /* renamed from: a */
    private static byte[] f16305a = new byte[PrivateKeyType.INVALID];

    static {
        for (int i = 0; i < 255; i++) {
            f16305a[i] = -1;
        }
        for (int i2 = 90; i2 >= 65; i2--) {
            f16305a[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 122; i3 >= 97; i3--) {
            f16305a[i3] = (byte) (i3 - 71);
        }
        for (int i4 = 57; i4 >= 48; i4--) {
            f16305a[i4] = (byte) (i4 + 4);
        }
        byte[] bArr = f16305a;
        bArr[43] = 62;
        bArr[47] = 63;
    }

    /* renamed from: a */
    public static byte[] m13991a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        for (byte b : bArr) {
            if (b == 61 || f16305a[b] != -1) {
                bArr2[i] = b;
                i++;
            }
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArr2, 0, bArr3, 0, i);
        if (i == 0) {
            return new byte[0];
        }
        int i2 = i >> 2;
        while (true) {
            int i3 = i - 1;
            if (bArr3[i3] != 61) {
                byte[] bArr4 = new byte[(i - i2)];
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * 4;
                    byte b2 = bArr3[i6 + 2];
                    byte b3 = bArr3[i6 + 3];
                    byte[] bArr5 = f16305a;
                    byte b4 = bArr5[bArr3[i6]];
                    byte b5 = bArr5[bArr3[i6 + 1]];
                    if (b2 != 61 && b3 != 61) {
                        byte b6 = bArr5[b2];
                        byte b7 = bArr5[b3];
                        bArr4[i4] = (byte) ((b4 << 2) | (b5 >> 4));
                        bArr4[i4 + 1] = (byte) (((b5 & 15) << 4) | ((b6 >> 2) & 15));
                        bArr4[i4 + 2] = (byte) ((b6 << 6) | b7);
                    } else if (b2 == 61) {
                        bArr4[i4] = (byte) ((b5 >> 4) | (b4 << 2));
                    } else {
                        byte b8 = bArr5[b2];
                        bArr4[i4] = (byte) ((b4 << 2) | (b5 >> 4));
                        bArr4[i4 + 1] = (byte) (((b5 & 15) << 4) | ((b8 >> 2) & 15));
                    }
                    i4 += 3;
                }
                return bArr4;
            } else if (i3 == 0) {
                return new byte[0];
            } else {
                i = i3;
            }
        }
    }
}
