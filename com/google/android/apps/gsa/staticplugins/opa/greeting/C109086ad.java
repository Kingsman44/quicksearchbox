package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.ad */
/* compiled from: PG */
final class C109086ad implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C109100ar f303715a;

    public C109086ad(C109100ar arVar) {
        this.f303715a = arVar;
    }

    public final void onGlobalLayout() {
        this.f303715a.f303763ab.mo97162b();
        this.f303715a.f303770c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
