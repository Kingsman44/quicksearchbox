package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.bp */
/* compiled from: PG */
class C26174bp extends FrameLayout implements C68288b {

    /* renamed from: a */
    private C47252b f71099a;

    /* renamed from: b */
    private boolean f71100b;

    public C26174bp(Context context) {
        super(context);
        mo31398d();
    }

    /* renamed from: b */
    public final C47252b mo31397b() {
        if (this.f71099a == null) {
            this.f71099a = new C47252b(this, false);
        }
        return this.f71099a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo31398d() {
        if (!this.f71100b) {
            this.f71100b = true;
            DownloadButtonLayout downloadButtonLayout = (DownloadButtonLayout) this;
            ((C26184k) mo31397b().mo17653jN()).mo31415ap();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo31397b().mo17653jN();
    }

    public C26174bp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo31398d();
    }

    public C26174bp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo31398d();
    }

    public C26174bp(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo31398d();
    }
}
