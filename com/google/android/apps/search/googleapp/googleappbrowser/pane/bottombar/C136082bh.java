package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.bh */
/* compiled from: PG */
class C136082bh extends View implements C68288b {

    /* renamed from: a */
    private C47252b f370619a;

    /* renamed from: b */
    private boolean f370620b;

    public C136082bh(Context context) {
        super(context);
        mo112744d();
    }

    /* renamed from: b */
    public final C47252b mo112743b() {
        if (this.f370619a == null) {
            this.f370619a = new C47252b(this, false);
        }
        return this.f370619a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo112744d() {
        if (!this.f370620b) {
            this.f370620b = true;
            BottomSheetPlaceholderView bottomSheetPlaceholderView = (BottomSheetPlaceholderView) this;
            ((C136077bc) mo112743b().mo17653jN()).mo112733aj();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112743b().mo17653jN();
    }

    public C136082bh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo112744d();
    }

    public C136082bh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo112744d();
    }

    public C136082bh(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo112744d();
    }
}
