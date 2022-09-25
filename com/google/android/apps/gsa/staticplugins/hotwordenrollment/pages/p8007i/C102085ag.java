package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8007i;

import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88196ss;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88199sv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88200sw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.ag */
/* compiled from: PG */
public final /* synthetic */ class C102085ag implements C87682aj {

    /* renamed from: a */
    public final /* synthetic */ C102088aj f284780a;

    public /* synthetic */ C102085ag(C102088aj ajVar) {
        this.f284780a = ajVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C102088aj ajVar = this.f284780a;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a == C88244um.REAUTH_SERVICE_EVENT) {
            ajVar.f284795k.mo87058b();
            C88200sw swVar = (C88200sw) serviceEventData.mo81918e(C88196ss.f238416a);
            if (swVar == null) {
                C59104x c = C102088aj.f284785a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "LocalEscScreenFragment");
                ((C59052c) ((C59052c) c).mo56372aa(20547)).mo56386p("Reauth result is null");
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
                C47393f.m84236g(new C101783w(), ajVar.f284788d);
            } else if (i2 != 2) {
                C59104x d = C102088aj.f284785a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "LocalEscScreenFragment");
                C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(20546);
                int a3 = C88199sv.m142791a(swVar.f238421b);
                if (a3 != 0) {
                    i = a3;
                }
                cVar.mo56387q("Reauth failed with result %d", i - 1);
            } else {
                ajVar.f284795k.mo87059c();
            }
        }
    }
}
