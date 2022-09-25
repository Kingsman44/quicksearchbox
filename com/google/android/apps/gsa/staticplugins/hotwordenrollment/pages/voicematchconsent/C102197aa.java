package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent;

import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.aa */
/* compiled from: PG */
final class C102197aa implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ScrollView f285139a;

    /* renamed from: b */
    final /* synthetic */ C102226z f285140b;

    public C102197aa(C102226z zVar, ScrollView scrollView) {
        this.f285140b = zVar;
        this.f285139a = scrollView;
    }

    public final void onGlobalLayout() {
        this.f285139a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f285140b.mo93014f();
    }
}
