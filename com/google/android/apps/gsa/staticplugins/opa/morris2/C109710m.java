package com.google.android.apps.gsa.staticplugins.opa.morris2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.databinding.C0118a;
import android.graphics.Region;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.shared.ax;
import com.google.android.apps.gsa.assistant.shared.ba;
import com.google.android.apps.gsa.assistant.shared.d;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8391b.C109614a;
import com.google.android.apps.gsa.staticplugins.opa.morris2.p8398i.C109694g;
import com.google.android.apps.gsa.staticplugins.opa.morris2.p8398i.C109702o;
import com.google.android.libraries.assistant.auto.tng.common.p933q.C13325i;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14987i;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14731a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14745o;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14746p;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14113an;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14115ap;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14487la;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14488lb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14489lc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1073a.C14638a;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.C15111ae;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.C15113ag;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15383k;
import com.google.android.libraries.assistant.p1467d.p1471b.C17823i;
import com.google.android.libraries.assistant.p1467d.p1471b.C17829o;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.android.concurrent.C58301z;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.p4552o.C59728dm;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p001a.p007b.p011b.p012a.C0027c;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.m */
/* compiled from: PG */
public final class C109710m implements ax, C2391v, C14987i {

    /* renamed from: a */
    public static final C59071e f305620a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.m");

    /* renamed from: w */
    private static final C58495hd f305621w;

    /* renamed from: A */
    private final C15113ag f305622A;

    /* renamed from: B */
    private final C60888db f305623B;

    /* renamed from: C */
    private final Runnable f305624C = new C109508e(this);

    /* renamed from: D */
    private boolean f305625D;

    /* renamed from: E */
    private BroadcastReceiver f305626E;

    /* renamed from: b */
    public final Context f305627b;

    /* renamed from: c */
    public final d f305628c;

    /* renamed from: d */
    public final ba f305629d;

    /* renamed from: e */
    public final C13325i f305630e;

    /* renamed from: f */
    public final C86124t f305631f;

    /* renamed from: g */
    public final C14113an f305632g;

    /* renamed from: h */
    public final C14115ap f305633h;

    /* renamed from: i */
    public final Executor f305634i;

    /* renamed from: j */
    public final C14638a f305635j;

    /* renamed from: k */
    public final C2393x f305636k;

    /* renamed from: l */
    public final C15383k f305637l;

    /* renamed from: m */
    public final C109702o f305638m;

    /* renamed from: n */
    public final C14986h f305639n;

    /* renamed from: o */
    public final C15111ae f305640o;

    /* renamed from: p */
    public final C109694g f305641p;

    /* renamed from: q */
    public final Executor f305642q;

    /* renamed from: r */
    public C59728dm f305643r;

    /* renamed from: s */
    public BroadcastReceiver f305644s;

    /* renamed from: t */
    C60870cx f305645t;

    /* renamed from: u */
    List f305646u;

    /* renamed from: v */
    String f305647v;

    /* renamed from: x */
    private final Executor f305648x;

    /* renamed from: y */
    private final C109614a f305649y;

