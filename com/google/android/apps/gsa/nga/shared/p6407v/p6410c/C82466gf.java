package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gf */
/* compiled from: PG */
public final class C82466gf extends C82695os {

    /* renamed from: a */
    private final String f225329a = "NGA_WARM_ACTIONS_RESOURCE_FILE_STATUS";

    /* renamed from: b */
    private final String f225330b;

    /* renamed from: c */
    private final boolean f225331c;

    public C82466gf(String str, String str2, boolean z) {
        this.f225330b = str2;
        this.f225331c = z;
    }

    /* renamed from: b */
    public final String mo76345b() {
        return this.f225330b;
    }

    /* renamed from: c */
    public final boolean mo76346c() {
        return this.f225331c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225329a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82695os) {
            C82695os osVar = (C82695os) obj;
            return this.f225329a.equals(osVar.mo75583d()) && this.f225330b.equals(osVar.mo76345b()) && this.f225331c == osVar.mo76346c();
        }
    }

    public final int hashCode() {
        return ((((this.f225329a.hashCode() ^ 1000003) * 1000003) ^ this.f225330b.hashCode()) * 1000003) ^ (true != this.f225331c ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f225329a;
        String str2 = this.f225330b;
        boolean z = this.f225331c;
        return "NgaWarmActionsResourceFileStatusEvent{token=" + str + ", fileId=" + str2 + ", present=" + z + "}";
    }
}
