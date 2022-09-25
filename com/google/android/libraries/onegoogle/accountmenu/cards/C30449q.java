package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.q */
/* compiled from: PG */
final class C30449q extends C30418cs {

    /* renamed from: a */
    private final Drawable f82264a;

    /* renamed from: b */
    private final boolean f82265b;

    public C30449q(Drawable drawable, boolean z) {
        if (drawable != null) {
            this.f82264a = drawable;
            this.f82265b = z;
            return;
        }
        throw new NullPointerException("Null icon");
    }

    /* renamed from: a */
    public final Drawable mo35985a() {
        return this.f82264a;
    }

    /* renamed from: b */
    public final boolean mo35986b() {
        return this.f82265b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30418cs) {
            C30418cs csVar = (C30418cs) obj;
            return this.f82264a.equals(csVar.mo35985a()) && this.f82265b == csVar.mo35986b();
        }
    }

    public final int hashCode() {
        return ((this.f82264a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f82265b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f82264a.toString();
        boolean z = this.f82265b;
        return "TintAwareIcon{icon=" + obj + ", useTint=" + z + "}";
    }
}
