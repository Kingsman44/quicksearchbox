package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83784b;
import com.google.android.apps.gsa.opa.smartspace.p6458g.C83791c;
import com.google.android.apps.gsa.p8839t.p8840a.C118339a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110602bg;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110656v;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8459j.C110707f;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l.C110764bi;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p.C110890o;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.w */
/* compiled from: PG */
public final class C110835w implements C83784b {

    /* renamed from: a */
    public final C58974d f308785a;

    /* renamed from: b */
    public final C110602bg f308786b;

    /* renamed from: c */
    public final C110890o f308787c;

    /* renamed from: d */
    public final C83794j f308788d;

    /* renamed from: e */
    public final C83791c f308789e;

    /* renamed from: f */
    public final C110764bi f308790f;

    /* renamed from: g */
    public final C22871g f308791g;

    /* renamed from: h */
    public final C110707f f308792h;

    /* renamed from: i */
    public final C110656v f308793i;

    /* renamed from: j */
    public final C91189au f308794j;

    /* renamed from: k */
    public final C130895ag f308795k;

    /* renamed from: l */
    private final C118339a f308796l;

    public C110835w(C110602bg bgVar, C110890o oVar, C83794j jVar, C83791c cVar, C110764bi biVar, C22871g gVar, C110707f fVar, C118339a aVar, C110656v vVar, C91189au auVar, C83564a aVar2, C130895ag agVar) {
        this.f308786b = bgVar;
        this.f308787c = oVar;
        this.f308788d = jVar;
        this.f308789e = cVar;
        this.f308790f = biVar;
        this.f308791g = gVar;
        this.f308792h = fVar;
        this.f308796l = aVar;
        this.f308793i = vVar;
        this.f308785a = aVar2.mo76900a("SSDataManagerImpl");
        this.f308794j = auVar;
        this.f308795k = agVar;
    }

    /* renamed from: e */
    private final List m184578e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(16);
        arrayList.add(7);
        if (this.f308788d.mo77185x()) {
            arrayList.add(17);
        }
        arrayList.add(32);
        arrayList.add(31);
        if (this.f308788d.mo77186y()) {
            arrayList.add(41);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C60870cx mo77115a() {
        ((C58970a) ((C58970a) this.f308785a.mo56224b()).mo56372aa(26796)).mo56386p("#resendCurrentCards");
        if (!this.f308788d.mo77183v()) {
            return this.f308791g.mo28210j(this.f308787c.mo98916a(C83800p.m133473k().mo77042a()), "resendCurrentCards", new C110822j(this));
        }
        C110602bg bgVar = this.f308786b;
        ((C58970a) ((C58970a) bgVar.f308278c.mo56224b()).mo56372aa(26615)).mo56386p("CrossProfileServiceManagerMediator#resendCurrentCards");
        C60870cx c = bgVar.f308280e.mo98825a().mo98812c();
        if (bgVar.mo98806c()) {
            bgVar.mo98805b(c);
            bgVar.f308280e.mo98827c().mo98812c();
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* renamed from: b */
    public final C60870cx mo77116b() {
        ((C58970a) ((C58970a) this.f308785a.mo56224b()).mo56372aa(26797)).mo56386p("#resendCurrentCardsForLauncher");
        if (!this.f308788d.mo77183v()) {
            return this.f308791g.mo28210j(this.f308787c.mo98916a(C83800p.m133473k().mo77042a()), "resendCurrentCardsForLauncher", new C110828p(this));
        }
        C110602bg bgVar = this.f308786b;
        ((C58970a) ((C58970a) bgVar.f308278c.mo56224b()).mo56372aa(26616)).mo56386p("CrossProfileServiceManagerMediator#resendCurrentCardsForLauncher");
        C60870cx d = bgVar.f308280e.mo98825a().mo98813d();
        if (bgVar.mo98806c()) {
            bgVar.mo98805b(d);
            bgVar.f308280e.mo98827c().mo98813d();
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* renamed from: c */
    public final C60870cx mo77117c() {
        ((C58970a) ((C58970a) this.f308785a.mo56224b()).mo56372aa(26798)).mo56386p("#updateCurrentCard");
        if (this.f308788d.mo77184w()) {
            return this.f308791g.mo28210j(this.f308791g.mo28210j(this.f308796l.mo90814b(C53306j.OPA_SMARTSPACE, m184578e(), false), BuildConfig.FLAVOR, new C110830r(this)), "pcpUpdateResult", new C110831s(this));
        } else if (!this.f308788d.mo77183v()) {
            return this.f308791g.mo28210j(this.f308787c.mo98916a(C83800p.m133473k().mo77042a()), "updateCurrentCard", new C110832t(this));
        } else {
            return this.f308786b.mo98804a();
        }
    }

    /* renamed from: d */
    public final void mo77118d() {
        ((C58970a) ((C58970a) this.f308785a.mo56224b()).mo56372aa(26789)).mo56386p("#handlePcpDataUpdate");
        this.f308791g.mo28210j(this.f308796l.mo90814b(C53306j.OPA_SMARTSPACE, m184578e(), false), BuildConfig.FLAVOR, new C110833u(this));
    }
}
