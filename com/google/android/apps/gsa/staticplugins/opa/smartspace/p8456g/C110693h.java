package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g;

import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3886c.C50738bc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.g.h */
/* compiled from: PG */
public final /* synthetic */ class C110693h implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110694i f308446a;

    public /* synthetic */ C110693h(C110694i iVar) {
        this.f308446a = iVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110694i iVar = this.f308446a;
        List list = (List) obj;
        C83800p pVar = (C83800p) list.get(0);
        C50738bc bcVar = (C50738bc) list.get(1);
        ArrayList arrayList = new ArrayList();
        if (pVar != null) {
            C59104x b = C110694i.f308447a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SmartspaceFlightCtrl");
            ((C59052c) ((C59052c) b).mo56372aa(26681)).mo56386p("Update SmartspaceCardsContent.");
            arrayList.add(iVar.f308448b.mo77123e(pVar));
        }
        if (iVar.f308449c.mo79746e(C89985ax.f246732o) && iVar.f308449c.mo79746e(C89985ax.f246723f)) {
            C59104x b2 = C110694i.f308447a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SmartspaceFlightCtrl");
            ((C59052c) ((C59052c) b2).mo56372aa(26680)).mo56386p("Flight check-in card disabled.");
        } else if (bcVar != null) {
            C59104x b3 = C110694i.f308447a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "SmartspaceFlightCtrl");
            ((C59052c) ((C59052c) b3).mo56372aa(26679)).mo56386p("Update SmartspaceChip.");
            arrayList.add(iVar.f308448b.mo77125g(bcVar));
        } else {
            C59104x b4 = C110694i.f308447a.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "SmartspaceFlightCtrl");
            ((C59052c) ((C59052c) b4).mo56372aa(26678)).mo56386p("SmartspaceEventData does not contain SmartspaceChip.");
        }
        return C118826c.m197212b(arrayList);
    }
}
