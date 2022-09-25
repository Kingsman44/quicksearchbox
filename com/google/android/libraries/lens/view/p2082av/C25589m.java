package com.google.android.libraries.lens.view.p2082av;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.lens.view.av.m */
/* compiled from: PG */
class C25589m extends FrameLayout implements C68288b {

    /* renamed from: a */
    private C47252b f69622a;

    /* renamed from: b */
    private boolean f69623b;

    public C25589m(Context context) {
        super(context);
        if (!this.f69623b) {
            this.f69623b = true;
            C25582f fVar = (C25582f) this;
            ((C25588l) mo30679b().mo17653jN()).mo30678aV();
        }
    }

    /* renamed from: b */
    public final C47252b mo30679b() {
        if (this.f69622a == null) {
            this.f69622a = new C47252b(this, false);
        }
        return this.f69622a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo30679b().mo17653jN();
    }
}
