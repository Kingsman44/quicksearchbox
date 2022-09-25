package com.google.android.apps.search.googleapp.googleappbrowser.p10260a;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.a.k */
/* compiled from: PG */
public final class C135465k {

    /* renamed from: a */
    public final boolean f369075a;

    /* renamed from: b */
    public final boolean f369076b;

    public C135465k(boolean z, boolean z2) {
        this.f369075a = z;
        this.f369076b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135465k)) {
            return false;
        }
        C135465k kVar = (C135465k) obj;
        return this.f369075a == kVar.f369075a && this.f369076b == kVar.f369076b;
    }

    public final int hashCode() {
        return ((this.f369075a ? 1 : 0) * true) + (this.f369076b ? 1 : 0);
    }

    public final String toString() {
        boolean z = this.f369075a;
        boolean z2 = this.f369076b;
        return "GoogleAppBrowserStatus(useGabForAllUrls=" + z + ", useGabForWebUrls=" + z2 + ")";
    }
}
