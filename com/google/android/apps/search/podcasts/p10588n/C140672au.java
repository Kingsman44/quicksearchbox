package com.google.android.apps.search.podcasts.p10588n;

import com.google.android.apps.search.podcasts.p10550b.p10551a.C139997j;
import com.google.android.apps.search.podcasts.p10550b.p10555e.C140084z;
import com.google.android.apps.search.podcasts.p10550b.p10557g.C140133ai;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10590o.C140709b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.n.au */
/* compiled from: PG */
public final class C140672au {

    /* renamed from: a */
    public final C139997j f382063a;

    /* renamed from: b */
    private final C140133ai f382064b;

    /* renamed from: c */
    private final C140709b f382065c;

    /* renamed from: d */
    private final C140084z f382066d;

    /* renamed from: e */
    private final C140459au f382067e;

    public C140672au(C140133ai aiVar, C140709b bVar, C140084z zVar, C140459au auVar, C139997j jVar) {
        C69664n.m101061g(aiVar, "favoriteManager");
        C69664n.m101061g(bVar, "reactionManager");
        C69664n.m101061g(zVar, "progressManager");
        C69664n.m101061g(auVar, "preferencesManager");
        C69664n.m101061g(jVar, "entityCache");
        this.f382064b = aiVar;
        this.f382065c = bVar;
        this.f382066d = zVar;
        this.f382067e = auVar;
        this.f382063a = jVar;
    }

    /* renamed from: a */
    public final C60870cx mo115824a(C140667ap apVar) {
        C69664n.m101061g(apVar, "sortOrder");
        C60870cx c = this.f382064b.mo115472c();
        C60870cx a = this.f382065c.mo115839a();
        C60870cx b = this.f382066d.mo115433b();
        C60870cx c2 = this.f382067e.mo115678c();
        return C47638k.m84751b(c, a, b, c2).mo51521b(new C140671at(this, c, apVar, a, c2, b), C60826bg.f164896a);
    }
}
