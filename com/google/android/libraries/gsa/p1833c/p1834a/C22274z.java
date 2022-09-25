package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import org.chromium.net.ExperimentalCronetEngine;

/* renamed from: com.google.android.libraries.gsa.c.a.z */
/* compiled from: PG */
final class C22274z implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C22209ah f61549a;

    public C22274z(C22209ah ahVar) {
        this.f61549a = ahVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C22209ah.f61294b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CronetEngineProvidrImpl");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(48450)).mo56386p("Cronet engine failed to instantiate.");
        int i = C90755l.f253831a;
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C22209ah.m41539n(this.f61549a.f61295c, (ExperimentalCronetEngine) obj);
    }
}
