package com.google.android.apps.search.podcasts.settings.p10612a;

import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10588n.C140667ap;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47637j;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.a.h */
/* compiled from: PG */
public final class C141055h implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ C141057j f382962a;

    public C141055h(C141057j jVar) {
        this.f382962a = jVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C60870cx c = this.f382962a.f382964a.mo115678c();
        C60870cx b = this.f382962a.f382966c.mo115720b();
        C60870cx a = this.f382962a.f382967d.mo115824a(C140667ap.ALPHABETICAL);
        C60870cx b2 = this.f382962a.f382970g.mo116046b();
        C47637j d = C47638k.m84753d(c, b, a, b2);
        C141057j jVar = this.f382962a;
        return C140989k.m228943a(d.mo51520a(new C141054g(b, jVar, c, a, b2), jVar.f382965b));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        return this.f382962a.f382966c.mo115719a();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18088c() {
        C46690ah ahVar = C140192a.f380885a;
        C69664n.m101060f(ahVar, "PODCAST_KEY");
        return ahVar;
    }
}
