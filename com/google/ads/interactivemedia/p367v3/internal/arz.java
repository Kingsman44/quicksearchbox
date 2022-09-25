package com.google.ads.interactivemedia.p367v3.internal;

import java.util.NoSuchElementException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arz */
/* compiled from: PG */
final class arz extends asp {

    /* renamed from: a */
    boolean f21470a;

    /* renamed from: b */
    final /* synthetic */ Object f21471b;

    public arz(Object obj) {
        this.f21471b = obj;
    }

    public final boolean hasNext() {
        return !this.f21470a;
    }

    public final Object next() {
        if (!this.f21470a) {
            this.f21470a = true;
            return this.f21471b;
        }
        throw new NoSuchElementException();
    }
}
