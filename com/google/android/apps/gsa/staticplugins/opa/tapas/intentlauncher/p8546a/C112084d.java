package com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.p8546a;

import android.app.KeyguardManager;
import android.content.Context;
import android.support.p033v7.widget.C0646fh;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a.C111806n;
import com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.p8547b.C112087a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.p8549d.C112093a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.p8550e.C112095a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112685aw;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112694be;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112705m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8525e.p8529c.C111771e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.C113023i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8568a.C112990a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8568a.C112991b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8568a.C112996g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8568a.C112997h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8569b.C112999a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8570c.C113016o;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113565h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.a.d */
/* compiled from: PG */
public final class C112084d implements C112081a, C112991b {

    /* renamed from: a */
    public static final C59071e f311267a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.a.d");

    /* renamed from: i */
    private static final C121537f f311268i = C121537f.m200840b("IntentLauncher/IntentLauncherControllerImpl", C121511c.f337208a);

    /* renamed from: b */
    public final C21370a f311269b;

    /* renamed from: c */
    public final C68214a f311270c;

    /* renamed from: d */
    public final C68214a f311271d;

    /* renamed from: e */
    public final C68214a f311272e;

    /* renamed from: f */
    public final AtomicLong f311273f = new AtomicLong();

    /* renamed from: g */
    public ViewTreeObserver.OnPreDrawListener f311274g;

    /* renamed from: h */
    public Optional f311275h = Optional.empty();

    /* renamed from: j */
    private final Context f311276j;

    /* renamed from: k */
    private final C86124t f311277k;

    /* renamed from: l */
    private final C112087a f311278l;

    /* renamed from: m */
    private final C112999a f311279m;

    /* renamed from: n */
    private final C113565h f311280n;

    /* renamed from: o */
    private final C112997h f311281o;

    /* renamed from: p */
    private final C112095a f311282p;

    /* renamed from: q */
    private final C68214a f311283q;

    /* renamed from: r */
    private final C112990a f311284r;

    /* renamed from: s */
    private final C68214a f311285s;

    /* renamed from: t */
    private final C68214a f311286t;

    /* renamed from: u */
    private final C68214a f311287u;

    /* renamed from: v */
    private final C68214a f311288v;

    /* renamed from: w */
    private final C68214a f311289w;

    /* renamed from: x */
    private final List f311290x;

    public C112084d(Context context, C21370a aVar, C86124t tVar, C112087a aVar2, C68214a aVar3, C68214a aVar4, C112999a aVar5, C112997h hVar, C112095a aVar6, C68214a aVar7, C68214a aVar8, C112990a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12, C68214a aVar13, C68214a aVar14, C68214a aVar15) {
        ArrayList arrayList = new ArrayList();
        this.f311290x = arrayList;
        this.f311276j = context;
        this.f311269b = aVar;
        this.f311277k = tVar;
        this.f311278l = aVar2;
        C68214a aVar16 = aVar3;
        C113565h hVar2 = new C113565h(arrayList, aVar3, aVar4);
        this.f311280n = hVar2;
        this.f311287u = aVar4;
        hVar2.setHasStableIds(true);
        this.f311279m = aVar5;
        this.f311281o = hVar;
        this.f311282p = aVar6;
        this.f311271d = aVar7;
        this.f311284r = aVar9;
        this.f311283q = aVar8;
        this.f311286t = aVar10;
        this.f311288v = aVar11;
        this.f311285s = aVar12;
        this.f311270c = aVar13;
        this.f311272e = aVar14;
        this.f311289w = aVar15;
    }

    /* renamed from: a */
    public final void mo99356a() {
        this.f311279m.mo99811a();
    }

    /* renamed from: b */
    public final void mo99357b() {
        this.f311279m.mo99812b();
        ((C112705m) this.f311271d.mo27525b()).mo99669d(C89849ae.TAPAS_ACTIVITY_STOP_CANCEL);
        ((C112694be) this.f311287u.mo27525b()).mo99656g();
        if (this.f311274g == null || !this.f311275h.isPresent()) {
            this.f311273f.set(this.f311284r.f313118a.get());
        } else {
            ViewTreeObserver viewTreeObserver = ((RecyclerView) this.f311275h.get()).getViewTreeObserver();
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f311274g;
            onPreDrawListener.getClass();
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f311274g = null;
        }
        ((C112705m) this.f311271d.mo27525b()).mo99667b();
    }

    /* renamed from: c */
    public final void mo99358c() {
        this.f311279m.mo99813c();
    }

