package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.art */
/* compiled from: PG */
public class art {

    /* renamed from: a */
    final Map f21464a = aqr.m19306a();

    /* renamed from: b */
    public void mo15307b(Object obj, Iterable iterable) {
        Collection collection = (Collection) this.f21464a.get(obj);
        if (collection != null) {
            for (Object next : iterable) {
                ary.m19459l(obj, next);
                collection.add(next);
            }
            return;
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                Object next2 = it.next();
                ary.m19459l(obj, next2);
                arrayList.add(next2);
            }
            this.f21464a.put(obj, arrayList);
        }
    }
}
