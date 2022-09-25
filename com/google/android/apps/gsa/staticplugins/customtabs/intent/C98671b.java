package com.google.android.apps.gsa.staticplugins.customtabs.intent;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.intent.b */
/* compiled from: PG */
public final class C98671b extends C98681l {

    /* renamed from: a */
    public final C58833ax f275633a;

    /* renamed from: b */
    public final C58833ax f275634b;

    public C98671b(C58833ax axVar, C58833ax axVar2) {
        this.f275633a = axVar;
        this.f275634b = axVar2;
    }

    /* renamed from: a */
    public final C58833ax mo91250a() {
        return this.f275634b;
    }

    /* renamed from: b */
    public final C58833ax mo91251b() {
        return this.f275633a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C98681l) {
            C98681l lVar = (C98681l) obj;
            return this.f275633a.equals(lVar.mo91251b()) && this.f275634b.equals(lVar.mo91250a());
        }
    }

    public final int hashCode() {
        return ((this.f275633a.hashCode() ^ 1000003) * 1000003) ^ this.f275634b.hashCode();
    }

    public final String toString() {
        String obj = this.f275633a.toString();
        String obj2 = this.f275634b.toString();
        return "ResolutionResult{resolution=" + obj + ", availabilityState=" + obj2 + "}";
    }
}
