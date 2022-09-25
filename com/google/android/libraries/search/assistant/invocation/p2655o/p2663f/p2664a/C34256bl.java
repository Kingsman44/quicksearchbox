package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.bl */
/* compiled from: PG */
public final class C34256bl implements C34267bw {

    /* renamed from: a */
    private final String f91130a;

    /* renamed from: b */
    private final long f91131b;

    public C34256bl(String str, long j) {
        C69664n.m101061g(str, "connectionId");
        this.f91130a = str;
        this.f91131b = j;
    }

    /* renamed from: a */
    public final boolean mo39290a(String str, long j) {
        C69664n.m101061g(str, "connectionId");
        return C69664n.m101066l(this.f91130a, str) && this.f91131b == j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34256bl)) {
            return false;
        }
        C34256bl blVar = (C34256bl) obj;
        return C69664n.m101066l(this.f91130a, blVar.f91130a) && this.f91131b == blVar.f91131b;
    }

    public final int hashCode() {
        int hashCode = this.f91130a.hashCode();
        long j = this.f91131b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str = this.f91130a;
        long j = this.f91131b;
        return "PerConfigurationStateValidityScopePolicy(connectionId=" + str + ", epochId=" + j + ")";
    }
}
