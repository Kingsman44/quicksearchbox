package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.p375ai.p378b.C7744ii;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.d */
/* compiled from: PG */
final class C98122d extends C98059an {

    /* renamed from: a */
    private final boolean f273988a;

    /* renamed from: b */
    private final C7744ii f273989b;

    public C98122d(boolean z, C7744ii iiVar) {
        this.f273988a = z;
        this.f273989b = iiVar;
    }

    /* renamed from: a */
    public final C7744ii mo90911a() {
        return this.f273989b;
    }

    /* renamed from: b */
    public final boolean mo90912b() {
        return this.f273988a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C98059an) {
            C98059an anVar = (C98059an) obj;
            return this.f273988a == anVar.mo90912b() && this.f273989b.equals(anVar.mo90911a());
        }
    }

    public final int hashCode() {
        return (((true != this.f273988a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f273989b.hashCode();
    }

    public final String toString() {
        boolean z = this.f273988a;
        String obj = this.f273989b.toString();
        return "UnparkResult{hasUnparks=" + z + ", entryTree=" + obj + "}";
    }
}
