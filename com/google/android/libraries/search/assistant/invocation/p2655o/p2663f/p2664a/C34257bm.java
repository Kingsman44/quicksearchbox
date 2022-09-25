package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.bm */
/* compiled from: PG */
public final class C34257bm implements C34267bw {

    /* renamed from: a */
    private final String f91132a;

    public C34257bm(String str) {
        C69664n.m101061g(str, "connectionId");
        this.f91132a = str;
    }

    /* renamed from: a */
    public final boolean mo39290a(String str, long j) {
        C69664n.m101061g(str, "connectionId");
        return C69664n.m101066l(this.f91132a, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34257bm) && C69664n.m101066l(this.f91132a, ((C34257bm) obj).f91132a);
    }

    public final int hashCode() {
        return this.f91132a.hashCode();
    }

    public final String toString() {
        String str = this.f91132a;
        return "PerConnectionStateValidityScopePolicy(connectionId=" + str + ")";
    }
}
