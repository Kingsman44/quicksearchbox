package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.bn */
/* compiled from: PG */
public final class C130929bn implements C130930bo {

    /* renamed from: a */
    private final C130931bp f358258a;

    /* renamed from: b */
    private final Instant f358259b;

    public C130929bn(C130931bp bpVar, Instant instant) {
        C69664n.m101061g(bpVar, "syncType");
        this.f358258a = bpVar;
        this.f358259b = instant;
    }

    /* renamed from: a */
    public final Instant mo109967a() {
        return this.f358259b;
    }

    /* renamed from: d */
    public final String mo109970d() {
        return "THROTTLED";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C130929bn)) {
            return false;
        }
        C130929bn bnVar = (C130929bn) obj;
        return this.f358258a == bnVar.f358258a && C69664n.m101066l(this.f358259b, bnVar.f358259b);
    }

    public final int hashCode() {
        int hashCode = this.f358258a.hashCode() * 31;
        Instant instant = this.f358259b;
        return hashCode + (instant == null ? 0 : instant.hashCode());
    }

    public final String toString() {
        C130931bp bpVar = this.f358258a;
        Instant instant = this.f358259b;
        return "Throttled(syncType=" + bpVar + ", lastUpdateTime=" + instant + ")";
    }
}
