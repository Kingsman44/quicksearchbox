package com.google.android.apps.gsa.opaonboarding.personalresults;

import android.accounts.Account;
import android.app.Activity;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83819a;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83823ad;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83824ae;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83825af;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83828ai;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83831al;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83832am;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83841av;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83843c;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83865y;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.shared.p7045k.C89794ab;
import com.google.android.apps.gsa.shared.p7045k.C89824t;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101495ac;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49886cq;
import com.google.assistant.p3861at.C49890cu;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66595bu;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.opaonboarding.personalresults.b */
/* compiled from: PG */
public final class C83951b implements C83950a {

    /* renamed from: a */
    private static final C59071e f228694a = C59071e.m91332i("com.google.android.apps.gsa.opaonboarding.personalresults.b");

    /* renamed from: b */
    private final C92371d f228695b;

    /* renamed from: c */
    private final String f228696c;

    /* renamed from: d */
    private final boolean f228697d;

    /* renamed from: e */
    private final C58833ax f228698e;

    /* renamed from: f */
    private final l f228699f;

    /* renamed from: g */
    private final C118827a f228700g;

    /* renamed from: h */
    private final Activity f228701h;

    /* renamed from: i */
    private final Account f228702i;

    /* renamed from: j */
    private final C101495ac f228703j;

    public C83951b(l lVar, C58833ax axVar, C118827a aVar, C92371d dVar, C101495ac acVar, String str, Activity activity, Account account, boolean z) {
        this.f228698e = axVar;
        this.f228699f = lVar;
        this.f228700g = aVar;
        this.f228695b = dVar;
        this.f228703j = acVar;
        this.f228696c = str;
        this.f228701h = activity;
        this.f228702i = account;
        this.f228697d = z;
    }

