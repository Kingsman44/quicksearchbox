package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.am */
/* compiled from: PG */
public final class C123937am implements C123938an {

    /* renamed from: a */
    public final Instant f342333a;

    public C123937am(Instant instant) {
        C69664n.m101061g(instant, "timestamp");
        this.f342333a = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C123937am) && C69664n.m101066l(this.f342333a, ((C123937am) obj).f342333a);
    }

    public final int hashCode() {
        return this.f342333a.hashCode();
    }

    public final String toString() {
        Instant instant = this.f342333a;
        return "Success(timestamp=" + instant + ")";
    }
}
