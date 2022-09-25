package com.google.common.p4522b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.common.b.e */
/* compiled from: PG */
final class C58410e extends C58445fh {

    /* renamed from: a */
    final /* synthetic */ C58464g f156011a;

    public C58410e(C58464g gVar) {
        this.f156011a = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Set mo5948hU() {
        return this.f156011a.f156089a.keySet();
    }

    public final void clear() {
        this.f156011a.clear();
    }

    public final Iterator iterator() {
        return new C58638ml(((C58356c) this.f156011a.entrySet()).f155929b.mo55354g());
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.f156011a.mo55353f(obj);
        return true;
    }

    public final boolean retainAll(Collection collection) {
        return C58570jy.m90167s(iterator(), collection);
    }

    public final boolean removeAll(Collection collection) {
        collection.getClass();
        return C58758qx.m90655m(this, collection);
    }
}
