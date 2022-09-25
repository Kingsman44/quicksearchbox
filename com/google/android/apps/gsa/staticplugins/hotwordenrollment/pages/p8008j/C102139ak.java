package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.ak */
/* compiled from: PG */
final class C102139ak implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ScrollView f284937a;

    /* renamed from: b */
    final /* synthetic */ C102140al f284938b;

    public C102139ak(C102140al alVar, ScrollView scrollView) {
        this.f284938b = alVar;
        this.f284937a = scrollView;
    }

    public final void onGlobalLayout() {
        this.f284937a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f284938b.mo92905b();
    }
}
