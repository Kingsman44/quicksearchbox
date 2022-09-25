package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.binaries.satin.app.aol;
import com.google.android.apps.gsa.nga.api.a.ag;
import com.google.android.apps.gsa.nga.api.a.ai;
import com.google.android.apps.gsa.nga.api.a.aj;
import com.google.android.apps.gsa.nga.api.a.at;
import com.google.android.apps.gsa.nga.api.a.bj;
import com.google.android.apps.gsa.nga.api.a.cn;
import com.google.android.apps.gsa.nga.api.a.co;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119299u;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125034a;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125106cg;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125112cm;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125120cu;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125042h;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125931t;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126029e;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126035k;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9464a.C125971a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9466b.C125988a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9466b.C125989b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9466b.C125994g;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126174c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126292aa;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126288a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.cs */
/* compiled from: PG */
public final class C126081cs implements C126057bv {

    /* renamed from: a */
    public static final C59071e f347463a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.n.cs");

    /* renamed from: b */
    public static final Duration f347464b = Duration.ofMillis(200);

    /* renamed from: c */
    public static final Duration f347465c = Duration.ofMillis(200);

    /* renamed from: d */
    public static final Duration f347466d = Duration.ofMillis(500);

    /* renamed from: e */
    public final C126150n f347467e;

    /* renamed from: f */
    public final boolean f347468f;

    /* renamed from: g */
    public final C126106dq f347469g;

    /* renamed from: h */
    public final C126038bc f347470h;

    /* renamed from: i */
    public final C125969b f347471i;

    /* renamed from: j */
    public final C126054bs f347472j;

    /* renamed from: k */
    public final Executor f347473k;

    /* renamed from: l */
    public final C126114dy f347474l;

    /* renamed from: m */
    public final C125971a f347475m;

    /* renamed from: n */
    public final C126174c f347476n;

    /* renamed from: o */
    public final Duration f347477o;

    /* renamed from: p */
    public final Duration f347478p;

    /* renamed from: q */
    public final Duration f347479q;

