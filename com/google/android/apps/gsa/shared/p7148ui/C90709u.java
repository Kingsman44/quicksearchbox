package com.google.android.apps.gsa.shared.p7148ui;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: com.google.android.apps.gsa.shared.ui.u */
/* compiled from: PG */
final class C90709u implements C90712x {

    /* renamed from: a */
    public final View f253741a;

    /* renamed from: b */
    private boolean f253742b;

    /* renamed from: c */
    private float f253743c;

    public C90709u(View view) {
        this.f253741a = view;
    }

    /* renamed from: a */
    public final void mo83198a() {
        this.f253741a.animate().cancel();
    }

    /* renamed from: b */
    public final void mo83199b(float f) {
        this.f253742b = true;
        this.f253743c = f;
    }

    /* renamed from: c */
    public final void mo83200c(boolean z) {
        if (!z) {
            ViewPropertyAnimator animate = this.f253741a.animate();
            if (this.f253742b) {
                animate.translationY(this.f253743c);
            }
            animate.setStartDelay(0);
        } else if (this.f253742b) {
            this.f253741a.setTranslationY(this.f253743c);
        }
        this.f253742b = false;
    }
}
