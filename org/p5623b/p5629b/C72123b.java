package org.p5623b.p5629b;

/* renamed from: org.b.b.b */
/* compiled from: PG */
public final class C72123b {
    /* renamed from: a */
    public static int m105659a(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    /* renamed from: b */
    public static byte[] m105660b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }
}
