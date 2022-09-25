package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.dk */
/* compiled from: PG */
class C33359dk extends LinearLayout implements C68288b {

    /* renamed from: a */
    private C47252b f89398a;

    /* renamed from: b */
    private boolean f89399b;

    public C33359dk(Context context) {
        super(context);
        mo38803d();
    }

    /* renamed from: b */
    public final C47252b mo38802b() {
        if (this.f89398a == null) {
            this.f89398a = new C47252b(this, false);
        }
        return this.f89398a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo38803d() {
        if (!this.f89399b) {
            this.f89399b = true;
            AudioRecorderField audioRecorderField = (AudioRecorderField) this;
            ((C33378l) mo38802b().mo17653jN()).mo38822ae();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo38802b().mo17653jN();
    }

    public C33359dk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo38803d();
    }

    public C33359dk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo38803d();
    }

    public C33359dk(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo38803d();
    }
}
