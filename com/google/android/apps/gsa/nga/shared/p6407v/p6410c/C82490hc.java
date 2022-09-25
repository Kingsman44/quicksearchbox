package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.hc */
/* compiled from: PG */
final class C82490hc extends C82719pp {

    /* renamed from: a */
    private final String f225397a;

    /* renamed from: b */
    private final String f225398b;

    /* renamed from: c */
    private final String f225399c;

    public C82490hc(String str, String str2, String str3) {
        this.f225397a = str;
        this.f225398b = str2;
        this.f225399c = str3;
    }

    /* renamed from: b */
    public final String mo76448b() {
        return this.f225398b;
    }

    /* renamed from: c */
    public final String mo76449c() {
        return this.f225399c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225397a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82719pp) {
            C82719pp ppVar = (C82719pp) obj;
            return this.f225397a.equals(ppVar.mo75583d()) && this.f225398b.equals(ppVar.mo76448b()) && this.f225399c.equals(ppVar.mo76449c());
        }
    }

    public final int hashCode() {
        return ((((this.f225397a.hashCode() ^ 1000003) * 1000003) ^ this.f225398b.hashCode()) * 1000003) ^ this.f225399c.hashCode();
    }

    public final String toString() {
        String str = this.f225397a;
        String str2 = this.f225398b;
        String str3 = this.f225399c;
        return "PieUsecaseTrackingEvent{token=" + str + ", eventType=" + str2 + ", usecaseType=" + str3 + "}";
    }
}
