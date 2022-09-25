package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.au */
/* compiled from: PG */
public final class C82319au extends C82549jh {

    /* renamed from: a */
    private final String f224873a = "NETWORK_CONNECTIVITY_ON_INPUT_PLATE";

    /* renamed from: b */
    private final boolean f224874b;

    public C82319au(String str, boolean z) {
        this.f224874b = z;
    }

    /* renamed from: b */
    public final boolean mo75685b() {
        return this.f224874b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224873a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82549jh) {
            C82549jh jhVar = (C82549jh) obj;
            return this.f224873a.equals(jhVar.mo75583d()) && this.f224874b == jhVar.mo75685b();
        }
    }

    public final int hashCode() {
        return ((this.f224873a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f224874b ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f224873a;
        boolean z = this.f224874b;
        return "NetworkConnectivityOnInputPlateEvent{token=" + str + ", isConnected=" + z + "}";
    }
}
