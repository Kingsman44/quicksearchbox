package com.google.android.apps.gsa.plugins.nativeresults.canvas;

import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.C0320v;
import com.google.android.libraries.componentview.components.p1682a.C19830p;
import com.google.android.libraries.componentview.components.p1682a.C19831q;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.c */
/* compiled from: PG */
final class C84099c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C84108l f229012a;

    public C84099c(C84108l lVar) {
        this.f229012a = lVar;
    }

    public final void run() {
        C19830p pVar = this.f229012a.f229029h;
        pVar.getClass();
        C19831q qVar = pVar.f55419a;
        qVar.f55435e = true;
        if (qVar.f55432b.mo25497a() >= 0) {
            C19831q qVar2 = pVar.f55419a;
            qVar2.f55438h = qVar2.f55432b.mo25497a();
        }
        pVar.f55419a.mo25140k();
        C19831q qVar3 = pVar.f55419a;
        if (qVar3.f55436f) {
            qVar3.f55432b.mo25503g();
            pVar.f55419a.f55436f = false;
        }
        if (this.f229012a.mo77538k()) {
            C0320v vVar = this.f229012a.f229026e;
            vVar.getClass();
            if (vVar.mo1036d() != null) {
                C84108l lVar = this.f229012a;
                C0310l lVar2 = lVar.f229028g;
                C0320v vVar2 = lVar.f229026e;
                vVar2.getClass();
                lVar2.mo1005d(vVar2.mo1036d());
            }
            C0320v vVar3 = this.f229012a.f229026e;
            vVar3.getClass();
            if (vVar3.mo1038f() != null) {
                C84108l lVar3 = this.f229012a;
                C0310l lVar4 = lVar3.f229028g;
                C0320v vVar4 = lVar3.f229026e;
                vVar4.getClass();
                lVar4.mo1006e(vVar4.mo1038f());
            }
        }
    }
}
