package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8190a.p8191a;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C106191d implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C106203p f296357a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f296358b;

    public /* synthetic */ C106191d(C106203p pVar, Bundle bundle) {
        this.f296357a = pVar;
        this.f296358b = bundle;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Account a;
        C106203p pVar = this.f296357a;
        Bundle bundle = this.f296358b;
        C58833ax axVar = (C58833ax) obj;
        if (!pVar.f296378b.mo79746e(C90053de.f248950Q) && (a = pVar.f296382f.mo79668a()) != null) {
            pVar.f296383g.mo98124f(a);
        }
        if (!axVar.mo56113h() || ((C84516aa) pVar.f296389m.mo27525b()).mo78228b()) {
            pVar.f296381e.mo81688b(pVar.f296377a, bundle);
            return C118826c.f331422a;
        }
        pVar.f296377a.startActivity(((Intent) axVar.mo56107c()).setFlags(268468224));
        return C118826c.f331422a;
    }
}
