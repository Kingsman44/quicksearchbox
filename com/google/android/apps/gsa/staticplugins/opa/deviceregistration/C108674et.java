package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.view.View;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83992d;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.assistant.p3861at.C50121li;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.et */
/* compiled from: PG */
public final /* synthetic */ class C108674et implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108678ex f302257a;

    public /* synthetic */ C108674et(C108678ex exVar) {
        this.f302257a = exVar;
    }

    public final void onClick(View view) {
        C108678ex exVar = this.f302257a;
        C83992d dVar = (C83992d) exVar.f302271f.mo77447a().get(0);
        if (dVar instanceof C108677ew) {
            C108556ar arVar = exVar.f302268c;
            arVar.f302004l = null;
            arVar.f302006n = null;
            exVar.mo77318iT().mo77312a();
            C89949q.m146525j(C108607cg.m180627a(9), (C60321oe) null, (C63196b) null, (String) null);
        } else if (!(dVar instanceof C108676ev)) {
            C59104x c = C108678ex.f302267b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MultipleDevicesFrag");
            ((C59052c) ((C59052c) c).mo56372aa(24209)).mo56389s("Unknown type item was selected: %s", dVar);
        } else if (dVar.mo77443h()) {
            C108556ar arVar2 = exVar.f302268c;
            C108676ev evVar = (C108676ev) dVar;
            C108741i iVar = evVar.f302259a;
            C50121li liVar = evVar.f302262d;
            arVar2.f302004l = iVar;
            arVar2.f302006n = liVar;
            exVar.mo77318iT().mo77312a();
            C89949q.m146525j(C108607cg.m180627a(8), (C60321oe) null, (C63196b) null, (String) null);
        } else {
            C59104x c2 = C108678ex.f302267b.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "MultipleDevicesFrag");
            ((C59052c) ((C59052c) c2).mo56372aa(24210)).mo56389s("Device not linkable: %s", dVar);
        }
    }
}
