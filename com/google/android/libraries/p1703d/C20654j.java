package com.google.android.libraries.p1703d;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.d.j */
/* compiled from: PG */
public final class C20654j extends C20641ae {

    /* renamed from: a */
    private final C58485gu f57912a;

    /* renamed from: b */
    private final C58485gu f57913b;

    public C20654j(C58485gu guVar, C58485gu guVar2) {
        this.f57912a = guVar;
        this.f57913b = guVar2;
    }

    /* renamed from: a */
    public final C58485gu mo25589a() {
        return this.f57912a;
    }

    /* renamed from: b */
    public final C58485gu mo25590b() {
        return this.f57913b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20641ae) {
            C20641ae aeVar = (C20641ae) obj;
            return C58597ky.m90218i(this.f57912a, aeVar.mo25589a()) && C58597ky.m90218i(this.f57913b, aeVar.mo25590b());
        }
    }

    public final int hashCode() {
        return ((this.f57912a.hashCode() ^ 1000003) * 1000003) ^ this.f57913b.hashCode();
    }

    public final String toString() {
        String obj = this.f57912a.toString();
        String obj2 = this.f57913b.toString();
        return "CctTopBarButtons{cctActionButtons=" + obj + ", cctMenuButtons=" + obj2 + "}";
    }
}
