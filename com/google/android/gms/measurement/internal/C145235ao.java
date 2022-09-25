package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.gms.measurement.internal.ao */
/* compiled from: PG */
final class C145235ao implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final Iterator f392607a;

    /* renamed from: b */
    final /* synthetic */ EventParams f392608b;

    public C145235ao(EventParams eventParams) {
        this.f392608b = eventParams;
        this.f392607a = eventParams.f392535a.keySet().iterator();
    }

    /* renamed from: a */
    public final String next() {
        return (String) this.f392607a.next();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f392607a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
