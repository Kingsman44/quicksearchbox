package com.google.android.apps.search.podcasts.show.p10616c;

import com.google.android.apps.search.podcasts.p10549a.C139962g;
import com.google.android.apps.search.podcasts.p10550b.p10551a.C139997j;
import com.google.android.apps.search.podcasts.p10550b.p10552b.C140025c;
import com.google.android.apps.search.podcasts.p10550b.p10557g.C140133ai;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10588n.C140665an;
import com.google.android.apps.search.podcasts.p10601r.p10603b.C140962c;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.apps.tiktok.dataservice.C46728bl;
import com.google.apps.tiktok.dataservice.C46778cv;
import java.util.concurrent.atomic.AtomicBoolean;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.c.k */
/* compiled from: PG */
public final class C141150k {

    /* renamed from: a */
    public final C140385d f383221a;

    /* renamed from: b */
    public final C139997j f383222b;

    /* renamed from: c */
    public final C140665an f383223c;

    /* renamed from: d */
    public final C140133ai f383224d;

    /* renamed from: e */
    public final C139962g f383225e;

    /* renamed from: f */
    public final C46407v f383226f;

    /* renamed from: g */
    public final C46778cv f383227g;

    /* renamed from: h */
    public final C140025c f383228h;

    /* renamed from: i */
    public final C140962c f383229i;

    /* renamed from: j */
    public final C46728bl f383230j;

    /* renamed from: k */
    public final AtomicBoolean f383231k = new AtomicBoolean(false);

    public C141150k(C140385d dVar, C139997j jVar, C140665an anVar, C140133ai aiVar, C139962g gVar, C46407v vVar, C46778cv cvVar, C140025c cVar, C140962c cVar2, C46728bl blVar) {
        C69664n.m101061g(dVar, "podcastsServiceManager");
        C69664n.m101061g(jVar, "entityCache");
        C69664n.m101061g(aiVar, "favoriteManager");
        C69664n.m101061g(vVar, "sortPreferencesCache");
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(blVar, "dedupingManager");
        this.f383221a = dVar;
        this.f383222b = jVar;
        this.f383223c = anVar;
        this.f383224d = aiVar;
        this.f383225e = gVar;
        this.f383226f = vVar;
        this.f383227g = cvVar;
        this.f383228h = cVar;
        this.f383229i = cVar2;
        this.f383230j = blVar;
    }

    /* renamed from: a */
    public final C46688af mo116183a(C46688af afVar, C46688af afVar2) {
        return this.f383231k.get() ? afVar : afVar2;
    }
}
