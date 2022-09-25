package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8535a;

import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C112002j;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8536b.C111846a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111249l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8545i.C112078c;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C111840d implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C111844h f310809a;

    /* renamed from: b */
    public final /* synthetic */ C19167ba f310810b;

    public /* synthetic */ C111840d(C111844h hVar, C19167ba baVar) {
        this.f310809a = hVar;
        this.f310810b = baVar;
    }

    public final void run() {
        C111844h hVar = this.f310809a;
        C19167ba baVar = this.f310810b;
        C58976aa aaVar = C58975e.f156826a;
        C111846a aVar = hVar.f310823j;
        C2393x a = aVar.mo99266a();
        int i = aVar.f310824a;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                a.mo5793e(C2382m.ON_CREATE);
                a.mo5793e(C2382m.ON_START);
                a.mo5793e(C2382m.ON_RESUME);
            } else if (i2 == 2) {
                a.mo5793e(C2382m.ON_RESUME);
            }
            aVar.f310824a = 2;
            C112078c cVar = hVar.f310817d;
            cVar.f311253d = true;
            cVar.f311254e = true;
            cVar.mo99353d();
            if (!hVar.f310818e.isPresent() || !hVar.f310819f.isPresent()) {
                C59104x d = C111844h.f310814a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TapasEngineController");
                ((C59052c) ((C59052c) d).mo56372aa(27444)).mo56386p("TapasEngine unavailable in prewarm, please turn on Tapas feature flag.");
                return;
            }
            ((C112002j) hVar.f310818e.get()).mo99260e(baVar);
            ((C111249l) hVar.f310822i.mo27525b()).mo99078a();
            return;
        }
        throw null;
    }
}
