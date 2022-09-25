package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.dq */
/* compiled from: PG */
public final class C82396dq extends C82626md {

    /* renamed from: a */
    private final String f225119a = "NGA_ON_DEVICE_FULFILLMENT";

    /* renamed from: b */
    private final boolean f225120b;

    public C82396dq(String str, boolean z) {
        this.f225120b = z;
    }

    /* renamed from: b */
    public final boolean mo76024b() {
        return this.f225120b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225119a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82626md) {
            C82626md mdVar = (C82626md) obj;
            return this.f225119a.equals(mdVar.mo75583d()) && this.f225120b == mdVar.mo76024b();
        }
    }

    public final int hashCode() {
        return ((this.f225119a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f225120b ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f225119a;
        boolean z = this.f225120b;
        return "NgaOnDeviceFulfillmentEvent{token=" + str + ", prefetch=" + z + "}";
    }
}
