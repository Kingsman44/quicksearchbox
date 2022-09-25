package com.google.android.apps.search.podcasts.p10588n;

import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10591p.C140747m;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4082j.p4083a.C54309am;
import com.google.p4017at.p4082j.p4083a.C54311ao;
import com.google.p4017at.p4082j.p4083a.C54372by;
import com.google.p4017at.p4082j.p4083a.C54373bz;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.podcasts.n.o */
/* compiled from: PG */
final class C140686o extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140690s f382092a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140686o(C140690s sVar) {
        super(1);
        this.f382092a = sVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        C60870cx cxVar;
        if (((Boolean) obj).booleanValue()) {
            C140385d dVar = this.f382092a.f382100e;
            C140747m mVar = dVar.f381341b;
            C54372by byVar = dVar.f381340a;
            C54309am amVar = C54309am.f142677a;
            C70888j jVar = byVar.f189039a;
            C70338di diVar = C54373bz.f142819a;
            if (diVar == null) {
                synchronized (C54373bz.class) {
                    diVar = C54373bz.f142819a;
                    if (diVar == null) {
                        C70335df d = C70338di.m102603d();
                        d.f187487c = C70337dh.UNARY;
                        d.f187488d = C70338di.m102602c("google.internal.podcasts.v1.PodcastsService", "GetHomeFeed");
                        d.f187489e = true;
                        d.f187485a = C70850d.m103697c(C54309am.f142677a);
                        d.f187486b = C70850d.m103697c(C54311ao.f142679b);
                        diVar = d.mo62040a();
                        C54373bz.f142819a = diVar;
                    }
                }
            }
            cxVar = C70876o.m103760a(jVar.mo39510a(diVar, byVar.f189040b), amVar);
            mVar.mo115851a("PodcastsService", "GetHomeFeed", cxVar);
            this.f382092a.mo115833g(C140989k.m228944b(cxVar, C140685n.f382091a));
        } else {
            cxVar = C60856cj.m92900i(C54311ao.f142679b);
        }
        C60870cx f = this.f382092a.f382097b.mo50346f(C54309am.f142677a, cxVar);
        C69664n.m101060f(f, "homeFeedCache.put(GetHom…stance(), homeFeedFuture)");
        return f;
    }
}
