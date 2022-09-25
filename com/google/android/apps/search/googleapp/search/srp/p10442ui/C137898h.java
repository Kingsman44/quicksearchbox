package com.google.android.apps.search.googleapp.search.srp.p10442ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.ui.h */
/* compiled from: PG */
class C137898h extends FrameLayout implements C68288b {

    /* renamed from: a */
    private C47252b f375193a;

    /* renamed from: b */
    private boolean f375194b;

    public C137898h(Context context) {
        super(context);
        mo114034d();
    }

    /* renamed from: b */
    public final C47252b mo114033b() {
        if (this.f375193a == null) {
            this.f375193a = new C47252b(this, true);
        }
        return this.f375193a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo114034d() {
        if (!this.f375194b) {
            this.f375194b = true;
            RoundedFrameLayoutView roundedFrameLayoutView = (RoundedFrameLayoutView) this;
            ((C137896f) mo114033b().mo17653jN()).mo114032aK();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114033b().mo17653jN();
    }

    public C137898h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo114034d();
    }

    public C137898h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo114034d();
    }

    public C137898h(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo114034d();
    }
}
