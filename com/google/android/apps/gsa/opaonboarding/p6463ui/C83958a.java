package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.a */
/* compiled from: PG */
public final class C83958a extends C84010e {

    /* renamed from: a */
    public CharSequence f228733a;

    /* renamed from: b */
    public View.OnClickListener f228734b;

    /* renamed from: c */
    private boolean f228735c;

    /* renamed from: d */
    private boolean f228736d;

    /* renamed from: e */
    private byte f228737e;

    /* renamed from: a */
    public final C84011f mo77373a() {
        if (this.f228737e == 3 && this.f228733a != null && this.f228734b != null) {
            return new C83984b(this.f228733a, this.f228734b, this.f228735c, this.f228736d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f228733a == null) {
            sb.append(" text");
        }
        if (this.f228734b == null) {
            sb.append(" listener");
        }
        if ((this.f228737e & 1) == 0) {
            sb.append(" visible");
        }
        if ((this.f228737e & 2) == 0) {
            sb.append(" neutralStyle");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo77374b(boolean z) {
        this.f228736d = z;
        this.f228737e = (byte) (this.f228737e | 2);
    }

    /* renamed from: c */
    public final void mo77375c(CharSequence charSequence) {
        if (charSequence != null) {
            this.f228733a = charSequence;
            return;
        }
        throw new NullPointerException("Null text");
    }

    /* renamed from: d */
    public final void mo77376d(boolean z) {
        this.f228735c = z;
        this.f228737e = (byte) (this.f228737e | 1);
    }
}
