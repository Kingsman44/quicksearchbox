package com.google.android.apps.search.pronunciationlearning.p10638ui.shared;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.shared.a */
/* compiled from: PG */
class C141508a extends LinearLayout implements C68288b {

    /* renamed from: a */
    private C47252b f384113a;

    /* renamed from: b */
    private boolean f384114b;

    public C141508a(Context context) {
        super(context);
        mo116537b();
    }

    /* renamed from: a */
    public final C47252b mo116536a() {
        if (this.f384113a == null) {
            this.f384113a = new C47252b(this, false);
        }
        return this.f384113a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo116537b() {
        if (!this.f384114b) {
            this.f384114b = true;
            WordChipsView wordChipsView = (WordChipsView) this;
            ((C141519i) mo116536a().mo17653jN()).mo116546bb();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116536a().mo17653jN();
    }

    public C141508a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo116537b();
    }

    public C141508a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo116537b();
    }

    public C141508a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo116537b();
    }
}
