package com.google.audio.p4106a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.audio.a.a */
/* compiled from: PG */
public final class C54571a {

    /* renamed from: a */
    public static final byte[] f143282a = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};

    /* renamed from: b */
    public byte[] f143283b;

    /* renamed from: c */
    public int f143284c = 0;

    /* renamed from: d */
    public int f143285d = 1;

    /* renamed from: e */
    public int f143286e = 16;

    /* renamed from: f */
    public ByteOrder f143287f;

    /* renamed from: c */
    public static void m87482c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m87483d(OutputStream outputStream, int i) {
        byte[] bArr = new byte[4];
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).putInt(i);
        outputStream.write(bArr);
    }

    /* renamed from: e */
    public static void m87484e(OutputStream outputStream, int i) {
        byte[] bArr = new byte[2];
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).putShort((short) i);
        outputStream.write(bArr);
    }

    /* renamed from: f */
    public static byte[] m87485f(InputStream inputStream, int i) {
        if (i >= 0) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read != -1) {
                    i2 += read;
                } else {
                    throw new IOException("Unexpected end of file while reading WAV file.");
                }
            }
            return bArr;
        }
        throw new IOException("Invalid negative data length in WAV file.");
    }

    /* renamed from: g */
    public static String m87486g(InputStream inputStream) {
        return new String(m87485f(inputStream, 4));
    }

    /* renamed from: a */
    public final int mo54133a(InputStream inputStream) {
        return ByteBuffer.wrap(m87485f(inputStream, 4)).order(this.f143287f).getInt();
    }

    /* renamed from: b */
    public final int mo54134b(InputStream inputStream) {
        return ByteBuffer.wrap(m87485f(inputStream, 2)).order(this.f143287f).getShort();
    }
}
