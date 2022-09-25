package com.android.p266f.p267a.p268a;

import java.io.ByteArrayOutputStream;

/* renamed from: com.android.f.a.a.s */
/* compiled from: PG */
public final class C5134s {
    /* renamed from: a */
    public static final byte[] m14051a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 61) {
                int i2 = i + 1;
                try {
                    char c = (char) bArr[i2];
                    if (c == 13) {
                        i += 2;
                        if (((char) bArr[i]) != 10) {
                            c = 13;
                        }
                    }
                    int digit = Character.digit(c, 16);
                    int i3 = i2 + 1;
                    int digit2 = Character.digit((char) bArr[i3], 16);
                    if (digit != -1) {
                        if (digit2 != -1) {
                            byteArrayOutputStream.write((char) ((digit << 4) + digit2));
                            i = i3;
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                return null;
            }
            byteArrayOutputStream.write(b);
            i++;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
