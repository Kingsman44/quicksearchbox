package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.research.p5181a.p5187e.C66355e;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ag */
/* compiled from: PG */
public final class C112312ag {

    /* renamed from: a */
    public static final C121537f f311669a = C121537f.m200840b("Tapas/OnlineModel", C121511c.f337208a);

    /* renamed from: b */
    public static final C59071e f311670b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ag");

    /* renamed from: c */
    public final C112368ci f311671c;

    /* renamed from: d */
    public final C112367ch f311672d;

    /* renamed from: e */
    public final C22871g f311673e;

    /* renamed from: f */
    public final C22871g f311674f;

    /* renamed from: g */
    public final C86124t f311675g;

    /* renamed from: h */
    public final C112331az f311676h;

    /* renamed from: i */
    public final C21370a f311677i;

    /* renamed from: j */
    public final Optional f311678j;

    /* renamed from: k */
    public final C86054o f311679k;

    /* renamed from: l */
    public final C113425ff f311680l;

    /* renamed from: m */
    C66355e f311681m;

    /* renamed from: n */
    public Optional f311682n;

    /* renamed from: o */
    C60870cx f311683o;

    /* renamed from: p */
    public C58485gu f311684p = C58485gu.m89845m();

    /* renamed from: q */
    public final C111248k f311685q;

    public C112312ag(C112368ci ciVar, C112367ch chVar, C66355e eVar, C22871g gVar, C22871g gVar2, C86124t tVar, C112331az azVar, C21370a aVar, Optional optional, C113425ff ffVar, C112344bl blVar, C86054o oVar, C111248k kVar) {
        this.f311671c = ciVar;
        this.f311672d = chVar;
        this.f311682n = Optional.empty();
        this.f311681m = eVar;
        this.f311673e = gVar;
        this.f311674f = gVar2;
        this.f311675g = tVar;
        this.f311676h = azVar;
        this.f311677i = aVar;
        this.f311678j = optional;
        this.f311683o = new SettableFuture();
        this.f311680l = ffVar;
        this.f311679k = oVar;
        this.f311685q = kVar;
        mo99495d(blVar);
    }

    /* renamed from: a */
    public static C58485gu m186172a(C112341bi biVar) {
        return (C58485gu) Collection.EL.stream(biVar.f180453g).map(C112387u.f311822a).collect(C58370cn.f155946a);
    }

    /* renamed from: b */
    public final C60870cx mo99493b() {
        C121537f fVar = f311669a;
        C60870cx i = this.f311674f.mo28209i(this.f311680l.mo100136b(), "userDataControlsStatus.isPersonalResponseAllowed()", new C112384r(this));
        fVar.mo105244m("isPersonalDataAllowed", i);
        return i;
    }

    /* renamed from: c */
    public final C60870cx mo99494c(C113405ep epVar) {
        return this.f311673e.mo28209i(mo99493b(), "isPersonalDataAllowed()", new C112381o(this, epVar));
    }

    /* renamed from: d */
    public final void mo99495d(C112344bl blVar) {
        this.f311682n = Optional.empty();
        this.f311681m.f180433a.mo59450c();
        new C90873ag(mo99493b(), this.f311673e, "Getting APR and WAA bits", new C112374h(this, blVar)).mo85223a(C112375i.f311805a);
    }

    /* renamed from: e */
    public final void mo99496e(C112344bl blVar) {
        C112341bi a = blVar.mo99509a(C58485gu.m89845m(), this.f311674f);
        a.mo59600e(this.f311681m);
        this.f311682n = Optional.m71637of(a);
        this.f311684p = m186172a(a);
    }

    /* renamed from: f */
    public final void mo99497f(Instant instant) {
        if (this.f311675g.mo79746e(C90014bt.f247740mp)) {
            try {
                this.f311673e.mo28212l("OnlineModel#retrainOnEventsAfterTimestamp", new C112391y(this, instant));
                C58976aa aaVar = C58975e.f156826a;
            } catch (Exception e) {
                C59104x d = f311670b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ReflectionOnline");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(27687)).mo56386p("Reflection retrain failed.");
            }
        }
    }
}
