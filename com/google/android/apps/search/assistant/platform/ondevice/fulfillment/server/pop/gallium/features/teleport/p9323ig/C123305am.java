package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.am */
/* compiled from: PG */
final class C123305am extends C123454g {

    /* renamed from: a */
    public final int f341044a;

    /* renamed from: b */
    public final int f341045b;

    public C123305am(int i, int i2) {
        this.f341044a = i;
        this.f341045b = i2;
    }

    /* renamed from: a */
    public final int mo105931a() {
        return this.f341045b;
    }

    /* renamed from: b */
    public final int mo105932b() {
        return this.f341044a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C123454g) {
            C123454g gVar = (C123454g) obj;
            return this.f341044a == gVar.mo105932b() && this.f341045b == gVar.mo105931a();
        }
    }

    public final int hashCode() {
        return ((this.f341044a ^ 1000003) * 1000003) ^ this.f341045b;
    }

    public final String toString() {
        int i = this.f341044a;
        int i2 = this.f341045b;
        return "AnnotatedStringRange{start=" + i + ", end=" + i2 + "}";
    }
}
