package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j;

import android.graphics.Rect;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.j.k */
/* compiled from: PG */
final class C81818k extends C81826s {

    /* renamed from: b */
    private final Rect f223771b;

    /* renamed from: c */
    private final boolean f223772c;

    public C81818k(Rect rect, boolean z) {
        this.f223771b = rect;
        this.f223772c = z;
    }

    /* renamed from: a */
    public final Rect mo75359a() {
        return this.f223771b;
    }

    /* renamed from: b */
    public final boolean mo75360b() {
        return this.f223772c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C81826s) {
            C81826s sVar = (C81826s) obj;
            return this.f223771b.equals(sVar.mo75359a()) && this.f223772c == sVar.mo75360b();
        }
    }

    public final int hashCode() {
        return ((this.f223771b.hashCode() ^ 1000003) * 1000003) ^ (true != this.f223772c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f223771b);
        boolean z = this.f223772c;
        return "WindowInsets{windowInsets=" + valueOf + ", isBigNavbar=" + z + "}";
    }
}
