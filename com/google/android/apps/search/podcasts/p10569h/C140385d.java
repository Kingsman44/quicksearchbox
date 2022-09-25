package com.google.android.apps.search.podcasts.p10569h;

import com.google.android.apps.search.podcasts.p10591p.C140747m;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.p4632a.C61349j;
import com.google.frameworks.client.data.android.p4632a.C61354o;
import com.google.frameworks.client.data.android.p4632a.C61355p;
import com.google.frameworks.client.data.android.p4632a.C61358s;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import com.google.p4017at.p4082j.p4083a.C54319aw;
import com.google.p4017at.p4082j.p4083a.C54322az;
import com.google.p4017at.p4082j.p4083a.C54372by;
import com.google.p4017at.p4082j.p4083a.C54373bz;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70846h;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.apps.search.podcasts.h.d */
/* compiled from: PG */
public final class C140385d {

    /* renamed from: a */
    public final C54372by f381340a;

    /* renamed from: b */
    public final C140747m f381341b;

    public C140385d(C54372by byVar, C140382a aVar, C140747m mVar) {
        this.f381341b = mVar;
        C70846h hVar = C61409d.f166071a;
        C61349j jVar = new C61349j();
        C61354o a = C61355p.m93860a(new C58759qy("pseudonymous"));
        a.f165916a = C58833ax.m90834k("AIzaSyA91d5QCjQAVFNr_SJ6kRheyAB1kvll8FE");
        a.f165917b = true;
        jVar.f165910b = C58833ax.m90834k(a.mo57929a());
        this.f381340a = (C54372by) ((C54372by) byVar.mo62577p(hVar, new C61358s(jVar.mo57930b()))).mo62576o(new C70879r(aVar.mo115640a()));
    }

    /* renamed from: a */
    public final C60870cx mo115641a(C54319aw awVar) {
        C140747m mVar = this.f381341b;
        C54372by byVar = this.f381340a;
        C70888j jVar = byVar.f189039a;
        C70338di diVar = C54373bz.f142827i;
        if (diVar == null) {
            synchronized (C54373bz.class) {
                diVar = C54373bz.f142827i;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.podcasts.v1.PodcastsService", "GetPodcastShows");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54319aw.f142692b);
                    d.f187486b = C70850d.m103697c(C54322az.f142696b);
                    diVar = d.mo62040a();
                    C54373bz.f142827i = diVar;
                }
            }
        }
        C60870cx a = C70876o.m103760a(jVar.mo39510a(diVar, byVar.f189040b), awVar);
        mVar.mo115851a("PodcastsService", "GetPodcastShows", a);
        return a;
    }
}
