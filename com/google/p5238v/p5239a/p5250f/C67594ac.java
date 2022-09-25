package com.google.p5238v.p5239a.p5250f;

import com.google.p5238v.p5239a.p5260n.C67898a;
import java.security.SecureRandom;

/* renamed from: com.google.v.a.f.ac */
/* compiled from: PG */
public final class C67594ac {
    /* renamed from: a */
    public static int m97757a() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b = 0;
        while (b == 0) {
            secureRandom.nextBytes(bArr);
            b = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b;
    }

    /* renamed from: b */
    public static final C67898a m97758b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new C67593ab("Not a printable ASCII character: " + charAt);
            }
            bArr[i] = (byte) charAt;
        }
        return C67898a.m98152a(bArr);
    }
}
