package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.l */
/* compiled from: PG */
final class C108744l extends C108683fb {

    /* renamed from: a */
    private final C108727gs f302420a;

    /* renamed from: b */
    private final C58485gu f302421b;

    public C108744l(C108727gs gsVar, C58485gu guVar) {
        this.f302420a = gsVar;
        if (guVar != null) {
            this.f302421b = guVar;
            return;
        }
        throw new NullPointerException("Null queryList");
    }

    /* renamed from: a */
    public final C108727gs mo97064a() {
        return this.f302420a;
    }

    /* renamed from: b */
    public final C58485gu mo97065b() {
        return this.f302421b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C108683fb) {
            C108683fb fbVar = (C108683fb) obj;
            return this.f302420a.equals(fbVar.mo97064a()) && C58597ky.m90218i(this.f302421b, fbVar.mo97065b());
        }
    }

    public final int hashCode() {
        return ((this.f302420a.hashCode() ^ 1000003) * 1000003) ^ this.f302421b.hashCode();
    }

    public final String toString() {
        String obj = this.f302420a.toString();
        String obj2 = this.f302421b.toString();
        return "QuerySuggestions{topicHeader=" + obj + ", queryList=" + obj2 + "}";
    }
}
