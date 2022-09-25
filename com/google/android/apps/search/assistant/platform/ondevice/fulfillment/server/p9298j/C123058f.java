package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.f */
/* compiled from: PG */
final class C123058f extends C123065m {

    /* renamed from: a */
    private final String f340618a;

    /* renamed from: b */
    private final String f340619b;

    public C123058f(String str, String str2) {
        if (str != null) {
            this.f340618a = str;
            if (str2 != null) {
                this.f340619b = str2;
                return;
            }
            throw new NullPointerException("Null packageName");
        }
        throw new NullPointerException("Null appName");
    }

    /* renamed from: a */
    public final String mo105846a() {
        return this.f340618a;
    }

    /* renamed from: b */
    public final String mo105847b() {
        return this.f340619b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C123065m) {
            C123065m mVar = (C123065m) obj;
            return this.f340618a.equals(mVar.mo105846a()) && this.f340619b.equals(mVar.mo105847b());
        }
    }

    public final int hashCode() {
        return ((this.f340618a.hashCode() ^ 1000003) * 1000003) ^ this.f340619b.hashCode();
    }

    public final String toString() {
        String str = this.f340618a;
        String str2 = this.f340619b;
        return "InstalledAppInfo{appName=" + str + ", packageName=" + str2 + "}";
    }
}
