package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gp */
/* compiled from: PG */
public final class C82476gp extends C82706pc {

    /* renamed from: a */
    private final String f225358a = "NGA_WARM_ACTIONS_VALID_QUERY";

    /* renamed from: b */
    private final int f225359b;

    /* renamed from: c */
    private final boolean f225360c;

    public C82476gp(String str, int i, boolean z) {
        this.f225359b = i;
        this.f225360c = z;
    }

    /* renamed from: b */
    public final int mo76394b() {
        return this.f225359b;
    }

    /* renamed from: c */
    public final boolean mo76395c() {
        return this.f225360c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225358a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82706pc) {
            C82706pc pcVar = (C82706pc) obj;
            return this.f225358a.equals(pcVar.mo75583d()) && this.f225359b == pcVar.mo76394b() && this.f225360c == pcVar.mo76395c();
        }
    }

    public final int hashCode() {
        return ((((this.f225358a.hashCode() ^ 1000003) * 1000003) ^ this.f225359b) * 1000003) ^ (true != this.f225360c ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f225358a;
        int i = this.f225359b;
        boolean z = this.f225360c;
        return "NgaWarmActionsValidQueryEvent{token=" + str + ", contextType=" + i + ", valid=" + z + "}";
    }
}