    /* renamed from: z */
    private final C21370a f305650z;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C17829o.UI_SUPPRESSION_LEVEL_NONE, C14488lb.LEVEL_NONE);
        gzVar.mo55429h(C17829o.UI_SUPPRESSION_LEVEL_MEDIA, C14488lb.LEVEL_MEDIA);
        gzVar.mo55429h(C17829o.UI_SUPPRESSION_LEVEL_MESSAGE, C14488lb.LEVEL_MESSAGE);
        gzVar.mo55429h(C17829o.UI_SUPPRESSION_LEVEL_PHONE_CALL, C14488lb.LEVEL_PHONE_CALL);
        gzVar.mo55429h(C17829o.UI_SUPPRESSION_LEVEL_ALL, C14488lb.LEVEL_ALL);
        f305621w = gzVar.mo55427f(false);
    }

    public C109710m(Context context, C13325i iVar, ba baVar, C86124t tVar, C14113an anVar, C14115ap apVar, Executor executor, Executor executor2, C14638a aVar, C14986h hVar, d dVar, C15111ae aeVar, C109694g gVar, C15113ag agVar, C109614a aVar2, C15383k kVar, C109702o oVar, C60887da daVar, C60888db dbVar, C21370a aVar3) {
        C2393x xVar = new C2393x(this);
        this.f305636k = xVar;
        xVar.mo5794f(C2383n.INITIALIZED);
        this.f305627b = context;
        this.f305629d = baVar;
        this.f305628c = dVar;
        this.f305635j = aVar;
        this.f305630e = iVar;
        this.f305631f = tVar;
        this.f305634i = executor2;
        this.f305632g = anVar;
        this.f305633h = apVar;
        this.f305648x = executor;
        this.f305639n = hVar;
        this.f305640o = aeVar;
        this.f305641p = gVar;
        this.f305622A = agVar;
        this.f305649y = aVar2;
        this.f305623B = dbVar;
        this.f305637l = kVar;
        this.f305638m = oVar;
        this.f305642q = daVar;
        this.f305650z = aVar3;
        this.f305643r = C59728dm.UNKNOWN_SHOW_MORRIS_UI_RESULT;
    }

    /* renamed from: a */
    public final Region mo98026a() {
        C15111ae aeVar = this.f305640o;
        if (aeVar != null) {
            return aeVar.mo21975c();
        }
        C59104x d = f305620a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.MiniCtrlImpl");
        ((C59052c) ((C59052c) d).mo56372aa(24746)).mo56386p("#getTouchableRegion: rootRenderer is null");
        return new Region();
    }

    /* renamed from: b */
    public final void mo98027b() {
        Executor executor = this.f305648x;
        C15113ag agVar = this.f305622A;
        Objects.requireNonNull(agVar);
        executor.execute(new C109687i(agVar));
    }

    /* renamed from: c */
    public final void mo98028c(C17823i iVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f305632g.mo21424b(C37182a.f97952dY.mo40813g());
        this.f305633h.mo21430d(C37182a.f97999eS.mo40813g(), this.f305629d.e());
        C17823i iVar2 = C17823i.UNKNOWN;
        int ordinal = iVar.ordinal();
        if (ordinal == 1) {
            this.f305639n.mo21874f();
        } else if (ordinal == 2) {
            mo98037l();
        } else if (ordinal == 3) {
            String b = this.f305635j.mo21570b();
            if (b != null && this.f305635j.mo21578l()) {
                if (mo98031f()) {
                    C59104x c = f305620a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "Morris.MiniCtrlImpl");
                    C59052c cVar = (C59052c) c;
                    cVar.mo56378ag(C38505d.f101864b, 169808179);
                    cVar.mo56380ai(C58979ad.SMALL);
                    ((C59052c) cVar.mo56372aa(24763)).mo56386p("NavigationState try to change to foreground when it's already resumed.");
                }
                this.f305639n.mo21877i(C14746p.m31068a(b));
                this.f305647v = b;
            }
        } else if (ordinal != 4) {
            C59104x d = f305620a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.MiniCtrlImpl");
            ((C59052c) ((C59052c) d).mo56372aa(24761)).mo56387q("#onNavigationStateChanged(). invalid navigationState: %d", iVar.f51144f);
        }
    }

    /* renamed from: d */
    public final void mo98029d() {
        Executor executor = this.f305648x;
        C15111ae aeVar = this.f305640o;
        Objects.requireNonNull(aeVar);
        executor.execute(new C109488c(aeVar));
    }

    /* renamed from: e */
    public final void mo98030e(C17829o oVar) {
        C14986h hVar = this.f305639n;
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14487la laVar = (C14487la) C14489lc.f43790b.createBuilder();
        laVar.copyOnWrite();
        ((C14489lc) laVar.instance).f43792a = ((C14488lb) f305621w.getOrDefault(oVar, C14488lb.LEVEL_UNKNOWN)).getNumber();
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14489lc lcVar = (C14489lc) laVar.build();
        lcVar.getClass();
        lfVar.f43799b = lcVar;
        lfVar.f43798a = 13;
        hVar.mo21875g((C14492lf) gtVar.build());
    }

    /* renamed from: f */
    public final boolean mo98031f() {
        return this.f305636k.f6612c == C2383n.RESUMED;
    }

    /* renamed from: g */
    public final boolean mo98032g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f305639n.mo21875g(C14745o.m31058a());
        return true;
    }

    public final C2384o getLifecycle() {
        return this.f305636k;
    }

    /* renamed from: h */
    public final boolean mo98033h(e eVar) {
        if (eVar != e.m || !this.f305631f.mo79746e(C90051dc.f248831am)) {
            return C58528ij.m90015O(e.ay, e.bo, e.bu, e.bq, e.aU, e.ax, e.bn).contains(eVar);
        }
        C59104x c = f305620a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.MiniCtrlImpl");
        C0118a.m108p(c, "Allowing Morris to re-render the existing session", 24778, C38505d.f101864b, 169807784);
        return true;
    }

    /* renamed from: i */
    public final void mo98034i(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (!mo98031f()) {
            C59104x d = f305620a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.MiniCtrlImpl");
            ((C59052c) ((C59052c) d).mo56372aa(24759)).mo56386p("#onKeyguardDismissStatusChanged(): Morris is not resumed.");
            return;
        }
        this.f305649y.mo97913b(i);
    }

    /* renamed from: j */
    public final C59728dm mo98035j(boolean z) {
        boolean z2 = false;
        if (mo98031f()) {
            if (mo98031f()) {
                C58976aa aaVar = C58975e.f156826a;
                this.f305639n.mo21875g(C14731a.m31012i(false, Duration.ofNanos(this.f305650z.mo26872d())));
            }
            return C59728dm.SUCCESS;
        }
        this.f305632g.mo21424b(C37182a.f97953dZ.mo40813g());
        boolean z3 = this.f305625D;
        if (z && this.f305629d.o()) {
            z2 = true;
        }
        this.f305625D = z3 | z2;
        this.f305635j.mo21570b();
        C58976aa aaVar2 = C58975e.f156826a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        this.f305629d.o();
        if (!this.f305635j.mo21578l()) {
            C59104x c = f305620a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.MiniCtrlImpl");
            ((C59052c) ((C59052c) c).mo56372aa(24749)).mo56386p("#showMorrisUi(): hosting app is invalid. Don't show Morris UI.");
            this.f305632g.mo21423a(C37182a.f98031ey.mo40805c(C62722b.FAILED_PRECONDITION));
            this.f305643r = C59728dm.FAILURE_INVALID_HOSTING_APP;
            return C59728dm.FAILURE_INVALID_HOSTING_APP;
        } else if (this.f305625D) {
            if (this.f305636k.f6612c == C2383n.CREATED) {
                this.f305639n.mo21876h(this);
                if (this.f305631f.mo79746e(C90051dc.f248863bR)) {
                    mo98039o();
                }
                this.f305636k.mo5794f(C2383n.STARTED);
                this.f305635j.mo21571c();
            }
            this.f305636k.mo5794f(C2383n.RESUMED);
            this.f305629d.m(C0027c.MINI);
            if (this.f305631f.mo79746e(C90051dc.f248790Y) && this.f305645t == null) {
                this.f305646u = C58869cf.m90936b(new C58903m(',')).mo56155i(this.f305631f.mo79758x(C90051dc.f248905cg));
                this.f305645t = C58301z.m89281a(this.f305624C, this.f305631f.mo79743a(C90051dc.f248805aM), this.f305631f.mo79743a(C90051dc.f248806aN), TimeUnit.MILLISECONDS, this.f305650z, this.f305623B);
            }
            this.f305643r = C59728dm.SUCCESS;
            return C59728dm.SUCCESS;
        } else {
            this.f305643r = C59728dm.FAILURE_CAR_MODE_NOT_SET_BY_MORRIS;
            this.f305632g.mo21423a(C37182a.f98032ez.mo40805c(C62722b.FAILED_PRECONDITION));
            return C59728dm.FAILURE_CAR_MODE_NOT_SET_BY_MORRIS;
        }
    }

    /* renamed from: k */
    public final void mo98036k(String str) {
        C59104x b = f305620a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.MiniCtrlImpl");
        ((C59052c) ((C59052c) b).mo56372aa(24750)).mo56386p("#exitMorrisAndNavigation");
        if (mo98031f()) {
            mo98037l();
        }
        this.f305629d.g(C17823i.STOPPED, str, Optional.empty());
    }

    /* renamed from: l */
    public final void mo98037l() {
        C58976aa aaVar = C58975e.f156826a;
        if (mo98031f()) {
            mo98040p();
            this.f305639n.mo21878j();
            this.f305636k.mo5794f(C2383n.STARTED);
        }
    }

    /* renamed from: m */
    public final void mo98038m() {
        C58976aa aaVar = C58975e.f156826a;
        this.f305633h.mo21430d(C37182a.f98000eT.mo40813g(), this.f305629d.e());
        if (mo98031f()) {
            mo98037l();
        }
        this.f305625D = false;
        if (this.f305631f.mo79746e(C90051dc.f248863bR)) {
            mo98041q();
        }
        this.f305629d.f();
        this.f305636k.mo5794f(C2383n.CREATED);
    }

    /* renamed from: n */
    public final void mo21881n(C14499lm lmVar) {
        this.f305648x.execute(C47810es.m84977q(new C109491d(this, lmVar)));
    }

    /* renamed from: o */
    public final void mo98039o() {
        C58976aa aaVar = C58975e.f156826a;
        this.f305626E = new C109708k(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_EXIT_CAR_MODE");
        this.f305627b.registerReceiver(this.f305626E, intentFilter);
    }

    /* renamed from: p */
    public final void mo98040p() {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = this.f305645t;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f305645t = null;
        }
    }

    /* renamed from: q */
    public final void mo98041q() {
        C58976aa aaVar = C58975e.f156826a;
        BroadcastReceiver broadcastReceiver = this.f305626E;
        if (broadcastReceiver != null) {
            this.f305627b.unregisterReceiver(broadcastReceiver);
            this.f305626E = null;
            return;
        }
        C59104x c = f305620a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.MiniCtrlImpl");
        C0118a.m108p(c, "#unregisterCarModeExitReceiver(): Trying to unregister a receiver that doesn't exist", 24774, C38505d.f101864b, 169257776);
    }
}
