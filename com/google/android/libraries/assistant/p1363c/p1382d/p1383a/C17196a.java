package com.google.android.libraries.assistant.p1363c.p1382d.p1383a;

/* renamed from: com.google.android.libraries.assistant.c.d.a.a */
/* compiled from: PG */
public final class C17196a extends C17197b {

    /* renamed from: a */
    public final String f49938a;

    /* renamed from: b */
    private final String f49939b;

    public C17196a(String str, String str2) {
        this.f49938a = str;
        this.f49939b = str2;
    }

    /* renamed from: a */
    public final String mo23232a() {
        return this.f49938a;
    }

    /* renamed from: b */
    public final String mo23233b() {
        return this.f49939b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17197b) {
            C17197b bVar = (C17197b) obj;
            return this.f49938a.equals(bVar.mo23232a()) && this.f49939b.equals(bVar.mo23233b());
        }
    }

    public final int hashCode() {
        return ((this.f49938a.hashCode() ^ 1000003) * 1000003) ^ this.f49939b.hashCode();
    }

    public final String toString() {
        String str = this.f49938a;
        String str2 = this.f49939b;
        return "JniLibrary{name=" + str + ", splitName=" + str2 + "}";
    }
}
