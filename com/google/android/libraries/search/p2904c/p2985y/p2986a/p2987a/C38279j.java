package com.google.android.libraries.search.p2904c.p2985y.p2986a.p2987a;

import com.google.android.libraries.search.p2904c.C37464cm;
import com.google.android.libraries.search.p2904c.C37504dk;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.y.a.a.j */
/* compiled from: PG */
final class C38279j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58833ax f101413a;

    /* renamed from: b */
    final /* synthetic */ C38280k f101414b;

    public C38279j(C38280k kVar, C58833ax axVar) {
        this.f101414b = kVar;
        this.f101413a = axVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (this.f101413a.mo56113h()) {
            C59104x d = C38280k.f101415b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ALT.AudioEventsHolder");
            ((C59052c) ((C59052c) d).mo56372aa(53074)).mo56389s("#audio# cannot retrieve route update status for audio request client(token(%d))", this.f101413a.mo56107c());
        } else {
            C59104x d2 = C38280k.f101415b.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ALT.AudioEventsHolder");
            ((C59052c) ((C59052c) d2).mo56372aa(53073)).mo56386p("#audio# cannot retrieve route update status for hotword client");
        }
        this.f101414b.mo41355k(C38280k.m67576j(C37846as.m66800f(C37504dk.FAILED_GETTING_ROUTING_STATUS_FUTURE), this.f101413a));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37464cm cmVar = (C37464cm) obj;
        if (this.f101413a.mo56113h()) {
            C59104x b = C38280k.f101415b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ALT.AudioEventsHolder");
            C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(53076);
            Object c = this.f101413a.mo56107c();
            C37504dk a = C37504dk.m66506a(cmVar.f99449b);
            if (a == null) {
                a = C37504dk.UNKNOWN_ROUTING_STATUS;
            }
            cVar.mo56354G("#audio# route for audio request client(token(%d)) updated with status(%s)", c, a.name());
        } else {
            C59104x b2 = C38280k.f101415b.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "ALT.AudioEventsHolder");
            C59052c cVar2 = (C59052c) ((C59052c) b2).mo56372aa(53075);
            C37504dk a2 = C37504dk.m66506a(cmVar.f99449b);
            if (a2 == null) {
                a2 = C37504dk.UNKNOWN_ROUTING_STATUS;
            }
            cVar2.mo56389s("#audio# route for hotword client updated with status(%s)", a2.name());
        }
        this.f101414b.mo41355k(C38280k.m67576j(cmVar, this.f101413a));
    }
}
