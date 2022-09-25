package com.google.android.libraries.p579ar.sceneviewer.p589ui;

import android.view.View;

/* renamed from: com.google.android.libraries.ar.sceneviewer.ui.c */
/* compiled from: PG */
final class C10759c implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ SimpleSnackbar f35721a;

    public C10759c(SimpleSnackbar simpleSnackbar) {
        this.f35721a = simpleSnackbar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f35721a.content.removeOnLayoutChangeListener(this);
        this.f35721a.animateViewIn();
    }
}
