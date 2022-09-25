package com.google.common.p4525e;

/* renamed from: com.google.common.e.d */
/* compiled from: PG */
public abstract class C58956d extends C58959g {
    protected C58956d() {
    }

    /* renamed from: c */
    private static char[] m91109c(char[] cArr, int i, int i2) {
        if (i2 >= 0) {
            char[] cArr2 = new char[i2];
            if (i > 0) {
                System.arraycopy(cArr, 0, cArr2, 0, i);
            }
            return cArr2;
        }
        throw new AssertionError("Cannot increase internal buffer any further");
    }

    /* renamed from: a */
    public String mo56216a(String str) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract char[] mo56217b(char c);

    /* renamed from: d */
    public final String mo56219d(String str, int i) {
        int length = str.length();
        char[] a = C58963k.m91120a();
        int length2 = a.length;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            char[] b = mo56217b(str.charAt(i));
            if (b != null) {
                int length3 = b.length;
                int i4 = i - i2;
                int i5 = i3 + i4;
                int i6 = i5 + length3;
                if (length2 < i6) {
                    int i7 = length - i;
                    length2 = i7 + i7 + i6;
                    a = m91109c(a, i3, length2);
                }
                if (i4 > 0) {
                    str.getChars(i2, i, a, i3);
                    i3 = i5;
                }
                if (length3 > 0) {
                    System.arraycopy(b, 0, a, i3, length3);
                    i3 += length3;
                }
                i2 = i + 1;
            }
            i++;
        }
        int i8 = length - i2;
        if (i8 > 0) {
            int i9 = i8 + i3;
            if (length2 < i9) {
                a = m91109c(a, i3, i9);
            }
            str.getChars(i2, length, a, i3);
            i3 = i9;
        }
        return new String(a, 0, i3);
    }
}
