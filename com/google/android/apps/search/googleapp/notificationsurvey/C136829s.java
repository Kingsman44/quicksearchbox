package com.google.android.apps.search.googleapp.notificationsurvey;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.notificationsurvey.s */
/* compiled from: PG */
class C136829s extends LinearLayout implements C68288b {

    /* renamed from: a */
    private C47252b f372443a;

    /* renamed from: b */
    private boolean f372444b;

    public C136829s(Context context) {
        super(context);
        mo113394d();
    }

    /* renamed from: b */
    public final C47252b mo113393b() {
        if (this.f372443a == null) {
            this.f372443a = new C47252b(this, false);
        }
        return this.f372443a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo113394d() {
        if (!this.f372444b) {
            this.f372444b = true;
            RatingView ratingView = (RatingView) this;
            ((C136822l) mo113393b().mo17653jN()).mo113390aJ();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113393b().mo17653jN();
    }

    public C136829s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo113394d();
    }

    public C136829s(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo113394d();
    }

    public C136829s(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo113394d();
    }
}
