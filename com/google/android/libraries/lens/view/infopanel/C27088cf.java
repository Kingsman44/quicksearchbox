package com.google.android.libraries.lens.view.infopanel;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.lens.view.infopanel.cf */
/* compiled from: PG */
class C27088cf extends LinearLayout implements C68288b {

    /* renamed from: a */
    private C47252b f73827a;

    /* renamed from: b */
    private boolean f73828b;

    public C27088cf(Context context) {
        super(context);
        mo32529d();
    }

    /* renamed from: b */
    public final C47252b mo32528b() {
        if (this.f73827a == null) {
            this.f73827a = new C47252b(this, false);
        }
        return this.f73827a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo32529d() {
        if (!this.f73828b) {
            this.f73828b = true;
            MultimodalHeaderView multimodalHeaderView = (MultimodalHeaderView) this;
            ((C26999aq) mo32528b().mo17653jN()).mo32459aE();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo32528b().mo17653jN();
    }

    public C27088cf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo32529d();
    }

    public C27088cf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo32529d();
    }

    public C27088cf(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo32529d();
    }
}
