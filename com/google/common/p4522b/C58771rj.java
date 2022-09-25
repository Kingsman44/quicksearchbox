package com.google.common.p4522b;

import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.rj */
/* compiled from: PG */
final class C58771rj implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ Iterator f156549a;

    /* renamed from: b */
    final /* synthetic */ C58773rl f156550b;

    public C58771rj(C58773rl rlVar, Iterator it) {
        this.f156550b = rlVar;
        this.f156549a = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f156549a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new C58772rk((Map.Entry) this.f156549a.next());
    }

    public final void remove() {
        this.f156549a.remove();
        this.f156550b.mo55932b();
    }
}
