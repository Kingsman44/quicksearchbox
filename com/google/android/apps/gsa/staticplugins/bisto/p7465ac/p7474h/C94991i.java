package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h;

import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.h.i */
/* compiled from: PG */
class C94991i {

    /* renamed from: d */
    final String f265734d;

    /* renamed from: e */
    final /* synthetic */ C94995m f265735e;

    public C94991i(C94995m mVar, String str) {
        this.f265735e = mVar;
        this.f265734d = str;
    }

    /* renamed from: a */
    public void mo88895a() {
        C59071e eVar = C94995m.f265738a;
        C58976aa aaVar = C58975e.f156826a;
        C95007y yVar = this.f265735e.f265751n;
        if (yVar != null) {
            yVar.mo88814e();
        }
        this.f265735e.f265742e.mo88914c();
        this.f265735e.f265742e.f265815d.mo89057b();
        C94995m mVar = this.f265735e;
        mVar.f265753p = false;
        mVar.mo88902f("DONE");
    }

    /* renamed from: b */
    public void mo88896b() {
        C59104x b = C94995m.f265738a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17788)).mo56389s("enter state: %s", this.f265734d);
    }

    /* renamed from: c */
    public void mo88897c() {
        C59104x b = C94995m.f265738a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17789)).mo56389s("exit state: %s", this.f265734d);
    }

    /* renamed from: d */
    public void mo88898d(ServiceEventData serviceEventData) {
        C59104x c = C94995m.f265738a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
        C59052c cVar = (C59052c) ((C59052c) c).mo56372aa(17790);
        String str = this.f265734d;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        cVar.mo56352E("%s state: Unexpected onServiceEvent: %d", str, a.f238695cJ);
    }
}
