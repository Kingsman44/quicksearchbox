package com.google.android.apps.gsa.nga.engine.p6096p;

import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.nga.engine.c.a;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.engine.p6243v.C79360j;
import com.google.android.apps.gsa.nga.shared.p6363s.C81457f;
import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.MessageLite;
import com.google.protos.p4887at.p4891c.C63820b;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.p.x */
/* compiled from: PG */
public final class C77467x extends C79360j {

    /* renamed from: a */
    public static final C58974d f213494a = C58974d.m91136j();

    /* renamed from: b */
    public final i f213495b;

    /* renamed from: c */
    public final Set f213496c;

    /* renamed from: d */
    public final C76092h f213497d;

    /* renamed from: e */
    public final C81457f f213498e;

    /* renamed from: f */
    public final C81457f f213499f;

    /* renamed from: g */
    public final C81457f f213500g;

    /* renamed from: h */
    public final C81459h f213501h;

    /* renamed from: i */
    public final Optional f213502i;

    /* renamed from: j */
    private final a f213503j;

    /* renamed from: k */
    private final C22871g f213504k;

    /* renamed from: l */
    private final C60836bq f213505l = new C60836bq();

    /* renamed from: m */
    private final C81459h f213506m;

    /* renamed from: n */
    private final C81459h f213507n;

    /* renamed from: o */
    private final AtomicReference f213508o = new AtomicReference(Optional.empty());

    public C77467x(a aVar, C90821bm bmVar, i iVar, Set set, C81465n nVar, C81465n nVar2, C81465n nVar3, C81465n nVar4, C81465n nVar5, Optional optional, C76092h hVar, C79359i iVar2) {
        super(iVar2, hVar);
        this.f213503j = aVar;
        C22871g a = bmVar.mo85163a(C77466w.class);
        this.f213504k = a;
        this.f213495b = iVar;
        this.f213496c = set;
        this.f213506m = nVar.mo75095b(a, C77448e.f213471a);
        this.f213507n = nVar.mo75095b(a, C77449f.f213472a);
        this.f213498e = nVar2.mo75094a(a, C77450g.f213473a);
        this.f213499f = nVar3.mo75094a(a, C77451h.f213474a);
        this.f213502i = optional;
        this.f213500g = nVar4.mo75094a(a, C77452i.f213475a);
        this.f213501h = nVar5.mo75095b(a, C77453j.f213476a);
        this.f213497d = hVar;
    }

    /* renamed from: k */
    private final C60870cx m124261k(C65753ak akVar, MessageLite messageLite) {
        return this.f213505l.mo57305b(new C77456m(this, akVar, messageLite), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo72578b() {
        C60870cx k = m124261k(C65753ak.JINN_ALL_DJ, C63820b.f172597b);
        C22871g gVar = this.f213504k;
        C81459h hVar = this.f213507n;
        Objects.requireNonNull(hVar);
        new C90873ag(k, gVar, "[NGA] GellerContentUpdateListener.onAllDjChanged", new C77460q(hVar)).mo85223a(C77461r.f213487a);
        return C118826c.m197213c(k);
    }

    /* renamed from: d */
    public final C60870cx mo72579d() {
        C60870cx k = m124261k(C65753ak.APP_ACTIONS, C49301bt.f127423f);
        C22871g gVar = this.f213504k;
        a aVar = this.f213503j;
        Objects.requireNonNull(aVar);
        new C90873ag(k, gVar, "[NGA] GellerContentUpdateListener.onAppActionsDataChanged", new C77458o(aVar)).mo85223a(C77459p.f213485a);
        return C118826c.m197213c(k);
    }

    /* renamed from: e */
    public final C60870cx mo72580e() {
        C60870cx b = this.f213505l.mo57305b(new C77455l(this, C65753ak.ASSISTANT_HISTORY), C60826bg.f164896a);
        new C90873ag(b, this.f213504k, "[NGA] GellerContentUpdateListener.onAssistantHistoryChanged", new C77463t(this)).mo85223a(C77464u.f213492a);
        return C118826c.m197213c(b);
    }

    /* renamed from: g */
    public final C60870cx mo72581g(boolean z) {
        Optional d = this.f213497d.mo72021b().mo72038d();
        if (!d.isEmpty()) {
            return this.f213504k.mo28201a("[NGA] GellerContentUpdateListener.onPkgEntitiesChanged", new C77462s(this, d, z));
        }
        ((C58970a) ((C58970a) f213494a.mo56225c()).mo56372aa(3884)).mo56386p("AccountManager returned no userId, cannot load PKG Slice.");
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: gD */
    public final boolean mo71822gD() {
        return !((Optional) this.f213508o.get()).equals(this.f213497d.mo72021b().mo72038d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        this.f213508o.set(this.f213497d.mo72021b().mo72038d());
        C81457f fVar = this.f213498e;
        fVar.mo75091b(fVar.f222871a);
        C81457f fVar2 = this.f213499f;
        fVar2.mo75091b(fVar2.f222871a);
        C81457f fVar3 = this.f213500g;
        fVar3.mo75091b(fVar3.f222871a);
        return C118826c.m197213c(C60856cj.m92897f(mo72582j(), mo72578b(), mo72579d(), mo72581g(false), mo72580e()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        return C118826c.f331423b;
    }

    /* renamed from: j */
    public final C60870cx mo72582j() {
        C60870cx k = m124261k(C65753ak.JINN_STARLIGHT, C63820b.f172597b);
        C22871g gVar = this.f213504k;
        C81459h hVar = this.f213506m;
        Objects.requireNonNull(hVar);
        new C90873ag(k, gVar, "[NGA] GellerContentUpdateListener.onStarlightChanged", new C77460q(hVar)).mo85223a(C77465v.f213493a);
        return C118826c.m197213c(k);
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "GellerContentUpdateListener";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 21;
    }
}
