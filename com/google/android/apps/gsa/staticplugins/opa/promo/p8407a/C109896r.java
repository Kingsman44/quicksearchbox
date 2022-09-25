package com.google.android.apps.gsa.staticplugins.opa.promo.p8407a;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.assistant.p4008y.p4011c.p4012a.C53628e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.a.r */
/* compiled from: PG */
public final /* synthetic */ class C109896r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C109902x f306208a;

    public /* synthetic */ C109896r(C109902x xVar) {
        this.f306208a = xVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C53628e eVar = (C53628e) obj;
        C109894p pVar = this.f306208a.f306225b;
        C58976aa aaVar = C58975e.f156826a;
        String x = pVar.f306200c.mo79758x(C90037cp.f248419a);
        if (TextUtils.isEmpty(x)) {
            cxVar = C60866ct.f164955a;
        } else {
            Account a = ((C86054o) pVar.f306203f.mo27525b()).mo79668a();
            if (a == null) {
                cxVar = C60866ct.f164955a;
            } else {
                cxVar = ((C86054o) pVar.f306203f.mo27525b()).mo79671e(x, a, new C91032p());
            }
        }
        C60870cx h = C60922j.m93045h(cxVar, new C109893o(pVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return C60922j.m93045h(h, new C109891m(eVar), C60826bg.f164896a);
    }
}
