package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8705d;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.C86354a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6825d.C86371i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116767hp;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116769hr;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.d.i */
/* compiled from: PG */
public final class C116493i extends C86354a implements C86371i {

    /* renamed from: a */
    private final C116769hr f322987a;

    public C116493i(C116769hr hrVar) {
        this.f322987a = hrVar;
    }

    /* renamed from: a */
    public final void mo80143a(Query query, C60870cx cxVar) {
        C116769hr hrVar = this.f322987a;
        if (!query.mo84337bV() && !query.mo84438dS() && query.mo84391cX()) {
            C22871g gVar = hrVar.f323939d;
            long j = query.f252780s;
            gVar.mo28211k(cxVar, "Network Completion Callback for commit: " + j, new C116767hp(hrVar, query));
        }
    }
}
