package com.google.android.apps.search.podcasts.show;

import com.google.android.apps.search.podcasts.searchresults.C141042f;
import com.google.android.apps.search.podcasts.searchresults.C141043g;
import com.google.android.apps.search.podcasts.searchresults.C141044h;
import com.google.android.apps.search.podcasts.searchresults.C141045i;
import com.google.android.apps.search.podcasts.show.p10618d.C141153a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.contrib.p3629c.C46496q;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.aa */
/* compiled from: PG */
final class C141116aa implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C141175w f383140a;

    public C141116aa(C141175w wVar) {
        this.f383140a = wVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C141153a aVar = (C141153a) bVar;
        C141175w wVar = this.f383140a;
        C69664n.m101061g(aVar, "event");
        C46496q c = wVar.f383276m.mo50482c(wVar.f383272i);
        C141044h hVar = (C141044h) C141045i.f382906c.createBuilder();
        C141042f fVar = (C141042f) C141043g.f382903b.createBuilder();
        String str = aVar.f383234a.f381997c;
        fVar.copyOnWrite();
        str.getClass();
        ((C141043g) fVar.instance).f382905a = str;
        hVar.copyOnWrite();
        C141045i iVar = (C141045i) hVar.instance;
        C141043g gVar = (C141043g) fVar.build();
        gVar.getClass();
        iVar.f382909b = gVar;
        iVar.f382908a = 1;
        c.mo50508d(R.id.podcasts_action_to_search_results, C46490k.m82868a(hVar.build()).mo50504d());
        return C47392e.f123115a;
    }
}
