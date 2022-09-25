package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.p6160a;

import com.google.android.apps.gsa.nga.engine.an.a;
import com.google.android.apps.gsa.nga.engine.p5946an.C74981b;
import com.google.android.apps.gsa.nga.engine.p6044n.p6054f.C76455a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.C78728n;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80109ax;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80472k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

@Deprecated
/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.c.a.ah */
/* compiled from: PG */
public final class C78197ah implements C78728n {

    /* renamed from: a */
    public static final C59071e f215300a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.c.a.ah");

    /* renamed from: b */
    public final C83357g f215301b;

    /* renamed from: c */
    public final C83358h f215302c;

    /* renamed from: d */
    public final C22871g f215303d;

    /* renamed from: e */
    private final C83358h f215304e;

    /* renamed from: f */
    private final C83358h f215305f;

    /* renamed from: g */
    private final C83363m f215306g = new C83363m();

    /* renamed from: h */
    private final C74981b f215307h;

    public C78197ah(C22871g gVar, C74981b bVar, C83358h hVar, C83358h hVar2) {
        C83361k kVar = new C83361k(false, C78263m.class);
        this.f215301b = kVar;
        this.f215303d = gVar;
        this.f215307h = bVar;
        this.f215305f = hVar2;
        this.f215304e = hVar;
        this.f215302c = C83349aj.m132658m(kVar, C78196ag.f215299a);
    }

    /* renamed from: a */
    public final void mo73136a() {
        C74981b bVar = this.f215307h;
        C22871g gVar = bVar.f209202b;
        C76455a aVar = bVar.f209201a;
        C80472k kVar = (C80472k) C80136bn.f219915c.createBuilder();
        C80109ax axVar = C80109ax.f219819a;
        kVar.copyOnWrite();
        C80136bn bnVar = (C80136bn) kVar.instance;
        axVar.getClass();
        bnVar.f219918b = axVar;
        bnVar.f219917a = 23;
        new C90873ag(gVar.mo28209i(aVar.mo72193d((C80136bn) kVar.build(), Optional.empty()), "[NGA] InteractorSnapshotStatusProvider.getSnapshotStatus", a.a), this.f215303d, "[NGA] SnapshotStateObserver.onEnabled", new C78192ac(this)).mo85223a(new C78193ad(this));
    }

    /* renamed from: h */
    public final void mo73112h() {
        this.f215306g.mo76661a();
    }

    /* renamed from: i */
    public final void mo73113i() {
        mo73136a();
        this.f215306g.mo76663c(this.f215304e, new C78194ae(this));
        this.f215306g.mo76663c(this.f215305f, new C78195af(this));
    }

    /* renamed from: j */
    public final /* synthetic */ void mo73114j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo73115k() {
    }
}
