package com.google.android.apps.search.podcasts.searchresults.p10611a;

import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10591p.C140747m;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4082j.p4083a.C54348ba;
import com.google.p4017at.p4082j.p4083a.C54349bb;
import com.google.p4017at.p4082j.p4083a.C54351bd;
import com.google.p4017at.p4082j.p4083a.C54372by;
import com.google.p4017at.p4082j.p4083a.C54373bz;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.podcasts.searchresults.a.i */
/* compiled from: PG */
public final class C141034i implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ String f382875a;

    /* renamed from: b */
    final /* synthetic */ C141035j f382876b;

    public C141034i(String str, C141035j jVar) {
        this.f382875a = str;
        this.f382876b = jVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C54348ba baVar = (C54348ba) C54349bb.f142779b.createBuilder();
        String str = this.f382875a;
        baVar.copyOnWrite();
        str.getClass();
        ((C54349bb) baVar.instance).f142781a = str;
        C62942bv build = baVar.build();
        C69664n.m101060f(build, "newBuilder().setQuery(query).build()");
        C60870cx e = this.f382876b.f382877a.mo50345e((C54349bb) build);
        C69664n.m101060f(e, "searchResultsCache\n     …   .getIfPresent(request)");
        C141035j jVar = this.f382876b;
        return C140989k.m228943a(C140989k.m228947e(e, jVar.f382882f, new C141033h(jVar)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        C54348ba baVar = (C54348ba) C54349bb.f142779b.createBuilder();
        String str = this.f382875a;
        baVar.copyOnWrite();
        str.getClass();
        ((C54349bb) baVar.instance).f142781a = str;
        C62942bv build = baVar.build();
        C69664n.m101060f(build, "newBuilder().setQuery(query).build()");
        C54349bb bbVar = (C54349bb) build;
        C140385d dVar = this.f382876b.f382878b;
        String str2 = this.f382875a;
        C140747m mVar = dVar.f381341b;
        C54372by byVar = dVar.f381340a;
        C54348ba baVar2 = (C54348ba) C54349bb.f142779b.createBuilder();
        baVar2.copyOnWrite();
        str2.getClass();
        ((C54349bb) baVar2.instance).f142781a = str2;
        C54349bb bbVar2 = (C54349bb) baVar2.build();
        C70888j jVar = byVar.f189039a;
        C70338di diVar = C54373bz.f142832n;
        if (diVar == null) {
            synchronized (C54373bz.class) {
                diVar = C54373bz.f142832n;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.podcasts.v1.PodcastsService", "GetSearchResultsFeed");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54349bb.f142779b);
                    d.f187486b = C70850d.m103697c(C54351bd.f142782b);
                    diVar = d.mo62040a();
                    C54373bz.f142832n = diVar;
                }
            }
        }
        C60870cx a = C70876o.m103760a(jVar.mo39510a(diVar, byVar.f189040b), bbVar2);
        mVar.mo115851a("PodcastsService", "GetSearchResultsFeed", a);
        this.f382876b.f382881e.mo115833g(C140989k.m228944b(a, C141030e.f382871a));
        C60870cx f = this.f382876b.f382877a.mo50346f(bbVar, a);
        C69664n.m101060f(f, "searchResultsCache.put(request, result)");
        return f;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18088c() {
        C46690ah ahVar = C140192a.f380885a;
        C69664n.m101060f(ahVar, "PODCAST_KEY");
        return ahVar;
    }
}
