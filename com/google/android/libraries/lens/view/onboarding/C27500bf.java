package com.google.android.libraries.lens.view.onboarding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.lens.view.onboarding.bf */
/* compiled from: PG */
class C27500bf extends View implements C68288b {

    /* renamed from: a */
    private C47252b f75200a;

    /* renamed from: b */
    private boolean f75201b;

    public C27500bf(Context context) {
        super(context);
        mo33036d();
    }

    /* renamed from: b */
    public final C47252b mo33035b() {
        if (this.f75200a == null) {
            this.f75200a = new C47252b(this, false);
        }
        return this.f75200a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo33036d() {
        if (!this.f75201b) {
            this.f75201b = true;
            OnboardingBackgroundView onboardingBackgroundView = (OnboardingBackgroundView) this;
            ((C27508f) mo33035b().mo17653jN()).mo33049aF();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo33035b().mo17653jN();
    }

    public C27500bf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo33036d();
    }

    public C27500bf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo33036d();
    }

    public C27500bf(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo33036d();
    }
}
