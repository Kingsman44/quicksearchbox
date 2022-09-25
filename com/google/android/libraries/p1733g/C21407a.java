package com.google.android.libraries.p1733g;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.g.a */
/* compiled from: PG */
public final class C21407a {

    /* renamed from: a */
    private static final char[] f59882a = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public static String m40530a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            char[] cArr2 = f59882a;
            char c = cArr2[(b >> 4) & 15];
            char c2 = cArr2[b & 15];
            int i2 = i + i;
            cArr[i2] = c;
            cArr[i2 + 1] = c2;
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static byte[] m40531b(CharSequence charSequence) {
        byte[] bArr = new byte[((charSequence.length() + 1) / 2)];
        if (charSequence.length() == 0) {
            return bArr;
        }
        bArr[0] = 0;
        int length = charSequence.length() % 2;
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            C58838bb.m90869d((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'f') || (charAt >= 'A' && charAt <= 'F'), "string contains non-hex chars");
            if (length % 2 == 0) {
                bArr[length >> 1] = (byte) (m40532c(charAt) << 4);
            } else {
                int i2 = length >> 1;
                bArr[i2] = (byte) (bArr[i2] + ((byte) m40532c(charAt)));
            }
            length++;
        }
        return bArr;
    }

    /* renamed from: c */
    private static int m40532c(char c) {
        return (c < '0' || c > '9') ? (c < 'a' || c > 'f') ? c - '7' : c - 'W' : c - '0';
    }
}
