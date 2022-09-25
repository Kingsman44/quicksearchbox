package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.apps.gsa.assistant.settings.features.p529a.C9780c;
import com.google.android.apps.gsa.assistant.shared.az;
import com.google.android.apps.gsa.assistant.shared.bd;
import com.google.android.apps.gsa.assistant.shared.c;
import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.nga.api.C74714bo;
import com.google.android.apps.gsa.nga.api.C74715bp;
import com.google.android.apps.gsa.nga.api.C74718bv;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81097b;
import com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81214fi;
import com.google.android.apps.gsa.nga.shared.p6407v.p6408a.C82210al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88079oj;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.shared.util.C90762bf;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.nga.p8047b.C103009e;
import com.google.android.apps.gsa.staticplugins.nga.p8068k.C103384h;
import com.google.android.apps.gsa.staticplugins.nga.p8087s.C103799g;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9058b.C120125a;
import com.google.android.libraries.assistant.auto.jumpboost.p701k.C11830a;
import com.google.android.libraries.assistant.p1467d.p1471b.C17823i;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.cq */
/* compiled from: PG */
public final class C102962cq implements C74720bx, C74715bp, C74713bn, C103384h, C90991b {

    /* renamed from: B */
    private static final C59071e f287482B = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nga.a.a.cq");

    /* renamed from: A */
    public C102961cp f287483A;

    /* renamed from: C */
    private final C58881cr f287484C;

    /* renamed from: D */
    private final C68214a f287485D;

    /* renamed from: E */
    private final C68214a f287486E;

    /* renamed from: F */
    private final C68214a f287487F;

    /* renamed from: G */
    private final C68214a f287488G;

    /* renamed from: H */
    private final C68214a f287489H;

    /* renamed from: I */
    private final C68214a f287490I;

    /* renamed from: J */
    private final C21370a f287491J;

    /* renamed from: K */
    private final C68214a f287492K;

    /* renamed from: L */
    private final boolean f287493L;

    /* renamed from: M */
    private final C68214a f287494M;

    /* renamed from: N */
    private final C82210al f287495N;

    /* renamed from: O */
    private final C68214a f287496O;

    /* renamed from: P */
    private final C68214a f287497P;

    /* renamed from: Q */
    private C102960co f287498Q;

    /* renamed from: R */
    private final AtomicBoolean f287499R = new AtomicBoolean(false);

    /* renamed from: S */
    private final C91022f f287500S;

    /* renamed from: a */
    public final Object f287501a = new Object();

    /* renamed from: b */
    public final C68214a f287502b;

    /* renamed from: c */
    public final C68214a f287503c;

    /* renamed from: d */
    public final C68214a f287504d;

    /* renamed from: e */
    public final C68214a f287505e;

    /* renamed from: f */
    public final C68214a f287506f;

    /* renamed from: g */
    public final C68214a f287507g;

    /* renamed from: h */
    public final C68214a f287508h;

    /* renamed from: i */
    public final C68214a f287509i;

    /* renamed from: j */
    public final Context f287510j;

    /* renamed from: k */
    public final List f287511k;

    /* renamed from: l */
    public final C68214a f287512l;

    /* renamed from: m */
    public final C68214a f287513m;

    /* renamed from: n */
    public final C68214a f287514n;

    /* renamed from: o */
    public final C68214a f287515o;

    /* renamed from: p */
    public C88079oj f287516p = null;

    /* renamed from: q */
    public boolean f287517q = false;

    /* renamed from: r */
    public boolean f287518r = false;

    /* renamed from: s */
    public boolean f287519s = false;

    /* renamed from: t */
    public String f287520t = null;

    /* renamed from: u */
    public c f287521u = null;

    /* renamed from: v */
    public C17823i f287522v = null;

    /* renamed from: w */
    public Boolean f287523w = null;

    /* renamed from: x */
    public Boolean f287524x = null;

    /* renamed from: y */
    BroadcastReceiver f287525y;

    /* renamed from: z */
    public boolean f287526z;

