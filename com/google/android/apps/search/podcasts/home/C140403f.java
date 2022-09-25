package com.google.android.apps.search.podcasts.home;

import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.p10601r.p10606d.C140969a;
import com.google.android.apps.search.podcasts.p10601r.p10606d.C140970b;
import com.google.android.apps.search.podcasts.p10601r.p10606d.C140971c;
import com.google.android.apps.search.podcasts.p10601r.p10606d.C140975g;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.util.concurrent.C60870cx;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.home.f */
/* compiled from: PG */
final class C140403f implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C140398b f381384a;

    public C140403f(C140398b bVar) {
        this.f381384a = bVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C140975g gVar = (C140975g) bVar;
        C140398b bVar2 = this.f381384a;
        C69664n.m101061g(gVar, "event");
        C140971c cVar = bVar2.f381374j;
        C69664n.m101061g(gVar, "event");
        C46778cv cvVar = cVar.f382748d;
        C60870cx c = cVar.f382746b.mo115678c();
        C69664n.m101060f(c, "preferencesManager.preference");
        cvVar.mo50787a(C140989k.m228945c(c, new C140970b(gVar, cVar)), C140192a.f380885a);
        if (gVar.f382759a == C140969a.RATE_APP) {
            cVar.mo116050a();
        } else if (gVar.f382759a == C140969a.SEND_FEEDBACK) {
            cVar.f382745a.mo116264b(C69505av.m100862d(new C69685i("Entry point", "podcast-rating-card")));
        }
        return C47392e.f123115a;
    }
}
