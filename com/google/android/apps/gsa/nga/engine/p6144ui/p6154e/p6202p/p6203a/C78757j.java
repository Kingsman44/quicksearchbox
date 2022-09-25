package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6202p.p6203a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.C78728n;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78262l;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78246e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6202p.C78759b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6221w.C78850a;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80795fp;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80796fq;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.p.a.j */
/* compiled from: PG */
public final class C78757j implements C78262l, C78759b, C78728n {

    /* renamed from: a */
    public static final C59071e f216807a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.p.a.j");

    /* renamed from: b */
    public final C83357g f216808b = new C83361k(false, C78263m.class);

    /* renamed from: c */
    public final C22871g f216809c;

    /* renamed from: d */
    public final C91142g f216810d;

    /* renamed from: e */
    public SettableFuture f216811e;

    /* renamed from: f */
    private final C78246e f216812f;

    /* renamed from: g */
    private final C78850a f216813g;

    /* renamed from: h */
    private final C83363m f216814h;

    public C78757j(C22871g gVar, C78246e eVar, C78850a aVar, C91142g gVar2) {
        this.f216809c = gVar;
        this.f216812f = eVar;
        this.f216813g = aVar;
        this.f216814h = new C83363m();
        this.f216810d = gVar2;
    }

    /* renamed from: a */
    public final C83358h mo73247a() {
        return this.f216808b;
    }

    /* renamed from: b */
    public final C60870cx mo73248b() {
        SettableFuture settableFuture = new SettableFuture();
        this.f216811e = settableFuture;
        this.f216809c.mo28212l("[NGA] restoreUiAfterScreenshot", new C78756i(this, settableFuture));
        return settableFuture;
    }

    /* renamed from: c */
    public final void mo73249c() {
        this.f216809c.mo28212l("[NGA] restoreUiAfterScreenshot", new C78753f(this));
    }

    /* renamed from: d */
    public final void mo73606d(boolean z) {
        if (z) {
            mo73608f();
        }
    }

    /* renamed from: e */
    public final void mo73607e() {
        SettableFuture settableFuture = this.f216811e;
        if (settableFuture != null && !settableFuture.isDone()) {
            this.f216811e.cancel(true);
            this.f216811e = null;
        }
    }

    /* renamed from: f */
    public final void mo73608f() {
        SettableFuture settableFuture = this.f216811e;
        if (settableFuture != null && !settableFuture.isDone()) {
            this.f216811e.mo57356n(C118826c.f331422a);
            this.f216811e = null;
        }
    }

    /* renamed from: g */
    public final void mo73609g(boolean z) {
        C78850a aVar = this.f216813g;
        C80795fp fpVar = (C80795fp) C80796fq.f221715c.createBuilder();
        fpVar.copyOnWrite();
        C80796fq fqVar = (C80796fq) fpVar.instance;
        fqVar.f221717a |= 1;
        fqVar.f221718b = z;
        aVar.mo73671u((C80796fq) fpVar.build());
    }

    /* renamed from: h */
    public final void mo73112h() {
        this.f216814h.mo76661a();
        mo73607e();
    }

    /* renamed from: i */
    public final void mo73113i() {
        this.f216814h.mo76663c(this.f216812f.mo73191c(), new C78755h(this));
    }

    /* renamed from: j */
    public final /* synthetic */ void mo73114j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo73115k() {
    }
}
