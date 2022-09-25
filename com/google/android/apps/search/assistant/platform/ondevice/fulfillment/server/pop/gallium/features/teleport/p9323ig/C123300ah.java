package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ah */
/* compiled from: PG */
final class C123300ah extends C123302aj {

    /* renamed from: a */
    public final String f341040a;

    public C123300ah(String str) {
        this.f341040a = str;
    }

    /* renamed from: a */
    public final C123481h mo105917a() {
        return C123481h.APP;
    }

    /* renamed from: b */
    public final String mo105918b() {
        return this.f341040a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C123503i) {
            C123503i iVar = (C123503i) obj;
            if (C123481h.APP != iVar.mo105917a() || !this.f341040a.equals(iVar.mo105918b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f341040a.hashCode();
    }

    public final String toString() {
        String str = this.f341040a;
        return "AppOrUrl{app=" + str + "}";
    }
}
