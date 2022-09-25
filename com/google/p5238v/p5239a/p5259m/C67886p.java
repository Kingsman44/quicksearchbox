package com.google.p5238v.p5239a.p5259m;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.m.p */
/* compiled from: PG */
public final class C67886p {
    /* renamed from: a */
    public static final void m98133a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    /* renamed from: b */
    public static final boolean m98134b(byte[] bArr, byte[] bArr2) {
        if (!(bArr == null || bArr2 == null || bArr.length != bArr2.length)) {
            byte b = 0;
            for (int i = 0; i < bArr.length; i++) {
                b |= bArr[i] ^ bArr2[i];
            }
            if (b == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static byte[] m98135c(byte[]... bArr) {
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int length2 = bArr[i].length;
            if (i2 <= Integer.MAX_VALUE - length2) {
                i2 += length2;
                i++;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr3 : bArr) {
            int length3 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length3);
            i3 += length3;
        }
        return bArr2;
    }

    /* renamed from: d */
    public static final byte[] m98136d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return m98137e(bArr, 0, bArr2, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    /* renamed from: e */
    public static final byte[] m98137e(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr.length - i3 < i || bArr2.length - i3 < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }
}
