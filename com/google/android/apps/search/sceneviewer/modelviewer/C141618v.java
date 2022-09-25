package com.google.android.apps.search.sceneviewer.modelviewer;

import android.view.DisplayCutout;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.v */
/* compiled from: PG */
public final /* synthetic */ class C141618v implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ C141584am f384419a;

    public /* synthetic */ C141618v(C141584am amVar) {
        this.f384419a = amVar;
    }

    public final void onGlobalLayout() {
        C141584am amVar = this.f384419a;
        DisplayCutout displayCutout = amVar.f384337f.getActivity().getWindow().getDecorView().getRootWindowInsets().getDisplayCutout();
        if (displayCutout != null) {
            amVar.f384275C.setDisplayCutout(displayCutout);
        }
    }
}
