package com.google.common.p4575r;

import java.util.Arrays;

/* renamed from: com.google.common.r.p */
/* compiled from: PG */
final class C60759p {

    /* renamed from: a */
    private static final byte[] f164802a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i2 = 0; i2 < 26; i2++) {
            byte b = (byte) (i2 + 10);
            bArr[i2 + 65] = b;
            bArr[i2 + 97] = b;
        }
        f164802a = bArr;
    }

    /* renamed from: a */
    static int m92754a(char c) {
        if (c < 128) {
            return f164802a[c];
        }
        return -1;
    }
}
