package com.google.android.libraries.web.contrib.loadingbar.p3398ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.web.contrib.loadingbar.ui.o */
/* compiled from: PG */
class C43692o extends ProgressBar implements C68288b {

    /* renamed from: a */
    private C47252b f113995a;

    /* renamed from: b */
    private boolean f113996b;

    public C43692o(Context context) {
        super(context);
        mo46708d();
    }

    /* renamed from: b */
    public final C47252b mo46707b() {
        if (this.f113995a == null) {
            this.f113995a = new C47252b(this, true);
        }
        return this.f113995a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo46708d() {
        if (!this.f113996b) {
            this.f113996b = true;
            LoadingBarView loadingBarView = (LoadingBarView) this;
            ((C43689l) mo46707b().mo17653jN()).mo46704az();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo46707b().mo17653jN();
    }

    public C43692o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo46708d();
    }

    public C43692o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo46708d();
    }

    public C43692o(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo46708d();
    }
}
