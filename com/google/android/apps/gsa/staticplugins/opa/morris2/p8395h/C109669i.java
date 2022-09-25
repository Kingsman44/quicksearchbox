package com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h;

import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.IBinder;
import com.google.android.apps.gsa.assistant.shared.ax;
import com.google.android.apps.gsa.assistant.shared.az;
import com.google.android.apps.gsa.assistant.shared.ba;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.android.apps.gsa.staticplugins.opa.morris2.C109477a;
import com.google.android.apps.gsa.staticplugins.opa.morris2.p8382d.C109492a;
import com.google.android.apps.gsa.staticplugins.opa.morris2.p8382d.C109493b;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14731a;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14115ap;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14362gk;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14365gn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14651g;
import com.google.android.libraries.assistant.auto.tng.p1035m.p1038b.C13901e;
import com.google.android.libraries.assistant.p1467d.p1471b.C17823i;
import com.google.android.libraries.assistant.p1467d.p1471b.C17829o;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3917i.p3918a.C51474ja;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59728dm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.Executor;
import p001a.p007b.p011b.p012a.C0027c;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.h.i */
/* compiled from: PG */
public final class C109669i implements az, C14647d {

    /* renamed from: a */
    public static final C59071e f305436a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.h.i");

    /* renamed from: b */
    public final Context f305437b;

    /* renamed from: c */
    public final ba f305438c;

    /* renamed from: d */
    public final C69464a f305439d;

    /* renamed from: e */
    public final boolean f305440e;

    /* renamed from: f */
    public final C14115ap f305441f;

    /* renamed from: g */
    public final C14096x f305442g;

    /* renamed from: h */
    public final UiModeManager f305443h;

    /* renamed from: i */
    public final C109493b f305444i;

    /* renamed from: j */
    private final C21370a f305445j;

    /* renamed from: k */
    private final Executor f305446k;

    /* renamed from: l */
    private final C60888db f305447l;

    /* renamed from: m */
    private final boolean f305448m;

    /* renamed from: n */
    private ax f305449n;

    /* renamed from: o */
    private BroadcastReceiver f305450o;

    /* renamed from: p */
    private final C109477a f305451p;

    public C109669i(Context context, ba baVar, C109477a aVar, C109493b bVar, C86124t tVar, Executor executor, C60888db dbVar, C69464a aVar2, C21370a aVar3, C14115ap apVar, C14096x xVar) {
        this.f305437b = context;
        this.f305438c = baVar;
        this.f305451p = aVar;
        this.f305444i = bVar;
        this.f305446k = executor;
        this.f305447l = dbVar;
        this.f305439d = aVar2;
        this.f305445j = aVar3;
        this.f305441f = apVar;
        this.f305442g = xVar;
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        uiModeManager.getClass();
        this.f305443h = uiModeManager;
        boolean e = tVar.mo79746e(C90051dc.f248796aD);
        this.f305440e = e;
        this.f305448m = tVar.mo79746e(C90051dc.f248829ak);
        C109667g gVar = new C109667g(this);
        this.f305450o = gVar;
        context.registerReceiver(gVar, new IntentFilter("com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_EXIT_MORRIS_BY_ASSISTANT_PROCESS_CRASH"));
        if (e) {
            C58976aa aaVar = C58975e.f156826a;
            C60856cj.m92911t(xVar.f42764b.mo46042d(), C47810es.m84974n(new C109668h(this)), dbVar);
        }
    }

    /* renamed from: A */
    public final void mo21591A(Optional optional, C14492lf lfVar) {
        if (this.f305440e) {
            ((C14986h) this.f305439d.mo17428b()).mo21875g(lfVar);
        } else {
            this.f305438c.n(optional);
        }
    }

    /* renamed from: B */
    public final boolean mo21592B() {
        return this.f305440e && this.f305448m;
    }

    /* renamed from: C */
    public final boolean mo21593C() {
        if (this.f305440e) {
            return true;
        }
        return this.f305438c.s();
    }

    /* renamed from: D */
    public final boolean mo21594D() {
        return this.f305440e;
    }

    /* renamed from: E */
    public final void mo21595E(C51474ja jaVar) {
        this.f305438c.w(jaVar);
    }

    /* renamed from: F */
    public final void mo21596F(int i) {
        this.f305438c.v(i);
    }

    /* renamed from: a */
    public final C51474ja mo21597a() {
        if (this.f305440e) {
            return ((C14986h) this.f305439d.mo17428b()).mo21871c();
        }
        return this.f305438c.d();
    }

    /* renamed from: b */
    public final Optional mo97953b() {
        ax axVar = this.f305449n;
        if (axVar == null || !axVar.f()) {
            return Optional.empty();
        }
        return Optional.m71637of(this.f305449n.a());
    }

    /* renamed from: c */
    public final void mo97954c(C14651g gVar, C91093c cVar) {
        this.f305449n = this.f305451p.mo97852a(gVar, cVar);
    }

    /* renamed from: d */
    public final void mo97955d() {
        if (this.f305449n != null) {
            this.f305449n = null;
            this.f305451p.mo97853b();
        }
    }

