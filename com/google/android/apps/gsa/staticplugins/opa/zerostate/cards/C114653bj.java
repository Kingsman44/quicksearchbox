package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.assistant.p3861at.C50307sf;
import com.google.assistant.p3861at.act;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.bj */
/* compiled from: PG */
final class C114653bj implements C22868d {

    /* renamed from: a */
    final /* synthetic */ ZeroStateMediaController f318073a;

    public C114653bj(ZeroStateMediaController zeroStateMediaController) {
        this.f318073a = zeroStateMediaController;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = ZeroStateMediaController.f317924a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ZSMiCtl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(29300)).mo56386p("Unable to get system settings");
        this.f318073a.mo101461g(false);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        act act = (act) obj;
        boolean z = false;
        if (act == null || (act.f128894a & 2) == 0) {
            this.f318073a.mo101461g(false);
            return;
        }
        ZeroStateMediaController zeroStateMediaController = this.f318073a;
        C50307sf sfVar = act.f128897d;
        if (sfVar == null) {
            sfVar = C50307sf.f130929e;
        }
        if (1 == (sfVar.f130931a & 1)) {
            z = true;
        }
        zeroStateMediaController.mo101461g(z);
    }
}
