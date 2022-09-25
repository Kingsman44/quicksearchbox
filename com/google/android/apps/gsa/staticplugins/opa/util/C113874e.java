package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a.C114538g;
import com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a.C114540i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.e */
/* compiled from: PG */
public final /* synthetic */ class C113874e implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C113880k f315298a;

    /* renamed from: b */
    public final /* synthetic */ e f315299b;

    public /* synthetic */ C113874e(C113880k kVar, e eVar) {
        this.f315298a = kVar;
        this.f315299b = eVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C113880k kVar = this.f315298a;
        e eVar = this.f315299b;
        String str = (String) obj;
        C58976aa aaVar = C58975e.f156826a;
        String e = kVar.mo100739e(str);
        if (!e.equals(str)) {
            C59104x b = C113880k.f315306a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AssistActivatedStat");
            ((C59052c) ((C59052c) b).mo56372aa(28397)).mo56354G("Updating opaActiveDates: %s for trigger_type: %s", e, eVar);
            C114540i iVar = (C114540i) kVar.f315310e.mo27525b();
            iVar.f317634a.mo46040b(new C114538g(eVar, e), iVar.f317635b);
        }
    }
}
