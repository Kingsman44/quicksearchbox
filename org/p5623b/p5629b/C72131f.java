package org.p5623b.p5629b;

import java.security.AccessController;
import org.p5623b.p5629b.p5630a.C72122h;

/* renamed from: org.b.b.f */
/* compiled from: PG */
public final class C72131f {

    /* renamed from: a */
    public static final /* synthetic */ int f191961a = 0;

    static {
        try {
            String str = (String) AccessController.doPrivileged(new C72130e());
        } catch (Exception unused) {
            try {
                String.format("%n", new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public static String m105663a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static String m105664b(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int a = C72122h.m105657a(bArr, cArr);
        if (a >= 0) {
            return new String(cArr, 0, a);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    /* renamed from: c */
    public static String m105665c(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if (c >= 'A' && c <= 'Z') {
                charArray[i] = (char) (c + ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    /* renamed from: d */
    public static byte[] m105666d(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }
}
