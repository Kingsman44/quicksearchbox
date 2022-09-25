package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.ae.a.aa;
import com.google.android.apps.gsa.nga.engine.ae.c;
import com.google.android.apps.gsa.nga.engine.annotators.ak;
import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.p5897ae.C74801q;
import com.google.android.apps.gsa.nga.engine.p5949ap.C75020d;
import com.google.android.apps.gsa.nga.engine.p6137s.C77895a;
import com.google.android.apps.gsa.nga.engine.p6137s.C77906d;
import com.google.android.apps.gsa.nga.engine.p6137s.C77907e;
import com.google.android.apps.gsa.nga.engine.p6137s.C77908f;
import com.google.android.apps.gsa.nga.engine.understanding.p6236c.C79028k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80578l;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80586t;
import com.google.android.apps.gsa.nga.shared.p6335c.C81018a;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82875dr;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82876ds;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.conversation.p1855h.C22719w;
import com.google.assistant.p3897e.p3917i.p3918a.C51515ko;
import com.google.assistant.p3897e.p3917i.p3918a.C51569mo;
import com.google.assistant.p3897e.p3917i.p3918a.C51570mp;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.p */
/* compiled from: PG */
public final class C76390p implements c {

    /* renamed from: a */
    public static final C58974d f211523a = C58974d.m91134h("CloudHandoverParams");

    /* renamed from: b */
    public final C77908f f211524b;

    /* renamed from: c */
    public final ak f211525c;

    /* renamed from: d */
    public final aa f211526d;

    /* renamed from: e */
    private final C91142g f211527e;

    /* renamed from: f */
    private final C83334w f211528f;

    /* renamed from: g */
    private final com.google.android.apps.gsa.nga.engine.ag.c f211529g;

    /* renamed from: h */
    private final C60950i f211530h;

    /* renamed from: i */
    private final C75020d f211531i;

    /* renamed from: j */
    private final C77907e f211532j;

    public C76390p(C91142g gVar, C77908f fVar, ak akVar, C83334w wVar, com.google.android.apps.gsa.nga.engine.ag.c cVar, C60950i iVar, aa aaVar, C75020d dVar, C77907e eVar) {
        this.f211527e = gVar;
        this.f211524b = fVar;
        this.f211525c = akVar;
        this.f211528f = wVar;
        this.f211529g = cVar;
        this.f211530h = iVar;
        this.f211526d = aaVar;
        this.f211531i = dVar;
        this.f211532j = eVar;
    }

