package com.google.android.libraries.search.assistant.p2825x.p2826a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.x.a.b */
/* compiled from: PG */
final class C36795b {

    /* renamed from: a */
    public final C34053bp f95870a;

    /* renamed from: b */
    public final Duration f95871b;

    public C36795b(C34053bp bpVar, Duration duration) {
        C69664n.m101061g(bpVar, "invocationToken");
        C69664n.m101061g(duration, "timestamp");
        this.f95870a = bpVar;
        this.f95871b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36795b)) {
            return false;
        }
        C36795b bVar = (C36795b) obj;
        return C69664n.m101066l(this.f95870a, bVar.f95870a) && C69664n.m101066l(this.f95871b, bVar.f95871b);
    }

    public final int hashCode() {
        return (this.f95870a.hashCode() * 31) + this.f95871b.hashCode();
    }

    public final String toString() {
        C34053bp bpVar = this.f95870a;
        Duration duration = this.f95871b;
        return "DebugInvocationFlowCollection(invocationToken=" + bpVar + ", timestamp=" + duration + ")";
    }
}
