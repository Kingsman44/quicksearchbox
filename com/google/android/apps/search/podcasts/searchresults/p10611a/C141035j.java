package com.google.android.apps.search.podcasts.searchresults.p10611a;

import com.google.android.apps.search.podcasts.p10566g.C140379g;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10588n.C140690s;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.dataservice.p3635a.p3636a.C46682c;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.searchresults.a.j */
/* compiled from: PG */
public final class C141035j {

    /* renamed from: a */
    public final C46407v f382877a;

    /* renamed from: b */
    public final C140385d f382878b;

    /* renamed from: c */
    public final C46682c f382879c;

    /* renamed from: d */
    public final C140379g f382880d;

    /* renamed from: e */
    public final C140690s f382881e;

    /* renamed from: f */
    public final Executor f382882f;

    public C141035j(C46407v vVar, C140385d dVar, C46682c cVar, C140379g gVar, C140690s sVar, Executor executor) {
        C69664n.m101061g(vVar, "searchResultsCache");
        C69664n.m101061g(dVar, "podcastsServiceManager");
        C69664n.m101061g(gVar, "feedProcessor");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f382877a = vVar;
        this.f382878b = dVar;
        this.f382879c = cVar;
        this.f382880d = gVar;
        this.f382881e = sVar;
        this.f382882f = executor;
    }
}
