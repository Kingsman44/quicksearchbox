package com.google.android.apps.search.pronunciationlearning.p10638ui.practicing;

import android.content.Context;
import android.support.p033v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.practicing.j */
/* compiled from: PG */
class C141506j extends AppCompatTextView implements C68288b {

    /* renamed from: a */
    private C47252b f384108a;

    /* renamed from: b */
    private boolean f384109b;

    public C141506j(Context context) {
        super(context);
        mo116529d();
    }

    /* renamed from: b */
    public final C47252b mo116528b() {
        if (this.f384108a == null) {
            this.f384108a = new C47252b(this, false);
        }
        return this.f384108a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo116529d() {
        if (!this.f384109b) {
            this.f384109b = true;
            PhonemeView phonemeView = (PhonemeView) this;
            ((C141499c) mo116528b().mo17653jN()).mo116521aG();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116528b().mo17653jN();
    }

    public C141506j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo116529d();
    }

    public C141506j(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo116529d();
    }
}
