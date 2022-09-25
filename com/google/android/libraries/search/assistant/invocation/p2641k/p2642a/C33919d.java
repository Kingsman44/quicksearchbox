package com.google.android.libraries.search.assistant.invocation.p2641k.p2642a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.k.a.d */
/* compiled from: PG */
public final class C33919d {

    /* renamed from: a */
    public final Duration f90471a;

    /* renamed from: b */
    public final C34043bf f90472b;

    public C33919d(Duration duration, C34043bf bfVar) {
        C69664n.m101061g(duration, "timeFromHotwordEnd");
        C69664n.m101061g(bfVar, "entrypoint");
        this.f90471a = duration;
        this.f90472b = bfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33919d)) {
            return false;
        }
        C33919d dVar = (C33919d) obj;
        return C69664n.m101066l(this.f90471a, dVar.f90471a) && this.f90472b == dVar.f90472b;
    }

    public final int hashCode() {
        return (this.f90471a.hashCode() * 31) + this.f90472b.hashCode();
    }

    public final String toString() {
        Duration duration = this.f90471a;
        C34043bf bfVar = this.f90472b;
        return "InvocationStartLoggingParams(timeFromHotwordEnd=" + duration + ", entrypoint=" + bfVar + ")";
    }
}
