package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.bj */
/* compiled from: PG */
public final class C130925bj implements C130930bo, C130921bf {

    /* renamed from: a */
    private final C130931bp f358244a;

    /* renamed from: b */
    private final Instant f358245b;

    /* renamed from: c */
    private final String f358246c;

    public C130925bj(C130931bp bpVar, Instant instant, String str) {
        C69664n.m101061g(bpVar, "syncType");
        C69664n.m101061g(str, "app");
        this.f358244a = bpVar;
        this.f358245b = instant;
        this.f358246c = str;
    }

    /* renamed from: a */
    public final Instant mo109967a() {
        return this.f358245b;
    }

    /* renamed from: c */
    public final String mo109969c() {
        return this.f358246c;
    }

    /* renamed from: d */
    public final String mo109970d() {
        return "RECOMMENDATIONS_FAILED";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C130925bj)) {
            return false;
        }
        C130925bj bjVar = (C130925bj) obj;
        return this.f358244a == bjVar.f358244a && C69664n.m101066l(this.f358245b, bjVar.f358245b) && C69664n.m101066l(this.f358246c, bjVar.f358246c);
    }

    public final int hashCode() {
        int hashCode = this.f358244a.hashCode() * 31;
        Instant instant = this.f358245b;
        return ((hashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.f358246c.hashCode();
    }

    public final String toString() {
        C130931bp bpVar = this.f358244a;
        Instant instant = this.f358245b;
        String str = this.f358246c;
        return "RecommendationsQueryFailed(syncType=" + bpVar + ", lastUpdateTime=" + instant + ", app=" + str + ")";
    }
}
