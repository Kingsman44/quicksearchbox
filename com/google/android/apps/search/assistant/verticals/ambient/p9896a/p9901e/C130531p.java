package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9901e;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8223j.C106569c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8223j.C106570d;
import com.google.android.apps.p471d.p472a.p473a.p475b.p476a.C9027a;
import com.google.android.apps.search.assistant.platform.pcp.api.C123587c;
import com.google.android.apps.search.assistant.platform.pcp.api.C123597m;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.verticals.ambient.p9896a.C130477a;
import com.google.android.apps.search.assistant.verticals.ambient.p9905c.C130586e;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131178c;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9959b.C131214d;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131240i;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t;
import com.google.android.apps.search.assistant.verticals.ambient.settings.C131567i;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.C131673i;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a.C131593n;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50819dp;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3889c.C50763a;
import com.google.assistant.p3886c.p3889c.C50764b;
import com.google.assistant.p3886c.p3889c.C50765c;
import com.google.assistant.p3886c.p3889c.C50767e;
import com.google.assistant.p3886c.p3889c.C50770h;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.Set;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.e.p */
/* compiled from: PG */
public final class C130531p implements C130477a {

    /* renamed from: a */
    public final C58974d f357565a;

    /* renamed from: b */
    public final C130586e f357566b;

    /* renamed from: c */
    public final C60887da f357567c;

    /* renamed from: d */
    public final Set f357568d;

    /* renamed from: e */
    public final Set f357569e;

    /* renamed from: f */
    public final C38469m f357570f;

    /* renamed from: g */
    public final C131251t f357571g;

    /* renamed from: h */
    public final C131673i f357572h;

    /* renamed from: i */
    public final C131240i f357573i;

    /* renamed from: j */
    public final C130895ag f357574j;

    /* renamed from: k */
    public final C60950i f357575k;

    /* renamed from: l */
    private final C123587c f357576l;

    /* renamed from: m */
    private final boolean f357577m;

    /* renamed from: n */
    private final C131567i f357578n;

    /* renamed from: o */
    private C60870cx f357579o = C60856cj.m92900i(C50819dp.f132330b);

    public C130531p(C130603a aVar, C123587c cVar, C130586e eVar, C60887da daVar, Set set, Set set2, boolean z, C38469m mVar, C131567i iVar, C131251t tVar, C131673i iVar2, C131240i iVar3, C130895ag agVar, C60950i iVar4) {
        this.f357565a = aVar.mo109740b(this);
        this.f357576l = cVar;
        this.f357567c = daVar;
        this.f357566b = eVar;
        this.f357568d = set;
        this.f357569e = set2;
        this.f357577m = z;
        this.f357570f = mVar;
        this.f357578n = iVar;
        this.f357571g = tVar;
        this.f357572h = iVar2;
        this.f357573i = iVar3;
        this.f357574j = agVar;
        this.f357575k = iVar4;
    }

    /* renamed from: e */
    private final synchronized C60870cx m212914e(C106596h hVar, C53715bm bmVar) {
        C47633f i;
        synchronized (this) {
            if (!this.f357579o.isDone()) {
                this.f357579o.cancel(false);
            }
            C60870cx b = this.f357570f.mo41431b(C65753ak.SMARTSPACE_CARD_UPDATE_RECORD, (String) null, C63662ac.f172144a, C131214d.f358826e);
            C123587c cVar = this.f357576l;
            C123597m mVar = (C123597m) cVar;
            C47633f i2 = C47633f.m84733g(mVar.mo106043c(C53306j.BLUECHIP_SMARTSPACE_TNG, C58528ij.m90015O(16, 7, 11, 35, 17, 32, 31, 39, 40, 38, 37, 41, 25), false, C123755bv.f341837o, C123777f.f341922a)).mo51516i(new C130527l(this, hVar, bmVar), this.f357567c);
            C131567i iVar = this.f357578n;
            Objects.requireNonNull(iVar);
            C47633f i3 = i2.mo51516i(new C130528m(iVar), this.f357567c);
            C131567i iVar2 = this.f357578n;
            Objects.requireNonNull(iVar2);
            C47633f h = i3.mo51516i(new C130529n(iVar2), this.f357567c).mo51515h(new C130517b(this), this.f357567c);
            C47633f h2 = C47636i.m84746e(h, b).mo51519b(new C130518c(this, h, b), this.f357567c).mo51515h(new C130519d(this), this.f357567c);
            this.f357579o = h2;
            i = C47633f.m84733g(h2).mo51516i(new C130520e(this, b), this.f357567c);
        }
        return i;
    }

