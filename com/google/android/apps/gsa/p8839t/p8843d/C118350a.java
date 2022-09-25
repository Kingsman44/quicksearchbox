package com.google.android.apps.gsa.p8839t.p8843d;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.aql;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.t.d.a */
/* compiled from: PG */
public final class C118350a {
    /* renamed from: a */
    public static void m196552a(int i, C63196b bVar, C60218r rVar) {
        if (!bVar.f170736a.isEmpty()) {
            C60320od odVar = (C60320od) C60321oe.f163224i.createBuilder();
            odVar.copyOnWrite();
            C60321oe oeVar = (C60321oe) odVar.instance;
            rVar.getClass();
            oeVar.f163227b = rVar;
            oeVar.f163226a |= 1;
            aql aql = (aql) aqm.f159760n.createBuilder();
            aql.copyOnWrite();
            aqm aqm = (aqm) aql.instance;
            aqm.f159762a |= 4;
            aqm.f159765d = i;
            aqm aqm2 = (aqm) aql.build();
            odVar.copyOnWrite();
            C60321oe oeVar2 = (C60321oe) odVar.instance;
            aqm2.getClass();
            oeVar2.f163230e = aqm2;
            oeVar2.f163226a |= 16;
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 472;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) odVar.build(), bVar, (String) null);
        }
    }
}
