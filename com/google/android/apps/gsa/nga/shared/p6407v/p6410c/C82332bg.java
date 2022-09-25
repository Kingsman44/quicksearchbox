package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bg */
/* compiled from: PG */
public final class C82332bg extends C82561jt {

    /* renamed from: a */
    private final String f224916a = "NGA_COMPONENT_LIFECYCLE_STATUS";

    /* renamed from: b */
    private final String f224917b;

    /* renamed from: c */
    private final boolean f224918c;

    public C82332bg(String str, String str2, boolean z) {
        this.f224917b = str2;
        this.f224918c = z;
    }

    /* renamed from: b */
    public final String mo75750b() {
        return this.f224917b;
    }

    /* renamed from: c */
    public final boolean mo75751c() {
        return this.f224918c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224916a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82561jt) {
            C82561jt jtVar = (C82561jt) obj;
            return this.f224916a.equals(jtVar.mo75583d()) && this.f224917b.equals(jtVar.mo75750b()) && this.f224918c == jtVar.mo75751c();
        }
    }

    public final int hashCode() {
        return ((((this.f224916a.hashCode() ^ 1000003) * 1000003) ^ this.f224917b.hashCode()) * 1000003) ^ (true != this.f224918c ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f224916a;
        String str2 = this.f224917b;
        boolean z = this.f224918c;
        return "NgaComponentLifecycleStatusEvent{token=" + str + ", component=" + str2 + ", lifecycleSucceeded=" + z + "}";
    }
}
