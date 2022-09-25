package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.at */
/* compiled from: PG */
final class C123312at extends C123380dg {

    /* renamed from: a */
    private final C123454g f341055a;

    /* renamed from: b */
    private final String f341056b;

    public C123312at(C123454g gVar, String str) {
        this.f341055a = gVar;
        if (str != null) {
            this.f341056b = str;
            return;
        }
        throw new NullPointerException("Null originalText");
    }

    /* renamed from: a */
    public final C123454g mo105963a() {
        return this.f341055a;
    }

    /* renamed from: b */
    public final String mo105964b() {
        return this.f341056b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C123380dg) {
            C123380dg dgVar = (C123380dg) obj;
            return this.f341055a.equals(dgVar.mo105963a()) && this.f341056b.equals(dgVar.mo105964b());
        }
    }

    public final int hashCode() {
        return ((this.f341055a.hashCode() ^ 1000003) * 1000003) ^ this.f341056b.hashCode();
    }

    public final String toString() {
        String obj = this.f341055a.toString();
        String str = this.f341056b;
        return "TokenRangeAndOriginalText{tokenRange=" + obj + ", originalText=" + str + "}";
    }
}