    /* renamed from: a */
    public final C60870cx mo109707a(C106596h hVar, C53715bm bmVar) {
        if (!this.f357577m || !this.f357571g.mo110133h()) {
            ((C58970a) ((C58970a) this.f357565a.mo56224b()).mo56372aa(38907)).mo56386p("TNG Bluechip smartspace not enabled.");
            return C60866ct.f164955a;
        }
        int i = bmVar.f141023a;
        if (i != 13 && i != 15) {
            return C60866ct.f164955a;
        }
        if (i != 15) {
            C106570d dVar = (C106570d) bmVar.f141024b;
            if ((dVar.f297156a & 1) == 0) {
                return C60866ct.f164955a;
            }
            int a = C106569c.m177345a(dVar.f297157b);
            if (a != 0 && a == 3) {
                ((C58970a) ((C58970a) this.f357565a.mo56224b()).mo56372aa(38908)).mo56386p("#handlePcpDataUpdate");
                return m212914e(hVar, bmVar);
            }
            int i2 = dVar.f297157b;
            return C60866ct.f164955a;
        }
        ((C58970a) ((C58970a) this.f357565a.mo56224b()).mo56372aa(38911)).mo56386p("#handleSmartspaceSettingsChange");
        return m212914e(hVar, bmVar);
    }

    /* renamed from: b */
    public final C50763a mo109719b(C50770h hVar, int i, C50794cr crVar) {
        if (!C131178c.f358764a.containsKey(crVar)) {
            ((C58970a) ((C58970a) this.f357565a.mo56224b()).mo56372aa(38905)).mo56389s("#cardType: %s is not in the FEATURE_MAPPING, can't add missing primary logging in UI template", crVar);
            return (C50763a) hVar.toBuilder();
        }
        ((C58970a) ((C58970a) this.f357565a.mo56224b()).mo56372aa(38904)).mo56389s("#Add missing primary logging for cardType: %s in UI template", crVar);
        C50763a aVar = (C50763a) hVar.toBuilder();
        C50765c cVar = hVar.f132128c;
        if (cVar == null) {
            cVar = C50765c.f132101g;
        }
        C50764b bVar = (C50764b) cVar.toBuilder();
        C50767e a = C131593n.m214002a(i, (C9027a) C131178c.f358764a.get(crVar));
        bVar.copyOnWrite();
        C50765c cVar2 = (C50765c) bVar.instance;
        a.getClass();
        cVar2.f132107e = a;
        cVar2.f132103a |= 8;
        aVar.copyOnWrite();
        C50770h hVar2 = (C50770h) aVar.instance;
        C50765c cVar3 = (C50765c) bVar.build();
        cVar3.getClass();
        hVar2.f132128c = cVar3;
        hVar2.f132126a |= 2;
        return aVar;
    }

    /* renamed from: c */
    public final void mo109720c(C50819dp dpVar) {
        for (C50818do doVar : dpVar.f132332a) {
            C58970a aVar = (C58970a) ((C58970a) this.f357565a.mo56224b()).mo56372aa(38915);
            Integer valueOf = Integer.valueOf(doVar.f132307d);
            C50794cr a = C50794cr.m85938a(doVar.f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            String name = a.name();
            C50802cz czVar = doVar.f132308e;
            if (czVar == null) {
                czVar = C50802cz.f132236g;
            }
            C50723h hVar = czVar.f132239b;
            if (hVar == null) {
                hVar = C50723h.f131999e;
            }
            C50723h hVar2 = hVar;
            Long valueOf2 = Long.valueOf(doVar.f132318o);
            Long valueOf3 = Long.valueOf(doVar.f132317n);
            C50796ct ctVar = doVar.f132320q;
            if (ctVar == null) {
                ctVar = C50796ct.f132223c;
            }
            aVar.mo56363P("cardId: %d, card type: %s, pre event title: %s, event start time: %s, update time: %s, expireTime: %s, is from work profile: %b", valueOf, name, hVar2, valueOf2, valueOf3, Long.valueOf(ctVar.f132226b), Boolean.valueOf(doVar.f132322s));
        }
    }

    /* renamed from: d */
    public final C60870cx mo109721d(C50819dp dpVar, int i, String str, C60870cx cxVar) {
        return C47633f.m84733g(cxVar).mo51516i(new C130516a(this, dpVar, this.f357575k.mo57444a(), i, str), this.f357567c);
    }
}
