package com.google.android.libraries.lens.view.infopanel;

import android.content.Context;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.lens.view.infopanel.ce */
/* compiled from: PG */
class C27087ce extends C27065bs implements C68288b {

    /* renamed from: c */
    private C47252b f73825c;

    /* renamed from: d */
    private boolean f73826d;

    public C27087ce(Context context) {
        super(context);
        mo32527d();
    }

    /* renamed from: b */
    public final C47252b mo32526b() {
        if (this.f73825c == null) {
            this.f73825c = new C47252b(this, false);
        }
        return this.f73825c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo32527d() {
        if (!this.f73826d) {
            this.f73826d = true;
            InfoPanelHeader infoPanelHeader = (InfoPanelHeader) this;
            ((C27209y) mo32526b().mo17653jN()).mo32652ax();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo32526b().mo17653jN();
    }

    public C27087ce(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo32527d();
    }
}
