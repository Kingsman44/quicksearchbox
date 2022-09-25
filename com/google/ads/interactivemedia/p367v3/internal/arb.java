package com.google.ads.interactivemedia.p367v3.internal;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arb */
/* compiled from: PG */
final class arb extends AbstractMap implements Serializable, aqi {

    /* renamed from: a */
    private final arh f21422a;

    /* renamed from: b */
    private transient Set f21423b;

    public arb(arh arh) {
        this.f21422a = arh;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f21422a.f21447p = this;
    }

    public final void clear() {
        this.f21422a.clear();
    }

    public final boolean containsKey(Object obj) {
        return this.f21422a.containsValue(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.f21422a.containsKey(obj);
    }

    public final Set entrySet() {
        Set set = this.f21423b;
        if (set != null) {
            return set;
        }
        arc arc = new arc(this.f21422a);
        this.f21423b = arc;
        return arc;
    }

    public final Object get(Object obj) {
        arh arh = this.f21422a;
        int d = arh.mo15253d(obj);
        if (d == -1) {
            return null;
        }
        return arh.f21432a[d];
    }

    public final Set keySet() {
        return this.f21422a.values();
    }

    public final Object put(Object obj, Object obj2) {
        return this.f21422a.mo15264q(obj, obj2);
    }

    public final Object remove(Object obj) {
        arh arh = this.f21422a;
        int c = ary.m19450c(obj);
        int e = arh.mo15254e(obj, c);
        if (e == -1) {
            return null;
        }
        Object obj2 = arh.f21432a[e];
        arh.mo15259h(e, c);
        return obj2;
    }

    public final int size() {
        return this.f21422a.f21434c;
    }

    public final /* bridge */ /* synthetic */ Collection values() {
        return this.f21422a.keySet();
    }
}
