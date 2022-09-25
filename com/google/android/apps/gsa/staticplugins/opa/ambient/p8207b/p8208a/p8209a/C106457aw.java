package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.aw */
/* compiled from: PG */
final class C106457aw extends C106446al {

    /* renamed from: a */
    private final C58485gu f296939a;

    /* renamed from: b */
    private final Boolean f296940b;

    public C106457aw(C58485gu guVar, Boolean bool) {
        if (guVar != null) {
            this.f296939a = guVar;
            this.f296940b = bool;
            return;
        }
        throw new NullPointerException("Null applications");
    }

    /* renamed from: a */
    public final C58485gu mo95534a() {
        return this.f296939a;
    }

    /* renamed from: b */
    public final Boolean mo95535b() {
        return this.f296940b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C106446al) {
            C106446al alVar = (C106446al) obj;
            return C58597ky.m90218i(this.f296939a, alVar.mo95534a()) && this.f296940b.equals(alVar.mo95535b());
        }
    }

    public final int hashCode() {
        return ((this.f296939a.hashCode() ^ 1000003) * 1000003) ^ this.f296940b.hashCode();
    }

    public final String toString() {
        String obj = this.f296939a.toString();
        Boolean bool = this.f296940b;
        return "HeadphoneApplications{applications=" + obj + ", usesDefaultApps=" + bool + "}";
    }
}
