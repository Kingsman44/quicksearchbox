package com.google.android.libraries.assistant.p1363c.p1371b.p1377e;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.b.e.a */
/* compiled from: PG */
public final class C17095a extends C17121c {

    /* renamed from: a */
    private final Optional f49760a;

    /* renamed from: b */
    private final boolean f49761b;

    public C17095a(Optional optional, boolean z) {
        if (optional != null) {
            this.f49760a = optional;
            this.f49761b = z;
            return;
        }
        throw new NullPointerException("Null pendingSize");
    }

    /* renamed from: a */
    public final Optional mo23185a() {
        return this.f49760a;
    }

    /* renamed from: b */
    public final boolean mo23186b() {
        return this.f49761b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17121c) {
            C17121c cVar = (C17121c) obj;
            return this.f49760a.equals(cVar.mo23185a()) && this.f49761b == cVar.mo23186b();
        }
    }

    public final int hashCode() {
        return ((this.f49760a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f49761b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f49760a.toString();
        boolean z = this.f49761b;
        return "PendingGroupStatus{pendingSize=" + obj + ", downloadedPresent=" + z + "}";
    }
}
