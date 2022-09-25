package org.p5623b.p5629b.p5630a;

import java.io.ByteArrayOutputStream;

/* renamed from: org.b.b.a.a */
/* compiled from: PG */
public final class C72115a {

    /* renamed from: a */
    private static final C72118d f191946a = new C72116b();

    /* renamed from: a */
    public static byte[] m105652a(byte[] bArr) {
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((length + 2) / 3) * 4);
        try {
            C72118d dVar = f191946a;
            int i = length % 3;
            int i2 = length - i;
            for (int i3 = 0; i3 < i2; i3 += 3) {
                byte b = bArr[i3] & 255;
                byte b2 = bArr[i3 + 1] & 255;
                byte b3 = bArr[i3 + 2] & 255;
                byteArrayOutputStream.write(((C72116b) dVar).f191947a[b >>> 2]);
                byteArrayOutputStream.write(((C72116b) dVar).f191947a[((b << 4) | (b2 >>> 4)) & 63]);
                byteArrayOutputStream.write(((C72116b) dVar).f191947a[((b2 << 2) | (b3 >>> 6)) & 63]);
                byteArrayOutputStream.write(((C72116b) dVar).f191947a[b3 & 63]);
            }
            if (i == 1) {
                byte b4 = bArr[i2] & 255;
                byteArrayOutputStream.write(((C72116b) dVar).f191947a[b4 >>> 2]);
                byteArrayOutputStream.write(((C72116b) dVar).f191947a[(b4 << 4) & 63]);
                byteArrayOutputStream.write(((C72116b) dVar).f191948b);
                byteArrayOutputStream.write(((C72116b) dVar).f191948b);
            } else if (i == 2) {
                byte b5 = bArr[i2] & 255;
                byte b6 = bArr[i2 + 1] & 255;
                byteArrayOutputStream.write(((C72116b) dVar).f191947a[b5 >>> 2]);
                byteArrayOutputStream.write(((C72116b) dVar).f191947a[((b5 << 4) | (b6 >>> 4)) & 63]);
                byteArrayOutputStream.write(((C72116b) dVar).f191947a[(b6 << 2) & 63]);
                byteArrayOutputStream.write(((C72116b) dVar).f191948b);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new C72119e("exception encoding base64 string: ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
