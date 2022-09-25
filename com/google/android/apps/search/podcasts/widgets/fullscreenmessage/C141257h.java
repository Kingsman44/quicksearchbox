package com.google.android.apps.search.podcasts.widgets.fullscreenmessage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.podcasts.widgets.fullscreenmessage.h */
/* compiled from: PG */
class C141257h extends LinearLayout implements C68288b {

    /* renamed from: a */
    private C47252b f383498a;

    /* renamed from: b */
    private boolean f383499b;

    public C141257h(Context context) {
        super(context);
        mo116274d();
    }

    /* renamed from: b */
    public final C47252b mo116273b() {
        if (this.f383498a == null) {
            this.f383498a = new C47252b(this, false);
        }
        return this.f383498a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo116274d() {
        if (!this.f383499b) {
            this.f383499b = true;
            FullScreenMessageView fullScreenMessageView = (FullScreenMessageView) this;
            ((C141256g) mo116273b().mo17653jN()).mo116272au();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116273b().mo17653jN();
    }

    public C141257h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo116274d();
    }

    public C141257h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo116274d();
    }

    public C141257h(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo116274d();
    }
}
