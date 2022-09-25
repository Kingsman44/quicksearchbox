package com.google.android.apps.education.bloom.mathview.render.keyboard;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.ab */
/* compiled from: PG */
final class C9075ab implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C9076ac f31314a;

    public C9075ab(C9076ac acVar) {
        this.f31314a = acVar;
    }

    public final void run() {
        if (this.f31314a.f31315a.isAttachedToWindow()) {
            this.f31314a.f31315a.performClick();
        }
    }
}
