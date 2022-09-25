package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ev */
/* compiled from: PG */
public final class C82428ev extends C82658ni {

    /* renamed from: a */
    private final String f225218a = "NGA_SODA_INITIALIZATION_FAILURE_WITH_LOCALE2";

    /* renamed from: b */
    private final String f225219b;

    /* renamed from: c */
    private final int f225220c;

    /* renamed from: d */
    private final String f225221d;

    public C82428ev(String str, String str2, int i, String str3) {
        this.f225219b = str2;
        this.f225220c = i;
        this.f225221d = str3;
    }

    /* renamed from: b */
    public final int mo76179b() {
        return this.f225220c;
    }

    /* renamed from: c */
    public final String mo76180c() {
        return this.f225219b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225218a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82658ni) {
            C82658ni niVar = (C82658ni) obj;
            return this.f225218a.equals(niVar.mo75583d()) && this.f225219b.equals(niVar.mo76180c()) && this.f225220c == niVar.mo76179b() && this.f225221d.equals(niVar.mo76182f());
        }
    }

    /* renamed from: f */
    public final String mo76182f() {
        return this.f225221d;
    }

    public final int hashCode() {
        return ((((((this.f225218a.hashCode() ^ 1000003) * 1000003) ^ this.f225219b.hashCode()) * 1000003) ^ this.f225220c) * 1000003) ^ this.f225221d.hashCode();
    }

    public final String toString() {
        String str = this.f225218a;
        String str2 = this.f225219b;
        int i = this.f225220c;
        String str3 = this.f225221d;
        return "NgaSodaInitializationFailureWithLocaleEvent{token=" + str + ", assistantLocale=" + str2 + ", lpVersion=" + i + ", failureReason=" + str3 + "}";
    }
}
