package com.google.android.apps.search.transcription.voiceime;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47228i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.transcription.voiceime.l */
/* compiled from: PG */
class C142009l extends ImageView implements C68288b {

    /* renamed from: a */
    private C47228i f385321a;

    public C142009l(Context context) {
        super(context);
        mo116965b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C47228i mo116964a() {
        if (this.f385321a == null) {
            this.f385321a = new C47228i(this);
        }
        return this.f385321a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo116965b() {
        BackspaceView backspaceView = (BackspaceView) this;
        ((C142002e) mo116964a().mo17653jN()).mo116961c();
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116964a().mo17653jN();
    }

    public C142009l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo116965b();
    }

    public C142009l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo116965b();
    }

    public C142009l(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo116965b();
    }
}
