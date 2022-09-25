package com.google.android.libraries.lens.view.gleam;

import android.graphics.RectF;

/* renamed from: com.google.android.libraries.lens.view.gleam.j */
/* compiled from: PG */
final class C26601j extends C26583fc {

    /* renamed from: a */
    private final RectF f72530a;

    /* renamed from: b */
    private final boolean f72531b;

    /* renamed from: c */
    private final boolean f72532c;

    public C26601j(RectF rectF, boolean z, boolean z2) {
        this.f72530a = rectF;
        this.f72531b = z;
        this.f72532c = z2;
    }

    /* renamed from: a */
    public final RectF mo31846a() {
        return this.f72530a;
    }

    /* renamed from: b */
    public final boolean mo31847b() {
        return this.f72531b;
    }

    /* renamed from: c */
    public final boolean mo31848c() {
        return this.f72532c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26583fc) {
            C26583fc fcVar = (C26583fc) obj;
            return this.f72530a.equals(fcVar.mo31846a()) && this.f72531b == fcVar.mo31847b() && this.f72532c == fcVar.mo31848c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.f72530a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f72531b ? 1237 : 1231)) * 1000003;
        if (true == this.f72532c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f72530a.toString();
        boolean z = this.f72531b;
        boolean z2 = this.f72532c;
        return "Reticle{position=" + obj + ", isVisible=" + z + ", supportsSelection=" + z2 + "}";
    }
}
