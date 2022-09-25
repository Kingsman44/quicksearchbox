package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.ae */
/* compiled from: PG */
class C129743ae extends FrameLayout implements C68288b {

    /* renamed from: a */
    private C47252b f356043a;

    /* renamed from: b */
    private boolean f356044b;

    public C129743ae(Context context) {
        super(context);
        mo109218b();
    }

    /* renamed from: a */
    public final C47252b mo109217a() {
        if (this.f356043a == null) {
            this.f356043a = new C47252b(this, false);
        }
        return this.f356043a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo109218b() {
        if (!this.f356044b) {
            this.f356044b = true;
            CanvasView canvasView = (CanvasView) this;
            ((C129764e) mo109217a().mo17653jN()).mo109239ak();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo109217a().mo17653jN();
    }

    public C129743ae(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo109218b();
    }

    public C129743ae(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo109218b();
    }

    public C129743ae(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo109218b();
    }
}
