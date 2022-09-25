package com.google.android.libraries.lens.view.session;

import android.graphics.RectF;
import com.google.android.libraries.lens.p2014e.C24231w;

/* renamed from: com.google.android.libraries.lens.view.session.c */
/* compiled from: PG */
public final class C27783c extends C27769be {

    /* renamed from: a */
    public RectF f75789a;

    /* renamed from: b */
    public int f75790b;

    /* renamed from: c */
    private C24231w f75791c;

    /* renamed from: d */
    private boolean f75792d;

    /* renamed from: e */
    private byte f75793e;

    /* renamed from: a */
    public final RectF mo33247a() {
        RectF rectF = this.f75789a;
        if (rectF != null) {
            return rectF;
        }
        throw new IllegalStateException("Property \"box\" has not been set");
    }

    /* renamed from: b */
    public final C27770bf mo33248b() {
        RectF rectF;
        C24231w wVar;
        if (this.f75793e == 3 && (rectF = this.f75789a) != null && (wVar = this.f75791c) != null && this.f75790b != 0) {
            return new C27784d(rectF, wVar, this.f75792d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f75789a == null) {
            sb.append(" box");
        }
        if ((this.f75793e & 1) == 0) {
            sb.append(" angleDegrees");
        }
        if (this.f75791c == null) {
            sb.append(" interactionOrigin");
        }
        if ((this.f75793e & 2) == 0) {
            sb.append(" isFrozenImageSelection");
        }
        if (this.f75790b == 0) {
            sb.append(" autoTextSelectionMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: c */
    public final void mo33249c() {
        this.f75793e = (byte) (this.f75793e | 1);
    }

    /* renamed from: d */
    public final void mo33250d(RectF rectF) {
        this.f75789a = rectF;
    }

    /* renamed from: e */
    public final void mo33251e(C24231w wVar) {
        if (wVar != null) {
            this.f75791c = wVar;
            return;
        }
        throw new NullPointerException("Null interactionOrigin");
    }

    /* renamed from: f */
    public final void mo33252f(boolean z) {
        this.f75792d = z;
        this.f75793e = (byte) (this.f75793e | 2);
    }
}
