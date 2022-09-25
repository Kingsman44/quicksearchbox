package com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.immersiveactions.C102416f;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian.i */
/* compiled from: PG */
final class C102441i implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C102443k f285904a;

    public C102441i(C102443k kVar) {
        this.f285904a = kVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f285904a.sendAccessibilityEvent(8);
        this.f285904a.mo82070ij();
    }

    public final void onViewDetachedFromWindow(View view) {
        C102416f.m169820f();
        this.f285904a.mo82069id();
    }
}
