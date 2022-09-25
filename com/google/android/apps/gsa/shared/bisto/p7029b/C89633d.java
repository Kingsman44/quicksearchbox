package com.google.android.apps.gsa.shared.bisto.p7029b;

/* renamed from: com.google.android.apps.gsa.shared.bisto.b.d */
/* compiled from: PG */
final class C89633d extends C89637h {

    /* renamed from: a */
    private final String f242710a;

    /* renamed from: b */
    private final String f242711b;

    public C89633d(String str, String str2) {
        this.f242710a = str;
        this.f242711b = str2;
    }

    /* renamed from: a */
    public final String mo83508a() {
        return this.f242711b;
    }

    /* renamed from: b */
    public final String mo83509b() {
        return this.f242710a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89637h) {
            C89637h hVar = (C89637h) obj;
            return this.f242710a.equals(hVar.mo83509b()) && this.f242711b.equals(hVar.mo83508a());
        }
    }

    public final int hashCode() {
        return ((this.f242710a.hashCode() ^ 1000003) * 1000003) ^ this.f242711b.hashCode();
    }

    public final String toString() {
        String str = this.f242710a;
        String str2 = this.f242711b;
        return "DebugToggle{title=" + str + ", summary=" + str2 + "}";
    }
}
