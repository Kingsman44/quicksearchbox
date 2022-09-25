package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.assistant.p3994s.p3995a.C53275hw;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.cp */
/* compiled from: PG */
public final /* synthetic */ class C114846cp implements C91096f {

    /* renamed from: a */
    public final /* synthetic */ C114860dc f318633a;

    public /* synthetic */ C114846cp(C114860dc dcVar) {
        this.f318633a = dcVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        C114860dc dcVar = this.f318633a;
        if (i == -1) {
            C58976aa aaVar = C58975e.f156826a;
            C87571n nVar = dcVar.f318675h;
            C53275hw hwVar = (C53275hw) C53287ih.f139693l.createBuilder();
            hwVar.copyOnWrite();
            C53287ih ihVar = (C53287ih) hwVar.instance;
            ihVar.f139698d = 2;
            ihVar.f139695a |= 1;
            hwVar.copyOnWrite();
            C53287ih ihVar2 = (C53287ih) hwVar.instance;
            ihVar2.f139702h = 4;
            ihVar2.f139695a |= 64;
            hwVar.copyOnWrite();
            C53287ih ihVar3 = (C53287ih) hwVar.instance;
            ihVar3.f139703i = 47;
            ihVar3.f139695a |= 128;
            nVar.mo81698j(context, (C53287ih) hwVar.build());
            return true;
        } else if (i == 0) {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        } else {
            C59104x d = C114860dc.f318661a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ZSIntentHandler");
            ((C59052c) ((C59052c) d).mo56372aa(29639)).mo56386p("#onAccountUnlinkCallback(): unknown result");
            return false;
        }
    }
}
