package com.google.android.gms.libs.p10830b.p10832b;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.gms.libs.b.b.c */
/* compiled from: PG */
public final class C144842c extends C144847h {

    /* renamed from: a */
    private final C58833ax f391693a;

    /* renamed from: b */
    private final C58833ax f391694b;

    public C144842c(C58833ax axVar, C58833ax axVar2) {
        this.f391693a = axVar;
        this.f391694b = axVar2;
    }

    /* renamed from: a */
    public final C58833ax mo120273a() {
        return this.f391693a;
    }

    /* renamed from: b */
    public final C58833ax mo120274b() {
        return this.f391694b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C144847h) {
            C144847h hVar = (C144847h) obj;
            return this.f391693a.equals(hVar.mo120273a()) && this.f391694b.equals(hVar.mo120274b());
        }
    }

    public final int hashCode() {
        return ((this.f391693a.hashCode() ^ 1000003) * 1000003) ^ this.f391694b.hashCode();
    }

    public final String toString() {
        String obj = this.f391693a.toString();
        String obj2 = this.f391694b.toString();
        return "Identifiers{androidId=" + obj + ", ssaidDerivative=" + obj2 + "}";
    }
}
