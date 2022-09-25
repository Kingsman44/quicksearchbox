package com.google.android.apps.gsa.nga.engine.p5964av.p5967c.p5969b;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78236a;
import com.google.android.apps.gsa.nga.shared.p6363s.C81457f;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.engine.av.c.b.a */
/* compiled from: PG */
public final /* synthetic */ class C75087a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ f f209386a;

    public /* synthetic */ C75087a(f fVar) {
        this.f209386a = fVar;
    }

    public final void run() {
        f fVar = this.f209386a;
        if (!fVar.f()) {
            fVar.a.e(C89849ae.NGA_PAUSED_BY_USER_IMPLICIT, C83016y.IMPLICIT_DISMISS_GESTURE);
            ((C78236a) fVar.b.mo27525b()).mo73154b();
            C81457f fVar2 = fVar.d;
            fVar2.mo75091b(fVar2.f222871a);
        }
    }
}
