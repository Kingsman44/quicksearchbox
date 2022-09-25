package android.support.p033v7.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.widget.bb */
/* compiled from: PG */
final class C0532bb implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f2099a;

    /* renamed from: b */
    final /* synthetic */ C0533bc f2100b;

    public C0532bb(C0533bc bcVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f2100b = bcVar;
        this.f2099a = onGlobalLayoutListener;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2100b.f2104d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2099a);
        }
    }
}
