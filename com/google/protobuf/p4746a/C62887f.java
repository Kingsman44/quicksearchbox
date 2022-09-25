package com.google.protobuf.p4746a;

import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: com.google.protobuf.a.f */
/* compiled from: PG */
public final class C62887f implements Iterator, p3186j$.util.Iterator, C69640a {

    /* renamed from: a */
    private final /* synthetic */ Iterator f169786a;

    public C62887f(Iterator it) {
        C69664n.m101061g(it, "delegate");
        this.f169786a = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f169786a.hasNext();
    }

    public final Object next() {
        return this.f169786a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
