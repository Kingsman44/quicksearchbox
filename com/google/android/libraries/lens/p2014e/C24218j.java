package com.google.android.libraries.lens.p2014e;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.e.j */
/* compiled from: PG */
final class C24218j extends C24201ad {

    /* renamed from: a */
    private final C24203af f66245a;

    /* renamed from: b */
    private final C24202ae f66246b;

    /* renamed from: c */
    private final C24205ah f66247c;

    /* renamed from: d */
    private final C24227s f66248d;

    /* renamed from: e */
    private final C58833ax f66249e;

    public C24218j(C24203af afVar, C24202ae aeVar, C24205ah ahVar, C24227s sVar, C58833ax axVar) {
        this.f66245a = afVar;
        this.f66246b = aeVar;
        this.f66247c = ahVar;
        this.f66248d = sVar;
        this.f66249e = axVar;
    }

    /* renamed from: a */
    public final C24227s mo29678a() {
        return this.f66248d;
    }

    /* renamed from: b */
    public final C24202ae mo29679b() {
        return this.f66246b;
    }

    /* renamed from: c */
    public final C24203af mo29680c() {
        return this.f66245a;
    }

    /* renamed from: d */
    public final C24205ah mo29681d() {
        return this.f66247c;
    }

    /* renamed from: e */
    public final C58833ax mo29682e() {
        return this.f66249e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24201ad) {
            C24201ad adVar = (C24201ad) obj;
            return this.f66245a.equals(adVar.mo29680c()) && this.f66246b.equals(adVar.mo29679b()) && this.f66247c.equals(adVar.mo29681d()) && this.f66248d.equals(adVar.mo29678a()) && this.f66249e.equals(adVar.mo29682e());
        }
    }

    public final int hashCode() {
        return ((((((((this.f66245a.hashCode() ^ 1000003) * 1000003) ^ this.f66246b.hashCode()) * 1000003) ^ this.f66247c.hashCode()) * 1000003) ^ this.f66248d.hashCode()) * 1000003) ^ this.f66249e.hashCode();
    }

    public final String toString() {
        String obj = this.f66245a.toString();
        String obj2 = this.f66246b.toString();
        String obj3 = this.f66247c.toString();
        String obj4 = this.f66248d.toString();
        String valueOf = String.valueOf(this.f66249e);
        return "LensQuery{queryId=" + obj + ", context=" + obj2 + ", metadata=" + obj3 + ", image=" + obj4 + ", interaction=" + valueOf + "}";
    }
}
