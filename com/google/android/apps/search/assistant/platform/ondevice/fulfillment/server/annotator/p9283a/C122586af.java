package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.a.af */
/* compiled from: PG */
final class C122586af extends C122584ad {

    /* renamed from: a */
    private final int f339755a;

    /* renamed from: b */
    private final int f339756b;

    public C122586af(int i, int i2) {
        this.f339755a = i;
        this.f339756b = i2;
    }

    /* renamed from: a */
    public final int mo105678a() {
        return this.f339756b;
    }

    /* renamed from: b */
    public final int mo105679b() {
        return this.f339755a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C122584ad) {
            C122584ad adVar = (C122584ad) obj;
            return this.f339755a == adVar.mo105679b() && this.f339756b == adVar.mo105678a();
        }
    }

    public final int hashCode() {
        return ((this.f339755a ^ 1000003) * 1000003) ^ this.f339756b;
    }

    public final String toString() {
        int i = this.f339755a;
        int i2 = this.f339756b;
        return "SpanInterval{startByte=" + i + ", numBytes=" + i2 + "}";
    }
}
