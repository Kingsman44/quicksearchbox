package com.google.android.apps.search.googleapp.stampviewer.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.preview.ag */
/* compiled from: PG */
class C139450ag extends FrameLayout implements C68288b {

    /* renamed from: a */
    private C47252b f379200a;

    /* renamed from: b */
    private boolean f379201b;

    public C139450ag(Context context) {
        super(context);
        mo114981b();
    }

    /* renamed from: a */
    public final C47252b mo114980a() {
        if (this.f379200a == null) {
            this.f379200a = new C47252b(this, false);
        }
        return this.f379200a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo114981b() {
        if (!this.f379201b) {
            this.f379201b = true;
            TouchInterceptFrameLayout touchInterceptFrameLayout = (TouchInterceptFrameLayout) this;
            ((C139455al) mo114980a().mo17653jN()).mo114983aZ();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114980a().mo17653jN();
    }

    public C139450ag(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo114981b();
    }

    public C139450ag(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo114981b();
    }

    public C139450ag(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo114981b();
    }
}
