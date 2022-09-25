package com.google.android.apps.gsa.shared.p6993ao;

import android.animation.ValueAnimator;
import com.google.android.apps.gsa.shared.p7148ui.C90712x;

/* renamed from: com.google.android.apps.gsa.shared.ao.h */
/* compiled from: PG */
public final class C89243h implements C90712x {

    /* renamed from: a */
    public final C89252q f241986a;

    /* renamed from: b */
    private ValueAnimator f241987b;

    /* renamed from: c */
    private boolean f241988c;

    /* renamed from: d */
    private float f241989d;

    public C89243h(C89252q qVar) {
        this.f241986a = qVar;
    }

    /* renamed from: a */
    public final void mo83198a() {
        ValueAnimator valueAnimator = this.f241987b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f241987b = null;
    }

    /* renamed from: b */
    public final void mo83199b(float f) {
        this.f241988c = true;
        this.f241989d = f;
    }

    /* renamed from: c */
    public final void mo83200c(boolean z) {
        if (this.f241988c) {
            if (z) {
                this.f241986a.mo83207b(this.f241989d);
            } else {
                ValueAnimator valueAnimator = this.f241987b;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f241986a.f242010c, this.f241989d});
                this.f241987b = ofFloat;
                ofFloat.addUpdateListener(new C89242g(this));
                this.f241987b.setStartDelay(0);
                this.f241987b.start();
            }
            this.f241988c = false;
        }
    }
}
