package com.google.android.apps.gsa.staticplugins.opaonboarding.p8662f;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.opaonboarding.C83818a;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83896bb;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4553a.C59566v;
import com.google.common.p4552o.p4553a.C59567w;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.f.a */
/* compiled from: PG */
public final class C115881a implements C83896bb {

    /* renamed from: a */
    private final C86054o f321334a;

    public C115881a(C86054o oVar) {
        this.f321334a = oVar;
    }

    /* renamed from: a */
    public final C58833ax mo77282a(int i, C83818a aVar) {
        C9439b bVar;
        Account account;
        C83938e eVar = (C83938e) aVar;
        int i2 = eVar.f228598a;
        if (i2 != 2) {
            C86054o oVar = this.f321334a;
            if (i2 != 0) {
                account = oVar.mo79689w(eVar.f228599b);
                C58838bb.m90867b(account, "Could not find account with name %s", eVar.f228599b);
            } else {
                account = oVar.mo79668a();
            }
            C58976aa aaVar = C58975e.f156826a;
            if (account != null) {
                return C58836b.f156633a;
            }
        }
        C83879am o = C83880an.m133553o();
        C83940g gVar = (C83940g) o;
        gVar.f228605a = "OpaFeatureStartupSequence";
        gVar.f228607c = aVar;
        C59566v vVar = (C59566v) C59567w.f158058g.createBuilder();
        if (i == 0) {
            bVar = C9439b.ASSISTANT_SETTINGS_STARTUP;
        } else if (i != 1) {
            bVar = C9439b.AGENT_DIRECTORY_STARTUP;
        } else {
            bVar = C9439b.HQ_STARTUP;
        }
        vVar.copyOnWrite();
        C59567w wVar = (C59567w) vVar.instance;
        wVar.f158062c = bVar.f32835aq;
        wVar.f158060a |= 2;
        o.mo77222b((C59567w) vVar.build());
        return C58833ax.m90834k(o.mo77221a().mo77240n());
    }
}
