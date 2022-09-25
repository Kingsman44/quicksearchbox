package com.google.android.apps.gsa.nga.engine.education.p6016a;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.a.h */
/* compiled from: PG */
final class C75657h extends C75646ae {

    /* renamed from: a */
    private final boolean f210020a;

    /* renamed from: b */
    private final Optional f210021b;

    public C75657h(boolean z, Optional optional) {
        this.f210020a = z;
        this.f210021b = optional;
    }

    /* renamed from: a */
    public final Optional mo71794a() {
        return this.f210021b;
    }

    /* renamed from: b */
    public final boolean mo71795b() {
        return this.f210020a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C75646ae) {
            C75646ae aeVar = (C75646ae) obj;
            return this.f210020a == aeVar.mo71795b() && this.f210021b.equals(aeVar.mo71794a());
        }
    }

    public final int hashCode() {
        return (((true != this.f210020a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f210021b.hashCode();
    }

    public final String toString() {
        boolean z = this.f210020a;
        String valueOf = String.valueOf(this.f210021b);
        return "DisclosureInfo{setShowDisclosure=" + z + ", setDisclosureLink=" + valueOf + "}";
    }
}
