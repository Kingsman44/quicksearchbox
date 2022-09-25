package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34049bl;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.bk */
/* compiled from: PG */
final class C34255bk {

    /* renamed from: a */
    public final C34267bw f91128a;

    /* renamed from: b */
    public final C34049bl f91129b;

    public C34255bk(C34267bw bwVar, C34049bl blVar) {
        C69664n.m101061g(blVar, "state");
        this.f91128a = bwVar;
        this.f91129b = blVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34255bk)) {
            return false;
        }
        C34255bk bkVar = (C34255bk) obj;
        return C69664n.m101066l(this.f91128a, bkVar.f91128a) && C69664n.m101066l(this.f91129b, bkVar.f91129b);
    }

    public final int hashCode() {
        return (this.f91128a.hashCode() * 31) + this.f91129b.hashCode();
    }

    public final String toString() {
        C34267bw bwVar = this.f91128a;
        C34049bl blVar = this.f91129b;
        return "InvocationSourceStateSnapshot(policy=" + bwVar + ", state=" + blVar + ")";
    }
}
