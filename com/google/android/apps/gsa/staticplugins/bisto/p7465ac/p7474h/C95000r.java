package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h;

import com.google.assistant.p3739a.p3740a.C48045af;
import com.google.assistant.p3739a.p3740a.C48090bx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.h.r */
/* compiled from: PG */
public final /* synthetic */ class C95000r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95005w f265775a;

    /* renamed from: b */
    public final /* synthetic */ C95007y f265776b;

    /* renamed from: c */
    public final /* synthetic */ boolean f265777c;

    /* renamed from: d */
    public final /* synthetic */ C48090bx f265778d;

    public /* synthetic */ C95000r(C95005w wVar, C95007y yVar, boolean z, C48090bx bxVar) {
        this.f265775a = wVar;
        this.f265776b = yVar;
        this.f265777c = z;
        this.f265778d = bxVar;
    }

    public final void run() {
        C95005w wVar = this.f265775a;
        C95007y yVar = this.f265776b;
        boolean z = this.f265777c;
        C48090bx bxVar = this.f265778d;
        C94995m mVar = wVar.f265808b;
        C95003u uVar = new C95003u(wVar, yVar);
        C58976aa aaVar = C58975e.f156826a;
        C48045af afVar = bxVar.f124455c;
        if (afVar == null) {
            afVar = C48045af.f124365d;
        }
        mVar.mo88900d("Device state: %s", afVar);
        if (!mVar.f265761x.f265734d.equals("IDLE") && !mVar.f265761x.f265734d.equals("DONE")) {
            C59104x b = C94995m.f265738a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
            ((C59052c) ((C59052c) b).mo56372aa(17815)).mo56389s("Current state: %s; cancelling current query", mVar.f265761x.f265734d);
            mVar.f265761x.mo88895a();
        }
        mVar.f265751n = uVar;
        mVar.f265760w = true;
        mVar.f265756s = 0;
        mVar.f265755r = null;
        mVar.f265742e.mo88915d();
        uVar.mo88817h(mVar.f265742e.f265817f, z, bxVar.f124456d);
        mVar.mo88902f("WAITING_FOR_AUDIO");
    }
}
