package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gi */
/* compiled from: PG */
public final class C82469gi extends C82698ov {

    /* renamed from: a */
    private final String f225337a = "NGA_WARM_ACTIONS_SODA_CONFIG_ERROR";

    /* renamed from: b */
    private final int f225338b;

    /* renamed from: c */
    private final String f225339c;

    public C82469gi(String str, int i, String str2) {
        this.f225338b = i;
        this.f225339c = str2;
    }

    /* renamed from: b */
    public final int mo76359b() {
        return this.f225338b;
    }

    /* renamed from: c */
    public final String mo76360c() {
        return this.f225339c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225337a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82698ov) {
            C82698ov ovVar = (C82698ov) obj;
            return this.f225337a.equals(ovVar.mo75583d()) && this.f225338b == ovVar.mo76359b() && this.f225339c.equals(ovVar.mo76360c());
        }
    }

    public final int hashCode() {
        return ((((this.f225337a.hashCode() ^ 1000003) * 1000003) ^ this.f225338b) * 1000003) ^ this.f225339c.hashCode();
    }

    public final String toString() {
        String str = this.f225337a;
        int i = this.f225338b;
        String str2 = this.f225339c;
        return "NgaWarmActionsSodaConfigErrorEvent{token=" + str + ", contextType=" + i + ", errorType=" + str2 + "}";
    }
}
