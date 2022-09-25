package com.google.android.apps.gsa.staticplugins.s3request.producers;

import android.content.Context;
import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.android.apps.gsa.assistant.shared.k;
import com.google.android.apps.gsa.binaries.satin.app.C73983da;
import com.google.android.apps.gsa.binaries.satin.app.C74296td;
import com.google.android.apps.gsa.binaries.satin.app.azp;
import com.google.android.apps.gsa.binaries.satin.app.azr;
import com.google.android.apps.gsa.binaries.satin.app.dc;
import com.google.android.apps.gsa.binaries.satin.app.tf;
import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p6487s3.producers.C84299a;
import com.google.android.apps.gsa.p6487s3.producers.C84304c;
import com.google.android.apps.gsa.p6487s3.producers.C84306e;
import com.google.android.apps.gsa.p6487s3.producers.C84308g;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118934q;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.staticplugins.s3request.p8693d.C116339e;
import com.google.android.apps.gsa.staticplugins.s3request.p8693d.C116340f;
import com.google.android.apps.gsa.staticplugins.s3request.p8693d.C116341g;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4458b.C57986e;
import dagger.C68214a;
import dagger.p5294a.C68225k;
import java.util.ArrayList;
import java.util.concurrent.Future;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.producers.q */
/* compiled from: PG */
public final class C116358q implements C92439c {

    /* renamed from: c */
    private static final C59071e f322646c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.s3request.producers.q");

    /* renamed from: a */
    public final C22871g f322647a;

    /* renamed from: b */
    public final C68214a f322648b;

    /* renamed from: d */
    private final C92473f f322649d;

    /* renamed from: e */
    private final C58833ax f322650e;

    /* renamed from: f */
    private final Query f322651f;

    /* renamed from: g */
    private final C90021c f322652g;

    /* renamed from: h */
    private final C69464a f322653h;

    /* renamed from: i */
    private final C69464a f322654i;

    /* renamed from: j */
    private final C69464a f322655j;

    /* renamed from: k */
    private final C69464a f322656k;

    /* renamed from: l */
    private final C69464a f322657l;

    /* renamed from: m */
    private final C69464a f322658m;

    /* renamed from: n */
    private final C118561t f322659n;

    /* renamed from: o */
    private final u f322660o;

    /* renamed from: p */
    private final Context f322661p;

    /* renamed from: q */
    private final C68214a f322662q;

    /* renamed from: r */
    private final C58833ax f322663r;

    /* renamed from: s */
    private C89356b f322664s;

    /* renamed from: t */
    private Future f322665t;

    /* renamed from: u */
    private Future f322666u;

    /* renamed from: v */
    private C92460b f322667v;

    /* renamed from: w */
    private C60870cx f322668w;

    /* renamed from: x */
    private final C84466a f322669x;

    public C116358q(C92473f fVar, C58833ax axVar, C90021c cVar, C69464a aVar, C84466a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7, C22871g gVar, C118561t tVar, u uVar, Context context, C68214a aVar8, C68214a aVar9, C58833ax axVar2) {
        C92473f fVar2 = fVar;
        C58976aa aaVar = C58975e.f156826a;
        this.f322655j = aVar;
        this.f322649d = fVar2;
        this.f322650e = axVar;
        this.f322652g = cVar;
        this.f322653h = aVar6;
        this.f322654i = aVar7;
        this.f322669x = aVar2;
        this.f322656k = aVar3;
        this.f322657l = aVar4;
        this.f322658m = aVar5;
        String str = fVar2.f258033u;
        this.f322651f = fVar2.f258009E;
        this.f322647a = gVar;
        this.f322659n = tVar;
        this.f322660o = uVar;
        this.f322661p = context;
        this.f322648b = aVar8;
        this.f322662q = aVar9;
        this.f322663r = axVar2;
    }

