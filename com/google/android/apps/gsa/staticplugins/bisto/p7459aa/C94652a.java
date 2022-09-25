package com.google.android.apps.gsa.staticplugins.bisto.p7459aa;

import com.google.android.apps.gsa.search.shared.actions.errors.C87413a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.a */
/* compiled from: PG */
public final /* synthetic */ class C94652a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C94668b f264733a;

    public /* synthetic */ C94652a(C94668b bVar) {
        this.f264733a = bVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C94668b bVar = this.f264733a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            int intValue = ((Integer) axVar.mo56107c()).intValue();
            C58976aa aaVar = C58975e.f156826a;
            if (bVar.mo88605a() == intValue) {
                bVar.f264776e++;
            } else {
                bVar.f264776e = 1;
            }
            bVar.f264775d.push(Integer.valueOf(intValue));
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            bVar.f264775d.clear();
            bVar.f264776e = 0;
        }
        C87413a aVar = null;
        if (bVar.mo88605a() != 0 && bVar.f264776e > 0) {
            aVar = new C87413a(bVar.mo88605a(), bVar.f264776e, bVar.f264775d.size());
        }
        return C60856cj.m92900i(C58833ax.m90833j(aVar));
    }
}
