package com.google.android.apps.search.podcasts.library.history.p10582a;

import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.history.a.e */
/* compiled from: PG */
public final class C140588e implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ C140589f f381814a;

    public C140588e(C140589f fVar) {
        this.f381814a = fVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C60870cx c = this.f381814a.f381818d.mo115678c();
        C69664n.m101060f(c, "preferenceFuture");
        C60826bg bgVar = C60826bg.f164896a;
        C69664n.m101060f(bgVar, "directExecutor()");
        return C140989k.m228943a(C140989k.m228944b(C140989k.m228947e(c, bgVar, new C140587d(this.f381814a)), new C140586c(this.f381814a, c)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        return C140989k.m228945c(this.f381814a.f381815a.mo115435d(), new C140585b(this.f381814a));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18088c() {
        C46690ah ahVar = C140192a.f380885a;
        C69664n.m101060f(ahVar, "PODCAST_KEY");
        return ahVar;
    }
}
