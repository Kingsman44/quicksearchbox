package com.google.android.apps.search.googleapp.settingsui;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.cb */
/* compiled from: PG */
class C139207cb extends AppBarLayout implements C68288b {

    /* renamed from: i */
    private C47252b f378602i;

    /* renamed from: j */
    private boolean f378603j;

    public C139207cb(Context context) {
        super(context);
        mo114831e();
    }

    /* renamed from: d */
    public final C47252b mo114830d() {
        if (this.f378602i == null) {
            this.f378602i = new C47252b(this, false);
        }
        return this.f378602i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo114831e() {
        if (!this.f378603j) {
            this.f378603j = true;
            SearchToolbarView searchToolbarView = (SearchToolbarView) this;
            ((C139150ad) mo114830d().mo17653jN()).mo114782aN();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114830d().mo17653jN();
    }

    public C139207cb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo114831e();
    }

    public C139207cb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo114831e();
    }
}
