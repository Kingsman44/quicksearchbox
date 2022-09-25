package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l;

import com.google.android.apps.gsa.nga.api.C74737q;
import com.google.android.apps.gsa.nga.engine.p5913am.p5935p.C74946b;
import com.google.android.apps.gsa.nga.engine.p5913am.p5941w.C74970a;
import com.google.android.apps.gsa.nga.engine.p5913am.p5941w.p5942a.C74975e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78261k;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80832ak;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80833al;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80838aq;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.ak */
/* compiled from: PG */
public final class C78632ak implements C78261k, C74970a {

    /* renamed from: a */
    public static final C59071e f216521a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.l.ak");

    /* renamed from: b */
    public final C83357g f216522b = new C83361k(false, C78263m.class);

    /* renamed from: c */
    public final C83357g f216523c = new C83361k(false, C78263m.class);

    /* renamed from: d */
    public final C81564g f216524d;

    /* renamed from: e */
    public C74737q f216525e;

    /* renamed from: f */
    public final C74975e f216526f;

    /* renamed from: g */
    private final C22871g f216527g;

    /* renamed from: h */
    private final C74946b f216528h;

    public C78632ak(C22871g gVar, C81564g gVar2, C74946b bVar, C74975e eVar) {
        this.f216527g = gVar;
        this.f216524d = gVar2;
        this.f216528h = bVar;
        this.f216526f = eVar;
    }

    /* renamed from: a */
    public final void mo73245a() {
        this.f216527g.mo28212l("[NGA] NgaRemoteAssistUiController.clearIAssistUiStateCallback", new C78628ag(this));
    }

    /* renamed from: b */
    public final void mo73246b(C74737q qVar) {
        this.f216527g.mo28212l("[NGA] NgaRemoteAssistUiController.setIAssistUiStateCallback", new C78627af(this, qVar));
    }

    /* renamed from: c */
    public final void mo73558c() {
        ((C59052c) ((C59052c) f216521a.mo56224b()).mo56372aa(5258)).mo56386p("clearCallbackInternal");
        C81564g gVar = this.f216524d;
        C80832ak akVar = (C80832ak) C80833al.f221756c.createBuilder();
        C80838aq aqVar = C80838aq.f221767a;
        akVar.copyOnWrite();
        C80833al alVar = (C80833al) akVar.instance;
        aqVar.getClass();
        alVar.f221759b = aqVar;
        alVar.f221758a = 2;
        gVar.mo73553b((C80833al) akVar.build());
        this.f216522b.mo76660b(false);
        this.f216523c.mo76660b(false);
        this.f216525e = null;
        this.f216526f.mo71359b(this);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo71356d() {
    }

    /* renamed from: e */
    public final void mo71357e() {
        ((C59052c) ((C59052c) f216521a.mo56224b()).mo56372aa(5264)).mo56386p("onSearchProcessDied");
        this.f216528h.mo71314d();
        this.f216527g.mo28212l("[NGA] NgaRemoteAssistUiController.onSearchProcessDied", new C78630ai(this));
    }
}
