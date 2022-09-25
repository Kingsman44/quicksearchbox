package com.google.common.p4522b;

/* renamed from: com.google.common.b.co */
/* compiled from: PG */
public final class C58371co {
    /* renamed from: a */
    public static void m89406a(Object obj, Object obj2) {
        if (obj == null) {
            new StringBuilder("null key in entry: null=").append(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    /* renamed from: b */
    static void m89407b(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException(str + " must be positive but was: " + i);
        }
    }

    /* renamed from: c */
    static void m89408c(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
        }
    }
}
