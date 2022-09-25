package com.google.android.apps.search.podcasts.library.showsubscriptions.p10584a;

import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10588n.C140667ap;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.showsubscriptions.a.c */
/* compiled from: PG */
public final class C140619c implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ C140620d f381909a;

    public C140619c(C140620d dVar) {
        this.f381909a = dVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C60870cx a = this.f381909a.f381911b.mo115824a(C140667ap.ALPHABETICAL);
        C60870cx b = this.f381909a.f381912c.mo116046b();
        return C140989k.m228943a(C47638k.m84753d(a, b).mo51520a(new C140618b(a, b), C60826bg.f164896a));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        return this.f381909a.f381910a.mo115473d();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18088c() {
        C46690ah ahVar = C140192a.f380885a;
        C69664n.m101060f(ahVar, "PODCAST_KEY");
        return ahVar;
    }
}
