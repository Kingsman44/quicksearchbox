package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.view.View;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.b */
/* compiled from: PG */
final class C9081b implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C9082c f31323a;

    public C9081b(C9082c cVar) {
        this.f31323a = cVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (C69664n.m101066l(this.f31323a.f31327d.get(view.getId()), view)) {
            C9082c cVar = this.f31323a;
            C69664n.m101059e(view, "null cannot be cast to non-null type T of com.google.android.apps.education.bloom.mathview.render.keyboard.AutoSizer");
            cVar.mo17402e(view);
        }
    }
}
