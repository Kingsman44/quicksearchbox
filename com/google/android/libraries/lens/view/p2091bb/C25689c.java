package com.google.android.libraries.lens.view.p2091bb;

import android.graphics.RectF;

/* renamed from: com.google.android.libraries.lens.view.bb.c */
/* compiled from: PG */
public final class C25689c extends C25687a {

    /* renamed from: a */
    public RectF f69829a;

    /* renamed from: b */
    public int f69830b;

    /* renamed from: c */
    private boolean f69831c;

    /* renamed from: d */
    private byte f69832d;

    /* renamed from: a */
    public final RectF mo30788a() {
        RectF rectF = this.f69829a;
        if (rectF != null) {
            return rectF;
        }
        throw new IllegalStateException("Property \"region\" has not been set");
    }

    /* renamed from: b */
    public final C25688b mo30789b() {
        if (this.f69832d == 1 && this.f69829a != null && this.f69830b != 0) {
            return new C25690d(this.f69829a, this.f69830b, this.f69831c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f69829a == null) {
            sb.append(" region");
        }
        if (this.f69830b == 0) {
            sb.append(" source");
        }
        if (this.f69832d == 0) {
            sb.append(" isPoint");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: d */
    public final void mo30791d(boolean z) {
        this.f69831c = z;
        this.f69832d = 1;
    }

    /* renamed from: e */
    public final void mo30792e(RectF rectF) {
        if (rectF != null) {
            this.f69829a = rectF;
            return;
        }
        throw new NullPointerException("Null region");
    }
}
