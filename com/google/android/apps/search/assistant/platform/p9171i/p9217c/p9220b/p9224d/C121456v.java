package com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d;

import com.google.common.p4552o.p4553a.C59496bt;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.i.c.b.d.v */
/* compiled from: PG */
final class C121456v extends C121438d {

    /* renamed from: b */
    public final C59496bt f337112b;

    /* renamed from: c */
    public final Optional f337113c;

    /* renamed from: d */
    public final Optional f337114d;

    public C121456v(C59496bt btVar, Optional optional, Optional optional2) {
        this.f337112b = btVar;
        this.f337113c = optional;
        this.f337114d = optional2;
    }

    /* renamed from: b */
    public final C121437c mo105149b() {
        return new C121455u(this);
    }

    /* renamed from: c */
    public final C59496bt mo105150c() {
        return this.f337112b;
    }

    /* renamed from: d */
    public final Optional mo105151d() {
        return this.f337114d;
    }

    /* renamed from: e */
    public final Optional mo105152e() {
        return this.f337113c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C121438d) {
            C121438d dVar = (C121438d) obj;
            return this.f337112b.equals(dVar.mo105150c()) && this.f337113c.equals(dVar.mo105152e()) && this.f337114d.equals(dVar.mo105151d());
        }
    }

    public final int hashCode() {
        return ((((this.f337112b.hashCode() ^ 1000003) * 1000003) ^ this.f337113c.hashCode()) * 1000003) ^ this.f337114d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f337112b);
        String valueOf2 = String.valueOf(this.f337113c);
        String valueOf3 = String.valueOf(this.f337114d);
        return "AdjusterResponse{adjusterEventLog=" + valueOf + ", tapasModelExtensionSupplier=" + valueOf2 + ", cortexMetadata=" + valueOf3 + "}";
    }
}
