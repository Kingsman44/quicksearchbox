package com.google.android.apps.gsa.staticplugins.bisto.p7459aa;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.d */
/* compiled from: PG */
public final /* synthetic */ class C94776d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C94785f f265010a;

    public /* synthetic */ C94776d(C94785f fVar) {
        this.f265010a = fVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C94785f fVar = this.f265010a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            C59104x b = C94785f.f265029a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoEventHandler");
            ((C59052c) ((C59052c) b).mo56372aa(16751)).mo56386p("No TTS available");
            fVar.mo88612f();
            fVar.f265034f.mo57356n(C118826c.f331422a);
            return;
        }
        fVar.mo88617k(((C90606n) axVar.mo56107c()).mo84646b().mo59174N(), (String) null);
    }
}
