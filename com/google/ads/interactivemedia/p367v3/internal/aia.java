package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aia */
/* compiled from: PG */
abstract class aia implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    aib f20675a;

    /* renamed from: b */
    aib f20676b = null;

    /* renamed from: c */
    int f20677c;

    /* renamed from: d */
    final /* synthetic */ aic f20678d;

    public aia(aic aic) {
        this.f20678d = aic;
        this.f20675a = aic.f20692e.f20682d;
        this.f20677c = aic.f20691d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final aib mo14798a() {
        aib aib = this.f20675a;
        aic aic = this.f20678d;
        if (aib == aic.f20692e) {
            throw new NoSuchElementException();
        } else if (aic.f20691d == this.f20677c) {
            this.f20675a = aib.f20682d;
            this.f20676b = aib;
            return aib;
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f20675a != this.f20678d.f20692e;
    }

    public final void remove() {
        aib aib = this.f20676b;
        if (aib != null) {
            this.f20678d.mo14810d(aib, true);
            this.f20676b = null;
            this.f20677c = this.f20678d.f20691d;
            return;
        }
        throw new IllegalStateException();
    }
}
