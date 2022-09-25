package android.support.p033v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v7.view.menu.f */
/* compiled from: PG */
final class C0466f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C0471k f1600a;

    public C0466f(C0471k kVar) {
        this.f1600a = kVar;
    }

    public final void onGlobalLayout() {
        if (this.f1600a.mo1577x() && this.f1600a.f1611b.size() > 0 && !((C0470j) this.f1600a.f1611b.get(0)).f1607a.f2365p) {
            View view = this.f1600a.f1613d;
            if (view == null || !view.isShown()) {
                this.f1600a.mo1575m();
                return;
            }
            for (C0470j jVar : this.f1600a.f1611b) {
                jVar.f1607a.mo1576v();
            }
        }
    }
}
