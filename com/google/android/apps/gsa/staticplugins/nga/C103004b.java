package com.google.android.apps.gsa.staticplugins.nga;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.nga.api.C74722bz;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80112b;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80994n;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6594bj.C84874a;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.nga.p8051e.C103027f;
import com.google.android.apps.gsa.staticplugins.nga.p8051e.C103028g;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103333an;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103335ap;
import com.google.android.apps.gsa.staticplugins.nga.p8076o.C103456a;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.C103568cd;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.C103569ce;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.C103570cf;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.C103571cg;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.C103572ch;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.C103573ci;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.C103574cj;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.C103578cn;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.C103579co;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.C104151c;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.FeedbackEmptyActivity;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.p8326a.C107825v;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.apps.search.assistant.verticals.p10050e.p10051a.C132095i;
import com.google.android.apps.search.assistant.verticals.p10050e.p10051a.C132097k;
import com.google.android.apps.search.assistant.verticals.p10050e.p10051a.C132098l;
import com.google.android.apps.search.assistant.verticals.p10050e.p10051a.C132105s;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65811co;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.b */
/* compiled from: PG */
public final class C103004b extends C86734a implements C84874a {

    /* renamed from: a */
    private final Context f287580a;

    /* renamed from: b */
    private final C22871g f287581b;

    /* renamed from: c */
    private final C132095i f287582c;

    /* renamed from: f */
    private final C103028g f287583f;

    /* renamed from: g */
    private final C103579co f287584g;

    /* renamed from: h */
    private final C74722bz f287585h;

    /* renamed from: i */
    private final C103335ap f287586i;

    /* renamed from: j */
    private final C118561t f287587j;

    /* renamed from: k */
    private final C103456a f287588k;

    /* renamed from: l */
    private final C86054o f287589l;

    /* renamed from: m */
    private final C104151c f287590m;

    /* renamed from: n */
    private final u f287591n;

    protected C103004b(Context context, C22871g gVar, C132095i iVar, C103028g gVar2, C103579co coVar, C103335ap apVar, C74722bz bzVar, C118561t tVar, C103456a aVar, C104151c cVar, C86054o oVar, u uVar) {
        super(C118575h.WORKER_NGA, "nga");
        this.f287580a = context;
        this.f287581b = gVar;
        this.f287582c = iVar;
        this.f287583f = gVar2;
        this.f287584g = coVar;
        this.f287586i = apVar;
        this.f287585h = bzVar;
        this.f287587j = tVar;
        this.f287588k = aVar;
        this.f287589l = oVar;
        this.f287590m = cVar;
        this.f287591n = uVar;
    }

    /* renamed from: a */
    public final C60870cx mo78552a(C65811co coVar, String str) {
        C103028g gVar = this.f287583f;
        return gVar.f287625a.mo28202b("[NGA] DeeplinkGrpcHelper.getDeeplinkFromServer.getDeeplink", new C103027f(gVar, coVar, str));
    }

