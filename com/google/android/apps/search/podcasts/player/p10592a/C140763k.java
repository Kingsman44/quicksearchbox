package com.google.android.apps.search.podcasts.player.p10592a;

import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e;
import com.google.android.apps.search.podcasts.player.C140776c;
import com.google.android.apps.search.podcasts.player.C140784d;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.apps.search.podcasts.player.C140790h;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.player.a.k */
/* compiled from: PG */
final class C140763k extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140790h f382231a;

    /* renamed from: b */
    final /* synthetic */ C140787e f382232b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140763k(C140790h hVar, C140787e eVar) {
        super(1);
        this.f382231a = hVar;
        this.f382232b = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C140753a aVar = (C140753a) obj;
        C69664n.m101061g(aVar, "nextEpisode");
        C140641b bVar = aVar.f382213a;
        if (bVar != null) {
            C140790h hVar = this.f382231a;
            C140784d dVar = this.f382232b.f382283d;
            C140644e eVar = bVar.f381984k;
            if (eVar == null) {
                eVar = C140644e.f381988d;
            }
            C140776c.m228582b(hVar, bVar, dVar, eVar.f381992c, true, aVar.f382214b, 16);
        } else {
            this.f382231a.mo115887i();
            this.f382231a.mo115897s(true);
        }
        return C69788q.f186170a;
    }
}
