package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.protobuf.cn */
/* compiled from: PG */
final class C62967cn implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ C62970cp f170001a;

    /* renamed from: b */
    private final Iterator f170002b;

    public C62967cn(C62970cp cpVar, Iterator it) {
        this.f170001a = cpVar;
        this.f170002b = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f170002b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new C62966cm(this.f170001a, (Map.Entry) this.f170002b.next());
    }

    public final void remove() {
        this.f170002b.remove();
    }
}
