package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.cc */
/* compiled from: PG */
final class C126821cc implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f349256a;

    /* renamed from: b */
    final /* synthetic */ C126824cf f349257b;

    public C126821cc(C126824cf cfVar, View view) {
        this.f349257b = cfVar;
        this.f349256a = view;
    }

    public final void onGlobalLayout() {
        this.f349257b.f349266g.mo19974a(C37176a.f97324r);
        this.f349256a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