    /* renamed from: a */
    public final C60870cx mo77355a() {
        C118569b bVar;
        C89794ab c;
        C83841av avVar;
        C59071e eVar = f228694a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PRUpdateController");
        ((C59052c) ((C59052c) b).mo56372aa(6904)).mo56389s("Current version info for this request: %s", this.f228699f.e());
        if (this.f228697d) {
            bVar = C118569b.GOOGLE_HOME_PERSONAL_RESULTS_OPTIN;
        } else {
            bVar = C118569b.GOOGLE_HOME_PERSONAL_RESULTS_OPTOUT;
        }
        this.f228700g.mo77944g(bVar, C118575h.VOICE_MATCH_ENROLLMENT).mo104025g(1);
        int i = 3;
        int i2 = 4;
        if (this.f228701h == null) {
            C59104x c2 = eVar.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "PRUpdateController");
            ((C59052c) ((C59052c) c2).mo56372aa(6905)).mo56386p("activity is null");
        } else {
            C83865y yVar = (C83865y) C83823ad.f228441e.createBuilder();
            yVar.mo77206a(this.f228695b.mo87024e());
            yVar.copyOnWrite();
            C83823ad adVar = (C83823ad) yVar.instance;
            adVar.f228445c = 3;
            adVar.f228443a |= 1;
            int i3 = this.f228697d ? this.f228695b.mo87034o() ? 4 : 3 : 2;
            yVar.copyOnWrite();
            C83823ad adVar2 = (C83823ad) yVar.instance;
            adVar2.f228446d = i3 - 1;
            adVar2.f228443a |= 2;
            C83823ad adVar3 = (C83823ad) yVar.build();
            C83843c cVar = (C83843c) C83841av.f228478e.createBuilder();
            cVar.copyOnWrite();
            C83841av avVar2 = (C83841av) cVar.instance;
            adVar3.getClass();
            avVar2.f228483d = adVar3;
            avVar2.f228482c = 5;
            C101495ac acVar = this.f228703j;
            if (acVar == null) {
                C83824ae aeVar = (C83824ae) C83825af.f228447c.createBuilder();
                String str = this.f228696c;
                aeVar.copyOnWrite();
                C83825af afVar = (C83825af) aeVar.instance;
                str.getClass();
                afVar.f228449a |= 1;
                afVar.f228450b = str;
                C83825af afVar2 = (C83825af) aeVar.build();
                cVar.copyOnWrite();
                C83841av avVar3 = (C83841av) cVar.instance;
                afVar2.getClass();
                avVar3.f228481b = afVar2;
                avVar3.f228480a = 1;
            } else {
                C58833ax b2 = acVar.mo92323b(this.f228696c);
                C58833ax a = this.f228703j.mo92322a(this.f228696c);
                if (!b2.mo56113h() || !a.mo56113h()) {
                    C59104x c3 = eVar.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "PRUpdateController");
                    ((C59052c) ((C59052c) c3).mo56372aa(6899)).mo56386p("Unable to get parent/child user IDs during unicorn flow");
                    avVar = null;
                    if (avVar != null && this.f228698e.mo56113h()) {
                        ((C83819a) this.f228698e.mo56107c()).mo77204a(this.f228701h, avVar);
                    }
                } else {
                    C83828ai aiVar = (C83828ai) C83832am.f228459d.createBuilder();
                    C83831al alVar = (C83831al) b2.mo56107c();
                    aiVar.copyOnWrite();
                    C83832am amVar = (C83832am) aiVar.instance;
                    alVar.getClass();
                    amVar.f228462b = alVar;
                    amVar.f228461a |= 1;
                    C83831al alVar2 = (C83831al) a.mo56107c();
                    aiVar.copyOnWrite();
                    C83832am amVar2 = (C83832am) aiVar.instance;
                    alVar2.getClass();
                    amVar2.f228463c = alVar2;
                    amVar2.f228461a |= 2;
                    cVar.copyOnWrite();
                    C83841av avVar4 = (C83841av) cVar.instance;
                    C83832am amVar3 = (C83832am) aiVar.build();
                    amVar3.getClass();
                    avVar4.f228481b = amVar3;
                    avVar4.f228480a = 2;
                }
            }
            avVar = (C83841av) cVar.build();
            ((C83819a) this.f228698e.mo56107c()).mo77204a(this.f228701h, avVar);
        }
        l lVar = this.f228699f;
        Account account = this.f228702i;
        C66595bu buVar = (C66595bu) this.f228695b.mo87020a().mo56111f();
        Collection<com.google.android.apps.gsa.assistant.shared.l> collection = this.f228695b.f257559d;
        C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
        for (com.google.android.apps.gsa.assistant.shared.l lVar2 : collection) {
            C89824t tVar = lVar2.a;
            C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
            if (!this.f228695b.mo87035p(tVar)) {
                int i4 = this.f228697d ? (tVar != null && (((c = tVar.mo83665c()) != null && c.f243038c && c.f243042g && c.f243044i) || tVar.mo83663a().mo83657k() == 6)) ? 4 : 2 : 3;
                cnVar.copyOnWrite();
                C49891cv cvVar = (C49891cv) cnVar.instance;
                cvVar.f129666d = i4 - 1;
                cvVar.f129663a |= 2;
            } else if (this.f228697d) {
                cnVar.copyOnWrite();
                C49891cv cvVar2 = (C49891cv) cnVar.instance;
                cvVar2.f129666d = 1;
                cvVar2.f129663a |= 2;
                cnVar.copyOnWrite();
                C49891cv cvVar3 = (C49891cv) cnVar.instance;
                cvVar3.f129667e = i;
                cvVar3.f129663a |= i2;
            } else {
                cnVar.copyOnWrite();
                C49891cv cvVar4 = (C49891cv) cnVar.instance;
                cvVar4.f129666d = 2;
                cvVar4.f129663a |= 2;
                cnVar.copyOnWrite();
                C49891cv cvVar5 = (C49891cv) cnVar.instance;
                cvVar5.f129667e = 1;
                cvVar5.f129663a |= i2;
            }
            C59071e eVar2 = f228694a;
            C59104x b3 = eVar2.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "PRUpdateController");
            C59052c cVar2 = (C59052c) ((C59052c) b3).mo56372aa(6901);
            int a2 = C49886cq.m85760a(((C49891cv) cnVar.instance).f129666d);
            if (a2 == 0) {
                a2 = 1;
            }
            cVar2.mo56387q("Personal: %d", a2 - 1);
            if ((((C49891cv) cnVar.instance).f129663a & i2) != 0) {
                C59104x b4 = eVar2.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "PRUpdateController");
                C59052c cVar3 = (C59052c) ((C59052c) b4).mo56372aa(6903);
                int a3 = C49890cu.m85762a(((C49891cv) cnVar.instance).f129667e);
                if (a3 == 0) {
                    a3 = 1;
                }
                cVar3.mo56387q("Proactive: %d", a3 - 1);
            }
            C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
            String b5 = lVar2.b();
            dfVar.copyOnWrite();
            C49903dg dgVar = (C49903dg) dfVar.instance;
            b5.getClass();
            dgVar.f129714a |= 1;
            dgVar.f129715b = b5;
            C49875cf a4 = lVar2.a();
            dfVar.copyOnWrite();
            C49903dg dgVar2 = (C49903dg) dfVar.instance;
            dgVar2.f129716c = a4.f129621v;
            dgVar2.f129714a |= 2;
            C49891cv cvVar6 = (C49891cv) cnVar.build();
            dfVar.copyOnWrite();
            C49903dg dgVar3 = (C49903dg) dfVar.instance;
            cvVar6.getClass();
            dgVar3.f129719f = cvVar6;
            dgVar3.f129714a |= 32;
            daVar.mo53371b(dfVar);
            if (lVar2.a() == C49875cf.UNKNOWN) {
                C59104x d = eVar2.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PRUpdateController");
                ((C59052c) ((C59052c) d).mo56372aa(6902)).mo56386p("Unknown Device Type");
                int i5 = C90755l.f253831a;
            }
            i = 3;
            i2 = 4;
        }
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        C49898db dbVar = (C49898db) daVar.build();
        dbVar.getClass();
        acx.f128991h = dbVar;
        acx.f128984a |= 32;
        return lVar.k(account, buVar, (acx) acw.build(), 5, TimeUnit.SECONDS, getClass().getSimpleName());
    }
}
