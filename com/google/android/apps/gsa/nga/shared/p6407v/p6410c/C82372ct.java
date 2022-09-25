package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ct */
/* compiled from: PG */
public final class C82372ct extends C82602lg {

    /* renamed from: a */
    private final String f225035a = "NGA_INITIAL_DOWNLOAD";

    /* renamed from: b */
    private final String f225036b;

    /* renamed from: c */
    private final String f225037c;

    public C82372ct(String str, String str2, String str3) {
        this.f225036b = str2;
        this.f225037c = str3;
    }

    /* renamed from: b */
    public final String mo75909b() {
        return this.f225036b;
    }

    /* renamed from: c */
    public final String mo75910c() {
        return this.f225037c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225035a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82602lg) {
            C82602lg lgVar = (C82602lg) obj;
            return this.f225035a.equals(lgVar.mo75583d()) && this.f225036b.equals(lgVar.mo75909b()) && this.f225037c.equals(lgVar.mo75910c());
        }
    }

    public final int hashCode() {
        return ((((this.f225035a.hashCode() ^ 1000003) * 1000003) ^ this.f225036b.hashCode()) * 1000003) ^ this.f225037c.hashCode();
    }

    public final String toString() {
        String str = this.f225035a;
        String str2 = this.f225036b;
        String str3 = this.f225037c;
        return "NgaInitialDownloadEvent{token=" + str + ", locale=" + str2 + ", status=" + str3 + "}";
    }
}
