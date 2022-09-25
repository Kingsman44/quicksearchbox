package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.ay */
/* compiled from: PG */
class C137341ay extends LinearLayout implements C68288b {

    /* renamed from: a */
    private C47252b f373584a;

    /* renamed from: b */
    private boolean f373585b;

    public C137341ay(Context context) {
        super(context);
        mo113666d();
    }

    /* renamed from: b */
    public final C47252b mo113665b() {
        if (this.f373584a == null) {
            this.f373584a = new C47252b(this, false);
        }
        return this.f373584a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo113666d() {
        if (!this.f373585b) {
            this.f373585b = true;
            ListElementView listElementView = (ListElementView) this;
            ((C137368q) mo113665b().mo17653jN()).mo113692ay();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo113665b().mo17653jN();
    }

    public C137341ay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo113666d();
    }

    public C137341ay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo113666d();
    }

    public C137341ay(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo113666d();
    }
}
