package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.widget.PopupWindow;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.af */
/* compiled from: PG */
final class C9079af implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PopupWindow f31318a;

    public C9079af(PopupWindow popupWindow) {
        this.f31318a = popupWindow;
    }

    public final void run() {
        if (this.f31318a.isShowing()) {
            this.f31318a.dismiss();
        }
    }
}
