package com.google.android.apps.search.googleapp.tabs.manager;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.aj */
/* compiled from: PG */
class C139728aj extends MaterialCardView implements C68288b {

    /* renamed from: i */
    private C47252b f379804i;

    /* renamed from: j */
    private boolean f379805j;

    public C139728aj(Context context) {
        super(context);
        mo115202i();
    }

    /* renamed from: h */
    public final C47252b mo115201h() {
        if (this.f379804i == null) {
            this.f379804i = new C47252b(this, false);
        }
        return this.f379804i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo115202i() {
        if (!this.f379805j) {
            this.f379805j = true;
            TabView tabView = (TabView) this;
            ((C139739f) mo115201h().mo17653jN()).mo115212aW();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo115201h().mo17653jN();
    }

    public C139728aj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo115202i();
    }

    public C139728aj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo115202i();
    }
}
