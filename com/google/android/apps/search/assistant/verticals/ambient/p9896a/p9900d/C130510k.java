package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9900d;

import kotlinx.coroutines.C71604be;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.d.k */
/* compiled from: PG */
final class C130510k {

    /* renamed from: a */
    public final C130505f f357509a;

    /* renamed from: b */
    public final C71604be f357510b;

    public C130510k(C130505f fVar, C71604be beVar) {
        C69664n.m101061g(fVar, "producer");
        this.f357509a = fVar;
        this.f357510b = beVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C130510k)) {
            return false;
        }
        C130510k kVar = (C130510k) obj;
        return C69664n.m101066l(this.f357509a, kVar.f357509a) && C69664n.m101066l(this.f357510b, kVar.f357510b);
    }

    public final int hashCode() {
        return (this.f357509a.hashCode() * 31) + this.f357510b.hashCode();
    }

    public final String toString() {
        C130505f fVar = this.f357509a;
        C71604be beVar = this.f357510b;
        return "ProducerFuture(producer=" + fVar + ", future=" + beVar + ")";
    }
}
