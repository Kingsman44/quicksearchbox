package com.google.android.libraries.lens.view.infopanel;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.lens.view.infopanel.ch */
/* compiled from: PG */
class C27090ch extends FrameLayout implements C68288b {

    /* renamed from: a */
    private C47252b f73834a;

    /* renamed from: b */
    private boolean f73835b;

    public C27090ch(Context context) {
        super(context);
        mo32533d();
    }

    /* renamed from: b */
    public final C47252b mo32532b() {
        if (this.f73834a == null) {
            this.f73834a = new C47252b(this, false);
        }
        return this.f73834a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo32533d() {
        if (!this.f73835b) {
            this.f73835b = true;
            ThumbnailHeaderView thumbnailHeaderView = (ThumbnailHeaderView) this;
            ((C27085cc) mo32532b().mo17653jN()).mo32523aX();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo32532b().mo17653jN();
    }

    public C27090ch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo32533d();
    }

    public C27090ch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo32533d();
    }

    public C27090ch(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo32533d();
    }
}
