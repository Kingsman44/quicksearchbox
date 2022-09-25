package com.google.android.apps.gsa.staticplugins.opa.promo;

import androidx.core.app.C1793aj;
import androidx.core.app.C1800aq;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.aj */
/* compiled from: PG */
public final class C109914aj implements C118549h {

    /* renamed from: a */
    private final C1800aq f306263a;

    public C109914aj(C1800aq aqVar) {
        this.f306263a = aqVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (!C1793aj.m4937b(this.f306263a.f5622a)) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 945;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
        return C118826c.f331423b;
    }
}
