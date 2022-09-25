package com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6153d;

import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.av.bn;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75157e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6150a.C78109a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6150a.C78110b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6150a.C78112d;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.d.d.a */
/* compiled from: PG */
public final class C78150a implements C75157e, C78112d {

    /* renamed from: a */
    private final C83357g f215180a;

    /* renamed from: b */
    private final C22871g f215181b;

    /* renamed from: c */
    private final C78156g f215182c;

    /* renamed from: d */
    private final C78162m f215183d;

    public C78150a(C22871g gVar, C78156g gVar2, C78162m mVar) {
        bn j = C75077bo.m121355j();
        j.h(bl.c);
        j.d(C83016y.UNKNOWN);
        C75077bo b = j.b();
        bn j2 = C75077bo.m121355j();
        j2.h(bl.c);
        j2.d(C83016y.UNKNOWN);
        this.f215180a = new C83361k(new C78109a(b, j2.b()), C78110b.class);
        this.f215181b = gVar;
        this.f215182c = gVar2;
        this.f215183d = mVar;
    }

    /* renamed from: a */
    public final void mo71137a(C75077bo boVar, C75077bo boVar2) {
        C83349aj.m132647b(this.f215181b, this.f215180a, new C78109a(boVar2, boVar), "stateChange");
        C78156g gVar = this.f215182c;
        gVar.f215200b.mo28212l("[NGA] onActiveStateChangeEvent", new C78155f(gVar, boVar));
        C78162m mVar = this.f215183d;
        if (!boVar.mo71458b().equals(bl.d)) {
            C83349aj.m132647b(mVar.f215218b, mVar.f215217a, false, "ttsIsPlaying");
        }
        mVar.f215219c = boVar;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo71138b(bl blVar) {
    }

    /* renamed from: c */
    public final C83358h mo73079c() {
        return this.f215180a;
    }
}