    /* renamed from: b */
    public final C60870cx mo78553b(Query query, C85422c cVar, ClientConfig clientConfig) {
        C103579co coVar = this.f287584g;
        cVar.getClass();
        clientConfig.getClass();
        C69464a aVar = coVar.f288561a;
        C69464a aVar2 = coVar.f288562b;
        C22871g gVar = (C22871g) coVar.f288563c.mo17428b();
        C22871g gVar2 = gVar;
        gVar.getClass();
        C22871g gVar3 = (C22871g) coVar.f288564d.mo17428b();
        C22871g gVar4 = gVar3;
        gVar3.getClass();
        Context context = (Context) coVar.f288565e.mo17428b();
        Context context2 = context;
        context.getClass();
        C68214a a = C68219e.m98518a(((C68226l) coVar.f288566f).f184585a);
        C68214a aVar3 = a;
        a.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) coVar.f288567g).f184585a);
        C68214a aVar4 = a2;
        a2.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) coVar.f288568h).f184585a);
        C68214a aVar5 = a3;
        a3.getClass();
        C86124t tVar = (C86124t) coVar.f288569i.mo17428b();
        C86124t tVar2 = tVar;
        tVar.getClass();
        C107825v vVar = (C107825v) coVar.f288570j.mo17428b();
        C107825v vVar2 = vVar;
        vVar.getClass();
        C103335ap apVar = (C103335ap) coVar.f288571k.mo17428b();
        C103579co coVar2 = coVar;
        C103335ap apVar2 = apVar;
        apVar.getClass();
        C118843f fVar = (C118843f) coVar2.f288572l.mo17428b();
        C118843f fVar2 = fVar;
        fVar.getClass();
        Query query2 = query;
        C68214a a4 = C68219e.m98518a(((C68226l) coVar2.f288573m).f184585a);
        C68214a aVar6 = a4;
        a4.getClass();
        C68214a a5 = C68219e.m98518a(((C68226l) coVar2.f288574n).f184585a);
        a5.getClass();
        C68214a a6 = C68219e.m98518a(((C68226l) coVar2.f288575o).f184585a);
        a6.getClass();
        C103578cn cnVar = new C103578cn(query2, cVar, clientConfig, aVar, aVar2, gVar2, gVar4, context2, aVar3, aVar4, aVar5, tVar2, vVar2, apVar2, fVar2, aVar6, a5, a6);
        C59104x b = C103578cn.f288543a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NgaVoiceController");
        ((C59052c) ((C59052c) b).mo56372aa(21579)).mo56386p("#start");
        C103578cn cnVar2 = cnVar;
        cnVar2.f288551i.mo28212l("[NGA] Connectivity context update", new C103568cd(cnVar2));
        new C90873ag(cnVar2.f288549g.mo93818b(), cnVar2.f288551i, "[NGA] OCF: graph done", new C103569ce(cnVar2)).mo85223a(new C103570cf(cnVar2));
        new C90873ag(cnVar2.f288549g.mo93819c(), cnVar2.f288551i, "[NGA] OCF: graph @NetworkFetch done", new C103571cg(cnVar2)).mo85223a(new C103572ch(cnVar2));
        new C90873ag(cnVar2.f288549g.n.mo60297gq(), cnVar2.f288551i, "[NGA] OCF: abandon audio focus", new C103573ci(cnVar2)).mo85223a(C103574cj.f288539a);
        return C60856cj.m92900i(cnVar2);
    }

    /* renamed from: c */
    public final C60870cx mo78554c() {
        this.f287586i.f288119a.mo93770d(new C103333an(new C80994n(this.f287580a, this.f287585h)));
        return C118826c.f331423b;
    }

    /* renamed from: d */
    public final C60870cx mo78555d(String str, int i) {
        C132095i iVar = this.f287582c;
        Uri parse = Uri.parse(str);
        C132105s sVar = (C132105s) iVar;
        C132097k kVar = new C132097k(sVar, parse);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(kVar), sVar.f360498d);
        C132098l lVar = new C132098l(sVar, parse, i);
        return C60922j.m93045h(m, C47810es.m84966f(lVar), sVar.f360498d);
    }

    /* renamed from: e */
    public final C60870cx mo78556e(C65753ak akVar, C65768az azVar, boolean z) {
        String F = this.f287589l.mo79659F();
        if (F == null) {
            return C60856cj.m92899h(new Exception("User not signed in."));
        }
        return this.f287581b.mo28209i(this.f287591n.d(F, akVar, azVar, z), "[NGA] NgaWorker.writeToGeller", C102890a.f287345a);
    }

    /* renamed from: f */
    public final void mo78557f(C80112b bVar, C58485gu guVar) {
        this.f287590m.f289707a = guVar;
        FeedbackEmptyActivity.m172100b(this.f287580a);
        C103456a aVar = this.f287588k;
        if (aVar.f288322a.mo79746e(C90126fx.f251042bO) && aVar.f288322a.mo79746e(C90126fx.f251497jt)) {
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328824d = 2;
            agVar.f328821a |= 4;
            this.f287587j.mo103751b(C118522by.UPLOAD_SODA_AUDIO_LOGS, (C118472ag) afVar.build());
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
