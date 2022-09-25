package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a;

import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.C78728n;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6166a.C78238b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6191b.C78649e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6197n.C78738d;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80577k;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80578l;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80587u;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80665au;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80716cr;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80721cw;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80722cx;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80859e;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80864j;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80865k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.p */
/* compiled from: PG */
public final class C78513p implements C78238b, C78728n, C78738d {

    /* renamed from: c */
    private static final C59071e f216232c = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.h.a.p");

    /* renamed from: a */
    public final C83357g f216233a = new C83361k(Optional.empty(), C78263m.class);

    /* renamed from: b */
    public String f216234b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private final C83363m f216235d = new C83363m();

    /* renamed from: e */
    private final C22871g f216236e;

    /* renamed from: f */
    private final C83358h f216237f;

    /* renamed from: g */
    private final C78649e f216238g;

    public C78513p(C22871g gVar, C83358h hVar, C78649e eVar) {
        this.f216236e = gVar;
        this.f216237f = hVar;
        this.f216238g = eVar;
    }

    /* renamed from: a */
    public final void mo73151a(Intent intent) {
        String stringExtra = intent.getStringExtra("extra_query");
        e a = e.a(intent.getIntExtra("extra_trigger_type", e.R.ca));
        if (stringExtra == null) {
            ((C59052c) ((C59052c) f216232c.mo56226d()).mo56372aa(5109)).mo56386p("Intent does not contain extra_query");
        } else if (stringExtra.equals(this.f216234b)) {
            ((C59052c) ((C59052c) f216232c.mo56226d()).mo56372aa(5108)).mo56386p("Received same suggestionQuery as was already executed. Dropping.");
        } else {
            this.f216234b = stringExtra;
            C78649e eVar = this.f216238g;
            if (a != e.bb) {
                a = e.R;
            }
            eVar.f216545a.mo72851e(stringExtra, a);
        }
    }

    /* renamed from: b */
    public final void mo73160b(C80721cw cwVar, C80587u uVar, Optional optional, String str, String str2, String str3, Optional optional2, e eVar) {
        C22871g gVar = this.f216236e;
        C83357g gVar2 = this.f216233a;
        C80716cr p = C80722cx.m128539p();
        p.mo74483g(true);
        p.mo74482f(false);
        p.mo74485i(cwVar);
        p.mo74484h(false);
        ((C80665au) p).f221455e = uVar;
        p.mo74481e(str);
        p.mo74488l(str2);
        p.mo74480d(optional);
        C80859e eVar2 = (C80859e) C80831aj.f221751c.createBuilder();
        C80864j jVar = (C80864j) C80865k.f221810c.createBuilder();
        C80577k kVar = (C80577k) C80578l.f221173g.createBuilder();
        kVar.copyOnWrite();
        C80578l lVar = (C80578l) kVar.instance;
        str3.getClass();
        lVar.f221175a = 2;
        lVar.f221176b = str3;
        jVar.copyOnWrite();
        C80578l lVar2 = (C80578l) kVar.build();
        lVar2.getClass();
        ((C80865k) jVar.instance).f221812a = lVar2;
        int i = eVar.ca;
        jVar.copyOnWrite();
        ((C80865k) jVar.instance).f221813b = i;
        eVar2.copyOnWrite();
        C80831aj ajVar = (C80831aj) eVar2.instance;
        C80865k kVar2 = (C80865k) jVar.build();
        kVar2.getClass();
        ajVar.f221754b = kVar2;
        ajVar.f221753a = 2;
        p.mo74479c((C80831aj) eVar2.build());
        p.mo74489m(optional2);
        C83349aj.m132647b(gVar, gVar2, Optional.m71637of(p.mo74477a()), "onNewFreSuggestionQuery");
    }

    /* renamed from: h */
    public final void mo73112h() {
        this.f216233a.mo76660b(Optional.empty());
        this.f216235d.mo76661a();
    }

    /* renamed from: i */
    public final void mo73113i() {
        this.f216235d.mo76663c(this.f216237f, new C78512o(this));
    }

    /* renamed from: j */
    public final /* synthetic */ void mo73114j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo73115k() {
    }
}