    public C102962cq(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12, Context context, C68214a aVar13, C68214a aVar14, C68214a aVar15, C68214a aVar16, C68214a aVar17, C21370a aVar18, C68214a aVar19, C91022f fVar, C68214a aVar20, C68214a aVar21, C82210al alVar, boolean z, C68214a aVar22, C68214a aVar23, C68214a aVar24) {
        C68214a aVar25 = aVar;
        this.f287484C = C58886cw.m90973a(new C102948cc(aVar));
        this.f287502b = aVar2;
        this.f287503c = aVar3;
        this.f287505e = aVar4;
        this.f287506f = aVar8;
        this.f287507g = aVar9;
        this.f287508h = aVar10;
        this.f287509i = aVar11;
        this.f287510j = context;
        this.f287487F = aVar12;
        this.f287489H = aVar14;
        this.f287490I = aVar15;
        this.f287512l = aVar17;
        this.f287491J = aVar18;
        this.f287492K = aVar19;
        this.f287513m = aVar20;
        this.f287514n = aVar21;
        this.f287493L = z;
        this.f287511k = new CopyOnWriteArrayList();
        this.f287504d = aVar5;
        this.f287485D = aVar6;
        this.f287486E = aVar7;
        this.f287488G = aVar13;
        this.f287494M = aVar16;
        this.f287500S = fVar;
        this.f287495N = alVar;
        this.f287496O = aVar22;
        this.f287515o = aVar23;
        this.f287497P = aVar24;
    }

    /* renamed from: m */
    private final void m170723m() {
        if (!this.f287499R.getAndSet(true)) {
            this.f287500S.mo85301a(this);
            this.f287495N.mo75553d(new C102952cg(this));
        }
    }

