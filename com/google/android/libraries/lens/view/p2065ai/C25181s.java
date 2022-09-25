package com.google.android.libraries.lens.view.p2065ai;

import android.view.View;

/* renamed from: com.google.android.libraries.lens.view.ai.s */
/* compiled from: PG */
final class C25181s implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C25183u f68583a;

    public C25181s(C25183u uVar) {
        this.f68583a = uVar;
    }

    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        this.f68583a.mo30328c();
    }

    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
    }
}
