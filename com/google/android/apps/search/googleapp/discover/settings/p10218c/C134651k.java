package com.google.android.apps.search.googleapp.discover.settings.p10218c;

import com.google.android.apps.search.googleapp.discover.p10245w.p10246a.C135209c;
import com.google.android.apps.search.googleapp.discover.settings.p10218c.p10219a.C134639g;
import com.google.android.apps.search.googleapp.discover.settings.p10218c.p10219a.C134640h;
import com.google.android.libraries.search.integrations.p3015b.p3016a.C38497c;
import com.google.android.libraries.search.integrations.p3015b.p3016a.p3017a.C38493b;
import com.google.android.libraries.search.integrations.p3015b.p3016a.p3017a.C38494c;
import com.google.android.libraries.search.integrations.p3015b.p3016a.p3017a.C38495d;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46882v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.c.k */
/* compiled from: PG */
final class C134651k extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C134649j f366681a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134651k(C134649j jVar) {
        super(1);
        this.f366681a = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        String str = (String) obj;
        C69664n.m101061g(str, "it");
        C134649j jVar = this.f366681a;
        C46778cv cvVar = jVar.f366674j;
        C134640h hVar = jVar.f366670f;
        C69664n.m101061g(str, "newLanguage");
        C38497c cVar = hVar.f366639b;
        C38494c cVar2 = (C38494c) C38495d.f101847e.createBuilder();
        C69664n.m101060f(cVar2, "newBuilder()");
        C38493b a = C69664n.m101061g(cVar2, "builder");
        a.mo41444b(str);
        C60870cx c = cVar.mo41447c(a.mo41443a());
        C46882v vVar = new C46882v();
        vVar.mo50885b(c);
        vVar.mo50886c(hVar.f366646i.mo18088c());
        vVar.f122322c = C47810es.m84963c(C134639g.f366637a);
        C47633f g = C47633f.m84733g(hVar.f366644g.mo50786a(vVar.mo50884a()));
        C69664n.m101060f(g, "from(mutationManager.register(mutation))");
        cvVar.mo50788b(C135209c.m219302a(g), this.f366681a.f366670f.f366646i.mo18088c());
        return C69788q.f186170a;
    }
}
