package com.google.android.apps.search.pronunciationlearning.p10638ui.mic;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.f */
/* compiled from: PG */
class C141470f extends FrameLayout implements C68288b {

    /* renamed from: a */
    private C47252b f383991a;

    /* renamed from: b */
    private boolean f383992b;

    public C141470f(Context context) {
        super(context);
        mo116466d();
    }

    /* renamed from: b */
    public final C47252b mo116465b() {
        if (this.f383991a == null) {
            this.f383991a = new C47252b(this, false);
        }
        return this.f383991a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo116466d() {
        if (!this.f383992b) {
            this.f383992b = true;
            MicView micView = (MicView) this;
            ((C141468d) mo116465b().mo17653jN()).mo116463aD();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116465b().mo17653jN();
    }

    public C141470f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo116466d();
    }

    public C141470f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo116466d();
    }

    public C141470f(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo116466d();
    }
}
