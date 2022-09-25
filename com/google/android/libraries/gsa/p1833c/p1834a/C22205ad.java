package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22158aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import org.chromium.net.ExperimentalCronetEngine;

/* renamed from: com.google.android.libraries.gsa.c.a.ad */
/* compiled from: PG */
public final class C22205ad implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C22209ah f61290a;

    /* renamed from: b */
    final /* synthetic */ C22158aa f61291b;

    public C22205ad(C22209ah ahVar, C22158aa aaVar) {
        this.f61290a = ahVar;
        this.f61291b = aaVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C22209ah.f61294b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CronetEngineProvidrImpl");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(48452)).mo56386p("Cronet engine failed to instantiate.");
        int i = C90755l.f253831a;
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        ExperimentalCronetEngine experimentalCronetEngine = (ExperimentalCronetEngine) obj;
        if (this.f61290a.f61297e) {
            C22204ac acVar = new C22204ac(this);
            experimentalCronetEngine.addRttListener(new C22206ae(acVar, this.f61291b));
            experimentalCronetEngine.addThroughputListener(new C22207af(acVar, this.f61291b));
        }
    }
}
