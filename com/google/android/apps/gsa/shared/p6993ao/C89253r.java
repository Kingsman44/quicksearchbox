package com.google.android.apps.gsa.shared.p6993ao;

import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88266vh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88268vj;

/* renamed from: com.google.android.apps.gsa.shared.ao.r */
/* compiled from: PG */
final class C89253r implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ C89254s f242014a;

    public C89253r(C89254s sVar) {
        this.f242014a = sVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C88244um umVar = C88244um.SET_SEARCH_PLATE_MODE;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (umVar == a) {
            switch (((C88268vj) serviceEventData.mo81918e(C88266vh.f238738a)).f238742b) {
                case 1:
                    this.f242014a.mo83210a(1);
                    return;
                case 2:
                    this.f242014a.mo83210a(2);
                    return;
                case 3:
                    this.f242014a.mo83210a(3);
                    return;
                case 4:
                case 5:
                case 6:
                    this.f242014a.mo83210a(5);
                    return;
                default:
                    this.f242014a.mo83210a(4);
                    return;
            }
        }
    }
}
