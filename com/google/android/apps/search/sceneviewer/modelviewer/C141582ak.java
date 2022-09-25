package com.google.android.apps.search.sceneviewer.modelviewer;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.ak */
/* compiled from: PG */
final class C141582ak implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f384266a;

    /* renamed from: b */
    final /* synthetic */ C141584am f384267b;

    public C141582ak(C141584am amVar, View view) {
        this.f384267b = amVar;
        this.f384266a = view;
    }

    public final void onGlobalLayout() {
        this.f384266a.setVisibility(0);
        this.f384266a.setAlpha(0.0f);
        this.f384267b.mo116570d();
        this.f384266a.setVisibility(4);
        this.f384266a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
