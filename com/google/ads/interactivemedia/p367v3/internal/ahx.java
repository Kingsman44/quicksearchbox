package com.google.ads.interactivemedia.p367v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahx */
/* compiled from: PG */
final class ahx extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ aic f20671a;

    public ahx(aic aic) {
        this.f20671a = aic;
    }

    public final void clear() {
        this.f20671a.clear();
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.f20671a.mo14807c((Map.Entry) obj) != null;
    }

    public final Iterator iterator() {
        return new ahw(this);
    }

    public final boolean remove(Object obj) {
        aib c;
        if (!(obj instanceof Map.Entry) || (c = this.f20671a.mo14807c((Map.Entry) obj)) == null) {
            return false;
        }
        this.f20671a.mo14810d(c, true);
        return true;
    }

    public final int size() {
        return this.f20671a.f20690c;
    }
}
