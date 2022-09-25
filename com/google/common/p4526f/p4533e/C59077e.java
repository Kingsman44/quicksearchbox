package com.google.common.p4526f.p4533e;

/* renamed from: com.google.common.f.e.e */
/* compiled from: PG */
public final class C59077e extends RuntimeException {
    public C59077e(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C59077e m91339a(String str, String str2, int i) {
        return new C59077e(m91342d(str, str2, i, i + 1));
    }

    /* renamed from: b */
    public static C59077e m91340b(String str, String str2, int i, int i2) {
        return new C59077e(m91342d(str, str2, i, i2));
    }

    /* renamed from: c */
    public static C59077e m91341c(String str, String str2, int i) {
        return new C59077e(m91342d(str, str2, i, -1));
    }

    /* renamed from: d */
    private static String m91342d(String str, String str2, int i, int i2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(": ");
        if (i > 8) {
            sb.append("...");
            sb.append(str2, i - 5, i);
        } else {
            sb.append(str2, 0, i);
        }
        sb.append('[');
        sb.append(str2.substring(i, i2));
        sb.append(']');
        if (str2.length() - i2 > 8) {
            sb.append(str2, i2, i2 + 5);
            sb.append("...");
        } else {
            sb.append(str2, i2, str2.length());
        }
        return sb.toString();
    }

    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
