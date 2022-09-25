package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.b */
/* compiled from: PG */
final class C94827b extends C94823ak {

    /* renamed from: a */
    private final C94841p f265158a;

    /* renamed from: b */
    private final C58833ax f265159b;

    public C94827b(C94841p pVar, C58833ax axVar) {
        this.f265158a = pVar;
        this.f265159b = axVar;
    }

    /* renamed from: a */
    public final C94841p mo88640a() {
        return this.f265158a;
    }

    /* renamed from: b */
    public final C58833ax mo88641b() {
        return this.f265159b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C94823ak) {
            C94823ak akVar = (C94823ak) obj;
            return this.f265158a.equals(akVar.mo88640a()) && this.f265159b.equals(akVar.mo88641b());
        }
    }

    public final int hashCode() {
        return ((this.f265158a.hashCode() ^ 1000003) * 1000003) ^ this.f265159b.hashCode();
    }

    public final String toString() {
        String obj = this.f265158a.toString();
        String valueOf = String.valueOf(this.f265159b);
        return "GacsResponse{responseCode=" + obj + ", responseData=" + valueOf + "}";
    }
}
