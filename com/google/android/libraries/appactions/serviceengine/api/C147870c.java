package com.google.android.libraries.appactions.serviceengine.api;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.appactions.serviceengine.api.c */
/* compiled from: PG */
final class C147870c extends C147877j {

    /* renamed from: a */
    private final Optional f398901a;

    /* renamed from: b */
    private final Optional f398902b;

    /* renamed from: c */
    private final Optional f398903c;

    /* renamed from: d */
    private final C58495hd f398904d;

    public C147870c(Optional optional, Optional optional2, Optional optional3, C58495hd hdVar) {
        this.f398901a = optional;
        this.f398902b = optional2;
        this.f398903c = optional3;
        this.f398904d = hdVar;
    }

    /* renamed from: a */
    public final C58495hd mo124535a() {
        return this.f398904d;
    }

    /* renamed from: b */
    public final Optional mo124536b() {
        return this.f398903c;
    }

    /* renamed from: c */
    public final Optional mo124537c() {
        return this.f398902b;
    }

    /* renamed from: d */
    public final Optional mo124538d() {
        return this.f398901a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147877j) {
            C147877j jVar = (C147877j) obj;
            return this.f398901a.equals(jVar.mo124538d()) && this.f398902b.equals(jVar.mo124537c()) && this.f398903c.equals(jVar.mo124536b()) && C58662ni.m90356o(this.f398904d, jVar.mo124535a());
        }
    }

    public final int hashCode() {
        return ((((((this.f398901a.hashCode() ^ 1000003) * 1000003) ^ this.f398902b.hashCode()) * 1000003) ^ this.f398903c.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f398904d.entrySet());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f398901a);
        String valueOf2 = String.valueOf(this.f398902b);
        String valueOf3 = String.valueOf(this.f398903c);
        String valueOf4 = String.valueOf(this.f398904d);
        return "ServiceEngineGetProvidersRequest{surfaceType=" + valueOf + ", packageName=" + valueOf2 + ", biiName=" + valueOf3 + ", biiParams=" + valueOf4 + "}";
    }
}