    /* renamed from: d */
    public final void mo99359d() {
        C60870cx a = ((C113016o) this.f311289w.mo27525b()).mo99818a(this.f311278l.mo99370a());
        C112083c cVar = new C112083c();
        C60856cj.m92911t(a, C47810es.m84974n(cVar), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final void mo99360e() {
        this.f311279m.mo99814d();
    }

    /* renamed from: f */
    public final void mo99361f(RecyclerView recyclerView) {
        this.f311275h = Optional.m71637of(recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f311276j);
        linearLayoutManager.setOrientation(1);
        linearLayoutManager.setStackFromEnd(false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f311280n);
        recyclerView.setItemAnimator((C0646fh) null);
        recyclerView.addItemDecoration$ar$ds(new C112093a());
    }

    /* renamed from: g */
    public final void mo99362g(String str) {
        C51331dt dtVar;
        if (this.f311275h.isEmpty()) {
            C59104x c = f311267a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "IntLControllerImpl");
            ((C59052c) ((C59052c) c).mo56372aa(27496)).mo56386p("Call to fetch suggestions without View set");
        }
        C112996g a = this.f311281o.mo99810a(this, this.f311278l.mo99370a());
        Optional empty = Optional.empty();
        KeyguardManager keyguardManager = this.f311282p.f311299a;
        if (keyguardManager == null || !keyguardManager.isDeviceLocked()) {
            dtVar = C51331dt.FULLY_TRUSTED;
        } else {
            dtVar = C51331dt.UNTRUSTED;
        }
        a.mo99809c(str, empty, dtVar);
    }

    /* renamed from: jC */
    public final void mo99364jC(long j, String str) {
        ((C112705m) this.f311271d.mo27525b()).mo99668c(j, str);
    }

    /* renamed from: jF */
    public final boolean mo99365jF() {
        return true;
    }

    /* renamed from: jG */
    public final void mo99366jG(long j, String str, long j2) {
        this.f311274g = new C112082b(this, j2, str, j);
        if (this.f311275h.isPresent()) {
            ViewTreeObserver viewTreeObserver = ((RecyclerView) this.f311275h.get()).getViewTreeObserver();
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f311274g;
            onPreDrawListener.getClass();
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        }
    }

    /* renamed from: jH */
    public final void mo99367jH(C113408es esVar, String str, long j) {
        if (this.f311275h.isEmpty()) {
            C59104x c = f311267a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "IntLControllerImpl");
            ((C59052c) ((C59052c) c).mo56372aa(27497)).mo56386p("Update suggestions without View set");
        }
        if (esVar != null) {
            if (esVar.mo100121d().isEmpty()) {
                f311268i.mo105240i("ResultsFetched:Ideal");
            } else {
                f311268i.mo105240i("ResultsFetched:DegradedExperience");
            }
            C58485gu a = ((C113023i) this.f311283q.mo27525b()).mo99819a(esVar);
            if (!a.isEmpty()) {
                ((C112694be) this.f311287u.mo27525b()).mo99658i();
                if (this.f311284r.f313119b.get() < j) {
                    this.f311290x.clear();
                    this.f311280n.mObservable.mo2879a();
                }
                this.f311284r.f313119b.set(j);
                if (this.f311290x.isEmpty() && !a.isEmpty()) {
                    mo99366jG(esVar.mo100118a().mo100016a(), str, j);
                }
                int size = this.f311290x.size();
                this.f311290x.addAll(a);
                C113565h hVar = this.f311280n;
                hVar.mObservable.mo2882d(size, a.size());
                ((C111806n) this.f311286t.mo27525b()).mo99251b(this.f311290x);
                Optional empty = Optional.empty();
                if (esVar.mo100128i().isPresent() && !((List) esVar.mo100128i().get()).isEmpty()) {
                    empty = Optional.m71637of((String) ((List) esVar.mo100128i().get()).get(0));
                }
                C113408es esVar2 = esVar;
                ((C112685aw) this.f311288v.mo27525b()).mo99635j(esVar2, empty, esVar.mo100124f(), esVar.mo100122e(), a);
                if (this.f311277k.mo79746e(C90063do.f249493ea)) {
                    ((C111771e) this.f311285s.mo27525b()).mo99228c(esVar, this.f311290x, str, esVar.mo100133n());
                }
                if (this.f311275h.isPresent()) {
                    ((RecyclerView) this.f311275h.get()).scrollToPosition(0);
                }
            }
        }
    }

    /* renamed from: y */
    public final boolean mo99368y() {
        return true;
    }
}
