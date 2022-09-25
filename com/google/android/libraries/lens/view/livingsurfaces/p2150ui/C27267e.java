package com.google.android.libraries.lens.view.livingsurfaces.p2150ui;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.lens.view.livingsurfaces.ui.e */
/* compiled from: PG */
class C27267e extends MaterialButton implements C68288b {

    /* renamed from: h */
    private C47252b f74577h;

    /* renamed from: i */
    private boolean f74578i;

    public C27267e(Context context) {
        super(context);
        mo32798e();
    }

    /* renamed from: d */
    public final C47252b mo32797d() {
        if (this.f74577h == null) {
            this.f74577h = new C47252b(this, false);
        }
        return this.f74577h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo32798e() {
        if (!this.f74578i) {
            this.f74578i = true;
            PlanarGleamAttributionView planarGleamAttributionView = (PlanarGleamAttributionView) this;
            ((C27266d) mo32797d().mo17653jN()).mo32796aH();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo32797d().mo17653jN();
    }

    public C27267e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo32798e();
    }

    public C27267e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo32798e();
    }
}
