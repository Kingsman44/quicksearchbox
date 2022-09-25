package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.hn */
/* compiled from: PG */
public final class C82501hn extends C82731qa {

    /* renamed from: a */
    private final String f225426a = "UNINTENDED_QUERY_SUPPRESSION_COUNT";

    /* renamed from: b */
    private final String f225427b;

    /* renamed from: c */
    private final boolean f225428c;

    /* renamed from: d */
    private final String f225429d;

    public C82501hn(String str, String str2, boolean z, String str3) {
        this.f225427b = str2;
        this.f225428c = z;
        this.f225429d = BuildConfig.FLAVOR;
    }

    /* renamed from: b */
    public final String mo76499b() {
        return this.f225429d;
    }

    /* renamed from: c */
    public final String mo76500c() {
        return this.f225427b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225426a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82731qa) {
            C82731qa qaVar = (C82731qa) obj;
            return this.f225426a.equals(qaVar.mo75583d()) && this.f225427b.equals(qaVar.mo76500c()) && this.f225428c == qaVar.mo76502f() && this.f225429d.equals(qaVar.mo76499b());
        }
    }

    /* renamed from: f */
    public final boolean mo76502f() {
        return this.f225428c;
    }

    public final int hashCode() {
        return ((((((this.f225426a.hashCode() ^ 1000003) * 1000003) ^ this.f225427b.hashCode()) * 1000003) ^ (true != this.f225428c ? 1237 : 1231)) * 1000003) ^ this.f225429d.hashCode();
    }

    public final String toString() {
        String str = this.f225426a;
        String str2 = this.f225427b;
        boolean z = this.f225428c;
        String str3 = this.f225429d;
        return "UnintendedQuerySuppressionCountEvent{token=" + str + ", language=" + str2 + ", isSuppressed=" + z + ", expName=" + str3 + "}";
    }
}
