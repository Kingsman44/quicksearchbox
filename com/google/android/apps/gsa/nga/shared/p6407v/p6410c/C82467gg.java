package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gg */
/* compiled from: PG */
public final class C82467gg extends C82696ot {

    /* renamed from: a */
    private final String f225332a = "NGA_WARM_ACTIONS_RESOURCE_URI_STATUS";

    /* renamed from: b */
    private final String f225333b;

    /* renamed from: c */
    private final boolean f225334c;

    public C82467gg(String str, String str2, boolean z) {
        this.f225333b = str2;
        this.f225334c = z;
    }

    /* renamed from: b */
    public final String mo76350b() {
        return this.f225333b;
    }

    /* renamed from: c */
    public final boolean mo76351c() {
        return this.f225334c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225332a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82696ot) {
            C82696ot otVar = (C82696ot) obj;
            return this.f225332a.equals(otVar.mo75583d()) && this.f225333b.equals(otVar.mo76350b()) && this.f225334c == otVar.mo76351c();
        }
    }

    public final int hashCode() {
        return ((((this.f225332a.hashCode() ^ 1000003) * 1000003) ^ this.f225333b.hashCode()) * 1000003) ^ (true != this.f225334c ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f225332a;
        String str2 = this.f225333b;
        boolean z = this.f225334c;
        return "NgaWarmActionsResourceUriStatusEvent{token=" + str + ", fileId=" + str2 + ", present=" + z + "}";
    }
}
