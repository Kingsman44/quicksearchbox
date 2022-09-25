package com.google.common.p4535g;

import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.g.bc */
/* compiled from: PG */
public final class C59137bc implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ Iterator f157165a;

    /* renamed from: b */
    private C59138bd f157166b;

    /* renamed from: c */
    private int f157167c = 0;

    public C59137bc(Iterator it) {
        this.f157165a = it;
        this.f157166b = (C59138bd) it.next();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f157167c < this.f157166b.f157169b || this.f157165a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f157167c;
        if (i < this.f157166b.f157169b) {
            this.f157167c = i + 1;
        } else {
            this.f157167c = 1;
            this.f157166b = (C59138bd) this.f157165a.next();
        }
        return Integer.valueOf(this.f157166b.f157168a);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
