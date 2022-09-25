package com.google.p5238v.p5239a.p5259m;

/* renamed from: com.google.v.a.m.av */
/* compiled from: PG */
public final class C67849av {
    /* renamed from: a */
    public static String m98040a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r1 + r1);
        for (byte b : bArr) {
            byte b2 = b & 255;
            sb.append("0123456789abcdef".charAt(b2 >> 4));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static byte[] m98041b(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i + i;
                int digit = Character.digit(str.charAt(i2), 16);
                int digit2 = Character.digit(str.charAt(i2 + 1), 16);
                if (digit == -1 || digit2 == -1) {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
                bArr[i] = (byte) ((digit * 16) + digit2);
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }
}
