package com.google.common.p4525e;

/* renamed from: com.google.common.e.p */
/* compiled from: PG */
public class C58968p extends C58959g {
    protected C58968p() {
    }

    /* renamed from: b */
    public static char[] m91125b(char[] cArr, int i, int i2) {
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
    public final String mo56216a(String str) {
        throw null;
    }
}
