package com.google.android.apps.search.googleapp.discover.channels;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.cc */
/* compiled from: PG */
class C134168cc extends ConstraintLayout implements C68288b {

    /* renamed from: a */
    private C47252b f365473a;

    /* renamed from: b */
    private boolean f365474b;

    public C134168cc(Context context) {
        super(context);
        mo33195b();
    }

    /* renamed from: a */
    public final C47252b mo111587a() {
        if (this.f365473a == null) {
            this.f365473a = new C47252b(this, false);
        }
        return this.f365473a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo33195b() {
        if (!this.f365474b) {
            this.f365474b = true;
            AccessibilityOrderedLayout accessibilityOrderedLayout = (AccessibilityOrderedLayout) this;
            ((C134173e) mo111587a().mo17653jN()).mo111596ab();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111587a().mo17653jN();
    }

    public C134168cc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo33195b();
    }

    public C134168cc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo33195b();
    }

    public C134168cc(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo33195b();
    }
}
