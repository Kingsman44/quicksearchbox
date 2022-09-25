package com.google.android.libraries.lens.view.filters;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.lens.view.filters.bk */
/* compiled from: PG */
class C25932bk extends FrameLayout implements C68288b {

    /* renamed from: a */
    private C47252b f70457a;

    /* renamed from: b */
    private boolean f70458b;

    public C25932bk(Context context) {
        super(context);
        mo31097d();
    }

    /* renamed from: b */
    public final C47252b mo31096b() {
        if (this.f70457a == null) {
            this.f70457a = new C47252b(this, false);
        }
        return this.f70457a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo31097d() {
        if (!this.f70458b) {
            this.f70458b = true;
            GuidanceTextView guidanceTextView = (GuidanceTextView) this;
            ((C25894aa) mo31096b().mo17653jN()).mo31063aw();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo31096b().mo17653jN();
    }

    public C25932bk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo31097d();
    }

    public C25932bk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo31097d();
    }

    public C25932bk(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo31097d();
    }
}
