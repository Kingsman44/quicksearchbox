package com.google.android.apps.search.assistant.verticals.p9880a.p9884c.p9885a;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.c.a.k */
/* compiled from: PG */
final class C130347k extends C130345i {

    /* renamed from: a */
    private final String f357251a;

    /* renamed from: b */
    private final String f357252b;

    /* renamed from: c */
    private final String f357253c;

    /* renamed from: d */
    private final int f357254d;

    public C130347k(int i, String str, String str2, String str3) {
        this.f357254d = i;
        if (str != null) {
            this.f357251a = str;
            if (str2 != null) {
                this.f357252b = str2;
                if (str3 != null) {
                    this.f357253c = str3;
                    return;
                }
                throw new NullPointerException("Null activityClassName");
            }
            throw new NullPointerException("Null appPackageName");
        }
        throw new NullPointerException("Null activityId");
    }

    /* renamed from: b */
    public final String mo109671b() {
        return this.f357253c;
    }

    /* renamed from: c */
    public final String mo109672c() {
        return this.f357251a;
    }

    /* renamed from: d */
    public final String mo109673d() {
        return this.f357252b;
    }

    /* renamed from: e */
    public final int mo109674e() {
        return this.f357254d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C130345i) {
            C130345i iVar = (C130345i) obj;
            return this.f357254d == iVar.mo109674e() && this.f357251a.equals(iVar.mo109672c()) && this.f357252b.equals(iVar.mo109673d()) && this.f357253c.equals(iVar.mo109671b());
        }
    }

    public final int hashCode() {
        return ((((((this.f357254d ^ 1000003) * 1000003) ^ this.f357251a.hashCode()) * 1000003) ^ this.f357252b.hashCode()) * 1000003) ^ this.f357253c.hashCode();
    }

    public final String toString() {
        int i = this.f357254d;
        String str = i != 1 ? i != 2 ? "APP_CONTROL_SDK" : "ANDROID_API" : "UNKNOWN";
        String str2 = this.f357251a;
        String str3 = this.f357252b;
        String str4 = this.f357253c;
        return "ForegroundActivity{source=" + str + ", activityId=" + str2 + ", appPackageName=" + str3 + ", activityClassName=" + str4 + "}";
    }
}
