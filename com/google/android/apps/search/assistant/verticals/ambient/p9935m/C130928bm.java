package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.bm */
/* compiled from: PG */
public final class C130928bm implements C130930bo, C130921bf, C130922bg {

    /* renamed from: a */
    private final C130931bp f358254a;

    /* renamed from: b */
    private final Instant f358255b;

    /* renamed from: c */
    private final Instant f358256c;

    /* renamed from: d */
    private final String f358257d;

    public C130928bm(C130931bp bpVar, Instant instant, Instant instant2, String str) {
        C69664n.m101061g(bpVar, "syncType");
        C69664n.m101061g(instant2, "successfulSaveTime");
        C69664n.m101061g(str, "app");
        this.f358254a = bpVar;
        this.f358255b = instant;
        this.f358256c = instant2;
        this.f358257d = str;
    }

    /* renamed from: a */
    public final Instant mo109967a() {
        return this.f358255b;
    }

    /* renamed from: b */
    public final Instant mo109968b() {
        return this.f358256c;
    }

    /* renamed from: c */
    public final String mo109969c() {
        return this.f358257d;
    }

    /* renamed from: d */
    public final String mo109970d() {
        return "CARD_SAVED";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C130928bm)) {
            return false;
        }
        C130928bm bmVar = (C130928bm) obj;
        return this.f358254a == bmVar.f358254a && C69664n.m101066l(this.f358255b, bmVar.f358255b) && C69664n.m101066l(this.f358256c, bmVar.f358256c) && C69664n.m101066l(this.f358257d, bmVar.f358257d);
    }

    public final int hashCode() {
        int hashCode = this.f358254a.hashCode() * 31;
        Instant instant = this.f358255b;
        return ((((hashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.f358256c.hashCode()) * 31) + this.f358257d.hashCode();
    }

    public final String toString() {
        C130931bp bpVar = this.f358254a;
        Instant instant = this.f358255b;
        Instant instant2 = this.f358256c;
        String str = this.f358257d;
        return "SmartspaceCardSaved(syncType=" + bpVar + ", lastUpdateTime=" + instant + ", successfulSaveTime=" + instant2 + ", app=" + str + ")";
    }
}
