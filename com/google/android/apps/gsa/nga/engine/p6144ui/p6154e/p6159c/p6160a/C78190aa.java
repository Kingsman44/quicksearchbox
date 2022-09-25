package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.p6160a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.gsa.nga.engine.p5913am.p5941w.C74970a;
import com.google.android.apps.gsa.nga.engine.p5913am.p5941w.p5942a.C74975e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6153d.C78160k;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.C78728n;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.shared.android.C80958n;
import com.google.android.apps.gsa.nga.shared.p6367t.C81506a;
import com.google.android.apps.gsa.nga.shared.p6367t.C81507b;
import com.google.android.apps.gsa.nga.shared.p6367t.C81508c;
import com.google.android.apps.gsa.nga.shared.p6367t.C81509d;
import com.google.android.apps.gsa.nga.shared.p6367t.C81510e;
import com.google.android.apps.gsa.nga.shared.p6367t.C81511f;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88079oj;
import com.google.android.apps.gsa.shared.p6983ah.C89154k;
import com.google.android.apps.gsa.shared.p6983ah.C89158o;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.c.a.aa */
/* compiled from: PG */
public final class C78190aa implements C78728n, C81508c, C81506a, C81511f, C81510e, C74970a, C81507b, C81509d {

    /* renamed from: a */
    public final C22871g f215276a;

    /* renamed from: b */
    public final C83357g f215277b = new C83361k(false, C78263m.class);

    /* renamed from: c */
    public final C83357g f215278c = new C83361k(false, C78263m.class);

    /* renamed from: d */
    public final C83357g f215279d = new C83361k(C88079oj.UNKNOWN, C78263m.class);

    /* renamed from: e */
    public final C83357g f215280e = new C83361k(Optional.empty(), C78263m.class);

    /* renamed from: f */
    public final C83357g f215281f = new C83361k(C78224b.f215366a, C78263m.class);

    /* renamed from: g */
    public final C78160k f215282g;

    /* renamed from: h */
    private final Context f215283h;

    /* renamed from: i */
    private final BroadcastReceiver f215284i;

    /* renamed from: j */
    private final C83363m f215285j;

    /* renamed from: k */
    private final C68214a f215286k;

    /* renamed from: l */
    private boolean f215287l = false;

    /* renamed from: m */
    private final C74975e f215288m;

    public C78190aa(Context context, C68214a aVar, C22871g gVar, C74975e eVar, C78160k kVar, C91142g gVar2) {
        this.f215283h = context;
        this.f215286k = aVar;
        this.f215276a = gVar;
        this.f215288m = eVar;
        this.f215282g = kVar;
        this.f215285j = new C83363m();
        this.f215284i = new C80958n(new C78222y(this), gVar2, C90126fx.f251118cl);
    }

    /* renamed from: a */
    public final void mo71914a(C88079oj ojVar) {
        C58976aa aaVar = C58975e.f156826a;
        C83349aj.m132647b(this.f215276a, this.f215279d, ojVar, "onOpaLifecycleChanged");
    }

    /* renamed from: b */
    public final void mo71915b(boolean z) {
        this.f215276a.mo28212l("[NGA] onOpaVisibilityChanged", new C78216s(this, z));
    }

    /* renamed from: c */
    public final void mo73129c() {
        C58976aa aaVar = C58975e.f156826a;
        C22871g gVar = this.f215276a;
        C83357g gVar2 = this.f215281f;
        C83349aj.m132647b(gVar, gVar2, ((C78224b) ((C83361k) gVar2).f227199b.get()).mo73144g(false), "onAnswerUiHidden");
    }

    /* renamed from: d */
    public final /* synthetic */ void mo71356d() {
    }

    /* renamed from: e */
    public final void mo71357e() {
        C58976aa aaVar = C58975e.f156826a;
        mo71379gP(C89158o.f241716c);
        mo71378gO(C89154k.f241700e);
        mo73134m(false);
        mo73135n(false);
        mo71915b(false);
    }

    /* renamed from: f */
    public final void mo73130f() {
        C58976aa aaVar = C58975e.f156826a;
        C22871g gVar = this.f215276a;
        C83357g gVar2 = this.f215281f;
        C83349aj.m132647b(gVar, gVar2, ((C78224b) ((C83361k) gVar2).f227199b.get()).mo73144g(true), "onAnswerUiStarted");
    }

    /* renamed from: g */
    public final void mo73131g() {
        C58976aa aaVar = C58975e.f156826a;
        C22871g gVar = this.f215276a;
        C83357g gVar2 = this.f215281f;
        C83349aj.m132647b(gVar, gVar2, ((C78224b) ((C83361k) gVar2).f227199b.get()).mo73144g(false), "onAnswerUiStopped");
    }

    /* renamed from: gN */
    public final void mo73132gN(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C83349aj.m132647b(this.f215276a, this.f215280e, Optional.m71637of(Boolean.valueOf(z)), "onOpaActivityForegroundStateChanged");
    }

    /* renamed from: gO */
    public final void mo71378gO(C89154k kVar) {
        this.f215276a.mo28212l("[NGA] opaResponseVisualStateChange", new C78217t(this, kVar));
    }

    /* renamed from: gP */
    public final void mo71379gP(C89158o oVar) {
        this.f215276a.mo28212l("[NGA] opaVisualStateChanged", new C78223z(this, oVar));
    }

    /* renamed from: h */
    public final void mo73112h() {
        if (this.f215287l) {
            this.f215287l = false;
            this.f215283h.unregisterReceiver(this.f215284i);
        }
        this.f215281f.mo76660b(C78224b.f215366a);
        mo71379gP(C89158o.f241716c);
        mo71378gO(C89154k.f241700e);
        mo73134m(false);
        mo73135n(false);
        this.f215285j.mo76661a();
        this.f215288m.mo71359b(this);
    }

    /* renamed from: i */
    public final void mo73113i() {
        if (!this.f215287l) {
            this.f215287l = true;
            this.f215283h.registerReceiver(this.f215284i, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
        this.f215285j.mo76663c((C83358h) this.f215286k.mo27525b(), new C78218u(this));
        this.f215285j.mo76663c(this.f215281f, new C78219v(this));
        this.f215285j.mo76663c(this.f215281f, new C78220w(this));
        this.f215288m.mo71358a(this);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo73114j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo73115k() {
    }

    /* renamed from: l */
    public final void mo73133l() {
        C58976aa aaVar = C58975e.f156826a;
        C22871g gVar = this.f215276a;
        C83357g gVar2 = this.f215281f;
        C83349aj.m132647b(gVar, gVar2, ((C78224b) ((C83361k) gVar2).f227199b.get()).mo73144g(true), "onAnswerUiVisible");
    }

    /* renamed from: m */
    public final void mo73134m(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C83349aj.m132647b(this.f215276a, this.f215277b, Boolean.valueOf(z), "opaInTypingModeChanged");
    }

    /* renamed from: n */
    public final void mo73135n(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C83349aj.m132647b(this.f215276a, this.f215278c, Boolean.valueOf(z), "opaInVoiceSearchModeChanged");
    }
}
