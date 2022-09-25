package com.google.android.libraries.search.logging.p3034a;

import com.google.android.gms.clearcut.C143657j;
import com.google.android.libraries.search.logging.p3034a.p3036b.C38753b;
import com.google.android.libraries.search.p2871b.p2890e.C37234c;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.aql;
import com.google.common.p4552o.aqm;

/* renamed from: com.google.android.libraries.search.logging.a.v */
/* compiled from: PG */
public final /* synthetic */ class C38773v implements C38753b {

    /* renamed from: a */
    public final /* synthetic */ C37234c f102350a;

    public /* synthetic */ C38773v(C37234c cVar) {
        this.f102350a = cVar;
    }

    /* renamed from: a */
    public final void mo41587a(C143657j jVar) {
        C37234c cVar = this.f102350a;
        int i = C38745ah.f102286c;
        if (cVar.mo40695c().mo56113h()) {
            C60320od odVar = (C60320od) C60321oe.f163224i.createBuilder();
            aql aql = (aql) aqm.f159760n.createBuilder();
            int intValue = ((Integer) cVar.mo40695c().mo56107c()).intValue();
            aql.copyOnWrite();
            aqm aqm = (aqm) aql.instance;
            aqm.f159762a |= 4;
            aqm.f159765d = intValue;
            odVar.copyOnWrite();
            C60321oe oeVar = (C60321oe) odVar.instance;
            aqm aqm2 = (aqm) aql.build();
            aqm2.getClass();
            oeVar.f163230e = aqm2;
            oeVar.f163226a |= 16;
            jVar.f389463e = (C60321oe) odVar.build();
        }
    }
}
