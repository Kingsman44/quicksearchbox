package com.google.android.libraries.lens.view.filters;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.lens.view.filters.bm */
/* compiled from: PG */
class C25934bm extends LinearLayout implements C68288b {

    /* renamed from: a */
    private C47252b f70464a;

    /* renamed from: b */
    private boolean f70465b;

    public C25934bm(Context context) {
        super(context);
        mo31101d();
    }

    /* renamed from: b */
    public final C47252b mo31100b() {
        if (this.f70464a == null) {
            this.f70464a = new C47252b(this, false);
        }
        return this.f70464a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo31101d() {
        if (!this.f70465b) {
            this.f70465b = true;
            LvfButtonsView lvfButtonsView = (LvfButtonsView) this;
            ((C25919az) mo31100b().mo17653jN()).mo31077aB();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo31100b().mo17653jN();
    }

    public C25934bm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo31101d();
    }

    public C25934bm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo31101d();
    }

    public C25934bm(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo31101d();
    }
}
