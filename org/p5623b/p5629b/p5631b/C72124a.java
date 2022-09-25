package org.p5623b.p5629b.p5631b;

import java.io.InputStream;

/* renamed from: org.b.b.b.a */
/* compiled from: PG */
public final class C72124a {
    /* renamed from: a */
    public static int m105661a(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        return i2;
    }
}
