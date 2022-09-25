package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ap */
/* compiled from: PG */
final class C123308ap extends C123505k {

    /* renamed from: a */
    private final String f341049a;

    public C123308ap(String str) {
        if (str != null) {
            this.f341049a = str;
            return;
        }
        throw new NullPointerException("Null baseUri");
    }

    /* renamed from: a */
    public final String mo105946a() {
        return this.f341049a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C123505k) {
            return this.f341049a.equals(((C123505k) obj).mo105946a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f341049a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f341049a;
        return "Site{baseUri=" + str + "}";
    }
}
