package com.google.common.p4526f.p4528b.p4530b;

import com.google.common.p4526f.C58978ac;
import com.google.common.p4526f.C59095o;
import com.google.common.p4526f.p4528b.C59010ae;
import com.google.common.p4526f.p4534f.C59080a;

/* renamed from: com.google.common.f.b.b.j */
/* compiled from: PG */
public final class C59026j extends C59010ae {

    /* renamed from: a */
    public static final C59010ae f156938a = new C59026j();

    private C59026j() {
    }

    /* renamed from: a */
    public final C59095o mo56252a(Class cls, int i) {
        StackTraceElement a = C59080a.m91347a(cls, i + 1);
        return a != null ? new C58978ac(a) : C59095o.f157068a;
    }

    /* renamed from: b */
    public final String mo56253b(Class cls) {
        StackTraceElement a = C59080a.m91347a(cls, 1);
        if (a != null) {
            return a.getClassName();
        }
        throw new IllegalStateException("no caller found on the stack for: ".concat(String.valueOf(cls.getName())));
    }

    public final String toString() {
        return "Default stack-based caller finder";
    }
}
