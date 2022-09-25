package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.q */
/* compiled from: PG */
public final /* synthetic */ class C129328q implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public static final /* synthetic */ C129328q f355196a = new C129328q();

    private /* synthetic */ C129328q() {
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int width = view.getWidth();
        int width2 = ((View) view.getParent()).getWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.getClass();
        layoutParams.gravity = width < width2 ? 1 : 8388611;
    }
}
