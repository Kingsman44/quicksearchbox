package com.google.android.libraries.search.assistant.p2700k;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.k.r */
/* compiled from: PG */
public final class C34780r {

    /* renamed from: a */
    public final List f92298a;

    /* renamed from: b */
    public final int f92299b;

    public C34780r(List list, int i) {
        C69664n.m101061g(list, "credentials");
        this.f92298a = list;
        this.f92299b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34780r)) {
            return false;
        }
        C34780r rVar = (C34780r) obj;
        return C69664n.m101066l(this.f92298a, rVar.f92298a) && this.f92299b == rVar.f92299b;
    }

    public final int hashCode() {
        return (this.f92298a.hashCode() * 31) + this.f92299b;
    }

    public final String toString() {
        List list = this.f92298a;
        int i = this.f92299b;
        return "RpcAuthCredentials(credentials=" + list + ", primaryIndex=" + i + ")";
    }
}
