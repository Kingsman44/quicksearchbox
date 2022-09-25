package com.google.android.apps.gsa.plugins.nativeresults.canvas;

import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.af */
/* compiled from: PG */
final class C84069af implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ C22871g f228971a;

    /* renamed from: b */
    final /* synthetic */ C87680ah f228972b;

    /* renamed from: c */
    final /* synthetic */ C88244um[] f228973c;

    /* renamed from: d */
    final /* synthetic */ C87682aj f228974d;

    /* renamed from: e */
    private boolean f228975e = false;

    public C84069af(C22871g gVar, C87680ah ahVar, C88244um[] umVarArr, C87682aj ajVar) {
        this.f228971a = gVar;
        this.f228972b = ahVar;
        this.f228973c = umVarArr;
        this.f228974d = ajVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C58838bb.m90883r(C84070ag.m133982a());
        if (!this.f228975e) {
            this.f228975e = true;
            this.f228971a.mo28212l("SearchServiceClientUtil#cleanup", new C84068ae(this.f228972b, this, this.f228973c));
            C84113q.m134043a(((C84111o) this.f228974d).f229039a, serviceEventData);
        }
    }
}
