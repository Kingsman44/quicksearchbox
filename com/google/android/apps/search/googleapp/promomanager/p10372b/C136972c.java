package com.google.android.apps.search.googleapp.promomanager.p10372b;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.c */
/* compiled from: PG */
final class C136972c extends C137028w {

    /* renamed from: a */
    private final C137007dh f372777a;

    /* renamed from: b */
    private final boolean f372778b;

    public C136972c(C137007dh dhVar, boolean z) {
        if (dhVar != null) {
            this.f372777a = dhVar;
            this.f372778b = z;
            return;
        }
        throw new NullPointerException("Null promoContent");
    }

    /* renamed from: a */
    public final C137007dh mo113468a() {
        return this.f372777a;
    }

    /* renamed from: b */
    public final boolean mo113469b() {
        return this.f372778b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C137028w) {
            C137028w wVar = (C137028w) obj;
            return this.f372777a.equals(wVar.mo113468a()) && this.f372778b == wVar.mo113469b();
        }
    }

    public final int hashCode() {
        return ((this.f372777a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f372778b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f372777a.toString();
        boolean z = this.f372778b;
        return "PromoWithCondition{promoContent=" + obj + ", meetsTriggeringConditions=" + z + "}";
    }
}
