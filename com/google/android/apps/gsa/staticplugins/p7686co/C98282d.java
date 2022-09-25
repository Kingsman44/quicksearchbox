package com.google.android.apps.gsa.staticplugins.p7686co;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.d */
/* compiled from: PG */
final class C98282d extends C98147ac {

    /* renamed from: a */
    private final C58485gu f274368a;

    /* renamed from: b */
    private final C58485gu f274369b;

    /* renamed from: c */
    private final C58485gu f274370c;

    public C98282d(C58485gu guVar, C58485gu guVar2, C58485gu guVar3) {
        this.f274368a = guVar;
        this.f274369b = guVar2;
        this.f274370c = guVar3;
    }

    /* renamed from: a */
    public final C58485gu mo90990a() {
        return this.f274368a;
    }

    /* renamed from: b */
    public final C58485gu mo90991b() {
        return this.f274369b;
    }

    /* renamed from: c */
    public final C58485gu mo90992c() {
        return this.f274370c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C98147ac) {
            C98147ac acVar = (C98147ac) obj;
            return C58597ky.m90218i(this.f274368a, acVar.mo90990a()) && C58597ky.m90218i(this.f274369b, acVar.mo90991b()) && C58597ky.m90218i(this.f274370c, acVar.mo90992c());
        }
    }

    public final int hashCode() {
        return ((((this.f274368a.hashCode() ^ 1000003) * 1000003) ^ this.f274369b.hashCode()) * 1000003) ^ this.f274370c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f274368a);
        String valueOf2 = String.valueOf(this.f274369b);
        String valueOf3 = String.valueOf(this.f274370c);
        return "RegistrationChangeResult{deleted=" + valueOf + ", noChange=" + valueOf2 + ", upserted=" + valueOf3 + "}";
    }
}
