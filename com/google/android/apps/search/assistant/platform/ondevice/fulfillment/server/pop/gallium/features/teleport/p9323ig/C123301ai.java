package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ai */
/* compiled from: PG */
final class C123301ai extends C123302aj {

    /* renamed from: a */
    private final String f341041a;

    public C123301ai(String str) {
        this.f341041a = str;
    }

    /* renamed from: a */
    public final C123481h mo105917a() {
        return C123481h.URL;
    }

    /* renamed from: c */
    public final String mo105922c() {
        return this.f341041a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C123503i) {
            C123503i iVar = (C123503i) obj;
            if (C123481h.URL != iVar.mo105917a() || !this.f341041a.equals(iVar.mo105922c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f341041a.hashCode();
    }

    public final String toString() {
        String str = this.f341041a;
        return "AppOrUrl{url=" + str + "}";
    }
}
