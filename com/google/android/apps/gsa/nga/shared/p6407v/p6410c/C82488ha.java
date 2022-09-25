package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ha */
/* compiled from: PG */
final class C82488ha extends C82717pn {

    /* renamed from: a */
    private final String f225392a;

    /* renamed from: b */
    private final String f225393b;

    public C82488ha(String str, String str2) {
        this.f225392a = str;
        this.f225393b = str2;
    }

    /* renamed from: b */
    public final String mo76442b() {
        return this.f225393b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225392a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82717pn) {
            C82717pn pnVar = (C82717pn) obj;
            return this.f225392a.equals(pnVar.mo75583d()) && this.f225393b.equals(pnVar.mo76442b());
        }
    }

    public final int hashCode() {
        return ((this.f225392a.hashCode() ^ 1000003) * 1000003) ^ this.f225393b.hashCode();
    }

    public final String toString() {
        String str = this.f225392a;
        String str2 = this.f225393b;
        return "PieTriggeringInfraEvent{token=" + str + ", eventType=" + str2 + "}";
    }
}
