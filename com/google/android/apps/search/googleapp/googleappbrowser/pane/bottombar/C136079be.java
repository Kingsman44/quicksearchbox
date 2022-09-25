package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.be */
/* compiled from: PG */
abstract class C136079be extends ViewGroup implements C68288b {

    /* renamed from: a */
    private C47252b f370607a;

    /* renamed from: b */
    private boolean f370608b;

    public C136079be(Context context) {
        super(context);
        mo112737b();
    }

    /* renamed from: a */
    public final C47252b mo112736a() {
        if (this.f370607a == null) {
            this.f370607a = new C47252b(this, false);
        }
        return this.f370607a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo112737b() {
        if (!this.f370608b) {
            this.f370608b = true;
            BottomBarActionsLayout bottomBarActionsLayout = (BottomBarActionsLayout) this;
            ((C136097o) mo112736a().mo17653jN()).mo112751ag();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112736a().mo17653jN();
    }

    public C136079be(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo112737b();
    }

    public C136079be(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo112737b();
    }

    public C136079be(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo112737b();
    }
}
