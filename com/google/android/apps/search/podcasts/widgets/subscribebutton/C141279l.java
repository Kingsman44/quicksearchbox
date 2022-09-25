package com.google.android.apps.search.podcasts.widgets.subscribebutton;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.podcasts.widgets.subscribebutton.l */
/* compiled from: PG */
class C141279l extends FrameLayout implements C68288b {

    /* renamed from: a */
    private C47252b f383555a;

    /* renamed from: b */
    private boolean f383556b;

    public C141279l(Context context) {
        super(context);
        mo116301d();
    }

    /* renamed from: b */
    public final C47252b mo116300b() {
        if (this.f383555a == null) {
            this.f383555a = new C47252b(this, false);
        }
        return this.f383555a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo116301d() {
        if (!this.f383556b) {
            this.f383556b = true;
            SubscribeButtonView subscribeButtonView = (SubscribeButtonView) this;
            ((C141278k) mo116300b().mo17653jN()).mo116299aR();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116300b().mo17653jN();
    }

    public C141279l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo116301d();
    }

    public C141279l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo116301d();
    }

    public C141279l(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo116301d();
    }
}
