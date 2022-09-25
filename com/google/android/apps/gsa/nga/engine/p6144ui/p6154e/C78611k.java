package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e;

import com.google.android.apps.gsa.nga.api.a.au;
import com.google.android.apps.gsa.nga.api.a.bf;
import com.google.android.apps.gsa.nga.engine.p5913am.p5941w.C74970a;
import com.google.android.apps.gsa.nga.engine.p5913am.p5941w.p5942a.C74975e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78227c;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78256f;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58528ij;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.k */
/* compiled from: PG */
public final class C78611k implements C78728n, C78256f, C74970a {

    /* renamed from: a */
    public final C83363m f216423a = new C83363m();

    /* renamed from: b */
    public final C83358h f216424b;

    /* renamed from: c */
    public final C74975e f216425c;

    /* renamed from: d */
    private final C83363m f216426d = new C83363m();

    /* renamed from: e */
    private final C22871g f216427e;

    /* renamed from: f */
    private final C58528ij f216428f;

    /* renamed from: g */
    private final C83357g f216429g;

    /* renamed from: h */
    private int f216430h;

    public C78611k(C83358h hVar, C83358h hVar2, C78227c cVar, C83358h hVar3, C83358h hVar4, C22871g gVar, Set set, C74975e eVar) {
        C83361k kVar = new C83361k(false, C78263m.class);
        this.f216429g = kVar;
        this.f216430h = 0;
        this.f216427e = gVar;
        this.f216428f = C58528ij.m90006F(set);
        this.f216425c = eVar;
        C83358h hVar5 = hVar3;
        C83358h k = C83349aj.m132656k(kVar, hVar3, C78228d.f215369a);
        C83358h hVar6 = hVar;
        C83358h hVar7 = hVar2;
        C83358h hVar8 = hVar4;
        this.f216424b = C83349aj.m132652g(C83349aj.m132656k(kVar, hVar, C78235e.f215376a), k, C83349aj.m132658m(hVar2, C78265f.f215407a), C83349aj.m132658m(hVar4, C78270g.f215419a), cVar.mo73141a(), cVar.mo73142b(), C78275h.f215554a);
    }

    /* renamed from: a */
    public final void mo73551a(bf bfVar) {
        au builder = bfVar.toBuilder();
        int i = this.f216430h;
        builder.copyOnWrite();
        bf bfVar2 = builder.instance;
        bfVar2.a |= 4;
        bfVar2.d = i;
        this.f216430h++;
        Collection.EL.stream(this.f216428f).forEach(new C78187c(builder.build()));
    }

    /* renamed from: b */
    public final void mo73230b() {
        this.f216427e.mo28212l("[NGA] NgaToOpaCardStateCollector.onAssistantDisabled", new C78580j(this));
    }

    /* renamed from: c */
    public final void mo73231c() {
        this.f216427e.mo28212l("[NGA] NgaToOpaCardStateCollector.onAssistantEnabled", new C78164a(this));
    }

    /* renamed from: d */
    public final void mo71356d() {
        this.f216427e.mo28212l("[NGA] NgaToOpaCardStateCollector.onSearchProcessAlive", new C78176b(this));
    }

    /* renamed from: e */
    public final /* synthetic */ void mo71357e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo73232f() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo73233g() {
    }

    /* renamed from: h */
    public final void mo73112h() {
        this.f216429g.mo76660b(false);
        this.f216426d.mo76661a();
    }

    /* renamed from: i */
    public final void mo73113i() {
        this.f216429g.mo76660b(true);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo73114j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo73115k() {
    }
}
