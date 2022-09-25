package com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7512b;

import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95832d;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.gsa.p1876k.p1879c.C22865a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.b.k */
/* compiled from: PG */
final class C95747k extends C95754r {

    /* renamed from: a */
    final /* synthetic */ C95759w f268056a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95747k(C95759w wVar) {
        super(wVar);
        this.f268056a = wVar;
    }

    /* renamed from: b */
    public final void mo89732b(byte[] bArr) {
        Long l;
        C59071e eVar = C95759w.f268078a;
        C58976aa aaVar = C58975e.f156826a;
        C95759w wVar = this.f268056a;
        if (wVar.f268081B == null || (l = wVar.f268111v) == null || l.longValue() < this.f268056a.f268081B.longValue()) {
            this.f268056a.mo89750p(bArr);
            return;
        }
        C95759w wVar2 = this.f268056a;
        C59104x b = C95759w.f268078a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordStage2");
        ((C59052c) ((C59052c) b).mo56372aa(15428)).mo56386p("#onHotwordNotDetected");
        C95832d dVar = wVar2.f268106q;
        if (dVar != null) {
            dVar.mo89811l(C95832d.m158873b(wVar2.f268103n));
        }
        C22872h.m42742b(C22865a.class);
        synchronized (wVar2) {
            wVar2.f268081B = null;
            wVar2.f268100k.mo89293f(wVar2.f268093d);
            wVar2.mo89747m(C95748l.NONE);
        }
        wVar2.mo89746l();
    }
}
