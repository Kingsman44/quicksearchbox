package com.google.android.apps.search.googleapp.discover.streamui.p10229e;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134757h;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134759j;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134762m;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134765p;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.p4552o.C59710cy;
import com.google.common.p4552o.C59711cz;
import com.google.protobuf.C62940bt;
import p3186j$.util.concurrent.ConcurrentMap;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.e.d */
/* compiled from: PG */
public final class C134724d {

    /* renamed from: a */
    private final C134727g f366872a;

    /* renamed from: b */
    private final C37215b f366873b;

    /* renamed from: c */
    private boolean f366874c;

    public C134724d(C134727g gVar, C37215b bVar) {
        C69664n.m101061g(gVar, "discoverPerSurfaceLaunchStatus");
        C69664n.m101061g(bVar, "appFlowLogger");
        this.f366872a = gVar;
        this.f366873b = bVar;
    }

    /* renamed from: a */
    public final void mo111913a(C134766q qVar) {
        C37258g gVar;
        Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(this.f366872a.f366882a, qVar, new C134723c(qVar));
        C69664n.m101060f(computeIfAbsent, "surface: TngDiscoverSurf…erLaunchStatus(surface) }");
        C134725e eVar = (C134725e) computeIfAbsent;
        synchronized (eVar) {
            if (!eVar.mo111917c()) {
                eVar.mo111915a();
                C37215b bVar = this.f366873b;
                if (qVar instanceof C134762m) {
                    gVar = C37182a.f97972ds;
                    C69664n.m101060f(gVar, "HOME_SCREEN_LOADING_DISCOVER");
                } else if (qVar instanceof C134765p) {
                    gVar = C37182a.f97973dt;
                    C69664n.m101060f(gVar, "DISCOVER_MORE_STORIES_TAP");
                } else if (qVar instanceof C134759j) {
                    gVar = C37182a.f97975dv;
                    C69664n.m101060f(gVar, "DISCOVER_FULL_COVERAGE_TAP");
                } else if (qVar instanceof C134757h) {
                    gVar = C37182a.f97933dF;
                    C69664n.m101060f(gVar, "DISCOVER_CHANNELS_OPEN");
                } else {
                    throw new IllegalArgumentException("Surface is not logged from this class");
                }
                C37252a c = gVar.mo40779c();
                C62940bt btVar = C59711cz.f160208s;
                C59710cy cyVar = (C59710cy) C59711cz.f160207r.createBuilder();
                int i = true != this.f366874c ? 2 : 3;
                cyVar.copyOnWrite();
                C59711cz czVar = (C59711cz) cyVar.instance;
                czVar.f160226q = i - 1;
                czVar.f160210a |= 65536;
                c.mo40792p(btVar, cyVar.build());
                bVar.mo19974a(c);
                eVar.f366878d = new C134735o(false);
                this.f366874c = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo111914b(C134766q qVar) {
        C69664n.m101061g(qVar, "surface");
        mo111913a(qVar);
    }
}
