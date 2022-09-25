package com.google.android.apps.gsa.nga.engine.p5964av.p5967c.p5969b;

import com.google.android.apps.gsa.nga.engine.av.c.a.d;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.engine.av.c.b.w */
/* compiled from: PG */
public final /* synthetic */ class C75143w implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C75145y f209548a;

    public /* synthetic */ C75143w(C75145y yVar) {
        this.f209548a = yVar;
    }

    public final void run() {
        C75145y yVar = this.f209548a;
        boolean z = false;
        if (yVar.f209555f.mo71417a().mo71471q()) {
            d dVar = yVar.f209553d;
            if (dVar.f.mo85405j(C90126fx.f251017aq) && dVar.f.mo85405j(C90126fx.f250976aB)) {
                z = true;
            }
        }
        if (yVar.f209553d.c() || z) {
            yVar.f209551b.b(C83016y.SHUT_DOWN_GESTURE, C83320io.f227132d);
            yVar.f209550a.e(C89849ae.NGA_PAUSED_SHUTDOWN_GESTURE, C83016y.SHUT_DOWN_GESTURE);
        }
    }
}
