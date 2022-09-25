package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92369g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.speech.p5208h.C66623cu;
import com.google.speech.p5208h.C66624cv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.p.ae */
/* compiled from: PG */
public final class C86195ae {

    /* renamed from: a */
    public final SettableFuture f232925a = new SettableFuture();

    /* renamed from: b */
    public C66624cv f232926b;

    /* renamed from: c */
    private final C68214a f232927c;

    /* renamed from: d */
    private final C68214a f232928d;

    /* renamed from: e */
    private final C68214a f232929e;

    public C86195ae(C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f232927c = aVar;
        this.f232928d = aVar2;
        this.f232929e = aVar3;
    }

    /* renamed from: c */
    private final void m138651c(C66624cv cvVar, boolean z, boolean z2) {
        ((C90931ca) this.f232928d.mo27525b()).mo85139d(new C92369g(cvVar, (C84516aa) this.f232927c.mo27525b(), z, z2, ((C89037bh) this.f232929e.mo27525b()).mo27377b().f241373e));
    }

    /* renamed from: a */
    public final void mo79828a(boolean z) {
        C66623cu cuVar;
        C58976aa aaVar = C58975e.f156826a;
        C66624cv cvVar = this.f232926b;
        boolean z2 = true;
        if (cvVar != null) {
            cuVar = (C66623cu) cvVar.toBuilder();
        } else {
            cuVar = (C66623cu) C66624cv.f181247d.createBuilder();
            cuVar.copyOnWrite();
            C66624cv cvVar2 = (C66624cv) cuVar.instance;
            cvVar2.f181250a |= 1;
            cvVar2.f181251b = true;
            z2 = false;
        }
        C66624cv cvVar3 = (C66624cv) cuVar.build();
        this.f232925a.mo57356n(cvVar3);
        m138651c(cvVar3, z2, z);
    }

    /* renamed from: b */
    public final void mo79829b(C66624cv cvVar) {
        C58976aa aaVar = C58975e.f156826a;
        boolean z = cvVar.f181251b;
        this.f232925a.mo57356n(cvVar);
        m138651c(cvVar, true, false);
    }
}
