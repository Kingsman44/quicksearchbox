package com.google.android.libraries.gcoreclient.p1763h.p1767b.p1768a;

import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gcoreclient.h.b.a.a */
/* compiled from: PG */
final class C21553a implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    protected final Iterator f59947a;

    /* renamed from: b */
    final /* synthetic */ C21554b f59948b;

    public C21553a(C21554b bVar, Iterator it) {
        this.f59948b = bVar;
        this.f59947a = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f59947a.hasNext();
    }

    public final Object next() {
        return this.f59948b.mo26978a(this.f59947a.next());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from this Iterator");
    }
}
