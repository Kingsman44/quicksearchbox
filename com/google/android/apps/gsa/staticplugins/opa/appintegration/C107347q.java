package com.google.android.apps.gsa.staticplugins.opa.appintegration;

import android.text.TextUtils;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.LiveData;
import com.google.android.apps.gsa.assistant.shared.bd;
import com.google.android.apps.gsa.assistant.shared.be;
import com.google.android.apps.gsa.assistant.shared.c;
import com.google.android.apps.gsa.assistant.shared.d;
import com.google.android.apps.gsa.assistant.shared.l.b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6809l.C86152a;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90143v;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7171i.C91042a;
import com.google.android.libraries.assistant.p1467d.p1471b.C17823i;
import com.google.android.libraries.assistant.p1467d.p1471b.C17825k;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17877ag;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17879ai;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.q */
/* compiled from: PG */
public final class C107347q implements bd, d {

    /* renamed from: a */
    private static final C59071e f298738a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appintegration.q");

    /* renamed from: b */
    private static final C58495hd f298739b;

    /* renamed from: c */
    private final C68214a f298740c;

    /* renamed from: d */
    private final C107349s f298741d;

    /* renamed from: e */
    private final C86124t f298742e;

    /* renamed from: f */
    private final C86152a f298743f;

    /* renamed from: g */
    private final C69464a f298744g;

    /* renamed from: h */
    private final C2332ag f298745h = new C2332ag();

    /* renamed from: i */
    private final C2332ag f298746i = new C2332ag();

    /* renamed from: j */
    private final C2332ag f298747j = new C2332ag();

