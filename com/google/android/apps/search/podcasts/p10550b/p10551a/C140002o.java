package com.google.android.apps.search.podcasts.p10550b.p10551a;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.common.p4522b.C58459fv;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.b.a.o */
/* compiled from: PG */
public final class C140002o {

    /* renamed from: a */
    public final C139997j f380523a;

    /* renamed from: b */
    public final C140385d f380524b;

    public C140002o(C139997j jVar, C140385d dVar) {
        C69664n.m101061g(jVar, "entityCache");
        C69664n.m101061g(dVar, "podcastServiceManager");
        this.f380523a = jVar;
        this.f380524b = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo115381a(Collection collection, C139988a aVar) {
        C69664n.m101061g(collection, "episodeIds");
        C69664n.m101061g(aVar, "staleness");
        C58459fv fvVar = new C58459fv();
        ArrayList arrayList = new ArrayList(C69540x.m100804k(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C97920j jVar = (C97920j) it.next();
            arrayList.add(Boolean.valueOf(fvVar.mo54986h(jVar.f273429b).add(jVar.f273431d)));
        }
        Map C = fvVar.mo54950C();
        C69664n.m101060f(C, "feedUrlToGuid.asMap()");
        return C140989k.m228945c(mo115382b(C, aVar), new C140000m(this, C, aVar));
    }

    /* renamed from: b */
    public final C60870cx mo115382b(Map map, C139988a aVar) {
        return C140989k.m228944b(this.f380523a.mo115377b(map, aVar), new C140001n(map));
    }
}
