package android.support.p033v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v7.view.menu.ak */
/* compiled from: PG */
final class C0457ak implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C0459am f1565a;

    public C0457ak(C0459am amVar) {
        this.f1565a = amVar;
    }

    public final void onGlobalLayout() {
        if (this.f1565a.mo1577x()) {
            C0459am amVar = this.f1565a;
            if (!amVar.f1567a.f2365p) {
                View view = amVar.f1569c;
                if (view == null || !view.isShown()) {
                    this.f1565a.mo1575m();
                } else {
                    this.f1565a.f1567a.mo1576v();
                }
            }
        }
    }
}
