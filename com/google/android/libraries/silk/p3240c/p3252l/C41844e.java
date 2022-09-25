package com.google.android.libraries.silk.p3240c.p3252l;

import android.view.View;

/* renamed from: com.google.android.libraries.silk.c.l.e */
/* compiled from: PG */
final class C41844e implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C41845f f109226a;

    public C41844e(C41845f fVar) {
        this.f109226a = fVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f109226a.f109228b.f109229a.mo44353b();
        view.removeOnAttachStateChangeListener(this);
    }
}
