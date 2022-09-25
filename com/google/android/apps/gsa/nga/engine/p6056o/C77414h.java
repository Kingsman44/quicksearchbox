package com.google.android.apps.gsa.nga.engine.p6056o;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.h */
/* compiled from: PG */
final class C77414h extends C77430x {

    /* renamed from: a */
    private final Optional f213441a;

    /* renamed from: b */
    private final Optional f213442b;

    /* renamed from: c */
    private final Optional f213443c;

    /* renamed from: d */
    private final Optional f213444d;

    /* renamed from: e */
    private final Optional f213445e;

    /* renamed from: f */
    private final Optional f213446f;

    /* renamed from: g */
    private final long f213447g;

    public C77414h(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, long j) {
        this.f213441a = optional;
        this.f213442b = optional2;
        this.f213443c = optional3;
        this.f213444d = optional4;
        this.f213445e = optional5;
        this.f213446f = optional6;
        this.f213447g = j;
    }

    /* renamed from: a */
    public final long mo72225a() {
        return this.f213447g;
    }

    /* renamed from: b */
    public final Optional mo72546b() {
        return this.f213441a;
    }

    /* renamed from: c */
    public final Optional mo72547c() {
        return this.f213444d;
    }

    @Deprecated
    /* renamed from: d */
    public final Optional mo72548d() {
        return this.f213442b;
    }

    /* renamed from: e */
    public final Optional mo72549e() {
        return this.f213443c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77430x) {
            C77430x xVar = (C77430x) obj;
            return this.f213441a.equals(xVar.mo72546b()) && this.f213442b.equals(xVar.mo72548d()) && this.f213443c.equals(xVar.mo72549e()) && this.f213444d.equals(xVar.mo72547c()) && this.f213445e.equals(xVar.mo72552g()) && this.f213446f.equals(xVar.mo72551f()) && this.f213447g == xVar.mo72225a();
        }
    }

    /* renamed from: f */
    public final Optional mo72551f() {
        return this.f213446f;
    }

    /* renamed from: g */
    public final Optional mo72552g() {
        return this.f213445e;
    }

    public final int hashCode() {
        int hashCode = this.f213441a.hashCode();
        int hashCode2 = this.f213442b.hashCode();
        int hashCode3 = this.f213443c.hashCode();
        int hashCode4 = this.f213444d.hashCode();
        int hashCode5 = this.f213445e.hashCode();
        int hashCode6 = this.f213446f.hashCode();
        long j = this.f213447g;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f213441a);
        String valueOf2 = String.valueOf(this.f213442b);
        String valueOf3 = String.valueOf(this.f213443c);
        String valueOf4 = String.valueOf(this.f213444d);
        String valueOf5 = String.valueOf(this.f213445e);
        String valueOf6 = String.valueOf(this.f213446f);
        long j = this.f213447g;
        return "AssistData{assistContent=" + valueOf + ", assistStructure=" + valueOf2 + ", assistStructureSupplier=" + valueOf3 + ", assistData=" + valueOf4 + ", directActionsSession=" + valueOf5 + ", augmentedDirectActionsSession=" + valueOf6 + ", timestamp=" + j + "}";
    }
}
