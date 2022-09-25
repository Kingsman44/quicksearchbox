package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.m */
/* compiled from: PG */
public final class C82622m extends C82512hy {

    /* renamed from: a */
    private final String f225474a = "BISTO_PUSH_TO_TALK_INVOCATION_LATENCY";

    /* renamed from: b */
    private final Double f225475b;

    public C82622m(String str, Double d) {
        this.f225475b = d;
    }

    /* renamed from: b */
    public final Double mo76550b() {
        return this.f225475b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225474a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82512hy) {
            C82512hy hyVar = (C82512hy) obj;
            return this.f225474a.equals(hyVar.mo75583d()) && this.f225475b.equals(hyVar.mo76550b());
        }
    }

    public final int hashCode() {
        return ((this.f225474a.hashCode() ^ 1000003) * 1000003) ^ this.f225475b.hashCode();
    }

    public final String toString() {
        String str = this.f225474a;
        Double d = this.f225475b;
        return "BistoPushToTalkInvocationLatencyEvent{token=" + str + ", value=" + d + "}";
    }
}
