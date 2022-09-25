package com.google.android.apps.gsa.search.core.p6513aj;

import com.google.android.apps.gsa.shared.util.C90772bp;

/* renamed from: com.google.android.apps.gsa.search.core.aj.au */
/* compiled from: PG */
public final class C84536au {

    /* renamed from: a */
    public final Object[] f230054a = new Object[512];

    /* renamed from: b */
    public static final int m135187b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 = (i3 * 31) + (bArr[i4] & 255);
        }
        int i5 = ((i3 >>> 20) ^ (i3 >>> 12)) ^ i3;
        return (i5 ^ ((i5 >>> 7) ^ (i5 >>> 4))) & 511;
    }

    /* renamed from: c */
    public static final byte[] m135188c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        if (i2 != 0) {
            System.arraycopy(bArr, i, bArr2, 0, i2);
        }
        return bArr2;
    }

    /* renamed from: a */
    public final String mo78244a(byte[] bArr, int i, int i2) {
        if (i2 > 512) {
            return new String(bArr, i, i2, C90772bp.f253863a);
        }
        int b = m135187b(bArr, i, i2);
        Object obj = this.f230054a[b];
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == i2) {
                int i3 = 0;
                while (i3 < i2) {
                    if (bArr[i + i3] == str.charAt(i3)) {
                        i3++;
                    }
                }
                return str;
            }
        }
        String str2 = new String(bArr, i, i2, C90772bp.f253863a);
        if (str2.length() == i2) {
            this.f230054a[b] = str2;
        }
        return str2;
    }
}
