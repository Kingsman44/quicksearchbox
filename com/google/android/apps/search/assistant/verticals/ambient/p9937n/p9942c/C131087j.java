package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.c.j */
/* compiled from: PG */
final class C131087j extends C131090m {

    /* renamed from: a */
    private final C58485gu f358555a;

    /* renamed from: b */
    private final int f358556b;

    public C131087j(C58485gu guVar, int i) {
        this.f358555a = guVar;
        this.f358556b = i;
    }

    /* renamed from: a */
    public final int mo110066a() {
        return this.f358556b;
    }

    /* renamed from: b */
    public final C58485gu mo110067b() {
        return this.f358555a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C131090m) {
            C131090m mVar = (C131090m) obj;
            return C58597ky.m90218i(this.f358555a, mVar.mo110067b()) && this.f358556b == mVar.mo110066a();
        }
    }

    public final int hashCode() {
        return ((this.f358555a.hashCode() ^ 1000003) * 1000003) ^ this.f358556b;
    }

    public final String toString() {
        String obj = this.f358555a.toString();
        int i = this.f358556b;
        return "OnDeviceTopAppSuggestions{topRankedApps=" + obj + ", modelsCount=" + i + "}";
    }
}
