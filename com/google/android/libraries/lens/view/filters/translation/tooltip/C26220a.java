package com.google.android.libraries.lens.view.filters.translation.tooltip;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.tooltip.a */
/* compiled from: PG */
class C26220a extends LinearLayout implements C68288b {

    /* renamed from: a */
    private C47252b f71258a;

    /* renamed from: b */
    private boolean f71259b;

    public C26220a(Context context) {
        super(context);
        mo31440b();
    }

    /* renamed from: a */
    public final C47252b mo31439a() {
        if (this.f71258a == null) {
            this.f71258a = new C47252b(this, false);
        }
        return this.f71258a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo31440b() {
        if (!this.f71259b) {
            this.f71259b = true;
            TranslationTooltipView translationTooltipView = (TranslationTooltipView) this;
            ((C26226f) mo31439a().mo17653jN()).mo31445ba();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo31439a().mo17653jN();
    }

    public C26220a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo31440b();
    }

    public C26220a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo31440b();
    }

    public C26220a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo31440b();
    }
}
