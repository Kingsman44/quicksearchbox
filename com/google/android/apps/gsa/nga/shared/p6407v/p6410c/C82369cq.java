package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cq */
/* compiled from: PG */
final class C82369cq extends C82599ld {

    /* renamed from: a */
    private final String f225022a;

    /* renamed from: b */
    private final String f225023b;

    /* renamed from: c */
    private final int f225024c;

    /* renamed from: d */
    private final String f225025d;

    /* renamed from: e */
    private final String f225026e;

    /* renamed from: f */
    private final String f225027f;

    /* renamed from: g */
    private final boolean f225028g;

    /* renamed from: h */
    private final String f225029h;

    /* renamed from: i */
    private final String f225030i;

    public C82369cq(String str, String str2, int i, String str3, String str4, String str5, boolean z, String str6, String str7) {
        this.f225022a = str;
        this.f225023b = str2;
        this.f225024c = i;
        this.f225025d = str3;
        this.f225026e = str4;
        this.f225027f = str5;
        this.f225028g = z;
        this.f225029h = str6;
        this.f225030i = str7;
    }

    /* renamed from: b */
    public final int mo75890b() {
        return this.f225024c;
    }

    /* renamed from: c */
    public final String mo75891c() {
        return this.f225030i;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225022a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82599ld) {
            C82599ld ldVar = (C82599ld) obj;
            return this.f225022a.equals(ldVar.mo75583d()) && this.f225023b.equals(ldVar.mo75894g()) && this.f225024c == ldVar.mo75890b() && this.f225025d.equals(ldVar.mo75895h()) && this.f225026e.equals(ldVar.mo75898j()) && this.f225027f.equals(ldVar.mo75897i()) && this.f225028g == ldVar.mo75899k() && this.f225029h.equals(ldVar.mo75893f()) && this.f225030i.equals(ldVar.mo75891c());
        }
    }

    /* renamed from: f */
    public final String mo75893f() {
        return this.f225029h;
    }

    /* renamed from: g */
    public final String mo75894g() {
        return this.f225023b;
    }

    /* renamed from: h */
    public final String mo75895h() {
        return this.f225025d;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f225022a.hashCode() ^ 1000003) * 1000003) ^ this.f225023b.hashCode()) * 1000003) ^ this.f225024c) * 1000003) ^ this.f225025d.hashCode()) * 1000003) ^ this.f225026e.hashCode()) * 1000003) ^ this.f225027f.hashCode()) * 1000003) ^ (true != this.f225028g ? 1237 : 1231)) * 1000003) ^ this.f225029h.hashCode()) * 1000003) ^ this.f225030i.hashCode();
    }

    /* renamed from: i */
    public final String mo75897i() {
        return this.f225027f;
    }

    /* renamed from: j */
    public final String mo75898j() {
        return this.f225026e;
    }

    /* renamed from: k */
    public final boolean mo75899k() {
        return this.f225028g;
    }

    public final String toString() {
        String str = this.f225022a;
        String str2 = this.f225023b;
        int i = this.f225024c;
        String str3 = this.f225025d;
        String str4 = this.f225026e;
        String str5 = this.f225027f;
        boolean z = this.f225028g;
        String str6 = this.f225029h;
        String str7 = this.f225030i;
        return "NgaHotwordEvent{token=" + str + ", source=" + str2 + ", stage=" + i + ", speechRecognizer=" + str3 + ", voiceMatch=" + str4 + ", triggerType=" + str5 + ", delegatedToNga=" + z + ", screenLocked=" + str6 + ", pixelFourOrHigher=" + str7 + "}";
    }
}
