package com.google.android.libraries.p579ar.sceneviewer.p589ui;

import android.view.ViewTreeObserver;
import com.google.p3723ar.core.viewer.jniprotolite.Types;

/* renamed from: com.google.android.libraries.ar.sceneviewer.ui.b */
/* compiled from: PG */
final class C10758b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ Types.Visibility f35718a;

    /* renamed from: b */
    final /* synthetic */ int f35719b;

    /* renamed from: c */
    final /* synthetic */ FloatingButton f35720c;

    public C10758b(FloatingButton floatingButton, Types.Visibility visibility, int i) {
        this.f35720c = floatingButton;
        this.f35718a = visibility;
        this.f35719b = i;
    }

    public final void onGlobalLayout() {
        this.f35720c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f35720c.setVisibilityState(this.f35718a, this.f35719b);
    }
}
