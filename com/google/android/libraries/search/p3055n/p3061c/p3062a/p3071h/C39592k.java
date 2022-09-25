package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39390af;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.search.n.c.a.h.k */
/* compiled from: PG */
final class C39592k extends C39583bu {

    /* renamed from: a */
    private final C39538ac f104232a;

    /* renamed from: b */
    private final C39536aa f104233b;

    /* renamed from: c */
    private final C39562b f104234c;

    /* renamed from: d */
    private final C58833ax f104235d;

    /* renamed from: e */
    private final C39390af f104236e;

    /* renamed from: f */
    private final C58833ax f104237f;

    public C39592k(C39538ac acVar, C39536aa aaVar, C39562b bVar, C58833ax axVar, C39390af afVar, C58833ax axVar2) {
        this.f104232a = acVar;
        this.f104233b = aaVar;
        this.f104234c = bVar;
        this.f104235d = axVar;
        this.f104236e = afVar;
        this.f104237f = axVar2;
    }

    /* renamed from: a */
    public final C39390af mo41919a() {
        return this.f104236e;
    }

    /* renamed from: b */
    public final C39562b mo41920b() {
        return this.f104234c;
    }

    /* renamed from: c */
    public final C39536aa mo41921c() {
        return this.f104233b;
    }

    /* renamed from: d */
    public final C39538ac mo41922d() {
        return this.f104232a;
    }

    /* renamed from: e */
    public final C58833ax mo41923e() {
        return this.f104235d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39583bu) {
            C39583bu buVar = (C39583bu) obj;
            return this.f104232a.equals(buVar.mo41922d()) && this.f104233b.equals(buVar.mo41921c()) && this.f104234c.equals(buVar.mo41920b()) && this.f104235d.equals(buVar.mo41923e()) && this.f104236e.equals(buVar.mo41919a()) && this.f104237f.equals(buVar.mo41924f());
        }
    }

    /* renamed from: f */
    public final C58833ax mo41924f() {
        return this.f104237f;
    }

    public final int hashCode() {
        return ((((((((((this.f104232a.hashCode() ^ 1000003) * 1000003) ^ this.f104233b.hashCode()) * 1000003) ^ this.f104234c.hashCode()) * 1000003) ^ this.f104235d.hashCode()) * 1000003) ^ this.f104236e.hashCode()) * 1000003) ^ this.f104237f.hashCode();
    }

    public final String toString() {
        String obj = this.f104232a.toString();
        String obj2 = this.f104233b.toString();
        String obj3 = this.f104234c.toString();
        String valueOf = String.valueOf(this.f104235d);
        String obj4 = this.f104236e.toString();
        String valueOf2 = String.valueOf(this.f104237f);
        return "SodaParams{coreConfigParams=" + obj + ", clientConfigParams=" + obj2 + ", audioLibraryListeningSessionParams=" + obj3 + ", dspHotwordDetectedTime=" + valueOf + ", hotwordDetectionCallback=" + obj4 + ", externalDspHotword=" + valueOf2 + "}";
    }
}
