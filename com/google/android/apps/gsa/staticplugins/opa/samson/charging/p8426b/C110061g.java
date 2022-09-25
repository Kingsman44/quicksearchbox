package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8426b;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.C107829d;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.C107839n;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110402b;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110403c;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.b.g */
/* compiled from: PG */
public final /* synthetic */ class C110061g implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C68214a f306637a;

    /* renamed from: b */
    public final /* synthetic */ C110402b f306638b;

    public /* synthetic */ C110061g(C110402b bVar, C68214a aVar) {
        this.f306638b = bVar;
        this.f306637a = aVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C110402b bVar = this.f306638b;
        C68214a aVar = this.f306637a;
        boolean z = false;
        if (!bVar.mo98629a()) {
            return false;
        }
        C107839n nVar = (C107839n) ((Map) aVar.mo27525b()).get(C107502c.OPA_CHARGING_AMBIENT_STATE);
        if (!(nVar instanceof C107829d)) {
            return false;
        }
        C107829d dVar = (C107829d) nVar;
        if (!((C110402b) dVar.f300058d.mo27525b()).mo98629a()) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            String F = ((C86054o) dVar.f300057c.mo27525b()).mo79659F();
            if (F == null) {
                C58976aa aaVar2 = C58975e.f156826a;
            } else {
                if (((C110403c) dVar.f300056b.mo27525b()).mo98632c(F) && dVar.f300055a) {
                    z = true;
                }
                C58976aa aaVar3 = C58975e.f156826a;
            }
        }
        return Boolean.valueOf(z);
    }
}
