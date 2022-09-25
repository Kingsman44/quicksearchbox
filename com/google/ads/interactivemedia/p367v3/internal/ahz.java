package com.google.ads.interactivemedia.p367v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahz */
/* compiled from: PG */
final class ahz extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ aic f20672a;

    public ahz(aic aic) {
        this.f20672a = aic;
    }

    public final void clear() {
        this.f20672a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f20672a.containsKey(obj);
    }

    public final Iterator iterator() {
        return new ahy(this);
    }

    public final boolean remove(Object obj) {
        return this.f20672a.mo14811e(obj) != null;
    }

    public final int size() {
        return this.f20672a.f20690c;
    }
}
