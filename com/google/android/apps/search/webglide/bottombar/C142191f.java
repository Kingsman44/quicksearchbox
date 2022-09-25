package com.google.android.apps.search.webglide.bottombar;

import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.webglide.bottombar.f */
/* compiled from: PG */
class C142191f extends CoordinatorLayout implements C68288b {

    /* renamed from: i */
    private C47252b f385748i;

    /* renamed from: j */
    private boolean f385749j;

    public C142191f(Context context) {
        super(context);
        mo117049s();
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo117048r().mo17653jN();
    }

    /* renamed from: r */
    public final C47252b mo117048r() {
        if (this.f385748i == null) {
            this.f385748i = new C47252b(this, false);
        }
        return this.f385748i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo117049s() {
        if (!this.f385749j) {
            this.f385749j = true;
            BottomBarCarouselView bottomBarCarouselView = (BottomBarCarouselView) this;
            ((C142190e) mo117048r().mo17653jN()).mo117047ah();
        }
    }

    public C142191f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo117049s();
    }

    public C142191f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo117049s();
    }
}
