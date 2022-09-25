package com.google.ads.interactivemedia.p367v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqo */
/* compiled from: PG */
final class aqo extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ aqr f21391a;

    public aqo(aqr aqr) {
        this.f21391a = aqr;
    }

    public final void clear() {
        this.f21391a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f21391a.containsKey(obj);
    }

    public final Iterator iterator() {
        aqr aqr = this.f21391a;
        Map d = aqr.mo15199d();
        if (d != null) {
            return d.keySet().iterator();
        }
        return new aqj(aqr);
    }

    public final boolean remove(Object obj) {
        Map d = this.f21391a.mo15199d();
        if (d != null) {
            return d.keySet().remove(obj);
        }
        return this.f21391a.m19318u(obj) != aqr.f21396d;
    }

    public final int size() {
        return this.f21391a.size();
    }
}
