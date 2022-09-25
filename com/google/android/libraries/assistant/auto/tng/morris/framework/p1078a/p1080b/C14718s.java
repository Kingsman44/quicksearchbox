package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14938e;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.C14653a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1081b.C14727a;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14113an;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14115ap;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14272db;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14387hi;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Executor;
import p001a.p007b.p011b.p012a.C0027c;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.s */
/* compiled from: PG */
public final class C14718s implements C14653a {

    /* renamed from: a */
    public static final C59071e f44473a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.s");

    /* renamed from: b */
    public final UiModeManager f44474b;

    /* renamed from: c */
    public final C14647d f44475c;

    /* renamed from: d */
    public final Executor f44476d;

    /* renamed from: e */
    public final C14096x f44477e;

    /* renamed from: f */
    public final C86124t f44478f;

    /* renamed from: g */
    public final C69464a f44479g;

    /* renamed from: h */
    public boolean f44480h = false;

    /* renamed from: i */
    public boolean f44481i = false;

    /* renamed from: j */
    public boolean f44482j = false;

    /* renamed from: k */
    private final C14113an f44483k;

    /* renamed from: l */
    private final C14115ap f44484l;

    /* renamed from: m */
    private final Context f44485m;

    /* renamed from: n */
    private Optional f44486n = Optional.empty();

    public C14718s(Context context, C86124t tVar, C14647d dVar, Executor executor, C14113an anVar, C14115ap apVar, C14096x xVar, C69464a aVar) {
        this.f44485m = context;
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        uiModeManager.getClass();
        this.f44474b = uiModeManager;
        this.f44475c = dVar;
        this.f44476d = executor;
        this.f44483k = anVar;
        this.f44484l = apVar;
        this.f44477e = xVar;
        this.f44479g = aVar;
        this.f44478f = tVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final void mo21503c() {
        if (!this.f44478f.mo79746e(C90051dc.f248919p) && this.f44475c.mo21594D()) {
            C58976aa aaVar = C58975e.f156826a;
            this.f44486n = Optional.m71637of(new C14717r(this));
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_EXIT_CAR_MODE");
            this.f44485m.registerReceiver((BroadcastReceiver) this.f44486n.get(), intentFilter);
        }
    }

    /* renamed from: d */
    public final void mo21504d() {
        if (!this.f44478f.mo79746e(C90051dc.f248919p) && this.f44475c.mo21594D()) {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f44486n.isPresent()) {
                this.f44485m.unregisterReceiver((BroadcastReceiver) this.f44486n.get());
                this.f44486n = Optional.empty();
            }
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: f */
    public final synchronized void mo21703f() {
        this.f44482j = true;
        this.f44476d.execute(C47810es.m84977q(new C14712m(this)));
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final boolean mo21623h(C14492lf lfVar, C14324f fVar, C14938e eVar, C14749d dVar) {
        C14387hi hiVar;
        C14716q qVar = new C14716q(this);
        if (lfVar.f43800c == 21) {
            hiVar = (C14387hi) lfVar.f43801d;
        } else {
            hiVar = C14387hi.f43524b;
        }
        int i = hiVar.f43526a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = i2 - 2;
        if (i3 != 1) {
            if (i3 == 2 && !qVar.f44471a.f44478f.mo79746e(C90051dc.f248919p)) {
                C59104x b = f44473a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "Morris.CarModeCtrl");
                ((C59052c) ((C59052c) b).mo56372aa(45350)).mo56386p("Disabling car mode");
                if (!qVar.f44471a.f44475c.mo21594D()) {
                    qVar.f44471a.f44475c.mo21610x(false);
                    qVar.f44471a.f44476d.execute(C47810es.m84977q(new C14715p(qVar)));
                } else {
                    qVar.f44471a.mo21703f();
                }
            }
        } else if (!qVar.f44471a.f44478f.mo79746e(C90051dc.f248919p) && qVar.f44471a.f44474b.getCurrentModeType() != 3) {
            C59104x b2 = f44473a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "Morris.CarModeCtrl");
            ((C59052c) ((C59052c) b2).mo56372aa(45349)).mo56386p("Enabling car mode");
            if (!qVar.f44471a.f44475c.mo21594D()) {
                qVar.f44471a.f44475c.mo21610x(true);
                qVar.f44471a.f44476d.execute(C47810es.m84977q(new C14714o(qVar)));
            } else {
                qVar.f44471a.mo21704k();
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void mo21632i(C14324f fVar, C14727a aVar, C14272db dbVar, C14749d dVar) {
        if (this.f44475c.mo21594D() && !this.f44478f.mo79746e(C90051dc.f248919p)) {
            synchronized (this) {
                if (!this.f44480h) {
                    C0027c a = C0027c.m9a(fVar.f43332a);
                    if (a == null) {
                        a = C0027c.UNRECOGNIZED;
                    }
                    if (a != C0027c.OFF) {
                        if (this.f44474b.getCurrentModeType() != 3) {
                            mo21704k();
                            this.f44483k.mo21424b(C37182a.f97984eD.mo40813g());
                        } else {
                            this.f44483k.mo21424b(C37182a.f97985eE.mo40813g());
                            this.f44481i = false;
                        }
                        this.f44480h = true;
                    }
                }
                if (this.f44480h && this.f44481i) {
                    C0027c a2 = C0027c.m9a(fVar.f43332a);
                    if (a2 == null) {
                        a2 = C0027c.UNRECOGNIZED;
                    }
                    if (a2 == C0027c.OFF && !this.f44482j) {
                        this.f44484l.mo21430d(C37182a.f98062fc.mo40813g(), this.f44475c.mo21608v());
                        mo21703f();
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public final /* synthetic */ void mo21633j(C14496lj ljVar, Optional optional, C14749d dVar) {
    }

    /* renamed from: k */
    public final synchronized void mo21704k() {
        this.f44481i = true;
        this.f44476d.execute(C47810es.m84977q(new C14713n(this)));
    }

    /* renamed from: l */
    public final synchronized boolean mo21705l() {
        return this.f44481i;
    }
}
