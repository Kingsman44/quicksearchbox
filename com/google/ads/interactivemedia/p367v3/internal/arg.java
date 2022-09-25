package com.google.ads.interactivemedia.p367v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arg */
/* compiled from: PG */
abstract class arg extends AbstractSet {

    /* renamed from: b */
    final arh f21431b;

    public arg(arh arh) {
        this.f21431b = arh;
    }

    /* renamed from: a */
    public abstract Object mo15225a(int i);

    public final void clear() {
        this.f21431b.clear();
    }

    public final Iterator iterator() {
        return new arf(this);
    }

    public final int size() {
        return this.f21431b.f21434c;
    }
}
