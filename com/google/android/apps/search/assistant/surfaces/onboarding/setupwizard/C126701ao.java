package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ao */
/* compiled from: PG */
final class C126701ao implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ViewTreeObserver.OnDrawListener f348928a;

    /* renamed from: b */
    final /* synthetic */ C126702ap f348929b;

    public C126701ao(C126702ap apVar, ViewTreeObserver.OnDrawListener onDrawListener) {
        this.f348929b = apVar;
        this.f348928a = onDrawListener;
    }

    public final void onGlobalLayout() {
        C126702ap apVar = this.f348929b;
        if (apVar.f348933d) {
            apVar.f348931b.getViewTreeObserver().removeOnDrawListener(this.f348928a);
            this.f348929b.f348931b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
