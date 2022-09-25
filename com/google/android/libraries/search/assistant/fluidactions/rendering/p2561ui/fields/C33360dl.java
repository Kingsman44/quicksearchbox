package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.dl */
/* compiled from: PG */
class C33360dl extends LinearLayout implements C68288b {

    /* renamed from: a */
    private C47252b f89400a;

    /* renamed from: b */
    private boolean f89401b;

    public C33360dl(Context context) {
        super(context);
        mo38805d();
    }

    /* renamed from: b */
    public final C47252b mo38804b() {
        if (this.f89400a == null) {
            this.f89400a = new C47252b(this, false);
        }
        return this.f89400a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo38805d() {
        if (!this.f89401b) {
            this.f89401b = true;
            ContactSelectionField contactSelectionField = (ContactSelectionField) this;
            ((C33274ag) mo38804b().mo17653jN()).mo38736al();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo38804b().mo17653jN();
    }

    public C33360dl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo38805d();
    }

    public C33360dl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo38805d();
    }

    public C33360dl(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo38805d();
    }
}
