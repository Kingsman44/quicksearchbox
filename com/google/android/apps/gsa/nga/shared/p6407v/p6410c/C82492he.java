package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.he */
/* compiled from: PG */
public final class C82492he extends C82721pr {

    /* renamed from: a */
    private final String f225402a = "REQUEST_STATUS_WITH_BLUETOOTH_STATE_COUNT";

    /* renamed from: b */
    private final String f225403b;

    /* renamed from: c */
    private final String f225404c;

    public C82492he(String str, String str2, String str3) {
        this.f225403b = str2;
        this.f225404c = str3;
    }

    /* renamed from: b */
    public final String mo76457b() {
        return this.f225404c;
    }

    /* renamed from: c */
    public final String mo76458c() {
        return this.f225403b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225402a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82721pr) {
            C82721pr prVar = (C82721pr) obj;
            return this.f225402a.equals(prVar.mo75583d()) && this.f225403b.equals(prVar.mo76458c()) && this.f225404c.equals(prVar.mo76457b());
        }
    }

    public final int hashCode() {
        return ((((this.f225402a.hashCode() ^ 1000003) * 1000003) ^ this.f225403b.hashCode()) * 1000003) ^ this.f225404c.hashCode();
    }

    public final String toString() {
        String str = this.f225402a;
        String str2 = this.f225403b;
        String str3 = this.f225404c;
        return "RequestStatusWithBluetoothStateCountEvent{token=" + str + ", status=" + str2 + ", bluetoothState=" + str3 + "}";
    }
}
