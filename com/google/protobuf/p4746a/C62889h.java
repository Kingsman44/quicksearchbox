package com.google.protobuf.p4746a;

import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: com.google.protobuf.a.h */
/* compiled from: PG */
public final class C62889h implements Iterator, p3186j$.util.Iterator, C69640a {

    /* renamed from: a */
    final /* synthetic */ Iterator f169788a;

    /* renamed from: b */
    private final /* synthetic */ Iterator f169789b;

    public C62889h(Iterator it) {
        this.f169788a = it;
        this.f169789b = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f169789b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new C62891j((Map.Entry) this.f169788a.next());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
