package com.google.common.p4522b;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.common.b.ne */
/* compiled from: PG */
class C58658ne extends C58432ev {

    /* renamed from: a */
    private final Collection f156388a;

    public C58658ne(Collection collection) {
        this.f156388a = collection;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Collection mo55040b() {
        return this.f156388a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f156388a;
    }

    public final Iterator iterator() {
        return new C58643mq(this.f156388a.iterator());
    }

    public final Object[] toArray() {
        return mo55252r();
    }

    public final Object[] toArray(Object[] objArr) {
        return C58704ox.m90449b(this, objArr);
    }
}
