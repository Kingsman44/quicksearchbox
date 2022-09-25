package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.protobuf.cx */
/* compiled from: PG */
final class C62978cx implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    private final Iterator f170035a;

    public C62978cx(Iterator it) {
        this.f170035a = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f170035a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f170035a.next();
        return entry.getValue() instanceof C62979cy ? new C62977cw(entry) : entry;
    }

    public final void remove() {
        this.f170035a.remove();
    }
}
