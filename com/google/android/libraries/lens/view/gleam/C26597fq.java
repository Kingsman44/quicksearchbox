package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.lens.view.gleam.fq */
/* compiled from: PG */
class C26597fq extends C26564ek implements C68288b {

    /* renamed from: a */
    private C47252b f72519a;

    /* renamed from: b */
    private boolean f72520b;

    public C26597fq(Context context) {
        super(context);
        mo31859i();
    }

    /* renamed from: h */
    public final C47252b mo31858h() {
        if (this.f72519a == null) {
            this.f72519a = new C47252b(this, false);
        }
        return this.f72519a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo31859i() {
        if (!this.f72520b) {
            this.f72520b = true;
            GleamingView gleamingView = (GleamingView) this;
            ((C26568eo) mo31858h().mo17653jN()).mo31830av();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo31858h().mo17653jN();
    }

    public C26597fq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo31859i();
    }

    public C26597fq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo31859i();
    }
}