    /* renamed from: k */
    private final C2332ag f298748k = new C2332ag();

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("com.google.android.apps.gmm.dev", "com.google.android.googlequicksearchbox.NEXUS_OPA_GMM_FEEDBACK");
        gzVar.mo55429h("com.google.android.apps.gmm.car", "com.google.android.googlequicksearchbox.NEXUS_OPA_GMM_FEEDBACK");
        gzVar.mo55429h("com.google.android.apps.gmm.fishfood", "com.google.android.googlequicksearchbox.NEXUS_OPA_GMM_FEEDBACK");
        gzVar.mo55429h("com.google.android.apps.gmm", "com.google.android.googlequicksearchbox.NEXUS_OPA_GMM_FEEDBACK");
        gzVar.mo55429h("com.google.android.apps.gmm.qp", "com.google.android.googlequicksearchbox.NEXUS_OPA_GMM_FEEDBACK");
        gzVar.mo55429h("com.google.android.apps.maps", "com.google.android.googlequicksearchbox.NEXUS_OPA_GMM_FEEDBACK");
        gzVar.mo55429h("com.google.android.apps.messaging", "com.google.android.googlequicksearchbox.NEXUS_OPA_AM_FEEDBACK");
        gzVar.mo55429h("com.google.android.inputmethod.latin.dev", "com.google.android.googlequicksearchbox.NEXUS_OPA_GBOARD_FEEDBACK");
        gzVar.mo55429h("com.google.android.inputmethod.latin.canary", "com.google.android.googlequicksearchbox.NEXUS_OPA_GBOARD_FEEDBACK");
        gzVar.mo55429h("com.google.android.inputmethod.latin", "com.google.android.googlequicksearchbox.NEXUS_OPA_GBOARD_FEEDBACK");
        f298739b = gzVar.mo55427f(false);
    }

    public C107347q(C68214a aVar, C107349s sVar, C86124t tVar, C86152a aVar2, C69464a aVar3) {
        this.f298740c = aVar;
        this.f298741d = sVar;
        this.f298742e = tVar;
        this.f298743f = aVar2;
        this.f298744g = aVar3;
    }

    /* renamed from: w */
    private final boolean m178207w() {
        C90476a aVar = C91018d.f254254a;
        String a = this.f298743f.f232820b.mo79804a();
        if (TextUtils.isEmpty(a) || !a.equals(mo95934l())) {
            C58976aa aaVar = C58975e.f156826a;
            mo95934l();
            return false;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return true;
    }

    /* renamed from: a */
    public final LiveData mo95923a() {
        return this.f298746i;
    }

    /* renamed from: b */
    public final LiveData mo95924b() {
        return this.f298747j;
    }

    /* renamed from: c */
    public final LiveData mo95925c() {
        return this.f298745h;
    }

    /* renamed from: d */
    public final LiveData mo95926d() {
        return this.f298748k;
    }

    /* renamed from: e */
    public final void mo95927e(String str) {
        this.f298746i.mo5706i(str);
    }

    /* renamed from: f */
    public final void mo95928f(C17823i iVar) {
        this.f298747j.mo5706i(iVar);
    }

    /* renamed from: g */
    public final void mo95929g(c cVar) {
        this.f298745h.mo5706i(cVar);
    }

    /* renamed from: h */
    public final void mo95930h(C17825k kVar) {
        this.f298748k.mo5706i(kVar);
    }

    /* renamed from: i */
    public final int mo95931i(String str) {
        if (!str.equals(mo95934l())) {
            return 0;
        }
        if (!C90721ae.f253797f.contains(str)) {
            return "com.google.android.apps.chromecast.app".equals(str) ? 7 : 0;
        }
        return 6;
    }

    /* renamed from: j */
    public final Query mo95932j(Query query) {
        if (!m178207w()) {
            return query;
        }
        b b = ((C107348r) this.f298740c.mo27525b()).mo6453a();
        String str = b.b;
        C17880aj ajVar = b.c;
        if (ajVar == null) {
            ajVar = C17880aj.f51221i;
        }
        if (!mo95942t(str, ajVar)) {
            return query;
        }
        int a = C17879ai.m35106a(ajVar.f51224b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        return (i == 1 || i == 2) ? query.mo84260X(true).mo84302an("android.opa.extra.MINI_PLATE_ENABLED", true) : query;
    }

    /* renamed from: k */
    public final C17880aj mo95933k(String str) {
        if (mo95937o(str)) {
            C17880aj ajVar = ((C107348r) this.f298740c.mo27525b()).mo6453a().c;
            return ajVar == null ? C17880aj.f51221i : ajVar;
        }
        C59104x b = f298738a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaAppIntegStatusHelper");
        ((C59052c) ((C59052c) b).mo56372aa(23671)).mo56389s("No voice plate params for %s", str);
        return null;
    }

    /* renamed from: l */
    public final String mo95934l() {
        return ((C107348r) this.f298740c.mo27525b()).mo6453a().b;
    }

    /* renamed from: m */
    public final void mo95935m(String str, C17880aj ajVar, C87565h hVar) {
        Optional optional;
        String P = C87566i.m142241P(hVar.mo81685a());
        if (P == null || !this.f298742e.mo79746e(C90014bt.f247155bn) || (!"and.opa.longpress".equals(P) && !"and.opa.elmyra".equals(P) && !"and.opa.lockscreen.elmyra".equals(P))) {
            int a = C17879ai.m35106a(ajVar.f51224b);
            if (a == 0) {
                a = 1;
            }
            if (a == 2 || a == 3) {
                hVar.f236502F = true;
                hVar.f236512P = 268730368;
            }
            if (a == 3) {
                hVar.f236531ab = 1;
            }
            int i = ajVar.f51223a;
            if ((i & 2) != 0) {
                hVar.f236533ad = ajVar.f51225c;
            }
            if ((i & 4) != 0) {
                ArrayList arrayList = new ArrayList();
                C17877ag agVar = ajVar.f51226d;
                if (agVar == null) {
                    agVar = C17877ag.f51217b;
                }
                arrayList.addAll(agVar.f51219a);
                if (!arrayList.isEmpty()) {
                    hVar.f236538ai = arrayList;
                }
            }
            if ((ajVar.f51223a & 32) != 0) {
                hVar.f236580z = ajVar.f51229g;
            }
            if ("com.google.android.apps.chromecast.app".equals(str)) {
                hVar.f236558d = 7;
                hVar.f236512P = 268730368;
            } else if (C90721ae.f253797f.contains(str)) {
                if (a == 2 || a == 3) {
                    hVar.f236497A = false;
                    hVar.f236498B = false;
                }
                hVar.f236558d = 6;
                hVar.f236530aa = "com.google.android.googlequicksearchbox.NEXUS_OPA_GMM_FEEDBACK";
                hVar.f236507K = true;
                hVar.f236502F = true;
                hVar.f236512P = 268730368;
            } else if (C90721ae.f253798g.contains(str)) {
                hVar.f236507K = true;
            } else if (this.f298742e.mo79746e(C90143v.f251878b) && "com.google.android.youtube".equals(str)) {
                hVar.f236512P = 268730368;
            }
            hVar.f236521Y = str;
            if (this.f298742e.mo79746e(C90014bt.f247045J)) {
                hVar.f236522Z = ajVar.toByteArray();
            }
            C58495hd hdVar = f298739b;
            if (!hdVar.containsKey(str)) {
                optional = Optional.empty();
            } else if (!C90721ae.f253799h.contains(str)) {
                optional = Optional.m71637of((String) hdVar.get(str));
            } else if (this.f298741d.mo95958i(ajVar)) {
                optional = Optional.m71637of("com.google.android.googlequicksearchbox.NEXUS_OPA_GBOARD_FEEDBACK");
            } else {
                optional = Optional.empty();
            }
            Objects.requireNonNull(hVar);
            optional.ifPresent(new C107346p(hVar));
        }
    }

    /* renamed from: n */
    public final void mo95936n(String str, C87565h hVar) {
        b b = ((C107348r) this.f298740c.mo27525b()).mo6453a();
        String str2 = b.b;
        C17880aj ajVar = b.c;
        if (ajVar == null) {
            ajVar = C17880aj.f51221i;
        }
        if ((this.f298742e.mo79745c(C90014bt.f247847w).contains(Integer.toString(C91042a.m148717a(str2))) || mo95937o(str)) && mo95942t(str2, ajVar)) {
            mo95935m(str2, ajVar, hVar);
        }
    }

    /* renamed from: o */
    public final boolean mo95937o(String str) {
        b b = ((C107348r) this.f298740c.mo27525b()).mo6453a();
        if (str.equals(b.b)) {
            C58976aa aaVar = C58975e.f156826a;
            return true;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        String str2 = b.b;
        return false;
    }

    /* renamed from: p */
    public final boolean mo95938p(String str) {
        if (!this.f298741d.mo95961m(str)) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (((Boolean) this.f298744g.mo17428b()).booleanValue()) {
            return true;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        }
    }

    /* renamed from: q */
    public final boolean mo95939q() {
        if (!this.f298742e.mo79746e(C90014bt.f247258dk) || !mo95941s()) {
            return false;
        }
        return C90721ae.f253794c.contains(mo95934l());
    }

    /* renamed from: r */
    public final boolean mo95940r(String str) {
        b b = ((C107348r) this.f298740c.mo27525b()).mo6453a();
        String str2 = b.b;
        C17880aj ajVar = b.c;
        if (ajVar == null) {
            ajVar = C17880aj.f51221i;
        }
        return mo95937o(str) && mo95942t(str2, ajVar) && be.b.contains(str2);
    }

    /* renamed from: s */
    public final boolean mo95941s() {
        if (!m178207w()) {
            return false;
        }
        return be.b.contains(mo95934l());
    }

    /* renamed from: t */
    public final boolean mo95942t(String str, C17880aj ajVar) {
        int a = C17879ai.m35106a(ajVar.f51224b);
        if (a == 0) {
            a = 1;
        }
        if (this.f298741d.mo95952c(str).contains(Integer.valueOf(a - 1))) {
            return true;
        }
        C59104x d = f298738a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "OpaAppIntegStatusHelper");
        ((C59052c) ((C59052c) d).mo56372aa(23678)).mo56389s("%s is not supported", str);
        return false;
    }

    /* renamed from: u */
    public final boolean mo95943u(String str) {
        return C90721ae.f253794c.contains(str);
    }

    /* renamed from: v */
    public final boolean mo95944v(String str) {
        if (!mo95934l().equals(str)) {
            return false;
        }
        if (C90721ae.f253797f.contains(str) || C90721ae.f253798g.contains(str)) {
            return true;
        }
        return false;
    }
}
