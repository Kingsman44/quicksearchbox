package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.opa.smartspace.C83806v;
import com.google.android.apps.gsa.opa.smartspace.C83807w;
import com.google.android.apps.gsa.opa.smartspace.C83808x;
import com.google.android.apps.gsa.opa.smartspace.C83809y;
import com.google.android.apps.gsa.opa.smartspace.p6454c.C83751g;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83783a;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83785c;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.smartspace.C92110f;
import com.google.android.apps.gsa.smartspace.C92111g;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110602bg;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110656v;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8459j.C110702a;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8459j.C110703b;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8459j.C110707f;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l.C110764bi;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p.C110890o;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3886c.C50738bc;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50838j;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.at */
/* compiled from: PG */
public final class C110812at implements C83785c {

    /* renamed from: a */
    public final C22871g f308727a;

    /* renamed from: b */
    public final C110602bg f308728b;

    /* renamed from: c */
    public final C110764bi f308729c;

    /* renamed from: d */
    public final C110656v f308730d;

    /* renamed from: e */
    public final C110890o f308731e;

    /* renamed from: f */
    public final C83794j f308732f;

    /* renamed from: g */
    public final C83806v f308733g;

    /* renamed from: h */
    public final C92122r f308734h;

    /* renamed from: i */
    public final C92111g f308735i;

    /* renamed from: j */
    public final C58974d f308736j;

    /* renamed from: k */
    public final C83807w f308737k;

    /* renamed from: l */
    public final C83751g f308738l;

    /* renamed from: m */
    public final C130895ag f308739m;

    /* renamed from: n */
    private final C83783a f308740n;

    /* renamed from: o */
    private final C22871g f308741o;

    /* renamed from: p */
    private final C92110f f308742p;

    public C110812at(C83783a aVar, C22871g gVar, C110602bg bgVar, C110764bi biVar, C110656v vVar, C110890o oVar, C83794j jVar, C83806v vVar2, C92122r rVar, C92111g gVar2, C83564a aVar2, C22871g gVar3, C83807w wVar, C92110f fVar, C83751g gVar4, C130895ag agVar) {
        this.f308729c = biVar;
        this.f308740n = aVar;
        this.f308741o = gVar;
        this.f308728b = bgVar;
        this.f308730d = vVar;
        this.f308731e = oVar;
        this.f308732f = jVar;
        this.f308733g = vVar2;
        this.f308734h = rVar;
        this.f308735i = gVar2;
        this.f308727a = gVar3;
        C83564a aVar3 = aVar2;
        this.f308736j = aVar2.mo76900a("AA.FeatureDataManagerImpl");
        this.f308737k = wVar;
        this.f308742p = fVar;
        this.f308738l = gVar4;
        this.f308739m = agVar;
    }

    /* renamed from: a */
    public final C60870cx mo77119a(String str, long j, C50794cr crVar, boolean z) {
        C60870cx cxVar;
        C83808x xVar = (C83808x) C83809y.f228409d.createBuilder();
        xVar.copyOnWrite();
        C83809y yVar = (C83809y) xVar.instance;
        yVar.f228412b = crVar.f132222T;
        yVar.f228411a |= 1;
        C83809y yVar2 = (C83809y) xVar.build();
        C58970a aVar = (C58970a) this.f308736j.mo56224b();
        aVar.mo56378ag(C58975e.f156826a, "SSFeatureDataManager");
        ((C58970a) aVar.mo56372aa(26799)).mo56359L("Dismiss card id: %s, type: %s, is Work profile: %b", str, crVar.name(), Boolean.valueOf(z));
        if (this.f308732f.mo77183v()) {
            cxVar = this.f308730d.mo98833d(str, yVar2, j, z);
        } else {
            cxVar = this.f308740n.mo77112k(str, yVar2, j);
        }
        return this.f308741o.mo28210j(cxVar, "updateDismessalMetadata", new C110805am(this, str));
    }

    /* renamed from: b */
    public final C60870cx mo77120b() {
        if (!this.f308732f.mo77184w()) {
            return this.f308740n.mo77106e();
        }
        C110707f fVar = this.f308731e.f308924d;
        ArrayList arrayList = new ArrayList();
        arrayList.add(7);
        return fVar.f308469b.mo28210j(fVar.f308469b.mo28210j(fVar.f308468a.mo90813a(C53306j.OPA_SMARTSPACE, arrayList), BuildConfig.FLAVOR, new C110702a(fVar)), BuildConfig.FLAVOR, C110703b.f308464a);
    }

    /* renamed from: c */
    public final C60870cx mo77121c(C58833ax axVar, C58833ax axVar2) {
        C60870cx cxVar;
        if (this.f308732f.mo77183v()) {
            cxVar = this.f308730d.mo98831b(C83800p.m133473k().mo77042a());
        } else {
            cxVar = this.f308731e.mo98916a(C83800p.m133473k().mo77042a());
        }
        return this.f308741o.mo28210j(cxVar, "rankSmartspaceContent", new C110806an(this));
    }

    /* renamed from: d */
    public final C60870cx mo77122d(C50838j jVar) {
        return this.f308742p.mo86730b(jVar);
    }

