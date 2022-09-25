package com.google.android.apps.search.googleapp.search.p10406c;

import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.googleapp.search.c.a */
/* compiled from: PG */
public final class C137400a {

    /* renamed from: a */
    public final C137402c f373725a;

    /* renamed from: b */
    private final C70862aj f373726b;

    public C137400a(C137402c cVar, C70862aj ajVar) {
        this.f373725a = cVar;
        this.f373726b = ajVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C137400a)) {
            return false;
        }
        C137400a aVar = (C137400a) obj;
        return C69664n.m101066l(this.f373725a, aVar.f373725a) && C69664n.m101066l(this.f373726b, aVar.f373726b);
    }

    public final int hashCode() {
        return (this.f373725a.hashCode() * 31) + this.f373726b.hashCode();
    }

    public final String toString() {
        C137402c cVar = this.f373725a;
        C70862aj ajVar = this.f373726b;
        return "RequestResponseObserverPair(requestObserver=" + cVar + ", responseObserver=" + ajVar + ")";
    }
}
