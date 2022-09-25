package com.google.android.apps.gsa.staticplugins.hotwordenrollment;

import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c */
/* compiled from: PG */
public final class C101502c extends C102231t {

    /* renamed from: a */
    public CharSequence f283252a;

    /* renamed from: b */
    public CharSequence f283253b;

    /* renamed from: c */
    private TextView.BufferType f283254c;

    /* renamed from: d */
    private boolean f283255d;

    /* renamed from: e */
    private byte f283256e;

    /* renamed from: a */
    public final C102232u mo92349a() {
        CharSequence charSequence;
        TextView.BufferType bufferType;
        CharSequence charSequence2;
        if (this.f283256e == 1 && (charSequence = this.f283252a) != null && (bufferType = this.f283254c) != null && (charSequence2 = this.f283253b) != null) {
            return new C101760d(charSequence, bufferType, charSequence2, this.f283255d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f283252a == null) {
            sb.append(" title");
        }
        if (this.f283254c == null) {
            sb.append(" titleBufferType");
        }
        if (this.f283253b == null) {
            sb.append(" summary");
        }
        if (this.f283256e == 0) {
            sb.append(" addSummaryMovement");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo92350b(boolean z) {
        this.f283255d = z;
        this.f283256e = 1;
    }

    /* renamed from: c */
    public final void mo92351c(CharSequence charSequence) {
        if (charSequence != null) {
            this.f283253b = charSequence;
            return;
        }
        throw new NullPointerException("Null summary");
    }

    /* renamed from: d */
    public final void mo92352d(CharSequence charSequence) {
        if (charSequence != null) {
            this.f283252a = charSequence;
            return;
        }
        throw new NullPointerException("Null title");
    }

    /* renamed from: e */
    public final void mo92353e(TextView.BufferType bufferType) {
        if (bufferType != null) {
            this.f283254c = bufferType;
            return;
        }
        throw new NullPointerException("Null titleBufferType");
    }
}
