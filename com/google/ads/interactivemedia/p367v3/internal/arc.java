package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arc */
/* compiled from: PG */
final class arc extends arg {
    public arc(arh arh) {
        super(arh);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15225a(int i) {
        return new aqz(this.f21431b, i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int d = this.f21431b.mo15253d(key);
            if (d == -1 || !apz.m19253b(this.f21431b.f21432a[d], value)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int c = ary.m19450c(key);
        int e = this.f21431b.mo15254e(key, c);
        if (e == -1 || !apz.m19253b(this.f21431b.f21432a[e], value)) {
            return false;
        }
        this.f21431b.mo15259h(e, c);
        return true;
    }
}
