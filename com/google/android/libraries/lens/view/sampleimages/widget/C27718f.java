package com.google.android.libraries.lens.view.sampleimages.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.lens.view.sampleimages.widget.f */
/* compiled from: PG */
class C27718f extends ConstraintLayout implements C68288b {

    /* renamed from: a */
    private C47252b f75676a;

    /* renamed from: b */
    private boolean f75677b;

    public C27718f(Context context) {
        super(context);
        mo33201e();
    }

    /* renamed from: d */
    public final C47252b mo33200d() {
        if (this.f75676a == null) {
            this.f75676a = new C47252b(this, false);
        }
        return this.f75676a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo33201e() {
        if (!this.f75677b) {
            this.f75677b = true;
            SampleImageCard sampleImageCard = (SampleImageCard) this;
            ((C27717e) mo33200d().mo17653jN()).mo33199aM();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo33200d().mo17653jN();
    }

    public C27718f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo33201e();
    }

    public C27718f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo33201e();
    }

    public C27718f(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo33201e();
    }
}
