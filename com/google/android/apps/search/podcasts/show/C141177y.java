package com.google.android.apps.search.podcasts.show;

import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140649a;
import com.google.android.apps.search.podcasts.show.p10616c.C141149j;
import com.google.android.apps.search.podcasts.show.p10616c.C141150k;
import com.google.android.apps.search.podcasts.show.p10616c.p10617a.C141139a;
import com.google.android.apps.search.podcasts.show.p10616c.p10617a.C141140b;
import com.google.android.apps.search.podcasts.show.p10618d.C141156d;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.y */
/* compiled from: PG */
final class C141177y implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C141175w f383280a;

    public C141177y(C141175w wVar) {
        this.f383280a = wVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C141156d dVar = (C141156d) bVar;
        C141175w wVar = this.f383280a;
        C69664n.m101061g(dVar, "event");
        C141150k kVar = wVar.f383267d;
        String str = dVar.f383239a.f381995a;
        C69664n.m101060f(str, "event.showItem.feedUrl");
        C140649a aVar = dVar.f383240b;
        C69664n.m101061g(str, "feedUrl");
        C69664n.m101061g(aVar, "sortOrder");
        C46778cv cvVar = kVar.f383227g;
        C46407v vVar = kVar.f383226f;
        C141139a aVar2 = (C141139a) C141140b.f383193b.createBuilder();
        aVar2.copyOnWrite();
        str.getClass();
        ((C141140b) aVar2.instance).f383195a = str;
        cvVar.mo50787a(vVar.mo50348h(aVar2.build(), new C141149j(aVar)), C140192a.f380885a);
        return C47392e.f123115a;
    }
}
