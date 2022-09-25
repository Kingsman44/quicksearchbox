package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fu */
/* compiled from: PG */
public final class C82454fu extends C82684oh {

    /* renamed from: a */
    private final String f225293a = "NGA_VIS_CREATED";

    /* renamed from: b */
    private final String f225294b;

    /* renamed from: c */
    private final String f225295c;

    public C82454fu(String str, String str2, String str3) {
        this.f225294b = str2;
        this.f225295c = str3;
    }

    /* renamed from: b */
    public final String mo76291b() {
        return this.f225294b;
    }

    /* renamed from: c */
    public final String mo76292c() {
        return this.f225295c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225293a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82684oh) {
            C82684oh ohVar = (C82684oh) obj;
            return this.f225293a.equals(ohVar.mo75583d()) && this.f225294b.equals(ohVar.mo76291b()) && this.f225295c.equals(ohVar.mo76292c());
        }
    }

    public final int hashCode() {
        return ((((this.f225293a.hashCode() ^ 1000003) * 1000003) ^ this.f225294b.hashCode()) * 1000003) ^ this.f225295c.hashCode();
    }

    public final String toString() {
        String str = this.f225293a;
        String str2 = this.f225294b;
        String str3 = this.f225295c;
        return "NgaVisCreatedEvent{token=" + str + ", mobileAssistantExperience=" + str2 + ", processName=" + str3 + "}";
    }
}
