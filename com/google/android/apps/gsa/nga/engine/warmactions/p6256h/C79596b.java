package com.google.android.apps.gsa.nga.engine.warmactions.p6256h;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.h.b */
/* compiled from: PG */
final class C79596b extends C79614t {

    /* renamed from: a */
    public final C79606l f218384a;

    /* renamed from: b */
    public final Optional f218385b;

    public C79596b(C79606l lVar, Optional optional) {
        this.f218384a = lVar;
        this.f218385b = optional;
    }

    /* renamed from: a */
    public final C79606l mo74143a() {
        return this.f218384a;
    }

    /* renamed from: b */
    public final C79613s mo74144b() {
        return new C79595a(this);
    }

    /* renamed from: c */
    public final Optional mo74145c() {
        return this.f218385b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79614t) {
            C79614t tVar = (C79614t) obj;
            return this.f218384a.equals(tVar.mo74143a()) && this.f218385b.equals(tVar.mo74145c());
        }
    }

    public final int hashCode() {
        return ((this.f218384a.hashCode() ^ 1000003) * 1000003) ^ this.f218385b.hashCode();
    }

    public final String toString() {
        String obj = this.f218384a.toString();
        String valueOf = String.valueOf(this.f218385b);
        return "MddResource{resource=" + obj + ", uri=" + valueOf + "}";
    }
}
