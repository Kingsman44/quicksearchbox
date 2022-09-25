package com.google.common.p4526f.p4534f;

/* renamed from: com.google.common.f.f.a */
/* compiled from: PG */
public final class C59080a {

    /* renamed from: a */
    private static final String[] f157043a;

    /* renamed from: b */
    private static final C59084e f157044b;

    static {
        C59084e gVar;
        String[] strArr = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
        f157043a = strArr;
        int i = 0;
        while (true) {
            if (i >= 2) {
                gVar = new C59086g();
                break;
            }
            try {
                gVar = (C59084e) Class.forName(strArr[i]).asSubclass(C59084e.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                gVar = null;
            }
            if (gVar != null) {
                break;
            }
            i++;
        }
        f157044b = gVar;
    }

    /* renamed from: a */
    public static StackTraceElement m91347a(Class cls, int i) {
        C59081b.m91349a(cls, "target");
        if (i >= 0) {
            return f157044b.mo56344a(cls, i + 1);
        }
        throw new IllegalArgumentException("skip count cannot be negative: " + i);
    }

    /* renamed from: b */
    public static StackTraceElement[] m91348b(Class cls, int i, int i2) {
        if (i > 0 || i == -1) {
            return f157044b.mo56345b(cls, i, i2 + 1);
        }
        throw new IllegalArgumentException("invalid maximum depth: 0");
    }
}
