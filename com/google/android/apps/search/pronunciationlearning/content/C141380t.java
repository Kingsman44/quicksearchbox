package com.google.android.apps.search.pronunciationlearning.content;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.pronunciationlearning.content.t */
/* compiled from: PG */
class C141380t extends LinearLayout implements C68288b {

    /* renamed from: a */
    private C47252b f383791a;

    /* renamed from: b */
    private boolean f383792b;

    public C141380t(Context context) {
        super(context);
        mo116396d();
    }

    /* renamed from: b */
    public final C47252b mo116395b() {
        if (this.f383791a == null) {
            this.f383791a = new C47252b(this, false);
        }
        return this.f383791a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo116396d() {
        if (!this.f383792b) {
            this.f383792b = true;
            SuggestionChipsView suggestionChipsView = (SuggestionChipsView) this;
            ((C141379s) mo116395b().mo17653jN()).mo116394aS();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116395b().mo17653jN();
    }

    public C141380t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo116396d();
    }

    public C141380t(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo116396d();
    }

    public C141380t(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo116396d();
    }
}
