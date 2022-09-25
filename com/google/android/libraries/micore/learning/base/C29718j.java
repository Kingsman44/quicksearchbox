package com.google.android.libraries.micore.learning.base;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* renamed from: com.google.android.libraries.micore.learning.base.j */
/* compiled from: PG */
public final class C29718j {

    /* renamed from: c */
    private static final C58485gu f80483c = C58485gu.m89834D("OK", "CANCELLED", "UNKNOWN", "INVALID_ARGUMENT", "DEADLINE_EXCEEDED", "NOT_FOUND", "ALREADY_EXISTS", "PERMISSION_DENIED", "RESOURCE_EXHAUSTED", "FAILED_PRECONDITION", "ABORTED", "OUT_OF_RANGE", "UNIMPLEMENTED", "INTERNAL", "UNAVAILABLE", "DATA_LOSS", "UNAUTHENTICATED");

    /* renamed from: a */
    public final int f80484a;

    /* renamed from: b */
    public final String f80485b;

    public C29718j(int i, String str) {
        this.f80484a = i;
        this.f80485b = str;
    }

    /* renamed from: a */
    public static C29718j m54811a(int i, String str, Object... objArr) {
        return new C29718j(i, String.format(str, objArr));
    }

    public final String toString() {
        if (this.f80485b == null) {
            return m54812b(this.f80484a);
        }
        return String.format("%s: %s", new Object[]{m54812b(this.f80484a), this.f80485b});
    }

    /* renamed from: b */
    public static String m54812b(int i) {
        if (i >= 0) {
            C58485gu guVar = f80483c;
            if (i < ((C58724pq) guVar).f156474d) {
                return (String) guVar.get(i);
            }
        }
        return "#" + i;
    }
}
