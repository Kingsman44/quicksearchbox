package com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8287c;

import com.google.p4449cd.p4456g.C57981b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.a.c.h */
/* compiled from: PG */
final class C107195h extends C107191d {

    /* renamed from: a */
    private final long f298372a;

    /* renamed from: b */
    private final C57981b f298373b;

    /* renamed from: c */
    private final C107178aa f298374c;

    public C107195h(long j, C57981b bVar, C107178aa aaVar) {
        this.f298372a = j;
        if (bVar != null) {
            this.f298373b = bVar;
            this.f298374c = aaVar;
            return;
        }
        throw new NullPointerException("Null responseSource");
    }

    /* renamed from: a */
    public final long mo95822a() {
        return this.f298372a;
    }

    /* renamed from: b */
    public final C57981b mo95823b() {
        return this.f298373b;
    }

    /* renamed from: c */
    public final C107178aa mo95824c() {
        return this.f298374c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C107191d) {
            C107191d dVar = (C107191d) obj;
            return this.f298372a == dVar.mo95822a() && this.f298373b.equals(dVar.mo95823b()) && this.f298374c.equals(dVar.mo95824c());
        }
    }

    public final int hashCode() {
        long j = this.f298372a;
        return this.f298374c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f298373b.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.f298372a;
        String obj = this.f298373b.toString();
        String obj2 = this.f298374c.toString();
        return "ApaConnection{interactionId=" + j + ", responseSource=" + obj + ", errorHandler=" + obj2 + "}";
    }
}
