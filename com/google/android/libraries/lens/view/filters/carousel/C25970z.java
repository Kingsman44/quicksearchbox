package com.google.android.libraries.lens.view.filters.carousel;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.lens.view.filters.carousel.z */
/* compiled from: PG */
class C25970z extends LinearLayout implements C68288b {

    /* renamed from: a */
    private C47252b f70586a;

    /* renamed from: b */
    private boolean f70587b;

    public C25970z(Context context) {
        super(context);
        mo31165d();
    }

    /* renamed from: b */
    public final C47252b mo31164b() {
        if (this.f70586a == null) {
            this.f70586a = new C47252b(this, false);
        }
        return this.f70586a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo31165d() {
        if (!this.f70587b) {
            this.f70587b = true;
            FilterCarouselView filterCarouselView = (FilterCarouselView) this;
            ((C25964t) mo31164b().mo17653jN()).mo31155as();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo31164b().mo17653jN();
    }

    public C25970z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo31165d();
    }

    public C25970z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo31165d();
    }

    public C25970z(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo31165d();
    }
}
