package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aro */
/* compiled from: PG */
public final class aro extends art {
    /* renamed from: a */
    public final arp mo15306a() {
        Set<Map.Entry> entrySet = this.f21464a.entrySet();
        if (entrySet.isEmpty()) {
            return aqw.f21411a;
        }
        arq arq = new arq(entrySet.size());
        int i = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            arn l = arn.m19405l((Collection) entry.getValue());
            if (!l.isEmpty()) {
                arq.mo15311b(key, l);
                i += l.size();
            }
        }
        return new arp(arq.mo15310a(), i);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15307b(Object obj, Iterable iterable) {
        super.mo15307b(obj, iterable);
    }

    /* renamed from: c */
    public final void mo15308c(Object obj, Object... objArr) {
        mo15307b(obj, Arrays.asList(objArr));
    }
}
