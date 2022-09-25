package com.google.android.apps.search.podcasts.home.p10570a;

import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.p10601r.p10606d.C140972d;
import com.google.android.apps.search.podcasts.p10601r.p10606d.C140973e;
import com.google.android.apps.search.podcasts.p10601r.p10606d.C140974f;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.home.a.f */
/* compiled from: PG */
public final class C140395f implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ C140396g f381355a;

    public C140395f(C140396g gVar) {
        this.f381355a = gVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C140974f fVar = this.f381355a.f381361f;
        C60870cx c = fVar.f382755b.mo115678c();
        C60870cx b = fVar.f382756c.mo115433b();
        C47633f e = C47636i.m84744c(c, b).mo51518a(new C140972d(fVar, c, b), C60826bg.f164896a).mo51513e(Throwable.class, C140973e.f382753a, C60826bg.f164896a);
        C60870cx e2 = this.f381355a.f381357b.mo115832e();
        return C140989k.m228943a(C47638k.m84753d(e, e2).mo51521b(new C140394e(this.f381355a, e2, e), C60826bg.f164896a));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        C60870cx c = this.f381355a.f381357b.mo115830c();
        C60870cx c2 = C140989k.m228945c(c, new C140390a(this.f381355a));
        C140391b bVar = new C140391b();
        C60856cj.m92911t(c2, C47810es.m84974n(bVar), C60826bg.f164896a);
        return c;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18088c() {
        C46690ah ahVar = C140192a.f380885a;
        C69664n.m101060f(ahVar, "PODCAST_KEY");
        return ahVar;
    }
}
