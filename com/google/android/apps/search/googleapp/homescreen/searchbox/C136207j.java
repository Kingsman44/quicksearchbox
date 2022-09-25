package com.google.android.apps.search.googleapp.homescreen.searchbox;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.searchbox.j */
/* compiled from: PG */
class C136207j extends FrameLayout implements C68288b {

    /* renamed from: a */
    private C47252b f370945a;

    /* renamed from: b */
    private boolean f370946b;

    public C136207j(Context context) {
        super(context);
        mo112838d();
    }

    /* renamed from: b */
    public final C47252b mo112837b() {
        if (this.f370945a == null) {
            this.f370945a = new C47252b(this, false);
        }
        return this.f370945a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo112838d() {
        if (!this.f370946b) {
            this.f370946b = true;
            SearchboxView searchboxView = (SearchboxView) this;
            ((C136206i) mo112837b().mo17653jN()).mo112836aO();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112837b().mo17653jN();
    }

    public C136207j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo112838d();
    }

    public C136207j(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo112838d();
    }

    public C136207j(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo112838d();
    }
}