    public C126081cs(Executor executor, boolean z, C62910ar arVar, long j, long j2, C126106dq dqVar, C126054bs bsVar, C125969b bVar, C126038bc bcVar, C126150n nVar, C126114dy dyVar, C125971a aVar, C126174c cVar) {
        this.f347468f = z;
        this.f347477o = C62950b.m95473d(arVar);
        this.f347478p = Duration.ofMillis(j);
        this.f347479q = Duration.ofMillis(j2);
        this.f347469g = dqVar;
        this.f347472j = bsVar;
        this.f347471i = bVar;
        this.f347470h = bcVar;
        this.f347467e = nVar;
        this.f347474l = dyVar;
        this.f347475m = aVar;
        this.f347476n = cVar;
        this.f347473k = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo107277a(C63124b bVar) {
        C126160x xVar = (C126160x) this.f347470h.f347376v.get(bVar);
        if (xVar != null) {
            return xVar.mo107388f(C126153q.f347622a);
        }
        C59104x d = C126038bc.f347355a.mo56226d();
        C69664n.m101061g(bVar, "<this>");
        ((C59052c) ((C59052c) d).mo56372aa(36801)).mo56389s("No tracker found for feature: %s [SD]", C126290c.m206497b(Integer.valueOf(bVar.getNumber())));
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final void mo107278b(at atVar) {
        this.f347473k.execute(C47810es.m84977q(new C126070ch(this, atVar)));
    }

    /* renamed from: c */
    public final void mo107279c() {
        this.f347473k.execute(C47810es.m84977q(new C126071ci(this)));
    }

    /* renamed from: d */
    public final void mo107280d(C63122a aVar) {
        ((C59052c) ((C59052c) f347463a.mo56224b()).mo56372aa(36819)).mo56389s("#onDictationEnded scheduled: %s [SD]", C126288a.m206493e(aVar));
        this.f347473k.execute(C47810es.m84977q(new C126058bw(this, aVar)));
    }

    /* renamed from: e */
    public final void mo107281e(C126292aa aaVar) {
        ((C59052c) ((C59052c) f347463a.mo56224b()).mo56372aa(36820)).mo56389s("#onDictationStarted scheduled: %s [SD]", aaVar);
        this.f347473k.execute(C47810es.m84977q(new C126079cq(this, aaVar)));
    }

    /* renamed from: f */
    public final void mo107282f(C60870cx cxVar) {
        C126106dq dqVar = this.f347469g;
        C69664n.m101061g(cxVar, "newDirectActions");
        dqVar.mo107340e(new C126096dg(cxVar));
    }

    /* renamed from: g */
    public final void mo107283g(C125112cm cmVar) {
        this.f347473k.execute(C47810es.m84977q(new C126080cr(this, cmVar)));
    }

    /* renamed from: h */
    public final void mo107284h() {
        ((C59052c) ((C59052c) f347463a.mo56224b()).mo56372aa(36821)).mo56386p("#onKeyboardShown scheduled [SD]");
        this.f347473k.execute(C47810es.m84977q(new C126073ck(this)));
    }

    /* renamed from: i */
    public final void mo107285i() {
        ((C59052c) ((C59052c) f347463a.mo56224b()).mo56372aa(36822)).mo56386p("#onKeyboardShownAgain scheduled [SD]");
        this.f347473k.execute(C47810es.m84977q(new C126069cg(this)));
    }

    /* renamed from: j */
    public final void mo107286j(C58485gu guVar) {
        C126106dq dqVar = this.f347469g;
        C69664n.m101061g(guVar, "suggestions");
        dqVar.mo107340e(new C126099dj(guVar));
    }

    /* renamed from: k */
    public final void mo107287k(C125106cg cgVar) {
        C46459k.m82829b(this.f347470h.mo107263a(cgVar), "Tip event handling failed [SD]", new Object[0]);
    }

    /* renamed from: l */
    public final void mo107288l(bj bjVar, at atVar, C126056bu buVar) {
        this.f347473k.execute(C47810es.m84977q(new C126078cp(this, bjVar, atVar, buVar)));
    }

    /* renamed from: m */
    public final void mo107289m() {
        mo107316v();
        C46459k.m82829b(this.f347470h.mo107263a(C125106cg.OVERLAY_LEARNING_CENTER_TIP_DISMISSED_EXPLICIT), "Dismissing learning center tip failed [SD]", new Object[0]);
        C126114dy dyVar = this.f347474l;
        C126054bs bsVar = this.f347472j;
        C125931t a = bsVar.f347410b.mo107202a();
        aol aol = bsVar.f347412d;
        C126112dw dwVar = new C126112dw(bsVar.f347409a.mo107211a(a.mo107188g()), a);
        ag createBuilder = aj.c.createBuilder();
        C125120cu a2 = dwVar.mo107355a(dwVar.f347539a);
        createBuilder.copyOnWrite();
        aj ajVar = createBuilder.instance;
        a2.getClass();
        ajVar.b = a2;
        ajVar.a = 8;
        dyVar.mo107365i(createBuilder.build());
    }

    /* renamed from: n */
    public final void mo107290n(List list, C125034a aVar) {
        this.f347473k.execute(C47810es.m84977q(new C126060by(this, list, aVar)));
    }

    /* renamed from: o */
    public final void mo107291o(List list, C125034a aVar) {
        this.f347473k.execute(C47810es.m84977q(new C126074cl(this, list, aVar)));
    }

    /* renamed from: p */
    public final void mo107292p(C126292aa aaVar) {
        ((C59052c) ((C59052c) f347463a.mo56224b()).mo56372aa(36826)).mo56389s("#onStickyChanged scheduled: %s [SD]", aaVar);
        this.f347473k.execute(C47810es.m84977q(new C126077co(this, aaVar)));
    }

    /* renamed from: q */
    public final void mo107293q(C125042h hVar) {
        this.f347473k.execute(C47810es.m84977q(new C126076cn(this, hVar)));
    }

    /* renamed from: r */
    public final void mo107294r(C125065at atVar, boolean z) {
        this.f347473k.execute(C47810es.m84977q(new C126075cm(this, atVar, z)));
    }

    /* renamed from: s */
    public final void mo107295s() {
        C126114dy dyVar = this.f347474l;
        C126054bs bsVar = this.f347472j;
        ag createBuilder = aj.c.createBuilder();
        cn createBuilder2 = co.b.createBuilder();
        String g = bsVar.mo107273g(R.string.assistant_keyboard_voice_command_not_supported, new Object[0]);
        createBuilder2.copyOnWrite();
        g.getClass();
        createBuilder2.instance.a = g;
        createBuilder.copyOnWrite();
        aj ajVar = createBuilder.instance;
        co build = createBuilder2.build();
        build.getClass();
        ajVar.b = build;
        ajVar.a = 7;
        dyVar.mo107365i(createBuilder.build());
    }

    /* renamed from: t */
    public final void mo107314t() {
        C125065at a = this.f347469g.mo107336a();
        C125065at a2 = C126111dv.m206214a(a);
        String d = C126111dv.m206217d(a, a2);
        boolean z = false;
        if (this.f347469g.mo107337b().f347482c && C126111dv.f347536a.matcher(d).matches()) {
            z = true;
        }
        C126106dq dqVar = this.f347469g;
        dqVar.mo107339d(z, dqVar.mo107337b().f347482c, this.f347469g.mo107337b().f347483d, a2);
        this.f347474l.mo107357a();
    }

    /* renamed from: u */
    public final void mo107315u() {
        this.f347474l.mo107360d(new C126064cb(this), this.f347477o, new C126065cc(this));
    }

    /* renamed from: v */
    public final void mo107316v() {
        C126114dy dyVar = this.f347474l;
        ag createBuilder = aj.c.createBuilder();
        ai aiVar = ai.a;
        createBuilder.copyOnWrite();
        aj ajVar = createBuilder.instance;
        aiVar.getClass();
        ajVar.b = aiVar;
        ajVar.a = 11;
        dyVar.mo107365i(createBuilder.build());
    }

    /* renamed from: w */
    public final void mo107317w() {
        C126114dy dyVar = this.f347474l;
        C126150n nVar = this.f347467e;
        C126087cy c = this.f347469g.mo107338c();
        C119299u a = c.mo107326a();
        C125994g gVar = nVar.f347616f;
        C126035k a2 = nVar.f347611a.mo107356a(c, C52829f.f138611c);
        C125989b bVar = new C125989b(gVar, a2);
        dyVar.mo107364h(nVar.mo107382c(a, C60922j.m93044g((C60870cx) gVar.f347243a.mo107241a(((C126029e) a2).f347340a).map(new C125988a(a2)).orElse(C60856cj.m92900i(C58485gu.m89845m())), C47810es.m84963c(bVar), C60826bg.f164896a)));
    }

    /* renamed from: x */
    public final void mo107318x() {
        this.f347474l.mo107364h(this.f347467e.mo107381b(this.f347469g.mo107338c()));
    }

    /* renamed from: y */
    public final void mo107319y() {
        C126114dy dyVar = this.f347474l;
        C126150n nVar = this.f347467e;
        C126087cy c = this.f347469g.mo107338c();
        C60870cx a = nVar.mo107380a(c);
        C126089d dVar = new C126089d(nVar, c);
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(dVar), C60826bg.f164896a);
        C126116e eVar = new C126116e(nVar, c);
        dyVar.mo107364h(C60922j.m93044g(h, C47810es.m84963c(eVar), nVar.f347615e));
    }
}
