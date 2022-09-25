package com.google.android.apps.search.googleapp.stampviewer.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.viewpager.l */
/* compiled from: PG */
class C139501l extends ViewPager implements C68288b {

    /* renamed from: i */
    private C47252b f379305i;

    /* renamed from: j */
    private boolean f379306j;

    public C139501l(Context context) {
        super(context);
        mo115011B();
    }

    /* renamed from: A */
    public final C47252b mo46114A() {
        if (this.f379305i == null) {
            this.f379305i = new C47252b(this, false);
        }
        return this.f379305i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo115011B() {
        if (!this.f379306j) {
            this.f379306j = true;
            StampViewerViewPager stampViewerViewPager = (StampViewerViewPager) this;
            ((C139497h) mo46114A().mo17653jN()).mo115010aQ();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo46114A().mo17653jN();
    }

    public C139501l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo115011B();
    }
}
