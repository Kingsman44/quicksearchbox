package com.google.android.apps.gsa.staticplugins.fedass.p7949h;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.apps.gsa.p6482q.p6483a.C84231d;
import com.google.android.apps.gsa.p6482q.p6483a.C84232e;
import com.google.android.apps.gsa.p6482q.p6483a.C84237j;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C89978aq;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100721ad;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49879cj;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;
import com.google.assistant.p3861at.C50162mw;
import com.google.assistant.p3861at.C50163mx;
import com.google.assistant.p3861at.C50164my;
import com.google.assistant.p3861at.C50165mz;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60861co;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.h.aj */
/* compiled from: PG */
public final class C100862aj implements C84232e {

    /* renamed from: a */
    public static final C59071e f281832a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.h.aj");

    /* renamed from: j */
    private static final Duration f281833j = Duration.ofMillis(100);

    /* renamed from: b */
    public final C100721ad f281834b;

    /* renamed from: c */
    public final C68214a f281835c;

    /* renamed from: d */
    public final C68214a f281836d;

    /* renamed from: e */
    public final C69464a f281837e;

    /* renamed from: f */
    public final C68214a f281838f;

    /* renamed from: g */
    public final C68214a f281839g;

    /* renamed from: h */
    public final C22871g f281840h;

    /* renamed from: i */
    public final Executor f281841i;

    /* renamed from: k */
    private final C86124t f281842k;

    /* renamed from: l */
    private final C68214a f281843l;

    public C100862aj(C86124t tVar, C100721ad adVar, C68214a aVar, C68214a aVar2, C69464a aVar3, C68214a aVar4, C68214a aVar5, C22871g gVar, Executor executor, C68214a aVar6) {
        this.f281842k = tVar;
        this.f281834b = adVar;
        this.f281835c = aVar;
        this.f281836d = aVar2;
        this.f281837e = aVar3;
        this.f281838f = aVar4;
        this.f281839g = aVar5;
        this.f281840h = gVar;
        this.f281841i = executor;
        this.f281843l = aVar6;
    }

