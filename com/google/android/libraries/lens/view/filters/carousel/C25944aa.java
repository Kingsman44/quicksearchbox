package com.google.android.libraries.lens.view.filters.carousel;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.lens.view.filters.carousel.aa */
/* compiled from: PG */
class C25944aa extends FrameLayout implements C68288b {

    /* renamed from: a */
    private C47252b f70516a;

    /* renamed from: b */
    private boolean f70517b;

    public C25944aa(Context context) {
        super(context);
        mo31127d();
    }

    /* renamed from: b */
    public final C47252b mo31126b() {
        if (this.f70516a == null) {
            this.f70516a = new C47252b(this, false);
        }
        return this.f70516a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo31127d() {
        if (!this.f70517b) {
            this.f70517b = true;
            FilterTooltip filterTooltip = (FilterTooltip) this;
            ((C25969y) mo31126b().mo17653jN()).mo31163at();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo31126b().mo17653jN();
    }

    public C25944aa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo31127d();
    }

    public C25944aa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo31127d();
    }

    public C25944aa(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo31127d();
    }
}
