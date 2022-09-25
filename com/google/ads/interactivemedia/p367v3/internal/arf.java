package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arf */
/* compiled from: PG */
final class arf implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ arg f21426a;

    /* renamed from: b */
    private int f21427b;

    /* renamed from: c */
    private int f21428c = -1;

    /* renamed from: d */
    private int f21429d;

    /* renamed from: e */
    private int f21430e;

    public arf(arg arg) {
        this.f21426a = arg;
        this.f21427b = arg.f21431b.f21440i;
        arh arh = arg.f21431b;
        this.f21429d = arh.f21435d;
        this.f21430e = arh.f21434c;
    }

    /* renamed from: a */
    private final void m19354a() {
        if (this.f21426a.f21431b.f21435d != this.f21429d) {
            throw new ConcurrentModificationException();
        }
    }

    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        m19354a();
        return this.f21427b != -2 && this.f21430e > 0;
    }

    public final Object next() {
        if (hasNext()) {
            Object a = this.f21426a.mo15225a(this.f21427b);
            this.f21428c = this.f21427b;
            this.f21427b = this.f21426a.f21431b.f21443l[this.f21427b];
            this.f21430e--;
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        m19354a();
        ary.m19460m(this.f21428c != -1);
        arh arh = this.f21426a.f21431b;
        int i = this.f21428c;
        arh.mo15257g(i, ary.m19450c(arh.f21432a[i]));
        int i2 = this.f21427b;
        arh arh2 = this.f21426a.f21431b;
        if (i2 == arh2.f21434c) {
            this.f21427b = this.f21428c;
        }
        this.f21428c = -1;
        this.f21429d = arh2.f21435d;
    }
}
