package com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8074c;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.c.i */
/* compiled from: PG */
final class C103426i implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ View f288275a;

    /* renamed from: b */
    final /* synthetic */ Runnable f288276b;

    public C103426i(View view, Runnable runnable) {
        this.f288275a = view;
        this.f288276b = runnable;
    }

    public final boolean onPreDraw() {
        this.f288275a.getViewTreeObserver().removeOnPreDrawListener(this);
        C103427j.m171362e(((C103422e) this.f288276b).f288270a);
        return true;
    }
}
