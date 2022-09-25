package com.google.android.apps.gsa.staticplugins.opa.p8401o;

import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88363yx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88365yz;
import com.google.android.apps.gsa.shared.p6968aa.C89034be;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.opa.C108525db;
import com.google.android.apps.gsa.staticplugins.opa.C109268ic;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5208h.C66554ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.o.a */
/* compiled from: PG */
public final class C109754a implements C87682aj, C90991b {

    /* renamed from: c */
    private static final C59071e f305795c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.o.a");

    /* renamed from: a */
    public boolean f305796a = true;

    /* renamed from: b */
    public C108525db f305797b;

    /* renamed from: d */
    private C66554ak f305798d = C66554ak.UNKNOWN;

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C109268ic icVar;
        C88244um umVar = C88244um.UPDATE_CURRENT_NETWORK_TYPE;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (umVar == a) {
            C66554ak akVar = this.f305798d;
            C66554ak a2 = C66554ak.m97248a(((C88365yz) serviceEventData.mo81918e(C88363yx.f238960a)).f238964b);
            this.f305798d = a2;
            if (a2 == null) {
                this.f305798d = C66554ak.UNKNOWN;
            }
            boolean z = this.f305796a;
            boolean z2 = true;
            if (!C89034be.m144793c(this.f305798d) && !C89034be.m144792b(this.f305798d)) {
                z2 = false;
            }
            this.f305796a = z2;
            if (z2 != z) {
                C59104x b = f305795c.mo56224b();
                b.mo56378ag(C58975e.f156826a, "OpaConnectivityListener");
                ((C59052c) ((C59052c) b).mo56372aa(24071)).mo56360M("previousNetworkType[%s], previouslyConnectedOrUnknown[%b]; currentNetworkType[%s], mIsCurrentlyConnectedOrUnknown[%b]", akVar, Boolean.valueOf(z), this.f305798d, Boolean.valueOf(this.f305796a));
            } else {
                C58976aa aaVar = C58975e.f156826a;
            }
            C108525db dbVar = this.f305797b;
            if (dbVar != null && !this.f305796a && (icVar = dbVar.f301943a.f303351cE) != null) {
                icVar.mo97734a();
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("OpaConnectivityListener");
        fVar.mo85279c("connected").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f305796a)));
        fVar.mo85279c("network_type").mo85276a(C90752i.m148231e(this.f305798d));
    }
}
