package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gv */
/* compiled from: PG */
public final class C82482gv extends C82712pi {

    /* renamed from: a */
    private final String f225373a = "OPA_SEARCH_ERROR_BRANCH";

    /* renamed from: b */
    private final String f225374b = BuildConfig.FLAVOR;

    /* renamed from: c */
    private final String f225375c;

    /* renamed from: d */
    private final String f225376d;

    public C82482gv(String str, String str2, String str3, String str4) {
        this.f225375c = str3;
        this.f225376d = str4;
    }

    /* renamed from: b */
    public final String mo76421b() {
        return this.f225375c;
    }

    /* renamed from: c */
    public final String mo76422c() {
        return this.f225376d;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225373a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82712pi) {
            C82712pi piVar = (C82712pi) obj;
            return this.f225373a.equals(piVar.mo75583d()) && this.f225374b.equals(piVar.mo76424f()) && this.f225375c.equals(piVar.mo76421b()) && this.f225376d.equals(piVar.mo76422c());
        }
    }

    /* renamed from: f */
    public final String mo76424f() {
        return this.f225374b;
    }

    public final int hashCode() {
        return ((((((this.f225373a.hashCode() ^ 1000003) * 1000003) ^ this.f225374b.hashCode()) * 1000003) ^ this.f225375c.hashCode()) * 1000003) ^ this.f225376d.hashCode();
    }

    public final String toString() {
        String str = this.f225373a;
        String str2 = this.f225374b;
        String str3 = this.f225375c;
        String str4 = this.f225376d;
        return "OpaSearchErrorBranchEvent{token=" + str + ", mobileAssistantExperience=" + str2 + ", branch=" + str3 + ", cause=" + str4 + "}";
    }
}
