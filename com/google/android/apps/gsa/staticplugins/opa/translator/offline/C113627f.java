package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108247br;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108249bt;
import com.google.android.apps.gsa.staticplugins.opa.util.C113855cj;
import com.google.android.apps.gsa.staticplugins.opa.util.C113858cm;
import com.google.android.apps.gsa.staticplugins.opa.util.C113859cn;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.f */
/* compiled from: PG */
public final /* synthetic */ class C113627f implements C108247br {

    /* renamed from: a */
    public final /* synthetic */ C113628g f314631a;

    /* renamed from: b */
    public final /* synthetic */ C108249bt f314632b;

    public /* synthetic */ C113627f(C113628g gVar, C108249bt btVar) {
        this.f314631a = gVar;
        this.f314632b = btVar;
    }

    /* renamed from: a */
    public final void mo95794a() {
        C113628g gVar = this.f314631a;
        C108249bt btVar = this.f314632b;
        if (gVar.f314642i == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C113859cn cnVar = gVar.f314642i;
        C113855cj k = C113858cm.m188476k();
        k.mo100705c(btVar.f301598e);
        k.mo100706d(QueryTriggerType.OPA_SUGGESTION_CHIP);
        cnVar.mo97548u(k.mo100703a());
    }
}
