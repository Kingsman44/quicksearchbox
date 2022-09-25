package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.y */
/* compiled from: PG */
public final class C82747y extends C82525ik {

    /* renamed from: a */
    private final String f225507a = "DID_RESULT_COUNT";

    /* renamed from: b */
    private final String f225508b = "unknown";

    /* renamed from: c */
    private final String f225509c;

    /* renamed from: d */
    private final String f225510d;

    /* renamed from: e */
    private final String f225511e;

    public C82747y(String str, String str2, String str3, String str4, String str5) {
        this.f225509c = str3;
        this.f225510d = str4;
        this.f225511e = str5;
    }

    /* renamed from: b */
    public final String mo76570b() {
        return this.f225509c;
    }

    /* renamed from: c */
    public final String mo76571c() {
        return this.f225510d;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225507a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82525ik) {
            C82525ik ikVar = (C82525ik) obj;
            return this.f225507a.equals(ikVar.mo75583d()) && this.f225508b.equals(ikVar.mo76572f()) && this.f225509c.equals(ikVar.mo76570b()) && this.f225510d.equals(ikVar.mo76571c()) && this.f225511e.equals(ikVar.mo76573g());
        }
    }

    /* renamed from: f */
    public final String mo76572f() {
        return this.f225508b;
    }

    /* renamed from: g */
    public final String mo76573g() {
        return this.f225511e;
    }

    public final int hashCode() {
        return ((((((((this.f225507a.hashCode() ^ 1000003) * 1000003) ^ this.f225508b.hashCode()) * 1000003) ^ this.f225509c.hashCode()) * 1000003) ^ this.f225510d.hashCode()) * 1000003) ^ this.f225511e.hashCode();
    }

    public final String toString() {
        String str = this.f225507a;
        String str2 = this.f225508b;
        String str3 = this.f225509c;
        String str4 = this.f225510d;
        String str5 = this.f225511e;
        return "DidResultCountEvent{token=" + str + ", modelVersion=" + str2 + ", languageCode=" + str3 + ", mode=" + str4 + ", reason=" + str5 + "}";
    }
}
