package com.google.android.gms.libs.p10830b.p10832b;

/* renamed from: com.google.android.gms.libs.b.b.d */
/* compiled from: PG */
public final class C144843d extends C144848i {

    /* renamed from: a */
    public final C144845f f391695a;

    /* renamed from: b */
    public final C144847h f391696b;

    /* renamed from: c */
    public final long f391697c;

    /* renamed from: d */
    private final C144851l f391698d;

    /* renamed from: e */
    private final C144846g f391699e;

    public C144843d(C144845f fVar, C144851l lVar, C144847h hVar, C144846g gVar, long j) {
        this.f391695a = fVar;
        this.f391698d = lVar;
        if (hVar != null) {
            this.f391696b = hVar;
            this.f391699e = gVar;
            this.f391697c = j;
            return;
        }
        throw new NullPointerException("Null identifiers");
    }

    /* renamed from: a */
    public final long mo120278a() {
        return this.f391697c;
    }

    /* renamed from: b */
    public final C144845f mo120279b() {
        return this.f391695a;
    }

    /* renamed from: c */
    public final C144846g mo120280c() {
        return this.f391699e;
    }

    /* renamed from: d */
    public final C144847h mo120281d() {
        return this.f391696b;
    }

    /* renamed from: e */
    public final C144851l mo120282e() {
        return this.f391698d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C144848i) {
            C144848i iVar = (C144848i) obj;
            return this.f391695a.equals(iVar.mo120279b()) && this.f391698d.equals(iVar.mo120282e()) && this.f391696b.equals(iVar.mo120281d()) && this.f391699e.equals(iVar.mo120280c()) && this.f391697c == iVar.mo120278a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f391695a.hashCode();
        int hashCode2 = this.f391698d.hashCode();
        int hashCode3 = this.f391696b.hashCode();
        int hashCode4 = this.f391699e.hashCode();
        long j = this.f391697c;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String obj = this.f391695a.toString();
        String obj2 = this.f391698d.toString();
        String obj3 = this.f391696b.toString();
        String obj4 = this.f391699e.toString();
        long j = this.f391697c;
        return "Signals{buildInfo=" + obj + ", systemProperties=" + obj2 + ", identifiers=" + obj3 + ", callerInfo=" + obj4 + ", signalCollectionTimeMillis=" + j + "}";
    }
}
