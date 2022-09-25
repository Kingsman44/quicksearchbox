package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.dn */
/* compiled from: PG */
class C33362dn extends FrameLayout implements C68288b {

    /* renamed from: a */
    private C47252b f89404a;

    /* renamed from: b */
    private boolean f89405b;

    public C33362dn(Context context) {
        super(context);
        mo38809d();
    }

    /* renamed from: b */
    public final C47252b mo38808b() {
        if (this.f89404a == null) {
            this.f89404a = new C47252b(this, false);
        }
        return this.f89404a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo38809d() {
        if (!this.f89405b) {
            this.f89405b = true;
            MessageCarouselField messageCarouselField = (MessageCarouselField) this;
            ((C33343cv) mo38808b().mo17653jN()).mo38795aC();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo38808b().mo17653jN();
    }

    public C33362dn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo38809d();
    }

    public C33362dn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo38809d();
    }

    public C33362dn(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo38809d();
    }
}
