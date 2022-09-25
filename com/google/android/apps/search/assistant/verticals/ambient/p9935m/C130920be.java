package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.be */
/* compiled from: PG */
public final class C130920be implements C130930bo, C130921bf {

    /* renamed from: a */
    private final C130931bp f358236a;

    /* renamed from: b */
    private final Instant f358237b;

    /* renamed from: c */
    private final String f358238c;

    public C130920be(C130931bp bpVar, Instant instant, String str) {
        C69664n.m101061g(bpVar, "syncType");
        C69664n.m101061g(str, "app");
        this.f358236a = bpVar;
        this.f358237b = instant;
        this.f358238c = str;
    }

    /* renamed from: a */
    public final Instant mo109967a() {
        return this.f358237b;
    }

    /* renamed from: c */
    public final String mo109969c() {
        return this.f358238c;
    }

    /* renamed from: d */
    public final String mo109970d() {
        return "FAILURE_PCP";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C130920be)) {
            return false;
        }
        C130920be beVar = (C130920be) obj;
        return this.f358236a == beVar.f358236a && C69664n.m101066l(this.f358237b, beVar.f358237b) && C69664n.m101066l(this.f358238c, beVar.f358238c);
    }

    public final int hashCode() {
        int hashCode = this.f358236a.hashCode() * 31;
        Instant instant = this.f358237b;
        return ((hashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.f358238c.hashCode();
    }

    public final String toString() {
        C130931bp bpVar = this.f358236a;
        Instant instant = this.f358237b;
        String str = this.f358238c;
        return "AppProducedNoRecommendationsNotSaved(syncType=" + bpVar + ", lastUpdateTime=" + instant + ", app=" + str + ")";
    }
}
