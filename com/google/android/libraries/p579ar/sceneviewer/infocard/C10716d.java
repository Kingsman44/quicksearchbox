package com.google.android.libraries.p579ar.sceneviewer.infocard;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.libraries.ar.sceneviewer.infocard.d */
/* compiled from: PG */
final class C10716d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ int f35645a;

    /* renamed from: b */
    final /* synthetic */ BottomViewGroup f35646b;

    public C10716d(BottomViewGroup bottomViewGroup, int i) {
        this.f35646b = bottomViewGroup;
        this.f35645a = i;
    }

    public final void onGlobalLayout() {
        this.f35646b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f35646b.setHeight(this.f35645a);
    }
}
