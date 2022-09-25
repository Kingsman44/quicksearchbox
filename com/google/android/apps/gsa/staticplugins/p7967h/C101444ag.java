package com.google.android.apps.gsa.staticplugins.p7967h;

import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C84924b;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85493j;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.search.assistant.surfaces.p9418c.C125010a;
import com.google.assistant.p3803ag.p3804a.p3805a.C48791k;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.assistant.p4008y.p4009a.C53606o;
import com.google.assistant.p4008y.p4010b.C53623e;
import com.google.assistant.p4008y.p4015e.C53670f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.p4985f.p5036r.C65329o;

/* renamed from: com.google.android.apps.gsa.staticplugins.h.ag */
/* compiled from: PG */
final class C101444ag extends C85493j {

    /* renamed from: a */
    public final SettableFuture f283020a = new SettableFuture();

    /* renamed from: b */
    final /* synthetic */ C101451an f283021b;

    public C101444ag(C101451an anVar) {
        this.f283021b = anVar;
    }

    /* renamed from: c */
    public final void mo79004c(C53606o oVar) {
        if (this.f283021b.f283034b.mo79746e(C90037cp.f248401I)) {
            if ((oVar.f140700a & 1) == 0) {
                C58976aa aaVar = C58975e.f156826a;
            }
            C90875ai.m148465b(C101489y.f283222a, this.f283021b.f283036f.mo78594c(oVar), this.f283021b.f283038h, "onChalkboardPrefetchResponse in ClientSyncPrefetchCallback").mo85223a(C101490z.f283223a);
            return;
        }
        C59104x d = C101451an.f283032a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ACS.Worker");
        ((C59052c) ((C59052c) d).mo56372aa(13893)).mo56386p("Do not prefetch chalkboard data since flag is turned off");
    }

    /* renamed from: f */
    public final void mo79007f(C53623e eVar) {
        if (this.f283021b.f283034b.mo79746e(C90053de.f248939F)) {
            if ((eVar.f140746a & 1) == 0) {
                C58976aa aaVar = C58975e.f156826a;
            }
            C84924b bVar = this.f283021b.f283036f;
            C53670f fVar = eVar.f140747b;
            if (fVar == null) {
                fVar = C53670f.f140873d;
            }
            new C90873ag(bVar.mo78595d(fVar), this.f283021b.f283038h, "onGrowthClientSyncResponse in ClientSyncPrefetchCallback", C101438aa.f283014a).mo85223a(C101439ab.f283015a);
        }
    }

    /* renamed from: g */
    public final void mo79008g(C65329o oVar) {
        this.f283021b.f283037g.mo78600b(oVar);
    }

    /* renamed from: k */
    public final void mo79012k(C48791k kVar) {
        C90875ai.m148465b(C101442ae.f283018a, this.f283021b.f283040j.mo78647b(kVar), this.f283021b.f283038h, "onProactiveApiSyncResponse in ClientSyncBackgroundRefreshCallback").mo85223a(C101443af.f283019a);
    }

    /* renamed from: n */
    public final void mo79015n(C53422nh nhVar) {
        C59071e eVar = C101451an.f283032a;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f283021b.f283041k.mo56113h()) {
            ((C125010a) this.f283021b.f283041k.mo56107c()).mo106779b();
        }
        new C90873ag(this.f283021b.f283035c.mo78643b(nhVar, false), this.f283021b.f283038h, "onZeroStateResponse in ClientSyncPrefetchCallback", new C101440ac(this)).mo85223a(C101441ad.f283017a);
    }
}
