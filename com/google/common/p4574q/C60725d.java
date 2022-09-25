package com.google.common.p4574q;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.q.d */
/* compiled from: PG */
final class C60725d implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ Iterator f164729a;

    public C60725d(Iterator it) {
        this.f164729a = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f164729a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (Collection) ((Map.Entry) this.f164729a.next()).getValue();
    }

    public final void remove() {
        this.f164729a.remove();
    }
}
