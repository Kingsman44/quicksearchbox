package com.google.common.base;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.common.base.bk */
/* compiled from: PG */
public final class C58847bk extends C58833ax {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final Object f156646a;

    public C58847bk(Object obj) {
        this.f156646a = obj;
    }

    /* renamed from: a */
    public final C58833ax mo56105a(C58833ax axVar) {
        axVar.getClass();
        return this;
    }

    /* renamed from: b */
    public final C58833ax mo56106b(C58817ah ahVar) {
        Object apply = ahVar.apply(this.f156646a);
        C58838bb.m90866a(apply, "the Function passed to Optional.transform() must not return null.");
        return new C58847bk(apply);
    }

    /* renamed from: c */
    public final Object mo56107c() {
        return this.f156646a;
    }

    /* renamed from: d */
    public final Object mo56108d(C58881cr crVar) {
        crVar.getClass();
        return this.f156646a;
    }

    /* renamed from: e */
    public final Object mo56109e(Object obj) {
        C58838bb.m90866a(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.f156646a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C58847bk) {
            return this.f156646a.equals(((C58847bk) obj).f156646a);
        }
        return false;
    }

    /* renamed from: f */
    public final Object mo56111f() {
        return this.f156646a;
    }

    /* renamed from: g */
    public final Set mo56112g() {
        return Collections.singleton(this.f156646a);
    }

    /* renamed from: h */
    public final boolean mo56113h() {
        return true;
    }

    public final int hashCode() {
        return this.f156646a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f156646a + ")";
    }
}
