package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.v */
/* compiled from: PG */
final class C79324v extends C79211bu {

    /* renamed from: a */
    private final String f217832a;

    /* renamed from: b */
    private final Predicate f217833b;

    public C79324v(String str, Predicate predicate) {
        this.f217832a = str;
        this.f217833b = predicate;
    }

    /* renamed from: a */
    public final Predicate mo73832a() {
        return this.f217833b;
    }

    /* renamed from: b */
    public final String mo73833b() {
        return this.f217832a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79211bu) {
            C79211bu buVar = (C79211bu) obj;
            return this.f217832a.equals(buVar.mo73833b()) && this.f217833b.equals(buVar.mo73832a());
        }
    }

    public final int hashCode() {
        return ((this.f217832a.hashCode() ^ 1000003) * 1000003) ^ this.f217833b.hashCode();
    }

    public final String toString() {
        String str = this.f217832a;
        String obj = this.f217833b.toString();
        return "Token{source=" + str + ", predicate=" + obj + "}";
    }
}
