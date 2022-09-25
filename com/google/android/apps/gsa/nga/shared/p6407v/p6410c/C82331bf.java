package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bf */
/* compiled from: PG */
public final class C82331bf extends C82560js {

    /* renamed from: a */
    private final String f224911a = "NGA_COMPONENT_LIFECYCLE_LATENCY";

    /* renamed from: b */
    private final Double f224912b;

    /* renamed from: c */
    private final String f224913c;

    /* renamed from: d */
    private final boolean f224914d;

    /* renamed from: e */
    private final boolean f224915e;

    public C82331bf(String str, Double d, String str2, boolean z, boolean z2) {
        this.f224912b = d;
        this.f224913c = str2;
        this.f224914d = z;
        this.f224915e = z2;
    }

    /* renamed from: b */
    public final Double mo75743b() {
        return this.f224912b;
    }

    /* renamed from: c */
    public final String mo75744c() {
        return this.f224913c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224911a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82560js) {
            C82560js jsVar = (C82560js) obj;
            return this.f224911a.equals(jsVar.mo75583d()) && this.f224912b.equals(jsVar.mo75743b()) && this.f224913c.equals(jsVar.mo75744c()) && this.f224914d == jsVar.mo75746f() && this.f224915e == jsVar.mo75747g();
        }
    }

    /* renamed from: f */
    public final boolean mo75746f() {
        return this.f224914d;
    }

    /* renamed from: g */
    public final boolean mo75747g() {
        return this.f224915e;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.f224911a.hashCode() ^ 1000003) * 1000003) ^ this.f224912b.hashCode()) * 1000003) ^ this.f224913c.hashCode()) * 1000003) ^ (true != this.f224914d ? 1237 : 1231)) * 1000003;
        if (true == this.f224915e) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f224911a;
        Double d = this.f224912b;
        String str2 = this.f224913c;
        boolean z = this.f224914d;
        boolean z2 = this.f224915e;
        return "NgaComponentLifecycleLatencyEvent{token=" + str + ", value=" + d + ", componentName=" + str2 + ", firstLifecycle=" + z + ", lifecycleSucceeded=" + z2 + "}";
    }
}
