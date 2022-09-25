package com.google.common.p4522b;

import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.a */
/* compiled from: PG */
final class C58302a implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    Map.Entry f155866a;

    /* renamed from: b */
    final /* synthetic */ Iterator f155867b;

    /* renamed from: c */
    final /* synthetic */ C58464g f155868c;

    public C58302a(C58464g gVar, Iterator it) {
        this.f155868c = gVar;
        this.f155867b = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f155867b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f155866a = (Map.Entry) this.f155867b.next();
        return new C58329b(this.f155868c, this.f155866a);
    }

    public final void remove() {
        Map.Entry entry = this.f155866a;
        if (entry != null) {
            Object value = entry.getValue();
            this.f155867b.remove();
            this.f155868c.mo55355i(value);
            this.f155866a = null;
            return;
        }
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
