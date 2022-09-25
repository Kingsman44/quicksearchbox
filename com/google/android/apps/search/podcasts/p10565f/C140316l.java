package com.google.android.apps.search.podcasts.p10565f;

import android.view.View;
import com.google.android.apps.search.podcasts.p10576l.C140491c;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.p10601r.p10605c.C140966c;
import com.google.android.apps.search.podcasts.p10601r.p10605c.C140967d;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.l */
/* compiled from: PG */
public final class C140316l implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C140285af f381177a;

    /* renamed from: b */
    final /* synthetic */ View f381178b;

    public C140316l(C140285af afVar, View view) {
        this.f381177a = afVar;
        this.f381178b = view;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C60870cx cxVar;
        C140291al alVar = (C140291al) bVar;
        C140644e eVar = alVar.f381143a.f381984k;
        if (eVar == null) {
            eVar = C140644e.f381988d;
        }
        int i = eVar.f381991b;
        if (i == 2) {
            this.f381177a.f381118b.mo115888j();
        } else if (i == 3 || i == 6) {
            this.f381177a.f381118b.mo115887i();
        } else {
            C60870cx d = this.f381177a.f381118b.mo115882d();
            C140967d dVar = this.f381177a.f381128l;
            View view = this.f381178b;
            C69664n.m101060f(alVar, "event");
            C69664n.m101061g(view, "rootView");
            C69664n.m101061g(alVar, "playEvent");
            if (!dVar.f382735a || dVar.f382738d) {
                cxVar = C60856cj.m92900i(false);
            } else {
                dVar.f382738d = true;
                C60870cx d2 = dVar.f382736b.f381594a.mo46042d();
                C69664n.m101060f(d2, "devicePreferencesStore.data");
                cxVar = C140989k.m228944b(C140989k.m228944b(d2, C140491c.f381588a), new C140966c(view, dVar, alVar));
            }
            C46459k.m82829b(C47638k.m84753d(d, cxVar).mo51522c(new C140315k(cxVar, d, alVar, this.f381177a), C60826bg.f164896a), "Failed to retrieve preferences.", new Object[0]);
        }
        return C47392e.f123115a;
    }
}
