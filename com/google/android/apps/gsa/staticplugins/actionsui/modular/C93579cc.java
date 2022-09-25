package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.cc */
/* compiled from: PG */
final class C93579cc implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C93583cg f261274a;

    public C93579cc(C93583cg cgVar) {
        this.f261274a = cgVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f261274a.sendAccessibilityEvent(8);
        this.f261274a.mo82070ij();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f261274a.mo82069id();
    }
}
