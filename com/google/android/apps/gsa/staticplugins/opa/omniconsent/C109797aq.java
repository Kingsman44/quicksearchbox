package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.bg;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.android.apps.search.assistant.platform.p9141h.p9159g.p9160a.C121097d;
import com.google.android.apps.search.assistant.platform.p9141h.p9159g.p9160a.C121101h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.aq */
/* compiled from: PG */
final class C109797aq implements C83956t {

    /* renamed from: a */
    final /* synthetic */ C109800at f305948a;

    public C109797aq(C109800at atVar) {
        this.f305948a = atVar;
    }

    /* renamed from: c */
    public final C58833ax mo77209c() {
        Account account = (Account) this.f305948a.f305950b.mo77278a().mo56107c();
        C109800at atVar = this.f305948a;
        atVar.f305951c.mo98130l(account, ((C109811g) atVar.f305949a).f306016l);
        C109800at atVar2 = this.f305948a;
        if (atVar2.mo98151d()) {
            atVar2.f305951c.mo98125g(account, ((C109811g) atVar2.f305949a).f306009e);
        } else if (!atVar2.f305956h.mo79746e(C90053de.f248982o)) {
            C113787bc bcVar = this.f305948a.f305954f;
            Account a = bcVar.f315135d.mo79668a();
            if (a != null) {
                if (bcVar.mo100634n()) {
                    bg bgVar = bcVar.f315136e;
                    String str = a.name;
                    bgVar.a.edit().remove(bg.a(a.name)).apply();
                    C121101h hVar = (C121101h) bgVar.b.mo27525b();
                    C60870cx c = hVar.f336526b.mo50216c(a.name);
                    C121097d dVar = new C121097d(hVar);
                    C60922j.m93045h(c, C47810es.m84966f(dVar), hVar.f336527c);
                    bcVar.f315134c.edit().putBoolean(C113787bc.m188357a(a.name), true).putBoolean(C113787bc.m188359c(a.name), true).apply();
                } else {
                    ((C59052c) ((C59052c) C113787bc.f315132a.mo56226d()).mo56372aa(28430)).mo56386p("Couldn't enter the signed out mode for no UDC users because it is not supported on this device.");
                    int i = C90755l.f253831a;
                }
            }
        }
        return C58836b.f156633a;
    }
}