    /* renamed from: e */
    public final void mo97956e(C13901e eVar) {
        Duration ofNanos = Duration.ofNanos(this.f305445j.mo26872d());
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14362gk gkVar = (C14362gk) C14365gn.f43466q.createBuilder();
        gkVar.copyOnWrite();
        ((C14365gn) gkVar.instance).f43468a = 26;
        gkVar.copyOnWrite();
        eVar.getClass();
        ((C14365gn) gkVar.instance).f43478k = eVar;
        long nanos = ofNanos.toNanos();
        gkVar.copyOnWrite();
        ((C14365gn) gkVar.instance).f43469b = nanos;
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14365gn gnVar = (C14365gn) gkVar.build();
        gnVar.getClass();
        lfVar.f43801d = gnVar;
        lfVar.f43800c = 3;
        ((C14986h) this.f305439d.mo17428b()).mo21875g((C14492lf) gtVar.build());
    }

    /* renamed from: f */
    public final void mo21598f(C17823i iVar, String str, Optional optional, Optional optional2) {
        if (this.f305440e) {
            this.f305446k.execute(C47810es.m84977q(new C109666f(this, iVar, str, optional, optional2)));
        } else {
            this.f305438c.g(iVar, str, optional);
        }
    }

    /* renamed from: g */
    public final void mo21599g() {
        if (this.f305440e) {
            this.f305446k.execute(C47810es.m84977q(new C109664d(this)));
        } else {
            this.f305438c.h();
        }
    }

    /* renamed from: h */
    public final void mo21600h(IBinder iBinder) {
        if (this.f305440e) {
            this.f305446k.execute(C47810es.m84977q(new C109663c(this, iBinder)));
        }
        this.f305438c.i(iBinder);
    }

    /* renamed from: i */
    public final void mo21601i(C17829o oVar) {
        this.f305438c.j(oVar);
    }

    /* renamed from: j */
    public final void mo97957j(boolean z) {
        ((C14986h) this.f305439d.mo17428b()).mo21875g(C14731a.m31012i(z, Duration.ofNanos(this.f305445j.mo26872d())));
    }

    /* renamed from: k */
    public final boolean mo21602k() {
        if (this.f305440e) {
            return ((C14986h) this.f305439d.mo17428b()).mo21880l();
        }
        return this.f305438c.o();
    }

    /* renamed from: l */
    public final boolean mo21603l() {
        return ((C14986h) this.f305439d.mo17428b()).mo21879k();
    }

    /* renamed from: m */
    public final boolean mo97958m() {
        return this.f305449n != null;
    }

    /* renamed from: n */
    public final boolean mo21604n() {
        if (!this.f305440e) {
            return this.f305438c.q();
        }
        Optional ofNullable = Optional.ofNullable(this.f305444i.f304958b);
        return ofNullable.isPresent() && ((C109492a) ofNullable.get()).mo97863h();
    }

    /* renamed from: o */
    public final boolean mo21605o() {
        if (this.f305440e) {
            return true;
        }
        return this.f305438c.t();
    }

    /* renamed from: p */
    public final boolean mo97959p() {
        ax axVar = this.f305449n;
        return axVar != null && axVar.g();
    }

    /* renamed from: q */
    public final boolean mo97960q(e eVar) {
        ax axVar = this.f305449n;
        return axVar != null && axVar.h(eVar);
    }

    /* renamed from: r */
    public final void mo21606r(int i) {
        if (this.f305440e) {
            this.f305446k.execute(C47810es.m84977q(new C109665e(this, i)));
        } else {
            this.f305438c.u(i);
        }
    }

    /* renamed from: s */
    public final C59728dm mo97961s(boolean z) {
        ax axVar = this.f305449n;
        if (axVar != null) {
            return axVar.j(z);
        }
        C59104x d = f305436a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.MiniShimImpl");
        ((C59052c) ((C59052c) d).mo56372aa(25025)).mo56386p("showMorrisMiniInAssistLayer called when morrisMiniController is null");
        return C59728dm.UNKNOWN_SHOW_MORRIS_UI_RESULT;
    }

    /* renamed from: t */
    public final IBinder mo21607t() {
        if (this.f305440e) {
            return mo97962u().mo97856a();
        }
        return this.f305438c.a();
    }

    /* renamed from: u */
    public final C109492a mo97962u() {
        Optional ofNullable = Optional.ofNullable(this.f305444i.f304958b);
        if (ofNullable.isPresent()) {
            return (C109492a) ofNullable.get();
        }
        C109493b bVar = this.f305444i;
        bVar.f304958b = (C109492a) bVar.f304957a.mo17428b();
        bVar.f304958b.mo97858c();
        return bVar.f304958b;
    }

    /* renamed from: v */
    public final Duration mo21608v() {
        if (this.f305440e) {
            return ((C14986h) this.f305439d.mo17428b()).mo21872d();
        }
        return this.f305438c.e();
    }

    /* renamed from: w */
    public final void mo21609w() {
        ax axVar = this.f305449n;
        if (axVar != null) {
            axVar.b();
        }
    }

    /* renamed from: x */
    public final void mo21610x(boolean z) {
        if (this.f305440e) {
            C59104x d = f305436a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.MiniShimImpl");
            ((C59052c) ((C59052c) d).mo56372aa(25027)).mo56386p("setIsCarModeTriggeredByMorris should not be called with triggering 2.0.");
            return;
        }
        this.f305438c.k(z);
    }

    /* renamed from: y */
    public final void mo21611y() {
        if (this.f305440e && Optional.ofNullable(this.f305444i.f304958b).isPresent()) {
            mo97962u().mo97857b();
        }
        this.f305438c.l();
    }

    /* renamed from: z */
    public final void mo21612z(C0027c cVar) {
        this.f305438c.m(cVar);
    }
}