    /* renamed from: m */
    private final boolean m167085m(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return ((C132798f) C60861co.m92917c(((C100719ab) this.f281836d.mo27525b()).mo92019c(str), Exception.class, f281833j.toMillis(), TimeUnit.MILLISECONDS)).f362320d;
        } catch (Exception e) {
            C59104x c = f281832a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "FedAssSettingsCallback");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(19673)).mo56386p("Failed to read from PDS for account FL status.");
            return false;
        }
    }

    /* renamed from: a */
    public final C84237j mo77692a() {
        C59071e eVar = f281832a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedAssSettingsCallback");
        ((C59052c) ((C59052c) b).mo56372aa(19659)).mo56386p("shouldShowUnifiedOptInUi");
        if (!this.f281842k.mo79746e(C89978aq.f246610i)) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "FedAssSettingsCallback");
            ((C59052c) ((C59052c) b2).mo56372aa(19669)).mo56386p("unified device activation flag not enabled");
            return C84237j.UNIFIED_OPT_IN_UI_SHOW_LEGACY;
        } else if (this.f281835c.mo27525b() == null) {
            C59104x c = eVar.mo56225c();
            c.mo56378ag(C58975e.f156826a, "FedAssSettingsCallback");
            ((C59052c) ((C59052c) c).mo56372aa(19668)).mo56386p("loginHelper was null");
            return C84237j.UNIFIED_OPT_IN_UI_SHOW_LEGACY;
        } else {
            String F = ((C86054o) this.f281835c.mo27525b()).mo79659F();
            if (TextUtils.isEmpty(F)) {
                C59104x c2 = eVar.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "FedAssSettingsCallback");
                ((C59052c) ((C59052c) c2).mo56372aa(19667)).mo56386p("accountName was empty");
                return C84237j.UNIFIED_OPT_IN_UI_SHOW_LEGACY;
            }
            try {
                C132798f fVar = (C132798f) C60861co.m92917c(((C100719ab) this.f281836d.mo27525b()).mo92019c(F), Exception.class, f281833j.toMillis(), TimeUnit.MILLISECONDS);
                C59104x b3 = eVar.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "FedAssSettingsCallback");
                ((C59052c) ((C59052c) b3).mo56372aa(19660)).mo56358K("getAccountAllowsLearning: %b; getIsLocalLegacyUser: %b", fVar.f362320d, fVar.f362326j);
                if (!fVar.f362320d) {
                    C59104x b4 = eVar.mo56224b();
                    b4.mo56378ag(C58975e.f156826a, "FedAssSettingsCallback");
                    ((C59052c) ((C59052c) b4).mo56372aa(19666)).mo56386p("account does not allow learning -> do not show unified");
                    return C84237j.UNIFIED_OPT_IN_UI_SHOW_LEGACY;
                } else if (fVar.f362326j) {
                    C59104x b5 = eVar.mo56224b();
                    b5.mo56378ag(C58975e.f156826a, "FedAssSettingsCallback");
                    ((C59052c) ((C59052c) b5).mo56372aa(19665)).mo56386p("legacy user -> do not show unified");
                    return C84237j.UNIFIED_OPT_IN_UI_SHOW_LEGACY;
                } else if (fVar.f362327k) {
                    C59104x b6 = eVar.mo56224b();
                    b6.mo56378ag(C58975e.f156826a, "FedAssSettingsCallback");
                    ((C59052c) ((C59052c) b6).mo56372aa(19664)).mo56386p("unified v1 opted in -> show unified v1");
                    return C84237j.UNIFIED_OPT_IN_UI_SHOW_V1;
                } else if (!this.f281842k.mo79746e(C89978aq.f246611j)) {
                    C59104x b7 = eVar.mo56224b();
                    b7.mo56378ag(C58975e.f156826a, "FedAssSettingsCallback");
                    ((C59052c) ((C59052c) b7).mo56372aa(19663)).mo56386p("unified v2 flag disabled -> show unified v1");
                    return C84237j.UNIFIED_OPT_IN_UI_SHOW_V1;
                } else {
                    C59104x b8 = eVar.mo56224b();
                    b8.mo56378ag(C58975e.f156826a, "FedAssSettingsCallback");
                    ((C59052c) ((C59052c) b8).mo56372aa(19661)).mo56386p("show unified v2");
                    return C84237j.UNIFIED_OPT_IN_UI_SHOW_V2;
                }
            } catch (Exception e) {
                C59104x c3 = f281832a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "FedAssSettingsCallback");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(19662)).mo56386p("Failed to read from PDS for account FL status.");
                return C84237j.UNIFIED_OPT_IN_UI_SHOW_LEGACY;
            }
        }
    }

    /* renamed from: b */
    public final C60870cx mo77693b(String str) {
        C100872k kVar = (C100872k) this.f281843l.mo27525b();
        return kVar.f281859d.mo28209i(kVar.mo92076a(str), "Retrieve data from settingsUiFuture", C100865d.f281847a);
    }

    /* renamed from: c */
    public final C60870cx mo77694c() {
        return this.f281840h.mo28210j(this.f281840h.mo28201a("Get active account", new C100874m(this)), "Get FL enabled", new C100882u(this));
    }

    /* renamed from: d */
    public final C60870cx mo77695d() {
        C100884w wVar = new C100884w(this);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(wVar), this.f281841i);
        C100885x xVar = new C100885x(this);
        return C60922j.m93045h(m, C47810es.m84966f(xVar), this.f281841i);
    }

    /* renamed from: e */
    public final C60870cx mo77696e(Account account) {
        acw acw = (acw) acx.f128971H.createBuilder();
        C50164my myVar = (C50164my) C50165mz.f130411c.createBuilder();
        C50162mw mwVar = (C50162mw) C50163mx.f130405e.createBuilder();
        mwVar.copyOnWrite();
        C50163mx mxVar = (C50163mx) mwVar.instance;
        mxVar.f130407a |= 4;
        mxVar.f130408b = true;
        C50163mx mxVar2 = (C50163mx) mwVar.build();
        myVar.copyOnWrite();
        C50165mz mzVar = (C50165mz) myVar.instance;
        mxVar2.getClass();
        mzVar.f130414b = mxVar2;
        mzVar.f130413a |= 1;
        C50165mz mzVar2 = (C50165mz) myVar.build();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        mzVar2.getClass();
        acx.f128979G = mzVar2;
        acx.f128985b |= C89885b.NOW_VALUE;
        return ((C100872k) this.f281843l.mo27525b()).mo92077b((acx) acw.build(), account);
    }

    /* renamed from: f */
    public final C60870cx mo77697f() {
        return this.f281840h.mo28202b("Clear training cache data from setting", new C100886y(this));
    }

    /* renamed from: g */
    public final C60870cx mo77698g(boolean z) {
        C60870cx b = this.f281840h.mo28202b("Update FederatedLearning AccountPref", new C100855ac(this, z));
        if (this.f281842k.mo79746e(C89978aq.f246608g)) {
            C100856ad adVar = new C100856ad(this, z);
            b = C60922j.m93045h(b, C47810es.m84966f(adVar), this.f281841i);
        }
        C90875ai.m148465b(new C100857ae(this, z), b, this.f281840h, "TrainingCache onPrefsChanged callback").mo85223a(C100858af.f281828a);
        return b;
    }

    /* renamed from: h */
    public final C60870cx mo77699h(boolean z) {
        return this.f281840h.mo28202b("Update FederatedLearning AccountPref", new C100854ab(this, z));
    }

    /* renamed from: i */
    public final C60870cx mo77700i(boolean z) {
        C100879r rVar = new C100879r(this, z);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(rVar), this.f281841i);
        C100880s sVar = new C100880s(this, z);
        C60870cx h = C60922j.m93045h(n, C47810es.m84966f(sVar), this.f281841i);
        if (this.f281842k.mo79746e(C89978aq.f246608g)) {
            C100881t tVar = new C100881t(this, z);
            h = C60922j.m93045h(h, C47810es.m84966f(tVar), this.f281841i);
        }
        C100860ah ahVar = new C100860ah(this, z);
        C60856cj.m92911t(h, C47810es.m84974n(ahVar), this.f281841i);
        return h;
    }

    /* renamed from: j */
    public final C60870cx mo77701j(C84231d dVar) {
        C100872k kVar = (C100872k) this.f281843l.mo27525b();
        C50164my myVar = (C50164my) C50165mz.f130411c.createBuilder();
        C50163mx b = dVar.mo77687b();
        myVar.copyOnWrite();
        C50165mz mzVar = (C50165mz) myVar.instance;
        b.getClass();
        mzVar.f130414b = b;
        mzVar.f130413a |= 1;
        C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
        C58485gu c = dVar.mo77688c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            C49879cj cjVar = (C49879cj) c.get(i);
            C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
            C49875cf a = C49875cf.m85755a(cjVar.f129638i);
            if (a == null) {
                a = C49875cf.UNKNOWN;
            }
            dfVar.copyOnWrite();
            C49903dg dgVar = (C49903dg) dfVar.instance;
            dgVar.f129716c = a.f129621v;
            dgVar.f129714a |= 2;
            String str = cjVar.f129631b;
            dfVar.copyOnWrite();
            C49903dg dgVar2 = (C49903dg) dfVar.instance;
            str.getClass();
            dgVar2.f129714a |= 1;
            dgVar2.f129715b = str;
            C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
            boolean z = dVar.mo77687b().f130409c;
            cnVar.copyOnWrite();
            C49891cv cvVar = (C49891cv) cnVar.instance;
            cvVar.f129664b |= 67108864;
            cvVar.f129661L = z;
            dfVar.copyOnWrite();
            C49903dg dgVar3 = (C49903dg) dfVar.instance;
            C49891cv cvVar2 = (C49891cv) cnVar.build();
            cvVar2.getClass();
            dgVar3.f129719f = cvVar2;
            dgVar3.f129714a |= 32;
            daVar.mo53372c((C49903dg) dfVar.build());
        }
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        C50165mz mzVar2 = (C50165mz) myVar.build();
        mzVar2.getClass();
        acx.f128979G = mzVar2;
        acx.f128985b |= C89885b.NOW_VALUE;
        acw.copyOnWrite();
        acx acx2 = (acx) acw.instance;
        C49898db dbVar = (C49898db) daVar.build();
        dbVar.getClass();
        acx2.f128991h = dbVar;
        acx2.f128984a |= 32;
        acx acx3 = (acx) acw.build();
        Account a2 = kVar.f281858c.mo79668a();
        if (a2 == null) {
            return C60866ct.f164955a;
        }
        return kVar.f281859d.mo28210j(kVar.mo92077b(acx3, a2), "Update server and disable per-device ineligible devices", new C100864c(kVar, a2));
    }

    /* renamed from: k */
    public final boolean mo77702k() {
        if (this.f281842k.mo79746e(C89978aq.f246618q)) {
            C58976aa aaVar = C58975e.f156826a;
            return true;
        } else if (!this.f281842k.mo79746e(C89978aq.f246602a)) {
            C58976aa aaVar2 = C58975e.f156826a;
            return true;
        } else if (this.f281835c.mo27525b() != null && m167085m(((C86054o) this.f281835c.mo27525b()).mo79659F())) {
            return false;
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            return true;
        }
    }

    /* renamed from: l */
    public final boolean mo77703l(String str) {
        return this.f281842k.mo79746e(C89978aq.f246602a) && m167085m(str);
    }
}
