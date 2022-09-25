package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.bh */
/* compiled from: PG */
public final class C130923bh implements C130930bo, C130922bg {

    /* renamed from: a */
    private final C130931bp f358239a;

    /* renamed from: b */
    private final Instant f358240b;

    /* renamed from: c */
    private final Instant f358241c;

    public C130923bh(C130931bp bpVar, Instant instant, Instant instant2) {
        C69664n.m101061g(bpVar, "syncType");
        C69664n.m101061g(instant2, "successfulSaveTime");
        this.f358239a = bpVar;
        this.f358240b = instant;
        this.f358241c = instant2;
    }

    /* renamed from: a */
    public final Instant mo109967a() {
        return this.f358240b;
    }

    /* renamed from: b */
    public final Instant mo109968b() {
        return this.f358241c;
    }

    /* renamed from: d */
    public final String mo109970d() {
        return "NO_APP";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C130923bh)) {
            return false;
        }
        C130923bh bhVar = (C130923bh) obj;
        return this.f358239a == bhVar.f358239a && C69664n.m101066l(this.f358240b, bhVar.f358240b) && C69664n.m101066l(this.f358241c, bhVar.f358241c);
    }

    public final int hashCode() {
        int hashCode = this.f358239a.hashCode() * 31;
        Instant instant = this.f358240b;
        return ((hashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.f358241c.hashCode();
    }

    public final String toString() {
        C130931bp bpVar = this.f358239a;
        Instant instant = this.f358240b;
        Instant instant2 = this.f358241c;
        return "NoAppSelected(syncType=" + bpVar + ", lastUpdateTime=" + instant + ", successfulSaveTime=" + instant2 + ")";
    }
}
