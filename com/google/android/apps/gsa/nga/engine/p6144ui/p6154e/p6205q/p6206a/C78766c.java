package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6205q.p6206a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.C78728n;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6189a.C78619a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6205q.C78763a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6221w.C78850a;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80985e;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80987g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.q.a.c */
/* compiled from: PG */
public final class C78766c implements C78763a, C78728n {

    /* renamed from: a */
    public final C83358h f216824a;

    /* renamed from: b */
    private final C83357g f216825b;

    /* renamed from: c */
    private final C83357g f216826c;

    /* renamed from: d */
    private final C83357g f216827d;

    /* renamed from: e */
    private final C22871g f216828e;

    /* renamed from: f */
    private final C80987g f216829f;

    /* renamed from: g */
    private final C78850a f216830g;

    /* renamed from: h */
    private final C83363m f216831h = new C83363m();

    /* renamed from: i */
    private final C78619a f216832i;

    public C78766c(C22871g gVar, C80987g gVar2, C83358h hVar, C78619a aVar, C78850a aVar2) {
        C83361k kVar = new C83361k(true, C78263m.class);
        this.f216825b = kVar;
        C83361k kVar2 = new C83361k(false, C78263m.class);
        this.f216826c = kVar2;
        C83361k kVar3 = new C83361k(false, C78263m.class);
        this.f216827d = kVar3;
        this.f216828e = gVar;
        this.f216829f = gVar2;
        this.f216832i = aVar;
        this.f216830g = aVar2;
        this.f216824a = C83349aj.m132654i(kVar, hVar, kVar2, kVar3, C78764a.f216822a);
    }

    /* renamed from: g */
    public final void mo73610g(boolean z) {
        C83349aj.m132647b(this.f216828e, this.f216827d, Boolean.valueOf(z), "isScreenOn");
    }

    /* renamed from: gM */
    public final void mo73611gM(boolean z) {
        C83349aj.m132647b(this.f216828e, this.f216825b, Boolean.valueOf(!z), "isScreenLocked");
    }

    /* renamed from: h */
    public final void mo73112h() {
        this.f216831h.mo76661a();
    }

    /* renamed from: i */
    public final void mo73113i() {
        this.f216832i.mo73554a();
        this.f216832i.mo73555b();
        this.f216825b.mo76660b(Boolean.valueOf(this.f216832i.mo73554a()));
        this.f216827d.mo76660b(Boolean.valueOf(this.f216832i.mo73555b()));
        C83363m mVar = this.f216831h;
        C83358h hVar = this.f216824a;
        C78850a aVar = this.f216830g;
        Objects.requireNonNull(aVar);
        mVar.mo76663c(hVar, new C78765b(aVar));
    }

    /* renamed from: j */
    public final /* synthetic */ void mo73114j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo73115k() {
    }

    /* renamed from: p */
    public final void mo73612p(Optional optional) {
        C83349aj.m132647b(this.f216828e, this.f216826c, Boolean.valueOf(this.f216829f.mo74766b().equals(C80985e.IN_FOREGROUND)), "isHomeScreen");
    }
}
