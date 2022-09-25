package com.google.common.p4536h;

/* renamed from: com.google.common.h.r */
/* compiled from: PG */
final class C59261r extends C59262s {
    public C59261r(Object obj, Object obj2) {
        super(obj, obj2);
    }

    /* renamed from: a */
    public final Object mo56723a() {
        throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
    }

    /* renamed from: b */
    public final Object mo56724b() {
        throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
    }

    /* renamed from: c */
    public final boolean mo56725c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C59262s)) {
            return false;
        }
        C59262s sVar = (C59262s) obj;
        if (sVar.mo56725c()) {
            return false;
        }
        if (!this.f157372a.equals(sVar.f157372a)) {
            return this.f157372a.equals(sVar.f157373b) && this.f157373b.equals(sVar.f157372a);
        }
        return this.f157373b.equals(sVar.f157373b);
    }

    public final int hashCode() {
        return this.f157372a.hashCode() + this.f157373b.hashCode();
    }

    public final String toString() {
        return "[" + this.f157372a + ", " + this.f157373b + "]";
    }
}
