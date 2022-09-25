package com.google.android.apps.gsa.nga.engine.p5964av.p5967c.p5969b;

import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.engine.av.c.b.k */
/* compiled from: PG */
public final /* synthetic */ class C75137k implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C75139m f209536a;

    public /* synthetic */ C75137k(C75139m mVar) {
        this.f209536a = mVar;
    }

    public final void run() {
        C75139m mVar = this.f209536a;
        C75077bo a = mVar.f209540c.mo71417a();
        if (a.mo71458b().a() && !a.mo71470p()) {
            mVar.f209538a.e(C89849ae.NGA_PAUSED_AUDIO_PLAYING, C83016y.AUDIO_PLAYING);
        }
    }
}
