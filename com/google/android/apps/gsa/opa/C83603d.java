package com.google.android.apps.gsa.opa;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.opa.d */
/* compiled from: PG */
final class C83603d extends C83573ad {

    /* renamed from: b */
    private final C58833ax f227924b;

    /* renamed from: c */
    private final String f227925c;

    public C83603d(C58833ax axVar, String str) {
        this.f227924b = axVar;
        this.f227925c = str;
    }

    /* renamed from: a */
    public final C58833ax mo76905a() {
        return this.f227924b;
    }

    /* renamed from: b */
    public final String mo76906b() {
        return this.f227925c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C83573ad) {
            C83573ad adVar = (C83573ad) obj;
            return this.f227924b.equals(adVar.mo76905a()) && this.f227925c.equals(adVar.mo76906b());
        }
    }

    public final int hashCode() {
        return ((this.f227924b.hashCode() ^ 1000003) * 1000003) ^ this.f227925c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f227924b);
        String str = this.f227925c;
        return "FinishSetupBarInfo{finishSetupBarType=" + valueOf + ", finishSetupBarDescription=" + str + "}";
    }
}
