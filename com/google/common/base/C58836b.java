package com.google.common.base;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.common.base.b */
/* compiled from: PG */
public final class C58836b extends C58833ax {

    /* renamed from: a */
    public static final C58836b f156633a = new C58836b();
    private static final long serialVersionUID = 0;

    private C58836b() {
    }

    private Object readResolve() {
        return f156633a;
    }

    /* renamed from: a */
    public final C58833ax mo56105a(C58833ax axVar) {
        axVar.getClass();
        return axVar;
    }

    /* renamed from: b */
    public final C58833ax mo56106b(C58817ah ahVar) {
        ahVar.getClass();
        return f156633a;
    }

    /* renamed from: c */
    public final Object mo56107c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    /* renamed from: d */
    public final Object mo56108d(C58881cr crVar) {
        Object a = crVar.mo6453a();
        C58838bb.m90866a(a, "use Optional.orNull() instead of a Supplier that returns null");
        return a;
    }

    /* renamed from: e */
    public final Object mo56109e(Object obj) {
        C58838bb.m90866a(obj, "use Optional.orNull() instead of Optional.or(null)");
        return obj;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    /* renamed from: f */
    public final Object mo56111f() {
        return null;
    }

    /* renamed from: g */
    public final Set mo56112g() {
        return Collections.emptySet();
    }

    /* renamed from: h */
    public final boolean mo56113h() {
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
