package org.p5623b.p5624a;

import java.io.InputStream;

/* renamed from: org.b.a.ch */
/* compiled from: PG */
final class C72090ch {
    static {
        Runtime.getRuntime().maxMemory();
    }

    /* renamed from: a */
    static int m105544a(int i) {
        int i2 = 1;
        if (i > 127) {
            int i3 = 1;
            while (true) {
                i >>>= 8;
                if (i == 0) {
                    break;
                }
                i3++;
            }
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: b */
    static int m105545b(int i) {
        if (i < 31) {
            return 1;
        }
        if (i < 128) {
            return 2;
        }
        byte[] bArr = new byte[5];
        int i2 = 4;
        do {
            i >>= 7;
            i2--;
            bArr[i2] = (byte) ((i & 127) | 128);
        } while (i > 127);
        return 1 + (5 - i2);
    }

    /* renamed from: c */
    static int m105546c(InputStream inputStream) {
        return ((C72088cf) inputStream).f191908c;
    }
}
