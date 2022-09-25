package com.google.android.apps.search.podcasts.player.p10592a;

import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e;
import com.google.android.apps.search.podcasts.player.C140776c;
import com.google.android.apps.search.podcasts.player.C140784d;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.player.a.o */
/* compiled from: PG */
public final class C140767o extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C60870cx f382241a;

    /* renamed from: b */
    final /* synthetic */ C140790h f382242b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140767o(C60870cx cxVar, C140790h hVar) {
        super(1);
        this.f382241a = cxVar;
        this.f382242b = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C140753a aVar = (C140753a) obj;
        C69664n.m101061g(aVar, "nextEpisode");
        Object r = C60856cj.m92909r(this.f382241a);
        if (r != null) {
            C140784d dVar = ((C140787e) r).f382283d;
            C140641b bVar = aVar.f382213a;
            if (bVar == null) {
                return null;
            }
            C140790h hVar = this.f382242b;
            C140644e eVar = bVar.f381984k;
            if (eVar == null) {
                eVar = C140644e.f381988d;
            }
            C140776c.m228582b(hVar, bVar, dVar, eVar.f381992c, false, aVar.f382214b, 24);
            return C69788q.f186170a;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
