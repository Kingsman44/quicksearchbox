package com.google.android.libraries.onegoogle.tooltip;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.n */
/* compiled from: PG */
final class C31078n implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C31079o f83716a;

    public C31078n(C31079o oVar) {
        this.f83716a = oVar;
    }

    public final void onGlobalLayout() {
        if (((SelectedAccountDisc) this.f83716a.f83717a).f81902c.getVisibility() != 0) {
            this.f83716a.mo36806a();
        }
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f83716a.mo36806a();
    }
}
