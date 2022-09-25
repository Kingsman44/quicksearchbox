package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.ci */
/* compiled from: PG */
final class C112518ci {

    /* renamed from: a */
    final C48634bw f312061a;

    /* renamed from: b */
    final C112473ar f312062b;

    /* renamed from: c */
    C48635bx f312063c = C48635bx.f125704d;

    /* renamed from: d */
    C60870cx f312064d = null;

    /* renamed from: e */
    long f312065e;

    /* renamed from: f */
    boolean f312066f = false;

    /* renamed from: g */
    final /* synthetic */ C112519cj f312067g;

    public C112518ci(C112519cj cjVar, C48634bw bwVar, C112473ar arVar) {
        this.f312067g = cjVar;
        this.f312061a = bwVar;
        this.f312062b = arVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo99559a() {
        C121537f fVar = C112519cj.f312068a;
        String name = this.f312061a.name();
        fVar.mo105241j("cancelFetch_".concat(String.valueOf(name)), new C112514ce(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo99560b(C48635bx bxVar) {
        long b = this.f312067g.f312076i.mo26870b() - this.f312065e;
        this.f312063c = bxVar;
        this.f312064d = null;
        this.f312065e = 0;
        this.f312066f = false;
        String F = this.f312067g.f312081n.mo79659F();
        if (F == null) {
            this.f312067g.f312085r = Optional.empty();
        } else {
            this.f312067g.f312085r = Optional.m71637of(F);
        }
        C90875ai.m148465b(new C112516cg(), this.f312067g.f312077j.mo28207g("logEvent", new C112515cf(this, b)), this.f312067g.f312077j, "report logEvent success").mo85223a(new C112517ch(this));
        C58976aa aaVar = C58975e.f156826a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo99561c() {
        C60870cx cxVar = this.f312064d;
        return cxVar != null && !cxVar.isDone();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo99562d(long j) {
        long j2 = this.f312063c.f125708c;
        return j2 == 0 || j - j2 > this.f312062b.mo99046m();
    }
}
