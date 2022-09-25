package com.google.ads.interactivemedia.p367v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqm */
/* compiled from: PG */
final class aqm extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ aqr f21386a;

    public aqm(aqr aqr) {
        this.f21386a = aqr;
    }

    public final void clear() {
        this.f21386a.clear();
    }

    public final boolean contains(Object obj) {
        Map d = this.f21386a.mo15199d();
        if (d != null) {
            return d.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int m = this.f21386a.m19317t(entry.getKey());
            if (m == -1 || !apz.m19253b(this.f21386a.f21399c[m], entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return this.f21386a.mo15206i();
    }

    public final boolean remove(Object obj) {
        Map d = this.f21386a.mo15199d();
        if (d != null) {
            return d.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f21386a.mo15195c()) {
            return false;
        }
        int n = this.f21386a.m19315r();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object o = this.f21386a.f21400e;
        aqr aqr = this.f21386a;
        int k = ary.m19458k(key, value, n, o, aqr.f21397a, aqr.f21398b, aqr.f21399c);
        if (k == -1) {
            return false;
        }
        this.f21386a.mo15202f(k, n);
        aqr.m19313p(this.f21386a);
        this.f21386a.mo15200e();
        return true;
    }

    public final int size() {
        return this.f21386a.size();
    }
}
