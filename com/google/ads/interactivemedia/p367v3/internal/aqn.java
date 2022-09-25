package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqn */
/* compiled from: PG */
abstract class aqn implements Iterator, p3186j$.util.Iterator {

    /* renamed from: b */
    int f21387b;

    /* renamed from: c */
    int f21388c;

    /* renamed from: d */
    int f21389d = -1;

    /* renamed from: e */
    final /* synthetic */ aqr f21390e;

    public /* synthetic */ aqn(aqr aqr) {
        this.f21390e = aqr;
        this.f21387b = aqr.f21401f;
        this.f21388c = aqr.mo15203g();
    }

    /* renamed from: b */
    private final void m19303b() {
        if (this.f21390e.f21401f != this.f21387b) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public abstract Object mo15180a(int i);

    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f21388c >= 0;
    }

    public final Object next() {
        m19303b();
        if (hasNext()) {
            int i = this.f21388c;
            this.f21389d = i;
            Object a = mo15180a(i);
            this.f21388c = this.f21390e.mo15205h(this.f21388c);
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        m19303b();
        ary.m19460m(this.f21389d >= 0);
        this.f21387b += 32;
        aqr aqr = this.f21390e;
        aqr.remove(aqr.f21398b[this.f21389d]);
        this.f21388c--;
        this.f21389d = -1;
    }
}
