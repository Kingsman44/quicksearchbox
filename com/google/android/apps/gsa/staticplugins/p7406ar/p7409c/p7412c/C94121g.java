package com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7412c;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.c.c.g */
/* compiled from: PG */
final class C94121g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C89849ae f262945a;

    /* renamed from: b */
    final /* synthetic */ View f262946b;

    /* renamed from: c */
    final /* synthetic */ C94124j f262947c;

    public C94121g(C94124j jVar, C89849ae aeVar, View view) {
        this.f262947c = jVar;
        this.f262945a = aeVar;
        this.f262946b = view;
    }

    public final void onGlobalLayout() {
        ((C89859i) this.f262947c.f262959d.mo27525b()).mo83702b(this.f262945a);
        this.f262946b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
