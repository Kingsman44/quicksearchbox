package com.google.android.apps.search.podcasts.search.p10610b;

import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10591p.C140747m;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4082j.p4083a.C54352be;
import com.google.p4017at.p4082j.p4083a.C54353bf;
import com.google.p4017at.p4082j.p4083a.C54355bh;
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

/* renamed from: com.google.android.apps.search.podcasts.search.b.e */
/* compiled from: PG */
public final class C141007e implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ String f382818a;

    /* renamed from: b */
    final /* synthetic */ C141008f f382819b;

    public C141007e(String str, C141008f fVar) {
        this.f382818a = str;
        this.f382819b = fVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C54352be beVar = (C54352be) C54353bf.f142786c.createBuilder();
        String str = this.f382818a;
        beVar.copyOnWrite();
        str.getClass();
        ((C54353bf) beVar.instance).f142788a = str;
        C62942bv build = beVar.build();
        C69664n.m101060f(build, "newBuilder().setQuery(query).build()");
        C47633f g = C47633f.m84733g(this.f382819b.f382820a.mo50345e((C54353bf) build));
        C141008f fVar = this.f382819b;
        return C140989k.m228943a(g.mo51516i(new C141006d(fVar, this.f382818a), fVar.f382824e));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        C54352be beVar = (C54352be) C54353bf.f142786c.createBuilder();
        String str = this.f382818a;
        beVar.copyOnWrite();
        str.getClass();
        ((C54353bf) beVar.instance).f142788a = str;
        C62942bv build = beVar.build();
        C69664n.m101060f(build, "newBuilder().setQuery(query).build()");
        C54353bf bfVar = (C54353bf) build;
        C141008f fVar = this.f382819b;
        C46407v vVar = fVar.f382820a;
        C140385d dVar = fVar.f382821b;
        String str2 = this.f382818a;
        C140747m mVar = dVar.f381341b;
        C54372by byVar = dVar.f381340a;
        C54352be beVar2 = (C54352be) C54353bf.f142786c.createBuilder();
        beVar2.copyOnWrite();
        str2.getClass();
        ((C54353bf) beVar2.instance).f142788a = str2;
        beVar2.copyOnWrite();
        ((C54353bf) beVar2.instance).f142789b = 9;
        C54353bf bfVar2 = (C54353bf) beVar2.build();
        C70888j jVar = byVar.f189039a;
        C70338di diVar = C54373bz.f142825g;
        if (diVar == null) {
            synchronized (C54373bz.class) {
                diVar = C54373bz.f142825g;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.podcasts.v1.PodcastsService", "GetSearchSuggest");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54353bf.f142786c);
                    d.f187486b = C70850d.m103697c(C54355bh.f142790b);
                    diVar = d.mo62040a();
                    C54373bz.f142825g = diVar;
                }
            }
        }
        C60870cx a = C70876o.m103760a(jVar.mo39510a(diVar, byVar.f189040b), bfVar2);
        mVar.mo115851a("PodcastsService", "GetSearchSuggest", a);
        C60870cx f = vVar.mo50346f(bfVar, a);
        C69664n.m101060f(f, "searchSuggestCache.put(r….getSearchSuggest(query))");
        return f;
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo18088c() {
        return C141009g.f382825a;
    }
}
