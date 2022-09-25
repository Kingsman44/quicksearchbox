package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cy */
/* compiled from: PG */
public final class C82377cy extends C82607ll {

    /* renamed from: a */
    private final String f225053a = "NGA_JINN_SPEECH_REWRITE";

    /* renamed from: b */
    private final String f225054b;

    /* renamed from: c */
    private final String f225055c;

    /* renamed from: d */
    private final boolean f225056d;

    /* renamed from: e */
    private final boolean f225057e;

    /* renamed from: f */
    private final String f225058f;

    public C82377cy(String str, String str2, String str3, boolean z, boolean z2, String str4) {
        this.f225054b = str2;
        this.f225055c = str3;
        this.f225056d = z;
        this.f225057e = z2;
        this.f225058f = str4;
    }

    /* renamed from: b */
    public final String mo75932b() {
        return this.f225055c;
    }

    /* renamed from: c */
    public final String mo75933c() {
        return this.f225058f;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225053a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82607ll) {
            C82607ll llVar = (C82607ll) obj;
            return this.f225053a.equals(llVar.mo75583d()) && this.f225054b.equals(llVar.mo75935f()) && this.f225055c.equals(llVar.mo75932b()) && this.f225056d == llVar.mo75936g() && this.f225057e == llVar.mo75937h() && this.f225058f.equals(llVar.mo75933c());
        }
    }

    /* renamed from: f */
    public final String mo75935f() {
        return this.f225054b;
    }

    /* renamed from: g */
    public final boolean mo75936g() {
        return this.f225056d;
    }

    /* renamed from: h */
    public final boolean mo75937h() {
        return this.f225057e;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.f225053a.hashCode() ^ 1000003) * 1000003) ^ this.f225054b.hashCode()) * 1000003) ^ this.f225055c.hashCode()) * 1000003) ^ (true != this.f225056d ? 1237 : 1231)) * 1000003;
        if (true == this.f225057e) {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f225058f.hashCode();
    }

    public final String toString() {
        String str = this.f225053a;
        String str2 = this.f225054b;
        String str3 = this.f225055c;
        boolean z = this.f225056d;
        boolean z2 = this.f225057e;
        String str4 = this.f225058f;
        return "NgaJinnSpeechRewriteEvent{token=" + str + ", recognitionEngine=" + str2 + ", eventType=" + str3 + ", rewrittenByJinn=" + z + ", topHypothesisGeneratedByJinn=" + z2 + ", jinnRewriteSourceType=" + str4 + "}";
    }
}
