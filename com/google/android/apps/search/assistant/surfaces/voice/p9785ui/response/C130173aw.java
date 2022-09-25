package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.aw */
/* compiled from: PG */
class C130173aw extends ConstraintLayout implements C68288b {

    /* renamed from: a */
    private C47252b f356914a;

    /* renamed from: b */
    private boolean f356915b;

    public C130173aw(Context context) {
        super(context);
        mo109551d();
    }

    /* renamed from: b */
    public final C47252b mo33195b() {
        if (this.f356914a == null) {
            this.f356914a = new C47252b(this, false);
        }
        return this.f356914a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo109551d() {
        if (!this.f356915b) {
            this.f356915b = true;
            DynamicResponseLayerView dynamicResponseLayerView = (DynamicResponseLayerView) this;
            ((C130271h) mo33195b().mo17653jN()).mo109618aq();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo33195b().mo17653jN();
    }

    public C130173aw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo109551d();
    }

    public C130173aw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo109551d();
    }

    public C130173aw(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo109551d();
    }
}
