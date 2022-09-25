package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6155a.p6156a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.C78728n;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6155a.C78165a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6155a.C78175b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6221w.C78850a;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.a.a.h */
/* compiled from: PG */
public final class C78173h implements C78165a, C78175b, C78728n {

    /* renamed from: a */
    public final C78850a f215238a;

    /* renamed from: b */
    public final C83357g f215239b = new C83361k(false, C78263m.class);

    /* renamed from: c */
    public final C83357g f215240c = new C83361k(false, C78263m.class);

    /* renamed from: d */
    private final C22871g f215241d;

    /* renamed from: e */
    private final C83363m f215242e = new C83363m();

    /* renamed from: f */
    private final C83358h f215243f;

    public C78173h(C78850a aVar, C22871g gVar, C83358h hVar) {
        this.f215238a = aVar;
        this.f215241d = gVar;
        this.f215243f = hVar;
    }

    /* renamed from: a */
    public final void mo73108a() {
        this.f215241d.mo28212l("[NGA] send onTtsFinished change", new C78169d(this));
    }

    /* renamed from: b */
    public final void mo73109b() {
        this.f215241d.mo28212l("[NGA] send onTtsStarted change", new C78170e(this));
    }

    /* renamed from: c */
    public final C83358h mo73110c() {
        return this.f215240c;
    }

    /* renamed from: d */
    public final C83358h mo73111d() {
        return this.f215239b;
    }

    /* renamed from: h */
    public final void mo73112h() {
        this.f215242e.mo76661a();
    }

    /* renamed from: i */
    public final void mo73113i() {
        this.f215242e.mo76663c(this.f215243f, new C78171f(this));
        this.f215242e.mo76663c(this.f215239b, new C78172g(this));
    }

    /* renamed from: j */
    public final /* synthetic */ void mo73114j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo73115k() {
    }
}
