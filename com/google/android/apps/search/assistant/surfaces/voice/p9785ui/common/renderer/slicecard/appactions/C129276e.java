package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.slicecard.appactions;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.slicecard.appactions.e */
/* compiled from: PG */
class C129276e extends LinearLayout implements C68288b {

    /* renamed from: a */
    private C47252b f355083a;

    /* renamed from: b */
    private boolean f355084b;

    public C129276e(Context context) {
        super(context);
        mo108947b();
    }

    /* renamed from: a */
    public final C47252b mo108946a() {
        if (this.f355083a == null) {
            this.f355083a = new C47252b(this, false);
        }
        return this.f355083a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo108947b() {
        if (!this.f355084b) {
            this.f355084b = true;
            AppActionsSliceCardView appActionsSliceCardView = (AppActionsSliceCardView) this;
            ((C129275d) mo108946a().mo17653jN()).mo108945ac();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108946a().mo17653jN();
    }

    public C129276e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo108947b();
    }

    public C129276e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo108947b();
    }

    public C129276e(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo108947b();
    }
}
