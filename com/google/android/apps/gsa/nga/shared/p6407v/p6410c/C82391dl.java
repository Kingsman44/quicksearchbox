package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.dl */
/* compiled from: PG */
public final class C82391dl extends C82620ly {

    /* renamed from: a */
    private final String f225102a = "NGA_NATIVE_LIBRARY_LOADING_STATUS";

    /* renamed from: b */
    private final String f225103b;

    /* renamed from: c */
    private final boolean f225104c;

    /* renamed from: d */
    private final String f225105d;

    public C82391dl(String str, String str2, boolean z, String str3) {
        this.f225103b = str2;
        this.f225104c = z;
        this.f225105d = str3;
    }

    /* renamed from: b */
    public final String mo75997b() {
        return this.f225103b;
    }

    /* renamed from: c */
    public final String mo75998c() {
        return this.f225105d;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225102a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82620ly) {
            C82620ly lyVar = (C82620ly) obj;
            return this.f225102a.equals(lyVar.mo75583d()) && this.f225103b.equals(lyVar.mo75997b()) && this.f225104c == lyVar.mo76000f() && this.f225105d.equals(lyVar.mo75998c());
        }
    }

    /* renamed from: f */
    public final boolean mo76000f() {
        return this.f225104c;
    }

    public final int hashCode() {
        return ((((((this.f225102a.hashCode() ^ 1000003) * 1000003) ^ this.f225103b.hashCode()) * 1000003) ^ (true != this.f225104c ? 1237 : 1231)) * 1000003) ^ this.f225105d.hashCode();
    }

    public final String toString() {
        String str = this.f225102a;
        String str2 = this.f225103b;
        boolean z = this.f225104c;
        String str3 = this.f225105d;
        return "NgaNativeLibraryLoadingStatusEvent{token=" + str + ", libraryName=" + str2 + ", splitInstalled=" + z + ", loadStatus=" + str3 + "}";
    }
}
