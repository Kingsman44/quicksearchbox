package com.google.android.apps.search.podcasts.library.queue.p10583a;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97925o;
import com.google.android.apps.search.podcasts.library.p10580b.C140567b;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10600q.C140952k;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140984e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.queue.a.a */
/* compiled from: PG */
public final class C140596a {
    /* renamed from: a */
    public static final C140952k m228354a(List list) {
        C69664n.m101061g(list, "episodeItems");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C97925o oVar = C140984e.f382770a;
            arrayList.add(new C140567b((C140641b) it.next(), C140984e.f382771b, true, 8));
        }
        return new C140952k(arrayList, (Integer) null);
    }
}
