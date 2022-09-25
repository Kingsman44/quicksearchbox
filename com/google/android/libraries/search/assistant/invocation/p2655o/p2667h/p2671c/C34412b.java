package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c;

import p5460g.p5461a.C69464a;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.c.b */
/* compiled from: PG */
public final class C34412b {

    /* renamed from: a */
    public final C69464a f91462a;

    /* renamed from: b */
    public final C34420j f91463b;

    /* renamed from: c */
    public final C69626l f91464c;

    public /* synthetic */ C34412b(C69464a aVar, C34420j jVar) {
        this(aVar, jVar, new C34411a((C69577g) null));
    }

    public C34412b(C69464a aVar, C34420j jVar, C69626l lVar) {
        C69664n.m101061g(aVar, "provider");
        C69664n.m101061g(lVar, "enabled");
        this.f91462a = aVar;
        this.f91463b = jVar;
        this.f91464c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34412b)) {
            return false;
        }
        C34412b bVar = (C34412b) obj;
        return C69664n.m101066l(this.f91462a, bVar.f91462a) && C69664n.m101066l(this.f91463b, bVar.f91463b) && C69664n.m101066l(this.f91464c, bVar.f91464c);
    }

    public final int hashCode() {
        return (((this.f91462a.hashCode() * 31) + this.f91463b.hashCode()) * 31) + this.f91464c.hashCode();
    }

    public final String toString() {
        C69464a aVar = this.f91462a;
        C34420j jVar = this.f91463b;
        C69626l lVar = this.f91464c;
        return "Configuration(provider=" + aVar + ", policy=" + jVar + ", enabled=" + lVar + ")";
    }
}
