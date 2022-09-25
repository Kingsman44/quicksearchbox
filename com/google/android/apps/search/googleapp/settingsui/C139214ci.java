package com.google.android.apps.search.googleapp.settingsui;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.ci */
/* compiled from: PG */
class C139214ci extends AppBarLayout implements C68288b {

    /* renamed from: i */
    private C47252b f378634i;

    /* renamed from: j */
    private boolean f378635j;

    public C139214ci(Context context) {
        super(context);
        mo114830d();
    }

    /* renamed from: b */
    public final C47252b mo114768b() {
        if (this.f378634i == null) {
            this.f378634i = new C47252b(this, false);
        }
        return this.f378634i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo114830d() {
        if (!this.f378635j) {
            this.f378635j = true;
            ToolbarView toolbarView = (ToolbarView) this;
            ((C139221cp) mo114768b().mo17653jN()).mo114850aY();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo114768b().mo17653jN();
    }

    public C139214ci(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo114830d();
    }

    public C139214ci(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo114830d();
    }
}
