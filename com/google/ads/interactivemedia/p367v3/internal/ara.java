package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ara */
/* compiled from: PG */
final class ara extends arg {

    /* renamed from: a */
    final /* synthetic */ arh f21421a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ara(arh arh) {
        super(arh);
        this.f21421a = arh;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15225a(int i) {
        return new aqy(this.f21421a, i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int b = this.f21421a.mo15248b(key);
            if (b == -1 || !apz.m19253b(value, this.f21421a.f21433b[b])) {
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
        int c2 = this.f21421a.mo15249c(key, c);
        if (c2 == -1 || !apz.m19253b(value, this.f21421a.f21433b[c2])) {
            return false;
        }
        this.f21421a.mo15257g(c2, c);
        return true;
    }
}
