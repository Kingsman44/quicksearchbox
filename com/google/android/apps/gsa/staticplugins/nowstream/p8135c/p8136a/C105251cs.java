package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.sidekick.shared.remoteapi.NewCardsInfo;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.p8137a.C105177a;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.p8137a.C105178b;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.cs */
/* compiled from: PG */
final class C105251cs implements C22868d {

    /* renamed from: a */
    final /* synthetic */ String f293524a;

    /* renamed from: b */
    final /* synthetic */ C105263dd f293525b;

    public C105251cs(C105263dd ddVar, String str) {
        this.f293525b = ddVar;
        this.f293524a = str;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C105263dd.f293540a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "NowController");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(22261)).mo56386p("Failure in getNewCardsInfo");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        boolean z = ((NewCardsInfo) obj).f256278a > 0;
        C105263dd ddVar = this.f293525b;
        String str = this.f293524a;
        C105177a aVar = (C105177a) C105178b.f293242g.createBuilder();
        aVar.copyOnWrite();
        C105178b bVar = (C105178b) aVar.instance;
        bVar.f293245a |= 16;
        bVar.f293250f = z;
        ddVar.mo94678h(str, (C105178b) aVar.build());
        if (z || ((Boolean) this.f293525b.f293632y.mo94635t().f63720e).booleanValue()) {
            this.f293525b.mo94686q(false);
        }
    }
}
