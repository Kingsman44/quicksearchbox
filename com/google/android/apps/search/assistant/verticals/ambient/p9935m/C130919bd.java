package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.bd */
/* compiled from: PG */
public final class C130919bd implements C130930bo, C130921bf, C130922bg {

    /* renamed from: a */
    private final C130931bp f358232a;

    /* renamed from: b */
    private final Instant f358233b;

    /* renamed from: c */
    private final Instant f358234c;

    /* renamed from: d */
    private final String f358235d;

    public C130919bd(C130931bp bpVar, Instant instant, Instant instant2, String str) {
        C69664n.m101061g(bpVar, "syncType");
        C69664n.m101061g(instant2, "successfulSaveTime");
        C69664n.m101061g(str, "app");
        this.f358232a = bpVar;
        this.f358233b = instant;
        this.f358234c = instant2;
        this.f358235d = str;
    }

    /* renamed from: a */
    public final Instant mo109967a() {
        return this.f358233b;
    }

    /* renamed from: b */
    public final Instant mo109968b() {
        return this.f358234c;
    }

    /* renamed from: c */
    public final String mo109969c() {
        return this.f358235d;
    }

    /* renamed from: d */
    public final String mo109970d() {
        return "NO_RECOMMENDATIONS";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C130919bd)) {
            return false;
        }
        C130919bd bdVar = (C130919bd) obj;
        return this.f358232a == bdVar.f358232a && C69664n.m101066l(this.f358233b, bdVar.f358233b) && C69664n.m101066l(this.f358234c, bdVar.f358234c) && C69664n.m101066l(this.f358235d, bdVar.f358235d);
    }

    public final int hashCode() {
        int hashCode = this.f358232a.hashCode() * 31;
        Instant instant = this.f358233b;
        return ((((hashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.f358234c.hashCode()) * 31) + this.f358235d.hashCode();
    }

    public final String toString() {
        C130931bp bpVar = this.f358232a;
        Instant instant = this.f358233b;
        Instant instant2 = this.f358234c;
        String str = this.f358235d;
        return "AppProducedNoRecommendations(syncType=" + bpVar + ", lastUpdateTime=" + instant + ", successfulSaveTime=" + instant2 + ", app=" + str + ")";
    }
}
