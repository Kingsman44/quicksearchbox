package com.google.android.apps.search.podcasts.p10550b.p10551a;

import com.google.android.libraries.storage.p3315b.C42839ay;
import com.google.android.libraries.storage.p3315b.C42840az;
import java.util.Collection;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.b.a.s */
/* compiled from: PG */
public final class C140006s {
    /* renamed from: a */
    public static final C42839ay m227659a(Collection collection, Long l) {
        C69664n.m101061g(collection, "feedUrlList");
        C42840az azVar = new C42840az();
        azVar.f112130a.append("\n      SELECT\n        feed_url,\n        show_result_proto,\n        update_time_ms\n      FROM show_metadata\n      WHERE feed_url IN (\n    ");
        int i = 0;
        for (Object next : collection) {
            int i2 = i + 1;
            if (i < 0) {
                C69540x.m100952j();
            }
            String str = (String) next;
            azVar.f112130a.append(i == 0 ? "?" : ", ?");
            azVar.f112131b.add(str);
            i = i2;
        }
        azVar.f112130a.append(")");
        if (l != null) {
            azVar.f112130a.append(" AND update_time_ms > ?");
            azVar.f112131b.add(l);
        }
        return azVar.mo45920a();
    }
}
