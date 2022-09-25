package com.google.android.libraries.p579ar.sceneviewer.infocard;

import android.view.ViewTreeObserver;
import com.google.p3723ar.core.viewer.jniprotolite.Types;

/* renamed from: com.google.android.libraries.ar.sceneviewer.infocard.e */
/* compiled from: PG */
final class C10717e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ Types.Visibility f35647a;

    /* renamed from: b */
    final /* synthetic */ int f35648b;

    /* renamed from: c */
    final /* synthetic */ BottomViewGroup f35649c;

    public C10717e(BottomViewGroup bottomViewGroup, Types.Visibility visibility, int i) {
        this.f35649c = bottomViewGroup;
        this.f35647a = visibility;
        this.f35648b = i;
    }

    public final void onGlobalLayout() {
        this.f35649c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f35649c.setState(this.f35647a, this.f35648b);
    }
}
