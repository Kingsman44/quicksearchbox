package com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7512b;

import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95778bp;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.b.s */
/* compiled from: PG */
public final /* synthetic */ class C95755s implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95757u f268073a;

    public /* synthetic */ C95755s(C95757u uVar) {
        this.f268073a = uVar;
    }

    public final void run() {
        C95757u uVar = this.f268073a;
        synchronized (uVar.f268075a) {
            Uri b = uVar.f268075a.f268094e.mo89782b();
            C58976aa aaVar = C58975e.f156826a;
            if (b == null) {
                C59104x c = C95759w.f268078a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "HotwordStage2");
                ((C59052c) ((C59052c) c).mo56372aa(15404)).mo56386p("active URI is null");
            } else {
                C95759w wVar = uVar.f268075a;
                C95778bp bpVar = wVar.f268094e;
                C95756t tVar = new C95756t(uVar, b, wVar.f268097h.mo26870b());
                C95759w wVar2 = uVar.f268075a;
                bpVar.mo89790v(tVar, new C95745i(wVar2), wVar2.f268108s, wVar2.f268106q);
            }
        }
    }
}
