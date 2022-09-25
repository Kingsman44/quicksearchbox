package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.af */
/* compiled from: PG */
final class C102399af implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C102401ah f285793a;

    public C102399af(C102401ah ahVar) {
        this.f285793a = ahVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f285793a.sendAccessibilityEvent(8);
        this.f285793a.mo82070ij();
    }

    public final void onViewDetachedFromWindow(View view) {
        C102416f.m169820f();
        this.f285793a.mo82069id();
    }
}
