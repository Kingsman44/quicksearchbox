package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ao */
/* compiled from: PG */
final class C123307ao extends C123504j {

    /* renamed from: a */
    private final String f341048a;

    public C123307ao(String str) {
        if (str != null) {
            this.f341048a = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final String mo105942a() {
        return this.f341048a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C123504j) {
            return this.f341048a.equals(((C123504j) obj).mo105942a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f341048a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f341048a;
        return "App{packageName=" + str + "}";
    }
}
