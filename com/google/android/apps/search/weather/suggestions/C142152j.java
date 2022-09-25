package com.google.android.apps.search.weather.suggestions;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.weather.suggestions.j */
/* compiled from: PG */
class C142152j extends LinearLayout implements C68288b {

    /* renamed from: a */
    private C47252b f385621a;

    /* renamed from: b */
    private boolean f385622b;

    public C142152j(Context context) {
        super(context);
        mo117031d();
    }

    /* renamed from: b */
    public final C47252b mo117030b() {
        if (this.f385621a == null) {
            this.f385621a = new C47252b(this, false);
        }
        return this.f385621a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo117031d() {
        if (!this.f385622b) {
            this.f385622b = true;
            SuggestionView suggestionView = (SuggestionView) this;
            ((C142141d) mo117030b().mo17653jN()).mo117026aT();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo117030b().mo17653jN();
    }

    public C142152j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo117031d();
    }

    public C142152j(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo117031d();
    }

    public C142152j(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo117031d();
    }
}