    /* renamed from: a */
    public final Optional mo72183a(String str, ac acVar) {
        C80581o oVar;
        Optional optional;
        C22719w wVar = new C22719w();
        Optional b = this.f211532j.mo72874b();
        if (b.isPresent()) {
            C77906d dVar = (C77906d) b.get();
            int b2 = dVar.mo72889b();
            if (b2 == 0) {
                throw null;
            } else if (b2 == 2) {
                wVar.mo27876c(dVar.mo72888a());
            }
        }
        if (this.f211527e.mo85405j(C90126fx.f251218ef)) {
            C83320io b3 = acVar.b();
            Optional empty = Optional.empty();
            if (this.f211527e.mo85405j(C90126fx.f251314gV)) {
                empty = this.f211529g.d();
            }
            wVar.mo27878e(C79028k.m126975d(this.f211524b, str, b3, this.f211530h, empty));
        }
        if (this.f211527e.mo85405j(C90126fx.f251416iR)) {
            C75020d dVar2 = this.f211531i;
            synchronized (dVar2.f209258a) {
                oVar = (C80581o) dVar2.f209259b.get(acVar);
                dVar2.f209259b.size();
            }
            C58976aa aaVar = C58975e.f156826a;
            if (oVar != null) {
                C80586t tVar = oVar.f221192b;
                if (tVar == null) {
                    tVar = C80586t.f221205g;
                }
                String str2 = tVar.f221208b;
            }
            Optional ofNullable = Optional.ofNullable(oVar);
            if (ofNullable.isEmpty()) {
                optional = Optional.empty();
            } else {
                C80578l lVar = ((C80581o) ofNullable.get()).f221193c;
                if (lVar == null) {
                    lVar = C80578l.f221173g;
                }
                C51569mo moVar = (C51569mo) C51570mp.f134408e.createBuilder();
                C63088z zVar = lVar.f221178d;
                moVar.copyOnWrite();
                C51570mp mpVar = (C51570mp) moVar.instance;
                zVar.getClass();
                mpVar.f134410a = 2 | mpVar.f134410a;
                mpVar.f134412c = zVar;
                C63088z zVar2 = lVar.f221179e;
                moVar.copyOnWrite();
                C51570mp mpVar2 = (C51570mp) moVar.instance;
                zVar2.getClass();
                mpVar2.f134410a |= 1;
                mpVar2.f134411b = zVar2;
                boolean z = lVar.f221180f;
                moVar.copyOnWrite();
                C51570mp mpVar3 = (C51570mp) moVar.instance;
                mpVar3.f134410a |= 4;
                mpVar3.f134413d = z;
                C51570mp mpVar4 = (C51570mp) moVar.build();
                C63088z zVar3 = mpVar4.f134412c;
                C63088z zVar4 = mpVar4.f134411b;
                boolean z2 = mpVar4.f134413d;
                optional = Optional.m71637of(mpVar4);
            }
            if (optional.isPresent()) {
                wVar.mo27878e((MessageLite) optional.get());
            }
        }
        C52091ex a = wVar.mo27874a();
        if (a.f136712a.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of(a);
    }

    /* renamed from: b */
    public final void mo72184b(C52091ex exVar, Optional optional) {
        Optional optional2;
        this.f211524b.mo72880e(exVar);
        C81018a.f222066e.mo74802b(exVar).ifPresent(new C76383i(this));
        C82875dr drVar = (C82875dr) C82876ds.f225961e.createBuilder();
        optional.ifPresent(new C76370b(drVar));
        C81018a.f222069h.mo74802b(exVar).ifPresent(new C76380f(drVar));
        C81018a.f222070i.mo74802b(exVar).ifPresent(new C76381g(drVar));
        int i = ((C82876ds) drVar.instance).f225963a;
        if (!((i & 4) == 0 && (i & 2) == 0)) {
            C83334w wVar = this.f211528f;
            C82887ec ecVar = C82887ec.LOGGING_PARAMS_UPDATE;
            C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
            dzVar.copyOnWrite();
            C82885ea eaVar = (C82885ea) dzVar.instance;
            C82876ds dsVar = (C82876ds) drVar.build();
            dsVar.getClass();
            eaVar.f225980b = dsVar;
            eaVar.f225979a = 36;
            wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), (C83320io) optional.map(C76382h.f211515a).orElse(C83320io.f227132d));
        }
        C77907e eVar = this.f211532j;
        C77895a aVar = new C77895a();
        aVar.mo72872b(exVar);
        aVar.f214599a = 1;
        eVar.mo72875g(aVar.mo72871a());
        Optional b = C81018a.f222070i.mo74802b(exVar);
        Optional e = C79028k.m126976e(exVar);
        if (((Boolean) b.map(C76387m.f211520a).orElse(false)).booleanValue() || ((Boolean) e.map(C76388n.f211521a).orElse(false)).booleanValue()) {
            optional.map(C76377c.f211509a).orElse(BuildConfig.FLAVOR);
            this.f211524b.mo72882g();
            return;
        }
        if (optional.isPresent()) {
            this.f211524b.mo72878c();
        }
        if (!e.isEmpty()) {
            C51515ko koVar = (C51515ko) e.get();
            if (!optional.isPresent() || ((C74801q) optional.get()).mo71191i().isEmpty()) {
                optional2 = Optional.empty();
            } else {
                optional2 = Optional.m71637of(((C74801q) optional.get()).mo71191i());
            }
            ak akVar = this.f211525c;
            Objects.requireNonNull(akVar);
            C60856cj.m92911t((C60870cx) C79028k.m126977f(koVar, optional2, new C76378d(akVar), new C76379e(this, optional)).apply(C80413ae.f220688p), new C76389o(this), C60826bg.f164896a);
            optional.map(C76377c.f211509a).orElse(BuildConfig.FLAVOR);
        }
    }
}
