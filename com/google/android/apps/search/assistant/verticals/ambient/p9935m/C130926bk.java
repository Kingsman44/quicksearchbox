package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.bk */
/* compiled from: PG */
public final class C130926bk implements C130930bo, C130921bf, C130922bg {

    /* renamed from: a */
    private final C130931bp f358247a;

    /* renamed from: b */
    private final Instant f358248b;

    /* renamed from: c */
    private final Instant f358249c;

    /* renamed from: d */
    private final String f358250d;

    public C130926bk(C130931bp bpVar, Instant instant, Instant instant2, String str) {
        C69664n.m101061g(bpVar, "syncType");
        C69664n.m101061g(instant2, "successfulSaveTime");
        C69664n.m101061g(str, "app");
        this.f358247a = bpVar;
        this.f358248b = instant;
        this.f358249c = instant2;
        this.f358250d = str;
    }

    /* renamed from: a */
    public final Instant mo109967a() {
        return this.f358248b;
    }

    /* renamed from: b */
    public final Instant mo109968b() {
        return this.f358249c;
    }

    /* renamed from: c */
    public final String mo109969c() {
        return this.f358250d;
    }

    /* renamed from: d */
    public final String mo109970d() {
        return "NO_CARD";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C130926bk)) {
            return false;
        }
        C130926bk bkVar = (C130926bk) obj;
        return this.f358247a == bkVar.f358247a && C69664n.m101066l(this.f358248b, bkVar.f358248b) && C69664n.m101066l(this.f358249c, bkVar.f358249c) && C69664n.m101066l(this.f358250d, bkVar.f358250d);
    }

    public final int hashCode() {
        int hashCode = this.f358247a.hashCode() * 31;
        Instant instant = this.f358248b;
        return ((((hashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.f358249c.hashCode()) * 31) + this.f358250d.hashCode();
    }

    public final String toString() {
        C130931bp bpVar = this.f358247a;
        Instant instant = this.f358248b;
        Instant instant2 = this.f358249c;
        String str = this.f358250d;
        return "SmartspaceCardNotGenerated(syncType=" + bpVar + ", lastUpdateTime=" + instant + ", successfulSaveTime=" + instant2 + ", app=" + str + ")";
    }
}
