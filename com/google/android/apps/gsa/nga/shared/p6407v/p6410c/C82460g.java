package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.g */
/* compiled from: PG */
public final class C82460g extends C82325b {

    /* renamed from: a */
    private final String f225312a = "ASSIST_DATA_C_D_C_SIZE";

    /* renamed from: b */
    private final Double f225313b;

    /* renamed from: c */
    private final String f225314c;

    public C82460g(String str, Double d, String str2) {
        this.f225313b = d;
        this.f225314c = str2;
    }

    /* renamed from: b */
    public final Double mo75717b() {
        return this.f225313b;
    }

    /* renamed from: c */
    public final String mo75718c() {
        return this.f225314c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225312a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82325b) {
            C82325b bVar = (C82325b) obj;
            return this.f225312a.equals(bVar.mo75583d()) && this.f225313b.equals(bVar.mo75717b()) && this.f225314c.equals(bVar.mo75718c());
        }
    }

    public final int hashCode() {
        return ((((this.f225312a.hashCode() ^ 1000003) * 1000003) ^ this.f225313b.hashCode()) * 1000003) ^ this.f225314c.hashCode();
    }

    public final String toString() {
        String str = this.f225312a;
        Double d = this.f225313b;
        String str2 = this.f225314c;
        return "AssistDataCDCSizeEvent{token=" + str + ", value=" + d + ", assistDataType=" + str2 + "}";
    }
}
