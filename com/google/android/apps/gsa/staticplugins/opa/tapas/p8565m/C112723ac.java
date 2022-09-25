package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.ac */
/* compiled from: PG */
final class C112723ac extends C112746az {

    /* renamed from: a */
    private final C113321r f312475a;

    /* renamed from: b */
    private final int f312476b;

    public C112723ac(int i, C113321r rVar) {
        this.f312476b = i;
        if (rVar != null) {
            this.f312475a = rVar;
            return;
        }
        throw new NullPointerException("Null contact");
    }

    /* renamed from: a */
    public final C113321r mo99687a() {
        return this.f312475a;
    }

    /* renamed from: b */
    public final int mo99688b() {
        return this.f312476b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C112746az) {
            C112746az azVar = (C112746az) obj;
            return this.f312476b == azVar.mo99688b() && this.f312475a.equals(azVar.mo99687a());
        }
    }

    public final int hashCode() {
        return ((this.f312476b ^ 1000003) * 1000003) ^ this.f312475a.hashCode();
    }

    public final String toString() {
        int i = this.f312476b;
        String str = i != 1 ? i != 2 ? "TELEPHONY_NON_PRIMARY" : "TELEPHONY_PRIMARY" : "THIRD_PARTY";
        String obj = this.f312475a.toString();
        return "Item{viewType=" + str + ", contact=" + obj + "}";
    }
}
