package com.google.android.apps.gsa.staticplugins.avocado.p7420b;

import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88196ss;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88199sv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88200sw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.b.a */
/* compiled from: PG */
public final /* synthetic */ class C94184a implements C87682aj {

    /* renamed from: a */
    public final /* synthetic */ C94189f f263148a;

    public /* synthetic */ C94184a(C94189f fVar) {
        this.f263148a = fVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C94189f fVar = this.f263148a;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a == C88244um.REAUTH_SERVICE_EVENT) {
            fVar.f263165l.mo87058b();
            C88200sw swVar = (C88200sw) serviceEventData.mo81918e(C88196ss.f238416a);
            if (swVar == null) {
                C59104x c = C94189f.f263155b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "LocalEscScreenFragment");
                ((C59052c) ((C59052c) c).mo56372aa(14442)).mo56386p("Reauth result is null");
                return;
            }
            C58976aa aaVar = C58975e.f156826a;
            int a2 = C88199sv.m142791a(swVar.f238421b);
            int i = 1;
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 == 1) {
                fVar.mo88386g(2);
            } else if (i2 != 2) {
                C59104x d = C94189f.f263155b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "LocalEscScreenFragment");
                C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(14441);
                int a3 = C88199sv.m142791a(swVar.f238421b);
                if (a3 != 0) {
                    i = a3;
                }
                cVar.mo56387q("Reauth failed with result %d", i - 1);
            } else {
                fVar.f263165l.mo87059c();
            }
        }
    }
}
