package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.z.c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83216f;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.aa */
/* compiled from: PG */
final class C77148aa extends C77192br {

    /* renamed from: a */
    private final C77196bv f212910a;

    /* renamed from: b */
    private final C77195bu f212911b;

    /* renamed from: c */
    private final C77193bs f212912c;

    /* renamed from: d */
    private final Optional f212913d;

    /* renamed from: e */
    private final c f212914e;

    /* renamed from: f */
    private final boolean f212915f;

    /* renamed from: g */
    private final C83216f f212916g;

    public C77148aa(C77196bv bvVar, C77195bu buVar, C77193bs bsVar, Optional optional, c cVar, boolean z, C83216f fVar) {
        this.f212910a = bvVar;
        this.f212911b = buVar;
        this.f212912c = bsVar;
        this.f212913d = optional;
        this.f212914e = cVar;
        this.f212915f = z;
        this.f212916g = fVar;
    }

    /* renamed from: a */
    public final C77193bs mo72452a() {
        return this.f212912c;
    }

    /* renamed from: b */
    public final C77195bu mo72453b() {
        return this.f212911b;
    }

    /* renamed from: c */
    public final C77196bv mo72454c() {
        return this.f212910a;
    }

    /* renamed from: d */
    public final c mo72455d() {
        return this.f212914e;
    }

    /* renamed from: e */
    public final C83216f mo72456e() {
        return this.f212916g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77192br) {
            C77192br brVar = (C77192br) obj;
            return this.f212910a.equals(brVar.mo72454c()) && this.f212911b.equals(brVar.mo72453b()) && this.f212912c.equals(brVar.mo72452a()) && this.f212913d.equals(brVar.mo72458f()) && this.f212914e.equals(brVar.mo72455d()) && this.f212915f == brVar.mo72459g() && this.f212916g.equals(brVar.mo72456e());
        }
    }

    /* renamed from: f */
    public final Optional mo72458f() {
        return this.f212913d;
    }

    /* renamed from: g */
    public final boolean mo72459g() {
        return this.f212915f;
    }

    public final int hashCode() {
        return ((((((((((((this.f212910a.hashCode() ^ 1000003) * 1000003) ^ this.f212911b.hashCode()) * 1000003) ^ this.f212912c.hashCode()) * 1000003) ^ this.f212913d.hashCode()) * 1000003) ^ this.f212914e.hashCode()) * 1000003) ^ (true != this.f212915f ? 1237 : 1231)) * 1000003) ^ this.f212916g.hashCode();
    }

    public final String toString() {
        String obj = this.f212910a.toString();
        String obj2 = this.f212911b.toString();
        String obj3 = this.f212912c.toString();
        String valueOf = String.valueOf(this.f212913d);
        String obj4 = this.f212914e.toString();
        boolean z = this.f212915f;
        String obj5 = this.f212916g.toString();
        return "GenericTimerFulfillmentConfig{genericTimerFulfiller=" + obj + ", filter=" + obj2 + ", onMatch=" + obj3 + ", noAccessFulfiller=" + valueOf + ", defaultQuantifier=" + obj4 + ", requireOnDeviceExecution=" + z + ", fulfillerLogger=" + obj5 + "}";
    }
}
