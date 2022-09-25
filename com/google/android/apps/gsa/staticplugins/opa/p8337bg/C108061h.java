package com.google.android.apps.gsa.staticplugins.opa.p8337bg;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.gsa.search.shared.p6928f.C87547c;
import com.google.android.apps.gsa.search.shared.p6928f.C87549e;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.search.shared.service.C87681ai;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109248v;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114748b;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import dagger.p5294a.C68221g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bg.h */
/* compiled from: PG */
public final class C108061h {

    /* renamed from: a */
    public static final C59071e f300609a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bg.h");

    /* renamed from: b */
    public final C107698i f300610b;

    /* renamed from: c */
    public final C107710u f300611c;

    /* renamed from: d */
    public final C108063j f300612d;

    /* renamed from: e */
    public final C87549e f300613e;

    /* renamed from: f */
    public final C90929bz f300614f;

    /* renamed from: g */
    public final C108055b f300615g;

    /* renamed from: h */
    public final C53306j f300616h;

    /* renamed from: i */
    public final C87681ai f300617i;

    /* renamed from: j */
    public View f300618j;

    /* renamed from: k */
    public final C87547c f300619k;

    public C108061h(C87549e eVar, C90929bz bzVar, C108064k kVar, C87547c cVar, C108055b bVar, C107698i iVar, C107710u uVar, C53306j jVar, C114748b bVar2, C87681ai aiVar) {
        C108064k kVar2 = kVar;
        C53306j jVar2 = jVar;
        this.f300615g = bVar;
        this.f300610b = iVar;
        this.f300611c = uVar;
        this.f300613e = eVar;
        this.f300614f = bzVar;
        this.f300619k = cVar;
        this.f300616h = jVar2;
        this.f300617i = aiVar;
        jVar.name();
        bVar2.f318449b = jVar2;
        uVar.mo96220c(new C108057d(bVar), C88244um.START_ACTIVITY);
        Activity activity = (Activity) ((C68221g) kVar2.f300626a).f184583a;
        activity.getClass();
        C109248v vVar = (C109248v) kVar2.f300627b.mo17428b();
        vVar.getClass();
        C108055b bVar3 = (C108055b) kVar2.f300628c.mo17428b();
        bVar3.getClass();
        C58833ax axVar = (C58833ax) kVar2.f300629d.mo17428b();
        axVar.getClass();
        C87568k kVar3 = (C87568k) kVar2.f300630e.mo17428b();
        kVar3.getClass();
        this.f300612d = new C108063j(activity, vVar, bVar3, axVar, kVar3);
    }

    /* renamed from: a */
    public final void mo96387a(C108054a aVar) {
        C108063j jVar = this.f300612d;
        jVar.f300625e.mo101431u(new C108059f(this, aVar));
        this.f300612d.f300625e.mo101436z(C53270hr.REFRESH, (C53287ih) null);
    }
}
