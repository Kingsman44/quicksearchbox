package com.google.android.apps.gsa.search.core.logging;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60663yf;
import com.google.common.p4552o.C60666yi;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.search.core.logging.a */
/* compiled from: PG */
public final class C86169a {
    /* renamed from: a */
    public static void m138609a(Query query, long j) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 644;
        String b = C39191a.m68623b(query.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C60663yf yfVar = (C60663yf) C60666yi.f164570j.createBuilder();
        yfVar.copyOnWrite();
        C60666yi yiVar = (C60666yi) yfVar.instance;
        yiVar.f164572a |= 1;
        yiVar.f164573b = j;
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        C60666yi yiVar2 = (C60666yi) yfVar.build();
        yiVar2.getClass();
        ufVar3.f164105aL = yiVar2;
        ufVar3.f164250e |= 1073741824;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}
