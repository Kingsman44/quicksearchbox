package com.google.android.apps.search.podcasts.search;

import android.view.View;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10591p.C140747m;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.search.p10609a.C141000a;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4082j.p4083a.C54372by;
import com.google.p4017at.p4082j.p4083a.C54373bz;
import com.google.p4017at.p4082j.p4083a.C54442g;
import com.google.p4017at.p4082j.p4083a.C54443h;
import com.google.p4017at.p4082j.p4083a.C54445j;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.podcasts.search.l */
/* compiled from: PG */
final class C141020l implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141022n f382838a;

    /* renamed from: b */
    final /* synthetic */ C141000a f382839b;

    public C141020l(C141022n nVar, C141000a aVar) {
        this.f382838a = nVar;
        this.f382839b = aVar;
    }

    public final void onClick(View view) {
        C140385d dVar = this.f382838a.f382844c;
        String str = this.f382839b.f382801a.f142897a;
        C140747m mVar = dVar.f381341b;
        C54372by byVar = dVar.f381340a;
        C54442g gVar = (C54442g) C54443h.f142970b.createBuilder();
        gVar.copyOnWrite();
        str.getClass();
        ((C54443h) gVar.instance).f142972a = str;
        C54443h hVar = (C54443h) gVar.build();
        C70888j jVar = byVar.f189039a;
        C70338di diVar = C54373bz.f142826h;
        if (diVar == null) {
            synchronized (C54373bz.class) {
                diVar = C54373bz.f142826h;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.podcasts.v1.PodcastsService", "DeleteSearchSuggest");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54443h.f142970b);
                    d.f187486b = C70850d.m103697c(C54445j.f142973a);
                    diVar = d.mo62040a();
                    C54373bz.f142826h = diVar;
                }
            }
        }
        C60870cx a = C70876o.m103760a(jVar.mo39510a(diVar, byVar.f189040b), hVar);
        mVar.mo115851a("PodcastsService", "DeleteSearchSuggest", a);
        C141022n nVar = this.f382838a;
        C140989k.m228951i(a, nVar.f382846e, new C141019k(nVar));
    }
}
