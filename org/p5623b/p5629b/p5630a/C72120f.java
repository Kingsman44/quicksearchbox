package org.p5623b.p5629b.p5630a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.p5623b.p5629b.C72131f;

/* renamed from: org.b.b.a.f */
/* compiled from: PG */
public final class C72120f {

    /* renamed from: a */
    private static final C72121g f191952a = new C72121g();

    /* renamed from: a */
    public static String m105653a(byte[] bArr) {
        return C72131f.m105663a(m105656d(bArr, bArr.length));
    }

    /* renamed from: b */
    public static byte[] m105654b(byte[] bArr) {
        return m105656d(bArr, bArr.length);
    }

    /* renamed from: c */
    public static byte[] m105655c(String str, int i) {
        try {
            C72121g gVar = f191952a;
            if (i < 0 || str.length() - i <= 0) {
                throw new IndexOutOfBoundsException("invalid offset and/or length specified");
            } else if ((i & 1) == 0) {
                int i2 = 1;
                int i3 = i >>> 1;
                byte[] bArr = new byte[i3];
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = i2 + 1;
                    int i6 = i5 + 1;
                    byte b = (gVar.f191954b[str.charAt(i2)] << 4) | gVar.f191954b[str.charAt(i5)];
                    if (b >= 0) {
                        bArr[i4] = (byte) b;
                        i4++;
                        i2 = i6;
                    } else {
                        throw new IOException("invalid characters encountered in Hex string");
                    }
                }
                return bArr;
            } else {
                throw new IOException("a hexadecimal encoding must have an even number of characters");
            }
        } catch (Exception e) {
            throw new C72117c("exception decoding Hex string: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    /* renamed from: d */
    public static byte[] m105656d(byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C72121g gVar = f191952a;
            for (int i2 = 0; i2 < i; i2++) {
                byte b = bArr[i2] & 255;
                byteArrayOutputStream.write(gVar.f191953a[b >>> 4]);
                byteArrayOutputStream.write(gVar.f191953a[b & 15]);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new C72119e("exception encoding Hex string: ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
