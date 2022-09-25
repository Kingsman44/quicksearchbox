package com.google.android.apps.search.podcasts.widgets.episodechips;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.podcasts.widgets.episodechips.e */
/* compiled from: PG */
class C141235e extends LinearLayout implements C68288b {

    /* renamed from: a */
    private C47252b f383440a;

    /* renamed from: b */
    private boolean f383441b;

    public C141235e(Context context) {
        super(context);
        mo116256d();
    }

    /* renamed from: b */
    public final C47252b mo116255b() {
        if (this.f383440a == null) {
            this.f383440a = new C47252b(this, false);
        }
        return this.f383440a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo116256d() {
        if (!this.f383441b) {
            this.f383441b = true;
            EpisodeChipsView episodeChipsView = (EpisodeChipsView) this;
            ((C141234d) mo116255b().mo17653jN()).mo116254ar();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116255b().mo17653jN();
    }

    public C141235e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo116256d();
    }

    public C141235e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo116256d();
    }

    public C141235e(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo116256d();
    }
}
