package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.ap */
/* compiled from: PG */
class C138637ap extends LinearLayout implements C68288b {

    /* renamed from: a */
    private C47252b f377039a;

    /* renamed from: b */
    private boolean f377040b;

    public C138637ap(Context context) {
        super(context);
        mo114443d();
    }

    /* renamed from: b */
    public final C47252b mo114442b() {
        if (this.f377039a == null) {
            this.f377039a = new C47252b(this, false);
        }
        return this.f377039a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo114443d() {
        if (!this.f377040b) {
            this.f377040b = true;
            CoreSuggestionView coreSuggestionView = (CoreSuggestionView) this;
            ((C138660m) mo114442b().mo17653jN()).mo114455am();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114442b().mo17653jN();
    }

    public C138637ap(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo114443d();
    }

    public C138637ap(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo114443d();
    }

    public C138637ap(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo114443d();
    }
}
