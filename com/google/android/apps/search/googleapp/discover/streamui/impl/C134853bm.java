package com.google.android.apps.search.googleapp.discover.streamui.impl;

import android.content.Context;
import android.util.AttributeSet;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.bm */
/* compiled from: PG */
class C134853bm extends SwipeRefreshLayout implements C68288b {

    /* renamed from: o */
    private C47252b f367117o;

    /* renamed from: p */
    private boolean f367118p;

    public C134853bm(Context context) {
        super(context);
        mo112034s();
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112033r().mo17653jN();
    }

    /* renamed from: r */
    public final C47252b mo112033r() {
        if (this.f367117o == null) {
            this.f367117o = new C47252b(this, false);
        }
        return this.f367117o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo112034s() {
        if (!this.f367118p) {
            this.f367118p = true;
            SwipeRefreshView swipeRefreshView = (SwipeRefreshView) this;
            ((C134851bk) mo112033r().mo17653jN()).mo112030aU();
        }
    }

    public C134853bm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo112034s();
    }
}
