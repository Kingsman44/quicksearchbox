package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ag */
/* compiled from: PG */
final class C113254ag extends C113258ak {

    /* renamed from: a */
    private final Drawable f313619a;

    public C113254ag(Drawable drawable) {
        this.f313619a = drawable;
    }

    /* renamed from: b */
    public final int mo99930b() {
        return 2;
    }

    /* renamed from: c */
    public final Drawable mo99934c() {
        return this.f313619a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C113286bk) {
            C113286bk bkVar = (C113286bk) obj;
            if (bkVar.mo99930b() != 2 || !this.f313619a.equals(bkVar.mo99934c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f313619a.hashCode();
    }

    public final String toString() {
        String obj = this.f313619a.toString();
        return "IconSource{drawable=" + obj + "}";
    }
}
