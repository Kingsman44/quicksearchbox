package com.google.common.base;

import java.io.Serializable;
import java.util.Set;

/* renamed from: com.google.common.base.ax */
/* compiled from: PG */
public abstract class C58833ax implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: i */
    public static C58833ax m90832i() {
        return C58836b.f156633a;
    }

    /* renamed from: j */
    public static C58833ax m90833j(Object obj) {
        return obj == null ? C58836b.f156633a : new C58847bk(obj);
    }

    /* renamed from: k */
    public static C58833ax m90834k(Object obj) {
        obj.getClass();
        return new C58847bk(obj);
    }

    /* renamed from: a */
    public abstract C58833ax mo56105a(C58833ax axVar);

    /* renamed from: b */
    public abstract C58833ax mo56106b(C58817ah ahVar);

    /* renamed from: c */
    public abstract Object mo56107c();

    /* renamed from: d */
    public abstract Object mo56108d(C58881cr crVar);

    /* renamed from: e */
    public abstract Object mo56109e(Object obj);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract Object mo56111f();

    /* renamed from: g */
    public abstract Set mo56112g();

    /* renamed from: h */
    public abstract boolean mo56113h();

    public abstract int hashCode();

    public abstract String toString();
}
