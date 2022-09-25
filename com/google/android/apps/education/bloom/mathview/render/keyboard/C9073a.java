package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.view.View;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.a */
/* compiled from: PG */
public final class C9073a implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C9082c f31313a;

    public C9073a(C9082c cVar) {
        this.f31313a = cVar;
    }

    public final void onViewAttachedToWindow(View view) {
        C69664n.m101061g(view, "view");
        view.removeOnAttachStateChangeListener(this);
        this.f31313a.mo17401c(view);
    }

    public final void onViewDetachedFromWindow(View view) {
        C69664n.m101061g(view, "view");
        view.removeOnLayoutChangeListener(this.f31313a.f31328e);
        this.f31313a.f31326c.remove(view.getId());
        this.f31313a.f31327d.remove(view.getId());
    }
}
