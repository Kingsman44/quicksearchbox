package com.google.android.libraries.lens.view.common.bottompanelscrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.lens.view.common.bottompanelscrollview.h */
/* compiled from: PG */
class C25740h extends LinearLayout implements C68288b {

    /* renamed from: a */
    private C47252b f69990a;

    /* renamed from: b */
    private boolean f69991b;

    public C25740h(Context context) {
        super(context);
        mo30896e();
    }

    /* renamed from: d */
    public final C47252b mo30895d() {
        if (this.f69990a == null) {
            this.f69990a = new C47252b(this, false);
        }
        return this.f69990a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo30896e() {
        if (!this.f69991b) {
            this.f69991b = true;
            BottomPanelScrollView bottomPanelScrollView = (BottomPanelScrollView) this;
            ((C25738f) mo30895d().mo17653jN()).mo30894ai();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo30895d().mo17653jN();
    }

    public C25740h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo30896e();
    }

    public C25740h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo30896e();
    }

    public C25740h(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo30896e();
    }
}
