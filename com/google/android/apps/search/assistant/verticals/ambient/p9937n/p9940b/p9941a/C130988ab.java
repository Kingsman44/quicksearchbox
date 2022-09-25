package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.ab */
/* compiled from: PG */
final class C130988ab extends C131070y {

    /* renamed from: a */
    private final C58485gu f358378a;

    /* renamed from: b */
    private final Boolean f358379b;

    public C130988ab(C58485gu guVar, Boolean bool) {
        if (guVar != null) {
            this.f358378a = guVar;
            this.f358379b = bool;
            return;
        }
        throw new NullPointerException("Null applications");
    }

    /* renamed from: a */
    public final C58485gu mo110021a() {
        return this.f358378a;
    }

    /* renamed from: b */
    public final Boolean mo110022b() {
        return this.f358379b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C131070y) {
            C131070y yVar = (C131070y) obj;
            return C58597ky.m90218i(this.f358378a, yVar.mo110021a()) && this.f358379b.equals(yVar.mo110022b());
        }
    }

    public final int hashCode() {
        return ((this.f358378a.hashCode() ^ 1000003) * 1000003) ^ this.f358379b.hashCode();
    }

    public final String toString() {
        String obj = this.f358378a.toString();
        Boolean bool = this.f358379b;
        return "HeadphoneApplications{applications=" + obj + ", usesDefaultApps=" + bool + "}";
    }
}
