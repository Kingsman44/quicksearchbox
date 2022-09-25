package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h;

import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.assistant.p3739a.p3740a.C48045af;
import com.google.assistant.p3739a.p3740a.C48090bx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.h.q */
/* compiled from: PG */
public final /* synthetic */ class C94999q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95005w f265770a;

    /* renamed from: b */
    public final /* synthetic */ String f265771b;

    /* renamed from: c */
    public final /* synthetic */ C95007y f265772c;

    /* renamed from: d */
    public final /* synthetic */ C124548d f265773d;

    /* renamed from: e */
    public final /* synthetic */ C48090bx f265774e;

    public /* synthetic */ C94999q(C95005w wVar, String str, C95007y yVar, C124548d dVar, C48090bx bxVar) {
        this.f265770a = wVar;
        this.f265771b = str;
        this.f265772c = yVar;
        this.f265773d = dVar;
        this.f265774e = bxVar;
    }

    public final void run() {
        C95005w wVar = this.f265770a;
        String str = this.f265771b;
        C95007y yVar = this.f265772c;
        C124548d dVar = this.f265773d;
        C48090bx bxVar = this.f265774e;
        C94995m mVar = wVar.f265808b;
        C95003u uVar = new C95003u(wVar, yVar);
        C58976aa aaVar = C58975e.f156826a;
        C48045af afVar = bxVar.f124455c;
        if (afVar == null) {
            afVar = C48045af.f124365d;
        }
        mVar.mo88900d("Device state: %s", afVar);
        mVar.f265751n = uVar;
        mVar.f265759v = dVar;
        C59104x b = C94995m.f265738a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17817)).mo56386p("startTextQueryInternal");
        Bundle bundle = new Bundle();
        C94995m.m156832a(bundle, bxVar, dVar, mVar.f265746i.f265849b);
        C95006x xVar = mVar.f265742e;
        boolean z = mVar.f265752o;
        xVar.f265815d.mo89056a();
        xVar.mo88915d();
        long a = C95006x.m156856a(bundle);
        Query aI = Query.f252741b.mo84307as(xVar.mo88913b(bundle, dVar)).mo84275aL("com.google.android.apps.gsa.search.core.service.SearchService").mo84272aI(amo.BISTO);
        C90498f i = aI.mo84480i();
        i.mo84562U(0);
        i.mo84573e(0, 2048);
        i.mo84573e(0, 2);
        i.mo84561T(QueryTriggerType.BISTO);
        i.mo84572d(512, 0);
        i.mo84552K(-2, -2);
        i.mo84572d(16384, 0);
        i.mo84564W(0);
        i.mo84546E(str);
        i.mo84572d(0, 1024);
        i.mo84549H((Long) null);
        i.mo84593y(aI.f252746D.mo83792a(a));
        i.mo84551J(aI.f252760R);
        Query aX = i.mo84568a().mo84244G(true).mo84287aX();
        if (z) {
            aX = aX.mo84286aW(QueryTriggerType.FOLLOW_ON);
        }
        C59104x b2 = C95006x.f265812a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "GsaVoiceCM");
        ((C59052c) ((C59052c) b2).mo56372aa(17835)).mo56389s("build text query %s", aX);
        Query aH = aX.mo84271aH(xVar.f265817f);
        C59104x b3 = C95006x.f265812a.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "GsaVoiceCM");
        ((C59052c) ((C59052c) b3).mo56372aa(17843)).mo56389s("textQuery %s", aH);
        xVar.f265814c.mo81937i(new C88489j(C87739bu.OPA_CANCEL_CONVERSATION).mo82013a());
        xVar.f265814c.mo81931b(aH);
        C95007y yVar2 = mVar.f265751n;
        yVar2.getClass();
        yVar2.mo88819j(mVar.f265742e.f265817f, bxVar.f124456d);
        mVar.mo88902f("FETCHING");
    }
}
