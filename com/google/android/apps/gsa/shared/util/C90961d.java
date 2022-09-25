package com.google.android.apps.gsa.shared.util;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.shared.util.d */
/* compiled from: PG */
final class C90961d implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C91033e f254173a;

    public C90961d(C91033e eVar) {
        this.f254173a = eVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f254173a.mo85311a(view);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f254173a.mo85311a((View) null);
    }
}
