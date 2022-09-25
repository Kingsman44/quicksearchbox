package com.google.protobuf;

import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.protobuf.fm */
/* compiled from: PG */
final class C63048fm implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final Iterator f170165a;

    /* renamed from: b */
    final /* synthetic */ C63049fn f170166b;

    public C63048fm(C63049fn fnVar) {
        this.f170166b = fnVar;
        this.f170165a = fnVar.f170167a.iterator();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f170165a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f170165a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
