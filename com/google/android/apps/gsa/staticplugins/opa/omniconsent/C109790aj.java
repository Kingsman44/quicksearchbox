package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.C73842bi;
import com.google.android.apps.gsa.opaonboarding.C83886at;
import com.google.android.apps.gsa.opaonboarding.C83887au;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83926m;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83927n;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83928o;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83929p;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83931r;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.staticplugins.opa.p8406p.C109872a;
import com.google.android.apps.gsa.staticplugins.opa.p8406p.C109873b;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.apps.search.assistant.platform.p9141h.p9159g.p9160a.C121101h;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.aj */
/* compiled from: PG */
public final class C109790aj implements C83887au {

    /* renamed from: a */
    public final C86338r f305939a;

    /* renamed from: b */
    public final C113787bc f305940b;

    /* renamed from: c */
    private final C109873b f305941c;

    /* renamed from: d */
    private final C68214a f305942d;

    public C109790aj(C86338r rVar, C109873b bVar, C113787bc bcVar, C68214a aVar) {
        this.f305939a = rVar;
        this.f305941c = bVar;
        this.f305940b = bcVar;
        this.f305942d = aVar;
    }

    /* renamed from: a */
    public final boolean mo77271a(Account account, int i) {
        if (account == null) {
            return false;
        }
        mo98126h(account, i);
        return C83886at.m133605e(this.f305939a, "oc:disclosures_acked", account.name, i);
    }

    /* renamed from: b */
    public final boolean mo77272b(Account account, int i) {
        if (account == null || account.name == null || this.f305939a == null) {
            return false;
        }
        mo98126h(account, i);
        return C83886at.m133605e(this.f305939a, "oc:third_party_disclosures_acked", account.name, i);
    }

    /* renamed from: c */
    public final boolean mo77273c(Account account, int i) {
        return C83886at.m133605e(this.f305939a, "oc:udc_prompted", account.name, i);
    }

    /* renamed from: d */
    public final boolean mo77274d(Account account, int i) {
        mo98126h(account, i);
        return C83886at.m133605e(this.f305939a, "oc:omniconsent_triggered", account.name, i);
    }

    /* renamed from: e */
    public final boolean mo77275e(Account account) {
        return mo77273c(account, 3) && mo77271a(account, 3);
    }

    /* renamed from: f */
    public final void mo98124f(Account account) {
        C86338r rVar = this.f305939a;
        String str = account.name;
        C83927n nVar = (C83927n) C83928o.f228580d.createBuilder();
        nVar.copyOnWrite();
        C83928o oVar = (C83928o) nVar.instance;
        str.getClass();
        oVar.f228582a |= 1;
        oVar.f228583b = str;
        nVar.copyOnWrite();
        C83928o oVar2 = (C83928o) nVar.instance;
        oVar2.f228584c = 2;
        oVar2.f228582a = 2 | oVar2.f228582a;
        int indexOf = C83886at.m133601a(rVar, "oc:udc_prompted").f228587a.indexOf((C83928o) nVar.build());
        if (indexOf >= 0) {
            C83926m mVar = (C83926m) C83886at.m133601a(rVar, "oc:udc_prompted").toBuilder();
            mVar.copyOnWrite();
            C83929p pVar = (C83929p) mVar.instance;
            pVar.mo77333a();
            pVar.f228587a.remove(indexOf);
            C83886at.m133602b(rVar, "oc:udc_prompted", (C83929p) mVar.build());
        }
    }

    /* renamed from: g */
    public final void mo98125g(Account account, boolean z) {
        C86337q b = this.f305939a.mo80076b();
        b.mo80067b("opa_upgrade_show_value_prop", false);
        b.apply();
        C109873b bVar = this.f305941c;
        if (account == null) {
            ((C59052c) ((C59052c) C109873b.f306145a.mo56226d()).mo56372aa(24073)).mo56386p("recordConsent: null account!");
            return;
        }
        bVar.f306146b.b(account);
        long a = bVar.f306147c.mo79743a(C90014bt.f247717mS);
        C118561t tVar = bVar.f306151g;
        C118522by byVar = C118522by.FETCH_OPT_IN_STATUSES;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 1;
        agVar.f328822b = (long) ((int) a);
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328824d = 1;
        agVar2.f328821a |= 4;
        tVar.mo103754e(byVar, (C118472ag) afVar.build());
        if (((C58833ax) bVar.f306153i.mo27525b()).mo56113h()) {
            ((C73842bi) ((C58833ax) bVar.f306153i.mo27525b()).mo56107c()).mo65324a();
        }
        ((C92486a) bVar.f306152h.mo27525b()).mo87239m(bVar.f306149e.s(), EventForDump.m147676e(11, "markConsent"));
        if (z) {
            bVar.f306150f.mo28212l("activateNowCardsTask", new C109872a(bVar, account));
        }
    }

    /* renamed from: h */
    public final void mo98126h(Account account, int i) {
        C83886at.m133604d(this.f305939a, "omniconsent_triggered:", "oc:omniconsent_triggered", account.name, i);
        C83886at.m133604d(this.f305939a, "third_party_seen:", "oc:disclosures_acked", account.name, i);
        if (C83886at.m133605e(this.f305939a, "oc:disclosures_acked", account.name, i)) {
            C83886at.m133603c(this.f305939a, "oc:tos_and_pp_acked", account.name, i);
            C83886at.m133603c(this.f305939a, "oc:third_party_disclosures_acked", account.name, i);
            C121101h hVar = (C121101h) this.f305942d.mo27525b();
            String str = account.name;
            String a = C83931r.m133680a(i);
            if (i != 0) {
                hVar.mo105051c(str, a);
                ((C121101h) this.f305942d.mo27525b()).mo105050b(account.name, C83931r.m133680a(i));
                return;
            }
            throw null;
        }
    }

    /* renamed from: i */
    public final void mo98127i(Account account, int i) {
        mo98126h(account, i);
        C83886at.m133603c(this.f305939a, "oc:disclosures_acked", account.name, i);
    }

    /* renamed from: j */
    public final void mo98128j(Account account, int i) {
        mo98126h(account, i);
        C83886at.m133603c(this.f305939a, "oc:third_party_disclosures_acked", account.name, i);
        ((C121101h) this.f305942d.mo27525b()).mo105050b(account.name, C83931r.m133680a(i));
    }

    /* renamed from: k */
    public final void mo98129k(Account account, int i) {
        mo98126h(account, i);
        C83886at.m133603c(this.f305939a, "oc:tos_and_pp_acked", account.name, i);
        ((C121101h) this.f305942d.mo27525b()).mo105051c(account.name, C83931r.m133680a(i));
    }

    /* renamed from: l */
    public final void mo98130l(Account account, int i) {
        C83886at.m133603c(this.f305939a, "oc:udc_prompted", account.name, i);
    }

    /* renamed from: m */
    public final boolean mo98131m(Account account) {
        if (account == null) {
            return false;
        }
        mo98126h(account, 3);
        return C83886at.m133605e(this.f305939a, "oc:tos_and_pp_acked", account.name, 3);
    }
}
