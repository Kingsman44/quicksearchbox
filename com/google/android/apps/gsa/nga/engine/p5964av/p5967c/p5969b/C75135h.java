package com.google.android.apps.gsa.nga.engine.p5964av.p5967c.p5969b;

import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.search.p2904c.C37672hs;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.av.c.b.h */
/* compiled from: PG */
public final /* synthetic */ class C75135h implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C75136i f209530a;

    public /* synthetic */ C75135h(C75136i iVar) {
        this.f209530a = iVar;
    }

    public final void run() {
        C75136i iVar = this.f209530a;
        Optional d = iVar.f209535e.mo74378d(iVar.f209534d.mo71417a().mo71465k());
        if (d.isPresent()) {
            iVar.f209531a.mo71652h((C37672hs) d.get());
        }
        C75077bo a = iVar.f209534d.mo71417a();
        if (a.mo71478x() || a.mo71475u() || !a.mo71469o()) {
            iVar.f209533c.e(C89849ae.NGA_PAUSED_BY_USER_IMPLICIT, C83016y.AUDIO_FOCUS_LOST);
        }
    }
}
