package com.google.android.apps.gsa.nga.engine.p6097q;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.am.p.d;
import com.google.android.apps.gsa.nga.engine.am.y.c;
import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.p5913am.p5941w.C74970a;
import com.google.android.apps.gsa.nga.engine.p5913am.p5941w.p5942a.C74975e;
import com.google.android.apps.gsa.nga.engine.p5964av.C75076bk;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75078bp;
import com.google.android.apps.gsa.nga.engine.p5964av.C75157e;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6038j.C76164aa;
import com.google.android.apps.gsa.nga.engine.p6243v.C79356f;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.engine.recognition.p6110c.C77587f;
import com.google.android.apps.gsa.nga.engine.recognition.p6110c.C77595n;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.nga.engine.q.a */
/* compiled from: PG */
public final class C77470a extends C79356f implements C75157e, C74970a {

    /* renamed from: d */
    private static final C58974d f213510d = C58974d.m91136j();

    /* renamed from: a */
    public final C77595n f213511a;

    /* renamed from: b */
    public final C76164aa f213512b;

    /* renamed from: c */
    public final AtomicBoolean f213513c = new AtomicBoolean(false);

    /* renamed from: e */
    private final d f213514e;

    /* renamed from: f */
    private final C91142g f213515f;

    /* renamed from: g */
    private final C76092h f213516g;

    /* renamed from: h */
    private final C74975e f213517h;

    public C77470a(d dVar, C91142g gVar, C74975e eVar, C76092h hVar, C79359i iVar, C77595n nVar, C76164aa aaVar) {
        super(iVar);
        this.f213514e = dVar;
        this.f213515f = gVar;
        this.f213517h = eVar;
        this.f213516g = hVar;
        this.f213511a = nVar;
        this.f213512b = aaVar;
    }

    /* renamed from: a */
    public final void mo71137a(C75077bo boVar, C75077bo boVar2) {
        if (this.f213515f.mo85405j(C90126fx.f251005ae)) {
            c a = boVar.mo71457a();
            if (((C75076bk) a.b.b(C75078bp.f209366e)) == null && ((!boVar.mo71467m().isPresent() || !((e) boVar.mo71467m().get()).equals(e.f)) && !this.f213516g.mo72021b().mo72042g())) {
                this.f213513c.set(true);
                this.f213512b.mo71137a(boVar, boVar2);
                return;
            }
        }
        this.f213513c.set(false);
        this.f213511a.mo71137a(boVar, boVar2);
    }

    /* renamed from: b */
    public final void mo71138b(bl blVar) {
        if (blVar == bl.a) {
            ((C58970a) ((C58970a) f213510d.mo56224b()).mo56372aa(3908)).mo56386p("NGA starts FULL_LISTENING");
        }
    }

    /* renamed from: d */
    public final void mo71356d() {
        if (!this.f213513c.get()) {
            C77595n nVar = this.f213511a;
            if (nVar.f213778h.get()) {
                nVar.f213774d.mo28212l("[NGA] NgaHandler.onSearchProcessAlive", new C77587f(nVar));
            }
            nVar.f213778h.set(false);
        }
    }

    /* renamed from: e */
    public final void mo71357e() {
        if (!this.f213513c.get()) {
            this.f213511a.f213778h.set(false);
        }
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        return this.f213516g.mo72021b().mo72041f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        this.f213514e.f();
        this.f213517h.mo71358a(this);
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        this.f213517h.mo71359b(this);
        return C118826c.f331423b;
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "NgaHandlerSwitcher";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 23;
    }
}
