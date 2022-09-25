package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f;

import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.l */
/* compiled from: PG */
public final class C34327l {

    /* renamed from: a */
    public final Duration f91277a;

    public C34327l(Duration duration) {
        C69664n.m101061g(duration, "invocationStartElapsedTime");
        this.f91277a = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34327l) && C69664n.m101066l(this.f91277a, ((C34327l) obj).f91277a);
    }

    public final int hashCode() {
        return this.f91277a.hashCode();
    }

    public final String toString() {
        Duration duration = this.f91277a;
        return "InvocationExtras(invocationStartElapsedTime=" + duration + ")";
    }
}
