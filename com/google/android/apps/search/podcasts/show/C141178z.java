package com.google.android.apps.search.podcasts.show;

import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.show.p10616c.C141148i;
import com.google.android.apps.search.podcasts.show.p10616c.C141150k;
import com.google.android.apps.search.podcasts.show.p10616c.p10617a.C141139a;
import com.google.android.apps.search.podcasts.show.p10616c.p10617a.C141140b;
import com.google.android.apps.search.podcasts.show.p10618d.C141155c;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.z */
/* compiled from: PG */
final class C141178z implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C141175w f383281a;

    public C141178z(C141175w wVar) {
        this.f383281a = wVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C141155c cVar = (C141155c) bVar;
        C141175w wVar = this.f383281a;
        C69664n.m101061g(cVar, "event");
        C141150k kVar = wVar.f383267d;
        String str = cVar.f383237a.f381995a;
        C69664n.m101060f(str, "event.showItem.feedUrl");
        boolean z = cVar.f383238b;
        C69664n.m101061g(str, "feedUrl");
        C46778cv cvVar = kVar.f383227g;
        C46407v vVar = kVar.f383226f;
        C141139a aVar = (C141139a) C141140b.f383193b.createBuilder();
        aVar.copyOnWrite();
        str.getClass();
        ((C141140b) aVar.instance).f383195a = str;
        cvVar.mo50787a(vVar.mo50348h(aVar.build(), new C141148i(z)), C140192a.f380885a);
        return C47392e.f123115a;
    }
}
