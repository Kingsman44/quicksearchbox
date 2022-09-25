package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.bi */
/* compiled from: PG */
public final class C130924bi implements C130930bo {

    /* renamed from: a */
    private final C130931bp f358242a;

    /* renamed from: b */
    private final Instant f358243b;

    public C130924bi(C130931bp bpVar, Instant instant) {
        C69664n.m101061g(bpVar, "syncType");
        this.f358242a = bpVar;
        this.f358243b = instant;
    }

    /* renamed from: a */
    public final Instant mo109967a() {
        return this.f358243b;
    }

    /* renamed from: d */
    public final String mo109970d() {
        return "FAILURE_PCP";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C130924bi)) {
            return false;
        }
        C130924bi biVar = (C130924bi) obj;
        return this.f358242a == biVar.f358242a && C69664n.m101066l(this.f358243b, biVar.f358243b);
    }

    public final int hashCode() {
        int hashCode = this.f358242a.hashCode() * 31;
        Instant instant = this.f358243b;
        return hashCode + (instant == null ? 0 : instant.hashCode());
    }

    public final String toString() {
        C130931bp bpVar = this.f358242a;
        Instant instant = this.f358243b;
        return "NoAppSelectedNotSaved(syncType=" + bpVar + ", lastUpdateTime=" + instant + ")";
    }
}
