package com.google.android.libraries.lens.view.common;

import android.content.Context;
import android.support.p033v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.lens.view.common.h */
/* compiled from: PG */
class C25746h extends AppCompatImageView implements C68288b {

    /* renamed from: a */
    private C47252b f70002a;

    /* renamed from: b */
    private boolean f70003b;

    public C25746h(Context context) {
        super(context);
        mo30902e();
    }

    /* renamed from: d */
    public final C47252b mo30901d() {
        if (this.f70002a == null) {
            this.f70002a = new C47252b(this, false);
        }
        return this.f70002a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo30902e() {
        if (!this.f70003b) {
            this.f70003b = true;
            RoundedImageView roundedImageView = (RoundedImageView) this;
            ((C25745g) mo30901d().mo17653jN()).mo30900aL();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo30901d().mo17653jN();
    }

    public C25746h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo30902e();
    }

    public C25746h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo30902e();
    }
}
