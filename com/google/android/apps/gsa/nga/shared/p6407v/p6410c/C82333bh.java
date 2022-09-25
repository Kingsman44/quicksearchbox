package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bh */
/* compiled from: PG */
public final class C82333bh extends C82562ju {

    /* renamed from: a */
    private final String f224919a = "NGA_CONTACT_API";

    /* renamed from: b */
    private final String f224920b = "CALLING_COMPONENT_NAME_NGA_GENERAL";

    public C82333bh(String str, String str2) {
    }

    /* renamed from: b */
    public final String mo75755b() {
        return this.f224920b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224919a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82562ju) {
            C82562ju juVar = (C82562ju) obj;
            return this.f224919a.equals(juVar.mo75583d()) && this.f224920b.equals(juVar.mo75755b());
        }
    }

    public final int hashCode() {
        return ((this.f224919a.hashCode() ^ 1000003) * 1000003) ^ this.f224920b.hashCode();
    }

    public final String toString() {
        String str = this.f224919a;
        String str2 = this.f224920b;
        return "NgaContactApiEvent{token=" + str + ", callingComponentName=" + str2 + "}";
    }
}
