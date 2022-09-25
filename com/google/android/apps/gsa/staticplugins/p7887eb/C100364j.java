package com.google.android.apps.gsa.staticplugins.p7887eb;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p5451f.p5452a.p5453a.p5454a.C69396ar;

/* renamed from: com.google.android.apps.gsa.staticplugins.eb.j */
/* compiled from: PG */
public final /* synthetic */ class C100364j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C100353an f280655a;

    /* renamed from: b */
    public final /* synthetic */ C69396ar f280656b;

    /* renamed from: c */
    public final /* synthetic */ int f280657c;

    public /* synthetic */ C100364j(C100353an anVar, C69396ar arVar, int i) {
        this.f280655a = anVar;
        this.f280656b = arVar;
        this.f280657c = i;
    }

    public final Object apply(Object obj) {
        C100353an anVar = this.f280655a;
        C69396ar arVar = this.f280656b;
        int i = this.f280657c;
        if (((Boolean) obj).booleanValue()) {
            anVar.f280616c.mo91905n(arVar);
            C100358d dVar = anVar.f280616c;
            if (!dVar.f280644b.contains(C100358d.m166373j("conditions_met_once_", i))) {
                C59104x c = C100358d.f280643a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TipSharedPrefManager");
                ((C59052c) ((C59052c) c).mo56372aa(33320)).mo56387q("invalid tip %d: tip does not need conditions checked only once", i);
            } else {
                C86337q b = dVar.f280644b.mo80076b();
                b.mo80067b(C100358d.m166373j("conditions_met_once_", i), true);
                b.apply();
            }
            anVar.mo91895p(C89849ae.TIPMANAGER_TIP_SETUP_SUCCESS, i);
            return true;
        }
        anVar.mo91895p(C89849ae.TIPMANAGER_TIP_SETUP_FAILURE, i);
        return false;
    }
}
