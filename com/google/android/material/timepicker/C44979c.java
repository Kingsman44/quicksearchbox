package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.material.timepicker.c */
/* compiled from: PG */
final class C44979c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ ClockFaceView f117546a;

    public C44979c(ClockFaceView clockFaceView) {
        this.f117546a = clockFaceView;
    }

    public final boolean onPreDraw() {
        if (!this.f117546a.isShown()) {
            return true;
        }
        this.f117546a.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = this.f117546a.getHeight();
        ClockFaceView clockFaceView = this.f117546a;
        int i = ((height / 2) - clockFaceView.f117475a.f117492c) - clockFaceView.f117478d;
        if (i != clockFaceView.f117584f) {
            clockFaceView.f117584f = i;
            clockFaceView.mo33195b();
            ClockHandView clockHandView = clockFaceView.f117475a;
            clockHandView.f117495f = clockFaceView.f117584f;
            clockHandView.invalidate();
        }
        return true;
    }
}