    /* renamed from: n */
    private final boolean m170724n() {
        C81214fi fiVar = (C81214fi) this.f287488G.mo27525b();
        if (!C81214fi.m129201a(((C103799g) this.f287487F.mo27525b()).mo93858a(), ((C90021c) this.f287504d.mo27525b()).mo79758x(C90126fx.f251641me)) || (!this.f287493L && !((Boolean) ((Optional) this.f287492K.mo27525b()).map(C102942bx.f287456a).orElse(false)).booleanValue())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo71076a() {
        if (!mo71089f().b()) {
            return false;
        }
        C81097b bVar = (C81097b) this.f287489H.mo27525b();
        int a = C81097b.m129038a(((C103799g) this.f287487F.mo27525b()).mo93858a(), ((C90021c) this.f287504d.mo27525b()).mo79746e(C90126fx.f251161db), ((C90021c) this.f287504d.mo27525b()).mo79758x(C90126fx.f251641me), ((C90021c) this.f287504d.mo27525b()).mo79758x(C90126fx.f250982aH), ((C90021c) this.f287504d.mo27525b()).mo79758x(C90126fx.f250980aF)) - 1;
        return a == 1 || a == 2;
    }

    /* renamed from: b */
    public final boolean mo71077b() {
        return mo71078c();
    }

    /* renamed from: c */
    public final boolean mo71078c() {
        return mo71089f().b() && m170724n();
    }

    /* renamed from: e */
    public final boolean mo71084e() {
        return mo71089f().a();
    }

    /* renamed from: f */
    public final NgaState mo71089f() {
        NgaState ngaState;
        synchronized (this.f287501a) {
            if (this.f287498Q == null) {
                C59052c cVar = (C59052c) f287482B.mo56226d();
                cVar.mo56380ai(C58979ad.MEDIUM);
                ((C59052c) cVar.mo56372aa(21374)).mo56386p("getNgaState called while state is null");
                C90762bf bfVar = new C90762bf(this.f287491J);
                mo93542k();
                ((C22871g) this.f287484C.mo6453a()).mo28212l("[NGA] NgaStateCheckerImpl.logFirstNgaStateTime", new C102947cb(this, bfVar.mo85102a()));
            }
            ngaState = ((C102979h) this.f287498Q).f287556a;
        }
        return ngaState;
    }

    /* renamed from: g */
    public final void mo71090g(C74718bv bvVar) {
        synchronized (this.f287501a) {
            this.f287511k.add(bvVar);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        NgaState f = mo71089f();
        fVar.mo85291r("NgaState");
        fVar.mo85278b("NGA state").mo85276a(C90752i.m148229c(f.toString()));
    }

    /* renamed from: h */
    public final void mo71091h(C74718bv bvVar) {
        synchronized (this.f287501a) {
            this.f287511k.remove(bvVar);
        }
    }

    /* renamed from: i */
    public final void mo93533i() {
        c cVar;
        String l = ((bd) this.f287490I.mo27525b()).l();
        if (((bd) this.f287490I.mo27525b()).s()) {
            cVar = c.b;
        } else {
            cVar = c.a;
        }
        synchronized (this.f287501a) {
            this.f287520t = l;
            this.f287521u = cVar;
        }
        mo93541j();
        if (((C90021c) this.f287504d.mo27525b()).mo79746e(C90126fx.f250997aW)) {
            ((C102977f) this.f287494M.mo27525b()).f287550b.addAccessibilityStateChangeListener(new C102933bo(this));
        }
        m170723m();
        if (((C90021c) this.f287504d.mo27525b()).mo79746e(C90126fx.f251080c)) {
            ((C9780c) this.f287496O.mo27525b()).mo18033a();
        }
        C102927bi biVar = (C102927bi) this.f287514n.mo27525b();
        biVar.f287422c.ifPresent(new C102925bg(biVar));
    }

    /* renamed from: j */
    public final void mo93541j() {
        ((C22871g) this.f287484C.mo6453a()).mo28212l("[NGA]NgaStateCheckerImpl.maybeRegisterLiveData", new C102934bp(this));
    }

    /* renamed from: k */
    public final void mo93542k() {
        C102960co coVar;
        C102979h hVar;
        m170723m();
        if (!((C74714bo) this.f287503c.mo27525b()).mo71081c()) {
            ((C59052c) ((C59052c) f287482B.mo56224b()).mo56372aa(21387)).mo56386p("NGA disabled due to not being eligible.");
            coVar = C102960co.m170720c(NgaState.c);
        } else if (((C74714bo) this.f287503c.mo27525b()).mo71082e()) {
            ((C59052c) ((C59052c) f287482B.mo56224b()).mo56372aa(21386)).mo56386p("NGA disabled due to forced update requirement.");
            coVar = C102960co.m170720c(NgaState.c);
        } else if (!((C103009e) this.f287485D.mo27525b()).f287598d.mo17534a()) {
            ((C59052c) ((C59052c) f287482B.mo56224b()).mo56372aa(21385)).mo56386p("NGA disabled since GSA isn't the default assistant.");
            coVar = C102960co.m170720c(NgaState.c);
        } else if (!((C90021c) this.f287504d.mo27525b()).mo79746e(C90126fx.f250997aW) || !((C102977f) this.f287494M.mo27525b()).f287550b.isEnabled() || m170724n()) {
            if (!m170724n() ? !((C90021c) this.f287504d.mo27525b()).mo79746e(C90126fx.f251313gU) : !((C90021c) this.f287504d.mo27525b()).mo79746e(C90126fx.f251344gz)) {
                if (Boolean.TRUE.equals(this.f287523w) || Boolean.TRUE.equals(this.f287524x)) {
                    ((C59052c) ((C59052c) f287482B.mo56224b()).mo56372aa(21383)).mo56386p("NGA paused because Dreamliner/Ambient Mode is active.");
                    coVar = C102960co.m170720c(NgaState.a);
                }
            }
            if (!((C90021c) this.f287504d.mo27525b()).mo79746e(C90126fx.f251294gB)) {
                if (C88079oj.RESUMED.equals(this.f287516p)) {
                    ((C59052c) ((C59052c) f287482B.mo56224b()).mo56372aa(21382)).mo56386p("NGA paused because OPA is resumed.");
                    coVar = C102960co.m170720c(NgaState.a);
                }
            }
            if (!((C90021c) this.f287504d.mo27525b()).mo79746e(C90126fx.f251293gA)) {
                if (C88079oj.RESUMED.equals(this.f287516p) && this.f287517q) {
                    ((C59052c) ((C59052c) f287482B.mo56224b()).mo56372aa(21381)).mo56386p("NGA paused because OPA is in interpreter mode.");
                    coVar = C102960co.m170720c(NgaState.a);
                } else if (this.f287518r) {
                    ((C59052c) ((C59052c) f287482B.mo56224b()).mo56372aa(21380)).mo56386p("NGA paused because OPA is in interpreter prewarm mode.");
                    coVar = C102960co.m170720c(NgaState.a);
                }
            }
            if (!((C90021c) this.f287504d.mo27525b()).mo79746e(C90126fx.f251343gy)) {
                if (C88079oj.RESUMED.equals(this.f287516p) && this.f287519s) {
                    ((C59052c) ((C59052c) f287482B.mo56224b()).mo56372aa(21379)).mo56386p("NGA paused because Interactive Canvas is active.");
                    coVar = C102960co.m170720c(NgaState.a);
                }
            }
            if (((C90021c) this.f287504d.mo27525b()).mo79746e(C90126fx.f251196eJ) && !((C90021c) this.f287504d.mo27525b()).mo79746e(C90126fx.f251567lJ)) {
                String str = this.f287520t;
                c cVar = this.f287521u;
                C17823i iVar = this.f287522v;
                if (c.b.equals(cVar) && C90721ae.f253797f.contains(str) && (iVar == C17823i.FREE_NAVIGATION_IN_FOREGROUND || iVar == C17823i.GUIDED_NAVIGATION_IN_FOREGROUND)) {
                    ((C59052c) ((C59052c) f287482B.mo56224b()).mo56372aa(21378)).mo56386p("NGA paused because GMM integration is active.");
                    hVar = new C102979h(NgaState.a, C120125a.NAVIGATION);
                    coVar = hVar;
                }
            }
            if (((C90021c) this.f287504d.mo27525b()).mo79746e(C90014bt.f247272dy)) {
                String str2 = this.f287520t;
                if (c.b.equals(this.f287521u) && (C90721ae.f253794c.contains(str2) || C90721ae.f253798g.contains(str2))) {
                    ((C59052c) ((C59052c) f287482B.mo56224b()).mo56372aa(21377)).mo56386p("NGA paused because Waze or Jacquard integration is active.");
                    hVar = new C102979h(NgaState.a, C120125a.NAVIGATION);
                    coVar = hVar;
                }
            }
            if (!((C90021c) this.f287504d.mo27525b()).mo79746e(C90126fx.f250996aV) || (!((C11830a) this.f287486E.mo27525b()).f38013a && !((az) this.f287497P.mo27525b()).l())) {
                ((C59052c) ((C59052c) f287482B.mo56224b()).mo56372aa(21375)).mo56386p("NGA enabled in interactor.");
                coVar = C102960co.m170720c(NgaState.b);
            } else {
                ((C59052c) ((C59052c) f287482B.mo56224b()).mo56372aa(21376)).mo56386p("NGA paused because we're in car mode.");
                hVar = new C102979h(NgaState.a, C120125a.NAVIGATION);
                coVar = hVar;
            }
        } else {
            ((C59052c) ((C59052c) f287482B.mo56224b()).mo56372aa(21384)).mo56386p("NGA disabled since it's running Panthera and at least one a11y feature is on.");
            coVar = C102960co.m170720c(NgaState.c);
        }
        C102960co coVar2 = this.f287498Q;
        this.f287498Q = coVar;
        if (!Objects.equals(coVar, coVar2)) {
            ((C59052c) ((C59052c) f287482B.mo56224b()).mo56372aa(21398)).mo56389s("Nga state changed to %s", coVar);
            ((C22871g) this.f287484C.mo6453a()).mo28212l("[NGA] Update state to listeners", new C102936br(this, coVar2, coVar));
        }
    }

    /* renamed from: l */
    public final void mo93543l(C22869e eVar) {
        ((C22871g) this.f287484C.mo6453a()).mo28212l("[NGA] NgaStateChecker#updateStateInBackground", new C102940bv(this, eVar));
    }
}
