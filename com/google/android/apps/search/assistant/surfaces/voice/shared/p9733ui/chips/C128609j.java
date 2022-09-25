package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.chips;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.j */
/* compiled from: PG */
class C128609j extends FrameLayout implements C68288b {

    /* renamed from: a */
    private C47252b f353599a;

    /* renamed from: b */
    private boolean f353600b;

    public C128609j(Context context) {
        super(context);
        mo108554d();
    }

    /* renamed from: b */
    public final C47252b mo108553b() {
        if (this.f353599a == null) {
            this.f353599a = new C47252b(this, true);
        }
        return this.f353599a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo108554d() {
        if (!this.f353600b) {
            this.f353600b = true;
            AssistantChipsView assistantChipsView = (AssistantChipsView) this;
            ((C128607h) mo108553b().mo17653jN()).mo108552ad();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108553b().mo17653jN();
    }

    public C128609j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo108554d();
    }

    public C128609j(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo108554d();
    }

    public C128609j(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo108554d();
    }
}
