package com.google.android.libraries.assistant.p1363c.p1371b.p1379f;

/* renamed from: com.google.android.libraries.assistant.c.b.f.a */
/* compiled from: PG */
final class C17122a extends C17149l {

    /* renamed from: a */
    private final String f49805a;

    /* renamed from: b */
    private final String f49806b;

    public C17122a(String str, String str2) {
        if (str != null) {
            this.f49805a = str;
            this.f49806b = str2;
            return;
        }
        throw new NullPointerException("Null groupName");
    }

    /* renamed from: a */
    public final String mo23193a() {
        return this.f49805a;
    }

    /* renamed from: b */
    public final String mo23194b() {
        return this.f49806b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17149l) {
            C17149l lVar = (C17149l) obj;
            return this.f49805a.equals(lVar.mo23193a()) && this.f49806b.equals(lVar.mo23194b());
        }
    }

    public final int hashCode() {
        return ((this.f49805a.hashCode() ^ 1000003) * 1000003) ^ this.f49806b.hashCode();
    }

    public final String toString() {
        String str = this.f49805a;
        String str2 = this.f49806b;
        return "CacheKey{groupName=" + str + ", locale=" + str2 + "}";
    }
}
