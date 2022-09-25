package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fl */
/* compiled from: PG */
public final class C82445fl extends C82674ny {

    /* renamed from: a */
    private final String f225275a = "NGA_UI_SUGGESTION_INVOCATION_COLLECTION_TIMEOUT_PER_DEVICE";

    /* renamed from: b */
    private final String f225276b;

    /* renamed from: c */
    private final String f225277c;

    public C82445fl(String str, String str2, String str3) {
        this.f225276b = str2;
        this.f225277c = str3;
    }

    /* renamed from: b */
    public final String mo76255b() {
        return this.f225276b;
    }

    /* renamed from: c */
    public final String mo76256c() {
        return this.f225277c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225275a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82674ny) {
            C82674ny nyVar = (C82674ny) obj;
            return this.f225275a.equals(nyVar.mo75583d()) && this.f225276b.equals(nyVar.mo76255b()) && this.f225277c.equals(nyVar.mo76256c());
        }
    }

    public final int hashCode() {
        return ((((this.f225275a.hashCode() ^ 1000003) * 1000003) ^ this.f225276b.hashCode()) * 1000003) ^ this.f225277c.hashCode();
    }

    public final String toString() {
        String str = this.f225275a;
        String str2 = this.f225276b;
        String str3 = this.f225277c;
        return "NgaUiSuggestionInvocationCollectionTimeoutPerDeviceEvent{token=" + str + ", deviceModel=" + str2 + ", providerName=" + str3 + "}";
    }
}
