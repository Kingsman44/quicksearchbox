package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cx */
/* compiled from: PG */
public final class C82376cx extends C82606lk {

    /* renamed from: a */
    private final String f225050a = "NGA_INVOCATION";

    /* renamed from: b */
    private final String f225051b;

    /* renamed from: c */
    private final String f225052c;

    public C82376cx(String str, String str2, String str3) {
        this.f225051b = str2;
        this.f225052c = str3;
    }

    /* renamed from: b */
    public final String mo75927b() {
        return this.f225052c;
    }

    /* renamed from: c */
    public final String mo75928c() {
        return this.f225051b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225050a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82606lk) {
            C82606lk lkVar = (C82606lk) obj;
            return this.f225050a.equals(lkVar.mo75583d()) && this.f225051b.equals(lkVar.mo75928c()) && this.f225052c.equals(lkVar.mo75927b());
        }
    }

    public final int hashCode() {
        return ((((this.f225050a.hashCode() ^ 1000003) * 1000003) ^ this.f225051b.hashCode()) * 1000003) ^ this.f225052c.hashCode();
    }

    public final String toString() {
        String str = this.f225050a;
        String str2 = this.f225051b;
        String str3 = this.f225052c;
        return "NgaInvocationEvent{token=" + str + ", type=" + str2 + ", attentionTrigger=" + str3 + "}";
    }
}
