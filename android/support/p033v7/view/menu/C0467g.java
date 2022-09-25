package android.support.p033v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v7.view.menu.g */
/* compiled from: PG */
final class C0467g implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C0471k f1601a;

    public C0467g(C0471k kVar) {
        this.f1601a = kVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f1601a.f1614e;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1601a.f1614e = view.getViewTreeObserver();
            }
            C0471k kVar = this.f1601a;
            kVar.f1614e.removeGlobalOnLayoutListener(kVar.f1612c);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