    /* renamed from: e */
    public final C60870cx mo77123e(C83800p pVar) {
        ((C58970a) ((C58970a) this.f308736j.mo56224b()).mo56372aa(26800)).mo56386p("handleNewPrimaryCardUpdate");
        C50818do doVar = pVar.mo77056b().f228252c;
        if (doVar == null) {
            doVar = C50818do.f132293H;
        }
        C58872ci d = C58872ci.m90947d(C58274c.f155808a);
        if (!this.f308732f.mo77183v()) {
            C83783a aVar = this.f308740n;
            String num = Integer.toString(doVar.f132307d);
            C83741am b = pVar.mo77056b();
            C50794cr a = C50794cr.m85938a(doVar.f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            return this.f308729c.mo98871i(this.f308727a.mo28210j(aVar.mo77111j(num, b, a), "getAllCardsContent", new C110836x(this, d, doVar, pVar)));
        }
        C83783a aVar2 = this.f308740n;
        String num2 = Integer.toString(doVar.f132307d);
        C83741am b2 = pVar.mo77056b();
        C50794cr a2 = C50794cr.m85938a(doVar.f132315l);
        if (a2 == null) {
            a2 = C50794cr.UNDEFINED;
        }
        return this.f308727a.mo28210j(aVar2.mo77111j(num2, b2, a2), "handleNewCardUpdate", new C110801ai(this, d, doVar, pVar));
    }

    /* renamed from: f */
    public final C60870cx mo77124f(C83800p pVar) {
        ((C58970a) ((C58970a) this.f308736j.mo56224b()).mo56372aa(26801)).mo56386p("handleNewWeatherCardUpdate");
        if (this.f308732f.mo77184w()) {
            ((C58970a) ((C58970a) this.f308736j.mo56224b()).mo56372aa(26802)).mo56386p("Pcp enabled not handling weather");
            return C118826c.f331423b;
        }
        C58872ci d = C58872ci.m90947d(C58274c.f155808a);
        if (!this.f308732f.mo77183v()) {
            return this.f308729c.mo98872j(this.f308741o.mo28210j(this.f308740n.mo77114m(pVar.mo77056b()), "handleNewWeatherCardUpdate", new C110809aq(this, d, pVar)));
        }
        return this.f308741o.mo28210j(this.f308740n.mo77114m(pVar.mo77056b()), "handleNewWeatherCardUpdate", new C110810ar(this, d, pVar));
    }

    /* renamed from: g */
    public final C60870cx mo77125g(C50738bc bcVar) {
        C58976aa aaVar = C58975e.f156826a;
        C58872ci d = C58872ci.m90947d(C58274c.f155808a);
        if (!this.f308732f.mo77183v()) {
            return mo98891m(this.f308741o.mo28210j(this.f308740n.mo77113l(bcVar.f132038e, bcVar), "getAllSmartspaceCardsContent", new C110837y(this, d)));
        }
        return mo98891m(this.f308741o.mo28210j(this.f308740n.mo77113l(bcVar.f132038e, bcVar), "getAllSmartspaceCardsContent", new C110838z(this, d, bcVar)));
    }

    /* renamed from: h */
    public final C60870cx mo77126h(boolean z) {
        C60870cx cxVar;
        if (this.f308732f.mo77183v()) {
            cxVar = this.f308730d.mo98831b(C83800p.m133473k().mo77042a());
        } else {
            cxVar = this.f308731e.mo98916a(C83800p.m133473k().mo77042a());
        }
        return this.f308741o.mo28210j(cxVar, "handleWeatherPreferenceChanged", new C110796ad(this, z));
    }

    /* renamed from: i */
    public final C60870cx mo77127i() {
        return this.f308741o.mo28210j(this.f308740n.mo77107f(), "removeAllSmartspaceChips", new C110798af(this));
    }

    /* renamed from: j */
    public final C60870cx mo77128j(C50794cr crVar) {
        ((C58970a) ((C58970a) this.f308736j.mo56224b()).mo56372aa(26805)).mo56389s("removeFromCardStore %s", C92111g.m151146a(crVar));
        if (this.f308732f.mo77183v()) {
            return this.f308741o.mo28210j(this.f308740n.mo77109h(crVar), "removeCardsOfType", new C110802aj(this));
        }
        return this.f308741o.mo28210j(this.f308741o.mo28210j(this.f308740n.mo77109h(crVar), "removeCardsOfType", new C110799ag(this)), "removeFromCardStore", new C110800ah(this));
    }

    /* renamed from: k */
    public final C60870cx mo77129k(String str) {
        ((C58970a) ((C58970a) this.f308736j.mo56224b()).mo56372aa(26806)).mo56389s("removeFromCardStore %s", str);
        if (this.f308732f.mo77183v()) {
            return this.f308741o.mo28210j(this.f308730d.mo98832c(str), "removeCardWithId", new C110795ac(this));
        }
        C60870cx j = this.f308741o.mo28210j(this.f308740n.mo77108g(str), "removeCardWithId", new C110793aa(this));
        C22871g gVar = this.f308741o;
        C110764bi biVar = this.f308729c;
        Objects.requireNonNull(biVar);
        return gVar.mo28210j(j, "removeFromCardStore", new C110794ab(biVar));
    }

    /* renamed from: l */
    public final C60870cx mo77130l(String str) {
        if (!this.f308732f.mo77183v()) {
            return mo98891m(this.f308741o.mo28210j(this.f308740n.mo77110i(str), "removeSmartspaceChip", new C110803ak(this)));
        }
        return mo98891m(this.f308741o.mo28210j(this.f308740n.mo77110i(str), "removeSmartspaceChip", new C110804al(this)));
    }

    /* renamed from: m */
    public final C60870cx mo98891m(C60870cx cxVar) {
        ((C58970a) ((C58970a) this.f308736j.mo56224b()).mo56372aa(26804)).mo56386p("refreshSmartspaceChip");
        return this.f308741o.mo28210j(cxVar, "handleSmartspaceChipUpdate", new C110797ae(this));
    }
}
