package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.bl */
/* compiled from: PG */
public final class C130927bl implements C130930bo, C130921bf {

    /* renamed from: a */
    private final C130931bp f358251a;

    /* renamed from: b */
    private final Instant f358252b;

    /* renamed from: c */
    private final String f358253c;

    public C130927bl(C130931bp bpVar, Instant instant, String str) {
        C69664n.m101061g(bpVar, "syncType");
        C69664n.m101061g(str, "app");
        this.f358251a = bpVar;
        this.f358252b = instant;
        this.f358253c = str;
    }

    /* renamed from: a */
    public final Instant mo109967a() {
        return this.f358252b;
    }

    /* renamed from: c */
    public final String mo109969c() {
        return this.f358253c;
    }

    /* renamed from: d */
    public final String mo109970d() {
        return "FAILURE_PCP";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C130927bl)) {
            return false;
        }
        C130927bl blVar = (C130927bl) obj;
        return this.f358251a == blVar.f358251a && C69664n.m101066l(this.f358252b, blVar.f358252b) && C69664n.m101066l(this.f358253c, blVar.f358253c);
    }

    public final int hashCode() {
        int hashCode = this.f358251a.hashCode() * 31;
        Instant instant = this.f358252b;
        return ((hashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.f358253c.hashCode();
    }

    public final String toString() {
        C130931bp bpVar = this.f358251a;
        Instant instant = this.f358252b;
        String str = this.f358253c;
        return "SmartspaceCardNotSaved(syncType=" + bpVar + ", lastUpdateTime=" + instant + ", app=" + str + ")";
    }
}
