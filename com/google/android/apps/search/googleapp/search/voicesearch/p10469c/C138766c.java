package com.google.android.apps.search.googleapp.search.voicesearch.p10469c;

import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70868g;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.c */
/* compiled from: PG */
final class C138766c {

    /* renamed from: a */
    public final C70868g f377446a;

    /* renamed from: b */
    public final C138784u f377447b;

    public C138766c(C70868g gVar, C138784u uVar) {
        this.f377446a = gVar;
        this.f377447b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C138766c)) {
            return false;
        }
        C138766c cVar = (C138766c) obj;
        return C69664n.m101066l(this.f377446a, cVar.f377446a) && C69664n.m101066l(this.f377447b, cVar.f377447b);
    }

    public final int hashCode() {
        return (this.f377446a.hashCode() * 31) + this.f377447b.hashCode();
    }

    public final String toString() {
        C70868g gVar = this.f377446a;
        C138784u uVar = this.f377447b;
        return "RequestResponseObserverPair(requestObserver=" + gVar + ", responseObserver=" + uVar + ")";
    }
}
