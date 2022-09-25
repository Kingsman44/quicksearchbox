package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.dm */
/* compiled from: PG */
class C33361dm extends LinearLayout implements C68288b {

    /* renamed from: a */
    private C47252b f89402a;

    /* renamed from: b */
    private boolean f89403b;

    public C33361dm(Context context) {
        super(context);
        mo38807d();
    }

    /* renamed from: b */
    public final C47252b mo38806b() {
        if (this.f89402a == null) {
            this.f89402a = new C47252b(this, false);
        }
        return this.f89402a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo38807d() {
        if (!this.f89403b) {
            this.f89403b = true;
            DeviceSettingField deviceSettingField = (DeviceSettingField) this;
            ((C33288au) mo38806b().mo17653jN()).mo38751an();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo38806b().mo17653jN();
    }

    public C33361dm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo38807d();
    }

    public C33361dm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo38807d();
    }

    public C33361dm(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo38807d();
    }
}
