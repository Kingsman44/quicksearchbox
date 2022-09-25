package com.google.ads.interactivemedia.p367v3.internal;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqq */
/* compiled from: PG */
final class aqq extends AbstractCollection {

    /* renamed from: a */
    final /* synthetic */ aqr f21395a;

    public aqq(aqr aqr) {
        this.f21395a = aqr;
    }

    public final void clear() {
        this.f21395a.clear();
    }

    public final Iterator iterator() {
        aqr aqr = this.f21395a;
        Map d = aqr.mo15199d();
        if (d != null) {
            return d.values().iterator();
        }
        return new aql(aqr);
    }

    public final int size() {
        return this.f21395a.size();
    }
}
