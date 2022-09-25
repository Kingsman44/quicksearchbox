package com.google.android.apps.search.googleapp.stampviewer.p10495g;

import com.google.apps.tiktok.cache.C46406u;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4027c.p4031b.p4041d.p4042a.C53908c;
import com.google.p4017at.p4027c.p4031b.p4041d.p4042a.C53910e;
import com.google.p4017at.p4027c.p4031b.p4041d.p4042a.C53914i;
import com.google.p4017at.p4027c.p4031b.p4041d.p4042a.C53915j;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.g.j */
/* compiled from: PG */
public final /* synthetic */ class C139406j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C139408l f379058a;

    public /* synthetic */ C139406j(C139408l lVar) {
        this.f379058a = lVar;
    }

    public final C60870cx apply(Object obj) {
        C53908c cVar = (C53908c) obj;
        C139409m mVar = this.f379058a.f379061b;
        C46406u uVar = mVar.f379064c;
        C53914i iVar = mVar.f379063b;
        C70888j jVar = iVar.f189039a;
        C70338di diVar = C53915j.f141472a;
        if (diVar == null) {
            synchronized (C53915j.class) {
                diVar = C53915j.f141472a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.discover.discofeed.recommendations.v1.StoryRecommendations", "ListRecommendedStories");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C53908c.f141452g);
                    d.f187486b = C70850d.m103697c(C53910e.f141461b);
                    diVar = d.mo62040a();
                    C53915j.f141472a = diVar;
                }
            }
        }
        return uVar.mo50346f(cVar, C70876o.m103760a(jVar.mo39510a(diVar, iVar.f189040b), cVar));
    }
}
