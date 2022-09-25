package com.google.android.libraries.search.assistant.p2825x.p2826a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2689b.C34680g;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.x.a.d */
/* compiled from: PG */
final class C36797d {

    /* renamed from: a */
    public final C34680g f95875a;

    /* renamed from: b */
    public final Duration f95876b;

    public C36797d(C34680g gVar, Duration duration) {
        C69664n.m101061g(gVar, "state");
        C69664n.m101061g(duration, "timestamp");
        this.f95875a = gVar;
        this.f95876b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36797d)) {
            return false;
        }
        C36797d dVar = (C36797d) obj;
        return C69664n.m101066l(this.f95875a, dVar.f95875a) && C69664n.m101066l(this.f95876b, dVar.f95876b);
    }

    public final int hashCode() {
        return (this.f95875a.hashCode() * 31) + this.f95876b.hashCode();
    }

    public final String toString() {
        C34680g gVar = this.f95875a;
        Duration duration = this.f95876b;
        return "DebugQuickPhrasesInvocationSourceState(state=" + gVar + ", timestamp=" + duration + ")";
    }
}
