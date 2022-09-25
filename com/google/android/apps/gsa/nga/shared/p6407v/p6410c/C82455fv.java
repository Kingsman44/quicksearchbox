package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fv */
/* compiled from: PG */
public final class C82455fv extends C82685oi {

    /* renamed from: a */
    private final String f225296a = "NGA_VIS_CREATED_WITHOUT_SHOWING";

    /* renamed from: b */
    private final String f225297b;

    /* renamed from: c */
    private final String f225298c;

    public C82455fv(String str, String str2, String str3) {
        this.f225297b = str2;
        this.f225298c = str3;
    }

    /* renamed from: b */
    public final String mo76296b() {
        return this.f225297b;
    }

    /* renamed from: c */
    public final String mo76297c() {
        return this.f225298c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225296a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82685oi) {
            C82685oi oiVar = (C82685oi) obj;
            return this.f225296a.equals(oiVar.mo75583d()) && this.f225297b.equals(oiVar.mo76296b()) && this.f225298c.equals(oiVar.mo76297c());
        }
    }

    public final int hashCode() {
        return ((((this.f225296a.hashCode() ^ 1000003) * 1000003) ^ this.f225297b.hashCode()) * 1000003) ^ this.f225298c.hashCode();
    }

    public final String toString() {
        String str = this.f225296a;
        String str2 = this.f225297b;
        String str3 = this.f225298c;
        return "NgaVisCreatedWithoutShowingEvent{token=" + str + ", mobileAssistantExperience=" + str2 + ", processName=" + str3 + "}";
    }
}
