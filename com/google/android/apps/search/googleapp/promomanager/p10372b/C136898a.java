package com.google.android.apps.search.googleapp.promomanager.p10372b;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.a */
/* compiled from: PG */
final class C136898a extends C137018m {

    /* renamed from: a */
    private final C137007dh f372600a;

    /* renamed from: b */
    private final boolean f372601b;

    public C136898a(C137007dh dhVar, boolean z) {
        if (dhVar != null) {
            this.f372600a = dhVar;
            this.f372601b = z;
            return;
        }
        throw new NullPointerException("Null promoContent");
    }

    /* renamed from: a */
    public final C137007dh mo113433a() {
        return this.f372600a;
    }

    /* renamed from: b */
    public final boolean mo113434b() {
        return this.f372601b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C137018m) {
            C137018m mVar = (C137018m) obj;
            return this.f372600a.equals(mVar.mo113433a()) && this.f372601b == mVar.mo113434b();
        }
    }

    public final int hashCode() {
        return ((this.f372600a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f372601b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f372600a.toString();
        boolean z = this.f372601b;
        return "PromoWithCondition{promoContent=" + obj + ", meetsTriggeringConditions=" + z + "}";
    }
}
