package com.google.android.apps.gsa.shared.p6976ag.p6982e;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.shared.ag.e.b */
/* compiled from: PG */
final class C89130b extends C89132d {

    /* renamed from: a */
    private final C89142n f241610a;

    /* renamed from: b */
    private final Optional f241611b;

    public C89130b(C89142n nVar, Optional optional) {
        this.f241610a = nVar;
        this.f241611b = optional;
    }

    /* renamed from: a */
    public final C89142n mo83117a() {
        return this.f241610a;
    }

    /* renamed from: b */
    public final Optional mo83118b() {
        return this.f241611b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89132d) {
            C89132d dVar = (C89132d) obj;
            return this.f241610a.equals(dVar.mo83117a()) && this.f241611b.equals(dVar.mo83118b());
        }
    }

    public final int hashCode() {
        return ((this.f241610a.hashCode() ^ 1000003) * 1000003) ^ this.f241611b.hashCode();
    }

    public final String toString() {
        String obj = this.f241610a.toString();
        String valueOf = String.valueOf(this.f241611b);
        return "TaskCompletionStateData{taskCompletionState=" + obj + ", requestId=" + valueOf + "}";
    }
}
