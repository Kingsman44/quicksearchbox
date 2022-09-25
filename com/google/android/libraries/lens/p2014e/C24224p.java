package com.google.android.libraries.lens.p2014e;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.e.p */
/* compiled from: PG */
final class C24224p extends C24208ak {

    /* renamed from: a */
    public final C24203af f66261a;

    /* renamed from: b */
    public final C24229u f66262b;

    /* renamed from: c */
    public final C58833ax f66263c;

    public C24224p(C24203af afVar, C24229u uVar, C58833ax axVar) {
        this.f66261a = afVar;
        this.f66262b = uVar;
        this.f66263c = axVar;
    }

    /* renamed from: a */
    public final C24229u mo29696a() {
        return this.f66262b;
    }

    /* renamed from: b */
    public final C24203af mo29697b() {
        return this.f66261a;
    }

    /* renamed from: c */
    public final C24207aj mo29698c() {
        return new C24223o(this);
    }

    /* renamed from: d */
    public final C58833ax mo29699d() {
        return this.f66263c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24208ak) {
            C24208ak akVar = (C24208ak) obj;
            return this.f66261a.equals(akVar.mo29697b()) && this.f66262b.equals(akVar.mo29696a()) && this.f66263c.equals(akVar.mo29699d());
        }
    }

    public final int hashCode() {
        return ((((this.f66261a.hashCode() ^ 1000003) * 1000003) ^ this.f66262b.hashCode()) * 1000003) ^ this.f66263c.hashCode();
    }

    public final String toString() {
        String obj = this.f66261a.toString();
        String obj2 = this.f66262b.toString();
        String valueOf = String.valueOf(this.f66263c);
        return "LensResult{queryId=" + obj + ", imageResult=" + obj2 + ", interactionResult=" + valueOf + "}";
    }
}