    /* renamed from: a */
    public final C57981b mo87118a() {
        C58976aa aaVar = C58975e.f156826a;
        mo102650e(C89849ae.S3_HEADER_REQUEST_CREATION_START);
        this.f322664s = this.f322669x.mo78026b("Build Voice Search Request", C118575h.GRAPH_VOICE_SEARCH_REQUEST, C118575h.GRAPH_VOICE_SEARCH_REQUEST);
        if (!this.f322649d.f258009E.mo84370cC() && ((this.f322649d.f258014b == C90536a.VOICE_ACTIONS && this.f322649d.f258009E.mo84434dO()) || (this.f322649d.f258014b == C90536a.CLOCKWORK && this.f322651f.mo84399cf() && this.f322651f.mo84364bx("android.opa.extra.CONVERSATION_DELTA")))) {
            C73983da daVar = (C73983da) this.f322658m.mo17428b();
            C92473f fVar = this.f322649d;
            fVar.getClass();
            daVar.f205888e = fVar;
            Query query = this.f322649d.f258009E;
            query.getClass();
            daVar.f205887d = query;
            C89356b bVar = this.f322664s;
            bVar.getClass();
            daVar.f205886c = bVar;
            C58833ax axVar = this.f322650e;
            axVar.getClass();
            daVar.f205889f = axVar;
            C68225k.m98529a(daVar.f205886c, C89356b.class);
            C68225k.m98529a(daVar.f205887d, Query.class);
            C68225k.m98529a(daVar.f205888e, C92473f.class);
            C68225k.m98529a(daVar.f205889f, C58833ax.class);
            dc dcVar = new dc(daVar.f205884a, daVar.f205885b, daVar.f205886c, daVar.f205887d, daVar.f205888e, daVar.f205889f);
            this.f322668w = dcVar.e.mo60297gq();
            this.f322667v = (C92460b) dcVar.i.mo17428b();
        } else if (this.f322649d.f258009E.mo84370cC() || this.f322649d.f258014b != C90536a.VOICE_ACTIONS || this.f322649d.f258009E.mo84434dO()) {
            azp azp = (azp) this.f322656k.mo17428b();
            C58833ax axVar2 = this.f322650e;
            axVar2.getClass();
            azp.f204840f = axVar2;
            C92473f fVar2 = this.f322649d;
            fVar2.getClass();
            azp.f204839e = fVar2;
            Query query2 = this.f322651f;
            query2.getClass();
            azp.f204838d = query2;
            C89356b bVar2 = this.f322664s;
            bVar2.getClass();
            azp.f204837c = bVar2;
            C68225k.m98529a(azp.f204837c, C89356b.class);
            C68225k.m98529a(azp.f204838d, Query.class);
            C68225k.m98529a(azp.f204839e, C92473f.class);
            C68225k.m98529a(azp.f204840f, C58833ax.class);
            azr azr = new azr(azp.f204835a, azp.f204836b, azp.f204837c, azp.f204838d, azp.f204839e, azp.f204840f);
            this.f322667v = (C92460b) azr.i.mo17428b();
            this.f322668w = azr.e.mo60297gq();
            this.f322665t = azr.j.mo60297gq();
            this.f322666u = azr.k.mo60297gq();
        } else {
            C74296td tdVar = (C74296td) this.f322657l.mo17428b();
            C92473f fVar3 = this.f322649d;
            fVar3.getClass();
            tdVar.f208019e = fVar3;
            Query query3 = this.f322649d.f258009E;
            query3.getClass();
            tdVar.f208018d = query3;
            C89356b bVar3 = this.f322664s;
            bVar3.getClass();
            tdVar.f208017c = bVar3;
            C58833ax axVar3 = this.f322650e;
            axVar3.getClass();
            tdVar.f208020f = axVar3;
            C68225k.m98529a(tdVar.f208017c, C89356b.class);
            C68225k.m98529a(tdVar.f208018d, Query.class);
            C68225k.m98529a(tdVar.f208019e, C92473f.class);
            C68225k.m98529a(tdVar.f208020f, C58833ax.class);
            tf tfVar = new tf(tdVar.f208015a, tdVar.f208016b, tdVar.f208017c, tdVar.f208018d, tdVar.f208019e, tdVar.f208020f);
            this.f322668w = tfVar.e.mo60297gq();
            this.f322667v = (C92460b) tfVar.i.mo17428b();
            this.f322665t = tfVar.j.mo60297gq();
            this.f322666u = tfVar.k.mo60297gq();
        }
        C60870cx cxVar = this.f322668w;
        if (cxVar != null) {
            this.f322647a.mo28211k(cxVar, "s3 header request completion", new C116357p(this));
        }
        ArrayList d = C58597ky.m90213d(3);
        Query query4 = this.f322651f;
        C90021c cVar = this.f322652g;
        C92460b bVar4 = this.f322667v;
        bVar4.getClass();
        d.add(new C116339e(query4, cVar, bVar4, this.f322647a, this.f322650e, this.f322660o, this.f322661p, this.f322663r, (C91123v) this.f322662q.mo27525b()));
        if (this.f322665t != null) {
            d.add(new C116341g((C116340f) this.f322655j.mo17428b(), this.f322651f));
        }
        if (k.a(this.f322651f)) {
            d.add(new C84304c((C84299a) this.f322653h.mo17428b(), this.f322651f));
        } else if (this.f322666u != null) {
            C84306e eVar = (C84306e) this.f322654i.mo17428b();
            eVar.f229439a = C9318f.VOICE;
            d.add(new C84308g(eVar, this.f322651f));
        }
        C57986e eVar2 = new C57986e(d);
        C116355n nVar = new C116355n(this);
        C60870cx cxVar2 = this.f322668w;
        cxVar2.getClass();
        return new C118934q(nVar, cxVar2, eVar2);
    }

    /* renamed from: b */
    public final void mo87119b() {
        C89356b bVar = this.f322664s;
        if (bVar != null) {
            bVar.mo83286e().mo54566a();
        }
        C60870cx cxVar = this.f322668w;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
        Future future = this.f322665t;
        if (future != null) {
            future.cancel(true);
        }
        Future future2 = this.f322666u;
        if (future2 != null) {
            future2.cancel(true);
        }
    }

    /* renamed from: c */
    public final void mo87120c() {
        C59104x b = f322646c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VoiceSearchReqPFactory");
        ((C59052c) ((C59052c) b).mo56372aa(31778)).mo56386p("refresh()");
        this.f322659n.mo103754e(C118522by.REFRESH_AUTH_TOKENS, C118472ag.f328819i);
    }

    /* renamed from: d */
    public final boolean mo87121d() {
        return true;
    }

    /* renamed from: e */
    public final void mo102650e(C89849ae aeVar) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        ((C89859i) this.f322648b.mo27525b()).mo74236a(fVar.mo83699a());
    }
}
