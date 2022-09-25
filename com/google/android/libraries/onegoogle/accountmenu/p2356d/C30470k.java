package com.google.android.libraries.onegoogle.accountmenu.p2356d;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.d.k */
/* compiled from: PG */
final class C30470k extends C30474o {

    /* renamed from: a */
    public final C30480u f82321a;

    /* renamed from: b */
    public final boolean f82322b;

    /* renamed from: c */
    public final boolean f82323c;

    /* renamed from: d */
    public final boolean f82324d;

    /* renamed from: e */
    public final C58485gu f82325e;

    public C30470k(C30480u uVar, boolean z, boolean z2, boolean z3, C58485gu guVar) {
        this.f82321a = uVar;
        this.f82322b = z;
        this.f82323c = z2;
        this.f82324d = z3;
        this.f82325e = guVar;
    }

    /* renamed from: a */
    public final C30473n mo36089a() {
        return new C30469j(this);
    }

    /* renamed from: b */
    public final C30480u mo36090b() {
        return this.f82321a;
    }

    /* renamed from: c */
    public final C58485gu mo36091c() {
        return this.f82325e;
    }

    /* renamed from: d */
    public final boolean mo36092d() {
        return this.f82323c;
    }

    /* renamed from: e */
    public final boolean mo36093e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30474o) {
            C30474o oVar = (C30474o) obj;
            return this.f82321a.equals(oVar.mo36090b()) && this.f82322b == oVar.mo36096g() && this.f82323c == oVar.mo36092d() && !oVar.mo36093e() && this.f82324d == oVar.mo36095f() && C58597ky.m90218i(this.f82325e, oVar.mo36091c());
        }
    }

    /* renamed from: f */
    public final boolean mo36095f() {
        return this.f82324d;
    }

    /* renamed from: g */
    public final boolean mo36096g() {
        return this.f82322b;
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((this.f82321a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f82322b ? 1237 : 1231)) * 1000003) ^ (true != this.f82323c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003;
        if (true != this.f82324d) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f82325e.hashCode();
    }

    public final String toString() {
        String obj = this.f82321a.toString();
        boolean z = this.f82322b;
        boolean z2 = this.f82323c;
        boolean z3 = this.f82324d;
        String valueOf = String.valueOf(this.f82325e);
        return "Configuration{restrictedConfiguration=" + obj + ", showUseWithoutAnAccount=" + z + ", allowRingsInternal=" + z2 + ", showMyGoogleChipInEmbeddedMenuHeader=false, showSwitchProfileAction=" + z3 + ", appSpecificActionSpecs=" + valueOf + "}";
    }
}
