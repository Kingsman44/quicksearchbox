package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.search.n.c.a.h.i */
/* compiled from: PG */
final class C39590i extends C39538ac {

    /* renamed from: a */
    private final String f104222a;

    /* renamed from: b */
    private final C58833ax f104223b;

    /* renamed from: c */
    private final C58833ax f104224c;

    /* renamed from: d */
    private final int f104225d;

    public C39590i(String str, C58833ax axVar, C58833ax axVar2, int i) {
        this.f104222a = str;
        this.f104223b = axVar;
        this.f104224c = axVar2;
        this.f104225d = i;
    }

    /* renamed from: a */
    public final int mo41890a() {
        return this.f104225d;
    }

    /* renamed from: b */
    public final C58833ax mo41891b() {
        return this.f104223b;
    }

    /* renamed from: c */
    public final C58833ax mo41892c() {
        return this.f104224c;
    }

    /* renamed from: d */
    public final String mo41893d() {
        return this.f104222a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39538ac) {
            C39538ac acVar = (C39538ac) obj;
            return this.f104222a.equals(acVar.mo41893d()) && this.f104223b.equals(acVar.mo41891b()) && this.f104224c.equals(acVar.mo41892c()) && this.f104225d == acVar.mo41890a();
        }
    }

    public final int hashCode() {
        return ((((((this.f104222a.hashCode() ^ 1000003) * 1000003) ^ this.f104223b.hashCode()) * 1000003) ^ this.f104224c.hashCode()) * 1000003) ^ this.f104225d;
    }

    public final String toString() {
        String str = this.f104222a;
        String valueOf = String.valueOf(this.f104223b);
        String valueOf2 = String.valueOf(this.f104224c);
        int i = this.f104225d;
        return "SodaCoreConfigParams{locale=" + str + ", hotwordModel=" + valueOf + ", speakerIdModel=" + valueOf2 + ", fixedGainMultiplier=" + i + "}";
    }
}
