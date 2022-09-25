package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6402r;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.r.b */
/* compiled from: PG */
final class C82033b extends C82037d {

    /* renamed from: b */
    private final boolean f224259b;

    /* renamed from: c */
    private final boolean f224260c;

    public C82033b(boolean z, boolean z2) {
        this.f224259b = z;
        this.f224260c = z2;
    }

    /* renamed from: a */
    public final boolean mo75470a() {
        return this.f224259b;
    }

    /* renamed from: b */
    public final boolean mo75471b() {
        return this.f224260c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82037d) {
            C82037d dVar = (C82037d) obj;
            return this.f224259b == dVar.mo75470a() && this.f224260c == dVar.mo75471b();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.f224259b ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.f224260c) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f224259b;
        boolean z2 = this.f224260c;
        return "SystemUiVisibilityFlags{lightNavBar=" + z + ", lightStatusBar=" + z2 + "}";
    }
}
