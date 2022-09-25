package com.google.android.libraries.lens.view.gleam;

import android.graphics.RectF;

/* renamed from: com.google.android.libraries.lens.view.gleam.i */
/* compiled from: PG */
final class C26600i extends C26582fb {

    /* renamed from: a */
    public RectF f72526a;

    /* renamed from: b */
    private boolean f72527b;

    /* renamed from: c */
    private boolean f72528c;

    /* renamed from: d */
    private byte f72529d;

    /* renamed from: a */
    public final C26583fc mo31843a() {
        RectF rectF;
        if (this.f72529d == 3 && (rectF = this.f72526a) != null) {
            return new C26601j(rectF, this.f72527b, this.f72528c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f72526a == null) {
            sb.append(" position");
        }
        if ((this.f72529d & 1) == 0) {
            sb.append(" isVisible");
        }
        if ((this.f72529d & 2) == 0) {
            sb.append(" supportsSelection");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo31844b(boolean z) {
        this.f72527b = z;
        this.f72529d = (byte) (this.f72529d | 1);
    }

    /* renamed from: c */
    public final void mo31845c(boolean z) {
        this.f72528c = z;
        this.f72529d = (byte) (this.f72529d | 2);
    }
}
