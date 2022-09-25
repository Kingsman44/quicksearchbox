package com.google.common.p4526f.p4534f;

import java.io.PrintStream;

/* renamed from: com.google.common.f.f.f */
/* compiled from: PG */
public final class C59085f {
    private C59085f() {
    }

    /* renamed from: a */
    public static void m91354a(String str, Object... objArr) {
        PrintStream printStream = System.err;
        String obj = C59085f.class.toString();
        String format = String.format(str, objArr);
        printStream.println(obj + ": " + format);
    }
}
