package com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c;

import android.view.View;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.c.j */
/* compiled from: PG */
final class C30563j implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f82579a;

    /* renamed from: b */
    final /* synthetic */ Runnable f82580b;

    public C30563j(View view, Runnable runnable) {
        this.f82579a = view;
        this.f82580b = runnable;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f82579a.removeOnAttachStateChangeListener(this);
        this.f82580b.run();
    }
}
