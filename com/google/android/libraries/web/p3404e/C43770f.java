package com.google.android.libraries.web.p3404e;

/* renamed from: com.google.android.libraries.web.e.f */
/* compiled from: PG */
public final class C43770f {

    /* renamed from: a */
    public final boolean f114146a;

    /* renamed from: b */
    private final boolean f114147b;

    public C43770f() {
        this(false, false);
    }

    public C43770f(boolean z, boolean z2) {
        this.f114147b = z;
        this.f114146a = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43770f)) {
            return false;
        }
        C43770f fVar = (C43770f) obj;
        return this.f114147b == fVar.f114147b && this.f114146a == fVar.f114146a;
    }

    public final int hashCode() {
        return ((this.f114147b ? 1 : 0) * true) + (this.f114146a ? 1 : 0);
    }

    public final String toString() {
        boolean z = this.f114147b;
        boolean z2 = this.f114146a;
        return "WebHistoryState(canGoBack=" + z + ", canGoForward=" + z2 + ")";
    }
}
