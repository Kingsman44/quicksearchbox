package com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7512b;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95127t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.b.i */
/* compiled from: PG */
final class C95745i implements C95127t {

    /* renamed from: a */
    final /* synthetic */ C95759w f268054a;

    public C95745i(C95759w wVar) {
        this.f268054a = wVar;
    }

    /* renamed from: a */
    public final void mo89047a() {
        C59071e eVar = C95759w.f268078a;
        C58976aa aaVar = C58975e.f156826a;
        C95748l lVar = this.f268054a.f268107r;
    }

    /* renamed from: b */
    public final void mo89048b() {
        C95759w wVar = this.f268054a;
        wVar.mo89739e(wVar.f268107r).mo89734d();
    }

    /* renamed from: c */
    public final boolean mo89049c() {
        C59071e eVar = C95759w.f268078a;
        C58976aa aaVar = C58975e.f156826a;
        this.f268054a.f268094e.mo88999f();
        return true;
    }

    /* renamed from: d */
    public final boolean mo89050d() {
        C59071e eVar = C95759w.f268078a;
        C58976aa aaVar = C58975e.f156826a;
        C95748l lVar = this.f268054a.f268107r;
        C95759w wVar = this.f268054a;
        if (!"deviceId-c18b75e2-82d5-4974-8bc9-7119c97c6ad8".equals(wVar.f268093d.mo89270k()) && wVar.mo89751q(3)) {
            wVar.mo89741g();
            wVar.mo89744j();
            C59104x d = C95759w.f268078a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HotwordStage2");
            ((C59052c) ((C59052c) d).mo56372aa(15407)).mo56386p("Received voice data more than 3s ago (consequently query timed out)");
            int i = C90755l.f253831a;
        }
        C95759w wVar2 = this.f268054a;
        wVar2.mo89739e(wVar2.f268107r).mo89737g();
        return true;
    }
}
