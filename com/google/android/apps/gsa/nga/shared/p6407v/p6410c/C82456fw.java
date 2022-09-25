package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fw */
/* compiled from: PG */
public final class C82456fw extends C82686oj {

    /* renamed from: a */
    private final String f225299a = "NGA_VIS_SHOW_AFTER_CREATED";

    /* renamed from: b */
    private final Double f225300b;

    /* renamed from: c */
    private final String f225301c;

    /* renamed from: d */
    private final String f225302d;

    public C82456fw(String str, Double d, String str2, String str3) {
        this.f225300b = d;
        this.f225301c = str2;
        this.f225302d = str3;
    }

    /* renamed from: b */
    public final Double mo76301b() {
        return this.f225300b;
    }

    /* renamed from: c */
    public final String mo76302c() {
        return this.f225301c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225299a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82686oj) {
            C82686oj ojVar = (C82686oj) obj;
            return this.f225299a.equals(ojVar.mo75583d()) && this.f225300b.equals(ojVar.mo76301b()) && this.f225301c.equals(ojVar.mo76302c()) && this.f225302d.equals(ojVar.mo76304f());
        }
    }

    /* renamed from: f */
    public final String mo76304f() {
        return this.f225302d;
    }

    public final int hashCode() {
        return ((((((this.f225299a.hashCode() ^ 1000003) * 1000003) ^ this.f225300b.hashCode()) * 1000003) ^ this.f225301c.hashCode()) * 1000003) ^ this.f225302d.hashCode();
    }

    public final String toString() {
        String str = this.f225299a;
        Double d = this.f225300b;
        String str2 = this.f225301c;
        String str3 = this.f225302d;
        return "NgaVisShowAfterCreatedEvent{token=" + str + ", value=" + d + ", mobileAssistantExperience=" + str2 + ", processName=" + str3 + "}";
    }
}
