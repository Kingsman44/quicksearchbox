package com.google.research.xeno.effect;

import com.google.research.aimatter.drishti.DrishtiCache;

/* renamed from: com.google.research.xeno.effect.b */
/* compiled from: PG */
public final class C66399b extends C66406i {

    /* renamed from: a */
    public final long f180573a;

    public C66399b(long j) {
        this.f180573a = j;
    }

    /* renamed from: a */
    public final long mo59614a() {
        return this.f180573a;
    }

    /* renamed from: b */
    public final DrishtiCache mo59615b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C66406i) {
            C66406i iVar = (C66406i) obj;
            return this.f180573a == iVar.mo59614a() && iVar.mo59615b() == null;
        }
    }

    public final int hashCode() {
        long j = this.f180573a;
        return (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
    }

    public final String toString() {
        long j = this.f180573a;
        return "ExternalGraphComponents{parentGlContextHandle=" + j + ", drishtiCache=null}";
    }
}
