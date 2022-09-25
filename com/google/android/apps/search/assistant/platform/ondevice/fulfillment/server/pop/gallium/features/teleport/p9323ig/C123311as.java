package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.as */
/* compiled from: PG */
final class C123311as extends C123326bg {

    /* renamed from: a */
    private final C123503i f341054a;

    public C123311as(C123503i iVar) {
        this.f341054a = iVar;
    }

    /* renamed from: a */
    public final C123503i mo105958a() {
        return this.f341054a;
    }

    /* renamed from: b */
    public final boolean mo105959b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C123326bg) {
            C123326bg bgVar = (C123326bg) obj;
            return this.f341054a.equals(bgVar.mo105958a()) && !bgVar.mo105959b();
        }
    }

    public final int hashCode() {
        return ((((C123300ah) this.f341054a).f341040a.hashCode() ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        String obj = this.f341054a.toString();
        return "ForegroundAppOrWebsiteInfo{appOrUrl=" + obj + ", isInBrowser=false}";
    }
}
