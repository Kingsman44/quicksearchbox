package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.android.apps.gsa.nga.shared.p6345h.C81251ap;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.nga.p8087s.C103797e;
import com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a.C114535d;
import com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a.C114540i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.g */
/* compiled from: PG */
public final /* synthetic */ class C113876g implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C113880k f315301a;

    public /* synthetic */ C113876g(C113880k kVar) {
        this.f315301a = kVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C113880k kVar = this.f315301a;
        String str = (String) obj;
        C58976aa aaVar = C58975e.f156826a;
        String e = kVar.mo100739e(str);
        if (!e.equals(str)) {
            C59104x b = C113880k.f315306a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AssistActivatedStat");
            ((C59052c) ((C59052c) b).mo56372aa(28396)).mo56389s("Updating opaActiveDates: %s", e);
            C114540i iVar = (C114540i) kVar.f315310e.mo27525b();
            iVar.f317634a.mo46040b(new C114535d(e), iVar.f317635b);
            for (C103797e a : (Set) kVar.f315314i.mo27525b()) {
                a.mo93857a(C81251ap.GROWTH_PREFERENCES);
            }
        }
    }
}
