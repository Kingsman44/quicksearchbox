package com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.logoview.r */
/* compiled from: PG */
class C141496r extends View implements C68288b {

    /* renamed from: a */
    private C47252b f384083a;

    /* renamed from: b */
    private boolean f384084b;

    public C141496r(Context context) {
        super(context);
        mo116510d();
    }

    /* renamed from: b */
    public final C47252b mo116509b() {
        if (this.f384083a == null) {
            this.f384083a = new C47252b(this, false);
        }
        return this.f384083a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo116510d() {
        if (!this.f384084b) {
            this.f384084b = true;
            LogoView logoView = (LogoView) this;
            ((C141483e) mo116509b().mo17653jN()).mo116500aA();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116509b().mo17653jN();
    }

    public C141496r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo116510d();
    }

    public C141496r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo116510d();
    }

    public C141496r(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo116510d();
    }
}
