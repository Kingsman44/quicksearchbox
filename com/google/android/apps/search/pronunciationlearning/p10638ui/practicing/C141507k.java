package com.google.android.apps.search.pronunciationlearning.p10638ui.practicing;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.practicing.k */
/* compiled from: PG */
class C141507k extends LinearLayout implements C68288b {

    /* renamed from: a */
    private C47252b f384110a;

    /* renamed from: b */
    private boolean f384111b;

    public C141507k(Context context) {
        super(context);
        mo116531d();
    }

    /* renamed from: b */
    public final C47252b mo116530b() {
        if (this.f384110a == null) {
            this.f384110a = new C47252b(this, false);
        }
        return this.f384110a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo116531d() {
        if (!this.f384111b) {
            this.f384111b = true;
            ProntoFeedbackView prontoFeedbackView = (ProntoFeedbackView) this;
            ((C141505i) mo116530b().mo17653jN()).mo116527aI();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116530b().mo17653jN();
    }

    public C141507k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo116531d();
    }

    public C141507k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo116531d();
    }

    public C141507k(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo116531d();
    }
}
