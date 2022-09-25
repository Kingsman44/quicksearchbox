package com.google.common.base;

/* renamed from: com.google.common.base.dc */
/* compiled from: PG */
public final class C58893dc {
    /* renamed from: a */
    public static Object m90996a(Object obj) {
        Object[] objArr = new Object[0];
        if (obj != null) {
            return obj;
        }
        throw new C58894dd(C58880cq.m90965a("expected a non-null reference", objArr));
    }

    /* renamed from: b */
    public static void m90997b(boolean z) {
        if (!z) {
            throw new C58894dd();
        }
    }

    /* renamed from: c */
    public static void m90998c(boolean z, String str, Object obj) {
        if (!z) {
            throw new C58894dd(C58880cq.m90965a(str, obj));
        }
    }

    /* renamed from: d */
    public static void m90999d(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new C58894dd(C58880cq.m90965a(str, objArr));
        }
    }
}
