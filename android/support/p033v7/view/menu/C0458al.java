package android.support.p033v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v7.view.menu.al */
/* compiled from: PG */
final class C0458al implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C0459am f1566a;

    public C0458al(C0459am amVar) {
        this.f1566a = amVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f1566a.f1570d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1566a.f1570d = view.getViewTreeObserver();
            }
            C0459am amVar = this.f1566a;
            amVar.f1570d.removeGlobalOnLayoutListener(amVar.f1568b);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
