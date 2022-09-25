package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.b */
/* compiled from: PG */
final class C76958b extends C76973q {

    /* renamed from: a */
    private final boolean f212471a;

    /* renamed from: b */
    private final boolean f212472b;

    /* renamed from: c */
    private final Optional f212473c;

    /* renamed from: d */
    private final Optional f212474d;

    /* renamed from: e */
    private final Optional f212475e;

    public C76958b(boolean z, boolean z2, Optional optional, Optional optional2, Optional optional3) {
        this.f212471a = z;
        this.f212472b = z2;
        this.f212473c = optional;
        this.f212474d = optional2;
        this.f212475e = optional3;
    }

    /* renamed from: a */
    public final Optional mo72369a() {
        return this.f212473c;
    }

    /* renamed from: b */
    public final Optional mo72370b() {
        return this.f212475e;
    }

    /* renamed from: c */
    public final Optional mo72371c() {
        return this.f212474d;
    }

    /* renamed from: d */
    public final boolean mo72372d() {
        return this.f212471a;
    }

    /* renamed from: e */
    public final boolean mo72373e() {
        return this.f212472b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C76973q) {
            C76973q qVar = (C76973q) obj;
            return this.f212471a == qVar.mo72372d() && this.f212472b == qVar.mo72373e() && this.f212473c.equals(qVar.mo72369a()) && this.f212474d.equals(qVar.mo72371c()) && this.f212475e.equals(qVar.mo72370b());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.f212471a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.f212472b) {
            i = 1231;
        }
        return ((((((i2 ^ i) * 1000003) ^ this.f212473c.hashCode()) * 1000003) ^ this.f212474d.hashCode()) * 1000003) ^ this.f212475e.hashCode();
    }

    public final String toString() {
        boolean z = this.f212471a;
        boolean z2 = this.f212472b;
        String valueOf = String.valueOf(this.f212473c);
        String valueOf2 = String.valueOf(this.f212474d);
        String valueOf3 = String.valueOf(this.f212475e);
        return "ExtraSettings{isFrontCamera=" + z + ", isOpenOnly=" + z2 + ", delayInSeconds=" + valueOf + ", imageCaptureFormat=" + valueOf2 + ", imageCaptureFlashMode=" + valueOf3 + "}";
    }
}
